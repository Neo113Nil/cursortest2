package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᘢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0940 extends AbstractRunnableC0913 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f2237;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0593 f2238;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ String f2239;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0913 f2240;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f2241;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2242;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0955 f2243;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0786 f2244;

    public C0940(C0791 c0791, C0786 c0786, AbstractC0955 abstractC0955, String str, boolean z, AbstractRunnableC0913 abstractRunnableC0913, String str2, AbstractC0593 abstractC0593, Context context) {
        this.f2237 = c0791;
        this.f2244 = c0786;
        this.f2243 = abstractC0955;
        this.f2242 = str;
        this.f2241 = z;
        this.f2240 = abstractRunnableC0913;
        this.f2239 = str2;
        this.f2238 = abstractC0593;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0696 c0696;
        boolean mo4038;
        String str;
        String str2;
        AbstractRunnableC0913 abstractRunnableC0913;
        AbstractRunnableC0913 abstractRunnableC09132;
        if (this.f2237.f1876.get() || this.f2244 == null || C0791.m4190(this.f2237).contains(this.f2243) || (c0696 = this.f2237.f1867) == null) {
            return;
        }
        AbstractC1026.m4312(new C0703(c0696, this.f2242, this.f2244, this.f2241));
        C0786 c0786 = this.f2244;
        synchronized (c0786) {
            mo4038 = c0786.f1854.mo4038();
        }
        if (!mo4038 && (abstractRunnableC09132 = this.f2240) != null) {
            AbstractC1026.m4316(abstractRunnableC09132);
        }
        C0791 c0791 = this.f2237;
        C0786 c07862 = this.f2244;
        c0791.getClass();
        String m4185 = c07862.m4185();
        if (m4185 != null && AbstractC1246.m4506(IronSourceAdQuality.getSDKVersion(), m4185) < 0) {
            AbstractC1026.m4312(new C0948(this));
            return;
        }
        String decrypt = StringFog.decrypt("3bbK9s7O9wHslMX2ysrmHA==\n", "ntmkmKutg24=\n");
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("4AsQz40KfCLTDBfcxA==\n", "qWV5u+RrEEs=\n"));
        sb.append(this.f2239);
        sb.append(StringFog.decrypt("XvIlZ6fQ30gd7y5krcfOBwyg\n", "foBACsikumg=\n"));
        if (this.f2241) {
            str = "WAYmgwHQujE=\n";
            str2 = "cGVH4Gm13hg=\n";
        } else {
            str = "o3+OI/sb2Tyi\n";
            str2 = "ixnrV5hzvFg=\n";
        }
        sb.append(StringFog.decrypt(str, str2));
        String sb2 = sb.toString();
        int i = AbstractC0844.f2067;
        String m4083 = AbstractC0584.m4083("S60V3Q==\n", "GP9Z/f7u1W0=\n", new StringBuilder(), decrypt);
        AbstractC0580.m4081(m4083, m4083, sb2, false);
        AbstractC0593 abstractC0593 = this.f2238;
        HashMap mo3940 = abstractC0593.mo3940();
        abstractC0593.f994 = mo3940;
        mo3940.put(AbstractC0593.f990, new C0619(abstractC0593));
        abstractC0593.f994.put(AbstractC0593.f989, new C0598(abstractC0593));
        abstractC0593.f994.put(AbstractC0593.f988, new C0596(abstractC0593));
        if (this.f2244.m4184() && (abstractRunnableC0913 = this.f2240) != null) {
            AbstractC1026.m4316(abstractRunnableC0913);
        }
        if (C1213.m4452().m4461()) {
            return;
        }
        C0791 c07912 = this.f2237;
        C0786 c07863 = this.f2244;
        String str3 = this.f2239;
        if (!c07912.f1876.get()) {
            String str4 = c07863.f1857.f2831;
            C0696 c06962 = c07912.f1867;
            if (c06962 != null) {
                AbstractC1026.m4312(new C0706(c06962, str4, EnumC0718.f1597));
                AbstractC1026.m4312(new C0970(c07912, c07863, str4, str3));
            }
        }
        if (this.f2237.m4207(this.f2244.f1857.f2831)) {
            return;
        }
        C0791.m4190(this.f2237).add(this.f2243);
    }
}
