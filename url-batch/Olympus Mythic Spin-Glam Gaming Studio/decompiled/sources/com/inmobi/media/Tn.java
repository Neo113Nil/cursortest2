package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Tn {
    public final boolean a;
    public final boolean b;
    public final H5 c;
    public final H5 d;
    public final C4106jh e;

    public Tn(boolean z, boolean z2, H5 iconMinDimension, H5 mediaMinDimension, C4106jh nativeViewData) {
        Intrinsics.checkNotNullParameter(iconMinDimension, "iconMinDimension");
        Intrinsics.checkNotNullParameter(mediaMinDimension, "mediaMinDimension");
        Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.a = z;
        this.b = z2;
        this.c = iconMinDimension;
        this.d = mediaMinDimension;
        this.e = nativeViewData;
    }
}
