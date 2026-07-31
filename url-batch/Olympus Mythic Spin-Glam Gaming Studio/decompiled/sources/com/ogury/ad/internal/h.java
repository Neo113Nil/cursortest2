package com.ogury.ad.internal;

import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.ogury.ad.common.OguryMediation;
import com.ogury.core.internal.DebugUtils;
import com.ogury.core.internal.IntegrationLogger;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.SourceTag;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h {
    public static final h a = new h();

    public static void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, message);
        throw new ph(new a9(3, message), nh.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0269, code lost:
    
        if (r0 == null) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q a(String errorResponse, x adType, String str, da daVar, String sessionId, boolean z, boolean z2, OguryMediation oguryMediation, hh hhVar) {
        int i;
        int i2;
        String string;
        boolean z3;
        String str2;
        JSONObject optJSONObject;
        JSONObject jSONObject;
        String str3;
        boolean z4;
        Object obj;
        o3 o3Var;
        b5 b5Var;
        x1 x1Var;
        int i3;
        int i4;
        String adUnitId = str;
        da daVar2 = daVar;
        Intrinsics.checkNotNullParameter(errorResponse, "adStringResponse");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        if (!StringsKt.isBlank(errorResponse)) {
            Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
            JSONObject jSONObject2 = new JSONObject(errorResponse);
            String str4 = "message";
            if (!jSONObject2.has("error")) {
                JSONArray optJSONArray = new JSONObject(errorResponse).optJSONArray("ad");
                if (optJSONArray != null) {
                    if (optJSONArray.length() != 0) {
                        ArrayList arrayList = new ArrayList();
                        int length = optJSONArray.length();
                        int i5 = 0;
                        while (i5 < length) {
                            b bVar = new b();
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(i5);
                            JSONArray jSONArray = optJSONArray;
                            JSONObject optJSONObject2 = jSONObject3.optJSONObject(POBConstants.KEY_FORMAT);
                            int i6 = length;
                            JSONObject optJSONObject3 = jSONObject3.optJSONObject("ad_track_urls");
                            String str5 = str4;
                            String optString = jSONObject3.optString("ad_content");
                            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                            Intrinsics.checkNotNullParameter(optString, "<set-?>");
                            bVar.c = optString;
                            String optString2 = jSONObject3.optString(CampaignEx.JSON_KEY_IMPRESSION_URL);
                            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                            Intrinsics.checkNotNullParameter(optString2, "<set-?>");
                            bVar.e = optString2;
                            ArrayList arrayList2 = arrayList;
                            String optString3 = jSONObject3.optString("id");
                            Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
                            Intrinsics.checkNotNullParameter(optString3, "<set-?>");
                            bVar.b = optString3;
                            JSONObject optJSONObject4 = jSONObject3.optJSONObject(X3.i.F0);
                            String optString4 = optJSONObject4 != null ? optJSONObject4.optString("id") : null;
                            if (optString4 == null) {
                                optString4 = "";
                            }
                            Intrinsics.checkNotNullParameter(optString4, "<set-?>");
                            bVar.f = optString4;
                            String optString5 = jSONObject3.optString("campaign_id");
                            Intrinsics.checkNotNullExpressionValue(optString5, "optString(...)");
                            Intrinsics.checkNotNullParameter(optString5, "<set-?>");
                            bVar.g = optString5;
                            String optString6 = jSONObject3.optString("creative_id");
                            Intrinsics.checkNotNullExpressionValue(optString6, "optString(...)");
                            Intrinsics.checkNotNullParameter(optString6, "<set-?>");
                            bVar.h = optString6;
                            String optString7 = optJSONObject2 != null ? optJSONObject2.optString("webview_base_url") : null;
                            if (optString7 == null) {
                                optString7 = "";
                            }
                            Intrinsics.checkNotNullParameter(optString7, "<set-?>");
                            bVar.i = optString7;
                            String optString8 = optJSONObject2 != null ? optJSONObject2.optString("mraid_download_url") : null;
                            if (optString8 == null) {
                                optString8 = "";
                            }
                            Intrinsics.checkNotNullParameter(optString8, "<set-?>");
                            bVar.l = optString8;
                            if (optJSONObject2 != null) {
                                i = i5;
                                i2 = optJSONObject2.optInt("max_attempts_reload", bVar.L);
                            } else {
                                i = i5;
                                i2 = bVar.L;
                            }
                            bVar.L = i2;
                            bVar.p = jSONObject3.optBoolean(CampaignEx.KEY_OMID, false);
                            bVar.q = jSONObject3.optBoolean("is_video", false);
                            JSONObject optJSONObject5 = jSONObject3.optJSONObject("overlay");
                            ja jaVar = new ja();
                            if (daVar2 != null) {
                                jaVar.a = !((optJSONObject5 == null || optJSONObject5.optBoolean("draggable", true)) ? false : true);
                                JSONObject optJSONObject6 = optJSONObject5 != null ? optJSONObject5.optJSONObject("initial_size") : null;
                                if (optJSONObject6 != null) {
                                    i3 = optJSONObject6.optInt("width");
                                } else {
                                    i3 = daVar2.a;
                                }
                                jaVar.b = ib.a(i3);
                                if (optJSONObject6 != null) {
                                    i4 = optJSONObject6.getInt("height");
                                } else {
                                    i4 = daVar2.b;
                                }
                                jaVar.c = ib.a(i4);
                            }
                            Intrinsics.checkNotNullParameter(jaVar, "<set-?>");
                            bVar.m = jaVar;
                            JSONObject optJSONObject7 = jSONObject3.optJSONObject("ad_unit");
                            String optString9 = jSONObject3.optString("id");
                            y yVar = new y();
                            if (optJSONObject7 != null) {
                                Intrinsics.checkNotNullParameter(adUnitId, "<set-?>");
                                yVar.a = adUnitId;
                                if (optString9 == null) {
                                    optString9 = "";
                                }
                                Intrinsics.checkNotNullParameter(optString9, "<set-?>");
                                yVar.b = optString9;
                                String optString10 = optJSONObject7.optString("type");
                                if (optString10 == null) {
                                    optString10 = "";
                                }
                                Intrinsics.checkNotNullParameter(optString10, "<set-?>");
                                yVar.c = optString10;
                                if (Intrinsics.areEqual(optString10, "optin_video")) {
                                    String optString11 = optJSONObject7.optString("app_user_id");
                                    if (optString11 == null) {
                                        optString11 = "";
                                    }
                                    Intrinsics.checkNotNullParameter(optString11, "<set-?>");
                                    String optString12 = optJSONObject7.optString("reward_launch");
                                    if (optString12 == null) {
                                        optString12 = "";
                                    }
                                    Intrinsics.checkNotNullParameter(optString12, "<set-?>");
                                    yVar.d = optString12;
                                    tg tgVar = yVar.e;
                                    String optString13 = optJSONObject7.optString(CampaignEx.JSON_KEY_REWARD_NAME);
                                    if (optString13 == null) {
                                        optString13 = "";
                                    }
                                    tgVar.getClass();
                                    Intrinsics.checkNotNullParameter(optString13, "<set-?>");
                                    tgVar.a = optString13;
                                    tg tgVar2 = yVar.e;
                                    String optString14 = optJSONObject7.optString("reward_value");
                                    if (optString14 == null) {
                                        optString14 = "";
                                    }
                                    tgVar2.getClass();
                                    Intrinsics.checkNotNullParameter(optString14, "<set-?>");
                                    tgVar2.b = optString14;
                                }
                            }
                            Intrinsics.checkNotNullParameter(yVar, "<set-?>");
                            bVar.n = yVar;
                            Intrinsics.checkNotNull(jSONObject3);
                            JSONArray optJSONArray2 = jSONObject3.optJSONArray("params");
                            if (optJSONArray2 != null) {
                                int length2 = optJSONArray2.length();
                                int i7 = 0;
                                while (i7 < length2) {
                                    JSONObject jSONObject4 = optJSONArray2.getJSONObject(i7);
                                    JSONArray jSONArray2 = optJSONArray2;
                                    int i8 = length2;
                                    if (Intrinsics.areEqual(jSONObject4.getString("name"), X3.i.n)) {
                                        string = jSONObject4.getString("value");
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        break;
                                    }
                                    i7++;
                                    optJSONArray2 = jSONArray2;
                                    length2 = i8;
                                }
                            }
                            string = "";
                            Intrinsics.checkNotNullParameter(string, "<set-?>");
                            bVar.d = string;
                            JSONArray optJSONArray3 = optJSONObject2 != null ? optJSONObject2.optJSONArray("params") : null;
                            if (optJSONArray3 == null) {
                                str2 = "";
                                z3 = true;
                            } else {
                                z3 = true;
                                int length3 = optJSONArray3.length() - 1;
                                while (true) {
                                    if (-1 >= length3) {
                                        break;
                                    }
                                    JSONObject jSONObject5 = optJSONArray3.getJSONObject(length3);
                                    if (Intrinsics.areEqual(jSONObject5.getString("name"), "zones")) {
                                        JSONArray optJSONArray4 = jSONObject5.optJSONArray("value");
                                        str2 = (optJSONArray4 == null || (optJSONObject = optJSONArray4.optJSONObject(0)) == null) ? null : optJSONObject.optString("name");
                                    } else {
                                        length3--;
                                    }
                                }
                                str2 = "";
                            }
                            Intrinsics.checkNotNullParameter(str2, "<set-?>");
                            bVar.k = str2;
                            String optString15 = jSONObject3.optString("client_tracker_pattern", "");
                            if (Intrinsics.areEqual(optString15, POBCommonConstants.NULL_VALUE)) {
                                optString15 = "";
                            }
                            Intrinsics.checkNotNull(optString15);
                            Intrinsics.checkNotNullParameter(optString15, "<set-?>");
                            bVar.j = optString15;
                            bVar.o = jSONObject3.optBoolean("has_transparency", false);
                            String optString16 = jSONObject3.optString("sdk_close_button_url", "");
                            Intrinsics.checkNotNullExpressionValue(optString16, "optString(...)");
                            Intrinsics.checkNotNullParameter(optString16, "<set-?>");
                            bVar.r = optString16;
                            String optString17 = jSONObject3.optString("landing_page_prefetch_url", "");
                            Intrinsics.checkNotNullExpressionValue(optString17, "optString(...)");
                            Intrinsics.checkNotNullParameter(optString17, "<set-?>");
                            bVar.s = optString17;
                            bVar.t = jSONObject3.optBoolean("landing_page_disable_javascript", false);
                            String optString18 = jSONObject3.optString("landing_page_prefetch_whitelist", "");
                            Intrinsics.checkNotNullExpressionValue(optString18, "optString(...)");
                            Intrinsics.checkNotNullParameter(optString18, "<set-?>");
                            bVar.u = optString18;
                            DebugUtils.INSTANCE.isDebug();
                            bVar.w = jSONObject3.optBoolean("ad_keep_alive", false);
                            String str6 = UUID.randomUUID().toString() + bVar.g;
                            Intrinsics.checkNotNullParameter(str6, "<set-?>");
                            bVar.a = str6;
                            bVar.v = (jSONObject3.has("overlay") || jSONObject3.has("banner")) ? false : z3;
                            Intrinsics.checkNotNullParameter(adType, "<set-?>");
                            bVar.x = adType;
                            if (bVar.n.c.length() != 0) {
                                if (Intrinsics.areEqual(bVar.n.c, adType.a)) {
                                    if (optJSONObject3 != null) {
                                        jSONObject = optJSONObject3;
                                        str3 = jSONObject.optString("ad_track_url");
                                    } else {
                                        jSONObject = optJSONObject3;
                                        str3 = null;
                                    }
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    Intrinsics.checkNotNullParameter(str3, "<set-?>");
                                    bVar.C = str3;
                                    String optString19 = jSONObject != null ? jSONObject.optString("ad_precache_url") : null;
                                    if (optString19 == null) {
                                        optString19 = "";
                                    }
                                    Intrinsics.checkNotNullParameter(optString19, "<set-?>");
                                    bVar.D = optString19;
                                    String optString20 = jSONObject != null ? jSONObject.optString("ad_history_url") : null;
                                    if (optString20 == null) {
                                        optString20 = "";
                                    }
                                    Intrinsics.checkNotNullParameter(optString20, "<set-?>");
                                    bVar.E = optString20;
                                    JSONObject optJSONObject8 = jSONObject3.optJSONObject("banner");
                                    z0 z0Var = new z0();
                                    if (optJSONObject8 == null) {
                                        z0Var = new z0();
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                        z0Var.a = optJSONObject8.optBoolean("full_width", false);
                                        optJSONObject8.optBoolean("auto_refresh", false);
                                        optJSONObject8.optInt("auto_refresh_rate", 0);
                                        JSONObject optJSONObject9 = optJSONObject8.optJSONObject("creative_size");
                                        z0Var.b = optJSONObject9 != null ? new hh(optJSONObject9.optInt("w", 0), optJSONObject9.optInt("h", 0)) : null;
                                        z0Var.c = hhVar;
                                    }
                                    Intrinsics.checkNotNullParameter(z0Var, "<set-?>");
                                    bVar.y = z0Var;
                                    boolean optBoolean = jSONObject3.optBoolean("is_impression", z4);
                                    String impressionSourceString = jSONObject3.optString("impression_source", "");
                                    Intrinsics.checkNotNull(impressionSourceString);
                                    Intrinsics.checkNotNullParameter(impressionSourceString, "impressionSourceString");
                                    if (Intrinsics.areEqual(impressionSourceString, "sdk")) {
                                        o3Var = o3.b;
                                        obj = POBConstants.KEY_FORMAT;
                                    } else {
                                        obj = POBConstants.KEY_FORMAT;
                                        o3Var = Intrinsics.areEqual(impressionSourceString, obj) ? o3.a : o3.a;
                                    }
                                    n3 n3Var = new n3(optBoolean, o3Var);
                                    Intrinsics.checkNotNullParameter(n3Var, "<set-?>");
                                    bVar.z = n3Var;
                                    String loadedSourceString = jSONObject3.optString("loaded_source", "");
                                    Intrinsics.checkNotNull(loadedSourceString);
                                    Intrinsics.checkNotNullParameter(loadedSourceString, "loadedSourceString");
                                    if (Intrinsics.areEqual(loadedSourceString, "sdk")) {
                                        b5Var = b5.b;
                                    } else {
                                        b5Var = Intrinsics.areEqual(loadedSourceString, obj) ? b5.a : b5.a;
                                    }
                                    a5 a5Var = new a5(b5Var);
                                    Intrinsics.checkNotNullParameter(a5Var, "<set-?>");
                                    bVar.A = a5Var;
                                    JSONArray optJSONArray5 = jSONObject3.optJSONArray("extras");
                                    bVar.B = optJSONArray5 != null ? optJSONArray5.toString() : null;
                                    Intrinsics.checkNotNullParameter(sessionId, "<set-?>");
                                    bVar.F = sessionId;
                                    i5 = i + 1;
                                    if (jSONObject3.has("cache")) {
                                        JSONObject optJSONObject10 = jSONObject3.optJSONObject("cache");
                                        x1Var = new x1(optJSONObject10 != null ? Long.valueOf(optJSONObject10.optLong("ad_expiration")) : null);
                                    } else {
                                        x1Var = null;
                                    }
                                    bVar.G = x1Var;
                                    bVar.H = z;
                                    bVar.J = z2;
                                    bVar.I = oguryMediation;
                                    arrayList2.add(bVar);
                                    daVar2 = daVar;
                                    arrayList = arrayList2;
                                    optJSONArray = jSONArray;
                                    length = i6;
                                    str4 = str5;
                                    adUnitId = str;
                                } else {
                                    String str7 = adType.b;
                                    y yVar2 = bVar.n;
                                    String str8 = yVar2.a;
                                    w wVar = x.c;
                                    String str9 = yVar2.c;
                                    wVar.getClass();
                                    String str10 = X3.j.d + str7 + "][Load][" + str8 + "]Wrong ad unit id type. Expected ad unit id of type " + str7 + ", but received ad unit id of type " + w.a(str9) + ".";
                                    Intrinsics.checkNotNullParameter(str10, str5);
                                    IntegrationLogger.e(LogTag.INTERNAL, SourceTag.ADS, str10);
                                    a("Type mismatch. Awaited (" + adType.b + ") - received (" + w.a(bVar.n.c) + ")");
                                    throw null;
                                }
                            } else {
                                a("Ad unit type not found");
                                throw null;
                            }
                        }
                        ArrayList arrayList3 = arrayList;
                        if (!arrayList3.isEmpty()) {
                            return new q(arrayList3);
                        }
                        a("No ads could be parsed");
                        throw null;
                    }
                    a("The ad object is empty");
                    throw null;
                }
                a("No ad object found");
                throw null;
            }
            JSONObject jSONObject6 = jSONObject2.getJSONObject("error");
            a9 a9Var = new a9(7, null);
            String optString21 = jSONObject6.optString("type", "");
            Intrinsics.checkNotNullExpressionValue(optString21, "optString(...)");
            Intrinsics.checkNotNullParameter(optString21, "<set-?>");
            String optString22 = jSONObject6.optString("message", "");
            Intrinsics.checkNotNullExpressionValue(optString22, "optString(...)");
            Intrinsics.checkNotNullParameter(optString22, "<set-?>");
            a9Var.a = optString22;
            throw new ph(a9Var, nh.b);
        }
        a("Ad response is empty");
        throw null;
    }
}
