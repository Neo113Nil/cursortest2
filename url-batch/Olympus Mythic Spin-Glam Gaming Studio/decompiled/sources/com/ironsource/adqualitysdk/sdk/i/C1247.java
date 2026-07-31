package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹽ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1247 extends AbstractC0403 implements MediaPlayer.OnPreparedListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f3258 = StringFog.decrypt("PtBF3SqKn9IU2lnGPI6bzhTMUcoslYzBBdFn\n", "cb4Vr0/6/qA=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1251 f3259;

    public C1247(MediaPlayer.OnPreparedListener onPreparedListener, InterfaceC1251 interfaceC1251) {
        super(onPreparedListener);
        this.f3259 = interfaceC1251;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            this.f3259.mo4121(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC0577.m4068(f3258, StringFog.decrypt("oryoGh6mtH7Ho44XIO+uZIKgvwdM6bNAlauqFB7juQ==\n", "587adWyG3RA=\n"), th, false);
        }
        Object obj = this.f223;
        if (obj != null) {
            ((MediaPlayer.OnPreparedListener) obj).onPrepared(mediaPlayer);
        }
    }
}
