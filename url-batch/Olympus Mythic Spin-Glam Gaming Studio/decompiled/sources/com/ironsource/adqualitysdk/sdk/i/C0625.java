package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.װ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0625 extends AbstractRunnableC0913 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ C0602 f1256;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ int f1257;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ int f1258;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ MediaPlayer f1259;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C1263 f1260;

    public C0625(C0602 c0602, C1263 c1263, MediaPlayer mediaPlayer, int i, int i2) {
        this.f1256 = c0602;
        this.f1260 = c1263;
        this.f1259 = mediaPlayer;
        this.f1258 = i;
        this.f1257 = i2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        this.f1256.f1038.mo4110(this.f1260, this.f1259, this.f1258, this.f1257);
    }
}
