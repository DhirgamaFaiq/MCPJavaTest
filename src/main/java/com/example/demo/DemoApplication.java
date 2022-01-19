package com.example.demo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		List<Integer> listexample = new ArrayList<Integer>();
		listexample.add(3);
		listexample.add(1);
		listexample.add(4);
		listexample.add(2);
		findSubtract(listexample);

		listexample = new ArrayList<Integer>();
		listexample.add(1);
		listexample.add(2);
		listexample.add(3);
		listexample.add(4);
		finddivided(listexample, 4);

		findstring("souvenir loud four lost");

	}

	public static void findSubtract(List<Integer> input) {
		List<Integer> result = new ArrayList<Integer>();
		int validNumber = 0;
		for (Integer num : input) {
			for (Integer subnum : input) {
				if (num - subnum > 0) {
					validNumber++;
				}
			}
			if (validNumber == (input.size() - 1)) {
				result.add(num);
			}
			validNumber = 0;
		}
		System.out.println(result);
	}

	public static void finddivided(List<Integer> input, Integer divider) {
		List<Integer> result = new ArrayList<Integer>();
		int validNumber = 0;
		for (Integer num : input) {
			for (Integer subnum : input) {
				if (num / subnum == divider) {
					validNumber++;
				}
			}
			if (validNumber == 0) {
				result.add(num);
			}
			validNumber = 0;
		}
		System.out.println(result);
	}
	
	public static void findstring(String input) {
		List<String> result = new ArrayList<String>();
		String[] dataInput = input.split(" ");
		for (String str : dataInput) {
			if(str.length() == dataInput.length) {
				result.add(str);
			}
		}
		System.out.println(result);
	}

}
