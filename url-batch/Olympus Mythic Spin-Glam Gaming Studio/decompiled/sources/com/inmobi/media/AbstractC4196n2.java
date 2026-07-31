package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.n2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4196n2 {
    public String a;
    public String b;
    public long c;
    public int d;

    public AbstractC4196n2(String eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.a = eventType;
        this.b = str;
        this.c = System.currentTimeMillis();
    }
}
