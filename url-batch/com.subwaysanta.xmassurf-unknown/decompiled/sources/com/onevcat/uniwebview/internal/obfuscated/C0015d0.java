package com.onevcat.uniwebview.internal.obfuscated;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015d0 {
    public final List a;
    public final float b;

    public C0015d0(List rects, float f) {
        Intrinsics.checkNotNullParameter(rects, "rects");
        this.a = rects;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0015d0)) {
            return false;
        }
        C0015d0 c0015d0 = (C0015d0) obj;
        return Intrinsics.areEqual(this.a, c0015d0.a) && Intrinsics.areEqual((Object) Float.valueOf(this.b), (Object) Float.valueOf(c0015d0.b));
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransparencyMask(rects=" + this.a + ", scale=" + this.b + ')';
    }
}
