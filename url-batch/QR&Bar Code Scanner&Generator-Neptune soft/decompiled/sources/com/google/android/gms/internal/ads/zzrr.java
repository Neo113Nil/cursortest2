package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzrr extends zzrj {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzfz zzc;

    protected zzrr() {
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final void zzj() {
        for (zzrq zzrqVar : this.zza.values()) {
            zzrqVar.zza.zzi(zzrqVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected final void zzl() {
        for (zzrq zzrqVar : this.zza.values()) {
            zzrqVar.zza.zzk(zzrqVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected void zzn(zzfz zzfzVar) {
        this.zzc = zzfzVar;
        this.zzb = zzen.zzD(null);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    protected void zzq() {
        for (zzrq zzrqVar : this.zza.values()) {
            zzrqVar.zza.zzp(zzrqVar.zzb);
            zzrqVar.zza.zzs(zzrqVar.zzc);
            zzrqVar.zza.zzr(zzrqVar.zzc);
        }
        this.zza.clear();
    }

    protected zzsi zzv(Object obj, zzsi zzsiVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public void zzw() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzrq) it.next()).zza.zzw();
        }
    }

    protected abstract void zzx(Object obj, zzsk zzskVar, zzcn zzcnVar);

    protected final void zzy(final Object obj, zzsk zzskVar) {
        zzdd.zzd(!this.zza.containsKey(obj));
        zzsj zzsjVar = new zzsj() { // from class: com.google.android.gms.internal.ads.zzro
            @Override // com.google.android.gms.internal.ads.zzsj
            public final void zza(zzsk zzskVar2, zzcn zzcnVar) {
                zzrr.this.zzx(obj, zzskVar2, zzcnVar);
            }
        };
        zzrp zzrpVar = new zzrp(this, obj);
        this.zza.put(obj, new zzrq(zzskVar, zzsjVar, zzrpVar));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzskVar.zzh(handler, zzrpVar);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zzskVar.zzg(handler2, zzrpVar);
        zzskVar.zzm(zzsjVar, this.zzc, zzb());
        if (zzt()) {
            return;
        }
        zzskVar.zzi(zzsjVar);
    }
}
