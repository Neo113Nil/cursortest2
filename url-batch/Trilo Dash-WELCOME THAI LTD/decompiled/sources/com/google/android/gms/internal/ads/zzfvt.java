package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzfvt implements Runnable {

    @CheckForNull
    zzfvv zza;

    zzfvt(zzfvv zzfvvVar) {
        this.zza = zzfvvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r1 = r0.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzfvj zzfvjVar;
        ScheduledFuture scheduledFuture;
        zzfvv zzfvvVar = this.zza;
        if (zzfvvVar == null || zzfvjVar == null) {
            return;
        }
        this.zza = null;
        if (zzfvjVar.isDone()) {
            zzfvvVar.zzt(zzfvjVar);
            return;
        }
        try {
            scheduledFuture = zzfvvVar.zzb;
            zzfvv.zzx(zzfvvVar, (ScheduledFuture) null);
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Timed out");
                        sb.append(" (timeout delayed by ");
                        sb.append(abs);
                        sb.append(" ms after scheduled time)");
                        str = sb.toString();
                    }
                } catch (Throwable th) {
                    zzfvvVar.zze(new zzfvu(str, null));
                    throw th;
                }
            }
            String obj = zzfvjVar.toString();
            StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            zzfvvVar.zze(new zzfvu(sb2.toString(), null));
        } finally {
            zzfvjVar.cancel(true);
        }
    }
}
