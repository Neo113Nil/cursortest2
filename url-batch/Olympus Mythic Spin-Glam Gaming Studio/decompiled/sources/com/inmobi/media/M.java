package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class M {
    public final RectF a;
    public final ArrayList b;
    public final int c;
    public final int d;

    public M(RectF visibleRect, ArrayList obstructions, int i, int i2) {
        Intrinsics.checkNotNullParameter(visibleRect, "visibleRect");
        Intrinsics.checkNotNullParameter(obstructions, "obstructions");
        this.a = visibleRect;
        this.b = obstructions;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m = (M) obj;
        return Intrinsics.areEqual(this.a, m.a) && Intrinsics.areEqual(this.b, m.b) && this.c == m.c && this.d == m.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + Ai.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ExposureInputData(visibleRect=" + this.a + ", obstructions=" + this.b + ", screenWidth=" + this.c + ", screenHeight=" + this.d + ")";
    }
}
