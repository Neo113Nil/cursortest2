package com.amazon.a.a.o;

import android.util.Log;

/* compiled from: KiwiLogger.java */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f599a = true;
    public static boolean b = true;
    private static boolean c = false;
    private static final String d = "Kiwi";
    private String e;

    public c(String str) {
        this.e = str;
    }

    public void a(String str) {
        if (f599a) {
            Log.d(d, d(str));
        }
    }

    private String d(String str) {
        return this.e + ": " + str;
    }

    public void a(String str, Throwable th) {
        if (f599a) {
            Log.d(d, d(str), th);
        }
    }

    public void b(String str) {
        if (b) {
            Log.e(d, d(str));
        }
    }

    public void b(String str, Throwable th) {
        if (b) {
            Log.e(d, d(str), th);
        }
    }

    public void c(String str) {
        if (c) {
            Log.e(d, "TEST-" + d(str));
        }
    }

    public static void a() {
        c = true;
    }

    public static boolean b() {
        return c;
    }
}
