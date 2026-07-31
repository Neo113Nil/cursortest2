package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes11.dex */
public final class Ln implements FlowCollector {
    public final /* synthetic */ On a;

    public Ln(CoroutineScope coroutineScope, On on) {
        this.a = on;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C4493y9 c4493y9 = this.a.c;
        if (c4493y9 != null) {
            c4493y9.a("VideoSurfaceViewabilityController", "Viewability " + booleanValue);
        }
        if (booleanValue) {
            InterfaceC4057hk interfaceC4057hk = this.a.h;
            if (interfaceC4057hk != null) {
                interfaceC4057hk.a();
            }
        } else {
            InterfaceC4057hk interfaceC4057hk2 = this.a.h;
            if (interfaceC4057hk2 != null) {
                interfaceC4057hk2.b();
            }
        }
        return Unit.INSTANCE;
    }
}
