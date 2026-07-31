package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzaud {
    public static final boolean zza = zzaue.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzaud() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzaue.zzc("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzauc(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        this.zzc = true;
        List<zzauc> list = this.zzb;
        long j = list.size() == 0 ? 0L : ((zzauc) list.get(list.size() - 1)).zzc - ((zzauc) list.get(0)).zzc;
        if (j > 0) {
            long j2 = ((zzauc) list.get(0)).zzc;
            zzaue.zzb("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzauc zzaucVar : list) {
                long j3 = zzaucVar.zzc;
                zzaue.zzb("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzaucVar.zzb), zzaucVar.zza);
                j2 = j3;
            }
        }
    }
}
