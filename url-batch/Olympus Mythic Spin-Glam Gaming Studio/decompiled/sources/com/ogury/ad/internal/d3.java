package com.ogury.ad.internal;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class d3 implements pa {
    @Override // com.ogury.ad.internal.pa
    public final void a(Rect adLayoutRect, Rect containerRect) {
        Intrinsics.checkNotNullParameter(adLayoutRect, "adLayoutRect");
        Intrinsics.checkNotNullParameter(containerRect, "containerRect");
        if (adLayoutRect.width() > containerRect.width()) {
            float width = adLayoutRect.width() / containerRect.width();
            Intrinsics.checkNotNullParameter(adLayoutRect, "<this>");
            adLayoutRect.bottom = adLayoutRect.top + ((int) (adLayoutRect.height() / width));
            adLayoutRect.right = adLayoutRect.left + ((int) (adLayoutRect.width() / width));
        }
        if (adLayoutRect.height() > containerRect.height()) {
            float height = adLayoutRect.height() / containerRect.height();
            Intrinsics.checkNotNullParameter(adLayoutRect, "<this>");
            adLayoutRect.bottom = adLayoutRect.top + ((int) (adLayoutRect.height() / height));
            adLayoutRect.right = adLayoutRect.left + ((int) (adLayoutRect.width() / height));
        }
    }
}
