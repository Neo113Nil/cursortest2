package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʃ, reason: contains not printable characters */
/* loaded from: classes12.dex */
public final class C0443 implements InterfaceC0424 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f322;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f323;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f324;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f325;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f326;

    public C0443(C1284 c1284, C1064 c1064, C0785 c0785, C0880 c0880, List list) {
        this.f322 = c1284;
        this.f326 = c1064;
        this.f325 = c0785;
        this.f324 = c0880;
        this.f323 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0424
    /* renamed from: ﾒ */
    public final void mo3990(ViewOnClickListenerC0408 viewOnClickListenerC0408, View view) {
        this.f326.m4337(this.f325, this.f324, C1284.m4531(this.f322, this.f323, new Object[]{this, viewOnClickListenerC0408, view}));
    }
}
