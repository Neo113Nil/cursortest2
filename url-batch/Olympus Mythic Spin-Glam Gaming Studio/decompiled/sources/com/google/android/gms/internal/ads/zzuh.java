package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzuh extends zzcq {
    private static void zzq(int i, ByteBuffer byteBuffer) {
        float f = (float) (i * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzd(ByteBuffer byteBuffer) {
        ByteBuffer zzk;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.zzb.zzd;
        if (i2 == 2) {
            zzk = zzk(i + i);
            while (position < limit) {
                zzq(byteBuffer.getShort(position) << 16, zzk);
                position += 2;
            }
        } else if (i2 == 3) {
            zzk = zzk(i * 4);
            while (position < limit) {
                zzq(((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128) << 24, zzk);
                position++;
            }
        } else if (i2 == 21) {
            zzk = zzk((i / 3) * 4);
            while (position < limit) {
                zzq(zzhbj.zze(byteBuffer.get(position + 2), byteBuffer.get(position + 1), byteBuffer.get(position), (byte) 0), zzk);
                position += 3;
            }
        } else if (i2 == 22) {
            zzk = zzk(i);
            while (position < limit) {
                zzq(byteBuffer.getInt(position), zzk);
                position += 4;
            }
        } else if (i2 == 268435456) {
            zzk = zzk(i + i);
            while (position < limit) {
                zzq(Short.reverseBytes(byteBuffer.getShort(position)) << 16, zzk);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            zzk = zzk((i / 3) * 4);
            while (position < limit) {
                zzq(zzhbj.zze(byteBuffer.get(position), byteBuffer.get(position + 1), byteBuffer.get(position + 2), (byte) 0), zzk);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            zzk = zzk(i);
            while (position < limit) {
                zzq(Integer.reverseBytes(byteBuffer.getInt(position)), zzk);
                position += 4;
            }
        } else if (i2 == 1879048192) {
            zzk = zzk(i / 2);
            while (position < limit) {
                zzk.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i2 == 1895825408) {
            zzk = zzk(i);
            while (position < limit) {
                zzk.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position))));
                position += 4;
            }
        } else {
            if (i2 != 1912602624) {
                throw new IllegalStateException();
            }
            zzk = zzk(i / 2);
            while (position < limit) {
                zzk.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))));
                position += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        zzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        int i = zzclVar.zzd;
        if (zzfm.zzE(i)) {
            return i != 4 ? new zzcl(zzclVar.zzb, zzclVar.zzc, 4) : zzcl.zza;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
