package com.five_corp.ad.internal.view;

import com.five_corp.ad.CreativeType;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class t {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CreativeType.values().length];
        a = iArr;
        try {
            iArr[CreativeType.MOVIE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[CreativeType.IMAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
