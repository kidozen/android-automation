package com.kidozen.examples.tasks.test;

import com.kidozen.examples.tasks.test.MainScreen;
import com.kidozen.examples.tasks.MainActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class UserAddTaskThenDeleteIt extends ActivityInstrumentationTestCase2<MainActivity>{
	private Solo solo;
	private MainScreen mainScreen;
	
	public UserAddTaskThenDeleteIt() {
			super(MainActivity.class);
		}
	
	public void setUp() throws Exception {
		//setUp() is run before a test case is started. 
		//This is where the solo object is created.
		solo = new Solo(getInstrumentation(), getActivity());
		mainScreen = new MainScreen();
	}
	
	public void testAddNote() throws Exception {
		mainScreen.ClickOnMenuNew(solo);
		mainScreen.TypeTitleDescription(solo, "Meeting", "Important");
		mainScreen.clickOnButtonCreate(solo);
		mainScreen.clickOnPending(solo);
		mainScreen.clickOnTask(solo, "Meeting");
		mainScreen.clickOnButtonDelete(solo);
	}

}
