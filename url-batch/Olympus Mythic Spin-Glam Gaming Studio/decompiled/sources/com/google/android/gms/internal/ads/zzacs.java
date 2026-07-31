package com.google.android.gms.internal.ads;

import android.os.Build;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
final class zzacs {
    private static final byte[] zza = {-75, 0, 60, 0, 1, 4};

    static void zza(ByteBuffer byteBuffer) {
        if (Build.VERSION.SDK_INT >= 37) {
            return;
        }
        for (zzgv zzgvVar : zzgx.zza(byteBuffer.asReadOnlyBuffer())) {
            if (zzb(zzgvVar)) {
                byteBuffer.put(zzgvVar.zzb.position(), (byte) 31);
            }
        }
    }

    private static boolean zzb(zzgv zzgvVar) {
        if (zzgvVar.zza == 5) {
            try {
                zzgt zza2 = zzgt.zza(zzgvVar);
                if (zza2.zza != 4) {
                    return false;
                }
                ByteBuffer byteBuffer = zza2.zzb;
                if (byteBuffer.remaining() < 6) {
                    return true;
                }
                byte[] bArr = new byte[6];
                byteBuffer.asReadOnlyBuffer().get(bArr);
                if (!Arrays.equals(bArr, zza)) {
                    return true;
                }
            } catch (BufferUnderflowException unused) {
            }
        }
        return false;
    }
}
