package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.internal.ads.zzbci;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzaa {
    private static volatile float zzc = -1.0f;
    private static volatile long zzd;
    private static final Object zze = new Object();
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoG)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager == null) {
                return 0.0f;
            }
            return zzg(audioManager);
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoH)).intValue();
        if (zzc != -1.0f && currentTimeMillis - zzd < intValue) {
            return zzc;
        }
        synchronized (zze) {
            long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            if (zzc != -1.0f && currentTimeMillis2 - zzd < intValue) {
                return zzc;
            }
            AudioManager audioManager2 = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
            if (audioManager2 == null) {
                zzc = 0.0f;
                zzd = currentTimeMillis2;
                return 0.0f;
            }
            zzc = zzg(audioManager2);
            zzd = currentTimeMillis2;
            return zzc;
        }
    }

    private final synchronized boolean zzf() {
        return this.zzb >= 0.0f;
    }

    private static float zzg(AudioManager audioManager) {
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }

    public final synchronized void zza(float f) {
        this.zzb = f;
    }

    public final synchronized float zzb() {
        if (!zzf()) {
            return 1.0f;
        }
        return this.zzb;
    }

    public final synchronized void zzc(boolean z) {
        this.zza = z;
    }

    public final synchronized boolean zzd() {
        return this.zza;
    }
}
