package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzao;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes3.dex */
public final class AccountTransfer {
    public static final Api zza;
    public static final zzao zzb;
    public static final zzao zzc;
    private static final Api.ClientKey zzd;
    private static final Api.AbstractClientBuilder zze;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzd = clientKey;
        zza zzaVar = new zza();
        zze = zzaVar;
        zza = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzaVar, clientKey);
        zzb = new zzao();
        zzc = new zzao();
    }

    private AccountTransfer() {
    }
}
