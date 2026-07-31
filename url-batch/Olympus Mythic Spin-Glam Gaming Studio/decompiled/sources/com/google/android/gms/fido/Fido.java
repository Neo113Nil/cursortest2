package com.google.android.gms.fido;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes6.dex */
public class Fido {
    public static final Api.ClientKey zza;
    public static final Api zzb;
    public static final zzaa zzc;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.U2F_ZERO_PARTY_API", new zzab(), clientKey);
        zzc = new zzaa();
    }

    private Fido() {
    }
}
