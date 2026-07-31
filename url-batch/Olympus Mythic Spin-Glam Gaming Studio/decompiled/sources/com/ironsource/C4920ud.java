package com.ironsource;

import com.ironsource.F0;
import com.ironsource.Gd;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ironsource.ud, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4920ud implements InterfaceC4938vd {

    @NotNull
    private final LevelPlay.AdFormat a;

    /* renamed from: com.ironsource.ud$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public C4920ud(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = adFormat;
    }

    private final C4880sd a(Gd.c cVar, int i, Va va) {
        String c = cVar.c();
        if (c == null) {
            IronLog.INTERNAL.warning("invalid adUnitId");
            return null;
        }
        List<String> d = cVar.d();
        if (d == null) {
            IronLog.INTERNAL.warning("invalid instances");
            return null;
        }
        C4671h0 c4671h0 = new C4671h0(com.unity3d.mediation.a.a(this.a), C4950w7.a.a(), c, null, null, null, 56, null);
        AbstractC4961x0 a2 = a(c4671h0, va);
        if (a2 == null) {
            IronLog.INTERNAL.warning("adunit data is null");
            return null;
        }
        IronSource.a a3 = com.unity3d.mediation.a.a(this.a);
        F0.b bVar = F0.b.MEDIATION;
        V0 v0 = new V0(new C4814p0(a3, bVar), a2, bVar);
        v0.f().a(new D0(v0, c4671h0, null, 4, null));
        return new C4880sd(c, d, i, new C4992yd(v0, a2, null, 4, null), v0);
    }

    private final AbstractC4961x0 a(C4671h0 c4671h0, Va va) {
        try {
            int i = a.a[this.a.ordinal()];
            if (i == 1) {
                return C9.z.a(c4671h0, va, false);
            }
            if (i == 2) {
                return C4613de.z.a(c4671h0, va, false);
            }
            throw new IllegalArgumentException("Unsupported ad format for preload: " + this.a);
        } catch (Exception e) {
            IronLog.INTERNAL.error("Failed to create AdUnitData for ad format " + this.a + ": " + e.getMessage() + "\n" + ExceptionsKt.stackTraceToString(e));
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC4938vd
    @NotNull
    public List<InterfaceC4898td> a(@NotNull List<Gd.c> config, int i, @NotNull Va levelPlayConfig) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(levelPlayConfig, "levelPlayConfig");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = config.iterator();
        while (it.hasNext()) {
            C4880sd a2 = a((Gd.c) it.next(), i, levelPlayConfig);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
