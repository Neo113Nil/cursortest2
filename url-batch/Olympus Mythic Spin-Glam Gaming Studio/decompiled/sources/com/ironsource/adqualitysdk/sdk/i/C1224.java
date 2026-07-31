package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.core.DependencyHolder;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮣ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1224 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1207 f3223;

    public C1224(C1207 c1207) {
        this.f3223 = c1207;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1207 c1207 = this.f3223;
        DependencyHolder dependencyHolder = (DependencyHolder) arrayList.get(0);
        c1207.getClass();
        return dependencyHolder.getDistributorId();
    }
}
