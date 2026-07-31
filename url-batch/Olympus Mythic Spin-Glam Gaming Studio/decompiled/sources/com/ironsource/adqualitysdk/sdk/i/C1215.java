package com.ironsource.adqualitysdk.sdk.i;

import com.hyprmx.android.sdk.model.PreloadedVastData;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮇ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C1215 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1207 f3203;

    public C1215(C1207 c1207) {
        this.f3203 = c1207;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1207 c1207 = this.f3203;
        PreloadedVastData preloadedVastData = (PreloadedVastData) arrayList.get(0);
        c1207.getClass();
        return preloadedVastData.getParameters();
    }
}
