package com.google.android.gms.internal.auth;

import android.accounts.Account;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AccountType;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes3.dex */
final class zzai implements WorkAccountApi.AddAccountResult {
    private static final Account zza = new Account("DUMMY_NAME", AccountType.GOOGLE);
    private final Status zzb;
    private final Account zzc;

    public zzai(Status status, @Nullable Account account) {
        this.zzb = status;
        this.zzc = account == null ? zza : account;
    }

    public final Account getAccount() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzb;
    }
}
