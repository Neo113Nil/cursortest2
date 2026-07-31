package com.my.target;

import com.my.target.common.models.ImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class i8 extends b {
    private ImageData X;
    private float Y;
    private float Z;
    private boolean a0;
    private boolean b0;
    private boolean c0;

    i8(w0 w0Var) {
        super(w0Var, null, null);
        this.Z = 5.0f;
        this.a0 = true;
        this.b0 = true;
        this.c0 = true;
        this.w = e2.q;
    }

    public float X() {
        return this.Y;
    }

    public float Y() {
        return this.Z;
    }

    public ImageData Z() {
        return this.X;
    }

    public boolean a0() {
        return this.c0;
    }

    public boolean b0() {
        return this.b0;
    }

    public void c(ImageData imageData) {
        this.X = imageData;
    }

    public boolean c0() {
        return this.a0;
    }

    public void d(float f) {
        this.Z = f;
    }

    public void f(boolean z) {
        this.c0 = z;
    }

    public void g(boolean z) {
        this.b0 = z;
    }

    public void h(boolean z) {
        this.a0 = z;
    }

    public void c(float f) {
        this.Y = f;
    }
}
