package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class nc implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public nc(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        mc mcVar;
        int i;
        if (continuation instanceof mc) {
            mcVar = (mc) continuation;
            int i2 = mcVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mcVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = mcVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mcVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Integer num = (Integer) ((Preferences) obj).get(ke.i);
                    Integer boxInt = Boxing.boxInt(num != null ? num.intValue() : 0);
                    mcVar.b = 1;
                    if (flowCollector.emit(boxInt, mcVar) == coroutine_suspended) {
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
        mcVar = new mc(this, continuation);
        Object obj22 = mcVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mcVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
