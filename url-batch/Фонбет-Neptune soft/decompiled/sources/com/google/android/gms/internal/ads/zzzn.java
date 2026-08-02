package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzzn implements zzbx {
    private final zzcm zza;

    public zzzn(zzcm zzcmVar) {
        this.zza = zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final zzby zza(Context context, zzo zzoVar, zzr zzrVar, zzco zzcoVar, Executor executor, List list, long j) throws zzcl {
        try {
            Constructor<?> constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzcm.class);
            Object[] objArr = new Object[1];
            try {
                objArr[0] = this.zza;
                return ((zzbx) constructor.newInstance(objArr)).zza(context, zzoVar, zzrVar, zzcoVar, executor, list, 0L);
            } catch (Exception e) {
                e = e;
                if (e instanceof zzcl) {
                    throw ((zzcl) e);
                }
                throw new zzcl(e, -9223372036854775807L);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
