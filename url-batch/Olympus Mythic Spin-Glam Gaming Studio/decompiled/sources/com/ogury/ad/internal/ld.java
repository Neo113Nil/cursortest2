package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class ld implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public ld(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        kd kdVar;
        int i;
        if (continuation instanceof kd) {
            kdVar = (kd) continuation;
            int i2 = kdVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kdVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = kdVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kdVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Boolean boxBoolean = Boxing.boxBoolean(((Preferences) obj).contains(ke.h));
                    kdVar.b = 1;
                    if (flowCollector.emit(boxBoolean, kdVar) == coroutine_suspended) {
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
        kdVar = new kd(this, continuation);
        Object obj22 = kdVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kdVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
