package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhdg {
    private final zzgvi zza = new zzgvi();
    private final String zzb;
    private volatile Logger zzc;

    zzhdg(Class cls) {
        this.zzb = cls.getName();
    }

    final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            try {
                Logger logger2 = this.zzc;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.zzb);
                this.zzc = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
