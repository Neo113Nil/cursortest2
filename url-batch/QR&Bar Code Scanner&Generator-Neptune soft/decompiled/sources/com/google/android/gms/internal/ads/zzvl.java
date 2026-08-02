package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzvl extends zzvn implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzvl(int i, zzcp zzcpVar, int i2, zzvf zzvfVar, int i3, String str) {
        super(i, zzcpVar, i2);
        int i4;
        int i5 = 0;
        this.zzf = zzvr.zzm(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzvfVar.zzx;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzfvn zzp = zzvfVar.zzv.isEmpty() ? zzfvn.zzp("") : zzvfVar.zzv;
        int i8 = 0;
        while (true) {
            if (i8 >= zzp.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            zzaf zzafVar = this.zzd;
            String str2 = (String) zzp.get(i8);
            boolean z = zzvfVar.zzy;
            i4 = zzvr.zza(zzafVar, str2, false);
            if (i4 > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int i10 = zzvfVar.zzw;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i11 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzvr.zza(this.zzd, str, zzvr.zzf(str) == null);
        this.zzl = zza;
        boolean z2 = i4 > 0 || (zzvfVar.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzvr.zzm(i3, zzvfVar.zzQ) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzvl zzvlVar) {
        zzfvc zzb = zzfvc.zzj().zzd(this.zzf, zzvlVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzvlVar.zzi), zzfwv.zzc().zza()).zzb(this.zzj, zzvlVar.zzj).zzb(this.zzk, zzvlVar.zzk).zzd(this.zzg, zzvlVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzvlVar.zzh), this.zzj == 0 ? zzfwv.zzc() : zzfwv.zzc().zza()).zzb(this.zzl, zzvlVar.zzl);
        if (this.zzk == 0) {
            boolean z = zzvlVar.zzm;
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final /* bridge */ /* synthetic */ boolean zzc(zzvn zzvnVar) {
        return false;
    }
}
