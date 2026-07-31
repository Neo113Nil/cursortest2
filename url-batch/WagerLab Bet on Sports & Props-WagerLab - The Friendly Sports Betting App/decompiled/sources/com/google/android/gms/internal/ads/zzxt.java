package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzxt extends zzxv implements Comparable {
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

    public zzxt(int i, zzbf zzbfVar, int i2, zzxo zzxoVar, int i3, String str, String str2) {
        super(i, zzbfVar, i2);
        int i4;
        int i5;
        boolean z;
        int i6 = 0;
        this.zzf = zzln.zzZ(i3, false);
        int i7 = this.zzd.zze;
        int i8 = zzxoVar.zzC;
        this.zzg = 1 == (i7 & 1);
        this.zzh = (i7 & 2) != 0;
        zzgjz zzj = str2 != null ? zzgjz.zzj(str2) : zzxoVar.zzy.isEmpty() ? zzgjz.zzj("") : zzxoVar.zzy;
        int i9 = 0;
        while (true) {
            if (i9 >= zzj.size()) {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            }
            zzu zzuVar = this.zzd;
            String str3 = (String) zzj.get(i9);
            boolean z2 = zzxoVar.zzD;
            i4 = zzyd.zzj(zzuVar, str3, false);
            if (i4 > 0) {
                break;
            } else {
                i9++;
            }
        }
        this.zzi = i9;
        this.zzj = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            int i10 = zzxoVar.zzA;
            i5 = 0;
        }
        int zzm = zzyd.zzm(this.zzd.zzf, i5);
        this.zzk = zzm;
        zzu zzuVar2 = this.zzd;
        this.zzn = (1088 & zzuVar2.zzf) != 0;
        int zzn = zzyd.zzn(zzuVar2, zzxoVar.zzz);
        this.zzl = zzn;
        int zzj2 = zzyd.zzj(this.zzd, str, zzyd.zzi(str) == null);
        this.zzm = zzj2;
        if (i4 > 0 || ((zzxoVar.zzy.isEmpty() && zzm > 0) || ((zzxoVar.zzy.isEmpty() && zzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && zzj2 > 0)))) {
            z = true;
        } else {
            boolean z3 = zzxoVar.zzx;
            z = false;
        }
        if (zzln.zzZ(i3, zzxoVar.zzV) && z) {
            i6 = 1;
        }
        this.zze = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxt zzxtVar) {
        zzgjp zza = zzgjp.zzg().zzd(this.zzf, zzxtVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzxtVar.zzi), zzglj.zzb().zza());
        int i = this.zzj;
        zzgjp zzb = zza.zzb(i, zzxtVar.zzj);
        int i2 = this.zzk;
        zzgjp zzb2 = zzb.zzb(i2, zzxtVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzxtVar.zzl), zzglj.zzb().zza()).zzd(this.zzg, zzxtVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxtVar.zzh), i == 0 ? zzglj.zzb() : zzglj.zzb().zza()).zzb(this.zzm, zzxtVar.zzm);
        if (i2 == 0) {
            zzb2 = zzb2.zzc(this.zzn, zzxtVar.zzn);
        }
        return zzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        return false;
    }
}
