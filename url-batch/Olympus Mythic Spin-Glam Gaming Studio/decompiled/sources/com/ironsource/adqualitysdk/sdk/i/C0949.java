package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᚆ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C0949 extends AbstractRunnableC0913 {

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f2257;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0913 f2258;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0955 f2259;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ String f2260;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ String f2261;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0593 f2262;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2263;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Context f2264;

    public C0949(C0791 c0791, Context context, String str, AbstractC0593 abstractC0593, String str2, String str3, AbstractC0955 abstractC0955, AbstractRunnableC0913 abstractRunnableC0913) {
        this.f2257 = c0791;
        this.f2264 = context;
        this.f2263 = str;
        this.f2262 = abstractC0593;
        this.f2261 = str2;
        this.f2260 = str3;
        this.f2259 = abstractC0955;
        this.f2258 = abstractRunnableC0913;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0791 c0791 = this.f2257;
        Context context = this.f2264;
        String str = this.f2263;
        AbstractC0593 abstractC0593 = this.f2262;
        c0791.getClass();
        C0786 c0786 = TextUtils.isEmpty(str) ? null : new C0786(context, new C1112(str, c0791.f1869), c0791.f1863, c0791.f1870, abstractC0593);
        if (c0786 == null) {
            AbstractC1026.m4316(this.f2258);
            return;
        }
        C0791 c07912 = this.f2257;
        Context context2 = this.f2264;
        String str2 = this.f2261;
        String str3 = this.f2260;
        AbstractC0955 abstractC0955 = this.f2259;
        AbstractC0593 abstractC05932 = this.f2262;
        AbstractRunnableC0913 abstractRunnableC0913 = this.f2258;
        c07912.getClass();
        AbstractC1026.m4316(new C0940(c07912, c0786, abstractC0955, str3, true, abstractRunnableC0913, str2, abstractC05932, context2));
    }
}
