package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgjj extends zzgka {
    zzgjj(zzaya zzayaVar, zzgiw zzgiwVar, zzgrh zzgrhVar) {
        super("yVK2BtjhkWiqPWfXVe7pCdqpfz2Ps9CcWbBtlKTt4FN37/tD76f0HDGVwAjTsvKH", "Fo5nkU2nfGSO+g2iGIxI5+P04k6pQ8lbcFZjpNOd5oc=", zzayaVar, zzgiwVar, zzgrhVar.zza(114));
    }

    @Override // com.google.android.gms.internal.ads.zzgka
    protected final void zza(Method method, zzaya zzayaVar) throws IllegalAccessException, InvocationTargetException {
        synchronized (zzayaVar) {
            zzayaVar.zza("E");
            zzayaVar.zzB(0L);
            zzayaVar.zzV("D");
        }
        Object[] objArr = (Object[]) method.invoke("", null);
        objArr.getClass();
        synchronized (zzayaVar) {
            zzayaVar.zza((String) objArr[0]);
            zzayaVar.zzB(((Long) objArr[1]).longValue());
            zzayaVar.zzV((String) objArr[2]);
        }
    }
}
