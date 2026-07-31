package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgjr extends zzgka {
    private final Map zza;

    zzgjr(zzaya zzayaVar, zzgiw zzgiwVar, Map map, zzgrh zzgrhVar) {
        super("lgB22o3+xtO6b1PB1kHO8Agbi+6HbLXaRU20SARWIrq6m129Ofvaya/yhX25r56V", "Rqk2tq5zRAYapYluu1wAppyX64RE9M13E2H+pIaATIY=", zzayaVar, zzgiwVar, zzgrhVar.zza(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (zzayaVar) {
            try {
                zzayaVar.zzf(((Long) objArr[0]).longValue());
                long longValue = ((Long) objArr[1]).longValue();
                if (longValue >= 0) {
                    zzayaVar.zzW(longValue);
                }
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 >= 0) {
                    zzayaVar.zzX(longValue2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
