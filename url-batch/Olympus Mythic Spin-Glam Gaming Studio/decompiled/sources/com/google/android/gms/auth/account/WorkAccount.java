package com.google.android.gms.auth.account;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzal;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes5.dex */
public class WorkAccount {
    public static final Api API;
    public static final WorkAccountApi WorkAccountApi;
    private static final Api.ClientKey zza;
    private static final Api.AbstractClientBuilder zzb;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zza = clientKey;
        zzf zzfVar = new zzf();
        zzb = zzfVar;
        API = new Api("WorkAccount.API", zzfVar, clientKey);
        WorkAccountApi = new zzal();
    }

    private WorkAccount() {
    }
}
