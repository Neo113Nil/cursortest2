package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhkw {
    private static final zzhkw zza = new zzhkw(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhkw() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhkw(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzhkw zza() {
        return zza;
    }

    static zzhkw zzb() {
        return new zzhkw();
    }

    static zzhkw zzc(zzhkw zzhkwVar, zzhkw zzhkwVar2) {
        int i = zzhkwVar.zzb + zzhkwVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhkwVar.zzc, i);
        System.arraycopy(zzhkwVar2.zzc, 0, copyOf, zzhkwVar.zzb, zzhkwVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhkwVar.zzd, i);
        System.arraycopy(zzhkwVar2.zzd, 0, copyOf2, zzhkwVar.zzb, zzhkwVar2.zzb);
        return new zzhkw(i, copyOf, copyOf2, true);
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhkw)) {
            return false;
        }
        zzhkw zzhkwVar = (zzhkw) obj;
        int i = this.zzb;
        if (i == zzhkwVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhkwVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhkwVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    final void zzf(zzhlk zzhlkVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhlkVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzhlk zzhlkVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzhlkVar.zzc(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzhlkVar.zzj(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzhlkVar.zzn(i4, (zzhhb) obj);
                } else if (i3 == 3) {
                    zzhlkVar.zzt(i4);
                    ((zzhkw) obj).zzg(zzhlkVar);
                    zzhlkVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzhiv("Protocol message tag had invalid wire type."));
                    }
                    zzhlkVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zzhhb zzhhbVar = (zzhhb) this.zzd[i3];
            int zzA = zzhhm.zzA(8);
            int zzA2 = zzhhm.zzA(16) + zzhhm.zzA(i4);
            int zzA3 = zzhhm.zzA(24);
            int zzc = zzhhbVar.zzc();
            i2 += zzA + zzA + zzA2 + zzA3 + zzhhm.zzA(zzc) + zzc;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzi() {
        int zzA;
        int zzB;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zzhhm.zzA(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zzhhb zzhhbVar = (zzhhb) this.zzd[i4];
                    int zzA2 = zzhhm.zzA(i8);
                    int zzc = zzhhbVar.zzc();
                    i = zzA2 + zzhhm.zzA(zzc) + zzc;
                } else if (i7 == 3) {
                    int zzA3 = zzhhm.zzA(i6 << 3);
                    zzA = zzA3 + zzA3;
                    zzB = ((zzhkw) this.zzd[i4]).zzi();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(new zzhiv("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzhhm.zzA(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzA = zzhhm.zzA(i9);
                zzB = zzhhm.zzB(longValue);
            }
            i = zzA + zzB;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzhju.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzk(int i, Object obj) {
        zze();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final boolean zzl(int i, zzhhg zzhhgVar) throws IOException {
        int zza2;
        zze();
        int i2 = i & 7;
        if (i2 == 0) {
            zzk(i, Long.valueOf(zzhhgVar.zzg()));
            return true;
        }
        if (i2 == 1) {
            zzk(i, Long.valueOf(zzhhgVar.zzi()));
            return true;
        }
        if (i2 == 2) {
            zzk(i, zzhhgVar.zzn());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                zzhhgVar.zzI();
                return false;
            }
            if (i2 != 5) {
                throw new zzhiv("Protocol message tag had invalid wire type.");
            }
            zzk(i, Integer.valueOf(zzhhgVar.zzj()));
            return true;
        }
        zzhkw zzhkwVar = new zzhkw();
        do {
            zza2 = zzhhgVar.zza();
            if (zza2 == 0) {
                break;
            }
        } while (zzhkwVar.zzl(zza2, zzhhgVar));
        zzhhgVar.zzb(4 | ((i >>> 3) << 3));
        zzk(i, zzhkwVar);
        return true;
    }

    final zzhkw zzm(zzhkw zzhkwVar) {
        if (zzhkwVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzhkwVar.zzb;
        zzn(i);
        System.arraycopy(zzhkwVar.zzc, 0, this.zzc, this.zzb, zzhkwVar.zzb);
        System.arraycopy(zzhkwVar.zzd, 0, this.zzd, this.zzb, zzhkwVar.zzb);
        this.zzb = i;
        return this;
    }
}
