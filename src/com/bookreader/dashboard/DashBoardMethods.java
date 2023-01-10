package com.bookreader.dashboard;

import com.bookreader.beans.Book;
import com.bookreader.beans.User;

public interface DashBoardMethods {

	public void displayUserInfo(User user);
	public void displayBookInfo(Book book);
	public void nextPage();
	public void previousPage();
}
