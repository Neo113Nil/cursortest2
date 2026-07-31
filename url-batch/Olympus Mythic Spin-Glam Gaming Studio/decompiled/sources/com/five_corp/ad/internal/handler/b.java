package com.five_corp.ad.internal.handler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.util.Patterns;
import androidx.browser.customtabs.CustomTabsIntent;
import com.five_corp.ad.AdReportDialogActivity;
import com.five_corp.ad.internal.ad.information_icon.c;
import com.five_corp.ad.internal.ad.information_icon.e;
import com.five_corp.ad.internal.context.f;
import com.five_corp.ad.internal.hub.ad_instance.d;
import com.five_corp.ad.internal.view.C3843c;
import com.five_corp.ad.internal.view.C3845e;
import com.five_corp.ad.internal.view.G;
import com.five_corp.ad.internal.view.H;
import com.five_corp.ad.internal.view.InterfaceC3841a;
import com.five_corp.ad.internal.view.InterfaceC3842b;
import com.five_corp.ad.internal.view.l;
import com.five_corp.ad.internal.y;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class b {
    public final Context a;
    public final f b;
    public final e c;
    public final String d;
    public final y e;
    public final com.five_corp.ad.internal.hub.ad_instance.e f;

    public b(Context context, f fVar, e eVar, String str, y yVar, com.five_corp.ad.internal.hub.ad_instance.e eVar2) {
        this.a = context;
        this.b = fVar;
        this.c = eVar;
        this.d = str;
        this.e = yVar;
        this.f = eVar2;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.five_corp.ad");
        p0.startActivity(p1);
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, "com.five_corp.ad");
        p0.launchUrl(p1, p2);
    }

    public final Runnable a(final AdReportDialogActivity adReportDialogActivity, final G g, final c cVar, final String str) {
        int a = com.five_corp.ad.e.a(cVar.b);
        if (a == 0) {
            return new Runnable() { // from class: com.five_corp.ad.internal.handler.b$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(g);
                }
            };
        }
        if (a == 1) {
            return new Runnable() { // from class: com.five_corp.ad.internal.handler.b$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(adReportDialogActivity, g, str);
                }
            };
        }
        if (a == 2) {
            return new Runnable() { // from class: com.five_corp.ad.internal.handler.b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(cVar, g);
                }
            };
        }
        throw new RuntimeException();
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(List list, String str, AdReportDialogActivity adReportDialogActivity) {
        final G g = new G(adReportDialogActivity);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            arrayList.add(new Pair(cVar.a, a(adReportDialogActivity, g, cVar, str)));
        }
        final y yVar = this.e;
        Objects.requireNonNull(yVar);
        g.a(new C3843c(adReportDialogActivity, arrayList, new InterfaceC3841a() { // from class: com.five_corp.ad.internal.handler.b$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.view.InterfaceC3841a
            public final int a(int i) {
                return y.this.a(i);
            }
        }, new InterfaceC3842b() { // from class: com.five_corp.ad.internal.handler.b$$ExternalSyntheticLambda1
            @Override // com.five_corp.ad.internal.view.InterfaceC3842b
            public final void a() {
                G.this.a();
            }
        }));
    }

    public final void a(G g) {
        String str = this.d;
        if (str != null) {
            this.f.a(str);
        }
        g.a();
    }

    public final void a(Activity activity, G g, String str) {
        Objects.requireNonNull(this.c, "informationIconConfig cannot be null");
        if (str != null && Patterns.WEB_URL.matcher(str).matches()) {
            safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(new CustomTabsIntent.Builder().build(), activity, Uri.parse(str));
        }
        C3845e c3845e = this.c.b.a != null ? new C3845e(this.a, this.c.b.a) : null;
        Iterator it = this.f.e.iterator();
        while (it.hasNext()) {
            com.five_corp.ad.f fVar = (com.five_corp.ad.f) ((d) it.next());
            l lVar = fVar.c;
            if (lVar != null) {
                H.a(lVar.b.a);
                if (c3845e != null) {
                    lVar.addView(c3845e);
                }
            } else if (fVar.w != null) {
                int currentPositionMs = fVar.h.getCurrentPositionMs();
                fVar.a(currentPositionMs);
                com.five_corp.ad.internal.fullscreen.c cVar = fVar.w;
                if (!cVar.m.getAndSet(true)) {
                    cVar.g.removeAllViews();
                    cVar.k = null;
                    cVar.l = null;
                    cVar.a.finish();
                }
                fVar.w = null;
                fVar.o.k(currentPositionMs, fVar.u);
            }
        }
        g.a();
    }

    public final void a(c cVar, G g) {
        String str = cVar.c;
        if (str != null) {
            this.f.a(str);
        }
        g.a();
    }

    public final void a() {
        String str = this.d;
        if (str == null) {
            return;
        }
        this.f.a(str);
    }

    public final void a(final String str) {
        Objects.requireNonNull(this.c, "informationIconConfig cannot be null");
        final ArrayList arrayList = this.c.a.b;
        Objects.requireNonNull(arrayList, "Parser validates, so choiceConfigList cannot be null");
        Context context = this.a;
        f fVar = f.INTERSTITIAL;
        f fVar2 = this.b;
        boolean z = fVar == fVar2 || f.VIDEO_REWARD == fVar2;
        com.five_corp.ad.internal.ad_report.c cVar = new com.five_corp.ad.internal.ad_report.c() { // from class: com.five_corp.ad.internal.handler.b$$ExternalSyntheticLambda5
            @Override // com.five_corp.ad.internal.ad_report.c
            public final void a(AdReportDialogActivity adReportDialogActivity) {
                b.this.a(arrayList, str, adReportDialogActivity);
            }
        };
        com.five_corp.ad.internal.ad_report.b bVar = new com.five_corp.ad.internal.ad_report.b() { // from class: com.five_corp.ad.internal.handler.b$$ExternalSyntheticLambda6
            @Override // com.five_corp.ad.internal.ad_report.b
            public final void a() {
                b.this.a();
            }
        };
        if (com.five_corp.ad.internal.ad_report.d.a == null) {
            com.five_corp.ad.internal.ad_report.d.a = new com.five_corp.ad.internal.ad_report.a();
        }
        com.five_corp.ad.internal.ad_report.a aVar = com.five_corp.ad.internal.ad_report.d.a;
        if (aVar.b != null) {
            return;
        }
        aVar.a = cVar;
        aVar.b = bVar;
        try {
            Intent intent = new Intent(context, (Class<?>) AdReportDialogActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(65536);
            intent.putExtra(AdReportDialogActivity.EXTRA_IS_FULLSCREEN, z);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            if (Build.VERSION.SDK_INT >= 34 || !(context instanceof Activity)) {
                return;
            }
            ((Activity) context).overridePendingTransition(0, 0);
        } catch (Exception unused) {
            bVar.a();
            aVar.a = null;
            aVar.b = null;
        }
    }
}
