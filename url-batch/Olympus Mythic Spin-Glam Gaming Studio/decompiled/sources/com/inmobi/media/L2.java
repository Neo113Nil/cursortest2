package com.inmobi.media;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes12.dex */
public final class L2 implements Interceptor {
    public static final L2 a = new L2();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String str = M2.a;
        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
        Objects.toString(request);
        try {
            Response proceed = chain.proceed(request);
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Objects.toString(proceed);
            Intrinsics.checkNotNull(request);
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Objects.toString(request);
            Objects.toString(proceed);
            Intrinsics.checkNotNull(proceed);
            return proceed;
        } catch (Exception e) {
            String str2 = M2.a;
            Objects.toString(request);
            Intrinsics.checkNotNull(request);
            Intrinsics.checkNotNullParameter(request, "request");
            throw e;
        }
    }
}
