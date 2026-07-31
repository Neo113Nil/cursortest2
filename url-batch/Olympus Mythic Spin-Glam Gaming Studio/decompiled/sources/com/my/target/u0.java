package com.my.target;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class u0 {
    public static final u0 g = new u0("empty", "empty", null, null, null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Integer e;
    public final List f;

    public u0(String str, String str2, String str3, String str4, Integer num, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = num;
        this.f = list;
    }

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (Objects.equals(this.a, u0Var.a) && Objects.equals(this.b, u0Var.b) && Objects.equals(this.c, u0Var.c) && Objects.equals(this.d, u0Var.d) && Objects.equals(this.e, u0Var.e) && Objects.equals(this.f, u0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
