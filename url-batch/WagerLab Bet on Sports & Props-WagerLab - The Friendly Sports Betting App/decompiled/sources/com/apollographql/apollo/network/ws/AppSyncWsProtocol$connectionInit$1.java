package com.apollographql.apollo.network.ws;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AppSyncWsProtocol.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.AppSyncWsProtocol", f = "AppSyncWsProtocol.kt", i = {}, l = {40, 42}, m = "connectionInit", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppSyncWsProtocol$connectionInit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppSyncWsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSyncWsProtocol$connectionInit$1(AppSyncWsProtocol appSyncWsProtocol, Continuation<? super AppSyncWsProtocol$connectionInit$1> continuation) {
        super(continuation);
        this.this$0 = appSyncWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connectionInit(this);
    }
}
