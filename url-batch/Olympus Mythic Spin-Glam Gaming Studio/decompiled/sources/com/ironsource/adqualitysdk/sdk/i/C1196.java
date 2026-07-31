package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭖ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1196 extends C0873 {

    /* renamed from: ףּ, reason: contains not printable characters */
    public final boolean f3098;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final boolean f3099;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final int f3100;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final String f3101;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final String f3102;

    public C1196(JSONObject jSONObject) {
        this.f3098 = false;
        this.f3102 = jSONObject.optString(StringFog.decrypt("qbOQ+9rF0+m8rp/5w8k=\n", "yNfRmK6spYA=\n"));
        this.f3101 = jSONObject.optString(StringFog.decrypt("zSJkvJYMqqDWJnWZsQiwhuo1Y4yWEQ==\n", "ukcG6v9p3eM=\n"));
        this.f3100 = jSONObject.optInt(StringFog.decrypt("SWBFiYEaBeNa\n", "PgUn3+h/cqo=\n"), -1);
        this.f3099 = jSONObject.optBoolean(StringFog.decrypt("a0+cElxP879nQZQFUVrpu2s=\n", "Djf9cSgOkMs=\n"));
        this.f3098 = jSONObject.optBoolean(StringFog.decrypt("rOAXVxFW8fWs4AhnPlXZ8qHiGg==\n", "zYNjFHA6nZc=\n"));
        this.f2112 = jSONObject.optString(StringFog.decrypt("C1RYuzJC1ggCUw==\n", "YScM1HssvG0=\n"));
        ArrayList arrayList = null;
        this.f2111 = TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("3y1jzfgTFqfS\n", "ql8PnYp2cM4=\n"))) ? null : Arrays.asList(jSONObject.optString(StringFog.decrypt("kwTLpSxSc2Ke\n", "5nan9V43FQs=\n")).split(StringFog.decrypt("YA==\n", "TMIo+/tEe4w=\n")));
        this.f2110 = jSONObject.optBoolean(StringFog.decrypt("uyi2sY2kAlqrLJuHm64=\n", "zlvT5ujGVDM=\n"));
        boolean z = true;
        this.f2109 = jSONObject.optBoolean(StringFog.decrypt("gz144rXk+3yVPHTYoA==\n", "9k4dqNSSmg8=\n"), true);
        if (TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("+sp7xp4tvsLzzQ==\n", "kLkvqddD1Kc=\n"))) && !jSONObject.optBoolean(StringFog.decrypt("ynCsM9aR/6fadIoI2pbHug==\n", "vwPJZLPzqc4=\n")) && !jSONObject.optBoolean(StringFog.decrypt("QD7YJge3YHdHItAUIblKels5\n", "NU29cWLVIx8=\n"))) {
            z = false;
        }
        this.f2107 = z;
        this.f2106 = jSONObject.optBoolean(StringFog.decrypt("WBB/IDdMDUdIFFkbO0s1Wg==\n", "LWMad1IuWy4=\n"));
        this.f2105 = jSONObject.optBoolean(StringFog.decrypt("1r6YyYu3Z2jpvg==\n", "o839jPPDFQk=\n"));
        this.f2108 = jSONObject.optBoolean(StringFog.decrypt("CGgIapEGSxwNdwhwgQhpHBhsHg==\n", "fRttJ+RqP3U=\n"));
        this.f2104 = jSONObject.optBoolean(StringFog.decrypt("auOMKaZpvK9O+JMprnezr3Q=\n", "B5bgXc8Z0Mo=\n"));
        this.f2103 = jSONObject.optBoolean(StringFog.decrypt("y4w3KrjGIPLW\n", "ouFHZdaWT4E=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("mDTUsTNwlyWJM960JQ==\n", "7l2xxkAk+Gw=\n"));
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
