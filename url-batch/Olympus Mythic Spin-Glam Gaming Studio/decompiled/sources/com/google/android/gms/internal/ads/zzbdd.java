package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbdd extends zzbdt {
    private final zzbby zzh;

    public zzbdd(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2, zzbby zzbbyVar) {
        super(zzbcgVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", zzayaVar, i, 94);
        this.zzh = zzbbyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            zzayaVar.zzaj(zzayo.zza(intValue));
        }
    }
}
