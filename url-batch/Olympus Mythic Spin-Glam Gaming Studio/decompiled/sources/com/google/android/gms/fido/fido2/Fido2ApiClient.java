package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class Fido2ApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.ClientKey zza;
    private static final Api zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.FIDO2_API", new com.google.android.gms.internal.fido.zzo(), clientKey);
    }
}
