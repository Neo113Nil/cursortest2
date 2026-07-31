package com.vungle.ads.internal.presenter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import com.vungle.ads.PrivacyUrlError;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.p0;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {
    public final Context a;
    public final x b;
    public final h0 c;
    public final com.vungle.ads.internal.platform.f d;
    public Long e;
    public a f;
    public final Lazy g;
    public AlertDialog h;
    public final Lazy i;
    public final LinkedHashMap j;
    public final Map k;
    public final LinkedHashMap l;
    public final Map m;
    public com.vungle.ads.internal.omsdk.b n;
    public p0 o;

    public w(Context context, r1 delegate, h0 advertisement, com.vungle.ads.internal.platform.f platform) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.a = context;
        this.b = delegate;
        this.c = advertisement;
        this.d = platform;
        this.g = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new v(context));
        this.i = LazyKt.lazy(new t(this));
        this.j = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        this.k = MapsKt.mapOf(TuplesKt.to("video.mute", bool), TuplesKt.to("video.unmute", bool));
        this.l = new LinkedHashMap();
        this.m = MapsKt.mapOf(TuplesKt.to(8, bool), TuplesKt.to(9, bool), TuplesKt.to(10, bool));
        this.o = new p0(context, advertisement);
    }

    public final com.vungle.ads.internal.util.s a() {
        return (com.vungle.ads.internal.util.s) this.i.getValue();
    }

    public final com.vungle.ads.internal.network.r b() {
        return (com.vungle.ads.internal.network.r) this.g.getValue();
    }

    public final void c() {
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k()) {
            PrivacyManager.INSTANCE.getClass();
            if (Intrinsics.areEqual("unknown", PrivacyManager.b())) {
                d();
            }
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.a("start", null, ((r1) this.b).q());
        }
        this.e = Long.valueOf(System.currentTimeMillis());
    }

    public final void d() {
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.a("opted_out_by_timeout", "vungle_modal", null);
        if (!(this.a instanceof Activity)) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("NativeAdPresenter", "We can not show GDPR dialog with application context.");
            return;
        }
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.vungle.ads.internal.presenter.w$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                w.a(w.this, dialogInterface, i);
            }
        };
        ConfigManager.INSTANCE.getClass();
        String j = ConfigManager.j();
        String i = ConfigManager.i();
        String g = ConfigManager.g();
        String h = ConfigManager.h();
        Context context = this.a;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, ((Activity) context).getApplicationInfo().theme));
        if (j != null && j.length() != 0) {
            builder.setTitle(j);
        }
        if (i != null && i.length() != 0) {
            builder.setMessage(i);
        }
        builder.setPositiveButton(g, onClickListener);
        builder.setNegativeButton(h, onClickListener);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.vungle.ads.internal.presenter.w$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w.a(w.this, dialogInterface);
            }
        });
        this.h = create;
        create.show();
    }

    public final void a(a aVar) {
        this.f = aVar;
    }

    public final void a(String action, String str, String str2) {
        boolean a;
        List b;
        a aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("NativeAdPresenter", "processCommand: action=" + action + " event=" + str + " value=" + str2);
        int hashCode = action.hashCode();
        if (hashCode != -511324706) {
            if (hashCode != 3566511) {
                if (hashCode == 1427818632 && action.equals("download")) {
                    a("tpat", UnifiedMediationParams.KEY_CLICK_URL, (String) null);
                    a("tpat", "cta_url", str2);
                    com.vungle.ads.internal.model.i k = this.c.k();
                    String str3 = k != null ? k.f : null;
                    boolean a2 = com.vungle.ads.internal.util.l.a(str3, str2, this.a, a(), new u(str3, this));
                    a aVar2 = this.f;
                    if (aVar2 != null) {
                        aVar2.a("open", "adClick", ((r1) this.b).q());
                    }
                    if (!a2 || (aVar = this.f) == null) {
                        return;
                    }
                    aVar.a("open", "adLeftApplication", ((r1) this.b).q());
                    return;
                }
            } else if (action.equals("tpat")) {
                if (str == null || str.length() == 0) {
                    new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty tpat key").setLogEntry$vungle_ads_release(a()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                Object obj = this.k.get(str);
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.areEqual(obj, bool) && Intrinsics.areEqual(this.j.get(str), bool)) {
                    com.vungle.ads.internal.util.t.a("NativeAdPresenter", "Ignore this already fired TPAT: " + str);
                    return;
                }
                this.j.put(str, bool);
                int hashCode2 = str.hashCode();
                if (hashCode2 == -2125915830) {
                    if (str.equals("checkpoint.0")) {
                        b = this.c.b(str, ((com.vungle.ads.internal.platform.c) this.d).e(), String.valueOf(((com.vungle.ads.internal.platform.c) this.d).k()));
                    }
                    b = h0.a(this.c, str, (String) null, 6);
                } else if (hashCode2 == -747709511) {
                    if (str.equals("video.length")) {
                        b = h0.a(this.c, str, str2, 4);
                    }
                    b = h0.a(this.c, str, (String) null, 6);
                } else {
                    if (hashCode2 == 1082060480 && str.equals("cta_url")) {
                        b = str2 != null ? CollectionsKt.listOf(str2) : null;
                    }
                    b = h0.a(this.c, str, (String) null, 6);
                }
                if (b == null || b.isEmpty()) {
                    new TpatError(Sdk.SDKError.Reason.INVALID_TPAT_KEY, "Empty urls for tpat: " + str + " value=" + str2).setLogEntry$vungle_ads_release(a()).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        b().a(new com.vungle.ads.internal.network.p((String) it.next()).b(str).a(a()).a(), false);
                    }
                }
                if (Intrinsics.areEqual(str, "checkpoint.0")) {
                    AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.AD_START_EVENT), a(), 4);
                    a aVar3 = this.f;
                    if (aVar3 != null) {
                        aVar3.a("adViewed", null, ((r1) this.b).q());
                        return;
                    }
                    return;
                }
                return;
            }
        } else if (action.equals("openPrivacy")) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, new m2(Sdk.SDKMetric.SDKMetricType.PRIVACY_URL_OPENED), a(), 4);
            if (str2 != null) {
                if (com.vungle.ads.internal.util.n.a(str2)) {
                    a = com.vungle.ads.internal.util.l.a(null, str2, this.a, a(), null);
                    if (a) {
                        a aVar4 = this.f;
                        if (aVar4 != null) {
                            aVar4.a("open", "adLeftApplication", ((r1) this.b).q());
                            return;
                        }
                        return;
                    }
                    new PrivacyUrlError(str2).setLogEntry$vungle_ads_release(a()).logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                new PrivacyUrlError(str2).setLogEntry$vungle_ads_release(a()).logErrorNoReturnValue$vungle_ads_release();
                return;
            }
            return;
        }
        com.vungle.ads.internal.util.t.c("NativeAdPresenter", "Unknown native ad action: " + action);
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("NativeAdPresenter", "user interaction on Native ad");
            this.o.a(motionEvent);
        }
    }

    public static final void a(w this$0, DialogInterface dialogInterface, int i) {
        String value;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == -2) {
            value = PrivacyConsent.OPT_OUT.getValue();
        } else if (i != -1) {
            value = "opted_out_by_timeout";
        } else {
            value = PrivacyConsent.OPT_IN.getValue();
        }
        PrivacyManager.INSTANCE.getClass();
        PrivacyManager.a(value, "vungle_modal", null);
        this$0.getClass();
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.k() && Intrinsics.areEqual("unknown", PrivacyManager.b())) {
            this$0.d();
        }
    }

    public static final void a(w this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.h = null;
    }

    public final void a(View view, String omSdkData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        boolean C = this.c.C();
        if (omSdkData.length() <= 0 || !C) {
            return;
        }
        String a = ((com.vungle.ads.internal.omsdk.c) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new s(this.a)).getValue()).a();
        if (a != null) {
            com.vungle.ads.internal.omsdk.b bVar = new com.vungle.ads.internal.omsdk.b(omSdkData, a, ((r1) this.b).t());
            bVar.a(view);
            this.n = bVar;
        }
    }

    public final void a(int i, Map map) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("NativeAdPresenter", "onOMEvent: event=" + i + " value=" + map);
        Object obj = this.m.get(Integer.valueOf(i));
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.areEqual(obj, bool) && Intrinsics.areEqual(this.l.get(Integer.valueOf(i)), bool)) {
            com.vungle.ads.internal.util.t.a("NativeAdPresenter", "Ignore this already fired om event: " + i);
        }
        this.l.put(Integer.valueOf(i), bool);
        switch (i) {
            case 1:
                com.vungle.ads.internal.omsdk.b bVar = this.n;
                if (bVar != null) {
                    bVar.d();
                    break;
                }
                break;
            case 2:
                com.vungle.ads.internal.omsdk.b bVar2 = this.n;
                if (bVar2 != null) {
                    bVar2.c();
                    break;
                }
                break;
            case 3:
                com.vungle.ads.internal.omsdk.b bVar3 = this.n;
                if (bVar3 != null) {
                    bVar3.b();
                    break;
                }
                break;
            case 4:
                Object obj2 = map != null ? map.get("OM_KEY_DURATION") : null;
                Number number = obj2 instanceof Number ? (Number) obj2 : null;
                float floatValue = number != null ? number.floatValue() : 0.0f;
                Object obj3 = map != null ? map.get("OM_KEY_VOLUME") : null;
                Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
                float floatValue2 = number2 != null ? number2.floatValue() : 0.0f;
                com.vungle.ads.internal.omsdk.b bVar4 = this.n;
                if (bVar4 != null) {
                    bVar4.a(floatValue, floatValue2);
                    break;
                }
                break;
            case 5:
            case 6:
            case 7:
                com.vungle.ads.internal.omsdk.b bVar5 = this.n;
                if (bVar5 != null) {
                    bVar5.a(i);
                    break;
                }
                break;
            case 8:
                com.vungle.ads.internal.omsdk.b bVar6 = this.n;
                if (bVar6 != null) {
                    bVar6.e();
                    break;
                }
                break;
            case 9:
                com.vungle.ads.internal.omsdk.b bVar7 = this.n;
                if (bVar7 != null) {
                    bVar7.a(true);
                    break;
                }
                break;
            case 10:
                com.vungle.ads.internal.omsdk.b bVar8 = this.n;
                if (bVar8 != null) {
                    bVar8.a(false);
                    break;
                }
                break;
            case 11:
                com.vungle.ads.internal.omsdk.b bVar9 = this.n;
                if (bVar9 != null) {
                    bVar9.a();
                    break;
                }
                break;
        }
    }
}
