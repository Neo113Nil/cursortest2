package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgua extends zzgty {
    zzgua() {
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* synthetic */ int zza(Object obj) {
        return ((zzgtz) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* synthetic */ int zzb(Object obj) {
        return ((zzgtz) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgre zzgreVar = (zzgre) obj;
        zzgtz zzgtzVar = zzgreVar.zzc;
        if (zzgtzVar != zzgtz.zzc()) {
            return zzgtzVar;
        }
        zzgtz zze = zzgtz.zze();
        zzgreVar.zzc = zze;
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzgre) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzgtz zzgtzVar = (zzgtz) obj2;
        return zzgtzVar.equals(zzgtz.zzc()) ? obj : zzgtz.zzd((zzgtz) obj, zzgtzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* synthetic */ Object zzf() {
        return zzgtz.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* synthetic */ Object zzg(Object obj) {
        ((zzgtz) obj).zzf();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzgtz) obj).zzh((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzgtz) obj).zzh((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzgtz) obj).zzh((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzgpw zzgpwVar) {
        ((zzgtz) obj).zzh((i << 3) | 2, zzgpwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzgtz) obj).zzh(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final void zzm(Object obj) {
        ((zzgre) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgre) obj).zzc = (zzgtz) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgre) obj).zzc = (zzgtz) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final boolean zzq(zzgsz zzgszVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgty
    final /* synthetic */ void zzr(Object obj, zzgqm zzgqmVar) throws IOException {
        ((zzgtz) obj).zzi(zzgqmVar);
    }
}
