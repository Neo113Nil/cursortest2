package com.ironsource.adqualitysdk.sdk.i;

import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.Repository;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1023 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0610 f2531;

    public C1023(C0610 c0610) {
        this.f2531 = c0610;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0610 c0610 = this.f2531;
        Repository repository = (Repository) arrayList.get(0);
        String str = (String) arrayList.get(1);
        c0610.getClass();
        return (Placement) repository.load(str, Placement.class).get();
    }
}
