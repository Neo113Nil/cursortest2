package com.google.android.gms.internal.ads;

import androidx.media3.common.C;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.OpusUtil;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzacy {
    @Pure
    public static void zza(boolean z, String str) throws zzas {
        if (!z) {
            throw zzas.zzb(str, null);
        }
    }

    public static int zzb(zzacv zzacvVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzg = zzacvVar.zzg(bArr, i + i3, i2 - i3);
            if (zzg == -1) {
                break;
            }
            i3 += zzg;
        }
        return i3;
    }

    public static boolean zzc(zzacv zzacvVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            zzacvVar.zzc(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzd(zzacv zzacvVar, int i) throws IOException {
        try {
            zzacvVar.zzf(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacv zzacvVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzacvVar.zzh(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static int zzf(int i) {
        if (i == 20) {
            return OpusUtil.MAX_BYTES_PER_SECOND;
        }
        if (i == 30) {
            return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
        }
        switch (i) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
                return 768000;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
                    case 15:
                        return 8000;
                    case 16:
                        return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
                    case 17:
                        return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
                    case 18:
                        return 768000;
                    default:
                        return C.RATE_UNSET_INT;
                }
        }
    }
}
