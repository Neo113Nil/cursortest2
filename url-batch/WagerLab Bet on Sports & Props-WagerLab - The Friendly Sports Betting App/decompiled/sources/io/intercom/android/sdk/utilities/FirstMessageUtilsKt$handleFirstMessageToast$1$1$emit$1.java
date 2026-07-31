package io.intercom.android.sdk.utilities;

import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FirstMessageUtils.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1", f = "FirstMessageUtils.kt", i = {0}, l = {31}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes8.dex */
final class FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirstMessageUtilsKt$handleFirstMessageToast$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(FirstMessageUtilsKt$handleFirstMessageToast$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((IntercomEvent.BaseResponseReceived) null, (Continuation<? super Unit>) this);
    }
}
