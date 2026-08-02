package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzako {
    public static final boolean zza = zzakp.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    zzako() {
    }

    protected final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzakp.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzakn(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            j = ((zzakn) this.zzb.get(r1.size() - 1)).zzc - ((zzakn) this.zzb.get(0)).zzc;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((zzakn) this.zzb.get(0)).zzc;
        zzakp.zza("(%-4d ms) %s", Long.valueOf(j), str);
        for (zzakn zzaknVar : this.zzb) {
            long j3 = zzaknVar.zzc;
            zzakp.zza("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzaknVar.zzb), zzaknVar.zza);
            j2 = j3;
        }
    }
}
