package com.src.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.errors.EncodingException;

import com.google.gson.Gson;
import com.src.dto.Book;

public class TestDAO {

	public String getDate() {
		Date date = new Date();
		return date.toString();
	}
	
	
	public String getBookList() {
		
		List<Book> booksList = new ArrayList<>();
		booksList.add(new Book("2", "Test1", "Cat1"));
		booksList.add(new Book("4", "Test2", "Cat2"));
		booksList.add(new Book("6", "Test3", "Cat3"));
		booksList.add(new Book("8", "Test4", "Cat4 <script>alert(\"You are Hakked \")</script>"));
		
		String returnString = toJSON(booksList);
		return returnString;
	}
	
	private String toJSON(List<Book> booksList) {
		
		Gson gson = new Gson();
		String json = gson.toJson(booksList);
		try {
			
			json = ESAPI.encoder().canonicalize(json);
			json = ESAPI.encoder().encodeForHTML(json);
			
		} catch (EncodingException e) {
			e.printStackTrace();
		}
		return json;
	}
}
