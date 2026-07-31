package com.my.target;

import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public abstract class h2 {

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a extends h2 {
        a() {
        }

        @Override // com.my.target.h2
        public float b() {
            return 1.0f;
        }

        @Override // com.my.target.h2
        public float c() {
            return 1.0f;
        }
    }

    public static h2 a() {
        return new a();
    }

    public abstract float b();

    public abstract float c();

    public boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            h2 h2Var = (h2) obj;
            if (b() == h2Var.b() && c() == h2Var.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(b()), Float.valueOf(c()));
    }
}
