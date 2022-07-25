package com.xworkz.library.crud;

import com.xworkz.library.dto.BooksDTO;

public interface Library {
	
	public boolean createBooks(BooksDTO dto);
	public void getBooksDetails();
	public boolean updateBookNameById(int id, String name);
	public boolean updateLangaugeById(int id, String langauge);
	public boolean deleteBookByName(String name);
	
	

}
