package top.hjie.springboot.service;

import java.util.Map;


public interface NoticeService {

	Long count();
	
	Map<String, Object> findByPage(Integer page,Integer rows);
}
