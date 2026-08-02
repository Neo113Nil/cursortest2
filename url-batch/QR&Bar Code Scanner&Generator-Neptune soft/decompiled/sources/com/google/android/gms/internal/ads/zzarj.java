package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzarj extends zzarq {
    public zzarj(zzaqe zzaqeVar, String str, String str2, zzamk zzamkVar, int i, int i2) {
        super(zzaqeVar, "sdX902x/AS9226TxUXaqji9wP1uHqRQA8nkg2YMN1TcruTTaw008l9z5V3jZGjLO", "z3i9M2k4RJ/f7GArNBcGbUcpUFpuRmLev6S20UO7Vqs=", zzamkVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzarq
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzapz zzapzVar = new zzapz((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzp(zzapzVar.zza.longValue());
            this.zze.zzq(zzapzVar.zzb.longValue());
        }
    }
}
