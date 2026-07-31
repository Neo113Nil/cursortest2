package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ℓ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C1112 {

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f2818;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f2819;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f2820;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f2821;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2822;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public HashMap f2823;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public C0785 f2824;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public C0484 f2825;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public String f2826;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f2827;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f2828;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f2829;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f2830;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f2831;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0785 f2832;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject f2833;

    static {
        StringFog.decrypt("P5wxIY813fsOsDAhjD/O\n", "fPNfT+pWqZQ=\n");
        StringFog.decrypt("++dFlw==\n", "lYYo8nsjMXk=\n");
        StringFog.decrypt("qTv7s0m9jAysP+0=\n", "zVKIwyXc9UI=\n");
        StringFog.decrypt("WsAGlrXLVg==\n", "LKV05dykOCc=\n");
        StringFog.decrypt("zdq6CHyC\n", "oLPUWxjpUIc=\n");
        StringFog.decrypt("niKXZX0d\n", "80PvNhl2UuQ=\n");
        f2822 = StringFog.decrypt("SeFl0spUwbhU8Vjj12bPslT2\n", "OoUOhqUVpt0=\n");
        f2821 = StringFog.decrypt("Y6v3Hc0Q/B5n\n", "FM6VS6R1i1Q=\n");
        f2820 = StringFog.decrypt("NlVtONZ4\n", "VToDS6ILGZU=\n");
        StringFog.decrypt("K65OHAspGuYisVUN\n", "TMIhfmpFWYk=\n");
        f2819 = StringFog.decrypt("Sdx9izubLQ==\n", "JLkQ6V7pXsA=\n");
        f2818 = StringFog.decrypt("RVaBK/68Zy1a\n", "KT/yX5vSAl8=\n");
        StringFog.decrypt("beMtEIDlPFI=\n", "DIdreeWJWCE=\n");
    }

    public C1112(String str, C0785 c0785) {
        this.f2833 = IronSourceNetworkBridge.jsonObjectInit();
        try {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
            this.f2833 = jsonObjectInit;
            this.f2832 = c0785;
            this.f2831 = jsonObjectInit.optString(StringFog.decrypt("nMnGRw==\n", "8qirIqHUNnw=\n"));
            this.f2830 = jsonObjectInit.optString(StringFog.decrypt("y9ToRY0QvnjO0P4=\n", "r72bNeFxxzY=\n"));
            this.f2829 = jsonObjectInit.optString(StringFog.decrypt("QYThg4zJhQ==\n", "N+GT8OWm660=\n"));
            this.f2828 = jsonObjectInit.optString(StringFog.decrypt("5LqQ+oR3\n", "idP+qeAc3Sg=\n"));
            this.f2827 = jsonObjectInit.optString(StringFog.decrypt("NJBBxUlP\n", "WfE5li0kj6k=\n"));
            if (jsonObjectInit.has(StringFog.decrypt("ttd7JD5m/2e/yGA1\n", "0bsURl8KvAg=\n"))) {
                JSONObject optJSONObject = jsonObjectInit.optJSONObject(StringFog.decrypt("GO5ncy4F2FIR8Xxi\n", "f4IIEU9pmz0=\n"));
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f2832.m4182(next, optJSONObject.opt(next));
                }
            }
        } catch (Throwable th) {
            AbstractC0844.m4219(this.f2831, StringFog.decrypt("OwwqgdNFXBQbHyyHzwIfBREQNovCEVAUXh03gMcMWA==\n", "fn5Y7qFlP2Y=\n"), th, null);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap m4407() {
        HashMap hashMap;
        String str = f2818;
        if (this.f2823 == null) {
            JSONObject optJSONObject = this.f2833.optJSONObject(str);
            if (optJSONObject != null) {
                hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, new C0754(this.f2831, next, optJSONObject.optJSONObject(next)));
                }
            } else {
                hashMap = null;
            }
            this.f2823 = hashMap;
        }
        return this.f2823;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0785 m4408() {
        ArrayList arrayList;
        if (this.f2824 == null) {
            C0785 c0785 = new C0785(AbstractC1006.m4288(this.f2833.optJSONObject(f2820), new C1138(this)), this.f2832, true);
            this.f2824 = c0785;
            JSONArray optJSONArray = this.f2833.optJSONArray(f2819);
            if (optJSONArray != null) {
                arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String m4008 = AbstractC0471.m4008(optJSONArray.optString(i));
                    if (m4008 != null) {
                        arrayList.add(m4008);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0785.f1850.put((String) it.next(), null);
                }
            }
        }
        return this.f2824;
    }
}
