package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzayr extends zzath {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzayr(long j, boolean z) {
        this.zzc = j;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final zzatf zzd(int i, zzatf zzatfVar, boolean z) {
        zzbac.zza(i, 0, 1);
        Object obj = z ? zzb : null;
        long j = this.zzc;
        zzatfVar.zza = obj;
        zzatfVar.zzb = obj;
        zzatfVar.zzc = j;
        return zzatfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final zzatg zze(int i, zzatg zzatgVar, boolean z, long j) {
        zzbac.zza(i, 0, 1);
        zzatgVar.zza = this.zzd;
        return zzatgVar;
    }
}
