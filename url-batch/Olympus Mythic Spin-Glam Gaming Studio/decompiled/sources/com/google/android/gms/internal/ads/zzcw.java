package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzcw extends zzcq {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e A[ADDED_TO_REGION, LOOP:9: B:60:0x017e->B:61:0x0180, LOOP_START, PHI: r4
      0x017e: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:17:0x004e, B:61:0x0180] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzcp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 21) {
                    if (i3 != 22) {
                        if (i3 != 268435456) {
                            if (i3 != 1342177280) {
                                if (i3 != 1610612736) {
                                    if (i3 != 1879048192) {
                                        if (i3 != 1895825408) {
                                            if (i3 != 1912602624) {
                                                throw new IllegalStateException();
                                            }
                                        }
                                    }
                                    i2 /= 4;
                                }
                            }
                        }
                        ByteBuffer zzk = zzk(i2);
                        i = this.zzb.zzd;
                        if (i == 3) {
                            while (position < limit) {
                                zzk.put((byte) 0);
                                zzk.put((byte) ((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                float f = byteBuffer.getFloat(position);
                                String str = zzfm.zza;
                                short max = (short) (Math.max(-1.0f, Math.min(f, 1.0f)) * 32767.0f);
                                zzk.put((byte) (max & 255));
                                zzk.put((byte) ((max >> 8) & 255));
                                position += 4;
                            }
                        } else if (i == 21) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position + 2));
                                position += 3;
                            }
                        } else if (i == 22) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 2));
                                zzk.put(byteBuffer.get(position + 3));
                                position += 4;
                            }
                        } else if (i == 268435456) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 2;
                            }
                        } else if (i == 1342177280) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 3;
                            }
                        } else if (i == 1610612736) {
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 4;
                            }
                        } else if (i == 1879048192) {
                            while (position < limit) {
                                short zzm = (short) (zzfm.zzm(byteBuffer.getDouble(position), -1.0d, 1.0d) * 32767.0d);
                                zzk.put((byte) (zzm & 255));
                                zzk.put((byte) ((zzm >> 8) & 255));
                                position += 8;
                            }
                        } else if (i == 1895825408) {
                            while (position < limit) {
                                float intBitsToFloat = Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(position)));
                                String str2 = zzfm.zza;
                                short max2 = (short) (Math.max(-1.0f, Math.min(intBitsToFloat, 1.0f)) * 32767.0f);
                                zzk.put((byte) (max2 & 255));
                                zzk.put((byte) ((max2 >> 8) & 255));
                                position += 4;
                            }
                        } else {
                            if (i != 1912602624) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                short zzm2 = (short) (zzfm.zzm(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(position))), -1.0d, 1.0d) * 32767.0d);
                                zzk.put((byte) (zzm2 & 255));
                                zzk.put((byte) ((zzm2 >> 8) & 255));
                                position += 8;
                            }
                        }
                        byteBuffer.position(byteBuffer.limit());
                        zzk.flip();
                    }
                }
                i2 /= 3;
            }
            i2 /= 2;
            ByteBuffer zzk2 = zzk(i2);
            i = this.zzb.zzd;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            zzk2.flip();
        }
        i2 += i2;
        ByteBuffer zzk22 = zzk(i2);
        i = this.zzb.zzd;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        zzk22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcl zzm(zzcl zzclVar) throws zzco {
        int i = zzclVar.zzd;
        if (zzfm.zzE(i)) {
            return i != 2 ? new zzcl(zzclVar.zzb, zzclVar.zzc, 2) : zzcl.zza;
        }
        throw new zzco("Unhandled input format:", zzclVar);
    }
}
