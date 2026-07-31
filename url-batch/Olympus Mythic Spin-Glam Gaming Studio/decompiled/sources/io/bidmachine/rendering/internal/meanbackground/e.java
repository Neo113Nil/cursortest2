package io.bidmachine.rendering.internal.meanbackground;

import android.graphics.Bitmap;
import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements m {
    @Override // io.bidmachine.rendering.internal.meanbackground.m
    public int[] a(Bitmap bitmap, Rect rect) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(rect, "rect");
        int[] iArr = new int[rect.width() * rect.height()];
        bitmap.getPixels(iArr, 0, rect.width(), rect.left, rect.top, rect.width(), rect.height());
        return iArr;
    }
}
