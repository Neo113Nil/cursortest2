package io.intercom.android.sdk;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AblyManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.AblyManager", f = "AblyManager.kt", i = {0, 1, 1}, l = {171, 181}, m = "getAblyConfiguration", n = {"this", "this", "connectConfig"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class AblyManager$getAblyConfiguration$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AblyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AblyManager$getAblyConfiguration$1(AblyManager ablyManager, Continuation<? super AblyManager$getAblyConfiguration$1> continuation) {
        super(continuation);
        this.this$0 = ablyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object ablyConfiguration;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ablyConfiguration = this.this$0.getAblyConfiguration(this);
        return ablyConfiguration;
    }
}
