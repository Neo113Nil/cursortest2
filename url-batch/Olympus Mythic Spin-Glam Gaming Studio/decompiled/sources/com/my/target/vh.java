package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class vh {
    public static vh e = new vh(w0.d, 999, "");
    public final t a;
    public final w0 b;
    public final int c;
    public final String d;

    public vh(w0 w0Var, int i, String str) {
        this(w0Var.a(), w0Var, i, str);
    }

    public vh a(String str) {
        return new vh(this.a, this.b, this.c, str);
    }

    public vh(t tVar, w0 w0Var, int i, String str) {
        this.a = tVar;
        this.b = w0Var;
        this.c = i;
        this.d = str;
    }

    public void a(int i, String str) {
        w0 w0Var = this.b;
        if (w0Var != null) {
            w0Var.a(this.c, i, str);
        } else {
            this.a.a(this.c, i, str);
        }
    }
}
