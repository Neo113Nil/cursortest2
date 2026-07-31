package com.apollographql.apollo.network.ws;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OkHttpWebSocketEngine.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.DefaultWebSocketEngine", f = "OkHttpWebSocketEngine.kt", i = {0, 0}, l = {85}, m = TtmlNode.TEXT_EMPHASIS_MARK_OPEN, n = {"messageChannel", "webSocket"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class DefaultWebSocketEngine$open$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultWebSocketEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketEngine$open$1(DefaultWebSocketEngine defaultWebSocketEngine, Continuation<? super DefaultWebSocketEngine$open$1> continuation) {
        super(continuation);
        this.this$0 = defaultWebSocketEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.open(null, null, this);
    }
}
