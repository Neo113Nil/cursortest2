package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcvk implements zzbbq, zzddv, com.google.android.gms.ads.internal.overlay.zzo, zzddu {
    private final zzcvf zza;
    private final zzcvg zzb;
    private final zzbuw zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcvj zzh = new zzcvj();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcvk(zzbut zzbutVar, zzcvg zzcvgVar, Executor executor, zzcvf zzcvfVar, Clock clock) {
        this.zza = zzcvfVar;
        this.zzd = zzbutVar.zza("google.afma.activeView.handleUpdate", zzbuh.zza, zzbuh.zza);
        this.zzb = zzcvgVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzk() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzf((zzcmp) it.next());
        }
        this.zza.zze();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final synchronized void zzbq(Context context) {
        this.zzh.zze = "u";
        zzg();
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final synchronized void zzbs(Context context) {
        this.zzh.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final synchronized void zzbt(Context context) {
        this.zzh.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbbq
    public final synchronized void zzc(zzbbp zzbbpVar) {
        zzcvj zzcvjVar = this.zzh;
        zzcvjVar.zza = zzbbpVar.zzj;
        zzcvjVar.zzf = zzbbpVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
    }

    public final synchronized void zzg() {
        if (this.zzj.get() == null) {
            zzj();
            return;
        }
        if (this.zzi || !this.zzg.get()) {
            return;
        }
        try {
            this.zzh.zzd = this.zzf.elapsedRealtime();
            final JSONObject zzb = this.zzb.zzb(this.zzh);
            for (final zzcmp zzcmpVar : this.zzc) {
                this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcmp.this.zzl("AFMA_updateActiveView", zzb);
                    }
                });
            }
            zzchf.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
        }
    }

    public final synchronized void zzh(zzcmp zzcmpVar) {
        this.zzc.add(zzcmpVar);
        this.zza.zzd(zzcmpVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        zzk();
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final synchronized void zzl() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zzc(this);
            zzg();
        }
    }
}
