package com.ogury.ad.internal;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ya {
    public final rf a;
    public final sf b;
    public final le c;

    public ya(rf publisherActivityFilter, sf publisherFragmentFilter, kh supportLibraryChecker, le profigGateway) {
        Intrinsics.checkNotNullParameter(publisherActivityFilter, "publisherActivityFilter");
        Intrinsics.checkNotNullParameter(publisherFragmentFilter, "publisherFragmentFilter");
        Intrinsics.checkNotNullParameter(supportLibraryChecker, "supportLibraryChecker");
        Intrinsics.checkNotNullParameter(profigGateway, "profigGateway");
        this.a = publisherActivityFilter;
        this.b = publisherFragmentFilter;
        this.c = profigGateway;
    }

    public final xa a(Activity activity, g adLayout, t6 adController) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        ia iaVar = new ia(adLayout, adController);
        this.c.getClass();
        kf overlayActivityConfig = le.b.d.g.c;
        this.c.getClass();
        lf fragmentOverlayConfig = le.b.d.g.b;
        rf publisherActivityFilter = this.a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(publisherActivityFilter, "publisherActivityFilter");
        Intrinsics.checkNotNullParameter(overlayActivityConfig, "overlayActivityConfig");
        aa aaVar = new aa(overlayActivityConfig, activity.getClass());
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (overlayActivityConfig.a) {
            aaVar.c.add(gb.a(activity));
        }
        List list = publisherActivityFilter.a;
        Intrinsics.checkNotNullParameter(list, "list");
        if (overlayActivityConfig.b) {
            aaVar.c.addAll(list);
        }
        List<Class> activities = publisherActivityFilter.b;
        Intrinsics.checkNotNullParameter(activities, "activities");
        if (overlayActivityConfig.c) {
            for (Class cls : activities) {
                ArrayList arrayList = aaVar.d;
                String canonicalName = cls.getCanonicalName();
                Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
                arrayList.add(canonicalName);
            }
        }
        sf publisherFragmentFilter = this.b;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentOverlayConfig, "fragmentOverlayConfig");
        Intrinsics.checkNotNullParameter(publisherFragmentFilter, "publisherFragmentFilter");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(fragmentOverlayConfig.d);
        if (fragmentOverlayConfig.b) {
            arrayList2.addAll(publisherFragmentFilter.a);
        }
        if (fragmentOverlayConfig.a) {
            arrayList2.add(gb.a(activity));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(fragmentOverlayConfig.e);
        if (fragmentOverlayConfig.c) {
            for (Class cls2 : publisherFragmentFilter.b) {
                String canonicalName2 = cls2.getCanonicalName();
                if (canonicalName2 == null) {
                    canonicalName2 = cls2.getName();
                }
                Intrinsics.checkNotNull(canonicalName2);
                arrayList3.add(canonicalName2);
            }
        }
        k3 k3Var = new k3(arrayList2, arrayList3);
        sf sfVar = this.b;
        if ((sfVar.a.isEmpty() && sfVar.b.isEmpty()) || !fragmentOverlayConfig.f) {
            return new ca(activity, iaVar, aaVar);
        }
        try {
            int i = Fragment.$r8$clinit;
            return new wa(activity, iaVar, new ta(k3Var), sh.a);
        } catch (Exception unused) {
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, "Fragment filter defined for thumbnail but no fragment dependency found. Only AndroidX is supported");
            return new ca(activity, iaVar, aaVar);
        }
    }
}
