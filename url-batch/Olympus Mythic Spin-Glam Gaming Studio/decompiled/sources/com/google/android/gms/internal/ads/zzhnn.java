package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhnn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhmt zzc = zzhnm.zza;
    private static final zzhnn zzd = zzd();
    private final Map zzb = new HashMap();

    public static zzhnn zza() {
        return zzd;
    }

    private static zzhnn zzd() {
        zzhnn zzhnnVar = new zzhnn();
        try {
            zzhnnVar.zzb(zzc, zzhnf.class);
            return zzhnnVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    private final synchronized zzhes zze(zzhfj zzhfjVar, Integer num) throws GeneralSecurityException {
        zzhmt zzhmtVar;
        zzhmtVar = (zzhmt) this.zzb.get(zzhfjVar.getClass());
        if (zzhmtVar == null) {
            String obj = zzhfjVar.toString();
            StringBuilder sb = new StringBuilder(obj.length() + 86);
            sb.append("Cannot create a new key for parameters ");
            sb.append(obj);
            sb.append(": no key creator for this class was registered.");
            throw new GeneralSecurityException(sb.toString());
        }
        return zzhmtVar.zza(zzhfjVar, num);
    }

    public final synchronized void zzb(zzhmt zzhmtVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.zzb;
            zzhmt zzhmtVar2 = (zzhmt) map.get(cls);
            if (zzhmtVar2 != null && !zzhmtVar2.equals(zzhmtVar)) {
                String obj = cls.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 60);
                sb.append("Different key creator for parameters class ");
                sb.append(obj);
                sb.append(" already inserted");
                throw new GeneralSecurityException(sb.toString());
            }
            map.put(cls, zzhmtVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final zzhes zzc(zzhfj zzhfjVar, Integer num) throws GeneralSecurityException {
        return zze(zzhfjVar, num);
    }
}
