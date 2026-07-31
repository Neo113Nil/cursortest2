package com.my.target;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class i9 extends x {
    private final List b = new ArrayList();

    private i9() {
    }

    public static i9 d() {
        return new i9();
    }

    public void a(i8 i8Var) {
        if (i8Var == null) {
            return;
        }
        this.b.add(i8Var);
    }

    public List c() {
        return this.b;
    }

    @Override // com.my.target.x
    public int a() {
        return this.b.size();
    }
}
