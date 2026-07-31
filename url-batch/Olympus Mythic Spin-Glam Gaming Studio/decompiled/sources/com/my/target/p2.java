package com.my.target;

import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class p2 implements n2 {
    public final int a;

    private p2(int i) {
        this.a = i;
    }

    public static p2 a(int i) {
        return new p2(i);
    }

    public boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.a == ((p2) obj).a;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }
}
