package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐴ, reason: contains not printable characters */
/* loaded from: classes10.dex */
public final class C0794 extends AbstractRunnableC0913 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f1879;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0824 f1880;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f1881;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f1882;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f1883;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f1884;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1885;

    public C0794(C0791 c0791, String str, Context context, String str2, List list, LinkedHashMap linkedHashMap, C0824 c0824) {
        this.f1879 = c0791;
        this.f1885 = str;
        this.f1884 = context;
        this.f1883 = str2;
        this.f1882 = list;
        this.f1881 = linkedHashMap;
        this.f1880 = c0824;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        AbstractC0590 m4087 = AbstractC0590.m4087();
        String str = this.f1885;
        String str2 = this.f1879.f1866;
        C1079 c1079 = (C1079) ((C0600) m4087).mo4096().get(str);
        if (c1079 != null && c1079.m4366(str2)) {
            JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            this.f1879.m4206(this.f1885, jsonObjectInit);
            C0791.m4192(this.f1879).put(this.f1885, jsonObjectInit);
            AbstractC1026.m4315(new C0797(this), AbstractC0590.m4087().mo4097());
            return;
        }
        C0791 c0791 = this.f1879;
        Context context = this.f1884;
        String str3 = this.f1883;
        String str4 = this.f1885;
        List list = this.f1882;
        C0807 c0807 = new C0807(this);
        c0791.getClass();
        AbstractC1026.m4316(new C1050(c0791, str4, context, str3, list, c0807));
    }
}
