package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011c0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public C0011c0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0011c0)) {
            return false;
        }
        C0011c0 c0011c0 = (C0011c0) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.a), (Object) Float.valueOf(c0011c0.a)) && Intrinsics.areEqual((Object) Float.valueOf(this.b), (Object) Float.valueOf(c0011c0.b)) && Intrinsics.areEqual((Object) Float.valueOf(this.c), (Object) Float.valueOf(c0011c0.c)) && Intrinsics.areEqual((Object) Float.valueOf(this.d), (Object) Float.valueOf(c0011c0.d));
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((Float.hashCode(this.c) + ((Float.hashCode(this.b) + (Float.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CornerRadius(topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + ')';
    }
}
