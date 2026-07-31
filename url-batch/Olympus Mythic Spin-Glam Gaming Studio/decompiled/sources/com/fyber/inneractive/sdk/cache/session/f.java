package com.fyber.inneractive.sdk.cache.session;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.cache.session.enums.a.values().length];
        a = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.cache.session.enums.a.CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
