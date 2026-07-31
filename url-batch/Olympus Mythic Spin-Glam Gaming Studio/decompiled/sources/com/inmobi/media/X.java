package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes13.dex */
public final class X {
    public final C3903c0 a;
    public final C4167m0 b;

    public X(C3903c0 adLifecycleData, C4167m0 adManagerTelemetryHelper) {
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(adManagerTelemetryHelper, "adManagerTelemetryHelper");
        this.a = adLifecycleData;
        this.b = adManagerTelemetryHelper;
    }

    public final void a(W adFetchEvent) {
        Intrinsics.checkNotNullParameter(adFetchEvent, "adFetchEvent");
        if (adFetchEvent instanceof C4363tb) {
            C3903c0 c3903c0 = this.a;
            c3903c0.getClass();
            c3903c0.b = SystemClock.elapsedRealtime();
        } else if (adFetchEvent instanceof Yf) {
            C3903c0 c3903c02 = this.a;
            c3903c02.getClass();
            c3903c02.f = SystemClock.elapsedRealtime();
        } else {
            if (!(adFetchEvent instanceof C4134kj)) {
                throw new NoWhenBranchMatchedException();
            }
            C4167m0 c4167m0 = this.b;
            Map payload = ((C4134kj) adFetchEvent).a;
            c4167m0.getClass();
            Intrinsics.checkNotNullParameter(payload, "payload");
            BuildersKt__Builders_commonKt.launch$default(c4167m0.a, null, null, new C4115k0(c4167m0, payload, null), 3, null);
        }
    }
}
