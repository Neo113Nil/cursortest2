package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺜ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1263 extends AbstractC0403 implements MediaPlayer.OnInfoListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f3427 = StringFog.decrypt("pKENEwZK3JaYuyETBVfUmoigNhwUSuI=\n", "689EfWAlkP8=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1280 f3428;

    public C1263(MediaPlayer.OnInfoListener onInfoListener, InterfaceC1280 interfaceC1280) {
        super(onInfoListener);
        this.f3428 = interfaceC1280;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        try {
            this.f3428.mo4110(this, mediaPlayer, i, i2);
        } catch (Throwable th) {
            AbstractC0577.m4068(f3427, StringFog.decrypt("PYWE1szahBtYmqLb8pOeAR2Zk8uelYM8FpGZ\n", "ePf2ub767XU=\n"), th, false);
        }
        Object obj = this.f223;
        if (obj != null) {
            return ((MediaPlayer.OnInfoListener) obj).onInfo(mediaPlayer, i, i2);
        }
        return false;
    }
}
