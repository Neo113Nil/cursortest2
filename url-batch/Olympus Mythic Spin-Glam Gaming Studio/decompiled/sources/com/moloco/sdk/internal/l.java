package com.moloco.sdk.internal;

import com.moloco.sdk.internal.ortb.model.DECAppIconSerializable;
import com.moloco.sdk.internal.ortb.model.DECAppNameSerializable;
import com.moloco.sdk.internal.ortb.model.DECBorderSerializable;
import com.moloco.sdk.internal.ortb.model.DECCtaSerializable;
import com.moloco.sdk.internal.ortb.model.DECRatingSerializable;
import com.moloco.sdk.internal.ortb.model.GradientColor;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5060i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5061j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5062k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5063l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C5067p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l {
    @NotNull
    public static final C5060i a(@NotNull com.moloco.sdk.internal.ortb.model.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        DECAppNameSerializable appName = lVar.getAppName();
        String e = appName != null ? appName.e() : null;
        String ctaUrl = lVar.getCtaUrl();
        String ctaTrackingUrl = lVar.getCtaTrackingUrl();
        String impressionTrackingUrl = lVar.getImpressionTrackingUrl();
        String skipToDecTrackingUrl = lVar.getSkipToDecTrackingUrl();
        DECAppNameSerializable appName2 = lVar.getAppName();
        Integer c = appName2 != null ? appName2.c() : null;
        DECCtaSerializable decCta = lVar.getDecCta();
        C5063l a = decCta != null ? a(decCta) : null;
        DECAppIconSerializable decAppIcon = lVar.getDecAppIcon();
        C5061j a2 = decAppIcon != null ? a(decAppIcon) : null;
        DECRatingSerializable decRating = lVar.getDecRating();
        return new C5060i(e, ctaUrl, ctaTrackingUrl, impressionTrackingUrl, skipToDecTrackingUrl, c, a, a2, decRating != null ? a(decRating) : null);
    }

    @NotNull
    public static final C5063l a(@NotNull DECCtaSerializable dECCtaSerializable) {
        Intrinsics.checkNotNullParameter(dECCtaSerializable, "<this>");
        Integer t = dECCtaSerializable.t();
        String n = dECCtaSerializable.n();
        Integer l = dECCtaSerializable.l();
        Integer p = dECCtaSerializable.p();
        DECBorderSerializable j = dECCtaSerializable.j();
        return new C5063l(t, n, l, p, j != null ? a(j) : null, dECCtaSerializable.r(), dECCtaSerializable.h());
    }

    @NotNull
    public static final C5061j a(@NotNull DECAppIconSerializable dECAppIconSerializable) {
        Intrinsics.checkNotNullParameter(dECAppIconSerializable, "<this>");
        Integer h = dECAppIconSerializable.h();
        String d = dECAppIconSerializable.d();
        DECBorderSerializable f = dECAppIconSerializable.f();
        return new C5061j(h, d, f != null ? a(f) : null);
    }

    @NotNull
    public static final C5067p a(@NotNull DECRatingSerializable dECRatingSerializable) {
        Intrinsics.checkNotNullParameter(dECRatingSerializable, "<this>");
        Float l = dECRatingSerializable.l();
        String j = dECRatingSerializable.j();
        if (j == null) {
            j = "#FFFFFF00";
        }
        String str = j;
        String f = dECRatingSerializable.f();
        if (f == null) {
            f = "#FF888888";
        }
        String str2 = f;
        Integer n = dECRatingSerializable.n();
        int intValue = n != null ? n.intValue() : 12;
        Integer h = dECRatingSerializable.h();
        return new C5067p(l, str, str2, intValue, h != null ? h.intValue() : 9);
    }

    @NotNull
    public static final C5062k a(@NotNull DECBorderSerializable dECBorderSerializable) {
        List list;
        Intrinsics.checkNotNullParameter(dECBorderSerializable, "<this>");
        List<GradientColor> f = dECBorderSerializable.f();
        if (f != null) {
            list = new ArrayList(CollectionsKt.collectionSizeOrDefault(f, 10));
            Iterator<T> it = f.iterator();
            while (it.hasNext()) {
                list.add(((GradientColor) it.next()).b());
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return new C5062k(dECBorderSerializable.d(), list);
    }
}
