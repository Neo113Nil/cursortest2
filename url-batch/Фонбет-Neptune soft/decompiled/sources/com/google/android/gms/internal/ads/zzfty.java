package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfty implements ServiceConnection {
    final /* synthetic */ zzftz zza;

    /* synthetic */ zzfty(zzftz zzftzVar, zzftx zzftxVar) {
        this.zza = zzftzVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzfua zzfuaVar;
        zzfuaVar = this.zza.zzc;
        zzfuaVar.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftv
            @Override // java.lang.Runnable
            public final void run() {
                zzfua zzfuaVar2;
                zzfua zzfuaVar3;
                List list;
                List list2;
                List list3;
                IInterface iInterface;
                IBinder.DeathRecipient deathRecipient;
                zzfty zzftyVar = zzfty.this;
                zzftyVar.zza.zzj = zzfsi.zzb(iBinder);
                zzfuaVar2 = zzftyVar.zza.zzc;
                zzfuaVar2.zzc("linkToDeath", new Object[0]);
                try {
                    iInterface = zzftyVar.zza.zzj;
                    iInterface.getClass();
                    IBinder asBinder = iInterface.asBinder();
                    deathRecipient = zzftyVar.zza.zzh;
                    asBinder.linkToDeath(deathRecipient, 0);
                } catch (RemoteException e) {
                    zzfuaVar3 = zzftyVar.zza.zzc;
                    zzfuaVar3.zzb(e, "linkToDeath failed", new Object[0]);
                }
                zzftyVar.zza.zzf = false;
                list = zzftyVar.zza.zze;
                synchronized (list) {
                    list2 = zzftyVar.zza.zze;
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list3 = zzftyVar.zza.zze;
                    list3.clear();
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfua zzfuaVar;
        zzfuaVar = this.zza.zzc;
        zzfuaVar.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftw
            @Override // java.lang.Runnable
            public final void run() {
                zzfua zzfuaVar2;
                IInterface iInterface;
                IBinder.DeathRecipient deathRecipient;
                zzfty zzftyVar = zzfty.this;
                zzfuaVar2 = zzftyVar.zza.zzc;
                zzfuaVar2.zzc("unlinkToDeath", new Object[0]);
                zzftz zzftzVar = zzftyVar.zza;
                iInterface = zzftzVar.zzj;
                iInterface.getClass();
                IBinder asBinder = iInterface.asBinder();
                deathRecipient = zzftzVar.zzh;
                asBinder.unlinkToDeath(deathRecipient, 0);
                zzftyVar.zza.zzj = null;
                zzftyVar.zza.zzf = false;
            }
        });
    }
}
