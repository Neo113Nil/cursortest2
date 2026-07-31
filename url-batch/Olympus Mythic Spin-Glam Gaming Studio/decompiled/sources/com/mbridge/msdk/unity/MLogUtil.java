package com.mbridge.msdk.unity;

import android.util.Log;
import com.ironsource.X3;

/* loaded from: classes5.dex */
public class MLogUtil {
    private static final String TAG = "UnityDataReceiver";
    private static String className;
    private static int lineNumber;
    private static String methodName;

    public static void i(String str) {
        try {
            if (isDebuggable()) {
                getMethodNames(new Throwable().getStackTrace());
                Log.i(TAG, createLog(str));
            }
        } catch (Throwable th) {
            th.getStackTrace();
        }
    }

    public static void e(String str) {
        try {
            if (isDebuggable()) {
                getMethodNames(new Throwable().getStackTrace());
                Log.e(TAG, createLog(str));
            }
        } catch (Throwable th) {
            th.getStackTrace();
        }
    }

    public static void e(Throwable th) {
        try {
            if (isDebuggable()) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            th2.getStackTrace();
        }
    }

    private static String createLog(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(X3.j.d);
        stringBuffer.append(className);
        stringBuffer.append(":");
        stringBuffer.append(methodName);
        stringBuffer.append(":");
        stringBuffer.append(lineNumber);
        stringBuffer.append(X3.j.e);
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    private static void getMethodNames(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length < 1) {
            return;
        }
        className = stackTraceElementArr[1].getFileName();
        methodName = stackTraceElementArr[1].getMethodName();
        lineNumber = stackTraceElementArr[1].getLineNumber();
    }

    public static boolean isDebuggable() {
        return MUnityDataReceiver.getDebug();
    }
}
