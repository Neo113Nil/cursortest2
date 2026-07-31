package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.core.DivActionHandler;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* loaded from: classes12.dex */
public final class Im extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Nm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Im(Nm nm, Continuation continuation) {
        super(2, continuation);
        this.c = nm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Im im = new Im(this.c, continuation);
        im.b = obj;
        return im;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Im im = new Im(this.c, (Continuation) obj2);
        im.b = (AbstractC4295qm) obj;
        return im.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC4295qm mediaEvent;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC4295qm abstractC4295qm = (AbstractC4295qm) this.b;
            MutableSharedFlow mutableSharedFlow = this.c.d;
            this.b = abstractC4295qm;
            this.a = 1;
            if (mutableSharedFlow.emit(abstractC4295qm, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mediaEvent = abstractC4295qm;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mediaEvent = (AbstractC4295qm) this.b;
            ResultKt.throwOnFailure(obj);
        }
        Pn pn = this.c.c.g;
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof C3874an) {
            Map a = Hk.a(pn.a);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("VideoLoadStarted", a, EnumC4530zk.a);
        } else if (mediaEvent instanceof C3952dn) {
            Map a2 = Hk.a(pn.a);
            C4425vk c4425vk2 = C4425vk.a;
            C4425vk.b("VideoLoadSuccess", a2, EnumC4530zk.a);
        } else if (mediaEvent instanceof Jn) {
            boolean[] zArr = pn.b;
            if (!zArr[0]) {
                zArr[0] = true;
                Map a3 = Hk.a(pn.a);
                C4425vk c4425vk3 = C4425vk.a;
                C4425vk.b("VideoStart", a3, EnumC4530zk.a);
            }
        } else if (mediaEvent instanceof Wm) {
            boolean[] zArr2 = pn.b;
            if (!zArr2[1]) {
                zArr2[1] = true;
                Map a4 = Hk.a(pn.a);
                C4425vk c4425vk4 = C4425vk.a;
                C4425vk.b("VideoFirstQuartile", a4, EnumC4530zk.a);
            }
        } else if (mediaEvent instanceof Hn) {
            boolean[] zArr3 = pn.b;
            if (!zArr3[2]) {
                zArr3[2] = true;
                Map a5 = Hk.a(pn.a);
                C4425vk c4425vk5 = C4425vk.a;
                C4425vk.b("VideoSecondQuartile", a5, EnumC4530zk.a);
            }
        } else if (mediaEvent instanceof Qn) {
            boolean[] zArr4 = pn.b;
            if (!zArr4[3]) {
                zArr4[3] = true;
                Map a6 = Hk.a(pn.a);
                C4425vk c4425vk6 = C4425vk.a;
                C4425vk.b("VideoThirdQuartile", a6, EnumC4530zk.a);
            }
        } else if (mediaEvent instanceof C4243om) {
            boolean[] zArr5 = pn.b;
            if (!zArr5[4]) {
                zArr5[4] = true;
                Map a7 = Hk.a(pn.a);
                C4425vk c4425vk7 = C4425vk.a;
                C4425vk.b("VideoComplete", a7, EnumC4530zk.a);
            }
        } else if (mediaEvent instanceof C4269pm) {
            ((C4269pm) mediaEvent).getClass();
            Map mutableMap = MapsKt.toMutableMap(Hk.a(pn.a));
            mutableMap.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 66);
            C4425vk c4425vk8 = C4425vk.a;
            C4425vk.b("VideoLoadFailure", mutableMap, EnumC4530zk.a);
        }
        C4163lm c4163lm = this.c.c.f;
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof C3952dn) {
            c4163lm.b.d = Gl.a(((C3952dn) mediaEvent).a);
            c4163lm.c.f.a(C4052hf.a);
        } else if (mediaEvent instanceof C4269pm) {
            ((C4269pm) mediaEvent).getClass();
            c4163lm.c.m.a(new ep(MapsKt.mapOf(TuplesKt.to("[ERRORCODE]", String.valueOf(405))), null, 2));
        } else if (mediaEvent instanceof Jn) {
            String str = ((Jn) mediaEvent).b;
            if (c4163lm.a.incrementAndGet() > 1) {
                Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(DivActionHandler.DivActionReason.TRIGGER, str));
                C4425vk c4425vk9 = C4425vk.a;
                C4425vk.b("MultipleVideoReadyFired", mutableMapOf, EnumC4530zk.a);
            }
            Lc lc = c4163lm.c.g;
            C4052hf c4052hf = C4052hf.a;
            lc.a(c4052hf);
            c4163lm.c.h.a(c4052hf);
        } else if (mediaEvent instanceof Gn) {
            c4163lm.c.l.a(C4052hf.a);
        } else if (mediaEvent instanceof C4218nn) {
            c4163lm.c.k.a(C4052hf.a);
        } else if (mediaEvent instanceof Wm) {
            c4163lm.c.b.a(C4052hf.a);
        } else if (mediaEvent instanceof Hn) {
            c4163lm.c.c.a(C4052hf.a);
        } else if (mediaEvent instanceof Qn) {
            c4163lm.c.d.a(C4052hf.a);
        } else if (mediaEvent instanceof C4243om) {
            c4163lm.c.e.a(C4052hf.a);
        } else if (mediaEvent instanceof C4454wn) {
            c4163lm.b.e = ((C4454wn) mediaEvent).a;
            c4163lm.c.n.a(C4052hf.a);
        } else if (mediaEvent instanceof W1) {
            if (((W1) mediaEvent).a) {
                c4163lm.c.i.a(C4052hf.a);
            } else {
                c4163lm.c.j.a(C4052hf.a);
            }
        }
        return Unit.INSTANCE;
    }
}
