package com.my.target;

import com.ironsource.X3;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class x0 {
    public static x0 e = new x0(w0.d, "", false, true);
    private final w0 a;
    private final String b;
    private final boolean c;
    private final boolean d;

    private x0(w0 w0Var, String str, boolean z, boolean z2) {
        this.a = w0Var;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public static x0 a(w0 w0Var, String str, boolean z) {
        return new x0(w0Var, str, z, true);
    }

    public x0 b(int i) {
        return new x0(this.a, this.b + X3.j.d + i + X3.j.e, this.c, this.d);
    }

    public w0 c() {
        return this.a;
    }

    public x0 d() {
        return new x0(this.a, this.b, false, this.d);
    }

    public x0 e() {
        return new x0(this.a, this.b, this.c, false);
    }

    public x0 a(String str) {
        if (!this.b.isEmpty()) {
            str = this.b + "." + str;
        }
        return new x0(this.a, str, this.c, this.d);
    }

    public void c(int i) {
        this.a.c(0, i, b(""));
    }

    public boolean b() {
        return this.d;
    }

    public void c(int i, String str) {
        this.a.c(0, i, b(str));
    }

    public void b(int i, String str) {
        this.a.b(0, i, b(str));
    }

    private String b(String str) {
        String str2 = this.b;
        if (str.isEmpty()) {
            return str2;
        }
        return str2 + ": " + str;
    }

    public boolean a() {
        return this.c;
    }

    public void a(int i) {
        this.a.a(0, i, b(""));
    }

    public void a(int i, String str) {
        this.a.a(0, i, b(str));
    }

    public void a(int i, String str, Throwable th) {
        this.a.c(0, i, b(str) + "\nexception=" + gi.b(th));
    }
}
