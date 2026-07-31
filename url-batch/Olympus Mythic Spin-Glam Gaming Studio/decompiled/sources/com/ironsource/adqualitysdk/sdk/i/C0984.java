package com.ironsource.adqualitysdk.sdk.i;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0984 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f2354;

    public C0984(C0957 c0957) {
        this.f2354 = c0957;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        HashSet hashSet;
        C0951.m4245(this.f2354.f2278, true);
        C0951 c0951 = this.f2354.f2278;
        synchronized (c0951) {
            hashSet = new HashSet(c0951.f2267);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC1076) it.next()).mo4130();
        }
    }
}
