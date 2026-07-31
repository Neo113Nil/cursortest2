package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
public class Fido2PrivilegedApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.ClientKey zza;
    private static final Api zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.FIDO2_PRIVILEGED_API", new com.google.android.gms.internal.fido.zzj(), clientKey);
    }
}
