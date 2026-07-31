package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final com.google.android.play.integrity.internal.s d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(Bundle bundle) throws RemoteException {
        k kVar;
        String str;
        super.c(bundle);
        this.d.d("onRequestExpressIntegrityToken", new Object[0]);
        kVar = this.c.f;
        ApiException a2 = kVar.a(bundle);
        if (a2 != null) {
            this.f743a.trySetException(a2);
            return;
        }
        long j = bundle.getLong("request.token.sid");
        str = this.c.c;
        bj bjVar = new bj(this, str, j);
        TaskCompletionSource taskCompletionSource = this.f743a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
