package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes4.dex */
public class AccountTransferClient extends GoogleApi<zzr> {
    private static final Api.ClientKey zzb;
    private static final Api.AbstractClientBuilder zzc;
    private static final Api zzd;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzb = clientKey;
        zzb zzbVar = new zzb();
        zzc = zzbVar;
        zzd = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzbVar, clientKey);
    }
}
