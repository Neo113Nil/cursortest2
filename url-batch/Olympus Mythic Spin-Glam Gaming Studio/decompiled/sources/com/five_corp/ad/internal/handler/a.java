package com.five_corp.ad.internal.handler;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.five_corp.ad.internal.ad.g;
import com.five_corp.ad.internal.hub.ad_instance.e;
import com.five_corp.ad.internal.q;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final q b;
    public final g c;
    public final e d;

    public a(Context context, q qVar, g gVar, e eVar) {
        this.a = context;
        this.b = qVar;
        this.c = gVar;
        this.d = eVar;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.five_corp.ad");
        p0.startActivity(p1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1 != 4) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, double d) {
        this.b.d();
        int a = com.five_corp.ad.e.a(this.c.a);
        if (a != 0 && a != 1) {
            if (a != 2) {
                if (a != 3) {
                }
            }
            this.b.a(3, i, d, null, null);
            this.b.c();
        }
        if (this.c.b != null) {
            long j = i;
            this.b.a(3, j, d, null, null);
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.c.b));
                intent.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
            } catch (ActivityNotFoundException e) {
                if (this.c.c == null) {
                    throw e;
                }
                this.b.a(21, j, d, null, null);
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(this.c.c));
                intent2.setFlags(268435456);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent2);
            }
        } else {
            this.d.a(com.five_corp.ad.internal.logger.b.a("missing redirect URL"));
        }
        this.b.c();
    }
}
