package com.my.target;

import com.ironsource.X3;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class u {
    public static final u c = new u(t.k);
    private final t a;
    private final String b;

    private u(t tVar) {
        this.a = tVar;
        this.b = "";
    }

    public static u a(t tVar) {
        return new u(tVar);
    }

    public void b(boolean z) {
        this.a.c(z);
    }

    public u c(int i) {
        return new u(this.a, this.b + X3.j.d + i + X3.j.e);
    }

    public void d(int i) {
        this.a.c(0, i, b(""));
    }

    public void a(boolean z) {
        this.a.b(z);
    }

    public void b(int i, String str) {
        this.a.c(0, i, b(str));
    }

    public boolean a() {
        return this.a.c();
    }

    public void b(int i) {
        this.a.b(0, i, b(""));
    }

    private u(t tVar, String str) {
        this.a = tVar;
        this.b = str;
    }

    private String b(String str) {
        String str2 = this.b;
        if (str2.isEmpty()) {
            return str;
        }
        if (str.isEmpty()) {
            return str2;
        }
        return str2 + ": " + str;
    }

    public u a(String str) {
        if (!this.b.isEmpty()) {
            str = this.b + "." + str;
        }
        return new u(this.a, str);
    }

    public x0 a(w0 w0Var) {
        return x0.a(w0Var, this.b, true);
    }

    public void a(int i) {
        this.a.a(0, i, b(""));
    }

    public void a(int i, String str) {
        this.a.a(0, i, b(str));
    }
}
