package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ѓ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0559 extends AbstractRunnableC0913 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0556 f806;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f807;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1339 f808;

    public C0559(C0556 c0556, C1339 c1339, MediaPlayer mediaPlayer) {
        this.f806 = c0556;
        this.f808 = c1339;
        this.f807 = mediaPlayer;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f806.f802.mo3994(this.f808, this.f807);
    }
}
