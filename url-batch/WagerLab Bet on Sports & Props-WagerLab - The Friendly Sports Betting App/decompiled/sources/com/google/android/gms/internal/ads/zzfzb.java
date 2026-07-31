package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfzb extends zzfzq {
    private final Context zza;

    zzfzb(zzarw zzarwVar, zzfym zzfymVar, Context context, zzgea zzgeaVar) {
        super("x40hskW4QcWcQlOMoD+3YAVbf6i903hOugunenCO8Kx52wp1PAVSKnHG+BzVtl/X", "O7aqoG+z6jUBUdfieuknEoT3SAYjfs4xXRTTjVY6eYc=", zzarwVar, zzfymVar, zzgeaVar.zza(115));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzarwVar) {
            zzarwVar.zzO(((Integer) objArr2[0]).intValue());
            int i = 1;
            zzarwVar.zzd(((Integer) objArr2[1]).intValue());
            zzarwVar.zze(((Integer) objArr2[2]).intValue());
            zzarwVar.zzab(((Integer) objArr2[3]).intValue());
            Boolean bool = (Boolean) objArr2[4];
            if (bool == null) {
                zzarwVar.zzaf(3);
            } else {
                zzarwVar.zzaf(true != bool.booleanValue() ? 1 : 2);
            }
            Boolean bool2 = (Boolean) objArr2[5];
            if (bool2 == null) {
                zzarwVar.zzae(3);
            } else {
                if (true == bool2.booleanValue()) {
                    i = 2;
                }
                zzarwVar.zzae(i);
            }
        }
    }
}
