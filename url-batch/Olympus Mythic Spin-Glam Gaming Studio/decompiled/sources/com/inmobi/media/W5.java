package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class W5 extends Je {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5(String url, String offset) {
        super(url, "progress");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.c = offset;
    }
}
