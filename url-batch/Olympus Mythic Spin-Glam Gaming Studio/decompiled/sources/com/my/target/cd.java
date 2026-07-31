package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.common.models.Disclaimer;
import com.my.target.nativeads.banners.NativeBanner;
import com.my.target.nativeads.banners.NativePromoBanner;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class cd {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, NativePromoBanner nativePromoBanner, Context context) {
        a(a(str, nativePromoBanner.getNavigationType(), nativePromoBanner.getStoreType(), nativePromoBanner.getTitle(), nativePromoBanner.getCtaText(), nativePromoBanner.getDomain(), nativePromoBanner.getAgeRestrictions(), nativePromoBanner.getDisclaimer(), nativePromoBanner.getDisclaimerInfo(), nativePromoBanner.getDescription(), nativePromoBanner.getRating(), nativePromoBanner.getVotes(), nativePromoBanner.hasVideo(), context));
    }

    public static void b(final String str, final NativePromoBanner nativePromoBanner, final Context context) {
        o0.d(new Runnable() { // from class: com.my.target.cd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                cd.a(str, nativePromoBanner, context);
            }
        });
    }

    public static void b(final String str, final NativeBanner nativeBanner, final Context context) {
        o0.d(new Runnable() { // from class: com.my.target.cd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                cd.a(str, nativeBanner, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, NativeBanner nativeBanner, Context context) {
        a(a(str, nativeBanner.getNavigationType(), nativeBanner.getStoreType(), nativeBanner.getTitle(), nativeBanner.getCtaText(), nativeBanner.getDomain(), nativeBanner.getAgeRestrictions(), nativeBanner.getDisclaimer(), nativeBanner.getDisclaimerInfo(), nativeBanner.getDescription(), nativeBanner.getRating(), nativeBanner.getVotes(), false, context));
    }

    static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Disclaimer disclaimer, String str9, float f, int i, boolean z, Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("instance_id", u4.b().a(context));
            jSONObject.put("network", str);
            jSONObject.put("navigationType", str2);
            a(jSONObject, "storeType", str3);
            a(jSONObject, "title", str4);
            a(jSONObject, "ctaText", str5);
            a(jSONObject, "domain", str6);
            a(jSONObject, "ageRestrictions", str7);
            a(jSONObject, UnifiedMediationParams.KEY_DISCLAIMER, str8);
            if (disclaimer != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("disclaimerType", disclaimer.disclaimerType);
                jSONObject2.put("disclaimerText", disclaimer.text);
                jSONObject.put("disclaimerInfo", jSONObject2);
            }
            if (f > 0.0f) {
                jSONObject.put("rating", String.valueOf(f));
            }
            if (i > 0) {
                jSONObject.put("votes", String.valueOf(i));
            }
            a(jSONObject, "description", str9);
            if (z) {
                jSONObject.put("hasVideo", "true");
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    static void a(String str) {
        if (str == null) {
            return;
        }
        j5.a().a("https://ad.mail.ru/mobile/adcontext", p4.b(str));
    }

    private static void a(JSONObject jSONObject, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }
}
