package com.my.target;

import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class r2 implements n2 {
    public final String a;

    private r2(String str) {
        this.a = str;
    }

    public static r2 a(String str) {
        return new r2(str);
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((r2) obj).a);
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }
}
