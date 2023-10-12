package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	@GetMapping(value = "/getHi")
	public String getHi() {

		return "Hello World";
	}
	@GetMapping(value = "getWho")
	public String getWho() {
		return "Who are You?";
	}
	@GetMapping(value = "/getstr/{str1}")
	public String getstr(@PathVariable String str1) {
		return str1;
	}
	@GetMapping(value = "/getstrrev/{str1}")
	public String getstrrev(@PathVariable String str1) {
		String name = "";
		for(int i=str1.length()-1;i>=0;i--) {
			char b = str1.charAt(i);
			name = name+b;
		} return name;
		}
	@GetMapping(value = "/getprime/{num1}")
	public String getprime(@PathVariable int num1) {
		String output = "";
		for(int i=2;i<num1;i++) {
			if(i==2 || i==3) {
				output = output+i+" ";
			}
			else if(i%2!=0&&i%3!=0) {
				output = output+i+" ";
			}
	}
		return output;
	}
	@GetMapping(value = "/getsqure/{num}")
	public String getsqure(@PathVariable int num) {
		String output = "";
		for(int i=2;i<=num;i++) {
			if(Math.sqrt(i)%1==0) {
				output = output+" "+i;
			
			}
		}
		return output;
	}
}