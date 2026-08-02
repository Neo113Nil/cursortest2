package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgo implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzgq zza;
    private final Handler zzb;

    public zzgo(zzgq zzgqVar, Handler handler) {
        this.zza = zzgqVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgn
            @Override // java.lang.Runnable
            public final void run() {
                zzgo zzgoVar = zzgo.this;
                zzgq.zzc(zzgoVar.zza, i);
            }
        });
    }
}
