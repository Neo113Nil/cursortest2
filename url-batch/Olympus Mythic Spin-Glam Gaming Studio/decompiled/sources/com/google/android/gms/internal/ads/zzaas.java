package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzaas extends zzaau implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzaas(int i, zzbg zzbgVar, int i2, zzaaq zzaaqVar, int i3, @Nullable String str, @Nullable String str2) {
        super(i, zzbgVar, i2);
        int i4;
        int i5 = 0;
        this.zzf = zzng.zzad(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzaaqVar.zzC;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzgxm zzj = str2 != null ? zzgxm.zzj(str2) : zzaaqVar.zzy.isEmpty() ? zzgxm.zzj("") : zzaaqVar.zzy;
        int i8 = 0;
        while (true) {
            if (i8 >= zzj.size()) {
                i4 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i4 = zzabc.zzj(this.zzd, (String) zzj.get(i8), false);
                if (i4 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzi = i8;
        this.zzj = i4;
        int zzm = zzabc.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = zzm;
        zzv zzvVar = this.zzd;
        this.zzn = (1088 & zzvVar.zzf) != 0;
        int zzn = zzabc.zzn(zzvVar, zzaaqVar.zzz);
        this.zzl = zzn;
        int zzj2 = zzabc.zzj(this.zzd, str, zzabc.zzi(str) == null);
        this.zzm = zzj2;
        boolean z = i4 > 0 || (zzaaqVar.zzy.isEmpty() && zzm > 0) || ((zzaaqVar.zzy.isEmpty() && zzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && zzj2 > 0));
        if (zzng.zzad(i3, zzaaqVar.zzV) && z) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzaas zzaasVar) {
        zzgwz zza = zzgwz.zzg().zzd(this.zzf, zzaasVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzaasVar.zzi), zzgzg.zzb().zza());
        int i = this.zzj;
        zzgwz zzb = zza.zzb(i, zzaasVar.zzj);
        int i2 = this.zzk;
        zzgwz zzb2 = zzb.zzb(i2, zzaasVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzaasVar.zzl), zzgzg.zzb().zza()).zzd(this.zzg, zzaasVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzaasVar.zzh), i == 0 ? zzgzg.zzb() : zzgzg.zzb().zza()).zzb(this.zzm, zzaasVar.zzm);
        if (i2 == 0) {
            zzb2 = zzb2.zzc(this.zzn, zzaasVar.zzn);
        }
        return zzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaau
    public final /* bridge */ /* synthetic */ boolean zzc(zzaau zzaauVar) {
        return false;
    }
}
