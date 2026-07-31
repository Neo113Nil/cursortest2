package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ǰ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0412 implements InterfaceC1212 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1336 f237;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f238;

    public C0412(C1336 c1336, String str) {
        this.f237 = c1336;
        this.f238 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1212
    /* renamed from: ﾒ */
    public final void mo3995() {
        C1079 c1079;
        AbstractC0590 m4087 = AbstractC0590.m4087();
        String decrypt = StringFog.decrypt("gP/NTVdX\n", "85CiIDs2N/s=\n");
        String str = this.f238;
        C0600 c0600 = (C0600) m4087;
        if (decrypt != null) {
            c1079 = (C1079) c0600.mo4096().get(decrypt);
        } else {
            c0600.getClass();
            c1079 = null;
        }
        if (c1079 == null || !c1079.m4366(str)) {
            return;
        }
        C1213 c1213 = this.f237.f3683;
        String str2 = C1213.f3183;
        c1213.m4469(true);
    }
}
