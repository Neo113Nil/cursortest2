package com.ironsource;

import com.ironsource.C4902u;
import com.ironsource.Gd;
import com.ironsource.InterfaceC4949w6;
import com.ironsource.T2;
import com.ironsource.Ua;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes10.dex */
public final class Va extends C4810oe {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Va(@NotNull C4810oe sdkConfig) {
        super(sdkConfig);
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
    }

    public final boolean a(@NotNull String adUnitId, @NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Gd.b> a2;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Gd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || !a2.containsKey(adUnitId)) ? false : true;
    }

    @NotNull
    public final InterfaceC4949w6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return new InterfaceC4949w6.a(a(adFormat, adUnitId));
    }

    @Nullable
    public final C4684hd c(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        C4684hd a2;
        I9 a3;
        String str2;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        int i = a.a[adFormat.ordinal()];
        if (i == 1) {
            C4649fe f = d().c().f();
            if (f == null || (a2 = f.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(a2, "getRewardedVideoPlacement(placementName)");
            return new C4684hd(a2.b(), a2.c(), a2.d(), a2.f(), a2.e(), a2.a());
        }
        if (i == 2) {
            E9 d = d().c().d();
            if (d == null || (a3 = d.a(str)) == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(a3, "getInterstitialPlacement(placementName)");
            return new C4684hd(a3);
        }
        if (i == 3) {
            U2 c = d().c().c();
            if (c == null) {
                throw new IllegalStateException("Error getting " + adFormat + " configurations");
            }
            C4620e3 a4 = c.a(str);
            if (a4 == null) {
                a4 = c.i();
                str2 = "config.defaultBannerPlacement";
            } else {
                str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
            }
            Intrinsics.checkNotNullExpressionValue(a4, str2);
            return new C4684hd(a4);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        Rb e = d().c().e();
        if (e != null && str != null) {
            C4593cc a5 = e.a(str);
            if (a5 == null) {
                a5 = e.e();
            }
            if (a5 != null) {
                return new C4684hd(a5);
            }
        }
        throw new IllegalStateException("Error getting " + adFormat + " configurations");
    }

    @NotNull
    public final List<C5009zc> d(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Gd.b> a2;
        Set<String> keySet;
        List<C5009zc> distinct;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Gd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (keySet = a2.keySet()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List flatten = CollectionsKt.flatten(arrayList);
            if (flatten != null && (distinct = CollectionsKt.distinct(flatten)) != null) {
                return distinct;
            }
        }
        return CollectionsKt.emptyList();
    }

    @Nullable
    public final String j() {
        return h().a().b().c().a();
    }

    @NotNull
    public final List<LevelPlayAdSize> k() {
        List<String> a2 = h().a().c().b().a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float l() {
        return h().a().c().b().b();
    }

    public final boolean m() {
        com.ironsource.mediationsdk.adquality.a a2 = d().c().a();
        return a2 != null && a2.b();
    }

    public final boolean n() {
        return h().a().b().e();
    }

    @NotNull
    public final C4737kd b(@NotNull C4936vb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C4737kd(tools, h().a().a());
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        C4902u.d b;
        Long d;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        C4902u c4902u = h().a().a().get(adFormat);
        long longValue = (c4902u == null || (b = c4902u.b()) == null || (d = b.d()) == null) ? 60L : d.longValue();
        return longValue > 0 ? TimeUnit.MINUTES.toMillis(longValue) : longValue;
    }

    @NotNull
    public final Ua.a a(@NotNull String adUnitId) {
        long d;
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        T2 c = h().a().c();
        T2.b bVar = c.a().get(adUnitId);
        int c2 = bVar != null ? bVar.c() : c.b().c();
        boolean e = bVar != null ? bVar.e() : c.b().e();
        if (bVar != null) {
            d = bVar.d();
        } else {
            d = c.b().d();
        }
        return new Ua.a(e, c2, d);
    }

    @NotNull
    public final List<String> a(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Gd.b> a2;
        Set<String> keySet;
        List<String> list;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Gd.a aVar = h().d().a().get(adFormat);
        return (aVar == null || (a2 = aVar.a()) == null || (keySet = a2.keySet()) == null || (list = CollectionsKt.toList(keySet)) == null) ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public final C4925v0 a(@NotNull C4936vb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        return new C4925v0(tools, h().a().a());
    }

    private final InterfaceC4949w6.c a(LevelPlay.AdFormat adFormat, String str) {
        C4902u.d b;
        Bd g;
        Map<String, C4902u.d> a2;
        C4902u.d dVar;
        Bd g2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C4902u c4902u = h().a().a().get(adFormat);
        InterfaceC4949w6.c cVar = null;
        InterfaceC4949w6.c a3 = (c4902u == null || (a2 = c4902u.a()) == null || (dVar = a2.get(str)) == null || (g2 = dVar.g()) == null) ? null : g2.a();
        if (c4902u != null && (b = c4902u.b()) != null && (g = b.g()) != null) {
            cVar = g.a();
        }
        if (a3 == null) {
            a3 = cVar;
        }
        if (a3 != null) {
            return a3;
        }
        if (z) {
            return InterfaceC4949w6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC4949w6.c.SINGLE;
    }

    @NotNull
    public final Td c(@NotNull C4936vb tools) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        C4902u c4902u = h().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Td(tools, c4902u != null ? c4902u.a() : null, c4902u != null ? c4902u.c() : null);
    }

    @NotNull
    public final List<Gd.c> c(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return h().d().a(adFormat);
    }

    @NotNull
    public final List<C5009zc> d(@NotNull LevelPlay.AdFormat adFormat, @NotNull String adUnitId) {
        Map<String, Gd.b> a2;
        Gd.b bVar;
        List<String> a3;
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Gd.a aVar = h().d().a().get(adFormat);
        if (aVar != null && (a2 = aVar.a()) != null && (bVar = a2.get(adUnitId)) != null && (a3 = bVar.a()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a3.iterator();
            while (it.hasNext()) {
                C5009zc c5009zc = h().e().a().get((String) it.next());
                if (c5009zc != null) {
                    arrayList.add(c5009zc);
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }
}
