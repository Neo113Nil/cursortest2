package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes11.dex */
public final /* synthetic */ class zzp implements RemoteCall {
    public final /* synthetic */ Fido2PrivilegedApiClient zza;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) obj).getService()).zzf(new zzu(this.zza, (TaskCompletionSource) obj2));
    }
}
