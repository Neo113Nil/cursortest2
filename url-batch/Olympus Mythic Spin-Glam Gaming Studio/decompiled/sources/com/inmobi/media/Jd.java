package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes12.dex */
public final class Jd implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public Jd(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Id id;
        int i;
        if (continuation instanceof Id) {
            id = (Id) continuation;
            int i2 = id.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                id.b = i2 - Integer.MIN_VALUE;
                Object obj2 = id.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = id.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    if (((AbstractC4233oc) obj) instanceof AbstractC4295qm) {
                        id.b = 1;
                        if (flowCollector.emit(obj, id) == coroutine_suspended) {
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
        id = new Id(this, continuation);
        Object obj22 = id.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = id.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
