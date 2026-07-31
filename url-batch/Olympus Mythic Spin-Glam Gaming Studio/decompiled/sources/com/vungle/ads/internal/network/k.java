package com.vungle.ads.internal.network;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* loaded from: classes6.dex */
public final class k extends ResponseBody {
    public final MediaType a;
    public final long b;

    public k(MediaType mediaType, long j) {
        this.a = mediaType;
        this.b = j;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long get$contentLength() {
        return this.b;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.a;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final BufferedSource get$this_asResponseBody() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
