package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* compiled from: AndroidAdRefresh.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Result;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidAdRefresh$invoke$3$1$1$2", f = "AndroidAdRefresh.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AndroidAdRefresh$invoke$3$1$1$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ Deferred $showing;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidAdRefresh$invoke$3$1$1$2(Deferred deferred, Continuation continuation) {
        super(2, continuation);
        this.$showing = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidAdRefresh$invoke$3$1$1$2(this.$showing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Result) obj).getValue(), (Continuation) obj2);
    }

    public final Object invoke(Object obj, Continuation continuation) {
        return ((AndroidAdRefresh$invoke$3$1$1$2) create(Result.m8022boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Job.DefaultImpls.cancel$default(this.$showing, null, 1, null);
        return Unit.INSTANCE;
    }
}
