package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzuq extends zzvb implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzuu zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzuq(int i, zzck zzckVar, int i2, zzuu zzuuVar, int i3, boolean z) {
        super(i, zzckVar, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.zzh = zzuuVar;
        this.zzg = zzvf.zzf(this.zzd.zzd);
        int i7 = 0;
        this.zzi = zzvf.zzi(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzuuVar.zzq.size()) {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            } else {
                i5 = zzvf.zza(this.zzd, (String) zzuuVar.zzq.get(i8), false);
                if (i5 > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzk = i8;
        this.zzj = i5;
        int i9 = this.zzd.zzf;
        int i10 = zzuuVar.zzr;
        this.zzl = Integer.bitCount(0);
        zzad zzadVar = this.zzd;
        int i11 = zzadVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzadVar.zze & 1);
        this.zzq = zzadVar.zzz;
        this.zzr = zzadVar.zzA;
        this.zzs = zzadVar.zzi;
        if (zzadVar.zzi != -1) {
            int i12 = zzuuVar.zzt;
        }
        if (zzadVar.zzz != -1) {
            int i13 = zzuuVar.zzs;
        }
        this.zzf = true;
        String[] zzae = zzeg.zzae();
        int i14 = 0;
        while (true) {
            if (i14 >= zzae.length) {
                i14 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            } else {
                i6 = zzvf.zza(this.zzd, zzae[i14], false);
                if (i6 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.zzn = i14;
        this.zzo = i6;
        int i15 = 0;
        while (true) {
            if (i15 < zzuuVar.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzuuVar.zzu.get(i15))) {
                    i4 = i15;
                    break;
                }
                i15++;
            } else {
                break;
            }
        }
        this.zzt = i4;
        this.zzu = (i3 & 128) == 128;
        this.zzv = (i3 & 64) == 64;
        zzuu zzuuVar2 = this.zzh;
        if (zzvf.zzi(i3, zzuuVar2.zzP) && ((z2 = this.zzf) || zzuuVar2.zzK)) {
            if (zzvf.zzi(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z3 = zzuuVar2.zzz;
                boolean z4 = zzuuVar2.zzy;
                if (zzuuVar2.zzR || !z) {
                    i7 = 2;
                }
            }
            i7 = 1;
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final /* bridge */ /* synthetic */ boolean zzc(zzvb zzvbVar) {
        zzuq zzuqVar = (zzuq) zzvbVar;
        zzuu zzuuVar = this.zzh;
        boolean z = zzuuVar.zzN;
        zzad zzadVar = this.zzd;
        int i = zzadVar.zzz;
        if (i == -1) {
            return false;
        }
        zzad zzadVar2 = zzuqVar.zzd;
        if (i != zzadVar2.zzz) {
            return false;
        }
        boolean z2 = zzuuVar.zzL;
        String str = zzadVar.zzm;
        if (str == null || !TextUtils.equals(str, zzadVar2.zzm)) {
            return false;
        }
        zzuu zzuuVar2 = this.zzh;
        boolean z3 = zzuuVar2.zzM;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzuqVar.zzd.zzA) {
            return false;
        }
        boolean z4 = zzuuVar2.zzO;
        return this.zzu == zzuqVar.zzu && this.zzv == zzuqVar.zzv;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzuq zzuqVar) {
        zzfsp zzfspVar;
        zzfsp zza;
        zzfsp zzfspVar2;
        if (this.zzf && this.zzi) {
            zza = zzvf.zzb;
        } else {
            zzfspVar = zzvf.zzb;
            zza = zzfspVar.zza();
        }
        zzfqw zzd = zzfqw.zzj().zzd(this.zzi, zzuqVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzuqVar.zzk), zzfsp.zzc().zza()).zzb(this.zzj, zzuqVar.zzj).zzb(this.zzl, zzuqVar.zzl).zzd(this.zzp, zzuqVar.zzp);
        boolean z = zzuqVar.zzm;
        zzfqw zzc = zzd.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzuqVar.zzn), zzfsp.zzc().zza()).zzb(this.zzo, zzuqVar.zzo).zzd(this.zzf, zzuqVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzuqVar.zzt), zzfsp.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzuqVar.zzs);
        boolean z2 = this.zzh.zzy;
        zzfspVar2 = zzvf.zzc;
        zzfqw zzc2 = zzc.zzc(valueOf, valueOf2, zzfspVar2).zzd(this.zzu, zzuqVar.zzu).zzd(this.zzv, zzuqVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzuqVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzuqVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzuqVar.zzs);
        if (!zzeg.zzS(this.zzg, zzuqVar.zzg)) {
            zza = zzvf.zzc;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }
}
