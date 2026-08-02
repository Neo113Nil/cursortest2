package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzva implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzva(zzaf zzafVar, int i) {
        this.zza = 1 == (zzafVar.zze & 1);
        this.zzb = zzvr.zzm(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzva zzvaVar) {
        return zzfvc.zzj().zzd(this.zzb, zzvaVar.zzb).zzd(this.zza, zzvaVar.zza).zza();
    }
}
