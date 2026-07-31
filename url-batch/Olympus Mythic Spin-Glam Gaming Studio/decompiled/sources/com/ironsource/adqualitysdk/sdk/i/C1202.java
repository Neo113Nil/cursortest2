package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭠ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1202 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f3129;

    public C1202(C0563 c0563) {
        this.f3129 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f3129;
        StaticResource staticResource = (StaticResource) arrayList.get(0);
        c0563.getClass();
        return staticResource.uri;
    }
}
