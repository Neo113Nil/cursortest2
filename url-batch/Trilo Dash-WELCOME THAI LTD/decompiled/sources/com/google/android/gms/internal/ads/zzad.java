package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzad {
    private static final zzad zzG = new zzad(new zzab());
    public static final zzl zza = new zzl() { // from class: com.google.android.gms.internal.ads.zzz
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
    public final zzbl zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzv zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzo zzy;
    public final int zzz;

    private zzad(zzab zzabVar) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        String str4;
        zzbl zzblVar;
        String str5;
        String str6;
        int i4;
        List list;
        zzv zzvVar;
        long j;
        int i5;
        int i6;
        float f;
        int i7;
        float f2;
        byte[] bArr;
        int i8;
        zzo zzoVar;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        str = zzabVar.zza;
        this.zzb = str;
        str2 = zzabVar.zzb;
        this.zzc = str2;
        str3 = zzabVar.zzc;
        this.zzd = zzeg.zzO(str3);
        i = zzabVar.zzd;
        this.zze = i;
        this.zzf = 0;
        i2 = zzabVar.zze;
        this.zzg = i2;
        i3 = zzabVar.zzf;
        this.zzh = i3;
        this.zzi = i3 != -1 ? i3 : i2;
        str4 = zzabVar.zzg;
        this.zzj = str4;
        zzblVar = zzabVar.zzh;
        this.zzk = zzblVar;
        str5 = zzabVar.zzi;
        this.zzl = str5;
        str6 = zzabVar.zzj;
        this.zzm = str6;
        i4 = zzabVar.zzk;
        this.zzn = i4;
        list = zzabVar.zzl;
        this.zzo = list == null ? Collections.emptyList() : zzabVar.zzl;
        zzvVar = zzabVar.zzm;
        this.zzp = zzvVar;
        j = zzabVar.zzn;
        this.zzq = j;
        i5 = zzabVar.zzo;
        this.zzr = i5;
        i6 = zzabVar.zzp;
        this.zzs = i6;
        f = zzabVar.zzq;
        this.zzt = f;
        i7 = zzabVar.zzr;
        this.zzu = i7 == -1 ? 0 : zzabVar.zzr;
        f2 = zzabVar.zzs;
        this.zzv = f2 == -1.0f ? 1.0f : zzabVar.zzs;
        bArr = zzabVar.zzt;
        this.zzw = bArr;
        i8 = zzabVar.zzu;
        this.zzx = i8;
        zzoVar = zzabVar.zzv;
        this.zzy = zzoVar;
        i9 = zzabVar.zzw;
        this.zzz = i9;
        i10 = zzabVar.zzx;
        this.zzA = i10;
        i11 = zzabVar.zzy;
        this.zzB = i11;
        i12 = zzabVar.zzz;
        this.zzC = i12 == -1 ? 0 : zzabVar.zzz;
        i13 = zzabVar.zzA;
        this.zzD = i13 != -1 ? zzabVar.zzA : 0;
        i14 = zzabVar.zzB;
        this.zzE = i14;
        i15 = zzabVar.zzC;
        this.zzF = (i15 != 0 || zzvVar == null) ? zzabVar.zzC : 1;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzad zzadVar = (zzad) obj;
            int i2 = this.zzH;
            if ((i2 == 0 || (i = zzadVar.zzH) == 0 || i2 == i) && this.zze == zzadVar.zze && this.zzg == zzadVar.zzg && this.zzh == zzadVar.zzh && this.zzn == zzadVar.zzn && this.zzq == zzadVar.zzq && this.zzr == zzadVar.zzr && this.zzs == zzadVar.zzs && this.zzu == zzadVar.zzu && this.zzx == zzadVar.zzx && this.zzz == zzadVar.zzz && this.zzA == zzadVar.zzA && this.zzB == zzadVar.zzB && this.zzC == zzadVar.zzC && this.zzD == zzadVar.zzD && this.zzE == zzadVar.zzE && this.zzF == zzadVar.zzF && Float.compare(this.zzt, zzadVar.zzt) == 0 && Float.compare(this.zzv, zzadVar.zzv) == 0 && zzeg.zzS(this.zzb, zzadVar.zzb) && zzeg.zzS(this.zzc, zzadVar.zzc) && zzeg.zzS(this.zzj, zzadVar.zzj) && zzeg.zzS(this.zzl, zzadVar.zzl) && zzeg.zzS(this.zzm, zzadVar.zzm) && zzeg.zzS(this.zzd, zzadVar.zzd) && Arrays.equals(this.zzw, zzadVar.zzw) && zzeg.zzS(this.zzk, zzadVar.zzk) && zzeg.zzS(this.zzy, zzadVar.zzy) && zzeg.zzS(this.zzp, zzadVar.zzp) && zzd(zzadVar)) {
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

    public final zzab zzb() {
        return new zzab(this, null);
    }

    public final zzad zzc(int i) {
        zzab zzabVar = new zzab(this, null);
        zzabVar.zzA(i);
        return new zzad(zzabVar);
    }

    public final boolean zzd(zzad zzadVar) {
        if (this.zzo.size() != zzadVar.zzo.size()) {
            return false;
        }
        for (int i = 0; i < this.zzo.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzadVar.zzo.get(i))) {
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
        zzbl zzblVar = this.zzk;
        int hashCode5 = (hashCode4 + (zzblVar == null ? 0 : zzblVar.hashCode())) * 31;
        String str5 = this.zzl;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzm;
        int hashCode7 = ((((((((((((((((((((((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
        this.zzH = hashCode7;
        return hashCode7;
    }
}
