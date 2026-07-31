package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfyt extends zzfzq {
    private final Activity zza;
    private final View zzb;

    zzfyt(zzarw zzarwVar, zzfym zzfymVar, View view, Activity activity, zzgea zzgeaVar) {
        super("4B7vnMQm97gtfYCN8yumUNsSm+Z7/sMpw1b42iir2AzlNgWprThRkINsRaLbaNhi", "vUVK3XzwCmqCaraATX3abEiF/IUJoPC7bOtgDKtr95Q=", zzarwVar, zzfymVar, zzgeaVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzarwVar) {
            zzarwVar.zzS(((Long) objArr2[0]).longValue());
            zzarwVar.zzT(((Long) objArr2[1]).longValue());
            zzarwVar.zzU((String) objArr2[2]);
        }
    }
}
