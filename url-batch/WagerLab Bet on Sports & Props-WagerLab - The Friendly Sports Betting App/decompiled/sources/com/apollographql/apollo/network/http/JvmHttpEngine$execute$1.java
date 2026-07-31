package com.apollographql.apollo.network.http;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DefaultHttpEngine.jvm.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.http.JvmHttpEngine", f = "DefaultHttpEngine.jvm.kt", i = {}, l = {53}, m = "execute", n = {}, s = {})
/* loaded from: classes3.dex */
final class JvmHttpEngine$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JvmHttpEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JvmHttpEngine$execute$1(JvmHttpEngine jvmHttpEngine, Continuation<? super JvmHttpEngine$execute$1> continuation) {
        super(continuation);
        this.this$0 = jvmHttpEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
