package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzawg extends zzaxd {
    private final long zzh;

    public zzawg(zzavp zzavpVar, String str, String str2, zzaro zzaroVar, long j, int i, int i2) {
        super(zzavpVar, "Rx5KxmHu63h8QT7T4cYR2mu7F4LQnYkocG/Azb9HP8ZHyjUHnRxxCuB99BIp3kbl", "3fysZeGzwX+hqd2f4+qtlSho+oF+DeFl9kzKrTFOSWo=", zzaroVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaxd
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        synchronized (this.zzd) {
            this.zzd.zzt(longValue);
            long j = this.zzh;
            if (j != 0) {
                this.zzd.zzT(longValue - j);
                this.zzd.zzU(this.zzh);
            }
        }
    }
}
