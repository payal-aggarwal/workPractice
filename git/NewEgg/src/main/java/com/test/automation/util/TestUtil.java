package com.test.automation.util;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import com.test.automation.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	public static  String TestSheet_Path = ("C:\\Users\\admin\\git\\NewEgg\\"+
					"src\\main\\java\\com\\test\\automation\\testdata\\List.xlsx");
	

	static Workbook book;
	static Sheet sheet;
					

}
