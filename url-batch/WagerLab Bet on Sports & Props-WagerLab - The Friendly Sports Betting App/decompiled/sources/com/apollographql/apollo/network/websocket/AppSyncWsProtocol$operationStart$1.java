package com.apollographql.apollo.network.websocket;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operation.Data;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AppSyncWsProtocol.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.websocket.AppSyncWsProtocol", f = "AppSyncWsProtocol.kt", i = {}, l = {41}, m = "operationStart", n = {}, s = {})
/* loaded from: classes3.dex */
final class AppSyncWsProtocol$operationStart$1<D extends Operation.Data> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppSyncWsProtocol this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSyncWsProtocol$operationStart$1(AppSyncWsProtocol appSyncWsProtocol, Continuation<? super AppSyncWsProtocol$operationStart$1> continuation) {
        super(continuation);
        this.this$0 = appSyncWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.operationStart(null, this);
    }
}
