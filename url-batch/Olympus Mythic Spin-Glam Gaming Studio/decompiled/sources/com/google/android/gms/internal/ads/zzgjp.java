package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzgjp extends zzgka {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    zzgjp(zzaya zzayaVar, zzgiw zzgiwVar, zzgrh zzgrhVar) {
        super("50+sX4d44jerXZ0t37Z07Ss5Y2LVKA0u1WWlTsyrM+njWBpcjf8xU2ZOd5yoshWp", "IaakTOOFGOw3T0IOJ/LBUMRFnsvXDEiR+LxXdy42JcU=", zzayaVar, zzgiwVar, zzgrhVar.zza(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l = (Long) method.invoke("", null);
                        if (l == null) {
                            throw null;
                        }
                        zza = l;
                    }
                } finally {
                }
            }
        }
        synchronized (zzayaVar) {
            try {
                if (zza != null) {
                    zzayaVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}
