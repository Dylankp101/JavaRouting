package com.codingdojo.routingGetFamiliar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController

@SpringBootApplication
public class RoutingGetFamiliarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingGetFamiliarApplication.class, args);
	}
	@RequestMapping("/")
	public String start() {
		return "START";
	}
	@RequestMapping("/coding")
	public String csdcscd() {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/coding/python")
	public String codingPython() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/coding/java")
	public String codingJAVA() {
		return "Java/Spring is better!";
	}
//    @RequestMapping("/dojo")
//    public String showDojo(){
//    	return "The is Aawesom!" ;
//    }
//    @RequestMapping("/burbank-dojo}")
//    public String showDojoBurbank(){
//    	return "The is located in southern California!" ;
//    }
//    @RequestMapping("/sanjose")
//    public String showDojoSanJose(){
//    	return "The San Jose is the Headquarters!" ;
//    }
	
}

