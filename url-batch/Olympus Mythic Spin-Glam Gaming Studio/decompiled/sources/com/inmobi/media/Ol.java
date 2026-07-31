package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class Ol {
    public final int a;
    public final int b;
    public final String c;
    public final int d;

    public Ol(int i, int i2, String mediaUrl, String delivery, String type, int i3) {
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        Intrinsics.checkNotNullParameter(delivery, "delivery");
        Intrinsics.checkNotNullParameter(type, "type");
        this.a = i;
        this.b = i2;
        this.c = mediaUrl;
        this.d = i3;
    }
}
