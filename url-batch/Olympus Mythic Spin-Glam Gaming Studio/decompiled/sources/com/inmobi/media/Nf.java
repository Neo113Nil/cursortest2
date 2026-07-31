package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class Nf extends Je {
    public final String c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nf(String vendor, String str, String url) {
        super(url, "OMID_VIEWABILITY");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(url, "url");
        this.c = vendor;
        this.d = str;
    }
}
