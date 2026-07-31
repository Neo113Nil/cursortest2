package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
final class zzhjn {
    zzhjn() {
    }

    public static final boolean zza(Object obj) {
        return !((zzhjm) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzhjm zzhjmVar = (zzhjm) obj;
        zzhjm zzhjmVar2 = (zzhjm) obj2;
        if (!zzhjmVar2.isEmpty()) {
            if (!zzhjmVar.zze()) {
                zzhjmVar = zzhjmVar.zzc();
            }
            zzhjmVar.zzb(zzhjmVar2);
        }
        return zzhjmVar;
    }
}
