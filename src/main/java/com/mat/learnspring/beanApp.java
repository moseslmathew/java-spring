package com.mat.learnspring;

import com.mat.learnspring.cusotmer.profile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
public class beanApp {

	public static void main(String[] args) {
		ApplicationContext apc= SpringApplication.run(beanApp.class, args);
		System.out.println("---------------------");
		System.out.println("total beans: "+apc.getBeanDefinitionCount());

		List<String> str= Arrays.stream(apc.getBeanDefinitionNames()).toList();
		str.stream().filter(item->item.contains("App")).forEach(System.out::println);

	}

}
