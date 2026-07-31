package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ȯ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C0422 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0404 f250;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1087 f251;

    public C0422(C0404 c0404, C1087 c1087) {
        this.f250 = c0404;
        this.f251 = c1087;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        int i;
        C0404 c0404 = this.f250;
        C0916 c0916 = c0404.f224;
        String str = c0404.f225 + StringFog.decrypt("hA==\n", "rnxygVuUxbk=\n");
        C1041 c1041 = c0916.f2211;
        c1041.getClass();
        try {
            i = c1041.f2634.m4279(str);
        } catch (Throwable unused) {
            i = 0;
        }
        AbstractC1026.m4312(new C0428(this, i));
    }
}
