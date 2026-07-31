package com.fyber.inneractive.sdk.ignite;

import com.fyber.inneractive.sdk.protobuf.y0;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class p {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[y0.values().length];
        a = iArr;
        try {
            iArr[y0.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[y0.NEW_BUILDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[y0.BUILD_MESSAGE_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[y0.GET_DEFAULT_INSTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[y0.GET_PARSER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[y0.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[y0.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
