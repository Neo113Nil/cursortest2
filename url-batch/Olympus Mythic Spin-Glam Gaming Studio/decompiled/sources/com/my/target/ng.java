package com.my.target;

import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public final class ng {
    private final k8 a;
    private boolean b;

    public ng(k8 k8Var, boolean z) {
        this.a = k8Var;
        this.b = z;
    }

    public k8 a() {
        return this.a;
    }

    public String b() {
        return this.a.x();
    }

    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj != null && ng.class == obj.getClass()) {
            ng ngVar = (ng) obj;
            if (this.b == ngVar.b && Objects.equals(this.a, ngVar.a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b));
    }

    public String toString() {
        return "SelectedCard{card=" + this.a + ", isSelected=" + this.b + '}';
    }

    public void a(boolean z) {
        this.b = z;
    }
}
