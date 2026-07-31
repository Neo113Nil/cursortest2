package yads;

import android.text.Layout;

/* loaded from: classes9.dex */
public final class ja3 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public i63 r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final ja3 a(ja3 ja3Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ja3Var != null) {
            if (!this.c && ja3Var.c) {
                this.b = ja3Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = ja3Var.h;
            }
            if (this.i == -1) {
                this.i = ja3Var.i;
            }
            if (this.a == null && (str = ja3Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = ja3Var.f;
            }
            if (this.g == -1) {
                this.g = ja3Var.g;
            }
            if (this.n == -1) {
                this.n = ja3Var.n;
            }
            if (this.o == null && (alignment2 = ja3Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = ja3Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = ja3Var.q;
            }
            if (this.j == -1) {
                this.j = ja3Var.j;
                this.k = ja3Var.k;
            }
            if (this.r == null) {
                this.r = ja3Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ja3Var.s;
            }
            if (!this.e && ja3Var.e) {
                this.d = ja3Var.d;
                this.e = true;
            }
            if (this.m == -1 && (i = ja3Var.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }
}
