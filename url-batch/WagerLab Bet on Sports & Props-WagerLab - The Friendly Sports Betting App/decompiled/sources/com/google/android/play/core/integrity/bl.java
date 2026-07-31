package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final com.google.android.play.integrity.internal.s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new com.google.android.play.integrity.internal.s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void e(Bundle bundle) throws RemoteException {
        k kVar;
        super.e(bundle);
        this.d.d("onWarmUpExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        ApiException a2 = kVar.a(bundle);
        if (a2 != null) {
            this.f743a.trySetException(a2);
        } else {
            this.f743a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
