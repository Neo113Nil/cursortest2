package com.google.firebase.auth.internal;

import com.google.firebase.auth.SignInMethodQueryResult;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
public final class zzar implements SignInMethodQueryResult {
    private final List<String> zza;

    @Override // com.google.firebase.auth.SignInMethodQueryResult
    public final List<String> getSignInMethods() {
        return this.zza;
    }

    public zzar(List<String> list) {
        this.zza = list;
    }
}
