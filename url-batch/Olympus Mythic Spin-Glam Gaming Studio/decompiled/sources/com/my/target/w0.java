package com.my.target;

import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class w0 {
    public static final w0 d = new w0(t.k, u0.g);
    private t a;
    public final u0 b;
    private boolean c = false;

    w0(t tVar, u0 u0Var) {
        this.a = tVar;
        this.b = u0Var;
    }

    public void a(t tVar) {
        this.a = tVar;
    }

    public boolean b() {
        return this.c;
    }

    public void c(int i, int i2) {
        a(i, 1, i2, null, null);
    }

    public boolean equals(Object obj) {
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (Objects.equals(this.a, w0Var.a) && Objects.equals(this.b, w0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public t a() {
        return this.a;
    }

    public void b(int i, int i2) {
        a(i, 3, i2, null, null);
    }

    public void c(int i, int i2, String str) {
        a(i, 1, i2, str, null);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void b(int i, int i2, String str) {
        a(i, 3, i2, str, null);
    }

    public void a(int i, int i2) {
        a(i, 0, i2, null, null);
    }

    public void a(int i, int i2, String str) {
        a(i, 0, i2, str, null);
    }

    public void a(int i, int i2, String str, String str2) {
        a(i, 3, i2, str, str2);
    }

    private void a(int i, int i2, int i3, String str, String str2) {
        this.a.f.a(this, i, i2, i3, str, str2);
    }
}
