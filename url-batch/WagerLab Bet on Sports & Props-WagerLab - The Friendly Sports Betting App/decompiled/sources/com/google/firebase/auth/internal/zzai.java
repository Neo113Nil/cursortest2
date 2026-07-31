package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.MultiFactorSession;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzai implements Continuation<GetTokenResult, Task<MultiFactorSession>> {
    private final /* synthetic */ zzaj zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<MultiFactorSession> then(Task<GetTokenResult> task) throws Exception {
        zzaf zzafVar;
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        String token = task.getResult().getToken();
        zzafVar = this.zza.zza;
        return Tasks.forResult(zzam.zza(token, zzafVar));
    }

    zzai(zzaj zzajVar) {
        Objects.requireNonNull(zzajVar);
        this.zza = zzajVar;
    }
}
