package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class xb implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public xb(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        wb wbVar;
        int i;
        if (continuation instanceof wb) {
            wbVar = (wb) continuation;
            int i2 = wbVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wbVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = wbVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = wbVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    String str = (String) ((Preferences) obj).get(ke.l);
                    if (str == null) {
                        str = "";
                    }
                    wbVar.b = 1;
                    if (flowCollector.emit(str, wbVar) == coroutine_suspended) {
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
        wbVar = new wb(this, continuation);
        Object obj22 = wbVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = wbVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
