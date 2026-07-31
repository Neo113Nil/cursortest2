package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class x6 extends x {
    private u6 b;

    public static x6 d() {
        return new x6();
    }

    public void a(u6 u6Var) {
        this.b = u6Var;
    }

    public u6 c() {
        return this.b;
    }

    @Override // com.my.target.x
    public int a() {
        return this.b != null ? 1 : 0;
    }
}
