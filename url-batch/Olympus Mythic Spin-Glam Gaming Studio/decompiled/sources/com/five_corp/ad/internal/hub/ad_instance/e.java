package com.five_corp.ad.internal.hub.ad_instance;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.five_corp.ad.FiveAdErrorCode;
import com.five_corp.ad.internal.q;
import com.five_corp.ad.internal.r;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class e {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList k = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList l = new CopyOnWriteArrayList();

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.five_corp.ad");
        p0.startActivity(p1);
    }

    public final void a(FiveAdErrorCode fiveAdErrorCode) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(fiveAdErrorCode);
        }
    }

    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.f fVar = (com.five_corp.ad.f) ((f) it.next());
            com.five_corp.ad.internal.context.f fVar2 = com.five_corp.ad.internal.context.f.INTERSTITIAL;
            com.five_corp.ad.internal.context.f fVar3 = fVar.l.e;
            if (fVar2 == fVar3 || com.five_corp.ad.internal.context.f.VIDEO_REWARD == fVar3) {
                fVar.h();
            } else {
                int currentPositionMs = fVar.h.getCurrentPositionMs();
                fVar.a(currentPositionMs);
                fVar.o.o(currentPositionMs, fVar.u);
            }
        }
    }

    public final void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.f fVar = (com.five_corp.ad.f) ((i) it.next());
            q qVar = fVar.o;
            long currentPositionMs = fVar.h.getCurrentPositionMs();
            double d = fVar.u;
            qVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("to", str);
            qVar.a(15, currentPositionMs, d, null, hashMap);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(fVar.a, intent);
        }
    }

    public final void a(com.five_corp.ad.internal.logger.b bVar) {
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.a aVar = (com.five_corp.ad.internal.a) it.next();
            aVar.b.a(new com.five_corp.ad.internal.logger.b(bVar.a, aVar.c, aVar.d, bVar.e));
        }
    }
}
