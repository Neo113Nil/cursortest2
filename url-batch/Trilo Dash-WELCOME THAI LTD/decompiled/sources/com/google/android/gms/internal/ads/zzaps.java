package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaps extends zzaqm {
    private final long zzi;

    public zzaps(zzapc zzapcVar, String str, String str2, zzali zzaliVar, long j, int i, int i2) {
        super(zzapcVar, "9aN5Cm+1eB8M6WEeTCyHrcP34KU7gU8jlMBy6C9bmSWwJjNodfWmCfc45rNGVCVv", "hM2f+ZpOxGYOaoXhhqTEB4E2d1ZW9gQWshCuliQN60Y=", zzaliVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzs(longValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzQ(longValue - j);
                this.zze.zzR(this.zzi);
            }
        }
    }
}
