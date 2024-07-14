package cha2dev.sbb.chapter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 화면에 출력하기 위한 Controller
 */
@Controller
public class HelloController {

	/**
	 * 화면에 출력할 문자열을 반환한다.
	 * @return "hello world"
	 */
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello world!";
	}
}