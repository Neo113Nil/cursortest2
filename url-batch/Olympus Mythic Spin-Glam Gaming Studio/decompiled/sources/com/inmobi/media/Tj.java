package com.inmobi.media;

import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes12.dex */
public final class Tj extends SuspendLambda implements Function2 {
    public final /* synthetic */ Vj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tj(Vj vj, Continuation continuation) {
        super(2, continuation);
        this.a = vj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Tj(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Tj(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return G5.a(this.a.a) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
    }
}
