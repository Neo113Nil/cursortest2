package com.apollographql.apollo.internal;

import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: dispatchers.concurrent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefaultDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Dispatchers_concurrentKt {
    public static final CoroutineDispatcher getDefaultDispatcher() {
        return Dispatchers.getIO();
    }
}
