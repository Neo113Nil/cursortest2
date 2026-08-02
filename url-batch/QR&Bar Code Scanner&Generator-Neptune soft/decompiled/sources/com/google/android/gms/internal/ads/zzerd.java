package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzerd implements zzeve {
    private final zzfzq zza;
    private final Context zzb;

    public zzerd(zzfzq zzfzqVar, Context context) {
        this.zza = zzfzqVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzerc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerd.this.zzc();
            }
        });
    }

    final /* synthetic */ zzere zzc() throws Exception {
        int i;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        int i2 = -1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziD)).booleanValue()) {
            i = com.google.android.gms.ads.internal.zzt.zzq().zzi(audioManager);
            i2 = audioManager.getStreamMaxVolume(3);
        } else {
            i = -1;
        }
        return new zzere(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i, i2, audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzt.zzr().zza(), com.google.android.gms.ads.internal.zzt.zzr().zze());
    }
}
