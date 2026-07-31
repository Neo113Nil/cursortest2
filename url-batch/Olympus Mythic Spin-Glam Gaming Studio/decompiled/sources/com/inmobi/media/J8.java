package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes12.dex */
public final class J8 implements Interceptor {
    public final long a;

    public J8(long j) {
        this.a = j;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Response proceed = chain.proceed(chain.request());
        ResponseBody okhttp3Response_body = InMobiNetworkBridge.okhttp3Response_body(proceed);
        long contentLength = okhttp3Response_body != null ? okhttp3Response_body.getContentLength() : 0L;
        if (contentLength <= this.a) {
            Intrinsics.checkNotNull(proceed);
            return proceed;
        }
        proceed.close();
        throw new C4205nb("Image size exceeds limit: " + contentLength + " Bytes");
    }
}
