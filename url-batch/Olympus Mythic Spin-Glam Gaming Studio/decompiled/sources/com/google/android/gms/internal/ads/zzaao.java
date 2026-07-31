package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzaao implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzaao(zzv zzvVar, int i) {
        this.zza = 1 == (zzvVar.zze & 1);
        this.zzb = zzng.zzad(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaao zzaaoVar) {
        return zzgwz.zzg().zzd(this.zzb, zzaaoVar.zzb).zzd(this.zza, zzaaoVar.zza).zze();
    }
}
