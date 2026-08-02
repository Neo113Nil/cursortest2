package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaco {
    public static int zza(zzacl zzaclVar, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzaclVar.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzbo {
        if (!z) {
            throw zzbo.zza(str, null);
        }
    }

    public static boolean zzc(zzacl zzaclVar, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzaclVar.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzacl zzaclVar, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzaby) zzaclVar).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacl zzaclVar, int i) throws IOException {
        try {
            ((zzaby) zzaclVar).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
