package top.hjie.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import top.hjie.springboot.domain.Notice;

@Mapper
public interface NoticeMapper {
	
	Long count();
	
	List<Notice> findByPage(@Param("page")Integer page,@Param("rows")Integer rows);
}
