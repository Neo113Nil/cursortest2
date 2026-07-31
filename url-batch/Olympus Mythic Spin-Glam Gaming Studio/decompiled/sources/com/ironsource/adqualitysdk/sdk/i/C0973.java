package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴮ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0973 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0968 f2334;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f2335;

    public C0973(C0968 c0968, String str) {
        this.f2334 = c0968;
        this.f2335 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C1315 c1315 = this.f2334.f2318;
        boolean isEmpty = TextUtils.isEmpty(this.f2335);
        if (isEmpty) {
            C0916 c0916 = c1315.f3641.f3640.f3470.f3450.f3188;
            String decrypt = StringFog.decrypt("fJUdMoIfDq5pjS8wyRc=\n", "Gvl8Vax5Z9w=\n");
            String decrypt2 = StringFog.decrypt("AgcXzHc=\n", "ZGZ7vxJ6cig=\n");
            c0916.getClass();
            C0916.m4240().post(new C0947(c0916, decrypt, decrypt2));
        }
        AbstractC1026.m4313(new C1334(c1315, isEmpty));
    }
}
