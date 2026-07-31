package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f720a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.f720a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = ajVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        com.google.android.play.integrity.internal.s sVar;
        at atVar;
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.e.f723a.e();
            Bundle bundle = this.f720a;
            aj ajVar = this.e;
            atVar = ajVar.e;
            nVar.c(bundle, atVar.a(this.b, this.c, ajVar.f723a));
        } catch (RemoteException e) {
            aj ajVar2 = this.e;
            int i = this.d;
            sVar = ajVar2.b;
            sVar.c(e, "requestAndShowDialog(%s)", Integer.valueOf(i));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
