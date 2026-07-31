package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzawp extends zzaxl {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzawp(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2) {
        super(zzavxVar, "gyMGe4SoPVIhBgFM+VlZQFWek2IoqCotue6ayBNgVb95WbB68suDu+Zv4jWiM6iG", "etp1batKULd2kwg+5GPfxliTu8RjfdN0zKvZOjQe8mU=", zzarwVar, i, 82);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (String) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzV(zzh);
        }
    }
}
