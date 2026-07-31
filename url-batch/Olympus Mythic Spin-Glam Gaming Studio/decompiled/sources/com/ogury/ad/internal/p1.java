package com.ogury.ad.internal;

import com.ironsource.sdk.controller.f;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class p1 implements x7 {
    public final w6 a;
    public final u5 b;

    public p1(w6 mraidCommandExecutor, u5 monitoringEventLogger) {
        Intrinsics.checkNotNullParameter(mraidCommandExecutor, "mraidCommandExecutor");
        Intrinsics.checkNotNullParameter(monitoringEventLogger, "monitoringEventLogger");
        this.a = mraidCommandExecutor;
        this.b = monitoringEventLogger;
    }

    public void a() {
    }

    public void a(b ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void a(rg rgVar) {
    }

    public abstract void a(boolean z);

    public void b() {
    }

    public abstract void b(b bVar);

    public void b(String str, String callbackId) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
    }

    public void b(boolean z) {
    }

    public void c() {
    }

    public abstract void c(boolean z);

    public void a(String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
    }

    public void b(String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
    }

    public void a(String str, String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
    }

    public void a(String str, String callbackId, b ad) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void a(y adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
    }

    @Override // com.ogury.ad.internal.x7
    public final boolean a(String url, y7 webView, b ad) {
        Exception e;
        String command;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(ad, "ad");
        Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, gi.a(url));
        if (Intrinsics.areEqual(webView.getAdState(), "hidden") || Intrinsics.areEqual(webView.getAdState(), "loading")) {
            return true;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String substring = url.substring(StringsKt.indexOf$default((CharSequence) url, "/?q=", 0, false, 6, (Object) null) + 4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            jSONObject = new JSONObject(gi.a(substring));
            command = jSONObject.optString("method", "");
            Intrinsics.checkNotNullExpressionValue(command, "optString(...)");
        } catch (Exception e2) {
            e = e2;
            command = "";
        }
        try {
            String optString = jSONObject.optString("callbackId");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            linkedHashMap.put("callbackId", optString);
            Object opt = jSONObject.opt("args");
            if (opt == null) {
                opt = "";
            }
            if (opt instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) opt;
                Iterator<String> keys = jSONObject2.keys();
                Intrinsics.checkNotNull(keys);
                while (keys.hasNext()) {
                    String next = keys.next();
                    Intrinsics.checkNotNull(next);
                    String optString2 = jSONObject2.optString(next, "");
                    Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                    linkedHashMap.put(next, optString2);
                }
            }
            a(command, linkedHashMap, ad);
            return true;
        } catch (Exception e3) {
            e = e3;
            IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, e);
            w6 w6Var = this.a;
            w6Var.getClass();
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter("", "message");
            b8.a(w6Var.a, x6.a(command, ""));
            return true;
        }
    }

    public final void a(String str, LinkedHashMap params, b bVar) {
        String message;
        Object obj;
        String str2;
        Integer num;
        String str3;
        rg rgVar;
        boolean z = false;
        switch (str.hashCode()) {
            case -1289167206:
                if (str.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.e)) {
                    a();
                    return;
                }
                return;
            case -984419449:
                if (str.equals("ogyResolveIntent")) {
                    String str4 = (String) params.get("intentUri");
                    String str5 = (String) params.get("callbackId");
                    message = str5 != null ? str5 : "";
                    b(str4, message);
                    return;
                }
                return;
            case -934437708:
                if (str.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g)) {
                    try {
                        c();
                        return;
                    } catch (Throwable th) {
                        w6 w6Var = this.a;
                        String message2 = th.getMessage();
                        message = message2 != null ? message2 : "";
                        w6Var.getClass();
                        Intrinsics.checkNotNullParameter(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, f.b.g);
                        Intrinsics.checkNotNullParameter(message, "message");
                        b8.a(w6Var.a, x6.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n.g, message));
                        return;
                    }
                }
                return;
            case -840442113:
                if (str.equals("unload")) {
                    b(bVar);
                    return;
                }
                return;
            case -12713460:
                if (str.equals("ogyOnAdImpression") && bVar.z.b == o3.a) {
                    u5 u5Var = this.b;
                    ob obVar = ob.u;
                    Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
                    Pair pair2 = TuplesKt.to("impression_source", q3.a(bVar.z.b));
                    b5 b5Var = bVar.A.a;
                    Intrinsics.checkNotNullParameter(b5Var, "<this>");
                    int ordinal = b5Var.ordinal();
                    String str6 = "sdk";
                    if (ordinal == 0) {
                        obj = POBConstants.KEY_FORMAT;
                    } else {
                        if (ordinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj = "sdk";
                    }
                    Pair pair3 = TuplesKt.to("loaded_source", obj);
                    Pair pair4 = TuplesKt.to("reload", Boolean.valueOf(bVar.J));
                    int i = bVar.K;
                    if (i > 0) {
                        num = Integer.valueOf(i);
                        str2 = POBConstants.KEY_FORMAT;
                    } else {
                        str2 = POBConstants.KEY_FORMAT;
                        num = null;
                    }
                    u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, pair4, TuplesKt.to("webview_termination", num)));
                    u5 u5Var2 = this.b;
                    ob obVar2 = ob.v;
                    Pair pair5 = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
                    Pair pair6 = TuplesKt.to("impression_source", q3.a(bVar.z.b));
                    Pair pair7 = TuplesKt.to("is_paid", Boolean.valueOf(bVar.z.a));
                    b5 b5Var2 = bVar.A.a;
                    Intrinsics.checkNotNullParameter(b5Var2, "<this>");
                    int ordinal2 = b5Var2.ordinal();
                    if (ordinal2 == 0) {
                        str3 = str2;
                    } else {
                        if (ordinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str3 = "sdk";
                    }
                    Pair pair8 = TuplesKt.to("loaded_source", str3);
                    Pair pair9 = TuplesKt.to("reload", Boolean.valueOf(bVar.J));
                    int i2 = bVar.K;
                    u5Var2.a(obVar2, bVar, pb.a(pair5, pair6, pair7, pair8, pair9, TuplesKt.to("webview_termination", i2 > 0 ? Integer.valueOf(i2) : null)));
                    if (bVar.z.a) {
                        u5 u5Var3 = this.b;
                        ob obVar3 = ob.w;
                        Pair pair10 = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
                        Pair pair11 = TuplesKt.to("impression_source", q3.a(bVar.z.b));
                        b5 b5Var3 = bVar.A.a;
                        Intrinsics.checkNotNullParameter(b5Var3, "<this>");
                        int ordinal3 = b5Var3.ordinal();
                        if (ordinal3 == 0) {
                            str6 = str2;
                        } else if (ordinal3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Pair pair12 = TuplesKt.to("loaded_source", str6);
                        Pair pair13 = TuplesKt.to("reload", Boolean.valueOf(bVar.J));
                        int i3 = bVar.K;
                        u5Var3.a(obVar3, bVar, pb.a(pair10, pair11, pair12, pair13, TuplesKt.to("webview_termination", i3 > 0 ? Integer.valueOf(i3) : null)));
                        a(bVar.n.b);
                        return;
                    }
                    return;
                }
                return;
            case 3417674:
                if (str.equals("open")) {
                    a((String) params.get("url"), bVar.n.b);
                    return;
                }
                return;
            case 94756344:
                if (str.equals("close")) {
                    a(params, false);
                    return;
                }
                return;
            case 624734601:
                if (str.equals("setResizeProperties")) {
                    Intrinsics.checkNotNullParameter(params, "params");
                    rg rgVar2 = new rg();
                    String str7 = (String) params.get("allowOffscreen");
                    if (str7 != null && !Boolean.parseBoolean(str7)) {
                        z = true;
                    }
                    rgVar2.a = !z;
                    try {
                        rgVar2.b = ib.a(d5.a(params, "width"));
                        rgVar2.c = ib.a(d5.a(params, "height"));
                        rgVar2.d = ib.a(d5.a(params, "offsetX"));
                        rgVar2.e = ib.a(d5.a(params, "offsetY"));
                        rgVar = rgVar2;
                    } catch (Throwable th2) {
                        Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.ADS, th2);
                        rgVar = null;
                    }
                    a(rgVar);
                    if (rgVar == null) {
                        w6 w6Var2 = this.a;
                        w6Var2.getClass();
                        Intrinsics.checkNotNullParameter("setResizeProperties", f.b.g);
                        Intrinsics.checkNotNullParameter("Wrong parameters", "message");
                        b8.a(w6Var2.a, x6.a("setResizeProperties", "Wrong parameters"));
                        return;
                    }
                    return;
                }
                return;
            case 901631159:
                if (str.equals("ogyOnAdEvent")) {
                    y yVar = bVar.n;
                    String str8 = (String) params.get("event");
                    if (str8 != null) {
                        int hashCode = str8.hashCode();
                        if (hashCode != -697385748) {
                            if (hashCode != 840643011) {
                                if (hashCode == 1100650276 && str8.equals("rewards")) {
                                    a(yVar);
                                    return;
                                }
                                return;
                            }
                            if (!str8.equals("eulaRejected")) {
                                return;
                            }
                        } else if (!str8.equals("eulaAccepted")) {
                            return;
                        }
                        b();
                        return;
                    }
                    return;
                }
                return;
            case 1121179396:
                if (str.equals("ogyOnAdClicked")) {
                    a(bVar);
                    return;
                }
                return;
            case 1614272768:
                if (str.equals("useCustomClose")) {
                    String str9 = (String) params.get("useCustomClose");
                    if (str9 != null && str9.equals("false")) {
                        z = true;
                    }
                    c(z);
                    return;
                }
                return;
            case 1622028878:
                if (str.equals("ogyForceClose")) {
                    a(params, true);
                    return;
                }
                return;
            case 1805873469:
                if (str.equals("ogyStartIntent")) {
                    String str10 = (String) params.get("intentUri");
                    String str11 = (String) params.get("callbackId");
                    message = str11 != null ? str11 : "";
                    a(str10, message, bVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void a(LinkedHashMap linkedHashMap, boolean z) {
        String str = (String) linkedHashMap.get("showNextAd");
        boolean z2 = (str == null || str.equals("true")) ? false : true;
        boolean z3 = !z2;
        if (z) {
            b(z3);
        } else {
            a(z3);
        }
        if (z2) {
            return;
        }
        String str2 = (String) linkedHashMap.get("nextAdId");
        if (str2 == null) {
            str2 = "";
        }
        b(str2);
    }
}
