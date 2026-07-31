package com.ironsource.adqualitysdk.sdk.i;

import com.smaato.sdk.core.ad.AdInteractor;
import com.smaato.sdk.core.util.StateMachine;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ג, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0603 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0563 f1039;

    public C0603(C0563 c0563) {
        this.f1039 = c0563;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C0563 c0563 = this.f1039;
        AdInteractor adInteractor = (AdInteractor) arrayList.get(0);
        StateMachine.Listener listener = (StateMachine.Listener) arrayList.get(1);
        c0563.getClass();
        adInteractor.addStateListener(listener);
        return null;
    }
}
