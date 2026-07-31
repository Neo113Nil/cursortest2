package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.แ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0749 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f1674;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f1675;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final List f1676;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final JSONObject f1677;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType f1678;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f1679;

    static {
        StringFog.decrypt("VBplHw==\n", "IGMVeuTmOzM=\n");
        StringFog.decrypt("HWIF9tZT\n", "fAZRj6Y2UVA=\n");
        StringFog.decrypt("THUVP+f+\n", "PBRnXoqNvoU=\n");
        StringFog.decrypt("FltP3HiT7GgSSw==\n", "dzg7tQ76mAE=\n");
        StringFog.decrypt("ouGhCLGoypOx+g==\n", "1IjEf/fBpuc=\n");
        StringFog.decrypt("/Y9RflDHSRrNj0dcXNA=\n", "iuozKDmiPmk=\n");
    }

    public C0749(JSONObject jSONObject) {
        this.f1678 = ISAdQualityAdType.UNKNOWN;
        this.f1679 = AbstractC0471.m4008(jSONObject.optString(StringFog.decrypt("sjdWlQ==\n", "xk4m8AGH+gQ=\n")));
        String m4008 = AbstractC0471.m4008(jSONObject.optString(StringFog.decrypt("Fz+zFCDD\n", "dlvnbVCm32A=\n")));
        if (!TextUtils.isEmpty(m4008)) {
            this.f1678 = ISAdQualityAdType.fromInt(Integer.parseInt(m4008));
        }
        this.f1677 = jSONObject.optJSONObject(StringFog.decrypt("ucq4QY5n\n", "yavKIOMUJSM=\n"));
        String decrypt = StringFog.decrypt("UES4n+SM5udUVA==\n", "MSfM9pLlko4=\n");
        List arrayList = new ArrayList();
        String str = AbstractC1006.f2436;
        JSONArray optJSONArray = jSONObject.optJSONArray(decrypt);
        this.f1676 = optJSONArray != null ? AbstractC1006.m4289(optJSONArray) : arrayList;
        this.f1675 = AbstractC0471.m4008(jSONObject.optString(StringFog.decrypt("V+quqJZp7h1E8Q==\n", "IYPL39AAgmk=\n")));
        this.f1674 = AbstractC0471.m4008(jSONObject.optString(StringFog.decrypt("2Kq4UNWDHZjoqq5y2ZQ=\n", "r8/aBrzmaus=\n")));
    }
}
