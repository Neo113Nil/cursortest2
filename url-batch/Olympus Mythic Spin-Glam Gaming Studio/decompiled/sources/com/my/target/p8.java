package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class p8 extends i8 {
    private String d0;
    private float e0;
    private boolean f0;

    private p8(w0 w0Var) {
        super(w0Var);
    }

    public static p8 a(w0 w0Var) {
        return new p8(w0Var);
    }

    public void A(String str) {
        this.d0 = str;
    }

    public boolean d0() {
        return this.f0;
    }

    public void e(float f) {
        this.e0 = f;
    }

    public String e0() {
        return this.d0;
    }

    public float f0() {
        return this.e0;
    }

    public void i(boolean z) {
        this.f0 = z;
    }

    public static p8 a(c3 c3Var) {
        p8 a = a(c3Var.f());
        a.n(c3Var.x());
        a.A(c3Var.d0());
        a.H().a(c3Var.H(), 0.0f);
        a.K = c3Var.K;
        return a;
    }
}
