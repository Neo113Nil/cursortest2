package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4186mi implements Ya {
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi a;
    public final /* synthetic */ Context b;

    public C4186mi(GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, Context context) {
        this.a = gestureDetectorOnGestureListenerC4476xi;
        this.b = context;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivity(p1);
    }

    @Override // com.inmobi.media.Ya
    public final void a() {
        this.a.getListener().a();
    }

    @Override // com.inmobi.media.Ya
    public final void b(String str, String str2, String str3) {
        this.a.b(str, str2, str3);
    }

    @Override // com.inmobi.media.Ya
    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.a.a(str, message, str2);
    }

    @Override // com.inmobi.media.Ya
    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        intent.putExtra("creativeId", this.a.getCreativeId());
        intent.putExtra("impressionId", this.a.getImpressionId());
        intent.putExtra("placementId", this.a.getPlacementId());
        intent.putExtra("isImmersive", this.a.X0);
        SparseArray sparseArray = InMobiAdActivity.t;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        InMobiAdActivity.u = gestureDetectorOnGestureListenerC4476xi;
        if (gestureDetectorOnGestureListenerC4476xi.getPlacementType() == 0) {
            Context context = AbstractC4002fj.a;
            Activity context2 = this.a.getBannerHolderActivity().get();
            if (context2 == null) {
                context2 = this.b;
            }
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!(context2 instanceof Activity)) {
                intent.setFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context2, intent);
            return;
        }
        intent.putExtra("supportBrowserLoader", true);
        Context context3 = AbstractC4002fj.a;
        Context context4 = this.a.getContainerContext();
        Intrinsics.checkNotNullParameter(context4, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context4 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context4, intent);
    }

    @Override // com.inmobi.media.Ya
    public final void a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.a;
        if (gestureDetectorOnGestureListenerC4476xi.e) {
            return;
        }
        gestureDetectorOnGestureListenerC4476xi.b(trackerName, macros);
    }
}
