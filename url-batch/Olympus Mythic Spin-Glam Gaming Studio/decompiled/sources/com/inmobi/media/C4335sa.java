package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.inmobi.media.sa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4335sa implements Interceptor {
    public static final C4335sa a = new C4335sa();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        EnumC4069i6 a2 = AbstractC3998ff.a();
        if (a2 != null) {
            new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(a2.a).message(a2.toString()).body(ResponseBody.create((MediaType) null, "")).build();
        }
        Response proceed = chain.proceed(chain.request());
        Intrinsics.checkNotNullExpressionValue(proceed, "proceed(...)");
        return proceed;
    }
}
