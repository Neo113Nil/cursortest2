package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest f741a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f741a = standardIntegrityTokenRequest;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
        this.e = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        com.google.android.play.integrity.internal.s sVar;
        if (bn.l(this.e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.e, 0)) {
            super.a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.e;
            ((com.google.android.play.integrity.internal.i) bnVar.f745a.e()).d(bn.a(bnVar, this.f741a, this.b, this.c, 0), new bk(this.e, this.d, this.b));
        } catch (RemoteException e) {
            bn bnVar2 = this.e;
            StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest = this.f741a;
            sVar = bnVar2.b;
            sVar.c(e, "requestExpressIntegrityToken(%s, %s, %s)", standardIntegrityTokenRequest.requestHash(), this.f741a.verdictOptOut(), Long.valueOf(this.b));
            this.d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
