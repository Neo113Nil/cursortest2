package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzzm {
    public static int zza(zzzj zzzjVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzzjVar.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzbu {
        if (!z) {
            throw zzbu.zza(str, null);
        }
    }

    public static boolean zzc(zzzj zzzjVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzzjVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzzj zzzjVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzyy) zzzjVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzzj zzzjVar, int i) throws IOException {
        try {
            ((zzyy) zzzjVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
