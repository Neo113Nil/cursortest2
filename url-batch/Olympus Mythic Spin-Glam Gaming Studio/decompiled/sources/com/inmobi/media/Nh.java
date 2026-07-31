package com.inmobi.media;

import com.inmobi.media.core.config.models.RootConfig;
import java.util.List;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes11.dex */
public final class Nh extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ Sh b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ RootConfig e;
    public final /* synthetic */ List f;
    public final /* synthetic */ ProducerScope g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nh(Sh sh, String str, String str2, RootConfig rootConfig, List list, ProducerScope producerScope, Continuation continuation) {
        super(2, continuation);
        this.b = sh;
        this.c = str;
        this.d = str2;
        this.e = rootConfig;
        this.f = list;
        this.g = producerScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Nh(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Nh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Sh sh = this.b;
                String str = this.c;
                String str2 = this.d;
                RootConfig rootConfig = this.e;
                List list = this.f;
                ProducerScope producerScope = this.g;
                this.a = 1;
                if (sh.a(str, str2, rootConfig, list, producerScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC4361t9.a(e);
        }
        return Unit.INSTANCE;
    }
}
