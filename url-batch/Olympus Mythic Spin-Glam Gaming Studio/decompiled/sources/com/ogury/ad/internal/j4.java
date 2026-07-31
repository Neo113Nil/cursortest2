package com.ogury.ad.internal;

import android.content.Context;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class j4 implements ah {
    public static final j4 a = new j4();
    public static final u3 b = InterstitialActivity.e;

    @Override // com.ogury.ad.internal.ah
    public final void a(Context context, List ads) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ads, "ads");
        if (ads.isEmpty()) {
            return;
        }
        b.a(context, (b) ads.remove(0), ads);
    }
}
