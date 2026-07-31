package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᚁ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0948 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0940 f2256;

    public C0948(C0940 c0940) {
        this.f2256 = c0940;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0696 c0696;
        boolean mo4038;
        if (C0791.m4189(this.f2256.f2237).containsKey(this.f2256.f2244.f1857.f2831) || (c0696 = this.f2256.f2237.f1867) == null) {
            return;
        }
        AbstractC1026.m4312(new C0712(c0696, this.f2256.f2244.f1857.f2831, EnumC0724.f1644));
        C0940 c0940 = this.f2256;
        JSONObject m4193 = C0791.m4193(c0940.f2237, c0940.f2244);
        try {
            m4193.put(StringFog.decrypt("AuJY\n", "Y5QrOEUP+90=\n"), false);
        } catch (JSONException unused) {
        }
        C0791.m4192(this.f2256.f2237).put(this.f2256.f2244.f1857.f2831, m4193);
        C0715 m4141 = c0696.m4141(this.f2256.f2244.f1857.f2831);
        String m4149 = m4141 != null ? m4141.m4149(m4141.f1583) : null;
        C0791.m4189(this.f2256.f2237).put(this.f2256.f2244.f1857.f2831, m4149);
        C0786 c0786 = this.f2256.f2244;
        synchronized (c0786) {
            mo4038 = c0786.f1854.mo4038();
        }
        if (mo4038) {
            ISAdQualityInitListener m4202 = this.f2256.f2237.m4202();
            ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2256.f2244.f1857.f2830);
            sb.append(StringFog.decrypt("wM1A4u0M3bWT10vn7Q==\n", "4L4kic16uMc=\n"));
            sb.append(this.f2256.f2244.f1854.m4101());
            sb.append(StringFog.decrypt("Dxk+oox9MXNcSwi8lnkvdw8YP7jZYiZkXAI0vdk=\n", "L2tb0/kUQxY=\n"));
            sb.append(this.f2256.f2244.m4185());
            ((C0373) m4202).adQualitySdkInitFailed(iSAdQualityInitError, AbstractC1293.m4543("nT5bAeQJzVjP\n", "vVEpIYpsuj0=\n", sb));
        }
        AbstractC0577.m4069(StringFog.decrypt("FCO8Lm9J5tclAbMua033yg==\n", "V0zSQAoqkrg=\n"), m4149, null, true, true, false);
    }
}
