package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes13.dex */
public final class Sm extends SuspendLambda implements Function2 {
    public Ol a;
    public int b;
    public final /* synthetic */ Ol c;
    public final /* synthetic */ double d;
    public final /* synthetic */ EnumC3944df e;
    public final /* synthetic */ int f;
    public final /* synthetic */ AdConfig.VastVideoConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sm(Ol ol, double d, EnumC3944df enumC3944df, int i, AdConfig.VastVideoConfig vastVideoConfig, Continuation continuation) {
        super(2, continuation);
        this.c = ol;
        this.d = d;
        this.e = enumC3944df;
        this.f = i;
        this.g = vastVideoConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Sm(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sm) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ol ol;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ol ol2 = this.c;
            double d = this.d;
            EnumC3944df enumC3944df = this.e;
            int i2 = this.f;
            AdConfig.VastVideoConfig vastVideoConfig = this.g;
            this.a = ol2;
            this.b = 1;
            Object a = Vm.a(ol2, d, enumC3944df, i2, vastVideoConfig, this);
            if (a == coroutine_suspended) {
                return coroutine_suspended;
            }
            ol = ol2;
            obj = a;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ol = this.a;
            ResultKt.throwOnFailure(obj);
        }
        return TuplesKt.to(ol, obj);
    }
}
