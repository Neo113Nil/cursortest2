package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzgtz {
    private static final zzgtz zza = new zzgtz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgtz() {
        this(0, new int[8], new Object[8], true);
    }

    private zzgtz(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgtz zzc() {
        return zza;
    }

    static zzgtz zzd(zzgtz zzgtzVar, zzgtz zzgtzVar2) {
        int i = zzgtzVar.zzb + zzgtzVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzgtzVar.zzc, i);
        System.arraycopy(zzgtzVar2.zzc, 0, copyOf, zzgtzVar.zzb, zzgtzVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzgtzVar.zzd, i);
        System.arraycopy(zzgtzVar2.zzd, 0, copyOf2, zzgtzVar.zzb, zzgtzVar2.zzb);
        return new zzgtz(i, copyOf, copyOf2, true);
    }

    static zzgtz zze() {
        return new zzgtz(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgtz)) {
            return false;
        }
        zzgtz zzgtzVar = (zzgtz) obj;
        int i = this.zzb;
        if (i == zzgtzVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgtzVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgtzVar.zzd;
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
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzE;
        int zzF;
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
                    i = zzgql.zzE(i6 << 3) + 8;
                } else if (i7 == 2) {
                    zzgpw zzgpwVar = (zzgpw) this.zzd[i4];
                    int zzE2 = zzgql.zzE(i6 << 3);
                    int zzd = zzgpwVar.zzd();
                    i3 += zzE2 + zzgql.zzE(zzd) + zzd;
                } else if (i7 == 3) {
                    int zzD = zzgql.zzD(i6);
                    zzE = zzD + zzD;
                    zzF = ((zzgtz) this.zzd[i4]).zza();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzgrq.zza());
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzgql.zzE(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzE = zzgql.zzE(i6 << 3);
                zzF = zzgql.zzF(longValue);
            }
            i = zzE + zzF;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            zzgpw zzgpwVar = (zzgpw) this.zzd[i3];
            int zzE = zzgql.zzE(8);
            int zzd = zzgpwVar.zzd();
            i2 += zzE + zzE + zzgql.zzE(16) + zzgql.zzE(i4 >>> 3) + zzgql.zzE(24) + zzgql.zzE(zzd) + zzd;
        }
        this.zze = i2;
        return i2;
    }

    public final void zzf() {
        this.zzf = false;
    }

    final void zzg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgsq.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzh(int i, Object obj) {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.zzb;
        int[] iArr = this.zzc;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzc = Arrays.copyOf(iArr, i3);
            this.zzd = Arrays.copyOf(this.zzd, i3);
        }
        int[] iArr2 = this.zzc;
        int i4 = this.zzb;
        iArr2[i4] = i;
        this.zzd[i4] = obj;
        this.zzb = i4 + 1;
    }

    public final void zzi(zzgqm zzgqmVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzgqmVar.zzt(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzgqmVar.zzm(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzgqmVar.zzd(i3, (zzgpw) obj);
                } else if (i4 == 3) {
                    zzgqmVar.zzE(i3);
                    ((zzgtz) obj).zzi(zzgqmVar);
                    zzgqmVar.zzh(i3);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(zzgrq.zza());
                    }
                    zzgqmVar.zzk(i3, ((Integer) obj).intValue());
                }
            }
        }
    }
}
