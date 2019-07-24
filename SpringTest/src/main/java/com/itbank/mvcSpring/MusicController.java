package com.itbank.mvcSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	//annotation을 활용 controller역할
public class MusicController {
	
	@Autowired	//MusicDAO에서 @Repository로 등록해놓은 타입을 통해서 autowired
	MusicDAO music;
	
	@RequestMapping("input.do")		//client(music.jsp)에서 요청한 것을 받아주는 역할(삽입 form에서 insert.do를 호출하면 이 컨트롤러에서 이 RequesMapping된 메소드를 실행)
	public void insert(MusicDTO musicDTO, Model model) {
		System.out.println("MusicController Insert!");
		music.insert(musicDTO);	//DB에 insert!
		model.addAttribute("dto", musicDTO);	//model 객체를 통해 view단까지 전달
	}

	@RequestMapping("update.do")		//client(music.jsp)에서 요청한 것을 받아주는 역할(수정 form에서 update.do를 호출하면 이 컨트롤러에서 이 RequesMapping된 메소드를 실행)
	public void update(MusicDTO musicDTO, Model model) {
		System.out.println("MusicController Update!");
		music.update(musicDTO);	//DB에 update!
		model.addAttribute("dto", musicDTO);	//model 객체를 통해 view단까지 전달
	}
	
	@RequestMapping("delete.do")		//client(music.jsp)에서 요청한 것을 받아주는 역할(삭제 form에서 delete.do를 호출하면 이 컨트롤러에서 이 RequesMapping된 메소드를 실행)
	public void delete(MusicDTO musicDTO, Model model) {
		System.out.println("MusicController Delete!");
		model.addAttribute("dto", musicDTO);	//model 객체를 통해 view단까지 전달
		music.delete(musicDTO);
	}
	
	@RequestMapping("select.do")		//client(music.jsp)에서 요청한 것을 받아주는 역할(검색 form에서 select.do를 호출하면 이 컨트롤러에서 이 RequesMapping된 메소드를 실행)
	public void select(MusicDTO musicDTO, Model model) {
		System.out.println("MusicController Select!");
		// MusicDTO 객체를 dto라는 명칭으로 하나 더 만들어서(프로토 타입으로) select해온 dto를 받아서 model 객체로 view단까지 전달
		MusicDTO dto = music.select(musicDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("selectAll.do")		//client(music.jsp)에서 요청한 것을 받아주는 역할(전체 검색 form에서 selectAll.do를 호출하면 이 컨트롤러에서 이 RequesMapping된 메소드를 실행)
	public void select(Model model) {
		System.out.println("MusicController SelectAll!");
		// MusicDTO 객체를 dto라는 명칭으로 하나 더 만들어서(프로토 타입으로) select해온 dto를 받아서 model 객체로 view단까지 전달
		List<MusicDTO> list = music.selectAll();
		model.addAttribute("list", list);
	}	
}
