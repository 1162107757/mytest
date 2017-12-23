package top.hjie.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.hjie.springboot.domain.Notice;
import top.hjie.springboot.mapper.NoticeMapper;
import top.hjie.springboot.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public Long count() {
		return noticeMapper.count();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Map<String, Object> data = new HashMap<>();
		Long count = noticeMapper.count();
		data.put("total", count);
		List<Notice> notices = noticeMapper.findByPage(page, rows);
		data.put("rows", notices);
		return data;
	}

}
