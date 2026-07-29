package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzuz extends zzvb implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    public zzuz(int i, zzck zzckVar, int i2, zzuu zzuuVar, int i3, String str) {
        super(i, zzckVar, i2);
        int i4;
        int i5 = 0;
        this.zzf = zzvf.zzi(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzuuVar.zzF;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzfrh zzp = zzuuVar.zzv.isEmpty() ? zzfrh.zzp("") : zzuuVar.zzv;
        int i8 = 0;
        while (true) {
            if (i8 >= zzp.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            zzad zzadVar = this.zzd;
            String str2 = (String) zzp.get(i8);
            boolean z = zzuuVar.zzx;
            i4 = zzvf.zza(zzadVar, str2, false);
            if (i4 > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int i10 = zzuuVar.zzw;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i11 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzvf.zza(this.zzd, str, zzvf.zzf(str) == null);
        this.zzl = zza;
        boolean z2 = i4 > 0 || (zzuuVar.zzv.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzvf.zzi(i3, zzuuVar.zzP) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzuz zzuzVar) {
        zzfqw zzb = zzfqw.zzj().zzd(this.zzf, zzuzVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzuzVar.zzi), zzfsp.zzc().zza()).zzb(this.zzj, zzuzVar.zzj).zzb(this.zzk, zzuzVar.zzk).zzd(this.zzg, zzuzVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzuzVar.zzh), this.zzj == 0 ? zzfsp.zzc() : zzfsp.zzc().zza()).zzb(this.zzl, zzuzVar.zzl);
        if (this.zzk == 0) {
            boolean z = zzuzVar.zzm;
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvbVar) {
        return false;
    }
}
