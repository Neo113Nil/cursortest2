package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.richmedia.ad.RichMediaAdObject;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.נ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0615 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1119;

    public C0615(C0563 c0563) {
        this.f1119 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f1119;
        RichMediaAdObject richMediaAdObject = (RichMediaAdObject) arrayList.get(0);
        c0563.getClass();
        return richMediaAdObject.getContent();
    }
}
