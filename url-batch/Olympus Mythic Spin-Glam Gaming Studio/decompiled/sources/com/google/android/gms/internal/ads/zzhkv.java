package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
abstract class zzhkv {
    int[] zza;
    private final int zzb;

    public zzhkv(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhkt.zzd(bArr);
        this.zzb = i;
    }

    abstract int[] zza(int[] iArr, int i);

    abstract int zzb();

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int zzb = zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 36);
            sb.append("The nonce length (in bytes) must be ");
            sb.append(zzb);
            throw new GeneralSecurityException(sb.toString());
        }
        int remaining = byteBuffer.remaining();
        int i = remaining / 64;
        for (int i2 = 0; i2 < i + 1; i2++) {
            ByteBuffer zzd = zzd(bArr, this.zzb + i2);
            if (i2 == i) {
                zziat.zzc(allocate, byteBuffer, zzd, remaining % 64);
            } else {
                zziat.zzc(allocate, byteBuffer, zzd, 64);
            }
        }
        return allocate.array();
    }

    final ByteBuffer zzd(byte[] bArr, int i) {
        int[] zza = zza(zzhkt.zzd(bArr), i);
        int[] iArr = (int[]) zza.clone();
        zzhkt.zzb(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            zza[i2] = zza[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zza, 0, 16);
        return order;
    }
}
