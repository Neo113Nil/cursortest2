package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdw {
    private static zzdw zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzdw(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzdt(this, null), intentFilter);
    }

    public static synchronized zzdw zzb(Context context) {
        zzdw zzdwVar;
        synchronized (zzdw.class) {
            if (zza == null) {
                zza = new zzdw(context);
            }
            zzdwVar = zza;
        }
        return zzdwVar;
    }

    static /* synthetic */ void zzc(zzdw zzdwVar, int i) {
        synchronized (zzdwVar.zzd) {
            if (zzdwVar.zze == i) {
                return;
            }
            zzdwVar.zze = i;
            Iterator it = zzdwVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzvx zzvxVar = (zzvx) weakReference.get();
                if (zzvxVar != null) {
                    zzvxVar.zza.zzk(i);
                } else {
                    zzdwVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzd) {
            i = this.zze;
        }
        return i;
    }

    public final void zzd(final zzvx zzvxVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzvxVar));
        final byte[] bArr = null;
        this.zzb.post(new Runnable(zzvxVar, bArr) { // from class: com.google.android.gms.internal.ads.zzdq
            public final /* synthetic */ zzvx zzb;

            @Override // java.lang.Runnable
            public final void run() {
                zzdw zzdwVar = zzdw.this;
                zzvx zzvxVar2 = this.zzb;
                zzvxVar2.zza.zzk(zzdwVar.zza());
            }
        });
    }
}
