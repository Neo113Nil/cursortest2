package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes9.dex */
public final class dd implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public dd(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        cd cdVar;
        int i;
        if (continuation instanceof cd) {
            cdVar = (cd) continuation;
            int i2 = cdVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cdVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = cdVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cdVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    String str = (String) ((Preferences) obj).get(ke.k);
                    if (str == null) {
                        str = "5.2.2-404010";
                    }
                    cdVar.b = 1;
                    if (flowCollector.emit(str, cdVar) == coroutine_suspended) {
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
        cdVar = new cd(this, continuation);
        Object obj22 = cdVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cdVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
