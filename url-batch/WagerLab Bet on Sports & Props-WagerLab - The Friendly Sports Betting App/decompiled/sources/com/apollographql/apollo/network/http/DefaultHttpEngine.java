package com.apollographql.apollo.network.http;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* compiled from: DefaultHttpEngine.jvm.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003¨\u0006\u000b"}, d2 = {"DefaultHttpEngine", "Lcom/apollographql/apollo/network/http/HttpEngine;", "timeoutMillis", "", "httpCallFactory", "Lokhttp3/Call$Factory;", "Lkotlin/Function0;", "okHttpClient", "Lokhttp3/OkHttpClient;", "connectTimeoutMillis", "readTimeoutMillis", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultHttpEngine {
    public static final HttpEngine DefaultHttpEngine(long j) {
        return new JvmHttpEngine(j);
    }

    public static /* synthetic */ HttpEngine DefaultHttpEngine$default(long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 60000;
        }
        return DefaultHttpEngine(j);
    }

    public static final HttpEngine DefaultHttpEngine(Call.Factory httpCallFactory) {
        Intrinsics.checkNotNullParameter(httpCallFactory, "httpCallFactory");
        return new JvmHttpEngine(httpCallFactory);
    }

    public static final HttpEngine DefaultHttpEngine(Function0<? extends Call.Factory> httpCallFactory) {
        Intrinsics.checkNotNullParameter(httpCallFactory, "httpCallFactory");
        return new JvmHttpEngine(httpCallFactory);
    }

    public static final HttpEngine DefaultHttpEngine(OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        return new JvmHttpEngine(okHttpClient);
    }

    public static final HttpEngine DefaultHttpEngine(long j, long j2) {
        return new JvmHttpEngine(j, j2);
    }
}
