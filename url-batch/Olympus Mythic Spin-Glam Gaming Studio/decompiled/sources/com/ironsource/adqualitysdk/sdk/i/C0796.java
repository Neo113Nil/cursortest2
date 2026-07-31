package com.ironsource.adqualitysdk.sdk.i;

import android.view.Choreographer;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐸ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0796 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0756 f1982;

    public C0796(C0756 c0756) {
        this.f1982 = c0756;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0756 c0756 = this.f1982;
        if (!c0756.f1695) {
            c0756.f1692 = null;
            return;
        }
        HashMap hashMap = new HashMap(c0756.f1694);
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            this.f1982.f1693.post((Runnable) hashMap.get((InterfaceC0887) it.next()));
        }
        C0756 c07562 = this.f1982;
        if (c07562.f1692 == null) {
            c07562.f1692 = new ChoreographerFrameCallbackC0805(this);
        }
        Choreographer.getInstance().postFrameCallback(this.f1982.f1692);
    }
}
