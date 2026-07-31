package com.inmobi.media;

import android.content.Context;
import java.util.Calendar;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes12.dex */
public final class Vb extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ Wb b;
    public final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vb(Wb wb, Context context, Continuation continuation) {
        super(1, continuation);
        this.b = wb;
        this.c = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Vb(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Vb(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.b.g.get()) {
                return Unit.INSTANCE;
            }
            Wb wb = this.b;
            Context context = this.c;
            this.a = 1;
            if (wb.a(context, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        CoroutineScope coroutineScope = AbstractC3995fc.a;
        Kb dao = (Kb) Lb.a.getValue();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Wb wb2 = this.b;
        long j = timeInMillis - wb2.c;
        int i2 = wb2.e;
        Intrinsics.checkNotNullParameter(dao, "dao");
        if (!AbstractC3995fc.c.getAndSet(true)) {
            C3941dc runnable = new C3941dc(dao, j, i2, null);
            CoroutineScope coroutineScope2 = Hl.a;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            BuildersKt__Builders_commonKt.launch$default(Hl.a, null, null, new El(10000L, null, runnable), 3, null);
        }
        return Unit.INSTANCE;
    }
}
