package com.ironsource.adqualitysdk.sdk.i;

import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.〳, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1131 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f2880;

    public C1131(C1027 c1027) {
        this.f2880 = c1027;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1027 c1027 = this.f2880;
        LevelPlayImpressionDataListener levelPlayImpressionDataListener = (LevelPlayImpressionDataListener) arrayList.get(0);
        c1027.getClass();
        LevelPlay.addImpressionDataListener(levelPlayImpressionDataListener);
        return null;
    }
}
