package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzaan extends zzaau implements Comparable {
    private final int zze;
    private final int zzf;

    public zzaan(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3) {
        super(i, zzbgVar, i2);
        this.zze = zzng.zzad(i3, zzaaqVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaan zzaanVar) {
        return Integer.compare(this.zzf, zzaanVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        return false;
    }
}
