package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class zc implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public zc(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        yc ycVar;
        int i;
        if (continuation instanceof yc) {
            ycVar = (yc) continuation;
            int i2 = ycVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ycVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = ycVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ycVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    String str = (String) ((Preferences) obj).get(ke.g);
                    if (str == null) {
                        str = "";
                    }
                    ycVar.b = 1;
                    if (flowCollector.emit(str, ycVar) == coroutine_suspended) {
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
        ycVar = new yc(this, continuation);
        Object obj22 = ycVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ycVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
