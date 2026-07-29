package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftr;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfvo extends zzftr.zzi implements Runnable {
    private final Runnable zza;

    public zzfvo(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    protected final String zza() {
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zze(th);
            zzfpi.zzb(th);
            throw new RuntimeException(th);
        }
    }
}
