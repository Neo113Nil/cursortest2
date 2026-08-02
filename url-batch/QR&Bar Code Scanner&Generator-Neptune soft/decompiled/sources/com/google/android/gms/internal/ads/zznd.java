package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zznd {
    public static final zznd zza = new zznd(new int[]{2}, 8);
    private static final zznd zzb = new zznd(new int[]{2, 5, 6}, 8);
    private static final zzfvq zzc;
    private final int[] zzd;
    private final int zze;

    static {
        zzfvp zzfvpVar = new zzfvp();
        zzfvpVar.zza(5, 6);
        zzfvpVar.zza(17, 6);
        zzfvpVar.zza(7, 6);
        zzfvpVar.zza(18, 6);
        zzfvpVar.zza(6, 8);
        zzfvpVar.zza(8, 8);
        zzfvpVar.zza(14, 8);
        zzc = zzfvpVar.zzc();
    }

    public zznd(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.zzd = copyOf;
        Arrays.sort(copyOf);
        this.zze = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zznd)) {
            return false;
        }
        zznd zzndVar = (zznd) obj;
        if (!Arrays.equals(this.zzd, zzndVar.zzd)) {
            return false;
        }
        int i = zzndVar.zze;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzd) * 31) + 8;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + Arrays.toString(this.zzd) + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        if (r7 != 5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair zza(zzaf zzafVar) {
        int zzj;
        String str = zzafVar.zzm;
        Objects.requireNonNull(str);
        int zza2 = zzbt.zza(str, zzafVar.zzj);
        zzfvq zzfvqVar = zzc;
        if (!zzfvqVar.containsKey(Integer.valueOf(zza2))) {
            return null;
        }
        int i = 6;
        if (zza2 == 18) {
            if (zzc(18)) {
                zza2 = 18;
            } else {
                zza2 = 6;
                if (zzc(zza2)) {
                    return null;
                }
                int i2 = zzafVar.zzz;
                if (i2 == -1 || zza2 == 18) {
                    int i3 = zzafVar.zzA;
                    if (i3 == -1) {
                        i3 = 48000;
                    }
                    if (zzen.zza >= 29) {
                        i2 = zznc.zza(zza2, i3);
                    } else {
                        Integer num = (Integer) zzfvqVar.getOrDefault(Integer.valueOf(zza2), 0);
                        Objects.requireNonNull(num);
                        i2 = num.intValue();
                    }
                } else if (i2 > 8) {
                    return null;
                }
                if (zzen.zza <= 28) {
                    if (i2 == 7) {
                        i = 8;
                    } else if (i2 != 3) {
                        if (i2 != 4) {
                        }
                    }
                    if (zzen.zza <= 26 && "fugu".equals(zzen.zzb) && i == 1) {
                        i = 2;
                    }
                    zzj = zzen.zzj(i);
                    if (zzj != 0) {
                        return null;
                    }
                    return Pair.create(Integer.valueOf(zza2), Integer.valueOf(zzj));
                }
                i = i2;
                if (zzen.zza <= 26) {
                    i = 2;
                }
                zzj = zzen.zzj(i);
                if (zzj != 0) {
                }
            }
        }
        if (zza2 == 8 && !zzc(8)) {
            zza2 = 7;
        }
        if (zzc(zza2)) {
        }
    }

    public final boolean zzc(int i) {
        return Arrays.binarySearch(this.zzd, i) >= 0;
    }
}
