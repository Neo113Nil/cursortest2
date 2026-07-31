package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺮ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1272 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f3435;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualitySegment f3436;

    public C1272(C1213 c1213, ISAdQualitySegment iSAdQualitySegment) {
        this.f3435 = c1213;
        this.f3436 = iSAdQualitySegment;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        boolean z;
        C1213 c1213 = this.f3435;
        synchronized (c1213) {
            z = c1213.f3200;
        }
        if (!z) {
            AbstractC0580.m4074(StringFog.decrypt("49AKHBio/VTb5x8i\n", "orRbaXnElCA=\n"), StringFog.decrypt("iSdiHwOJJn2+Zn9dEMQwdr5mIRg++hR8mzNtVB7dLDiZAkcYHtp1dqUyLFEZwCFxqyplQhLNew==\n", "ykYMOHepVRg=\n"));
            return;
        }
        C0672 c0672 = this.f3435.f3184;
        if (c0672 != null) {
            ISAdQualitySegment iSAdQualitySegment = this.f3436;
            C1086 c1086 = c0672.f1427;
            String decrypt = StringFog.decrypt("2S2Uso74gJ3PJpQ=\n", "qkjg7f2d5/A=\n");
            JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
            try {
                if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                    jSONObject.put(StringFog.decrypt("tZKdiA==\n", "xvXz5bbxXV8=\n"), iSAdQualitySegment.getName());
                }
                if (iSAdQualitySegment.getAge() != -1) {
                    jSONObject.put(StringFog.decrypt("p3pU4A==\n", "1BszhRm3GGc=\n"), iSAdQualitySegment.getAge());
                }
                if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                    jSONObject.put(StringFog.decrypt("pb80nA==\n", "1thR8herSTk=\n"), iSAdQualitySegment.getGender());
                }
                if (iSAdQualitySegment.getLevel() != -1) {
                    jSONObject.put(StringFog.decrypt("DFQgDw==\n", "fzhWY/YYt1Y=\n"), iSAdQualitySegment.getLevel());
                }
                if (iSAdQualitySegment.getIsPaying() != null) {
                    jSONObject.put(StringFog.decrypt("CFhaGw==\n", "eyg7Yvep1ow=\n"), iSAdQualitySegment.getIsPaying().get());
                }
                if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                    jSONObject.put(StringFog.decrypt("t4yxBJg=\n", "xOXQdOz3Ubs=\n"), iSAdQualitySegment.getInAppPurchasesTotal());
                }
                if (iSAdQualitySegment.getUserCreationDate() != 0) {
                    jSONObject.put(StringFog.decrypt("yXsqUg==\n", "ug5JNmeFfxs=\n"), iSAdQualitySegment.getUserCreationDate());
                }
            } catch (JSONException unused) {
            }
            c1086.m4388(decrypt, jSONObject);
        }
    }
}
