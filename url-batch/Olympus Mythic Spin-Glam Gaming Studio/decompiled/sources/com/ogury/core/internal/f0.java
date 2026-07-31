package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class f0 implements FlowCollector {
    public final /* synthetic */ FlowCollector a;
    public final /* synthetic */ String b;

    public f0(FlowCollector flowCollector, String str) {
        this.a = flowCollector;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        e0 e0Var;
        int i;
        if (continuation instanceof e0) {
            e0Var = (e0) continuation;
            int i2 = e0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e0Var.b = i2 - Integer.MIN_VALUE;
                Object obj2 = e0Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = e0Var.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Integer num = (Integer) ((Preferences) obj).get(PreferencesKeys.intKey(this.b));
                    Integer boxInt = Boxing.boxInt(num != null ? num.intValue() : -1);
                    e0Var.b = 1;
                    if (flowCollector.emit(boxInt, e0Var) == coroutine_suspended) {
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
        e0Var = new e0(this, continuation);
        Object obj22 = e0Var.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = e0Var.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
