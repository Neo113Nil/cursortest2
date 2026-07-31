package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.ae, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3865ae implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public C3865ae(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Zd zd;
        int i;
        if (continuation instanceof Zd) {
            zd = (Zd) continuation;
            int i2 = zd.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zd.b = i2 - Integer.MIN_VALUE;
                Object obj2 = zd.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zd.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    if (((AbstractC4295qm) obj) instanceof C4243om) {
                        zd.b = 1;
                        if (flowCollector.emit(obj, zd) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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
        zd = new Zd(this, continuation);
        Object obj22 = zd.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zd.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
