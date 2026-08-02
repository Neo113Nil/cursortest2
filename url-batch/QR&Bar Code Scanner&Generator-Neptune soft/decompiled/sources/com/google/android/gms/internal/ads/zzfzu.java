package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxx;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfzu extends zzfxx.zzi implements Runnable {
    private final Runnable zza;

    public zzfzu(Runnable runnable) {
        Objects.requireNonNull(runnable);
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    protected final String zza() {
        return "task=[" + this.zza + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zze(e);
            throw e;
        }
    }
}
