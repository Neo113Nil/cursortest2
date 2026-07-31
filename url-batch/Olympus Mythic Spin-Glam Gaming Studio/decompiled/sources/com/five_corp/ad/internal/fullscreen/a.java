package com.five_corp.ad.internal.fullscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.five_corp.ad.AdActivity;
import com.five_corp.ad.f;
import com.five_corp.ad.internal.l;
import com.five_corp.ad.internal.m;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes10.dex */
public final class a {
    public final Handler a = new Handler(Looper.getMainLooper());
    public f b = null;

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.five_corp.ad");
        p0.startActivity(p1);
    }

    public final void a() {
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(0, new l(m.R6, null, null));
            this.b = null;
        }
    }

    public final void a(Context context, f fVar) {
        if (this.b != null) {
            fVar.a(0, new l(m.Q6, null, null));
            return;
        }
        this.b = fVar;
        this.a.postDelayed(new Runnable() { // from class: com.five_corp.ad.internal.fullscreen.a$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a();
            }
        }, 1000L);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, new Intent(context, (Class<?>) AdActivity.class).setFlags(268435456));
        } catch (Exception e) {
            fVar.a(0, new l(m.S6, null, e));
            this.b = null;
        }
    }
}
