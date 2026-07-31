package com.my.target;

import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class t2 implements n2 {
    public final int a;
    public final h2 b;

    private t2(int i, h2 h2Var) {
        this.a = i;
        this.b = h2Var;
    }

    public static t2 a() {
        return new t2(0, h2.a());
    }

    public boolean equals(Object obj) {
        if (obj != null && t2.class == obj.getClass()) {
            t2 t2Var = (t2) obj;
            if (this.a == t2Var.a && Objects.equals(this.b, t2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public static t2 a(int i, h2 h2Var) {
        return new t2(i, h2Var);
    }
}
