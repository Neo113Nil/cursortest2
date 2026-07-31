package com.inmobi.media;

import android.graphics.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class H3 {
    public static final int a(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (iArr.length != 4) {
            return -16777216;
        }
        return Color.argb(iArr[0], iArr[1], iArr[2], iArr[3]);
    }
}
