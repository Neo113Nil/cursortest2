package com.google.android.gms.internal.ads;

import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfzd extends zzfzq {
    private final zzfui zza;

    zzfzd(zzarw zzarwVar, zzfym zzfymVar, zzfui zzfuiVar, zzgea zzgeaVar) {
        super("fYZiBk9qczTYZ4XbuTZP+yPWbtV6tDQSSdiXJtgkPteU+uECNiQz27SdXVm0ZoDV", "cWReJy6PGA8DXT8v/LLJX4GdS/i6yfZY3MOkA1+Ehd0=", zzarwVar, zzfymVar, zzgeaVar.zza(AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID));
        this.zza = zzfuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza.zzb());
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzarwVar) {
            zzarwVar.zzb((String) objArr2[0]);
            zzarwVar.zzaa((String) objArr2[1]);
        }
    }
}
