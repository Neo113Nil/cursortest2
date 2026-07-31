package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;

/* loaded from: classes11.dex */
public final class D9 {
    public static F9 a(Interceptor[] interceptors, Dispatcher dispatcher, Interceptor[] networkInterceptors, Ok timeoutConfig, int i) {
        if ((i & 1) != 0) {
            interceptors = new Interceptor[0];
        }
        if ((i & 2) != 0) {
            dispatcher = L9.b;
        }
        if ((i & 4) != 0) {
            networkInterceptors = new Interceptor[0];
        }
        if ((i & 8) != 0) {
            timeoutConfig = new Ok(60L, 60L, 60L);
        }
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(networkInterceptors, "networkInterceptors");
        Intrinsics.checkNotNullParameter(timeoutConfig, "timeoutConfig");
        return new F9(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }
}
