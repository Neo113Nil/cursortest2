package com.mbridge.msdk.dycreator.error;

/* compiled from: DyError.java */
/* loaded from: classes15.dex */
public class a {
    private int a;
    private String b;

    public a(b bVar) {
        if (bVar != null) {
            this.a = bVar.g();
            this.b = bVar.h();
        }
    }

    public String toString() {
        return "DyError{errorCode=" + this.a + '}';
    }

    public a(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
