package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzxn extends zzxp implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxn(int i, zzcd zzcdVar, int i2, zzxi zzxiVar, int i3, String str) {
        super(i, zzcdVar, i2);
        int i4;
        int i5 = 0;
        this.zzf = zzlf.zza(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzxiVar.zzv;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzfxr zzn = zzxiVar.zzt.isEmpty() ? zzfxr.zzn("") : zzxiVar.zzt;
        int i8 = 0;
        while (true) {
            if (i8 >= zzn.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            zzaf zzafVar = this.zzd;
            String str2 = (String) zzn.get(i8);
            boolean z = zzxiVar.zzw;
            i4 = zzxt.zzc(zzafVar, str2, false);
            if (i4 > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.zzi = i8;
        this.zzj = i4;
        int zzb = zzxt.zzb(this.zzd.zzf, zzxiVar.zzu);
        this.zzk = zzb;
        this.zzm = (this.zzd.zzf & 1088) != 0;
        int zzc = zzxt.zzc(this.zzd, str, zzxt.zzh(str) == null);
        this.zzl = zzc;
        boolean z2 = i4 > 0 || (zzxiVar.zzt.isEmpty() && zzb > 0) || this.zzg || (this.zzh && zzc > 0);
        if (zzlf.zza(i3, zzxiVar.zzN) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxn zzxnVar) {
        zzfxg zzb = zzfxg.zzj().zzd(this.zzf, zzxnVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxnVar.zzi), zzfzc.zzc().zza()).zzb(this.zzj, zzxnVar.zzj).zzb(this.zzk, zzxnVar.zzk).zzd(this.zzg, zzxnVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxnVar.zzh), this.zzj == 0 ? zzfzc.zzc() : zzfzc.zzc().zza()).zzb(this.zzl, zzxnVar.zzl);
        if (this.zzk == 0) {
            zzb = zzb.zze(this.zzm, zzxnVar.zzm);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxp
    public final /* bridge */ /* synthetic */ boolean zzc(zzxp zzxpVar) {
        return false;
    }
}
