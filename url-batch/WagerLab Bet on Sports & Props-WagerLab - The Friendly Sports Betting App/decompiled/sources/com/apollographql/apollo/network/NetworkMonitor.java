package com.apollographql.apollo.network;

import java.io.Closeable;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: NetworkMonitor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/apollographql/apollo/network/NetworkMonitor;", "Ljava/io/Closeable;", "Lokio/Closeable;", "isOnline", "Lkotlinx/coroutines/flow/StateFlow;", "", "()Lkotlinx/coroutines/flow/StateFlow;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface NetworkMonitor extends Closeable {
    StateFlow<Boolean> isOnline();
}
