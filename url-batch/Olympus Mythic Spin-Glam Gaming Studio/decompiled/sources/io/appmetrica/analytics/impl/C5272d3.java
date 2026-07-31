package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5272d3 implements Consumer {
    public final /* synthetic */ C5297e3 a;

    public C5272d3(C5297e3 c5297e3) {
        this.a = c5297e3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.a.b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.a.getClass();
        BatteryInfo a = C5297e3.a(intent);
        this.a.b = a;
        if (chargeType != a.chargeType) {
            this.a.a.execute(new C5246c3(this, a));
        }
    }
}
