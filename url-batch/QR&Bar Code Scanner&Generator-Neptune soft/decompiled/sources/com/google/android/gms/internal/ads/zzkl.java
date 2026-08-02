package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzkl {
    private final Context zza;
    private final Handler zzb;
    private final zzkh zzc;
    private final AudioManager zzd;
    private zzkk zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    public zzkl(Context context, Handler handler, zzkh zzkhVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzkhVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzdd.zzb(audioManager);
        this.zzd = audioManager;
        this.zzf = 3;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(audioManager, this.zzf);
        zzkk zzkkVar = new zzkk(this, null);
        try {
            zzen.zzA(applicationContext, zzkkVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzkkVar;
        } catch (RuntimeException e) {
            zzdw.zzf("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    private static int zzg(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            zzdw.zzf("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh() {
        zzdt zzdtVar;
        final int zzg = zzg(this.zzd, this.zzf);
        final boolean zzi = zzi(this.zzd, this.zzf);
        if (this.zzg == zzg && this.zzh == zzi) {
            return;
        }
        this.zzg = zzg;
        this.zzh = zzi;
        zzdtVar = ((zzip) this.zzc).zza.zzl;
        zzdtVar.zzd(30, new zzdq() { // from class: com.google.android.gms.internal.ads.zzik
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                int i = zzg;
                boolean z = zzi;
                int i2 = zzip.zzb;
                ((zzcd) obj).zzc(i, z);
            }
        });
        zzdtVar.zzc();
    }

    private static boolean zzi(AudioManager audioManager, int i) {
        return zzen.zza >= 23 ? audioManager.isStreamMute(i) : zzg(audioManager, i) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        if (zzen.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final void zze() {
        zzkk zzkkVar = this.zze;
        if (zzkkVar != null) {
            try {
                this.zza.unregisterReceiver(zzkkVar);
            } catch (RuntimeException e) {
                zzdw.zzf("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i) {
        zzkl zzklVar;
        final zzt zzam;
        zzt zztVar;
        zzdt zzdtVar;
        if (this.zzf == 3) {
            return;
        }
        this.zzf = 3;
        zzh();
        zzip zzipVar = (zzip) this.zzc;
        zzklVar = zzipVar.zza.zzz;
        zzam = zzit.zzam(zzklVar);
        zztVar = zzipVar.zza.zzac;
        if (zzam.equals(zztVar)) {
            return;
        }
        zzipVar.zza.zzac = zzam;
        zzdtVar = zzipVar.zza.zzl;
        zzdtVar.zzd(29, new zzdq() { // from class: com.google.android.gms.internal.ads.zzil
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                zzt zztVar2 = zzt.this;
                int i2 = zzip.zzb;
                ((zzcd) obj).zzb(zztVar2);
            }
        });
        zzdtVar.zzc();
    }
}
