package com.inmobi.media;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* renamed from: com.inmobi.media.g7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4018g7 extends Pi {
    public final HashMap a;

    public C4018g7(HashMap payload, int i) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.a = payload;
    }

    @Override // com.inmobi.media.Pi
    public final void a(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        bufferedSink.writeUtf8(N3.a(this.a));
    }

    @Override // com.inmobi.media.Pi
    public final String a() {
        return "application/x-www-form-urlencoded";
    }

    public C4018g7(HashMap payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.a = payload;
    }
}
