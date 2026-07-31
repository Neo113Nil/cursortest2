package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.ym, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4506ym extends SuspendLambda implements Function2 {
    public final /* synthetic */ Nm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4506ym(Nm nm, Continuation continuation) {
        super(2, continuation);
        this.a = nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4506ym(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4506ym(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ViewGroup viewGroup = this.a.j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }
}
