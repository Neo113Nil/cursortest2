package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes11.dex */
public final class Kc extends C5532n5 {
    public final W6 w;

    public Kc(@NonNull Context context, @NonNull C5783wm c5783wm, @NonNull C5351g5 c5351g5, @NonNull F4 f4, @NonNull W6 w6, @NonNull AbstractC5480l5 abstractC5480l5) {
        this(context, c5351g5, f4, new C5501m0(), new TimePassedChecker(), new Mc(context, c5351g5, f4, abstractC5480l5, c5783wm, new Gc(w6), Ka.k().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ka.k().w(), Ka.k().l(), new Ac()), w6);
    }

    @Override // io.appmetrica.analytics.impl.C5532n5, io.appmetrica.analytics.impl.InterfaceC5460kb, io.appmetrica.analytics.impl.InterfaceC5280db
    public final synchronized void a(@NonNull F4 f4) {
        super.a(f4);
        this.w.a(f4.i);
    }

    @Override // io.appmetrica.analytics.impl.C5532n5, io.appmetrica.analytics.impl.InterfaceC5280db
    @NonNull
    public final CounterConfigurationReporterType b() {
        return CounterConfigurationReporterType.MAIN;
    }

    public Kc(Context context, C5351g5 c5351g5, F4 f4, C5501m0 c5501m0, TimePassedChecker timePassedChecker, Mc mc, W6 w6) {
        super(context, c5351g5, c5501m0, timePassedChecker, mc, f4);
        C5640r9 k = k();
        k.a(EnumC5798xb.EVENT_TYPE_REGULAR, new Qg(k.a()));
        this.w = w6;
        Ka.k().x().onMainReporterCreated(new Mk(this, f4));
    }
}
