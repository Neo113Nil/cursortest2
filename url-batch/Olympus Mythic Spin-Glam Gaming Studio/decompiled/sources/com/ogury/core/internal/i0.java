package com.ogury.core.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import com.ogury.core.internal.datastore.preferences.core.PreferencesKeys;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes5.dex */
public final class i0 implements FlowCollector {
    public final /* synthetic */ FlowCollector a;
    public final /* synthetic */ String b;

    public i0(FlowCollector flowCollector, String str) {
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
        h0 h0Var;
        int i;
        if (continuation instanceof h0) {
            h0Var = (h0) continuation;
            int i2 = h0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h0Var.b = i2 - Integer.MIN_VALUE;
                Object obj2 = h0Var.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h0Var.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Object obj3 = ((Preferences) obj).get(PreferencesKeys.stringKey(this.b));
                    h0Var.b = 1;
                    if (flowCollector.emit(obj3, h0Var) == coroutine_suspended) {
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
        h0Var = new h0(this, continuation);
        Object obj22 = h0Var.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h0Var.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
