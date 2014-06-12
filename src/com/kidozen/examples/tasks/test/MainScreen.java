package com.kidozen.examples.tasks.test;

import com.robotium.solo.Solo;

public class MainScreen{
	
	public MainScreen() {
		}

	public void ClickOnMenuNew(Solo solo){
		solo.clickOnMenuItem("New");
	}
	
	public void TypeTitleDescription(Solo solo,String title,String description){
		solo.typeText(0, title);
		solo.typeText(1, description);	
	}

	public void clickOnButtonCreate(Solo solo){
		solo.clickOnButton("Create");
	}
	
	public void clickOnPending(Solo solo){
		solo.clickOnText("Pending");
	}
	
	public void clickOnTask(Solo solo, String taskTitle){
		solo.clickOnText(taskTitle);
	}

	public void clickOnButtonDelete(Solo solo){
		solo.clickOnButton("Delete");
	}
}