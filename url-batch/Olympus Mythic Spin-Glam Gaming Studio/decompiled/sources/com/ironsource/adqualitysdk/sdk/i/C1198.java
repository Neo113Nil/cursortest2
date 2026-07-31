package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﭙ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1198 extends AbstractC0403 implements MediaPlayer.OnSeekCompleteListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f3123 = StringFog.decrypt("yzKlAEJYWszpLJoAU1ZVyvcokwtCQV3G5zOEBFNcaw==\n", "hFz2ZSczGaM=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1210 f3124;

    public C1198(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, InterfaceC1210 interfaceC1210) {
        super(onSeekCompleteListener);
        this.f3124 = interfaceC1210;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            this.f3124.mo4134(this, mediaPlayer);
        } catch (Throwable th) {
            AbstractC0577.m4068(f3123, StringFog.decrypt("uwXx0RzBXt/eGtfcIohExZsZ5sxOjlnimxLo/QGMR92bA+Y=\n", "/neDvm7hN7E=\n"), th, false);
        }
        Object obj = this.f223;
        if (obj != null) {
            ((MediaPlayer.OnSeekCompleteListener) obj).onSeekComplete(mediaPlayer);
        }
    }
}
