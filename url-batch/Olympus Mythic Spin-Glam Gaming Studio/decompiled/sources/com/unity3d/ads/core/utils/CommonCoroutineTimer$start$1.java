package com.unity3d.ads.core.utils;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: CommonCoroutineTimer.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class CommonCoroutineTimer$start$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Function0 $action;
    final /* synthetic */ long $delayStartMillis;
    final /* synthetic */ long $repeatMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonCoroutineTimer$start$1(long j, Function0 function0, long j2, Continuation continuation) {
        super(2, continuation);
        this.$delayStartMillis = j;
        this.$action = function0;
        this.$repeatMillis = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CommonCoroutineTimer$start$1 commonCoroutineTimer$start$1 = new CommonCoroutineTimer$start$1(this.$delayStartMillis, this.$action, this.$repeatMillis, continuation);
        commonCoroutineTimer$start$1.L$0 = obj;
        return commonCoroutineTimer$start$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((CommonCoroutineTimer$start$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            long j = this.$delayStartMillis;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (CoroutineScopeKt.isActive(coroutineScope)) {
            this.$action.mo4828invoke();
            long j2 = this.$repeatMillis;
            this.L$0 = coroutineScope;
            this.label = 2;
            if (DelayKt.delay(j2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
