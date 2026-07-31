package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhns {
    private static final zzhns zzb = new zzhns();
    private final Map zza = new HashMap();

    zzhns() {
    }

    public static zzhns zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzhfj zzhfjVar) throws GeneralSecurityException {
        try {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, zzhfjVar);
                return;
            }
            if (((zzhfj) map.get(str)).equals(zzhfjVar)) {
                return;
            }
            String valueOf = String.valueOf(map.get(str));
            String valueOf2 = String.valueOf(zzhfjVar);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 45 + valueOf.length() + 17 + valueOf2.length());
            sb.append("Parameters object with name ");
            sb.append(str);
            sb.append(" already exists (");
            sb.append(valueOf);
            sb.append("), cannot insert ");
            sb.append(valueOf2);
            throw new GeneralSecurityException(sb.toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzhfj zzc(String str) throws GeneralSecurityException {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzhfj) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzhfj) entry.getValue());
        }
    }
}
