package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public class Je {
    public final String a;
    public final String b;

    public Je(String url, String eventType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.a = url;
        this.b = eventType;
    }
}
