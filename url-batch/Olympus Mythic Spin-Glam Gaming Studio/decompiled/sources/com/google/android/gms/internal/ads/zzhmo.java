package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhmo {
    private final Map zza;
    private final Map zzb;

    /* synthetic */ zzhmo(Map map, Map map2, byte[] bArr) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzhmn zza() {
        return new zzhmn(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.zzb.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r3) throws GeneralSecurityException {
        Object obj = this.zza.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r3)));
    }
}
