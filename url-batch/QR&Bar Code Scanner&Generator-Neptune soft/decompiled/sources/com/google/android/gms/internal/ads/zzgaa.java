package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgaa implements Runnable {

    @CheckForNull
    zzgac zza;

    zzgaa(zzgac zzgacVar) {
        this.zza = zzgacVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r1 = r0.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzfzp zzfzpVar;
        ScheduledFuture scheduledFuture;
        zzgac zzgacVar = this.zza;
        if (zzgacVar == null || zzfzpVar == null) {
            return;
        }
        this.zza = null;
        if (zzfzpVar.isDone()) {
            zzgacVar.zzt(zzfzpVar);
            return;
        }
        try {
            scheduledFuture = zzgacVar.zzb;
            zzgac.zzx(zzgacVar, (ScheduledFuture) null);
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgacVar.zze(new zzgab(str, null));
                    throw th;
                }
            }
            zzgacVar.zze(new zzgab(str + ": " + zzfzpVar, null));
        } finally {
            zzfzpVar.cancel(true);
        }
    }
}
