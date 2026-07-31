package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.tn, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4375tn implements FlowCollector {
    public final /* synthetic */ FlowCollector a;

    public C4375tn(FlowCollector flowCollector) {
        this.a = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        C4348sn c4348sn;
        int i;
        if (continuation instanceof C4348sn) {
            c4348sn = (C4348sn) continuation;
            int i2 = c4348sn.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4348sn.b = i2 - Integer.MIN_VALUE;
                Object obj2 = c4348sn.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4348sn.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    FlowCollector flowCollector = this.a;
                    Boolean boxBoolean = Boxing.boxBoolean(((EnumC4192mo) obj) == EnumC4192mo.b);
                    c4348sn.b = 1;
                    if (flowCollector.emit(boxBoolean, c4348sn) == coroutine_suspended) {
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
        c4348sn = new C4348sn(this, continuation);
        Object obj22 = c4348sn.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4348sn.b;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
