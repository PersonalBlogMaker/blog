package com.xyz.blog.sys.common.utis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtis {
	
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private TimeUtis(){
		
	} 
	
	/**
	 * 时间转换 Date->String
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static String Date2String(Date date) throws Exception{
		return simpleDateFormat.format(date);
	}
	
	/**
	 * 时间转换 String->Date
	 * @param date
	 * @return
	 * @throws Exception
	 */
	public static Date String2Date(String date) throws Exception{
		return simpleDateFormat.parse(date);
	}
	
}
