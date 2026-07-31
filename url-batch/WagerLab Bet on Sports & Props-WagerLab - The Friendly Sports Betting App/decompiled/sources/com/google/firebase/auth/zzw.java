package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes6.dex */
final class zzw implements Continuation<GetTokenResult, Task<Void>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ FirebaseAuth zzb;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<Void> then(Task<GetTokenResult> task) throws Exception {
        String str;
        if (!task.isSuccessful()) {
            return Tasks.forException((Exception) Preconditions.checkNotNull(task.getException()));
        }
        zzacq zzacqVar = this.zzb.zzd;
        String str2 = this.zza;
        String str3 = (String) Preconditions.checkNotNull(task.getResult().getToken());
        str = this.zzb.zzl;
        return zzacqVar.zza(str2, str3, "apple.com", str);
    }

    zzw(FirebaseAuth firebaseAuth, String str) {
        this.zza = str;
        Objects.requireNonNull(firebaseAuth);
        this.zzb = firebaseAuth;
    }
}
