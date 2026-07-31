package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbdh extends zzbdt {
    public zzbdh(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2) {
        super(zzbcgVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", zzayaVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdU);
        bool.booleanValue();
        zzbbm zzbbmVar = new zzbbm((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            zzayaVar.zzc(zzbbmVar.zza);
            zzayaVar.zzP(zzbbmVar.zzb);
        }
    }
}
