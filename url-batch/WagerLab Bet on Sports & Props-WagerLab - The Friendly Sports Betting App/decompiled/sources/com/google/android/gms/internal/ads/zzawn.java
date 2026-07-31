package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzawn extends zzaxl {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawn(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i, int i2) {
        super(zzavxVar, "N+SNt584k90MWn4aBLIhSutg85cYgcNyu+q+5WGRUo/oWkmPivq/1xlEIBG+GcFK", "VOVDFi9LxFQe2QWzKEnmStNUha/UwjqmQV12jeIMYds=", zzarwVar, i, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (Long) this.zze.invoke(null, new Object[0]);
                }
            }
        }
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            zzarwVar.zzB(zzh.longValue());
        }
    }
}
