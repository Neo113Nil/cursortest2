package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgfv implements ServiceConnection {
    final /* synthetic */ zzggb zza;

    /* synthetic */ zzgfv(zzggb zzggbVar, byte[] bArr) {
        Objects.requireNonNull(zzggbVar);
        this.zza = zzggbVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzggb zzggbVar = this.zza;
        zzggbVar.zzi().zza("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzggbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IInterface zzm;
                zzgef zzb = zzgee.zzb(iBinder);
                zzgfv zzgfvVar = zzgfv.this;
                zzggb zzggbVar2 = zzgfvVar.zza;
                zzggbVar2.zzn(zzb);
                zzggbVar2.zzi().zza("linkToDeath", new Object[0]);
                try {
                    zzm = zzggbVar2.zzm();
                } catch (RemoteException e) {
                    zzgfvVar.zza.zzi().zzd(e, "linkToDeath failed", new Object[0]);
                }
                if (zzm == null) {
                    throw null;
                }
                IInterface iInterface = zzm;
                zzm.asBinder().linkToDeath(zzggbVar2.zzl(), 0);
                zzggb zzggbVar3 = zzgfvVar.zza;
                zzggbVar3.zzk(false);
                synchronized (zzggbVar3.zzj()) {
                    Iterator it = zzggbVar3.zzj().iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    zzggbVar3.zzj().clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzggb zzggbVar = this.zza;
        zzggbVar.zzi().zza("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzggbVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgft
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzggb zzggbVar2 = zzgfv.this.zza;
                zzggbVar2.zzi().zza("unlinkToDeath", new Object[0]);
                IInterface zzm = zzggbVar2.zzm();
                zzm.getClass();
                zzm.asBinder().unlinkToDeath(zzggbVar2.zzl(), 0);
                zzggbVar2.zzn(null);
                zzggbVar2.zzk(false);
            }
        });
    }
}
