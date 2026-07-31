package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* loaded from: classes10.dex */
public final class F9 {
    public final F4 a;

    public F9(Interceptor[] interceptors, Interceptor[] networkInterceptors, Dispatcher dispatcher, Ok timeoutConfig) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        this.a = new F4(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }

    public final Deferred a(AbstractC3866af request) {
        Deferred async$default;
        Intrinsics.checkNotNullParameter(request, "request");
        async$default = BuildersKt__Builders_commonKt.async$default(L9.c, null, null, new E9(this, request, null), 3, null);
        return async$default;
    }
}
