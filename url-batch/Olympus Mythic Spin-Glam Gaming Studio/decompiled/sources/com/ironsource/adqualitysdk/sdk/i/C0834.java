package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒷ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0834 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0833 f2045;

    public C0834(C0833 c0833) {
        this.f2045 = c0833;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [com.ironsource.adqualitysdk.sdk.i.ᒶ] */
    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0833 c0833 = this.f2045;
        C0791 c0791 = c0833.f2040;
        Context context = c0833.f2044;
        ArrayList arrayList = c0833.f2043;
        ArrayList arrayList2 = c0833.f2042;
        C0849 c0849 = c0833.f2041;
        String str = C0791.f1862;
        c0791.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC0955 abstractC0955 = (AbstractC0955) arrayList.remove(0);
        String str2 = (String) arrayList2.remove(0);
        if (!arrayList.isEmpty()) {
            c0849 = new C0833(c0791, context, arrayList, arrayList2, c0849);
        }
        AbstractC1026.m4312(new C0829(c0791, str2, context, abstractC0955, c0849));
    }
}
