package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcyk extends zzcxc {
    private final zzbnv zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcyk(zzczd zzczdVar, zzbnv zzbnvVar, Runnable runnable, Executor executor) {
        super(zzczdVar);
        this.zzc = zzbnvVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzW() {
        final zzcyi zzcyiVar = new zzcyi(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyj
            @Override // java.lang.Runnable
            public final void run() {
                zzcyk.this.zzk(zzcyiVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final com.google.android.gms.ads.internal.client.zzdk zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final zzfdl zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final zzfdl zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcyi) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcyi) runnable).zza);
        }
    }
}
