package io.intercom.android.sdk.m5.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommonRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", i = {0}, l = {24}, m = "openMessenger", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class CommonRepository$openMessenger$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonRepository$openMessenger$1(CommonRepository commonRepository, Continuation<? super CommonRepository$openMessenger$1> continuation) {
        super(continuation);
        this.this$0 = commonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.openMessenger(this);
    }
}
