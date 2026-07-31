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
/* loaded from: classes6.dex */
public final class c0 implements FlowCollector {
    public final /* synthetic */ FlowCollector a;
    public final /* synthetic */ String b;

    public c0(FlowCollector flowCollector, String str) {
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
        b0 b0Var;
        int i;
        if (continuation instanceof b0) {
            b0Var = (b0) continuation;
            int i2 = b0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.b = i2 - Integer.MIN_VALUE;
                Object obj2 = b0Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = b0Var.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Boolean bool = (Boolean) ((Preferences) obj).get(PreferencesKeys.booleanKey(this.b));
                    Boolean boxBoolean = Boxing.boxBoolean(bool != null ? bool.booleanValue() : false);
                    b0Var.b = 1;
                    if (flowCollector.emit(boxBoolean, b0Var) == coroutine_suspended) {
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
        b0Var = new b0(this, continuation);
        Object obj22 = b0Var.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = b0Var.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
