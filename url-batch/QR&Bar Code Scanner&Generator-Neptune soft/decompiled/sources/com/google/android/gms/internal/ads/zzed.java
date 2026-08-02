package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzed {
    private static zzed zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzed(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        zzen.zzA(context, new zzec(this, null), intentFilter);
    }

    public static synchronized zzed zzb(Context context) {
        zzed zzedVar;
        synchronized (zzed.class) {
            if (zza == null) {
                zza = new zzed(context);
            }
            zzedVar = zza;
        }
        return zzedVar;
    }

    static /* synthetic */ void zzc(zzed zzedVar, int i) {
        synchronized (zzedVar.zzd) {
            if (zzedVar.zze == i) {
                return;
            }
            zzedVar.zze = i;
            Iterator it = zzedVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzwj zzwjVar = (zzwj) weakReference.get();
                if (zzwjVar != null) {
                    zzwjVar.zza.zzk(i);
                } else {
                    zzedVar.zzc.remove(weakReference);
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

    public final void zzd(final zzwj zzwjVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzwjVar));
        final byte[] bArr = null;
        this.zzb.post(new Runnable(zzwjVar, bArr) { // from class: com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ zzwj zzb;

            @Override // java.lang.Runnable
            public final void run() {
                zzed zzedVar = zzed.this;
                zzwj zzwjVar2 = this.zzb;
                zzwjVar2.zza.zzk(zzedVar.zza());
            }
        });
    }
}
