package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5748vd {
    public final String a;
    public final boolean b;

    public C5748vd(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5748vd)) {
            return false;
        }
        C5748vd c5748vd = (C5748vd) obj;
        return Intrinsics.areEqual(this.a, c5748vd.a) && this.b == c5748vd.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ModuleStatus(moduleName=" + this.a + ", loaded=" + this.b + ')';
    }
}
