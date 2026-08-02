package com.google.android.gms.internal.ads;

import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdum extends zzbky {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfju zzd;
    final /* synthetic */ zzbzt zze;
    final /* synthetic */ zzdun zzf;

    zzdum(zzdun zzdunVar, Object obj, String str, long j, zzfju zzfjuVar, zzbzt zzbztVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfjuVar;
        this.zze = zzbztVar;
        this.zzf = zzdunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zze(String str) {
        zzdsu zzdsuVar;
        zzddp zzddpVar;
        zzfki zzfkiVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            zzdsuVar = this.zzf.zzl;
            zzdsuVar.zzb(this.zzb, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            zzddpVar = this.zzf.zzo;
            zzddpVar.zzb(this.zzb, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            zzfkiVar = this.zzf.zzp;
            zzfju zzfjuVar = this.zzd;
            zzfjuVar.zzc(str);
            zzfjuVar.zzg(false);
            zzfkiVar.zzb(zzfjuVar.zzm());
            this.zze.zzc(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zzf() {
        zzdsu zzdsuVar;
        zzddp zzddpVar;
        zzfki zzfkiVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zzc));
            zzdsuVar = this.zzf.zzl;
            zzdsuVar.zzd(this.zzb);
            zzddpVar = this.zzf.zzo;
            zzddpVar.zzd(this.zzb);
            zzfkiVar = this.zzf.zzp;
            zzfju zzfjuVar = this.zzd;
            zzfjuVar.zzg(true);
            zzfkiVar.zzb(zzfjuVar.zzm());
            this.zze.zzc(true);
        }
    }
}
