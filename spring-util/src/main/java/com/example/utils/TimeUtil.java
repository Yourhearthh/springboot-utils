package com.example.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
    public static String ENTIRE_FORMAT="yyyy-MM-dd HH:mm:ss";
    /**
     * 日期转字符串
     *
     * @param date   输入日期
     * @param format 格式 yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒
     * @return 日期字符串格式
     */
    public static String date2str(Date date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    /**
     * 默认日期转字符串
     *
     * @param date
     * @return 日期字符串格式
     */
    public static String date2str(Date date) {
        return date2str(date, "yyyy-MM-dd");
    }

    /**
     * 日期转字符串
     *
     * @param calendar
     * @param format
     * @return
     */
    public static String cal2str(Calendar calendar, String format) {
        return date2str(calendar.getTime(), format);
    }

    /**
     * 日期转字符串
     *
     * @param calendar
     * @return
     */
    public static String cal2str(Calendar calendar) {
        return date2str(calendar.getTime());
    }

    /**
     * @param str    日期字符串
     * @param format 格式 yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒
     * @return
     */
    public static Date str2date(String str, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = dateFormat.parse(str);
        } catch (ParseException e) {
            System.out.println("日期格式错误str:" + str);
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 格式默认 yyyy-MM-dd
     *
     * @param str 日期字符串
     * @return
     */
    public static Date str2date(String str) {
        return str2date(str, "yyyy-MM-dd");
    }

    /**
     * @param str    日期字符串
     * @param format 格式 yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒
     * @return
     */
    public static Calendar str2cal(String str, String format) {
        Date date = str2date(str, format);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 格式默认 yyyy-MM-dd
     *
     * @param str 日期字符串
     * @return
     */
    public static Calendar str2cal(String str) {
        Date date = str2date(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 增加n年
     *
     * @param calendar
     * @param n
     * @return
     */
    public static Calendar addYear(Calendar calendar, int n) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(calendar.getTime());
        calendar1.set(Calendar.YEAR, calendar.get(Calendar.YEAR) + n);
        return calendar1;
    }

    /**
     * 增加n月
     *
     * @param calendar
     * @param n
     * @return
     */
    public static Calendar addMonth(Calendar calendar, int n) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(calendar.getTime());
        calendar1.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + n);
        return calendar1;
    }

    /**
     * 增加n天
     *
     * @param calendar
     * @param n
     * @return
     */
    public static Calendar addDay(Calendar calendar, int n) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(calendar.getTime());
        calendar1.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) + n);
        return calendar1;
    }

    /**
     * 增加n小时
     *
     * @param calendar
     * @param n
     * @return
     */
    public static Calendar addHour(Calendar calendar, int n) {
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(calendar.getTime());
        calendar1.set(Calendar.HOUR_OF_DAY, calendar.get(Calendar.HOUR_OF_DAY) + n);
        return calendar1;
    }

    /**
     * 默认增加1年
     *
     * @param calendar
     * @return
     */
    public static Calendar addYear(Calendar calendar) {
        return addYear(calendar,1);
    }

    /**
     * 默认增加1月
     *
     * @param calendar
     * @return
     */
    public static Calendar addMonth(Calendar calendar) {
        return addMonth(calendar, 1);
    }

    /**
     * 默认增加1天
     *
     * @param calendar
     * @return
     */
    public static Calendar addDay(Calendar calendar) {
        return addDay(calendar, 1);
    }

    /**
     * 默认增加1小时
     *
     * @param calendar
     * @return
     */
    public static Calendar addHour(Calendar calendar) {
        return addHour(calendar, 1);
    }


    /**
     * 增加n年
     *
     * @param date
     * @param n
     * @return
     */
    public static Date addYear(Date date, int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar = addYear(calendar, n);
        return calendar.getTime();
    }

    /**
     * 增加n月
     *
     * @param date
     * @param n
     * @return
     */
    public static Date addMonth(Date date, int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar = addMonth(calendar, n);
        return calendar.getTime();
    }

    /**
     * 增加n天
     *
     * @param date
     * @param n
     * @return
     */
    public static Date addDay(Date date, int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar = addDay(calendar, n);
        return calendar.getTime();
    }

    /**
     * 增加n小时
     *
     * @param date
     * @param n
     * @return
     */
    public static Date addHour(Date date, int n) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar = addHour(calendar, n);
        return calendar.getTime();
    }

    /**
     * 默认增加1年
     *
     * @param date
     * @return
     */
    public static Date addYear(Date date) {
        return addYear(date, 1);
    }

    /**
     * 默认增加1月
     *
     * @param date
     * @return
     */
    public static Date addMonth(Date date) {
        return addMonth(date, 1);
    }

    /**
     * 默认增加1天
     *
     * @param date
     * @return
     */
    public static Date addDay(Date date) {
        return addDay(date, 1);
    }

    /**
     * 默认增加1小时
     *
     * @param date
     * @return
     */
    public static Date addHour(Date date) {
        return addHour(date, 1);
    }


    /**
     * 增加n年
     *
     * @param str
     * @param n
     * @return
     */
    public static String addYear(String str, int n, String format) {
        Calendar calendar = str2cal(str, format);
        calendar = addYear(calendar, n);
        return cal2str(calendar, format);
    }

    /**
     * 增加n月
     *
     * @param str
     * @param n
     * @return
     */
    public static String addMonth(String str, int n, String format) {
        Calendar calendar = str2cal(str, format);
        calendar = addMonth(calendar, n);
        return cal2str(calendar, format);
    }

    /**
     * 增加n天
     *
     * @param str
     * @param n
     * @return
     */
    public static String addDay(String str, int n, String format) {
        Calendar calendar = str2cal(str, format);
        calendar = addDay(calendar, n);
        return cal2str(calendar, format);
    }

    /**
     * 增加n小时
     *
     * @param str
     * @param n
     * @return
     */
    public static String addHour(String str, int n, String format) {
        Calendar calendar = str2cal(str, format);
        calendar = addHour(calendar, n);
        return cal2str(calendar, format);
    }

    /**
     * 默认增加1年
     *
     * @param str
     * @return
     */
    public static String addYear(String str, String format) {
        return addYear(str, 1, format);
    }

    /**
     * 默认增加1月
     *
     * @param str
     * @return
     */
    public static String addMonth(String str, String format) {
        return addMonth(str, 1, format);
    }

    /**
     * 默认增加1天
     *
     * @param str
     * @return
     */
    public static String addDay(String str, String format) {
        return addDay(str, 1, format);
    }

    /**
     * 默认增加1小时
     *
     * @param str
     * @return
     */
    public static String addHour(String str, String format) {
        return addHour(str, 1, format);
    }

    /**
     * 得到此刻的字符串格式
     *
     * @return 字符串
     */
    public static String getThisTime(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(new Date());
    }

    /**
     * 得到此刻的字符串格式默认yyyy-MM-dd
     *
     * @return 字符串
     */
    public static String getThisTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(new Date());
    }

    /**
     * 得到当天的日期时分秒都为为0
     *
     * @return 字符串
     */
    public static Date getThisTimeDate() {
        String thisTime = getThisTime();
        return str2date(thisTime);
    }

    /**
     * 得到时分秒都为为0的日期
     *
     * @return 字符串
     */
    public static Date extractDay(Date date) {
        String s = date2str(date);
        return str2date(s);
    }

    /**
     * 得到分秒都为为0的日期
     *
     * @return 字符串
     */
    public static Date extractHour(Date date) {
        String s = date2str(date,"yyyyMMddHH");
        return str2date(s,"yyyyMMddHH");
    }

    /**
     * 得到时分秒都为为0的日期
     *
     * @return 字符串
     */
    public static Calendar extractDay(Calendar calendar) {
        String s = cal2str(calendar);
        return str2cal(s);
    }

    /**
     * 转换时间字符串格式
     * @param str 时间原始字符串
     * @param originFormat 原始格式
     * @param targetFormat 转换格式
     * @return
     */
    public static String convertFormat(String str,String originFormat,String targetFormat) {
        Date date = str2date(str,originFormat);
        return date2str(date,targetFormat);
    }

    /**
     * 日期相差的天数date2-date1
     * @param date1 第一个日期
     * @param date2 第二个日期
     * @return
     */
    public static Integer daysDiff(Date date1,Date date2) {
        long time1 = date1.getTime();
        long time2 = date2.getTime();
        return (int)((time2-time1)/1000/3600/24);
    }

    /**
     * 日期相差的天数date2-date1
     * @param date1 第一个日期
     * @param date2 第二个日期
     * @return
     */
    public static Integer daysDiff(String date1,String date2,String format) {
        return daysDiff(str2date(date1,format),str2date(date2,format));
    }

    /**
     * 日期相差的天数date2-date1
     * @param date1 第一个日期
     * @param date2 第二个日期
     * @return
     */
    public static Integer daysDiff(Calendar date1,Calendar date2) {
        return daysDiff(date1.getTime(),date2.getTime());
    }

    /**
     * 获取传入日期所在年的第一天
     * @param date
     * @return
     */
    public static Date getFirstDayDateOfYear(final Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        final int last = cal.getActualMinimum(Calendar.DAY_OF_YEAR);
        cal.set(Calendar.DAY_OF_YEAR, last);
        return cal.getTime();
    }

    /**
     * 获取传入日期所在年的最一天
     * @param date
     * @return
     */
    public static Date getLastDayOfYear(final Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        final int last = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        cal.set(Calendar.DAY_OF_YEAR, last);
        return cal.getTime();
    }
}
