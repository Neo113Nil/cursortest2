package com.inmobi.media;

import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes12.dex */
public final class Ui implements Interceptor {
    public static void a(Vi vi, int i) {
        long pow = (long) (Math.pow(1.0d, i) * vi.b);
        if (pow > 0) {
            try {
                Thread.sleep(pow);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IOException("Retry delay interrupted", e);
            }
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Object tag = request.tag();
        Response response = null;
        Vi vi = tag instanceof Vi ? (Vi) tag : null;
        if (vi == null) {
            Intrinsics.checkNotNull(request);
            try {
                Response proceed = chain.proceed(request);
                Intrinsics.checkNotNullExpressionValue(proceed, "proceed(...)");
                return proceed;
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (!StringsKt.contains((CharSequence) (message != null ? message : ""), (CharSequence) "port out of range", true)) {
                    throw e;
                }
                Lazy lazy = AbstractC3861aa.a;
                AbstractC3861aa.a(new Q2(e));
                throw new IOException("Proxy configuration error", e);
            }
        }
        int i = vi.a;
        int i2 = i + 1;
        Throwable e2 = null;
        for (int i3 = 0; i3 < i2; i3++) {
            if (response != null) {
                try {
                    ResponseBody okhttp3Response_body = InMobiNetworkBridge.okhttp3Response_body(response);
                    if (okhttp3Response_body != null) {
                        okhttp3Response_body.close();
                    }
                } catch (IOException e3) {
                    e2 = e3;
                    if (i3 == i) {
                        break;
                    }
                    a(vi, i3);
                } catch (IllegalArgumentException e4) {
                    String message2 = e4.getMessage();
                    if (!StringsKt.contains((CharSequence) (message2 != null ? message2 : ""), (CharSequence) "port out of range", true)) {
                        throw e4;
                    }
                    Lazy lazy2 = AbstractC3861aa.a;
                    AbstractC3861aa.a(new Q2(e4));
                    throw new IOException("Proxy configuration error", e4);
                } catch (CancellationException e5) {
                    throw e5;
                } catch (IllegalStateException e6) {
                    e2 = e6;
                    if (i3 == i) {
                        break;
                    }
                    a(vi, i3);
                }
            }
            response = chain.proceed(request);
            Intrinsics.checkNotNull(response);
            Intrinsics.checkNotNullParameter(response, "<this>");
            int code = response.code();
            if (400 <= code && code < 600 && Ag.a(response) && i3 < i) {
                a(vi, i3);
            }
            return response;
        }
        if (response != null) {
            return response;
        }
        throw new IOException("Retry policy exhausted", e2);
    }
}
