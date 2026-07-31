package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* loaded from: classes11.dex */
public final class C4 extends RequestBody {
    public final /* synthetic */ Pi a;

    public C4(Pi pi) {
        this.a = pi;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return MediaType.parse(this.a.a());
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.a.a(sink);
    }
}
