package com.vungle.ads.internal.network;

import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;

/* loaded from: classes6.dex */
public final class j extends ResponseBody {
    public final ResponseBody a;
    public final BufferedSource b;
    public IOException c;

    public j(ResponseBody delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.a = delegate;
        this.b = Okio.buffer(new i(this, LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(delegate)));
    }

    public final void a(IOException iOException) {
        this.c = iOException;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.a.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.b;
    }

    public final void a() {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
    }
}
