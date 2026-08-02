package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzei {
    private static zzei zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzei(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzeh(this, null), intentFilter);
    }

    public static synchronized zzei zzb(Context context) {
        zzei zzeiVar;
        synchronized (zzei.class) {
            if (zza == null) {
                zza = new zzei(context);
            }
            zzeiVar = zza;
        }
        return zzeiVar;
    }

    static /* synthetic */ void zzc(zzei zzeiVar, int i) {
        synchronized (zzeiVar.zzd) {
            if (zzeiVar.zze == i) {
                return;
            }
            zzeiVar.zze = i;
            Iterator it = zzeiVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzyl zzylVar = (zzyl) weakReference.get();
                if (zzylVar != null) {
                    zzylVar.zza.zzk(i);
                } else {
                    zzeiVar.zzc.remove(weakReference);
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

    public final void zzd(final zzyl zzylVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzylVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzee
            @Override // java.lang.Runnable
            public final void run() {
                zzylVar.zza.zzk(zzei.this.zza());
            }
        });
    }
}
