package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.з, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0546 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C1086 f625;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Handler f626;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C1353 f627;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f622 = StringFog.decrypt("u7fqmXefUgyapP0=\n", "/sGP9wPMN2I=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f621 = StringFog.decrypt("/wNjeIxfaW37BA==\n", "nmAXJ/w+HB4=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f620 = StringFog.decrypt("a2NhzVqKBqtnZXE=\n", "CgAVkijvdd4=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f619 = StringFog.decrypt("v3rCOvQy2MuqfNI=\n", "3hm2ZZdAvao=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f618 = StringFog.decrypt("xbtzT4LFNljQvWM=\n", "pNgHEPGxVyo=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f617 = StringFog.decrypt("Ap+/YpCo+nsTma8=\n", "Y/zLPePclQs=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f616 = StringFog.decrypt("l8z5/Q0juSmEwPTHDQ==\n", "9q+NomlGyl0=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f615 = StringFog.decrypt("0VXVcsTzDWvUadJZ1uYe\n", "sDahLbeSew4=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashSet f624 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashSet f623 = new HashSet();

    public C0546(Handler handler, C1086 c1086) {
        this.f625 = c1086;
        this.f626 = handler;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4046(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        synchronized (this.f623) {
            try {
                String str5 = str3 + StringFog.decrypt("MA==\n", "Crjki8rnd9M=\n") + str2;
                if (!this.f623.contains(str5) || z || AbstractC0590.m4087().mo4093()) {
                    this.f623.add(str5);
                    if (Math.random() * 100.0d >= m4045()) {
                        AbstractC0580.m4073(f622, StringFog.decrypt("ha3ANVfO7Vqvo5MiRuPsQbOrwXZTyuxdteSedlLV7V3msJMmV8/6E7WswTNF1OZfpQ==\n", "wcSzVja8iTM=\n"));
                        return;
                    }
                    this.f625.getClass();
                    JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                    try {
                        jsonObjectInit.put(StringFog.decrypt("fQVk9AA=\n", "GHcQlWf/jUg=\n"), str);
                        jsonObjectInit.put(StringFog.decrypt("wosxSdw=\n", "p/lcOruXtvw=\n"), str2);
                        jsonObjectInit.put(StringFog.decrypt("VXWjK+hv\n", "MAfARIwK9AY=\n"), str3);
                        if (!TextUtils.isEmpty(str4)) {
                            jsonObjectInit.put(StringFog.decrypt("p4jomzA=\n", "wvqb71sXTxE=\n"), str4);
                        }
                        if (jSONObject != null) {
                            AbstractC1006.m4293(jsonObjectInit, jSONObject, false);
                        }
                    } catch (JSONException e) {
                        String str6 = C1086.f2754;
                        AbstractC0580.m4080(str6, str6, StringFog.decrypt("sIMz0yuD++6RmC/becbo+JqDYdE80OnrkpQ=\n", "9fFBvFmjmoo=\n"), e, null, false);
                    }
                    String decrypt = StringFog.decrypt("1EUUXRyfc4A=\n", "oDVLOG7tHPI=\n");
                    Iterator it = new HashSet(this.f624).iterator();
                    while (it.hasNext()) {
                        JSONObject mo4239 = ((InterfaceC1078) it.next()).mo4239(decrypt, jsonObjectInit);
                        if (mo4239 != null) {
                            AbstractC1006.m4293(jsonObjectInit, mo4239, false);
                        }
                    }
                    this.f625.m4388(StringFog.decrypt("1LeVvyGgGGw=\n", "oMfK2lPSdx4=\n"), jsonObjectInit);
                }
            } finally {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static double m4045() {
        JSONObject jSONObject;
        if (((C0600) AbstractC0590.m4087()).f1007) {
            return 100.0d;
        }
        C0600 c0600 = (C0600) AbstractC0590.m4087();
        synchronized (c0600) {
            jSONObject = c0600.f2998;
        }
        return jSONObject.optDouble(StringFog.decrypt("bRfP\n", "GXK/UpvDGZ0=\n"), 5.0d);
    }
}
