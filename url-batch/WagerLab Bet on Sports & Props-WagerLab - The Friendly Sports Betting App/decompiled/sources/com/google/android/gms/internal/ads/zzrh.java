package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.msgpack.core.MessagePack;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzrh {
    private static final byte[] zza = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.FS, MessagePack.Code.FIXEXT2, MessagePack.Code.BIN16, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, Byte.MIN_VALUE, -69, 0, 0, 0, 0, 0};
    private static final byte[] zzb = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, Ascii.VT, -103, 87, 83, 1, Ascii.DLE, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    private ByteBuffer zzc = zzcf.zza;
    private int zze = 0;
    private int zzd = 2;

    private static final void zzc(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(zzgni.zza(i2));
    }

    public final void zza(zzhg zzhgVar, List list) {
        int i;
        ByteBuffer byteBuffer;
        int i2;
        ByteBuffer byteBuffer2 = zzhgVar.zzc;
        byteBuffer2.getClass();
        if (byteBuffer2.limit() - zzhgVar.zzc.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.zzd == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        ByteBuffer byteBuffer3 = zzhgVar.zzc;
        int position = byteBuffer3.position();
        int limit = byteBuffer3.limit();
        int i3 = limit - position;
        int i4 = (i3 + 255) / 255;
        int i5 = i4 + 27 + i3;
        if (this.zzd == 2) {
            i = bArr != null ? bArr.length + 28 : 47;
            i5 += i + 44;
        } else {
            i = 0;
        }
        if (this.zzc.capacity() < i5) {
            this.zzc = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zzc.clear();
        }
        ByteBuffer byteBuffer4 = this.zzc;
        if (this.zzd == 2) {
            if (bArr != null) {
                byteBuffer = byteBuffer4;
                i2 = 22;
                zzc(byteBuffer, 0L, 0, 1, true);
                int length = bArr.length;
                byteBuffer.put(zzgni.zza(length));
                byteBuffer.put(bArr);
                int i6 = length + 28;
                byteBuffer.putInt(22, zzeo.zzH(byteBuffer.array(), byteBuffer.arrayOffset(), i6, 0));
                byteBuffer.position(i6);
            } else {
                byteBuffer = byteBuffer4;
                i2 = 22;
                byteBuffer.put(zza);
            }
            byteBuffer.put(zzb);
        } else {
            byteBuffer = byteBuffer4;
            i2 = 22;
        }
        int zzc = this.zze + zzadr.zzc(byteBuffer3);
        this.zze = zzc;
        int i7 = i2;
        ByteBuffer byteBuffer5 = byteBuffer;
        zzc(byteBuffer5, zzc, this.zzd, i4, false);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i3 >= 255) {
                byteBuffer5.put((byte) -1);
                i3 -= 255;
            } else {
                byteBuffer5.put((byte) i3);
                i3 = 0;
            }
        }
        while (position < limit) {
            byteBuffer5.put(byteBuffer3.get(position));
            position++;
        }
        byteBuffer3.position(byteBuffer3.limit());
        byteBuffer5.flip();
        if (this.zzd == 2) {
            byteBuffer5.putInt(i + 66, zzeo.zzH(byteBuffer5.array(), byteBuffer5.arrayOffset() + i + 44, byteBuffer5.limit() - byteBuffer5.position(), 0));
        } else {
            byteBuffer5.putInt(i7, zzeo.zzH(byteBuffer5.array(), byteBuffer5.arrayOffset(), byteBuffer5.limit() - byteBuffer5.position(), 0));
        }
        this.zzd++;
        this.zzc = byteBuffer5;
        zzhgVar.zza();
        zzhgVar.zzj(this.zzc.remaining());
        zzhgVar.zzc.put(this.zzc);
        zzhgVar.zzl();
    }

    public final void zzb() {
        this.zzc = zzcf.zza;
        this.zze = 0;
        this.zzd = 2;
    }
}
