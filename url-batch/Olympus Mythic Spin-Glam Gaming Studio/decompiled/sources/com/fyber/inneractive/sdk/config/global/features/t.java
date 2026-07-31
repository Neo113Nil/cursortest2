package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UnitDisplayType.values().length];
        a = iArr;
        try {
            iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
