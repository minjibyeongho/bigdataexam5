package com.itbank.mvcSpring;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository		//싱글톤 객체 생성시 repository에 등록되도록 annotation 활용
public class MusicDAO {

	@Autowired
	SqlSessionTemplate my;	//music.xml에서 설정된 myBatis를 타입(type)으로 검색하여 autowired!
	
	public void insert(MusicDTO musicDTO) {
		System.out.println("music insert!");
		my.insert("mDAO.insert",musicDTO);	
		// music.xml -> mybatis-config.xml -> musicMapper.xml 경로를 통해서 mybatis(이하 my) mapper에 정의된 insert 메소드 활용
		// alias를 통해 MusicDAO를 mDAO로 호출하여 사용 .insert는 메소드를 호출 / parameter로 들어온 musicDTO를 DAO에 넣어줌
	}
	
	public void delete(MusicDTO musicDTO) {
		System.out.println("music delete!");
		my.delete("mDAO.delete",musicDTO);			
		// music.xml -> mybatis-config.xml -> musicMapper.xml 경로를 통해서 mybatis(이하 my) mapper에 정의된  delete 메소드 활용
		// alias를 통해 MusicDAO를 mDAO로 호출하여 사용 .delete는 메소드를 호출 / parameter로 들어온 musicDTO를 DAO에 넣어줌
	}
	
	public void update(MusicDTO musicDTO) {
		System.out.println("music update!");
		my.delete("mDAO.update",musicDTO);			
		// music.xml -> mybatis-config.xml -> musicMapper.xml 경로를 통해서 mybatis(이하 my) mapper에 정의된  update 메소드 활용
		// alias를 통해 MusicDAO를 mDAO로 호출하여 사용 .update는 메소드를 호출 / parameter로 들어온 musicDTO를 DAO에 넣어줌
	}	
	
	public MusicDTO select(MusicDTO musicDTO) {
		System.out.println("music select!");
		// selectOne 메소드 활용(받아오는 return 값이 한개의 경우 활용)
		// select 메소드는 리턴값이 존재하기 때문에 타입을 맞춰서 받아줌(아래와 같은 경우에는 parameter로 받아온 musicDTO를 그대로 활용)
		musicDTO = my.selectOne("mDAO.select",musicDTO);	
		return musicDTO;
		// music.xml -> mybatis-config.xml -> musicMapper.xml 경로를 통해서 mybatis(이하 my) mapper에 정의된  select 메소드 활용
		// alias를 통해 MusicDAO를 mDAO로 호출하여 사용 .select는 메소드를 호출 / parameter로 들어온 musicDTO를 DAO에 넣어줌
	}		
	
	// generic 활용하여 MusicDTO객체 한정으로 받아오게 설계
	public List<MusicDTO> selectAll() {
		System.out.println("music select!");
		// selectList 메소드 활용(받아오는 return 값이 list의 경우 활용)
		// selectAll 메소드는 리턴값이 존재하기 때문에 타입을 맞춰서 받아줌
		List<MusicDTO> list = my.selectList("mDAO.selectAll");
		return list;
		// music.xml -> mybatis-config.xml -> musicMapper.xml 경로를 통해서 mybatis(이하 my) mapper에 정의된  selectAll 메소드 활용
		// alias를 통해 MusicDAO를 mDAO로 호출하여 사용 .selectAll는 메소드를 호출 / selectAll은 parameter가 없음
	}			
}
