package top.hjie.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import top.hjie.springboot.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	/**
	 * 跳转到公告页面
	 */
	@GetMapping("show")
	public String show() {
		return "html/notice.html";
	}
	
	/**
	 * 分页查询公告
	 */
	@RequestMapping("findByPage")
	@ResponseBody
	public Map<String, Object> findByPage(@RequestParam(value="page")Integer page,@RequestParam(value="rows")Integer rows){
		return noticeService.findByPage((page-1) * rows, rows);
	}
}
