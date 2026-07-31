package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzbcv extends zzbdt {
    public zzbcv(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2) {
        super(zzbcgVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", zzayaVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaya zzayaVar = this.zzd;
        zzayaVar.zzd(-1L);
        zzayaVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzayaVar) {
            try {
                zzayaVar.zzd(iArr[0]);
                zzayaVar.zze(iArr[1]);
                int i = iArr[2];
                if (i != Integer.MIN_VALUE) {
                    zzayaVar.zzO(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
