package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes13.dex */
public final class Ph extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Sh d;
    public final /* synthetic */ String e;
    public final /* synthetic */ RootConfig f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ph(List list, Sh sh, String str, RootConfig rootConfig, Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.d = sh;
        this.e = str;
        this.f = rootConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Ph ph = new Ph(this.c, this.d, this.e, this.f, continuation);
        ph.b = obj;
        return ph;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ph) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Oh oh = new Oh(this.c, this.d, this.e, this.f, (ProducerScope) this.b, null);
            this.a = 1;
            if (SupervisorKt.supervisorScope(oh, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
