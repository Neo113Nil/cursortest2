package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5257ce {
    public final Function1 a;

    public C5257ce(C5386he c5386he) {
        this.a = c5386he;
    }

    public final C5283de a(Context context, C5234bh c5234bh) {
        return new C5283de(context, c5234bh, this.a, new InterfaceC5515me() { // from class: io.appmetrica.analytics.impl.ce$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.impl.InterfaceC5515me
            public final InterfaceC5730ul a(I0 i0) {
                return C5257ce.a(i0);
            }
        }, EnumC5798xb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, "actual", new G6());
    }

    public final C5283de b(Context context, C5234bh c5234bh) {
        return new C5283de(context, c5234bh, this.a, new InterfaceC5515me() { // from class: io.appmetrica.analytics.impl.ce$$ExternalSyntheticLambda1
            @Override // io.appmetrica.analytics.impl.InterfaceC5515me
            public final InterfaceC5730ul a(I0 i0) {
                return C5257ce.b(i0);
            }
        }, EnumC5798xb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, "prev session", new G6());
    }

    public static final InterfaceC5730ul a(I0 i0) {
        return new C5205ae(i0.f.d);
    }

    public static final InterfaceC5730ul b(I0 i0) {
        return new Z();
    }
}
