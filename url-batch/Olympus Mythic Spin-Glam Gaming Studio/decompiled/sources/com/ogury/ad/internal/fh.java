package com.ogury.ad.internal;

import android.app.Application;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class fh implements dh {
    public final u3 a;

    public fh() {
        u3 interstitialStartCommand = InterstitialActivity.e;
        Intrinsics.checkNotNullParameter(interstitialStartCommand, "interstitialStartCommand");
        this.a = interstitialStartCommand;
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
        this.a.a(application, a, ads);
        return true;
    }
}
