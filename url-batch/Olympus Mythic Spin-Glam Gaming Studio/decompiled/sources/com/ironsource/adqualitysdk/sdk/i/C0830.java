package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0830 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0829 f2036;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2037;

    public C0830(C0829 c0829, String str) {
        this.f2036 = c0829;
        this.f2037 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        if (this.f2036.f2031.f1876.get()) {
            return;
        }
        AbstractC0580.m4078(StringFog.decrypt("zt6pyL1B5kr//KbIuUX3Vw==\n", "jbHHptgikiU=\n"), StringFog.decrypt("L7KH7vmq6h4ctYD9sKjpGQi5je7/uaY=\n", "ZtzumpDLhnc=\n") + this.f2037);
        try {
            C0829 c0829 = this.f2036;
            c0829.f2031.m4203(c0829.f2034, c0829.f2035, this.f2037, c0829.f2033, c0829.f2032);
        } catch (Throwable th) {
            C0696 c0696 = this.f2036.f2031.f1867;
            if (c0696 != null) {
                AbstractC1026.m4312(new C0712(c0696, this.f2037, EnumC0724.f1641));
            }
            HashMap m4189 = C0791.m4189(this.f2036.f2031);
            String str = this.f2036.f2035;
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            m4189.put(str, th2.toString());
            AbstractC0577.m4069(StringFog.decrypt("QCduTlt0J1hxBWFOX3A2RQ==\n", "A0gAID4XUzc=\n"), StringFog.decrypt("0AqkDtnqOwbwGaIIxa14F/oWuATIvjcGtQ==\n", "lXjWYavKWHQ=\n") + this.f2037, th, true, true, true);
        }
    }
}
