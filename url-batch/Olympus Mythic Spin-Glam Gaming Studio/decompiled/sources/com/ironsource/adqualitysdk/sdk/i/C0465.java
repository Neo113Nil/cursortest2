package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʴ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0465 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1244 f351;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ View f352;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f353;

    public C0465(C1244 c1244, Activity activity, View view) {
        this.f351 = c1244;
        this.f353 = activity;
        this.f352 = view;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f351.f3249.clear();
        C1244 c1244 = this.f351;
        Activity activity = this.f353;
        View view = this.f352;
        Class cls = c1244.f3251;
        C1321 c1321 = c1244.f3250;
        boolean z = c1321.f3654;
        List list = c1321.f3650;
        List list2 = c1321.f3648;
        ArrayList arrayList = c1244.f3249;
        if (view != null) {
            AbstractC1240.m4489(view, cls, null, false, z, list, list2, arrayList);
        } else {
            AbstractC1240.m4492(activity, cls, -1, null, false, z, list, list2, arrayList);
        }
        View view2 = this.f352;
        C1244 c12442 = this.f351;
        Class cls2 = c12442.f3251;
        C1321 c13212 = c12442.f3250;
        if (AbstractC1240.m4494(view2, cls2, null, c13212.f3650, c13212.f3648)) {
            this.f351.f3249.add(this.f352);
        }
        ArrayList arrayList2 = new ArrayList(this.f351.f3249);
        C1244 c12443 = this.f351;
        if (c12443.f3250.f3651) {
            AbstractC1026.m4314(new C0479(this, arrayList2));
        } else {
            C1244.m4495(c12443, arrayList2);
        }
    }
}
