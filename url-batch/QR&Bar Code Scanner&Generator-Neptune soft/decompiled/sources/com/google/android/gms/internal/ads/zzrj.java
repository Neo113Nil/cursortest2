package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzrj implements zzsk {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzsr zzc = new zzsr();
    private final zzpk zzd = new zzpk();
    private Looper zze;
    private zzcn zzf;
    private zznb zzg;

    @Override // com.google.android.gms.internal.ads.zzsk
    public final /* synthetic */ zzcn zzG() {
        return null;
    }

    protected final zznb zzb() {
        zznb zznbVar = this.zzg;
        zzdd.zzb(zznbVar);
        return zznbVar;
    }

    protected final zzpk zzc(zzsi zzsiVar) {
        return this.zzd.zza(0, zzsiVar);
    }

    protected final zzpk zzd(int i, zzsi zzsiVar) {
        return this.zzd.zza(i, zzsiVar);
    }

    protected final zzsr zze(zzsi zzsiVar) {
        return this.zzc.zza(0, zzsiVar, 0L);
    }

    protected final zzsr zzf(int i, zzsi zzsiVar, long j) {
        return this.zzc.zza(i, zzsiVar, 0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzi(zzsj zzsjVar) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzsjVar);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzj();
        }
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzk(zzsj zzsjVar) {
        Objects.requireNonNull(this.zze);
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzsjVar);
        if (isEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzm(zzsj zzsjVar, zzfz zzfzVar, zznb zznbVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzdd.zzd(z);
        this.zzg = zznbVar;
        zzcn zzcnVar = this.zzf;
        this.zza.add(zzsjVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzsjVar);
            zzn(zzfzVar);
        } else if (zzcnVar != null) {
            zzk(zzsjVar);
            zzsjVar.zza(this, zzcnVar);
        }
    }

    protected abstract void zzn(zzfz zzfzVar);

    protected final void zzo(zzcn zzcnVar) {
        this.zzf = zzcnVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzsj) arrayList.get(i)).zza(this, zzcnVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzp(zzsj zzsjVar) {
        this.zza.remove(zzsjVar);
        if (!this.zza.isEmpty()) {
            zzi(zzsjVar);
            return;
        }
        this.zze = null;
        this.zzf = null;
        this.zzg = null;
        this.zzb.clear();
        zzq();
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzr(zzpl zzplVar) {
        this.zzd.zzc(zzplVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzs(zzss zzssVar) {
        this.zzc.zzm(zzssVar);
    }

    protected final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final /* synthetic */ boolean zzu() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzg(Handler handler, zzpl zzplVar) {
        Objects.requireNonNull(zzplVar);
        this.zzd.zzb(handler, zzplVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsk
    public final void zzh(Handler handler, zzss zzssVar) {
        Objects.requireNonNull(zzssVar);
        this.zzc.zzb(handler, zzssVar);
    }
}
