package com.ogury.ad.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.ad.interstitial.ui.InterstitialAndroid8RotableActivity;
import com.ogury.ad.interstitial.ui.InterstitialAndroid8TransparentActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class z2 implements z {
    public final x a;
    public final u3 b;
    public final y2 c;

    public z2(x adType) {
        u3 interstitialShowCommand = InterstitialActivity.e;
        y2 expandCacheStore = y2.a;
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(interstitialShowCommand, "interstitialShowCommand");
        Intrinsics.checkNotNullParameter(expandCacheStore, "expandCacheStore");
        this.a = adType;
        this.b = interstitialShowCommand;
        this.c = expandCacheStore;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "io.presage");
        p0.startActivity(p1);
    }

    @Override // com.ogury.ad.internal.z
    public final void a(g adLayout, t6 adController) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        ViewParent parent = adLayout.getParent();
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout == null) {
            return;
        }
        ViewGroup parentAsViewGroup = adLayout.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(adLayout);
        }
        adController.a(3);
        adController.d();
        adLayout.setupDrag(false);
        if (this.a.a()) {
            adLayout.setLeft(0);
            adLayout.setTop(0);
        }
        y2 y2Var = this.c;
        x2 item = new x2(this.a, frameLayout, adLayout, adController);
        y2Var.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        String expandCacheItemId = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(expandCacheItemId, "toString(...)");
        y2.b.put(expandCacheItemId, item);
        b ad = adController.t;
        if (ad == null) {
            return;
        }
        u3 u3Var = this.b;
        Application context = adController.a;
        List notDisplayedAds = adController.u;
        u3Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(expandCacheItemId, "expandCacheItemId");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(notDisplayedAds, "notDisplayedAds");
        Intent intent = new Intent(context, (Class<?>) (Build.VERSION.SDK_INT != 26 ? InterstitialActivity.class : ad.o ? InterstitialAndroid8TransparentActivity.class : InterstitialAndroid8RotableActivity.class));
        intent.putExtra("ad", ad);
        intent.putExtra("not_displayed_ads", new ArrayList(notDisplayedAds));
        intent.addFlags(268435456);
        intent.putExtra(X3.a.t, 1);
        intent.putExtra("expand_cache_item_id", expandCacheItemId);
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }
}
