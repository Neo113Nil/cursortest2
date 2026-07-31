package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ț, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0420 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0417 f247;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f248;

    public C0420(C0417 c0417, ArrayList arrayList) {
        this.f247 = c0417;
        this.f248 = arrayList;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        ArrayList m4491 = AbstractC1240.m4491(this.f247.f242.f199, this.f248);
        Iterator it = this.f248.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            Iterator it2 = this.f247.f242.f199.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((WeakReference) it2.next()).get() == view) {
                        break;
                    }
                } else {
                    this.f247.f242.f199.add(new WeakReference(view));
                    AbstractC1026.m4312(new C0434(this, view));
                    break;
                }
            }
        }
        for (int i = 0; i < m4491.size(); i++) {
            AbstractC1026.m4312(new C0429(this, (View) m4491.get(i)));
        }
    }
}
