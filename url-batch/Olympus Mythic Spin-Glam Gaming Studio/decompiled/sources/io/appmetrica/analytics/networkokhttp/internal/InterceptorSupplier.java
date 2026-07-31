package io.appmetrica.analytics.networkokhttp.internal;

import androidx.annotation.NonNull;
import okhttp3.Interceptor;

/* loaded from: classes15.dex */
public interface InterceptorSupplier {
    @NonNull
    Interceptor get();
}
