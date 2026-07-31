package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.ad.common.OnAdsInitListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c0 {
    public final Context a;
    public final String b;
    public final Product c;
    public final OnAdsInitListener d;

    public c0(Context context, String str, Product product, OnAdsInitListener onAdsInitListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onAdsInitListener, "onAdsInitListener");
        this.a = context;
        this.b = str;
        this.c = product;
        this.d = onAdsInitListener;
    }
}
