package com.intercom.twig;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public class Twig {
    public static final int DISABLED = 8;
    private static final int MAX_LOG_LENGTH = 4000;
    private final boolean internalLoggingEnabled;
    private int logLevel;
    private final String tag;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public Twig(int i, String str, boolean z) {
        this.logLevel = i;
        this.tag = str == null ? "Twig" : str;
        this.internalLoggingEnabled = z;
    }

    public void v(String str, Object... objArr) {
        prepareLog(2, null, str, objArr);
    }

    public void v(Throwable th, String str, Object... objArr) {
        prepareLog(2, th, str, objArr);
    }

    public void v(Throwable th) {
        prepareLog(2, th, null, new Object[0]);
    }

    public void d(String str, Object... objArr) {
        prepareLog(3, null, str, objArr);
    }

    public void d(Throwable th, String str, Object... objArr) {
        prepareLog(3, th, str, objArr);
    }

    public void d(Throwable th) {
        prepareLog(3, th, null, new Object[0]);
    }

    public void i(String str, Object... objArr) {
        prepareLog(4, null, str, objArr);
    }

    public void i(Throwable th, String str, Object... objArr) {
        prepareLog(4, th, str, objArr);
    }

    public void i(Throwable th) {
        prepareLog(4, th, null, new Object[0]);
    }

    public void w(String str, Object... objArr) {
        prepareLog(5, null, str, objArr);
    }

    public void w(Throwable th, String str, Object... objArr) {
        prepareLog(5, th, str, objArr);
    }

    public void w(Throwable th) {
        prepareLog(5, th, null, new Object[0]);
    }

    public void e(String str, Object... objArr) {
        prepareLog(6, null, str, objArr);
    }

    public void e(Throwable th, String str, Object... objArr) {
        prepareLog(6, th, str, objArr);
    }

    public void e(Throwable th) {
        prepareLog(6, th, null, new Object[0]);
    }

    public void wtf(String str, Object... objArr) {
        prepareLog(7, null, str, objArr);
    }

    public void wtf(Throwable th, String str, Object... objArr) {
        prepareLog(7, th, str, objArr);
    }

    public void wtf(Throwable th) {
        prepareLog(7, th, null, new Object[0]);
    }

    public void internal(String str) {
        internal(this.tag, str);
    }

    public void internal(String str, String str2) {
        if (this.internalLoggingEnabled) {
            Log.d(str, "INTERNAL: " + str2);
        }
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    int getLogLevel() {
        return this.logLevel;
    }

    public String getTag() {
        return this.tag;
    }

    private void prepareLog(int i, Throwable th, String str, Object... objArr) {
        String str2;
        if (i < this.logLevel) {
            return;
        }
        String tag = getTag();
        if (str != null && str.length() == 0) {
            str = null;
        }
        if (str != null) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            str2 = th != null ? str + "\n" + getStackTraceString(th) : str;
        } else if (th == null) {
            return;
        } else {
            str2 = getStackTraceString(th);
        }
        log(i, tag, str2);
    }

    void log(int i, String str, Object... objArr) {
        prepareLog(i, null, str, objArr);
    }

    private void log(int i, String str, String str2) {
        int min;
        if (str2.length() < MAX_LOG_LENGTH) {
            printLog(i, str, str2);
            return;
        }
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            int indexOf = str2.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i2 + MAX_LOG_LENGTH);
                printLog(i, str, str2.substring(i2, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }

    private void printLog(int i, String str, String str2) {
        if (i == 7) {
            Log.wtf(str, str2);
        } else {
            Log.println(i, str, str2);
        }
    }

    private String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
