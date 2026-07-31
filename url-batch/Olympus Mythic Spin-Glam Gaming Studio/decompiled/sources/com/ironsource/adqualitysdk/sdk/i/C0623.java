package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.banner.widget.BannerView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ר, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0623 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1129;

    public C0623(C0563 c0563) {
        this.f1129 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f1129;
        BannerView bannerView = (BannerView) arrayList.get(0);
        c0563.getClass();
        return bannerView.getAdSpaceId();
    }
}
