package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.system.NoProGuard;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class CampaignUnit extends b implements Serializable, NoProGuard {
    private static final String TAG = "CampaignUnit";

    @Override // com.mbridge.msdk.foundation.entity.b
    public String assembCParams() {
        String str;
        String str2;
        StringBuffer stringBuffer = this.cParams;
        if (stringBuffer != null && stringBuffer.length() > 0) {
            return this.cParams.toString();
        }
        try {
            String d = com.mbridge.msdk.foundation.tools.g.d();
            Context d2 = com.mbridge.msdk.foundation.controller.c.n().d();
            String r = m0.r(d2);
            String q = m0.q(d2);
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                str2 = String.valueOf(m0.s(d2));
                str = m0.n(d2) + VastAttributes.HORIZONTAL_POSITION + m0.m(d2);
            } else {
                str = "";
                str2 = str;
            }
            StringBuffer stringBuffer2 = this.cParams;
            stringBuffer2.append(getAdType());
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty("1"));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(Build.VERSION.RELEASE));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(MBConfiguration.SDK_VERSION));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(m0.o()));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(str));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(Integer.valueOf(m0.G(com.mbridge.msdk.foundation.controller.c.n().d()))));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(m0.p(com.mbridge.msdk.foundation.controller.c.n().d())));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(str2));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(q));
            stringBuffer2.append(nullToEmpty(r));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(d));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(m0.t()));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append("");
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(""));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(nullToEmpty(com.mbridge.msdk.foundation.same.a.V + StringUtils.COMMA + com.mbridge.msdk.foundation.same.a.g));
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            stringBuffer2.append(m0.j());
            stringBuffer2.append(com.safedk.android.analytics.brandsafety.m.ad);
            this.cParams = stringBuffer2;
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, th.getMessage(), th);
            }
        }
        return this.cParams.toString();
    }
}
