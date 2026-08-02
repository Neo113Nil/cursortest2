package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzckm {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzalt zzaltVar;
        zzals zzalsVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzalo(new zzckl(duplicate), zzcko.zzb).zze().iterator();
            while (true) {
                zzaltVar = null;
                if (!it.hasNext()) {
                    zzalsVar = null;
                    break;
                }
                zzalq zzalqVar = (zzalq) it.next();
                if (zzalqVar instanceof zzals) {
                    zzalsVar = (zzals) zzalqVar;
                    break;
                }
            }
            Iterator it2 = zzalsVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzalq zzalqVar2 = (zzalq) it2.next();
                if (zzalqVar2 instanceof zzalt) {
                    zzaltVar = (zzalt) zzalqVar2;
                    break;
                }
            }
            long zzd = (zzaltVar.zzd() * 1000) / zzaltVar.zze();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
