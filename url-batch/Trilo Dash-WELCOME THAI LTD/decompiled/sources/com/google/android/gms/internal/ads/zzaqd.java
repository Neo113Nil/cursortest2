package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaqd extends zzaqm {
    private final boolean zzi;

    public zzaqd(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i, int i2) {
        super(zzapcVar, "yuf1nsAsFy3olrhDGup7vlloJ0uqB/pCPd1wXjadNbk08Ahzm1ms2kGIpbi3j3n0", "Ja6aP+2sRyo5nxEaCirzMomJuTTHKAyM16vEB9WmdYo=", zzaliVar, i, 61);
        this.zzi = zzapcVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(this.zzi))).longValue();
        synchronized (this.zze) {
            this.zze.zzB(longValue);
        }
    }
}
