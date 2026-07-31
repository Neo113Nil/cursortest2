package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class s {
    private q a;
    private boolean b = false;

    private s() {
    }

    public static s a(q qVar) {
        return new s(qVar);
    }

    public static s c() {
        return new s();
    }

    public void b(q qVar) {
        if (this.a != null) {
            return;
        }
        this.a = qVar;
    }

    public void d() {
        this.b = true;
    }

    public q a() {
        return this.a;
    }

    private s(q qVar) {
        this.a = qVar;
    }

    public boolean b() {
        return this.b;
    }
}
