package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes11.dex */
public final class Mm extends SuspendLambda implements Function2 {
    public final /* synthetic */ Nm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mm(Nm nm, Continuation continuation) {
        super(2, continuation);
        this.a = nm;
    }

    public static final void a(Nm nm, View view) {
        X4.a(nm.d, nm.b, C4217nm.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Mm(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Mm(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        final Nm nm = this.a;
        ViewGroup viewGroup = nm.j;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.inmobi.media.Mm$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/Mm$$ExternalSyntheticLambda0;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(com.safedk.android.utils.h.i, view);
                    safedk_Mm$$ExternalSyntheticLambda0_onClick_e0276e60d5ed5fd18fa6fea7e00b0162(view);
                }

                public void safedk_Mm$$ExternalSyntheticLambda0_onClick_e0276e60d5ed5fd18fa6fea7e00b0162(View p0) {
                    Mm.a(Nm.this, p0);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
