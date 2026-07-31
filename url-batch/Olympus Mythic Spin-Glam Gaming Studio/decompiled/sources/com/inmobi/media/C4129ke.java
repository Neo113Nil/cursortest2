package com.inmobi.media;

import android.R;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.inmobi.media.ke, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4129ke extends SuspendLambda implements Function2 {
    public final /* synthetic */ C4235oe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4129ke(C4235oe c4235oe, Continuation continuation) {
        super(2, continuation);
        this.a = c4235oe;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4129ke(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4129ke(this.a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C4235oe c4235oe = this.a;
        c4235oe.getClass();
        c4235oe.a.addView(c4235oe.g, new RelativeLayout.LayoutParams(-1, -1));
        C4235oe c4235oe2 = this.a;
        boolean z = c4235oe2.d.d.a;
        c4235oe2.i = z;
        if (z) {
            c4235oe2.a(c4235oe2.j, c4235oe2.k);
        } else {
            c4235oe2.a(c4235oe2.k, c4235oe2.j);
        }
        An an = this.a.l;
        if (an.c.a) {
            float b = R5.b();
            ProgressBar progressBar = new ProgressBar(an.b.getContext(), null, R.attr.progressBarStyleHorizontal);
            an.e = progressBar;
            L6.a(progressBar, an.c, b);
            an.b.addView(an.e);
            BuildersKt__Builders_commonKt.launch$default(an.a, Dispatchers.getMain(), null, new C4507yn(an.d, null, an), 2, null);
        }
        return Unit.INSTANCE;
    }
}
