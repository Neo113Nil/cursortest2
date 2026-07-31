package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzh {
    public static final zzh zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzg zzgVar = new zzg();
        zzgVar.zza(1);
        zzgVar.zzb(2);
        zzgVar.zzc(3);
        zza = zzgVar.zzg();
        zzg zzgVar2 = new zzg();
        zzgVar2.zza(1);
        zzgVar2.zzb(1);
        zzgVar2.zzc(2);
        zzgVar2.zzg();
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ zzh(int i, int i2, int i3, byte[] bArr, int i4, int i5, byte[] bArr2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = bArr;
        this.zzf = i4;
        this.zzg = i5;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean zza(zzh zzhVar) {
        if (zzhVar == null) {
            return true;
        }
        int i = zzhVar.zzb;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = zzhVar.zzc;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = zzhVar.zzd;
        if ((i3 != -1 && i3 != 3) || zzhVar.zze != null) {
            return false;
        }
        int i4 = zzhVar.zzg;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = zzhVar.zzf;
        return i5 == -1 || i5 == 8;
    }

    @Pure
    public static int zzb(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzc(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i == 2) {
            return "BT601";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
        sb.append("Undefined color space ");
        sb.append(i);
        return sb.toString();
    }

    private static String zzi(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i == 7) {
            return "HLG";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 25);
        sb.append("Undefined color transfer ");
        sb.append(i);
        return sb.toString();
    }

    private static String zzj(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i == 2) {
            return "Limited range";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
        sb.append("Undefined color range ");
        sb.append(i);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzh zzhVar = (zzh) obj;
            if (this.zzb == zzhVar.zzb && this.zzc == zzhVar.zzc && this.zzd == zzhVar.zzd && Arrays.equals(this.zze, zzhVar.zze) && this.zzf == zzhVar.zzf && this.zzg == zzhVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31) + Arrays.hashCode(this.zze)) * 31) + this.zzf) * 31) + this.zzg;
        this.zzh = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str;
        int i = this.zzf;
        int i2 = this.zzd;
        int i3 = this.zzc;
        String zzh = zzh(this.zzb);
        String zzj = zzj(i3);
        String zzi = zzi(i2);
        String str2 = "NA";
        if (i != -1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 8);
            sb.append(i);
            sb.append("bit Luma");
            str = sb.toString();
        } else {
            str = "NA";
        }
        int i4 = this.zzg;
        if (i4 != -1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 10);
            sb2.append(i4);
            sb2.append("bit Chroma");
            str2 = sb2.toString();
        }
        boolean z = this.zze != null;
        StringBuilder sb3 = new StringBuilder(zzh.length() + 12 + zzj.length() + 2 + zzi.length() + 2 + String.valueOf(z).length() + 2 + str.length() + 2 + str2.length() + 1);
        sb3.append("ColorInfo(");
        sb3.append(zzh);
        sb3.append(", ");
        sb3.append(zzj);
        sb3.append(", ");
        sb3.append(zzi);
        sb3.append(", ");
        sb3.append(z);
        sb3.append(", ");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        sb3.append(")");
        return sb3.toString();
    }

    public final zzg zzd() {
        return new zzg(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String str;
        String str2;
        if (zzf()) {
            Object[] objArr = {zzh(this.zzb), zzj(this.zzc), zzi(this.zzd)};
            String str3 = zzeo.zza;
            str = String.format(Locale.US, "%s/%s/%s", objArr);
        } else {
            str = "NA/NA/NA";
        }
        if (zze()) {
            int i = this.zzf;
            int i2 = this.zzg;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
            sb.append(i);
            sb.append("/");
            sb.append(i2);
            str2 = sb.toString();
        } else {
            str2 = "NA/NA";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + str2.length());
        sb2.append(str);
        sb2.append("/");
        sb2.append(str2);
        return sb2.toString();
    }
}
