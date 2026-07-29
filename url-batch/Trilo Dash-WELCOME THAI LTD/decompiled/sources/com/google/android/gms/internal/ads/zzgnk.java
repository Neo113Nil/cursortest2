package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgnk extends zzgni {
    zzgnk() {
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* synthetic */ int zza(Object obj) {
        return ((zzgnj) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* synthetic */ int zzb(Object obj) {
        return ((zzgnj) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgko zzgkoVar = (zzgko) obj;
        zzgnj zzgnjVar = zzgkoVar.zzc;
        if (zzgnjVar != zzgnj.zzc()) {
            return zzgnjVar;
        }
        zzgnj zze = zzgnj.zze();
        zzgkoVar.zzc = zze;
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzgko) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzgnj zzgnjVar = (zzgnj) obj2;
        return zzgnjVar.equals(zzgnj.zzc()) ? obj : zzgnj.zzd((zzgnj) obj, zzgnjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* synthetic */ Object zzf() {
        return zzgnj.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* synthetic */ Object zzg(Object obj) {
        ((zzgnj) obj).zzf();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzgnj) obj).zzh((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzgnj) obj).zzh((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzgnj) obj).zzh((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzgjg zzgjgVar) {
        ((zzgnj) obj).zzh((i << 3) | 2, zzgjgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzgnj) obj).zzh(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final void zzm(Object obj) {
        ((zzgko) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgko) obj).zzc = (zzgnj) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgko) obj).zzc = (zzgnj) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final boolean zzq(zzgmj zzgmjVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgni
    final /* synthetic */ void zzr(Object obj, zzgjw zzgjwVar) throws IOException {
        ((zzgnj) obj).zzi(zzgjwVar);
    }
}
