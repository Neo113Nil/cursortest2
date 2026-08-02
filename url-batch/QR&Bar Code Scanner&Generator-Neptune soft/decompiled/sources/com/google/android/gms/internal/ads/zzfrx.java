package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfrx implements ServiceConnection {
    final /* synthetic */ zzfry zza;

    /* synthetic */ zzfrx(zzfry zzfryVar, zzfrw zzfrwVar) {
        this.zza = zzfryVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzfrn zzfrnVar;
        zzfrnVar = this.zza.zzc;
        zzfrnVar.zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new zzfru(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfrn zzfrnVar;
        zzfrnVar = this.zza.zzc;
        zzfrnVar.zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new zzfrv(this));
    }
}
