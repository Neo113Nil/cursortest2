package com.ironsource;

import android.content.Context;

/* loaded from: classes9.dex */
public class X4 {
    private static X4 h;
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private final InterfaceC4986y7 g;

    private X4(Context context) {
        InterfaceC4986y7 a = Kb.Y().a();
        this.g = a;
        this.a = a.q();
        this.b = a.l();
        this.c = a.f();
        this.d = a.i();
        this.e = a.e();
        this.f = a.v(context);
    }

    public static X4 b(Context context) {
        if (h == null) {
            h = new X4(context);
        }
        return h;
    }

    public static void g() {
        h = null;
    }

    public int a() {
        return this.e;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public float a(Context context) {
        return this.g.F(context);
    }

    public String b() {
        return this.f;
    }
}
