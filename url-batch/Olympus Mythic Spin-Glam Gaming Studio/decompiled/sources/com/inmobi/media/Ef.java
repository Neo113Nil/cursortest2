package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ef extends SuspendLambda implements Function2 {
    public final /* synthetic */ Gf a;
    public final /* synthetic */ AdConfig.OmidConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ef(Gf gf, AdConfig.OmidConfig omidConfig, Continuation continuation) {
        super(2, continuation);
        this.a = gf;
        this.b = omidConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ef(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ef(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Qa qa = this.a.a.a;
        qa.getClass();
        Intrinsics.checkNotNullParameter("last_ts", "key");
        return Boxing.boxBoolean((System.currentTimeMillis() / ((long) 1000)) - qa.a.getLong("last_ts", 0L) > this.b.getExpiry());
    }
}
