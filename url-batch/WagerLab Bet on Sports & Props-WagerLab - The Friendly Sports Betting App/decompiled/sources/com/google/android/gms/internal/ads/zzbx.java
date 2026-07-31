package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzbx implements AudioManager.OnAudioFocusChangeListener {
    private final Handler zza;
    private final AudioManager.OnAudioFocusChangeListener zzb;

    zzbx(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
        this.zzb = onAudioFocusChangeListener;
        Looper looper = handler.getLooper();
        String str = zzeo.zza;
        this.zza = new Handler(looper, null);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        zzeo.zzd(this.zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzbw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbx.this.zza(i);
            }
        });
    }

    final /* synthetic */ void zza(int i) {
        this.zzb.onAudioFocusChange(i);
    }
}
