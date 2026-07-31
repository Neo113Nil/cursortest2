package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfzv extends zzfzq {
    private final DisplayMetrics zza;
    private final View zzb;

    zzfzv(zzarw zzarwVar, zzfym zzfymVar, DisplayMetrics displayMetrics, View view, zzgea zzgeaVar) {
        super("uPnxRmNxKnxatA3tTMUWOedbsmvc/x71nNhoYLkUbyjWQ98RCfWvVlhsOCQ2OJT2", "VhSlnRRMF+g0APHj5U0WTKxVM1iKXkL1bjHWDp7ZT0E=", zzarwVar, zzfymVar, zzgeaVar.zza(124));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    protected final void zza(Method method, zzarw zzarwVar) throws IllegalAccessException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object invoke = method.invoke("", this.zza, view);
        invoke.getClass();
        Long[] lArr = (Long[]) invoke;
        zzasr zza = zzass.zza();
        zza.zzb(lArr[2].longValue());
        zza.zzc(lArr[1].longValue());
        zza.zzd(lArr[0].longValue());
        zza.zza(lArr[3].longValue());
        zza.zze(lArr[4].longValue());
        zzarwVar.zzM((zzass) zza.zzbu());
    }
}
