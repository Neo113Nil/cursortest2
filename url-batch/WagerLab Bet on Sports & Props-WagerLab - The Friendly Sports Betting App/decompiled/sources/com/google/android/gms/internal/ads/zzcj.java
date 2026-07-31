package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcj extends zzcg {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[ADDED_TO_REGION, LOOP:6: B:42:0x00ea->B:43:0x00ec, LOOP_START, PHI: r0
      0x00ea: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:13:0x003e, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzcf
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
                                    throw new IllegalStateException();
                                }
                            }
                        }
                        ByteBuffer zzk = zzk(i2);
                        i = this.zzb.zzd;
                        if (i == 3) {
                            while (position < limit) {
                                zzk.put((byte) 0);
                                zzk.put((byte) ((byteBuffer.get(position) & 255) - 128));
                                position++;
                            }
                        } else if (i == 4) {
                            while (position < limit) {
                                float f = byteBuffer.getFloat(position);
                                String str = zzeo.zza;
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
                        } else {
                            if (i != 1610612736) {
                                throw new IllegalStateException();
                            }
                            while (position < limit) {
                                zzk.put(byteBuffer.get(position + 1));
                                zzk.put(byteBuffer.get(position));
                                position += 4;
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

    @Override // com.google.android.gms.internal.ads.zzcg
    public final zzcc zzm(zzcc zzccVar) throws zzce {
        int i = zzccVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return zzcc.zza;
            }
            if (i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
                throw new zzce("Unhandled input format:", zzccVar);
            }
        }
        return new zzcc(zzccVar.zzb, zzccVar.zzc, 2);
    }
}
