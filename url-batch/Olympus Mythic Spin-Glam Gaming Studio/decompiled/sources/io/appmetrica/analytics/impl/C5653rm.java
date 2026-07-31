package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.rm, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5653rm extends AbstractC5249c6 {
    public final Q3 b;

    public C5653rm(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), Ka.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC5249c6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5679sm load(@NonNull C5223b6 c5223b6) {
        C5679sm c5679sm = (C5679sm) super.load(c5223b6);
        C5783wm c5783wm = c5223b6.a;
        c5679sm.d = c5783wm.f;
        c5679sm.e = c5783wm.g;
        C5628qm c5628qm = (C5628qm) c5223b6.componentArguments;
        String str = c5628qm.a;
        if (str != null) {
            c5679sm.f = str;
            c5679sm.g = c5628qm.b;
        }
        Map<String, String> map = c5628qm.c;
        c5679sm.h = map;
        c5679sm.i = (I3) this.b.a(new I3(map, EnumC5483l8.d));
        C5628qm c5628qm2 = (C5628qm) c5223b6.componentArguments;
        c5679sm.k = c5628qm2.d;
        c5679sm.j = c5628qm2.e;
        C5783wm c5783wm2 = c5223b6.a;
        c5679sm.l = c5783wm2.p;
        c5679sm.m = c5783wm2.r;
        long j = c5783wm2.v;
        if (c5679sm.n == 0) {
            c5679sm.n = j;
        }
        return c5679sm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C5679sm();
    }

    public C5653rm(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull Q3 q3) {
        super(context, str, safePackageManager);
        this.b = q3;
    }

    @NonNull
    public final C5679sm a() {
        return new C5679sm();
    }
}
