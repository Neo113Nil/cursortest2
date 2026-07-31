package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｧ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1312 implements InterfaceC1280 {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ C1284 f3635;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ List f3636;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0880 f3637;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0785 f3638;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1064 f3639;

    public C1312(C1284 c1284, C1064 c1064, C0785 c0785, C0880 c0880, List list) {
        this.f3635 = c1284;
        this.f3639 = c1064;
        this.f3638 = c0785;
        this.f3637 = c0880;
        this.f3636 = list;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1280
    /* renamed from: ﾒ */
    public final boolean mo4110(C1263 c1263, MediaPlayer mediaPlayer, int i, int i2) {
        return this.f3639.m4337(this.f3638, this.f3637, C1284.m4531(this.f3635, this.f3636, new Object[]{this, c1263, mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)})).m4250();
    }
}
