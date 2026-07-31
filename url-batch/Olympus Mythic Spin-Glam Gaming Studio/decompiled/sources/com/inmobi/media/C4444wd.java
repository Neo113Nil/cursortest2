package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.webkit.URLUtil;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4444wd {
    public final C4471xd a;
    public long b;
    public String c;
    public String d;
    public final C4048hb e;

    public C4444wd(C4471xd landingPageModel) {
        Intrinsics.checkNotNullParameter(landingPageModel, "landingPageModel");
        this.a = landingPageModel;
        C4392ud c4392ud = new C4392ud(this);
        C4418vd c4418vd = new C4418vd(this);
        this.e = new C4048hb(landingPageModel.a, new C4074ib(false, landingPageModel.d.i, landingPageModel.b.a.b.getCctEnabled(), 16), c4392ud, c4418vd, landingPageModel.d, landingPageModel.g, 128);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.i);
        p0.startActivity(p1);
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = elapsedRealtime;
        InterfaceC4466x9 interfaceC4466x9 = this.a.g;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("PublisherViewClickHandler", "handleLandingPageUrl: viewTouchTimestamp=" + elapsedRealtime + ", lastClickedAssetUrl=" + this.c);
        }
        String str = this.c;
        if (str != null) {
            a(str, this.d);
        }
    }

    public final void b(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        InterfaceC4466x9 interfaceC4466x9 = this.a.g;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("PublisherViewClickHandler", "handleNativeAssetClickUrl: url=" + url + ", fallbackUrl=" + str);
        }
        this.c = url;
        this.d = str;
        C4471xd c4471xd = this.a;
        if (c4471xd.b.a.a.g) {
            InterfaceC4466x9 interfaceC4466x92 = c4471xd.g;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a("PublisherViewClickHandler", "Lock screen ad clicked, firing callback only");
            }
            ((AbstractC4036h) this.a.f).a(MapsKt.emptyMap());
            return;
        }
        InterfaceC4466x9 interfaceC4466x93 = c4471xd.g;
        if (interfaceC4466x93 != null) {
            ((C4493y9) interfaceC4466x93).a("PublisherViewClickHandler", "Firing onAdClicked callback and handling landing page URL");
        }
        ((AbstractC4036h) this.a.f).a(MapsKt.emptyMap());
        a();
    }

    public final void a(String str, String str2) {
        InterfaceC4466x9 interfaceC4466x9 = this.a.g;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("PublisherViewClickHandler", "handleLandingPageUrl: processing url=" + str + ", isNetworkUrl=" + URLUtil.isNetworkUrl(str));
        }
        C4022gb a = C4048hb.a(this.e, "nativeOpen", (String) null, str, (C4152lb) null, 24);
        InterfaceC4466x9 interfaceC4466x92 = this.a.g;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a("PublisherViewClickHandler", "processOpenRequest result: " + a.a);
        }
        if (a.a == 1) {
            InterfaceC4466x9 interfaceC4466x93 = this.a.g;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).a("PublisherViewClickHandler", "Redirection resolved successfully");
                return;
            }
            return;
        }
        if (str2 != null) {
            InterfaceC4466x9 interfaceC4466x94 = this.a.g;
            if (interfaceC4466x94 != null) {
                ((C4493y9) interfaceC4466x94).a("PublisherViewClickHandler", "Primary URL failed, trying fallback URL: " + str2);
            }
            a(str2, null);
            return;
        }
        InterfaceC4466x9 interfaceC4466x95 = this.a.g;
        if (interfaceC4466x95 != null) {
            ((C4493y9) interfaceC4466x95).b("PublisherViewClickHandler", "Landing Page Handling Failed - no fallback URL available");
        }
    }

    public final void b() {
        C4471xd c4471xd = this.a;
        InterfaceC4466x9 interfaceC4466x9 = c4471xd.g;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("PublisherViewClickHandler", "takeAction called, isLockScreen=" + c4471xd.b.a.a.g);
        }
        if (this.a.b.a.a.g) {
            a();
        }
    }

    public final void a(Intent intent) {
        C4471xd c4471xd = this.a;
        InterfaceC4466x9 interfaceC4466x9 = c4471xd.g;
        if (interfaceC4466x9 != null) {
            G g = c4471xd.b;
            ((C4493y9) interfaceC4466x9).a("PublisherViewClickHandler", "openEmbeddedBrowser: creativeId=" + g.e + ", placementId=" + g.a.a.a);
        }
        intent.putExtra("creativeId", this.a.b.e);
        intent.putExtra("impressionId", this.a.b.m.b);
        intent.putExtra("placementId", this.a.b.a.a.a);
        intent.putExtra("supportLockScreen", this.a.c);
        Context context = AbstractC4002fj.a;
        Context context2 = this.a.a;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!(context2 instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context2, intent);
        InterfaceC4466x9 interfaceC4466x92 = this.a.g;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a("PublisherViewClickHandler", "Embedded browser activity started");
        }
    }
}
