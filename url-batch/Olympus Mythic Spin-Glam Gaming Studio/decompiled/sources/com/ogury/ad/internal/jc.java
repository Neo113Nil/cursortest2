package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes8.dex */
public final class jc implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public jc(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ic icVar;
        int i;
        if (continuation instanceof ic) {
            icVar = (ic) continuation;
            int i2 = icVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                icVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = icVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = icVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Long l = (Long) ((Preferences) obj).get(ke.j);
                    Long boxLong = Boxing.boxLong(l != null ? l.longValue() : 0L);
                    icVar.b = 1;
                    if (flowCollector.emit(boxLong, icVar) == coroutine_suspended) {
                        return coroutine_suspended;
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
        icVar = new ic(this, continuation);
        Object obj22 = icVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = icVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
