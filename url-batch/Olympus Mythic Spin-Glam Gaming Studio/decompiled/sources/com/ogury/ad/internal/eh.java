package com.ogury.ad.internal;

import android.app.Application;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class eh implements dh {
    public final w0 a;

    public eh(w0 showNextAd) {
        Intrinsics.checkNotNullParameter(showNextAd, "showNextAd");
        this.a = showNextAd;
    }

    @Override // com.ogury.ad.internal.dh
    public final boolean a(Application application, List ads, String nextAdId) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(ads, "ads");
        Intrinsics.checkNotNullParameter(nextAdId, "nextAdId");
        b a = m8.a(ads, nextAdId);
        if (a == null) {
            return false;
        }
        this.a.invoke(a, ads);
        return true;
    }
}
