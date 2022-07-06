package com.UtilsLayer;

import java.util.Set;

import com.BaseLayer.BaseClass;

public class HandleWindow extends BaseClass {

	
	
	public static String handleWindowOrTab () {
		return driver.getWindowHandle();
	}
	
	public static Set<String> handleMultipleWindows(){
		return  driver.getWindowHandles();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
