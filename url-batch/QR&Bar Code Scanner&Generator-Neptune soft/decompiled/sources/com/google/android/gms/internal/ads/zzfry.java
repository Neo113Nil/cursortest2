package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfry {
    private static final Map zza = new HashMap();
    private final Context zzb;
    private final zzfrn zzc;
    private boolean zzh;
    private final Intent zzi;
    private ServiceConnection zzm;
    private IInterface zzn;
    private final zzfqv zzo;
    private final List zze = new ArrayList();
    private final Set zzf = new HashSet();
    private final Object zzg = new Object();
    private final IBinder.DeathRecipient zzk = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzfrq
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfry.zzh(zzfry.this);
        }
    };
    private final AtomicInteger zzl = new AtomicInteger(0);
    private final String zzd = "OverlayDisplayService";
    private final WeakReference zzj = new WeakReference(null);

    public zzfry(Context context, zzfrn zzfrnVar, String str, Intent intent, zzfqv zzfqvVar, zzfrt zzfrtVar, byte[] bArr) {
        this.zzb = context;
        this.zzc = zzfrnVar;
        this.zzi = intent;
        this.zzo = zzfqvVar;
    }

    public static /* synthetic */ void zzh(zzfry zzfryVar) {
        zzfryVar.zzc.zzd("reportBinderDeath", new Object[0]);
        zzfrt zzfrtVar = (zzfrt) zzfryVar.zzj.get();
        if (zzfrtVar != null) {
            zzfryVar.zzc.zzd("calling onBinderDied", new Object[0]);
            zzfrtVar.zza();
        } else {
            zzfryVar.zzc.zzd("%s : Binder has died.", zzfryVar.zzd);
            Iterator it = zzfryVar.zze.iterator();
            while (it.hasNext()) {
                ((zzfro) it.next()).zzc(zzfryVar.zzs());
            }
            zzfryVar.zze.clear();
        }
        zzfryVar.zzt();
    }

    static /* bridge */ /* synthetic */ void zzn(zzfry zzfryVar) {
        zzfryVar.zzc.zzd("linkToDeath", new Object[0]);
        try {
            zzfryVar.zzn.asBinder().linkToDeath(zzfryVar.zzk, 0);
        } catch (RemoteException e) {
            zzfryVar.zzc.zzc(e, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void zzo(zzfry zzfryVar) {
        zzfryVar.zzc.zzd("unlinkToDeath", new Object[0]);
        zzfryVar.zzn.asBinder().unlinkToDeath(zzfryVar.zzk, 0);
    }

    private final RemoteException zzs() {
        return new RemoteException(String.valueOf(this.zzd).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzt() {
        synchronized (this.zzg) {
            Iterator it = this.zzf.iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).trySetException(zzs());
            }
            this.zzf.clear();
        }
    }

    public final Handler zzc() {
        Handler handler;
        Map map = zza;
        synchronized (map) {
            if (!map.containsKey(this.zzd)) {
                HandlerThread handlerThread = new HandlerThread(this.zzd, 10);
                handlerThread.start();
                map.put(this.zzd, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.zzd);
        }
        return handler;
    }

    public final IInterface zze() {
        return this.zzn;
    }

    public final void zzp(zzfro zzfroVar, final TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            this.zzf.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfrp
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    zzfry.this.zzq(taskCompletionSource, task);
                }
            });
        }
        synchronized (this.zzg) {
            if (this.zzl.getAndIncrement() > 0) {
                this.zzc.zza("Already connected to the service.", new Object[0]);
            }
        }
        zzc().post(new zzfrr(this, zzfroVar.zzb(), zzfroVar));
    }

    final /* synthetic */ void zzq(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.zzg) {
            this.zzf.remove(taskCompletionSource);
        }
    }

    public final void zzr() {
        synchronized (this.zzg) {
            if (this.zzl.get() > 0 && this.zzl.decrementAndGet() > 0) {
                this.zzc.zzd("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            zzc().post(new zzfrs(this));
        }
    }

    static /* bridge */ /* synthetic */ void zzm(zzfry zzfryVar, zzfro zzfroVar) {
        if (zzfryVar.zzn != null || zzfryVar.zzh) {
            if (!zzfryVar.zzh) {
                zzfroVar.run();
                return;
            } else {
                zzfryVar.zzc.zzd("Waiting to bind to the service.", new Object[0]);
                zzfryVar.zze.add(zzfroVar);
                return;
            }
        }
        zzfryVar.zzc.zzd("Initiate binding to the service.", new Object[0]);
        zzfryVar.zze.add(zzfroVar);
        zzfrx zzfrxVar = new zzfrx(zzfryVar, null);
        zzfryVar.zzm = zzfrxVar;
        zzfryVar.zzh = true;
        if (zzfryVar.zzb.bindService(zzfryVar.zzi, zzfrxVar, 1)) {
            return;
        }
        zzfryVar.zzc.zzd("Failed to bind to the service.", new Object[0]);
        zzfryVar.zzh = false;
        Iterator it = zzfryVar.zze.iterator();
        while (it.hasNext()) {
            ((zzfro) it.next()).zzc(new zzfrz());
        }
        zzfryVar.zze.clear();
    }
}
