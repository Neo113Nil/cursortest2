package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbdp extends zzbdt {
    public zzbdp(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2) {
        super(zzbcgVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", zzayaVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaya zzayaVar = this.zzd;
        zzayaVar.zzae(3);
        boolean booleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzayaVar) {
            try {
                if (booleanValue) {
                    zzayaVar.zzae(2);
                } else {
                    zzayaVar.zzae(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
