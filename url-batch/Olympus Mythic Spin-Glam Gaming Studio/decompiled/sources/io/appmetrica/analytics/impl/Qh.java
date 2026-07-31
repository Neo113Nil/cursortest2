package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes.dex */
public final class Qh extends C5532n5 {
    public final String w;
    public final W6 x;

    public Qh(@NonNull Context context, @NonNull C5351g5 c5351g5, @NonNull F4 f4, @NonNull W6 w6, @NonNull C5783wm c5783wm, @NonNull AbstractC5480l5 abstractC5480l5, @NonNull M9 m9) {
        this(context, c5351g5, new C5501m0(), new TimePassedChecker(), new C5662s5(context, c5351g5, f4, abstractC5480l5, c5783wm, new Lh(w6), Ka.k().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ka.k().l(), m9), w6, f4);
    }

    @Override // io.appmetrica.analytics.impl.C5532n5, io.appmetrica.analytics.impl.InterfaceC5460kb, io.appmetrica.analytics.impl.InterfaceC5280db
    public final synchronized void a(@NonNull F4 f4) {
        super.a(f4);
        this.x.a(this.w, f4.i);
    }

    public Qh(Context context, C5351g5 c5351g5, C5501m0 c5501m0, TimePassedChecker timePassedChecker, C5662s5 c5662s5, W6 w6, F4 f4) {
        super(context, c5351g5, c5501m0, timePassedChecker, c5662s5, f4);
        this.w = c5351g5.b();
        this.x = w6;
    }
}
