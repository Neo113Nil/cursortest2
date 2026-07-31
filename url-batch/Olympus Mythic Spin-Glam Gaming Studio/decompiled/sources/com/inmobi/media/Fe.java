package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes10.dex */
public final class Fe extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ He b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fe(He he, Continuation continuation) {
        super(2, continuation);
        this.b = he;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Fe(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Fe(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC4466x9 l = this.b.l();
            if (l != null) {
                ((C4493y9) l).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            MutableStateFlow mutableStateFlow = ((Xo) this.b.b.l.getValue()).b;
            Ee ee = new Ee(null);
            this.a = 1;
            if (FlowKt.first(mutableStateFlow, ee, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Ie ie = this.b.b;
        ie.b.b = true;
        ie.f.b.e.a(C4052hf.a);
        He he = this.b;
        AbstractC4102jd.a(he.b.c, he.l());
        C3903c0 c3903c0 = this.b.a.a.d;
        c3903c0.getClass();
        c3903c0.e = SystemClock.elapsedRealtime();
        Qc qc = (Qc) this.b.b.g.f.getValue();
        C4106jh publisherNativeViewData = this.b.b.c;
        qc.getClass();
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Map a = Hk.a(qc.a);
        ViewGroup parentView = publisherNativeViewData.a.getParentView();
        int i2 = 0;
        for (Pair pair : AbstractC4102jd.a(publisherNativeViewData)) {
            View view = (View) pair.component1();
            short shortValue = ((Number) pair.component2()).shortValue();
            if (view != null && view.getVisibility() == 0 && Un.a(view, parentView)) {
                i2 |= 1 << shortValue;
            }
        }
        a.put("viewState", Integer.valueOf(i2));
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("ViewStateOnParentAttached", a, EnumC4530zk.a);
        return Unit.INSTANCE;
    }
}
