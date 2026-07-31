package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5246c3 extends SafeRunnable {
    public final /* synthetic */ BatteryInfo a;
    public final /* synthetic */ C5272d3 b;

    public C5246c3(C5272d3 c5272d3, BatteryInfo batteryInfo) {
        this.b = c5272d3;
        this.a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5297e3 c5297e3 = this.b.a;
        ChargeType chargeType = this.a.chargeType;
        ChargeType chargeType2 = C5297e3.d;
        synchronized (c5297e3) {
            Iterator it = c5297e3.c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}
