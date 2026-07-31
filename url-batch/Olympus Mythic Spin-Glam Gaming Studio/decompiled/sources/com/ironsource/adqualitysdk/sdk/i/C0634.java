package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.nio.charset.Charset;
import java.util.Calendar;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ذ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0634 extends AbstractRunnableC0913 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0545 f1272;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1153 f1273;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f1274;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0442 f1275;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1276;

    public C0634(C0545 c0545, String str, AbstractC0442 abstractC0442, String str2, InterfaceC1153 interfaceC1153) {
        this.f1272 = c0545;
        this.f1276 = str;
        this.f1275 = abstractC0442;
        this.f1274 = str2;
        this.f1273 = interfaceC1153;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        boolean z;
        int i;
        String str = this.f1276;
        AbstractC0442 abstractC0442 = this.f1275;
        String str2 = this.f1274;
        InterfaceC1153 interfaceC1153 = this.f1273;
        C0951 c0951 = this.f1272.f613.f2439;
        synchronized (c0951) {
            z = c0951.f2268;
        }
        if (!z) {
            m4120(abstractC0442, interfaceC1153);
            return;
        }
        try {
            C1335 m4395 = AbstractC1099.m4395(str);
            if (m4395 != null && m4395.f3681.f3705 == 200) {
                String m4119 = m4119(m4395.f3682);
                if (!Charset.forName(StringFog.decrypt("taaubRiyN3U=\n", "4PWDLEvxfjw=\n")).newEncoder().canEncode(m4119)) {
                    AbstractC0577.m4068(StringFog.decrypt("Qb41hVwWaLY=\n", "E9tY6ihzLPQ=\n"), StringFog.decrypt("Ih5kvYN3gOMCW3S7iG6a4UYddaCXJw==\n", "ZnsHz/oH9IY=\n") + str + StringFog.decrypt("DwUmbOiwGx1cRiBs6rAeGktGKmr9owE=\n", "L2ZJApzRcnM=\n"), (Throwable) null, false);
                } else if (!TextUtils.isEmpty(m4119)) {
                    C0916 c0916 = this.f1272.f614;
                    c0916.m4243(str2, m4119);
                    String str3 = str2 + StringFog.decrypt("+tNYTIZ2XDW1y1w=\n", "1L85P/IDLFE=\n");
                    String str4 = AbstractC0530.f589;
                    c0916.m4243(str3, Long.toString(Calendar.getInstance().getTimeInMillis()));
                    AbstractC1026.m4314(new C0686(interfaceC1153, str2, m4119));
                }
            } else if (!this.f1272.f613.f2439.m4248()) {
                m4120(abstractC0442, interfaceC1153);
            } else if (m4395 != null && (((i = m4395.f3681.f3705) == 403 || i == 404) && str.contains(StringFog.decrypt("uas6kA==\n", "3MVMv95MRq8=\n")))) {
                abstractC0442.f317 = false;
                this.f1272.m4044(abstractC0442, interfaceC1153);
            }
        } catch (Exception e) {
            if (this.f1272.f613.f2439.m4248()) {
                AbstractC0577.m4068(StringFog.decrypt("BRntPrJnTvI=\n", "V3yAUcYCCrA=\n"), AbstractC0584.m4083("uHWbDiWZkE6Jc4APMJmFTpBonQR36oNZlGmOQTHLmEbd\n", "/QfpYVe59ys=\n", new StringBuilder(), str), (Throwable) e, false);
            } else {
                m4120(abstractC0442, interfaceC1153);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4119(String str) {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit(str);
        String optString = jsonObjectInit.optString(StringFog.decrypt("k/Zm\n", "9pgF+NNtt1I=\n"));
        if (TextUtils.isEmpty(optString)) {
            return str;
        }
        return AbstractC0530.m4037(optString, C0545.f610, jsonObjectInit.optString(StringFog.decrypt("gac=\n", "6NHyGFoL+iI=\n")), jsonObjectInit.optString(StringFog.decrypt("/aIEuA==\n", "jsNozKPM040=\n")));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4120(AbstractC0442 abstractC0442, InterfaceC1153 interfaceC1153) {
        C0951 c0951 = this.f1272.f613.f2439;
        C0653 c0653 = new C0653(this, abstractC0442, interfaceC1153);
        synchronized (c0951) {
            c0951.f2267.add(c0653);
        }
    }
}
