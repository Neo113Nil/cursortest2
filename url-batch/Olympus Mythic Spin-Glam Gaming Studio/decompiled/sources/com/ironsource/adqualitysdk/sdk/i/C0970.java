package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴫ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0970 extends AbstractRunnableC0913 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f2320;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2321;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2322;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0786 f2323;

    public C0970(C0791 c0791, C0786 c0786, String str, String str2) {
        this.f2320 = c0791;
        this.f2323 = c0786;
        this.f2322 = str;
        this.f2321 = str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        JSONObject jSONObject;
        JSONObject m4193 = C0791.m4193(this.f2320, this.f2323);
        m4193.put(StringFog.decrypt("Dpw=\n", "a+QBfFBWLc4=\n"), true);
        C0791.m4192(this.f2320).put(this.f2323.f1857.f2831, m4193);
        String m4101 = this.f2323.f1854.m4101();
        C0696 c0696 = this.f2320.f1867;
        if (StringFog.decrypt("ovhX881ZeYI=\n", "5rEEso8VPMY=\n").equals(m4101)) {
            AbstractC0580.m4078(StringFog.decrypt("1ruhATIAvG/nma4BNgStcg==\n", "ldTPb1djyAA=\n"), this.f2323.f1857.f2830 + StringFog.decrypt("/yptSgdUoKqwOyJNGhGnt6woYEgMVQ==\n", "30kCJGkxw94=\n"));
            if (c0696 != null) {
                AbstractC1026.m4312(new C0706(c0696, this.f2322, EnumC0718.f1595));
            }
        } else if (this.f2320.m4207(this.f2322)) {
            AbstractC0580.m4078(StringFog.decrypt("GAA7WOH22q0pIjRY5fLLsA==\n", "W29VNoSVrsI=\n"), this.f2323.f1857.f2830 + StringFog.decrypt("+B/Q7um3YK63Dp/35qEjvrEP3uLrt2f6vg7Q7aema7/4D9ry8bdx\n", "2Hy/gIfSA9o=\n"));
            if (c0696 != null) {
                AbstractC1026.m4312(new C0706(c0696, this.f2322, EnumC0718.f1595));
            }
            m4193.put(StringFog.decrypt("6xnt\n", "j3qeQ54hQHU=\n"), true);
        } else {
            this.f2320.getClass();
            C0600 c0600 = (C0600) AbstractC0590.m4087();
            synchronized (c0600) {
                jSONObject = c0600.f2998;
            }
            if (!jSONObject.optBoolean(c0600.f1027)) {
                C0791 c0791 = this.f2320;
                C0786 c0786 = this.f2323;
                c0791.getClass();
                if (!C0791.f1861.equals(m4101) && (TextUtils.isEmpty(m4101) || AbstractC1246.m4506(m4101, c0786.f1857.f2828) < 0 || AbstractC1246.m4506(m4101, c0786.f1857.f2827) > 0)) {
                    m4193.put(StringFog.decrypt("ftUE\n", "DaN35WHNLQM=\n"), false);
                    if (c0696 != null) {
                        AbstractC1026.m4312(new C0712(c0696, this.f2322, EnumC0724.f1643));
                    }
                    String decrypt = StringFog.decrypt("oB7UV8kdyCaRPNtXzRnZOw==\n", "43G6Oax+vEk=\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f2321);
                    AbstractC0577.m4069(decrypt, AbstractC1293.m4543("Fyr00QvU16FOJvPRFs7T8Vgx85QBm8H4FzfvlEXYzO9ZJuSFCsk=\n", "N0OH8WW7o4E=\n", AbstractC0446.m4006("a+dTRdR8r3M43Xhg1A==\n", "S7QXDvQKygE=\n", sb, m4101)), null, true, true, false);
                    if (this.f2323.m4184()) {
                        ISAdQualityInitListener m4202 = this.f2320.m4202();
                        ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(this.f2323.f1857.f2830);
                        sb2.append(StringFog.decrypt("CCuRoxc1BylbEbqGFw==\n", "KHjV6DdDYls=\n"));
                        sb2.append(this.f2323.f1854.m4101());
                        ((C0373) m4202).adQualitySdkInitFailed(iSAdQualityInitError, AbstractC1293.m4543("ggzHudPQz9rbAMC5zsrLis0XwPzZn9mDghHc/J3c1JTMANft0s0=\n", "omW0mb2/u/o=\n", sb2));
                    }
                }
            }
            AbstractC1026.m4316(new C1042(this));
            ((ArrayList) C0791.m4191(this.f2320)).add(this.f2323);
        }
        m4193.remove(StringFog.decrypt("r+4=\n", "ypYy7TUQ5/k=\n"));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo4007(Throwable th) {
        C0696 c0696 = this.f2320.f1867;
        if (c0696 != null) {
            AbstractC1026.m4312(new C0712(c0696, this.f2322, EnumC0724.f1640));
        }
        AbstractC0577.m4069(StringFog.decrypt("yzJad7s9Twr6EFV3vzleFw==\n", "iF00Gd5eO2U=\n"), StringFog.decrypt("IWhvPtkQUaUNbnQwx1lCogp9PTLEXlauB25yI4s=\n", "ZBodUaswOMs=\n") + this.f2322, th, true, true, true);
    }
}
