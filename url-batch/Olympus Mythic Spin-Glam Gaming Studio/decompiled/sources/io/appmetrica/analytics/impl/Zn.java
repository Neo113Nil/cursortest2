package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes13.dex */
public abstract class Zn {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Yn a(Throwable th, int i, int i2) {
        StackTraceElement[] stackTraceElementArr;
        Yn yn;
        ArrayList arrayList;
        String name = th.getClass().getName();
        String message = th.getMessage();
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (Throwable unused) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ArrayList arrayList2 = new ArrayList(stackTraceElementArr.length);
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList2.add(new Ul(stackTraceElement));
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (i2 >= i) {
                cause = null;
            }
            if (cause != null) {
                yn = a(cause, 30, i2 + 1);
                if (i2 >= i) {
                    Throwable[] suppressed = th.getSuppressed();
                    arrayList = new ArrayList(suppressed.length);
                    for (Throwable th2 : suppressed) {
                        arrayList.add(a(th2, 1, i2));
                    }
                } else {
                    arrayList = null;
                }
                return new Yn(name, message, arrayList2, yn, arrayList);
            }
        }
        yn = null;
        if (i2 >= i) {
        }
        return new Yn(name, message, arrayList2, yn, arrayList);
    }
}
