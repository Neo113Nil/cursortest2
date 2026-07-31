package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfzn extends zzfzq {
    private static final Long zza = -1L;
    private final zzfvd zzb;
    private final Context zzc;
    private final Map zzd;

    zzfzn(zzarw zzarwVar, zzfym zzfymVar, zzfvd zzfvdVar, Context context, Map map, zzgea zzgeaVar) {
        super("jcyw3Z6JR7dg8Gs5uNE+1Xn+cH5KU+eMNKwOz6aUc30Hoz0sLKOdX9URrjJNRTxO", "hzRjkCYY0Ke3Fdqb5y/eXki235LrqyGJIZ1rI6ZFa3k=", zzarwVar, zzfymVar, zzgeaVar.zza(121));
        this.zzb = zzfvdVar;
        this.zzc = context;
        this.zzd = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        zzfvd zzfvdVar = this.zzb;
        Object[] objArr = (Object[]) method.invoke("", Integer.valueOf(zzfvdVar.ordinal()), this.zzc, zzggz.zza(this.zzd.get("up"), true));
        objArr.getClass();
        Object[] objArr2 = objArr;
        synchronized (zzarwVar) {
            if (zzfvdVar == zzfvd.QUERY) {
                Object obj = objArr2[0];
                Long l = zza;
                zzarwVar.zzq(((Long) zzggz.zza(obj, l)).longValue());
                zzarwVar.zzr(((Long) zzggz.zza(objArr2[1], l)).longValue());
            }
            zzarwVar.zzg(((Long) objArr2[2]).longValue());
            zzarwVar.zzQ(((Long) objArr2[3]).longValue());
        }
    }
}
