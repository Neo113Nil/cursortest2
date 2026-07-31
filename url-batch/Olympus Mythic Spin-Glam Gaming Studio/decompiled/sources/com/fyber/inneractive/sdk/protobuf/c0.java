package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class c0 {
    public final b0 a;

    public c0(b0 b0Var) {
        Charset charset = l1.a;
        if (b0Var == null) {
            throw new NullPointerException("output");
        }
        this.a = b0Var;
        b0Var.a = this;
    }

    public final void a(int i, float f) {
        b0 b0Var = this.a;
        b0Var.getClass();
        b0Var.a(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d) {
        b0 b0Var = this.a;
        b0Var.getClass();
        b0Var.a(i, Double.doubleToRawLongBits(d));
    }

    public final void a(int i, int i2) {
        this.a.d(i, b0.d(i2));
    }

    public final void a(int i, long j) {
        this.a.b(i, b0.b(j));
    }

    public final void a(int i, Object obj, t2 t2Var) {
        b0 b0Var = this.a;
        b0Var.c(i, 3);
        t2Var.a(obj, b0Var.a);
        b0Var.c(i, 4);
    }
}
