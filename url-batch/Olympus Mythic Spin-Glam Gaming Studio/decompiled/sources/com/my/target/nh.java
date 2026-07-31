package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class nh extends x {
    private gh b;
    private boolean c = true;

    private nh() {
    }

    public static nh e() {
        return new nh();
    }

    public void a(boolean z) {
        this.c = z;
    }

    public gh c() {
        return this.b;
    }

    public boolean d() {
        return this.c;
    }

    public void a(gh ghVar) {
        this.b = ghVar;
    }

    @Override // com.my.target.x
    public int a() {
        return this.b == null ? 0 : 1;
    }
}
