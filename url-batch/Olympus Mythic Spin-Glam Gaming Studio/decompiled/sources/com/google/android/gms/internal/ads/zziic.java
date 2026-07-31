package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
final class zziic extends zziia {
    zziic() {
    }

    static final void zzi(zziib zziibVar, int i, zziei zzieiVar) {
        zziibVar.zzk((i << 3) | 2, zzieiVar);
    }

    static final void zzj(zziib zziibVar, int i, long j) {
        zziibVar.zzk(i << 3, Long.valueOf(j));
    }

    static final zziib zzk(Object obj) {
        zzifm zzifmVar = (zzifm) obj;
        zziib zziibVar = zzifmVar.zzt;
        if (zziibVar != zziib.zza()) {
            return zziibVar;
        }
        zziib zzb = zziib.zzb();
        zzifmVar.zzt = zzb;
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zziia
    final /* bridge */ /* synthetic */ void zza(Object obj, int i, long j) {
        zzj((zziib) obj, i, j);
    }

    @Override // com.google.android.gms.internal.ads.zziia
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i, int i2) {
        ((zziib) obj).zzk((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zziia
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i, long j) {
        ((zziib) obj).zzk((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zziia
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i, zziei zzieiVar) {
        zzi((zziib) obj, i, zzieiVar);
    }

    @Override // com.google.android.gms.internal.ads.zziia
    final /* bridge */ /* synthetic */ void zze(Object obj, int i, Object obj2) {
        ((zziib) obj).zzk((i << 3) | 3, (zziib) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zziia
    final /* synthetic */ Object zzf() {
        return zziib.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zziia
    final /* synthetic */ Object zzg(Object obj) {
        zziib zziibVar = (zziib) obj;
        zziibVar.zzd();
        return zziibVar;
    }
}
