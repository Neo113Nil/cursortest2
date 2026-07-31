package io.intercom.android.sdk.m5.inbox.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InboxPagingSource.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.inbox.data.InboxPagingSource", f = "InboxPagingSource.kt", i = {0, 0, 1, 1, 1}, l = {18, 32}, m = "load", n = {"this", "params", "this", "conversationPage", "isFirstLoad"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
/* loaded from: classes8.dex */
final class InboxPagingSource$load$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InboxPagingSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InboxPagingSource$load$1(InboxPagingSource inboxPagingSource, Continuation<? super InboxPagingSource$load$1> continuation) {
        super(continuation);
        this.this$0 = inboxPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(null, this);
    }
}
