package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾉ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1339 extends AbstractC0403 implements MediaPlayer.OnCompletionListener {

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f3691 = StringFog.decrypt("7th96hG8pu/V31HrMKW5/sTYW/c4qanl09dK6g4=\n", "obY+hXzMyoo=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC0380 f3692;

    public C1339(MediaPlayer.OnCompletionListener onCompletionListener, InterfaceC0380 interfaceC0380) {
        super(onCompletionListener);
        this.f3692 = interfaceC0380;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/adqualitysdk/sdk/i/ﾉ;->onCompletion(Landroid/media/MediaPlayer;)V");
        CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.f, mediaPlayer, "media-player");
        m4544safedk__onCompletion_572ba3d56dcc3ba67f5c22ceee88b004(mediaPlayer);
    }

    /* renamed from: safedk_ﾉ_onCompletion_572ba3d56dcc3ba67f5c22ceee88b004, reason: contains not printable characters */
    public void m4544safedk__onCompletion_572ba3d56dcc3ba67f5c22ceee88b004(MediaPlayer p0) {
        try {
            this.f3692.mo3994(this, p0);
        } catch (Throwable th) {
            AbstractC0577.m4068(f3691, StringFog.decrypt("YP4PoPlV6pkF4Smtxxzwg0DiGL2rGu20SuENo+4B6phL\n", "JYx9z4t1g/c=\n"), th, false);
        }
        Object obj = this.f223;
        if (obj != null) {
            ((MediaPlayer.OnCompletionListener) obj).onCompletion(p0);
        }
    }
}
