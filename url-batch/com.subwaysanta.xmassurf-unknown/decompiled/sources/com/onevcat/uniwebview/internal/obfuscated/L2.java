package com.onevcat.uniwebview.internal.obfuscated;

import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L2 {
    public static final L2 g = new L2(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ViewCompat.MEASURED_STATE_MASK);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;

    public L2(float f, float f2, float f3, float f4, float f5, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = i;
    }

    public final boolean a() {
        if (this.b > 0.0f) {
            return this.a > 0.0f || this.e > 0.0f;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L2)) {
            return false;
        }
        L2 l2 = (L2) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.a), (Object) Float.valueOf(l2.a)) && Intrinsics.areEqual((Object) Float.valueOf(this.b), (Object) Float.valueOf(l2.b)) && Intrinsics.areEqual((Object) Float.valueOf(this.c), (Object) Float.valueOf(l2.c)) && Intrinsics.areEqual((Object) Float.valueOf(this.d), (Object) Float.valueOf(l2.d)) && Intrinsics.areEqual((Object) Float.valueOf(this.e), (Object) Float.valueOf(l2.e)) && this.f == l2.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((Float.hashCode(this.e) + ((Float.hashCode(this.d) + ((Float.hashCode(this.c) + ((Float.hashCode(this.b) + (Float.hashCode(this.a) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ShadowStyle(radius=" + this.a + ", opacity=" + this.b + ", offsetX=" + this.c + ", offsetY=" + this.d + ", spread=" + this.e + ", color=" + this.f + ')';
    }
}
