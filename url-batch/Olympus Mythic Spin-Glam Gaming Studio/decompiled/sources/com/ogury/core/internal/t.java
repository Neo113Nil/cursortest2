package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class t implements FlowCollector {
    public final /* synthetic */ FlowCollector a;
    public final /* synthetic */ Preferences.Key b;

    public t(FlowCollector flowCollector, Preferences.Key key) {
        this.a = flowCollector;
        this.b = key;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        s sVar;
        int i;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i2 = sVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = sVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Object obj3 = ((Preferences) obj).get(this.b);
                    sVar.b = 1;
                    if (flowCollector.emit(obj3, sVar) == coroutine_suspended) {
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
        sVar = new s(this, continuation);
        Object obj22 = sVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
