package com.amazon.a.a.d;

/* compiled from: DataAuthenticationException.java */
/* loaded from: classes3.dex */
public class a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private static final long f512a = 1;

    public a(String str) {
        super(str);
    }

    public a(String str, Throwable th) {
        super("Failed to authenticate data: " + str, th);
    }
}
