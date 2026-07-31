package com.google.android.gms.fido.u2f;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.fido.zzx;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@Deprecated
/* loaded from: classes3.dex */
public class U2fApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    private static final Api.ClientKey zza;
    private static final Api zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzb = new Api("Fido.U2F_API", new zzx(), clientKey);
    }
}
