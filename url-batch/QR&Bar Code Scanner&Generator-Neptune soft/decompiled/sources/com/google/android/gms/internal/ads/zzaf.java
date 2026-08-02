package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzaf {
    private static final zzaf zzG = new zzaf(new zzad());
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzab
    };
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzH;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbq zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzx zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzq zzy;
    public final int zzz;

    private zzaf(zzad zzadVar) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String str4;
        zzbq zzbqVar;
        String str5;
        String str6;
        int i4;
        List list;
        zzx zzxVar;
        long j;
        int i5;
        int i6;
        float f;
        int i7;
        float f2;
        byte[] bArr;
        int i8;
        zzq zzqVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        str = zzadVar.zza;
        this.zzb = str;
        str2 = zzadVar.zzb;
        this.zzc = str2;
        str3 = zzadVar.zzc;
        this.zzd = zzen.zzP(str3);
        i = zzadVar.zzd;
        this.zze = i;
        this.zzf = 0;
        i2 = zzadVar.zze;
        this.zzg = i2;
        i3 = zzadVar.zzf;
        this.zzh = i3;
        this.zzi = i3 != -1 ? i3 : i2;
        str4 = zzadVar.zzg;
        this.zzj = str4;
        zzbqVar = zzadVar.zzh;
        this.zzk = zzbqVar;
        str5 = zzadVar.zzi;
        this.zzl = str5;
        str6 = zzadVar.zzj;
        this.zzm = str6;
        i4 = zzadVar.zzk;
        this.zzn = i4;
        list = zzadVar.zzl;
        this.zzo = list == null ? Collections.emptyList() : zzadVar.zzl;
        zzxVar = zzadVar.zzm;
        this.zzp = zzxVar;
        j = zzadVar.zzn;
        this.zzq = j;
        i5 = zzadVar.zzo;
        this.zzr = i5;
        i6 = zzadVar.zzp;
        this.zzs = i6;
        f = zzadVar.zzq;
        this.zzt = f;
        i7 = zzadVar.zzr;
        this.zzu = i7 == -1 ? 0 : zzadVar.zzr;
        f2 = zzadVar.zzs;
        this.zzv = f2 == -1.0f ? 1.0f : zzadVar.zzs;
        bArr = zzadVar.zzt;
        this.zzw = bArr;
        i8 = zzadVar.zzu;
        this.zzx = i8;
        zzqVar = zzadVar.zzv;
        this.zzy = zzqVar;
        i9 = zzadVar.zzw;
        this.zzz = i9;
        i10 = zzadVar.zzx;
        this.zzA = i10;
        i11 = zzadVar.zzy;
        this.zzB = i11;
        i12 = zzadVar.zzz;
        this.zzC = i12 == -1 ? 0 : zzadVar.zzz;
        i13 = zzadVar.zzA;
        this.zzD = i13 != -1 ? zzadVar.zzA : 0;
        i14 = zzadVar.zzB;
        this.zzE = i14;
        i15 = zzadVar.zzC;
        this.zzF = (i15 != 0 || zzxVar == null) ? zzadVar.zzC : 1;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaf zzafVar = (zzaf) obj;
            int i2 = this.zzH;
            if ((i2 == 0 || (i = zzafVar.zzH) == 0 || i2 == i) && this.zze == zzafVar.zze && this.zzg == zzafVar.zzg && this.zzh == zzafVar.zzh && this.zzn == zzafVar.zzn && this.zzq == zzafVar.zzq && this.zzr == zzafVar.zzr && this.zzs == zzafVar.zzs && this.zzu == zzafVar.zzu && this.zzx == zzafVar.zzx && this.zzz == zzafVar.zzz && this.zzA == zzafVar.zzA && this.zzB == zzafVar.zzB && this.zzC == zzafVar.zzC && this.zzD == zzafVar.zzD && this.zzE == zzafVar.zzE && this.zzF == zzafVar.zzF && Float.compare(this.zzt, zzafVar.zzt) == 0 && Float.compare(this.zzv, zzafVar.zzv) == 0 && zzen.zzT(this.zzb, zzafVar.zzb) && zzen.zzT(this.zzc, zzafVar.zzc) && zzen.zzT(this.zzj, zzafVar.zzj) && zzen.zzT(this.zzl, zzafVar.zzl) && zzen.zzT(this.zzm, zzafVar.zzm) && zzen.zzT(this.zzd, zzafVar.zzd) && Arrays.equals(this.zzw, zzafVar.zzw) && zzen.zzT(this.zzk, zzafVar.zzk) && zzen.zzT(this.zzy, zzafVar.zzy) && zzen.zzT(this.zzp, zzafVar.zzp) && zzd(zzafVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzl + ", " + this.zzm + ", " + this.zzj + ", " + this.zzi + ", " + this.zzd + ", [" + this.zzr + ", " + this.zzs + ", " + this.zzt + "], [" + this.zzz + ", " + this.zzA + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzad zzb() {
        return new zzad(this, null);
    }

    public final zzaf zzc(int i) {
        zzad zzadVar = new zzad(this, null);
        zzadVar.zzA(i);
        return new zzaf(zzadVar);
    }

    public final boolean zzd(zzaf zzafVar) {
        if (this.zzo.size() != zzafVar.zzo.size()) {
            return false;
        }
        for (int i = 0; i < this.zzo.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzafVar.zzo.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.zzH;
        if (i != 0) {
            return i;
        }
        String str = this.zzb;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.zzc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        int hashCode3 = (((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh) * 31;
        String str4 = this.zzj;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzbq zzbqVar = this.zzk;
        int hashCode5 = (hashCode4 + (zzbqVar == null ? 0 : zzbqVar.hashCode())) * 31;
        String str5 = this.zzl;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzm;
        int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
        this.zzH = hashCode7;
        return hashCode7;
    }
}
