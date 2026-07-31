package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes.dex */
public final class zzags implements zzahk {
    private final zzagu zza;
    private final long zzb;

    public zzags(zzagu zzaguVar, long j) {
        this.zza = zzaguVar;
        this.zzb = j;
    }

    private final zzahl zze(long j, long j2) {
        return new zzahl((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        zzagu zzaguVar = this.zza;
        zzagt zzagtVar = zzaguVar.zzk;
        zzagtVar.getClass();
        long zzb = zzaguVar.zzb(j);
        long[] jArr = zzagtVar.zza;
        int zzo = zzfm.zzo(jArr, zzb, true, false);
        long j2 = zzo == -1 ? 0L : jArr[zzo];
        long[] jArr2 = zzagtVar.zzb;
        zzahl zze = zze(j2, zzo != -1 ? jArr2[zzo] : 0L);
        if (zze.zzb == j || zzo == jArr.length - 1) {
            return new zzahi(zze, zze);
        }
        int i = zzo + 1;
        return new zzahi(zze, zze(jArr[i], jArr2[i]));
    }
}
