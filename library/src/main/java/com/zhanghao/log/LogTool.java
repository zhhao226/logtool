package com.zhanghao.log;

/**
 * Created by zhanghao.
 * 2017/10/18-14:29
 */

public class LogTool {

    public static void d(String tag, String message, String keyword) {
        LogPrintImpl.getInstance().d(tag, message, keyword);
    }

    public static void e(String tag, String message, String keyword) {
        LogPrintImpl.getInstance().e(tag, message, keyword);
    }

    public static void e(String tag, Throwable throwable, String keyword) {
        LogPrintImpl.getInstance().e(tag, throwable, keyword);
    }

    public static void e(String tag, String message, Throwable throwable, String keyword) {
        LogPrintImpl.getInstance().e(tag, message, throwable, keyword);
    }

    public static void i(String tag, String message, String keyword) {
        LogPrintImpl.getInstance().i(tag, message, keyword);
    }

    public static void w(String tag, String message, String keyword) {
        LogPrintImpl.getInstance().w(tag, message, keyword);
    }

    public static void v(String tag, String message, String keyword) {
        LogPrintImpl.getInstance().v(tag, message, keyword);
    }

    public static void d(String tag, String message) {
        LogPrintImpl.getInstance().d(tag, message);
    }

    public static void e(String tag, String message) {
        LogPrintImpl.getInstance().e(tag, message);
    }

    public static void e(String tag, Throwable throwable) {
        LogPrintImpl.getInstance().e(tag, throwable);
    }

    public static void e(String tag, String message, Throwable throwable) {
        LogPrintImpl.getInstance().e(tag, message);
    }

    public static void i(String tag, String message) {
        LogPrintImpl.getInstance().i(tag, message);
    }

    public static void w(String tag, String message) {
        LogPrintImpl.getInstance().w(tag, message);
    }

    public static void v(String tag, String message) {
        LogPrintImpl.getInstance().v(tag, message);
    }

    public static void d(String message) {
        LogPrintImpl.getInstance().d(message);
    }

    public static void e(String message) {
        LogPrintImpl.getInstance().e(message);
    }

    public static void i(String message) {
        LogPrintImpl.getInstance().i(message);
    }

    public static void w(String message) {
        LogPrintImpl.getInstance().w(message);
    }

    public static void v(String message) {
        LogPrintImpl.getInstance().v(message);
    }

    public static void init(LogPrintImpl.Builder builder) {
        LogPrintImpl.getInstance().init(builder);
    }

    public static void setOutputAndroidLogcat(OutputAndroidLogcat outputAndroidLogcat) {
        LogPrintImpl.getInstance().setOutputAndroidLogcat(outputAndroidLogcat);
    }

    public static void setOutputDisk(OutputDisk outputDisk) {
        LogPrintImpl.getInstance().setOutputDisk(outputDisk);
    }

    public static void setOutputAdapter(OutputAnyAdapter logAdapter) {
        LogPrintImpl.getInstance().setOutputAdapter(logAdapter);
    }

    public static void setLogToAndroid(boolean logToAndroid) {
        LogPrintImpl.getInstance().setLogToAndroid(logToAndroid);
    }

    public static void setLogToDisk(boolean logToDisk) {
        LogPrintImpl.getInstance().setLogToDisk(logToDisk);
    }


}
