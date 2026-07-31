package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgyk {
    private static final zzgyk zzb = new zzgyk();
    private final Map zza = new HashMap();

    zzgyk() {
    }

    public static zzgyk zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzgqs zzgqsVar) throws GeneralSecurityException {
        Map map = this.zza;
        if (!map.containsKey(str)) {
            map.put(str, zzgqsVar);
            return;
        }
        if (((zzgqs) map.get(str)).equals(zzgqsVar)) {
            return;
        }
        String valueOf = String.valueOf(map.get(str));
        String valueOf2 = String.valueOf(zzgqsVar);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 45 + String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
        sb.append("Parameters object with name ");
        sb.append(str);
        sb.append(" already exists (");
        sb.append(valueOf);
        sb.append("), cannot insert ");
        sb.append(valueOf2);
        throw new GeneralSecurityException(sb.toString());
    }

    public final synchronized zzgqs zzc(String str) throws GeneralSecurityException {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgqs) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzgqs) entry.getValue());
        }
    }
}
