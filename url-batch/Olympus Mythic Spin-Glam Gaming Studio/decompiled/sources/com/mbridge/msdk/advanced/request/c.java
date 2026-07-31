package com.mbridge.msdk.advanced.request;

import android.content.Context;
import android.os.Build;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.out.MBConfiguration;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* compiled from: NativeAdvancedMBLoadRequest.java */
/* loaded from: classes4.dex */
public class c extends com.mbridge.msdk.foundation.same.net.wrapper.b {
    public c(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.a, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        super.addExtraParams(str, eVar);
        eVar.a("platform", "1");
        eVar.a(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
        eVar.a("package_name", m0.t(this.mContext));
        eVar.a(CommonUrlParts.APP_VERSION, m0.C(this.mContext));
        eVar.a("app_version_code", m0.B(this.mContext) + "");
        eVar.a(X3.i.n, m0.G(this.mContext) + "");
        eVar.a("model", m0.o());
        eVar.a("brand", m0.t());
        eVar.a(O6.X0, "");
        eVar.a("gaid2", g.c());
        int s = m0.s(this.mContext);
        eVar.a("network_type", s + "");
        eVar.a("network_str", m0.a(this.mContext, s) + "");
        eVar.a(POBConstants.KEY_LANGUAGE, m0.p(this.mContext));
        eVar.a("timezone", m0.y());
        eVar.a("useragent", m0.i());
        eVar.a("sdk_version", MBConfiguration.SDK_VERSION);
        eVar.a("screen_size", m0.n(this.mContext) + VastAttributes.HORIZONTAL_POSITION + m0.m(this.mContext));
        eVar.a("version_flag", "1");
        if (com.mbridge.msdk.util.b.a()) {
            eVar.a("gp_version", v.d(this.mContext));
        }
        com.mbridge.msdk.foundation.same.net.wrapper.f.a(eVar, this.mContext);
        com.mbridge.msdk.foundation.same.net.wrapper.f.b(eVar);
        com.mbridge.msdk.foundation.same.net.wrapper.f.j(eVar);
    }
}
