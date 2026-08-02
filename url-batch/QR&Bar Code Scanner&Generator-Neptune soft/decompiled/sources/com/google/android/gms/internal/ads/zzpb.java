package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzpb extends zzod {
    zzpb() {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[ADDED_TO_REGION, LOOP:4: B:33:0x00ae->B:34:0x00b0, LOOP_START, PHI: r0
      0x00ae: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0036, B:34:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 == 536870912) {
                        i2 /= 3;
                    } else if (i3 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer zzj = zzj(i2);
                i = this.zzb.zzd;
                if (i == 3) {
                    while (position < limit) {
                        zzj.put((byte) 0);
                        zzj.put((byte) ((byteBuffer.get(position) & UByte.MAX_VALUE) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        short zza = (short) (zzen.zza(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        zzj.put((byte) (zza & 255));
                        zzj.put((byte) ((zza >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 1));
                        zzj.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 1));
                        zzj.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 2));
                        zzj.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                zzj.flip();
            }
            i2 /= 2;
            ByteBuffer zzj2 = zzj(i2);
            i = this.zzb.zzd;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            zzj2.flip();
        }
        i2 += i2;
        ByteBuffer zzj22 = zzj(i2);
        i = this.zzb.zzd;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        zzj22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final zzne zzi(zzne zzneVar) throws zznf {
        int i = zzneVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return zzne.zza;
            }
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                throw new zznf(zzneVar);
            }
        }
        return new zzne(zzneVar.zzb, zzneVar.zzc, 2);
    }
}
