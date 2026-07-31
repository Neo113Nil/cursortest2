package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class r extends C0873 {

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final String f160;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f161;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f162;

    public r() {
    }

    public r(JSONObject jSONObject) {
        this.f161 = jSONObject.optString(StringFog.decrypt("66cjju3YuVPwozKrytyjdcywJL7txQ==\n", "nMJB2IS9zhA=\n"));
        this.f162 = jSONObject.optString(StringFog.decrypt("gxk29c/VTYKGPjLv6Q==\n", "9XBTgoy5LPE=\n"));
        this.f160 = jSONObject.optString(StringFog.decrypt("bKyLJMcfGkR5uqkzzA0lVQ==\n", "HM35QalrTC0=\n"));
        this.f2112 = jSONObject.optString(StringFog.decrypt("nOYiwRagAFaV4Q==\n", "9pV2rl/OajM=\n"));
        this.f2110 = false;
        this.f2107 = !TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("Uo0fRsjyESRbig==\n", "OP5LKYGce0E=\n"))) || jSONObject.optBoolean(StringFog.decrypt("+Oj/oyt3Hqzo7NmYJ3AmsQ==\n", "jZua9E4VSMU=\n")) || jSONObject.optBoolean(StringFog.decrypt("fqpQHzsjhKN5tlgtHS2urmWt\n", "C9k1SF5Bx8s=\n"));
        this.f2106 = jSONObject.optBoolean(StringFog.decrypt("WVobv9HW/IdJXj2E3dHEmg==\n", "LCl+6LS0qu4=\n"));
        this.f2105 = jSONObject.optBoolean(StringFog.decrypt("uZJP0owjrauGkg==\n", "zOEql/RX38o=\n"));
        ArrayList arrayList = null;
        this.f2111 = TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("nbHqEEFziuaQ\n", "6MOGQDMW7I8=\n"))) ? null : Arrays.asList(jSONObject.optString(StringFog.decrypt("36aUYc9azwXS\n", "qtT4Mb0/qWw=\n")).split(StringFog.decrypt("xg==\n", "6rfNvcfAfKM=\n")));
        this.f2109 = jSONObject.optBoolean(StringFog.decrypt("mffi7YTGyvyP9u7XkQ==\n", "7ISHp+Wwq48=\n"), true);
        this.f2108 = false;
        this.f2104 = jSONObject.optBoolean(StringFog.decrypt("2lItJj1TX9j+STImNU1Q2MQ=\n", "tydBUlQjM70=\n"));
        this.f2103 = jSONObject.optBoolean(StringFog.decrypt("okTvBJ1XbFq/\n", "yymfS/MHAyk=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("FpiEbTd9VN8Hn45oIQ==\n", "YPHhGkQpO5Y=\n"));
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object opt = optJSONArray.opt(i);
                if (opt != null) {
                    arrayList.add(opt);
                }
            }
        }
        if (arrayList != null) {
            this.f2102 = arrayList;
        }
    }
}
