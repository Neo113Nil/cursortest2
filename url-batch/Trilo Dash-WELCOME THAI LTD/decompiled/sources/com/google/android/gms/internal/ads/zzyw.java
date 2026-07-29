package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzyw {
    public static int zza(zzyt zzytVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzytVar.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzbp {
        if (!z) {
            throw zzbp.zza(str, null);
        }
    }

    public static boolean zzc(zzyt zzytVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzytVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzyt zzytVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzym) zzytVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzyt zzytVar, int i) throws IOException {
        try {
            ((zzym) zzytVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
