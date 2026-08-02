package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzuz extends zzvn implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzvf zzh;
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

    public zzuz(int i, zzcp zzcpVar, int i2, zzvf zzvfVar, int i3, boolean z, zzfsy zzfsyVar) {
        super(i, zzcpVar, i2);
        int i4;
        int i5;
        int i6;
        boolean z2;
        this.zzh = zzvfVar;
        this.zzg = zzvr.zzf(this.zzd.zzd);
        int i7 = 0;
        this.zzi = zzvr.zzm(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 >= zzvfVar.zzq.size()) {
                i5 = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                i5 = zzvr.zza(this.zzd, (String) zzvfVar.zzq.get(i8), false);
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
        int i10 = zzvfVar.zzr;
        this.zzl = Integer.bitCount(0);
        zzaf zzafVar = this.zzd;
        int i11 = zzafVar.zzf;
        this.zzm = true;
        this.zzp = 1 == (zzafVar.zze & 1);
        this.zzq = zzafVar.zzz;
        this.zzr = zzafVar.zzA;
        this.zzs = zzafVar.zzi;
        if (zzafVar.zzi != -1) {
            int i12 = zzvfVar.zzt;
        }
        if (zzafVar.zzz != -1) {
            int i13 = zzvfVar.zzs;
        }
        this.zzf = zzfsyVar.zza(zzafVar);
        String[] zzaf = zzen.zzaf();
        int i14 = 0;
        while (true) {
            if (i14 >= zzaf.length) {
                i6 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                i6 = zzvr.zza(this.zzd, zzaf[i14], false);
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
            if (i15 < zzvfVar.zzu.size()) {
                String str = this.zzd.zzm;
                if (str != null && str.equals(zzvfVar.zzu.get(i15))) {
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
        zzvf zzvfVar2 = this.zzh;
        if (zzvr.zzm(i3, zzvfVar2.zzQ) && ((z2 = this.zzf) || zzvfVar2.zzK)) {
            if (zzvr.zzm(i3, false) && z2 && this.zzd.zzi != -1) {
                boolean z3 = zzvfVar2.zzA;
                boolean z4 = zzvfVar2.zzz;
                if (zzvfVar2.zzS || !z) {
                    i7 = 2;
                }
            }
            i7 = 1;
        }
        this.zze = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final /* bridge */ /* synthetic */ boolean zzc(zzvn zzvnVar) {
        zzuz zzuzVar = (zzuz) zzvnVar;
        zzvf zzvfVar = this.zzh;
        boolean z = zzvfVar.zzN;
        zzaf zzafVar = this.zzd;
        int i = zzafVar.zzz;
        if (i == -1) {
            return false;
        }
        zzaf zzafVar2 = zzuzVar.zzd;
        if (i != zzafVar2.zzz) {
            return false;
        }
        boolean z2 = zzvfVar.zzL;
        String str = zzafVar.zzm;
        if (str == null || !TextUtils.equals(str, zzafVar2.zzm)) {
            return false;
        }
        zzvf zzvfVar2 = this.zzh;
        boolean z3 = zzvfVar2.zzM;
        int i2 = this.zzd.zzA;
        if (i2 == -1 || i2 != zzuzVar.zzd.zzA) {
            return false;
        }
        boolean z4 = zzvfVar2.zzO;
        return this.zzu == zzuzVar.zzu && this.zzv == zzuzVar.zzv;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzuz zzuzVar) {
        zzfwv zzfwvVar;
        zzfwv zza;
        zzfwv zzfwvVar2;
        if (this.zzf && this.zzi) {
            zza = zzvr.zzc;
        } else {
            zzfwvVar = zzvr.zzc;
            zza = zzfwvVar.zza();
        }
        zzfvc zzd = zzfvc.zzj().zzd(this.zzi, zzuzVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzuzVar.zzk), zzfwv.zzc().zza()).zzb(this.zzj, zzuzVar.zzj).zzb(this.zzl, zzuzVar.zzl).zzd(this.zzp, zzuzVar.zzp);
        boolean z = zzuzVar.zzm;
        zzfvc zzc = zzd.zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzuzVar.zzn), zzfwv.zzc().zza()).zzb(this.zzo, zzuzVar.zzo).zzd(this.zzf, zzuzVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzuzVar.zzt), zzfwv.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzuzVar.zzs);
        boolean z2 = this.zzh.zzz;
        zzfwvVar2 = zzvr.zzd;
        zzfvc zzc2 = zzc.zzc(valueOf, valueOf2, zzfwvVar2).zzd(this.zzu, zzuzVar.zzu).zzd(this.zzv, zzuzVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzuzVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzuzVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzuzVar.zzs);
        if (!zzen.zzT(this.zzg, zzuzVar.zzg)) {
            zza = zzvr.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }
}
