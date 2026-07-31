package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.webkit.URLUtil;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import com.inmobi.ads.rendering.InMobiInAppBrowserActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.core.DivActionHandler;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.hb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4048hb {
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final C4074ib b;
    public final C4081ii c;
    public final Ya d;
    public final Eh e;
    public final C4178mb f;
    public final InterfaceC4466x9 g;
    public final WeakReference h;
    public int i;

    public /* synthetic */ C4048hb(Context context, C4074ib c4074ib, C4392ud c4392ud, Eh eh, C4178mb c4178mb, InterfaceC4466x9 interfaceC4466x9, int i) {
        this(context, c4074ib, null, (i & 8) != 0 ? null : c4392ud, eh, c4178mb, interfaceC4466x9, null);
    }

    public static /* synthetic */ C4022gb a(C4048hb c4048hb, String str, String str2, String str3, C4152lb c4152lb, int i) {
        if ((i & 8) != 0) {
            c4152lb = null;
        }
        return c4048hb.a(str, str2, str3, c4152lb, (i & 16) == 0);
    }

    public final C4022gb b(String str, String str2, String str3, C4152lb c4152lb) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).c(CampaignEx.JSON_KEY_HB, "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            Ya ya = this.d;
            if (ya != null) {
                ya.a(str2, "Invalid URL", str);
            }
            InterfaceC4466x9 interfaceC4466x92 = this.g;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x92).c(CampaignEx.JSON_KEY_HB, "InMobiNativeBrowserScheme url is Empty or null");
            }
            a(Za.e, c4152lb, (Integer) 8001);
            return new C4022gb(3, 8001);
        }
        if (c4152lb != null) {
            c4152lb.f = "EX_NATIVE";
        }
        boolean a = AbstractC4357t5.a(str3, this.a, this.e, this.g);
        InterfaceC4466x9 interfaceC4466x93 = this.g;
        if (interfaceC4466x93 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x93).c(CampaignEx.JSON_KEY_HB, "openDefaultApplication result = " + a + " for url = " + str3);
        }
        if (a) {
            a(Za.f, c4152lb, (Integer) null);
            c(str, str2, str3);
            InterfaceC4466x9 interfaceC4466x94 = this.g;
            if (interfaceC4466x94 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x94).c(CampaignEx.JSON_KEY_HB, "InmobiNativeBrowser scheme url handled successfully");
            }
            return new C4022gb(1);
        }
        InterfaceC4466x9 interfaceC4466x95 = this.g;
        if (interfaceC4466x95 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x95).c(CampaignEx.JSON_KEY_HB, "Trying appLinkOrDeepLinkHandled with urlEndpoint = " + queryParameter);
        }
        int a2 = AbstractC4357t5.a(this.a, queryParameter, this.e, str, this.g);
        if (a2 == 0 || a2 == 1) {
            a(Za.f, c4152lb, (Integer) null);
            c(str, str2, str3);
            InterfaceC4466x9 interfaceC4466x96 = this.g;
            if (interfaceC4466x96 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x96).c(CampaignEx.JSON_KEY_HB, "InmobiNativeBrowser scheme url handled successfully");
            }
            return new C4022gb(1);
        }
        Ya ya2 = this.d;
        if (ya2 != null) {
            ya2.a(str2, "Invalid URL", str);
        }
        InterfaceC4466x9 interfaceC4466x97 = this.g;
        if (interfaceC4466x97 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x97).c(CampaignEx.JSON_KEY_HB, "processedResult = " + a2);
        }
        InterfaceC4466x9 interfaceC4466x98 = this.g;
        if (interfaceC4466x98 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x98).c(CampaignEx.JSON_KEY_HB, "InmobiNativeBrowser scheme url handling failed");
        }
        a(Za.g, c4152lb, Integer.valueOf(a2));
        return new C4022gb(2, Integer.valueOf(a2));
    }

    public final int c(String str, String str2, String str3, C4152lb c4152lb) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).a(CampaignEx.JSON_KEY_HB, "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, c4152lb);
        } catch (Exception e) {
            Ya ya = this.d;
            if (ya != null) {
                ya.a(str2, "Unexpected error", "open");
            }
            Xb.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            InterfaceC4466x9 interfaceC4466x92 = this.g;
            if (interfaceC4466x92 == null) {
                return 9;
            }
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x92).b(CampaignEx.JSON_KEY_HB, "SDK encountered unexpected error in handling open() request from creative " + e.getMessage());
            return 9;
        }
    }

    public final int d(String api, String str, String str2, C4152lb c4152lb) {
        String a;
        Intrinsics.checkNotNullParameter(api, "api");
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).c(CampaignEx.JSON_KEY_HB, "processOpenCCTRequest - url - " + str2);
        }
        if (c4152lb != null) {
            c4152lb.f = "IN_NATIVE";
        }
        if (str2 == null || (StringsKt.startsWith$default(str2, "http", false, 2, (Object) null) && !URLUtil.isValidUrl(str2))) {
            InterfaceC4466x9 interfaceC4466x92 = this.g;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x92).c(CampaignEx.JSON_KEY_HB, api + " called with invalid url (" + str2 + ")");
            }
            Ya ya = this.d;
            if (ya != null) {
                ya.a(str, "Invalid URL", api);
            }
            a(Za.e, c4152lb, (Integer) 3);
            return 3;
        }
        String a2 = AbstractC4226o5.a(this.a);
        try {
            try {
                boolean z = this.b.c;
                if (a2 != null && z) {
                    Y2 y2 = new Y2(str2, null, this.a, this.c, this.e, c4152lb, api);
                    C4172m5 c4172m5 = y2.e;
                    Context context = y2.f;
                    if (c4172m5.a == null && context != null && (a = AbstractC4226o5.a(context)) != null) {
                        C4120k5 c4120k5 = new C4120k5(c4172m5);
                        c4172m5.b = c4120k5;
                        CustomTabsClient.bindCustomTabsService(context, a, c4120k5);
                    }
                    InterfaceC4466x9 interfaceC4466x93 = this.g;
                    if (interfaceC4466x93 != null) {
                        Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                        ((C4493y9) interfaceC4466x93).c(CampaignEx.JSON_KEY_HB, "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                InterfaceC4466x9 interfaceC4466x94 = this.g;
                if (interfaceC4466x94 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x94).a(CampaignEx.JSON_KEY_HB, "ChromeCustomTab fallback to Embedded");
                }
                if (c4152lb != null) {
                    c4152lb.f = "IN_CUSTOM";
                }
                return a(str2, api, c4152lb);
            } catch (Exception unused) {
                int a3 = F3.a(this.a, str2, this.e, api);
                if (a3 != 0 && a3 != 1) {
                    return a3;
                }
                c(api, str, str2);
                if (c4152lb != null) {
                    c4152lb.f = "EX_NATIVE";
                }
                a(Za.f, c4152lb, (Integer) null);
                return a3;
            }
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x95 = this.g;
            if (interfaceC4466x95 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x95).a(CampaignEx.JSON_KEY_HB, "Exception occurred while opening External ", e);
            }
            return 9;
        }
    }

    public final int e(String str, String str2, String str3, C4152lb c4152lb) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).a(CampaignEx.JSON_KEY_HB, "In processOpenExternalNativeRequest");
        }
        int a = AbstractC4357t5.a(this.a, str3, this.e, str, this.g);
        if (a != 0 && a != 1) {
            return d(str, str2, str3, c4152lb);
        }
        if (c4152lb != null) {
            c4152lb.f = "EX_NATIVE";
        }
        a(Za.f, c4152lb, (Integer) null);
        c(str, str2, str3);
        InterfaceC4466x9 interfaceC4466x92 = this.g;
        if (interfaceC4466x92 == null) {
            return 0;
        }
        Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
        ((C4493y9) interfaceC4466x92).c(CampaignEx.JSON_KEY_HB, "External Native handled successfully");
        return 0;
    }

    public final void f(String str, String str2, String str3, C4152lb c4152lb) {
        String str4;
        try {
            int a = F3.a(this.a, str2, this.e, "openExternal");
            if (a != 0 && a != 1) {
                a(Za.g, c4152lb, Integer.valueOf(a));
                Ya ya = this.d;
                if (ya != null) {
                    try {
                        str4 = URLEncoder.encode(str2, "UTF-8");
                        Intrinsics.checkNotNull(str4);
                    } catch (UnsupportedEncodingException unused) {
                        str4 = str2;
                    }
                    ya.a(str, "Cannot resolve URI (" + str4 + ")", "openExternal");
                    return;
                }
                return;
            }
            a(Za.f, c4152lb, (Integer) null);
            c("openExternal", str, str2);
        } catch (ActivityNotFoundException e) {
            a(this, str, str2, str3, c4152lb, e);
        } catch (NullPointerException e2) {
            a(this, str, str2, str3, c4152lb, e2);
        } catch (URISyntaxException e3) {
            a(this, str, str2, str3, c4152lb, e3);
        } catch (Exception e4) {
            a(Za.g, c4152lb, (Integer) 9);
            Ya ya2 = this.d;
            if (ya2 != null) {
                ya2.a(str, "Unexpected error", "openExternal");
            }
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            Xb.a((byte) 1, CampaignEx.JSON_KEY_HB, "Could not open URL SDK encountered an unexpected error");
            InterfaceC4466x9 interfaceC4466x9 = this.g;
            if (interfaceC4466x9 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x9).b(CampaignEx.JSON_KEY_HB, "SDK encountered unexpected error in handling openExternal() request from creative " + e4.getMessage());
            }
        }
    }

    public C4048hb(Context context, C4074ib landingPageState, C4081ii c4081ii, Ya ya, Eh redirectionValidator, C4178mb c4178mb, InterfaceC4466x9 interfaceC4466x9, WeakReference weakReference) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(landingPageState, "landingPageState");
        Intrinsics.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        this.a = context;
        this.b = landingPageState;
        this.c = c4081ii;
        this.d = ya;
        this.e = redirectionValidator;
        this.f = c4178mb;
        this.g = interfaceC4466x9;
        this.h = weakReference;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b9, code lost:
    
        if (r7.equals("DEFAULT") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0153, code lost:
    
        if (r7.equals("IN_NATIVE") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ce, code lost:
    
        r7 = r16.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d0, code lost:
    
        if (r7 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d2, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_HB, "TAG");
        ((com.inmobi.media.C4493y9) r7).c(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_HB, "default - internal native");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01dc, code lost:
    
        r1 = c(r17, r18, r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0196, code lost:
    
        if (r7.equals("EX_NATIVE") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a0, code lost:
    
        r7 = r16.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a2, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a4, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_HB, "TAG");
        ((com.inmobi.media.C4493y9) r7).c(com.mbridge.msdk.foundation.entity.CampaignEx.JSON_KEY_HB, "open external native");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ae, code lost:
    
        r1 = e(r17, r18, r19, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019d, code lost:
    
        if (r7.equals("SKSTORE") == false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C4022gb a(String api, String str, String str2, C4152lb c4152lb, boolean z) {
        C4152lb c4152lb2;
        InterfaceC4466x9 interfaceC4466x9;
        InterfaceC4466x9 interfaceC4466x92;
        int c;
        InterfaceC4466x9 interfaceC4466x93;
        C4178mb c4178mb;
        Intrinsics.checkNotNullParameter(api, "api");
        InterfaceC4466x9 interfaceC4466x94 = this.g;
        if (interfaceC4466x94 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x94).c(CampaignEx.JSON_KEY_HB, "processing URL - " + str2);
        }
        if (!z) {
            if (c4152lb != null) {
                c4152lb2 = c4152lb;
            } else if (!this.b.a && (c4178mb = this.f) != null) {
                String a = AbstractC3914cb.a(str2);
                int i = this.i + 1;
                this.i = i;
                c4152lb2 = new C4152lb(c4178mb, a, i, SystemClock.elapsedRealtime());
            }
            a(Za.d, c4152lb2, (Integer) null);
            if (str2 != null || str2.length() == 0) {
                interfaceC4466x9 = this.g;
                if (interfaceC4466x9 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x9).c(CampaignEx.JSON_KEY_HB, "url is empty");
                }
                a(Za.e, c4152lb2, (Integer) 2);
                b(api, str, str2);
                return new C4022gb(3, 2);
            }
            Uri parse = Uri.parse(str2);
            String scheme = parse.getScheme();
            if (scheme == null || scheme.length() == 0) {
                InterfaceC4466x9 interfaceC4466x95 = this.g;
                if (interfaceC4466x95 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x95).c(CampaignEx.JSON_KEY_HB, "url scheme is empty");
                }
                a(Za.e, c4152lb2, (Integer) 4);
                b(api, str, str2);
                return new C4022gb(3, 4);
            }
            if (Intrinsics.areEqual(this.b.b, "SKSTORE") && !z) {
                InterfaceC4466x9 interfaceC4466x96 = this.g;
                if (interfaceC4466x96 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x96).c(CampaignEx.JSON_KEY_HB, "inline installer");
                }
                return a(api, str, str2, (String) null, c4152lb2);
            }
            if (Intrinsics.areEqual(parse.getScheme(), "inmobinativebrowser")) {
                InterfaceC4466x9 interfaceC4466x97 = this.g;
                if (interfaceC4466x97 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x97).c(CampaignEx.JSON_KEY_HB, "inmobi native browser scheme");
                }
                return b(api, str, str2, c4152lb2);
            }
            if (Intrinsics.areEqual(parse.getScheme(), "inmobideeplink")) {
                InterfaceC4466x9 interfaceC4466x98 = this.g;
                if (interfaceC4466x98 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x98).c(CampaignEx.JSON_KEY_HB, "inmobi deeplink scheme");
                }
                return a(api, str, str2, c4152lb2);
            }
            if (J1.a(this.a, str2, this.e, api, this.g) || AbstractC4357t5.a(str2, this.a, this.e, this.g)) {
                InterfaceC4466x9 interfaceC4466x99 = this.g;
                if (interfaceC4466x99 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x99).c(CampaignEx.JSON_KEY_HB, "appstore link");
                }
                c(api, str, str2);
                if (c4152lb2 != null) {
                    c4152lb2.f = "EX_NATIVE";
                }
                a(Za.f, c4152lb2, (Integer) null);
                return new C4022gb(1);
            }
            Intrinsics.checkNotNull(parse);
            if (!F3.a(parse)) {
                int a2 = AbstractC4357t5.a(this.a, str2, this.e, api, this.g);
                if (c4152lb2 != null) {
                    c4152lb2.f = "EX_NATIVE";
                }
                if (a2 == 0 || a2 == 1) {
                    a(Za.f, c4152lb2, (Integer) null);
                    c(api, str, str2);
                    InterfaceC4466x9 interfaceC4466x910 = this.g;
                    if (interfaceC4466x910 != null) {
                        Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                        ((C4493y9) interfaceC4466x910).c(CampaignEx.JSON_KEY_HB, "Deeplink url handled successfully");
                    }
                    return new C4022gb(1);
                }
                InterfaceC4466x9 interfaceC4466x911 = this.g;
                if (interfaceC4466x911 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x911).c(CampaignEx.JSON_KEY_HB, "In processOpenRequest else");
                }
                b(api, str, str2);
                a(Za.g, c4152lb2, Integer.valueOf(a2));
                return new C4022gb(2, Integer.valueOf(a2));
            }
            InterfaceC4466x9 interfaceC4466x912 = this.g;
            if (interfaceC4466x912 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x912).c(CampaignEx.JSON_KEY_HB, "http link");
            }
            C4074ib c4074ib = this.b;
            if (c4074ib.a) {
                return new C4022gb(0);
            }
            String str3 = c4074ib.b;
            switch (str3.hashCode()) {
                case -2032180703:
                    break;
                case -1420186263:
                    break;
                case -702637789:
                    break;
                case 112775115:
                    if (str3.equals("IN_CUSTOM")) {
                        InterfaceC4466x9 interfaceC4466x913 = this.g;
                        if (interfaceC4466x913 != null) {
                            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                            ((C4493y9) interfaceC4466x913).c(CampaignEx.JSON_KEY_HB, "open internal custom");
                        }
                        InterfaceC4466x9 interfaceC4466x914 = this.g;
                        if (interfaceC4466x914 != null) {
                            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                            ((C4493y9) interfaceC4466x914).a(CampaignEx.JSON_KEY_HB, "In processOpenInternalCustomRequest");
                        }
                        c = a(str2, api, c4152lb2);
                        if ((c == 0 || c == 1) && (interfaceC4466x93 = this.g) != null) {
                            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                            ((C4493y9) interfaceC4466x93).c(CampaignEx.JSON_KEY_HB, "Internal Custom handled successfully");
                            break;
                        }
                    }
                    interfaceC4466x92 = this.g;
                    if (interfaceC4466x92 != null) {
                        Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                        ((C4493y9) interfaceC4466x92).c(CampaignEx.JSON_KEY_HB, "invalid scheme - open internal native");
                    }
                    c = c(api, str, str2, c4152lb2);
                    break;
                case 409244785:
                    break;
                default:
                    interfaceC4466x92 = this.g;
                    if (interfaceC4466x92 != null) {
                    }
                    c = c(api, str, str2, c4152lb2);
                    break;
            }
            if (c == 0 || c == 1) {
                return new C4022gb(1);
            }
            if (c4152lb2 != null) {
                c4152lb2.f = this.b.b;
            }
            a(Za.g, c4152lb2, Integer.valueOf(c));
            return new C4022gb(2, Integer.valueOf(c));
        }
        c4152lb2 = null;
        a(Za.d, c4152lb2, (Integer) null);
        if (str2 != null) {
        }
        interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
        }
        a(Za.e, c4152lb2, (Integer) 2);
        b(api, str, str2);
        return new C4022gb(3, 2);
    }

    public final void c(String str, String str2, String str3) {
        Ya ya = this.d;
        if (ya != null) {
            ya.a();
        }
        Ya ya2 = this.d;
        if (ya2 != null) {
            ya2.b(str, str2, str3);
        }
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).c(CampaignEx.JSON_KEY_HB, str + " called with invalid url (" + str3 + ")");
        }
        Ya ya = this.d;
        if (ya != null) {
            ya.a(str2, "Invalid URL", str);
        }
    }

    public final boolean a(String str, String str2, C4152lb c4152lb, U2 u2) {
        String a;
        try {
            if (!this.b.d || u2 == null) {
                return false;
            }
            String a2 = AbstractC4226o5.a(this.a);
            if (a2 != null) {
                try {
                    if (Uf.b(Uf.a(R5.g()))) {
                        CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityWidthPx", Integer.TYPE);
                    } else {
                        CustomTabsIntent.Builder.class.getDeclaredMethod("setInitialActivityHeightPx", Integer.TYPE);
                    }
                    Y2 y2 = new Y2(str2, u2, this.a, this.c, this.e, c4152lb, str);
                    C4172m5 c4172m5 = y2.e;
                    Context context = y2.f;
                    if (c4172m5.a == null && context != null && (a = AbstractC4226o5.a(context)) != null) {
                        C4120k5 c4120k5 = new C4120k5(c4172m5);
                        c4172m5.b = c4120k5;
                        CustomTabsClient.bindCustomTabsService(context, a, c4120k5);
                        return true;
                    }
                    return true;
                } catch (Error | Exception unused) {
                }
            }
            InterfaceC4466x9 interfaceC4466x9 = this.g;
            if (interfaceC4466x9 == null) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).c(CampaignEx.JSON_KEY_HB, "Partial tabs not supported: packageName - " + a2);
            return false;
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x92 = this.g;
            if (interfaceC4466x92 == null) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x92).c(CampaignEx.JSON_KEY_HB, "Error while opening partial tab: " + e.getMessage());
            return false;
        }
    }

    public final int a(String api, String str, String str2, C4152lb c4152lb, U2 u2) {
        Intrinsics.checkNotNullParameter(api, "api");
        if (str2 != null && str2.length() != 0) {
            Uri parse = Uri.parse(str2);
            String scheme = parse.getScheme();
            if (scheme != null && scheme.length() != 0) {
                if (Intrinsics.areEqual(parse.getScheme(), "inmobinativebrowser")) {
                    b(api, str, str2, c4152lb);
                    return 2;
                }
                if (Intrinsics.areEqual(parse.getScheme(), "inmobideeplink")) {
                    return a(api, str, str2, c4152lb).a == 1 ? 2 : 4;
                }
                if (J1.a(this.a, str2, this.e, api, this.g) | AbstractC4357t5.a(str2, this.a, this.e, this.g)) {
                    c(api, str, str2);
                    if (c4152lb != null) {
                        c4152lb.f = "EX_NATIVE";
                    }
                    a(Za.f, c4152lb, (Integer) null);
                    return 2;
                }
                Intrinsics.checkNotNull(parse);
                if (F3.a(parse) && a(api, str2, c4152lb, u2)) {
                    return 5;
                }
                if (F3.a(parse)) {
                    return 3;
                }
                int a = AbstractC4357t5.a(this.a, str2, this.e, api, this.g);
                if (c4152lb != null) {
                    c4152lb.f = "EX_NATIVE";
                }
                if (a != 0 && a != 1) {
                    InterfaceC4466x9 interfaceC4466x9 = this.g;
                    if (interfaceC4466x9 != null) {
                        Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                        ((C4493y9) interfaceC4466x9).b(CampaignEx.JSON_KEY_HB, "CustomExpand handling failed");
                    }
                    a(Za.j, c4152lb, (Integer) null);
                    return 4;
                }
                c(api, str, str2);
                a(Za.f, c4152lb, (Integer) null);
                InterfaceC4466x9 interfaceC4466x92 = this.g;
                if (interfaceC4466x92 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x92).c(CampaignEx.JSON_KEY_HB, "Deeplink url handled successfully");
                }
                return 2;
            }
            b(api, str, str2);
            a(Za.e, c4152lb, (Integer) 4);
            return 1;
        }
        b(api, str, str2);
        a(Za.e, c4152lb, (Integer) 2);
        return 1;
    }

    public final C4022gb a(String str, String str2, String str3, C4152lb c4152lb) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).a(CampaignEx.JSON_KEY_HB, "In processInMobiDeepLinkScheme");
        }
        Uri parse = Uri.parse(str3);
        int a = a(str, parse.getQueryParameter("primaryUrl"), parse.getQueryParameter("primaryTrackingUrl"));
        if (a != 0 && a != 1) {
            int a2 = a(str, parse.getQueryParameter("fallbackUrl"), parse.getQueryParameter("fallbackTrackingUrl"));
            if (c4152lb != null) {
                c4152lb.f = "EX_NATIVE";
            }
            if (a2 != 0 && a2 != 1) {
                Ya ya = this.d;
                if (ya != null) {
                    ya.a(str2, "Invalid URL", str);
                }
                InterfaceC4466x9 interfaceC4466x92 = this.g;
                if (interfaceC4466x92 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x92).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                a(Za.g, c4152lb, Integer.valueOf(a2));
                return new C4022gb(2, Integer.valueOf(a2));
            }
            InterfaceC4466x9 interfaceC4466x93 = this.g;
            if (interfaceC4466x93 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x93).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            a(Za.f, c4152lb, (Integer) null);
            c(str, str2, str3);
            return new C4022gb(1);
        }
        InterfaceC4466x9 interfaceC4466x94 = this.g;
        if (interfaceC4466x94 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x94).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (c4152lb != null) {
            c4152lb.f = "EX_NATIVE";
        }
        a(Za.f, c4152lb, (Integer) null);
        c(str, str2, str3);
        return new C4022gb(1);
    }

    public final int a(String str, String str2, String url) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).c(CampaignEx.JSON_KEY_HB, "inMobiDeepLinkSchemeUrlHandled - url - " + str2 + " trackingUrl " + url);
        }
        if (str2 != null && str2.length() != 0) {
            if (AbstractC4357t5.a(str2, this.a, this.e, this.g)) {
                if (N3.a(url)) {
                    E3 e3 = E3.a;
                    Intrinsics.checkNotNull(url);
                    InterfaceC4466x9 interfaceC4466x92 = this.g;
                    Intrinsics.checkNotNullParameter(url, "url");
                    E3.a(url, true, interfaceC4466x92);
                } else {
                    InterfaceC4466x9 interfaceC4466x93 = this.g;
                    if (interfaceC4466x93 != null) {
                        Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                        ((C4493y9) interfaceC4466x93).b(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                InterfaceC4466x9 interfaceC4466x94 = this.g;
                if (interfaceC4466x94 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x94).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int a = AbstractC4357t5.a(this.a, str2, this.e, str, this.g);
            if (a != 0 && a != 1) {
                InterfaceC4466x9 interfaceC4466x95 = this.g;
                if (interfaceC4466x95 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x95).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return a;
            }
            if (N3.a(url)) {
                E3 e32 = E3.a;
                Intrinsics.checkNotNull(url);
                InterfaceC4466x9 interfaceC4466x96 = this.g;
                Intrinsics.checkNotNullParameter(url, "url");
                E3.a(url, true, interfaceC4466x96);
            } else {
                InterfaceC4466x9 interfaceC4466x97 = this.g;
                if (interfaceC4466x97 != null) {
                    Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                    ((C4493y9) interfaceC4466x97).b(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            InterfaceC4466x9 interfaceC4466x98 = this.g;
            if (interfaceC4466x98 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x98).c(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        InterfaceC4466x9 interfaceC4466x99 = this.g;
        if (interfaceC4466x99 == null) {
            return 2;
        }
        Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
        ((C4493y9) interfaceC4466x99).b(CampaignEx.JSON_KEY_HB, "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    public final int a(String url, String api, C4152lb c4152lb) {
        C4152lb c4152lb2;
        C4152lb c4152lb3;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(api, "api");
        if (c4152lb != null) {
            c4152lb.f = "IN_CUSTOM";
        }
        if (url.length() == 0) {
            InterfaceC4466x9 interfaceC4466x9 = this.g;
            if (interfaceC4466x9 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x9).b(CampaignEx.JSON_KEY_HB, "processOpenEmbeddedRequest failed due to empty URL");
            }
            a(Za.e, c4152lb, (Integer) null);
            return 2;
        }
        Uri parse = Uri.parse(url);
        Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(this)");
        if (F3.a(parse)) {
            Intent intent = new Intent(this.a, (Class<?>) InMobiInAppBrowserActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.e.getViewTouchTimestamp());
            if (c4152lb != null) {
                c4152lb2 = C4152lb.a(c4152lb);
                Za za = Za.d;
                c4152lb2.e = 2;
                Unit unit = Unit.INSTANCE;
            } else {
                c4152lb2 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", c4152lb2);
            if (c4152lb != null) {
                c4152lb3 = C4152lb.a(c4152lb);
                Za za2 = Za.d;
                c4152lb3.e = 2;
                Unit unit2 = Unit.INSTANCE;
            } else {
                c4152lb3 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", c4152lb3);
            InterfaceC4466x9 obj = this.g;
            if (obj != null) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                HashMap hashMap = Y8.a;
                String key = uuid.toString();
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(obj, "obj");
                Y8.a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", uuid.toString());
            }
            Ya ya = this.d;
            if (ya != null) {
                ya.a(intent);
            }
            a(Za.f, c4152lb, (Integer) null);
            Ya ya2 = this.d;
            if (ya2 == null) {
                return 1;
            }
            ya2.b(null, null, url);
            return 1;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.g;
        if (interfaceC4466x92 == null) {
            return 10;
        }
        Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
        ((C4493y9) interfaceC4466x92).b(CampaignEx.JSON_KEY_HB, "Embedded request unable to handle " + url);
        return 10;
    }

    public final C4022gb a(String api, String str, String str2, String str3, C4152lb c4152lb) {
        Activity activity;
        AbstractC3994fb c3940db;
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi;
        Intrinsics.checkNotNullParameter(api, "api");
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).a(CampaignEx.JSON_KEY_HB, "inline installer called with clickThroughUrl: " + str2 + ", inlineInstallUrl: " + str3);
        }
        if (c4152lb != null) {
            c4152lb.f = "SKSTORE";
        }
        InlineParams inlineParams = this.b.e;
        if (inlineParams == null) {
            c3940db = new C3940db(8700);
        } else {
            WeakReference weakReference = this.h;
            if (weakReference == null || (gestureDetectorOnGestureListenerC4476xi = (GestureDetectorOnGestureListenerC4476xi) weakReference.get()) == null) {
                activity = null;
            } else {
                activity = gestureDetectorOnGestureListenerC4476xi.getFullScreenActivity();
                if (activity == null) {
                    activity = gestureDetectorOnGestureListenerC4476xi.getBannerHolderActivity().get();
                }
            }
            String targetBundleId = inlineParams.getTargetBundleId();
            if (!N3.a(str3)) {
                str3 = inlineParams.getUrl();
            }
            if (targetBundleId == null || targetBundleId.length() == 0) {
                c3940db = new C3940db(8702);
            } else if (activity == null) {
                c3940db = new C3940db(8704);
            } else if (str3 != null && str3.length() != 0) {
                String uri = Uri.parse(str3).buildUpon().appendQueryParameter("id", targetBundleId).build().toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                c3940db = new C3966eb(activity, uri);
            } else {
                c3940db = new C3940db(2);
            }
        }
        if (c3940db instanceof C3966eb) {
            return a(api, str, c4152lb, str2, (C3966eb) c3940db, inlineParams != null ? inlineParams.getPingMode() : 2);
        }
        if (c3940db instanceof C3940db) {
            return a(str2, api, str, c4152lb, ((C3940db) c3940db).a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C4022gb a(String str, String str2, String str3, C4152lb c4152lb, int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).a(CampaignEx.JSON_KEY_HB, "Executing inline installer fallback flow for URL: " + str);
        }
        a(i, c4152lb);
        if (c4152lb != null) {
            c4152lb.f = "EX_NATIVE";
        }
        if (str != null && str.length() != 0) {
            if (J1.a(this.a, str, this.e, str2, this.g)) {
                a(Za.f, c4152lb, (Integer) null);
                c(str2, str3, str);
                return new C4022gb(1);
            }
            if (AbstractC4357t5.a(str, this.a, this.e, this.g)) {
                a(Za.f, c4152lb, (Integer) null);
                c(str2, str3, str);
                return new C4022gb(1);
            }
            int e = e(str2, str3, str, c4152lb);
            if (e != 0 && e != 1) {
                a(Za.g, c4152lb, Integer.valueOf(e));
                Ya ya = this.d;
                if (ya != null) {
                    ya.a(str3, "Launch failed", str2);
                }
                return new C4022gb(2, Integer.valueOf(e));
            }
            return new C4022gb(1);
        }
        a(Za.g, c4152lb, (Integer) 2);
        Ya ya2 = this.d;
        if (ya2 != null) {
            ya2.a(str3, "Launch failed", str2);
        }
        return new C4022gb(2, 2);
    }

    public final C4022gb a(String str, String str2, C4152lb c4152lb, String url, C3966eb c3966eb, int i) {
        InterfaceC4466x9 interfaceC4466x9 = this.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).a(CampaignEx.JSON_KEY_HB, "Executing inline installer flow for URL: " + url);
        }
        int a = F3.a(c3966eb);
        if (a != 0 && a != 1) {
            InterfaceC4466x9 interfaceC4466x92 = this.g;
            if (interfaceC4466x92 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x92).a(CampaignEx.JSON_KEY_HB, "Inline installer launch failed; executing fallback for URL: " + url + ", errorCode: " + a);
            }
            return a(url, str, str2, c4152lb, a);
        }
        if (url != null) {
            InterfaceC4466x9 interfaceC4466x93 = this.g;
            if (interfaceC4466x93 != null) {
                Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
                ((C4493y9) interfaceC4466x93).a(CampaignEx.JSON_KEY_HB, "Inline installer launch succeeded for URL: " + url);
            }
            if (i != 0) {
                if (i != 1) {
                    E3 e3 = E3.a;
                    InterfaceC4466x9 interfaceC4466x94 = this.g;
                    Intrinsics.checkNotNullParameter(url, "url");
                    Ug.a(Rg.b, new C4460x3(url, true, interfaceC4466x94, null));
                } else {
                    E3 e32 = E3.a;
                    InterfaceC4466x9 interfaceC4466x95 = this.g;
                    Intrinsics.checkNotNullParameter(url, "url");
                    E3.a(url, true, interfaceC4466x95);
                }
            }
        }
        a(Za.f, c4152lb, (Integer) null);
        Ya ya = this.d;
        if (ya != null) {
            ya.b(str, str2, url);
        }
        return new C4022gb(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000e, B:9:0x0022, B:11:0x0064, B:13:0x006a, B:14:0x006e, B:16:0x0080, B:17:0x0090, B:28:0x000c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[Catch: all -> 0x0009, TryCatch #0 {all -> 0x0009, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x000e, B:9:0x0022, B:11:0x0064, B:13:0x006a, B:14:0x006e, B:16:0x0080, B:17:0x0090, B:28:0x000c), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, C4152lb c4152lb) {
        Object m8023constructorimpl;
        Throwable m8026exceptionOrNullimpl;
        InterfaceC4466x9 interfaceC4466x9;
        C4178mb c4178mb;
        try {
            Result.Companion companion = Result.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (c4152lb != null) {
            c4178mb = c4152lb.a;
            if (c4178mb == null) {
            }
            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)));
            if (c4178mb != null) {
                mutableMapOf.put("plType", c4178mb.c);
                mutableMapOf.put("impressionId", c4178mb.b);
                mutableMapOf.put("plId", Long.valueOf(c4178mb.a));
                mutableMapOf.put("adType", c4178mb.d);
                mutableMapOf.put("markupType", c4178mb.e);
                mutableMapOf.put("creativeType", c4178mb.f);
                mutableMapOf.put("metadataBlob", c4178mb.g);
                mutableMapOf.put("isRewarded", Boolean.valueOf(c4178mb.h));
            }
            if (c4152lb != null) {
                String str = c4152lb.f;
                if (str == null) {
                    str = c4152lb.a.i;
                }
                mutableMapOf.put(DivActionHandler.DivActionReason.TRIGGER, str);
                mutableMapOf.put("urlType", c4152lb.b);
                long j2 = c4152lb.d;
                if (j2 != 0) {
                    CoroutineScope coroutineScope = Hl.a;
                    mutableMapOf.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j2));
                }
            }
            mutableMapOf.put("networkType", F5.g());
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("InlineInstallFailed", mutableMapOf, EnumC4530zk.a);
            m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
            m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
            if (m8026exceptionOrNullimpl != null || (interfaceC4466x9 = this.g) == null) {
            }
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).b(CampaignEx.JSON_KEY_HB, "Failed to submit inline install failed telemetry: " + m8026exceptionOrNullimpl.getMessage());
            return;
        }
        c4178mb = this.f;
        Map mutableMapOf2 = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)));
        if (c4178mb != null) {
        }
        if (c4152lb != null) {
        }
        mutableMapOf2.put("networkType", F5.g());
        C4425vk c4425vk2 = C4425vk.a;
        C4425vk.b("InlineInstallFailed", mutableMapOf2, EnumC4530zk.a);
        m8023constructorimpl = Result.m8023constructorimpl(Unit.INSTANCE);
        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
        }
    }

    public static final void a(C4048hb c4048hb, String str, String str2, String str3, C4152lb c4152lb, Exception exc) {
        InterfaceC4466x9 interfaceC4466x9 = c4048hb.g;
        if (interfaceC4466x9 != null) {
            Intrinsics.checkNotNullExpressionValue(CampaignEx.JSON_KEY_HB, "TAG");
            ((C4493y9) interfaceC4466x9).b(CampaignEx.JSON_KEY_HB, "Error message in processing openExternal: " + exc.getMessage());
        }
        Ya ya = c4048hb.d;
        if (ya != null) {
            try {
                String encode = URLEncoder.encode(str2, "UTF-8");
                Intrinsics.checkNotNull(encode);
                str2 = encode;
            } catch (UnsupportedEncodingException unused) {
            }
            ya.a(str, "Cannot resolve URI (" + str2 + ")", "openExternal");
        }
        if (str3 != null) {
            c4048hb.f(str, str3, null, c4152lb);
        }
    }

    public final void a(Za funnelState, C4152lb c4152lb, Integer num) {
        Intrinsics.checkNotNullParameter(funnelState, "funnelState");
        AbstractC3914cb.a(funnelState, c4152lb, num, new Function2() { // from class: com.inmobi.media.hb$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C4048hb.a(C4048hb.this, (String) obj, (Map) obj2);
            }
        });
    }

    public static final Unit a(C4048hb c4048hb, String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
        Ya ya = c4048hb.d;
        if (ya != null) {
            ya.a(trackerName, macros);
        }
        return Unit.INSTANCE;
    }
}
