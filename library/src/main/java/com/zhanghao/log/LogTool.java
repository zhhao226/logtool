package com.zhanghao.log;

/**
 * Created by zhanghao.
 * 2017/10/18-14:29
 */

public class LogTool {

    public static void d(String tag, String message, String keyword) {
        LogPrintImpl.Companion.getInstance().d(tag, message, keyword);
    }

    public static void e(String tag, String message, String keyword) {
        LogPrintImpl.Companion.getInstance().e(tag, message, keyword);
    }

    public static void e(String tag, Throwable throwable, String keyword) {
        LogPrintImpl.Companion.getInstance().e(tag, throwable, keyword);
    }

    public static void e(String tag, String message, Throwable throwable, String keyword) {
        LogPrintImpl.Companion.getInstance().e(tag, message, throwable, keyword);
    }

    public static void i(String tag, String message, String keyword) {
        LogPrintImpl.Companion.getInstance().i(tag, message, keyword);
    }

    public static void w(String tag, String message, String keyword) {
        LogPrintImpl.Companion.getInstance().w(tag, message, keyword);
    }

    public static void v(String tag, String message, String keyword) {
        LogPrintImpl.Companion.getInstance().v(tag, message, keyword);
    }

    public static void d(String tag, String message) {
        LogPrintImpl.Companion.getInstance().d(tag, message);
    }

    public static void e(String tag, String message) {
        LogPrintImpl.Companion.getInstance().e(tag, message);
    }

    public static void e(String tag, Throwable throwable) {
        LogPrintImpl.Companion.getInstance().e(tag, throwable);
    }

    public static void e(String tag, String message, Throwable throwable) {
        LogPrintImpl.Companion.getInstance().e(tag, message);
    }

    public static void i(String tag, String message) {
        LogPrintImpl.Companion.getInstance().i(tag, message);
    }

    public static void w(String tag, String message) {
        LogPrintImpl.Companion.getInstance().w(tag, message);
    }

    public static void v(String tag, String message) {
        LogPrintImpl.Companion.getInstance().v(tag, message);
    }

    public static void d(String message) {
        LogPrintImpl.Companion.getInstance().d(message);
    }

    public static void e(String message) {
        LogPrintImpl.Companion.getInstance().e(message);
    }

    public static void i(String message) {
        LogPrintImpl.Companion.getInstance().i(message);
    }

    public static void w(String message) {
        LogPrintImpl.Companion.getInstance().w(message);
    }

    public static void v(String message) {
        LogPrintImpl.Companion.getInstance().v(message);
    }

    public static void init(LogPrintImpl.Builder builder) {
        LogPrintImpl.Companion.getInstance().init(builder);
    }

    public static void setOutputAndroidLogcat(OutputAndroidLogcat outputAndroidLogcat) {
        LogPrintImpl.Companion.getInstance().setOutputAndroidLogcat(outputAndroidLogcat);
    }

    public static void setOutputDisk(OutputDisk outputDisk) {
        LogPrintImpl.Companion.getInstance().setOutputDisk(outputDisk);
    }

    public static void setOutputAdapter(OutputAnyAdapter logAdapter) {
        LogPrintImpl.Companion.getInstance().setOutputAdapter(logAdapter);
    }

    public static void setLogToAndroid(boolean logToAndroid) {
        LogPrintImpl.Companion.getInstance().setLogToAndroid(logToAndroid);
    }

    public static void setLogToDisk(boolean logToDisk) {
        LogPrintImpl.Companion.getInstance().setLogToDisk(logToDisk);
    }


}
