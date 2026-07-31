package com.mbridge.msdk.mbsignalcommon.mapping;

/* compiled from: Mapping.java */
/* loaded from: classes9.dex */
public class a extends Throwable {
    private Class<?> a;
    private String b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.b = str;
    }
}
