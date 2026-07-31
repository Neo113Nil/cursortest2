package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcbz {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzaqv zzaqvVar;
        zzaqu zzaquVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzaqq(new zzcby(duplicate), zzccd.zzb).zzc().iterator();
            while (true) {
                zzaqvVar = null;
                if (!it.hasNext()) {
                    zzaquVar = null;
                    break;
                }
                zzaqs zzaqsVar = (zzaqs) it.next();
                if (zzaqsVar instanceof zzaqu) {
                    zzaquVar = (zzaqu) zzaqsVar;
                    break;
                }
            }
            Iterator it2 = zzaquVar.zzc().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzaqs zzaqsVar2 = (zzaqs) it2.next();
                if (zzaqsVar2 instanceof zzaqv) {
                    zzaqvVar = (zzaqv) zzaqsVar2;
                    break;
                }
            }
            long zzd = (zzaqvVar.zzd() * 1000) / zzaqvVar.zzc();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
