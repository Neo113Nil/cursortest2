package expo.modules.updates.loader;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Loader.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.loader.Loader", f = "Loader.kt", i = {0}, l = {95, 103}, m = "load", n = {"updateResponseDecision"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class Loader$load$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Loader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Loader$load$1(Loader loader, Continuation<? super Loader$load$1> continuation) {
        super(continuation);
        this.this$0 = loader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(null, this);
    }
}
