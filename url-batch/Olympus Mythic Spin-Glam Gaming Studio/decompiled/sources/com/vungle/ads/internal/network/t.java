package com.vungle.ads.internal.network;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

/* loaded from: classes6.dex */
public final class t extends RequestBody {
    public final /* synthetic */ RequestBody a;
    public final /* synthetic */ Buffer b;

    public t(RequestBody requestBody, Buffer buffer) {
        this.a = requestBody;
        this.b = buffer;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.b.size();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.a.get$contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.b.snapshot());
    }
}
