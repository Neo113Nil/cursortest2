package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzalp {
    public static double zza(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) | (r0[3] & UByte.MAX_VALUE)) / 1.073741824E9d;
    }

    public static double zzb(ByteBuffer byteBuffer) {
        byteBuffer.get(new byte[4]);
        return (((((r0[0] << 24) & ViewCompat.MEASURED_STATE_MASK) | ((r0[1] << 16) & 16711680)) | ((r0[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) | (r0[3] & UByte.MAX_VALUE)) / 65536.0d;
    }

    public static int zzc(byte b) {
        return b < 0 ? b + UByte.MIN_VALUE : b;
    }

    public static int zzd(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zze(ByteBuffer byteBuffer) {
        long j = byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static long zzf(ByteBuffer byteBuffer) {
        long zze = zze(byteBuffer) << 32;
        if (zze >= 0) {
            return zze + zze(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
