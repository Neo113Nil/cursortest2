package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｲ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1323 implements InterfaceC1251 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f3663;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f3664;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f3665;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f3666;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f3667;

    public C1323(C1284 c1284, C1064 c1064, C0785 c0785, C0880 c0880, List list) {
        this.f3663 = c1284;
        this.f3667 = c1064;
        this.f3666 = c0785;
        this.f3665 = c0880;
        this.f3664 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1251
    /* renamed from: ﾒ */
    public final void mo4121(C1247 c1247, MediaPlayer mediaPlayer) {
        this.f3667.m4337(this.f3666, this.f3665, C1284.m4531(this.f3663, this.f3664, new Object[]{this, c1247, mediaPlayer}));
    }
}
