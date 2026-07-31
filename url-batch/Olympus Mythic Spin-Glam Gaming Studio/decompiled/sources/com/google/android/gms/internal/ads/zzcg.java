package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzcg implements AudioManager.OnAudioFocusChangeListener {
    private final Handler zza;
    private final AudioManager.OnAudioFocusChangeListener zzb;

    zzcg(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zzb = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = zzfm.zza;
        this.zza = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        zzfm.zze(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzcf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcg.this.zza(i);
            }
        });
    }

    final /* synthetic */ void zza(int i) {
        this.zzb.onAudioFocusChange(i);
    }
}
