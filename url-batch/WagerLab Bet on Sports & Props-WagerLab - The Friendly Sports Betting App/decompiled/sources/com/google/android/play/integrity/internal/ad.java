package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
final class ad implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f769a;

    /* synthetic */ ad(ae aeVar, ac acVar) {
        this.f769a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        s sVar;
        sVar = this.f769a.c;
        sVar.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f769a.c().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        s sVar;
        sVar = this.f769a.c;
        sVar.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f769a.c().post(new ab(this));
    }
}
