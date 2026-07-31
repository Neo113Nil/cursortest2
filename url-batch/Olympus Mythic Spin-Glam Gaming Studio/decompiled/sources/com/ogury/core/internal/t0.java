package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class t0 implements FlowCollector {
    public final /* synthetic */ FlowCollector a;
    public final /* synthetic */ z0 b;

    public t0(FlowCollector flowCollector, z0 z0Var) {
        this.a = flowCollector;
        this.b = z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        s0 s0Var;
        int i;
        if (continuation instanceof s0) {
            s0Var = (s0) continuation;
            int i2 = s0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0Var.b = i2 - Integer.MIN_VALUE;
                Object obj2 = s0Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = s0Var.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Boolean bool = (Boolean) ((Preferences) obj).get(this.b.d);
                    Boolean boxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                    s0Var.b = 1;
                    if (flowCollector.emit(boxBoolean, s0Var) == coroutine_suspended) {
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
        s0Var = new s0(this, continuation);
        Object obj22 = s0Var.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = s0Var.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
