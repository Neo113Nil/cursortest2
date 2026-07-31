package com.my.target;

import android.graphics.Rect;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class ec {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final Rect c = new Rect();
    private final Rect d = new Rect();
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Rect h = new Rect();

    ec() {
    }

    private static void a(Rect rect, Rect rect2) {
        rect2.set(qi.c(rect.left), qi.c(rect.top), qi.c(rect.right), qi.c(rect.bottom));
    }

    public static ec e() {
        return new ec();
    }

    public void b(int i, int i2, int i3, int i4) {
        this.e.set(i, i2, i3, i4);
        a(this.e, this.f);
    }

    public void c(int i, int i2, int i3, int i4) {
        this.g.set(i, i2, i3, i4);
        a(this.g, this.h);
    }

    public Rect d() {
        return this.b;
    }

    public Rect b() {
        return this.f;
    }

    public Rect c() {
        return this.h;
    }

    public void a(int i, int i2) {
        this.a.set(0, 0, i, i2);
        a(this.a, this.b);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.c.set(i, i2, i3, i4);
        a(this.c, this.d);
    }

    public Rect a() {
        return this.d;
    }
}
