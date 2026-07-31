package com.inmobi.media;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes9.dex */
public final class De extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ He b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public De(He he, Continuation continuation) {
        super(2, continuation);
        this.b = he;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new De(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new De(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC4466x9 l = this.b.l();
            if (l != null) {
                ((C4493y9) l).a("NativeRenderedState", "MRC50 Tracking Started");
            }
            Flow b = ((Sd) this.b.b.k.getValue()).a.b();
            Ce ce = new Ce(null);
            this.a = 1;
            if (FlowKt.first(b, ce, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC4466x9 l2 = this.b.l();
        if (l2 != null) {
            ((C4493y9) l2).a("NativeRenderedState", "MRC50 Event Occurred");
        }
        Ie ie = this.b.b;
        ie.b.d = true;
        Map a = Hk.a(((Qc) ie.g.f.getValue()).a);
        C4425vk c4425vk = C4425vk.a;
        C4425vk.b("MRCViewable50Rendered", a, EnumC4530zk.a);
        this.b.b.f.b.g.a(C4052hf.a);
        ((Sd) this.b.b.k.getValue()).a.a();
        return Unit.INSTANCE;
    }
}
