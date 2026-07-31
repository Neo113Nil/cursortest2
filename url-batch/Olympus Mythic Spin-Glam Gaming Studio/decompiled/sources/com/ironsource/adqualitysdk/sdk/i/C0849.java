package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0849 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f2072;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f2073;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1314 f2074;

    public C0849(C0791 c0791, C1314 c1314, Context context) {
        this.f2072 = c0791;
        this.f2074 = c1314;
        this.f2073 = context;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        boolean mo4088;
        AbstractC1026.m4312(new C0852(this));
        C0791 c0791 = this.f2072;
        Context context = this.f2073;
        synchronized (c0791) {
            mo4088 = AbstractC0590.m4087().mo4088();
        }
        if (!mo4088) {
            AbstractC1026.m4317(new C0825(c0791), AbstractC0590.m4087().mo4098());
        }
        String str = AbstractC0688.f1543;
        ArrayList arrayList = new ArrayList(AbstractC0688.f1541.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            List<AbstractC0955> list = (List) AbstractC0688.f1541.get(str2);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC0955 abstractC0955 : list) {
                    if (AbstractC0688.m4140(abstractC0955)) {
                        arrayList2.add(abstractC0955);
                    }
                }
                linkedHashMap.put(str2, arrayList2);
            }
        }
        AbstractC1026.m4312(new C0812(c0791, context, linkedHashMap));
    }
}
