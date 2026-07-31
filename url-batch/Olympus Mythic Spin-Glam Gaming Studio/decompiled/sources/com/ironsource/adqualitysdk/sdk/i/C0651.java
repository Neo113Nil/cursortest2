package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڈ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0651 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0600 f1382;

    public C0651(C0600 c0600) {
        this.f1382 = c0600;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C1007 c1007;
        C0600 c0600 = this.f1382;
        synchronized (c0600) {
            c1007 = c0600.f1019;
        }
        if (!c1007.f2439.m4248()) {
            C1213 c1213 = this.f1382.f1010.f301.f3683;
            C1213.m4458(c1213.f3186, ISAdQualityInitError.NO_NETWORK_CONNECTION, StringFog.decrypt("dvdpUWn2nUhK82lcY+yEQlvsIFBi\n", "OJhJPwyC6ic=\n"));
            return;
        }
        if (this.f1382.mo4094()) {
            return;
        }
        C1213 c12132 = this.f1382.f1010.f301.f3683;
        C1213.m4458(c12132.f3186, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, StringFog.decrypt("9LfkgiQdobvUkNzGJiyL996Ly4AcD+C70oXBxgEBrbLSkdE=\n", "veSl5nVowNc=\n"));
    }
}
