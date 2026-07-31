package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ẓ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1061 extends AbstractRunnableC0913 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C1052 f2677;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C1143 f2678;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2679;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2680;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f2681;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2682;

    public C1061(C1052 c1052, String str, JSONObject jSONObject, JSONObject jSONObject2, boolean z, C1143 c1143) {
        this.f2677 = c1052;
        this.f2682 = str;
        this.f2681 = jSONObject;
        this.f2680 = jSONObject2;
        this.f2679 = z;
        this.f2678 = c1143;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (this.f2682.equals(StringFog.decrypt("f2hY5QjtIi54bGbkGQ==\n", "CxgHlm2eUXE=\n"))) {
            this.f2677.f2657++;
        }
        C1052 c1052 = this.f2677;
        int i = c1052.f2656;
        c1052.f2656 = i + 1;
        JSONObject m4291 = AbstractC1006.m4291(this.f2681, false);
        m4291.put(StringFog.decrypt("7f3IZw==\n", "g5ylAtB0eRs=\n"), this.f2682);
        m4291.put(StringFog.decrypt("zKg=\n", "qcazBgqZPsc=\n"), i);
        String decrypt = StringFog.decrypt("eUir9LNpIGlm\n", "DTrKl9YLQQo=\n");
        JSONObject jSONObject = this.f2680;
        if (jSONObject != null) {
            decrypt = jSONObject.optString(AbstractC1183.f3069);
            String str = AbstractC1183.f3023;
            m4291.put(str, this.f2680.optString(str, null));
        }
        if (TextUtils.isEmpty(decrypt)) {
            decrypt = StringFog.decrypt("Td5ipQ==\n", "I7EMwC2i1eM=\n");
        }
        m4291.put(AbstractC1183.f3068, decrypt);
        String str2 = AbstractC1183.f3067;
        if (!m4291.has(str2)) {
            m4291.put(str2, decrypt);
        }
        AbstractC1026.m4313(new C1068(this, this.f2677.mo4064(m4291, this.f2679, true, this.f2682.equals(StringFog.decrypt("d3t5Tjouyg==\n", "AwsmJ1RHvkc=\n")))));
    }
}
