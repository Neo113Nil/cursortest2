package androidx.paging;

import androidx.paging.FlowExtKt$simpleScan$1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: FlowExt.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1$1", f = "FlowExt.kt", i = {0}, l = {56, 57}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FlowExtKt$simpleScan$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowExtKt$simpleScan$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$simpleScan$1$1$emit$1(FlowExtKt$simpleScan$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super FlowExtKt$simpleScan$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
