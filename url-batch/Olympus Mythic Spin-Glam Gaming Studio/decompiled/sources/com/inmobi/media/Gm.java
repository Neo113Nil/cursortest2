package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes10.dex */
public final class Gm implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public Gm(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Fm fm;
        int i;
        if (continuation instanceof Fm) {
            fm = (Fm) continuation;
            int i2 = fm.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fm.b = i2 - Integer.MIN_VALUE;
                Object obj2 = fm.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fm.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    AbstractC4295qm abstractC4295qm = (AbstractC4295qm) obj;
                    if (Intrinsics.areEqual(abstractC4295qm, Hn.a) || (abstractC4295qm instanceof C4243om)) {
                        fm.b = 1;
                        if (flowCollector.emit(obj, fm) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        fm = new Fm(this, continuation);
        Object obj22 = fm.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fm.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
