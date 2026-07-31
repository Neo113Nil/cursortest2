package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;

/* loaded from: classes6.dex */
public final class i extends ForwardingSource {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.a = jVar;
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            return super.read(sink, j);
        } catch (IOException e) {
            this.a.a(e);
            throw e;
        }
    }
}
