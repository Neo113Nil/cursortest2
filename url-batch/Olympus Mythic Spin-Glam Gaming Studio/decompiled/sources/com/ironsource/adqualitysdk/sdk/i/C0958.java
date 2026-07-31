package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴒ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0958 implements InterfaceC1153 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0791 f2281;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ AbstractRunnableC0913 f2282;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0955 f2283;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f2284;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ String f2285;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0593 f2286;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Context f2287;

    public C0958(C0791 c0791, Context context, AbstractC0593 abstractC0593, String str, String str2, AbstractC0955 abstractC0955, AbstractRunnableC0913 abstractRunnableC0913) {
        this.f2281 = c0791;
        this.f2287 = context;
        this.f2286 = abstractC0593;
        this.f2285 = str;
        this.f2284 = str2;
        this.f2283 = abstractC0955;
        this.f2282 = abstractRunnableC0913;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1153
    /* renamed from: ﾒ */
    public final void mo4217(String str) {
        C0791 c0791 = this.f2281;
        Context context = this.f2287;
        AbstractC0593 abstractC0593 = this.f2286;
        c0791.getClass();
        C0786 c0786 = TextUtils.isEmpty(str) ? null : new C0786(context, new C1112(str, c0791.f1869), c0791.f1863, c0791.f1870, abstractC0593);
        C0791 c07912 = this.f2281;
        Context context2 = this.f2287;
        String str2 = this.f2285;
        String str3 = this.f2284;
        AbstractC0955 abstractC0955 = this.f2283;
        AbstractC0593 abstractC05932 = this.f2286;
        AbstractRunnableC0913 abstractRunnableC0913 = this.f2282;
        c07912.getClass();
        AbstractC1026.m4316(new C0940(c07912, c0786, abstractC0955, str3, false, abstractRunnableC0913, str2, abstractC05932, context2));
    }
}
