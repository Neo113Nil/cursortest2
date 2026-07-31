package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ｊ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1295 implements InterfaceC1210 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f3459;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f3460;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f3461;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f3462;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f3463;

    public C1295(C1284 c1284, C1064 c1064, C0785 c0785, C0880 c0880, List list) {
        this.f3459 = c1284;
        this.f3463 = c1064;
        this.f3462 = c0785;
        this.f3461 = c0880;
        this.f3460 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1210
    /* renamed from: ﾒ */
    public final void mo4134(C1198 c1198, MediaPlayer mediaPlayer) {
        this.f3463.m4337(this.f3462, this.f3461, C1284.m4531(this.f3459, this.f3460, new Object[]{this, c1198, mediaPlayer}));
    }
}
