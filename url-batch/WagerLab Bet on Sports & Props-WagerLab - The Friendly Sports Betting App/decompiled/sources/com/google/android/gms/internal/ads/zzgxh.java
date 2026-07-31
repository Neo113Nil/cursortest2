package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgxh {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzgxh(Map map, Map map2, byte[] bArr) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzgxg zza() {
        return new zzgxg(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.zzb.get(obj);
        if (r0 != null) {
            return r0;
        }
        String valueOf = String.valueOf(obj);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(valueOf)));
    }

    public final Object zzc(Enum r3) throws GeneralSecurityException {
        Object obj = this.zza.get(r3);
        if (obj != null) {
            return obj;
        }
        String valueOf = String.valueOf(r3);
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(valueOf)));
    }
}
