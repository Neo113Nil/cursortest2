package com.ironsource.adqualitysdk.sdk.i;

import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ۉ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0676 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0624 f1440;

    public C0676(C0624 c0624) {
        this.f1440 = c0624;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        this.f1440.getClass();
        return ((AdView) AbstractC1100.m4401(arrayList, 0, AdView.class)).getAdListener();
    }
}
