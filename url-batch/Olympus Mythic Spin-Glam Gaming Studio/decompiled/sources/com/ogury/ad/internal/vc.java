package com.ogury.ad.internal;

import com.ogury.core.internal.datastore.preferences.core.Preferences;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class vc implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public vc(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        uc ucVar;
        int i;
        if (continuation instanceof uc) {
            ucVar = (uc) continuation;
            int i2 = ucVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ucVar.b = i2 - Integer.MIN_VALUE;
                Object obj2 = ucVar.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ucVar.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Preferences preferences = (Preferences) obj;
                    String str = (String) preferences.get(ke.m);
                    String str2 = null;
                    if (str == null || str.length() <= 0) {
                        str = null;
                    }
                    String str3 = (String) preferences.get(ke.n);
                    if (str3 != null && str3.length() > 0) {
                        str2 = str3;
                    }
                    Product product = new Product(str, str2);
                    ucVar.b = 1;
                    if (flowCollector.emit(product, ucVar) == coroutine_suspended) {
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
        ucVar = new uc(this, continuation);
        Object obj22 = ucVar.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ucVar.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
