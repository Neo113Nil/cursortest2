package com.five_corp.ad.internal.context;

import com.five_corp.ad.CreativeType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[f.values().length];
        b = iArr;
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[3] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[2] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[CreativeType.values().length];
        a = iArr2;
        try {
            iArr2[CreativeType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[CreativeType.MOVIE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[CreativeType.NOT_LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
