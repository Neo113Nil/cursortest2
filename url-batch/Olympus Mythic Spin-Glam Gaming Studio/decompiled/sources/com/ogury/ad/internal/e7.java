package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes10.dex */
public final class e7 implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public e7(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        d7 d7Var;
        int i;
        if (continuation instanceof d7) {
            d7Var = (d7) continuation;
            int i2 = d7Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d7Var.b = i2 - Integer.MIN_VALUE;
                Object obj2 = d7Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = d7Var.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    String str = (String) ((Preferences) obj).get(l7.d);
                    if (str == null) {
                        str = "";
                    }
                    d7Var.b = 1;
                    if (flowCollector.emit(str, d7Var) == coroutine_suspended) {
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
        d7Var = new d7(this, continuation);
        Object obj22 = d7Var.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = d7Var.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
