package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5469kk extends C5532n5 {
    public C5469kk(@NonNull Context context, @NonNull C5783wm c5783wm, @NonNull C5351g5 c5351g5, @NonNull F4 f4, @NonNull InterfaceC5726uh interfaceC5726uh, @NonNull AbstractC5480l5 abstractC5480l5, @NonNull C5325f5 c5325f5) {
        this(context, c5351g5, new C5501m0(), new TimePassedChecker(), new C5662s5(context, c5351g5, f4, abstractC5480l5, c5783wm, interfaceC5726uh, Ka.k().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ka.k().l(), c5325f5), f4);
    }

    @Override // io.appmetrica.analytics.impl.C5532n5, io.appmetrica.analytics.impl.InterfaceC5280db
    @NonNull
    public final CounterConfigurationReporterType b() {
        return CounterConfigurationReporterType.SELF_SDK;
    }

    public C5469kk(Context context, C5351g5 c5351g5, C5501m0 c5501m0, TimePassedChecker timePassedChecker, C5662s5 c5662s5, F4 f4) {
        super(context, c5351g5, c5501m0, timePassedChecker, c5662s5, f4);
    }
}
