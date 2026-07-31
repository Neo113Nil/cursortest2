package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ｌ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1296 implements InterfaceC0380 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f3464;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f3465;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f3466;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f3467;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f3468;

    public C1296(C1284 c1284, C1064 c1064, C0785 c0785, C0880 c0880, List list) {
        this.f3464 = c1284;
        this.f3468 = c1064;
        this.f3467 = c0785;
        this.f3466 = c0880;
        this.f3465 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0380
    /* renamed from: ﾒ */
    public final void mo3994(C1339 c1339, MediaPlayer mediaPlayer) {
        this.f3468.m4337(this.f3467, this.f3466, C1284.m4531(this.f3464, this.f3465, new Object[]{this, c1339, mediaPlayer}));
    }
}
