package top.hjie.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// 代表该类是springboot的启动类
public class Application {

	public static void main(String[] args) {
		// 第一种方式，运行springboot应用,有springboot官方的启动图案
		// SpringApplication.run(Application.class, args);
		
		// 第二种方式：运行SpringBoot应用(去掉Banner图案)
		SpringApplication springApplication = new SpringApplication(Application.class);
		// 设置管理横幅模式
		springApplication.setBannerMode(Mode.OFF);
		// 运行
		springApplication.run(args);
	}
}
