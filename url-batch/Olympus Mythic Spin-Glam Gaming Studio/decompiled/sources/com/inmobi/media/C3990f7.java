package com.inmobi.media;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.inmobi.media.f7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3990f7 implements Interceptor {
    public static final C3990f7 a = new C3990f7();

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        AbstractC3962e7.a();
        Objects.toString(chain.request());
        if (AbstractC3962e7.a()) {
            Response proceed = chain.proceed(chain.request());
            Intrinsics.checkNotNull(proceed);
            return proceed;
        }
        Response.Builder protocol = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1);
        C4017g6 c4017g6 = EnumC4069i6.b;
        Response build = protocol.code(192).message("GDPR_COMPLIANCE_ENFORCED").body(ResponseBody.create((MediaType) null, "")).build();
        Intrinsics.checkNotNull(build);
        return build;
    }
}
