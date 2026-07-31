package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
final class zzepz implements zzhcv {
    final /* synthetic */ long zza;
    final /* synthetic */ zzflg zzb;
    final /* synthetic */ zzfld zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfta zze;
    final /* synthetic */ zzflo zzf;
    final /* synthetic */ zzeqb zzg;

    zzepz(zzeqb zzeqbVar, long j, zzflg zzflgVar, zzfld zzfldVar, String str, zzfta zzftaVar, zzflo zzfloVar) {
        this.zza = j;
        this.zzb = zzflgVar;
        this.zzc = zzfldVar;
        this.zzd = str;
        this.zze = zzftaVar;
        this.zzf = zzfloVar;
        Objects.requireNonNull(zzeqbVar);
        this.zzg = zzeqbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(Throwable th) {
        Integer num;
        int i;
        com.google.android.gms.ads.internal.client.zze zzb;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzeqb zzeqbVar = this.zzg;
        long elapsedRealtime = zzeqbVar.zzj().elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzepj) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzfmd) {
            i = 5;
        } else {
            if (th instanceof zzefb) {
                r8 = zzfmy.zza(th).zza == 3 ? 1 : 6;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcs)).booleanValue() && (th instanceof zzemu) && (zzb = ((zzemu) th).zzb()) != null) {
                    num = Integer.valueOf(zzb.zza);
                    i = r8;
                    synchronized (zzeqbVar) {
                        try {
                            if (zzeqbVar.zzn()) {
                                zzeqbVar.zzk().zza(this.zzb, this.zzc, i, th instanceof zzemu ? (zzemu) th : null, elapsedRealtime);
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjK)).booleanValue()) {
                                zzfte zzl = zzeqbVar.zzl();
                                zzfta zzftaVar = this.zze;
                                zzflo zzfloVar = this.zzf;
                                zzfld zzfldVar = this.zzc;
                                zzl.zza(zzftaVar.zza(zzfloVar, zzfldVar, zzfldVar.zzn), zzfldVar.zzax);
                            }
                            if (zzeqbVar.zzp()) {
                                return;
                            }
                            LinkedHashMap zzm = zzeqbVar.zzm();
                            zzfld zzfldVar2 = this.zzc;
                            zzm.put(zzfldVar2, new zzeqa(this.zzd, zzfldVar2.zzaf, i, elapsedRealtime, num));
                            com.google.android.gms.ads.internal.client.zze zza = zzfmy.zza(th);
                            int i2 = zza.zza;
                            if ((i2 == 3 || i2 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                                zza = zzfmy.zza(new zzemu(13, zza.zzd));
                            }
                            zzeqbVar.zzo().zze(zzfldVar2, elapsedRealtime, zza);
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            num = null;
            i = r8;
            synchronized (zzeqbVar) {
            }
        }
        num = null;
        synchronized (zzeqbVar) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
        zzeqb zzeqbVar = this.zzg;
        long elapsedRealtime = zzeqbVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzeqbVar) {
            try {
                if (zzeqbVar.zzn()) {
                    zzeqbVar.zzk().zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
                }
                if (zzeqbVar.zzp()) {
                    return;
                }
                zzfld zzfldVar = this.zzc;
                if (zzeqbVar.zzi(zzfldVar)) {
                    ((zzeqa) zzeqbVar.zzm().get(zzfldVar)).zzd = elapsedRealtime;
                } else {
                    zzeqbVar.zzm().put(zzfldVar, new zzeqa(this.zzd, zzfldVar.zzaf, 0, elapsedRealtime, null));
                }
                zzeqbVar.zzo().zzd(zzfldVar, elapsedRealtime, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
