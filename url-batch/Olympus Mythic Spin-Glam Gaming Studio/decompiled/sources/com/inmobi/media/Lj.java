package com.inmobi.media;

import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes11.dex */
public final class Lj extends SuspendLambda implements Function2 {
    public final /* synthetic */ Mj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lj(Mj mj, Continuation continuation) {
        super(2, continuation);
        this.a = mj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Lj(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Lj(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return G5.a(this.a.a) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
    }
}
