package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdtn {
    private final zzdth zza;
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcnb zzc;
    private final Context zzd;
    private final zzdxq zze;
    private final zzfir zzf;
    private final Executor zzg;
    private final zzape zzh;
    private final zzcgv zzi;
    private final zzbqj zzj;
    private final zzego zzk;
    private final zzfkm zzl;
    private zzfzp zzm;

    zzdtn(zzdtk zzdtkVar) {
        Context context;
        Executor executor;
        zzape zzapeVar;
        zzcgv zzcgvVar;
        com.google.android.gms.ads.internal.zza zzaVar;
        zzcnb zzcnbVar;
        zzego zzegoVar;
        zzfkm zzfkmVar;
        zzdxq zzdxqVar;
        zzfir zzfirVar;
        context = zzdtkVar.zzc;
        this.zzd = context;
        executor = zzdtkVar.zzg;
        this.zzg = executor;
        zzapeVar = zzdtkVar.zzh;
        this.zzh = zzapeVar;
        zzcgvVar = zzdtkVar.zzi;
        this.zzi = zzcgvVar;
        zzaVar = zzdtkVar.zza;
        this.zzb = zzaVar;
        this.zza = new zzdth(null);
        zzcnbVar = zzdtkVar.zzb;
        this.zzc = zzcnbVar;
        this.zzj = new zzbqj();
        zzegoVar = zzdtkVar.zzf;
        this.zzk = zzegoVar;
        zzfkmVar = zzdtkVar.zzj;
        this.zzl = zzfkmVar;
        zzdxqVar = zzdtkVar.zzd;
        this.zze = zzdxqVar;
        zzfirVar = zzdtkVar.zze;
        this.zzf = zzfirVar;
    }

    final /* synthetic */ zzcmp zza(zzcmp zzcmpVar) {
        zzcmpVar.zzaf("/result", this.zzj);
        zzcoc zzP = zzcmpVar.zzP();
        zzdth zzdthVar = this.zza;
        zzP.zzL(null, zzdthVar, zzdthVar, zzdthVar, zzdthVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null, null, null);
        return zzcmpVar;
    }

    final /* synthetic */ zzfzp zzc(String str, JSONObject jSONObject, zzcmp zzcmpVar) throws Exception {
        return this.zzj.zzb(zzcmpVar, str, jSONObject);
    }

    public final synchronized zzfzp zzd(final String str, final JSONObject jSONObject) {
        zzfzp zzfzpVar = this.zzm;
        if (zzfzpVar == null) {
            return zzfzg.zzi(null);
        }
        return zzfzg.zzn(zzfzpVar, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdsz
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzdtn.this.zzc(str, jSONObject, (zzcmp) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzfdk zzfdkVar, zzfdn zzfdnVar) {
        zzfzp zzfzpVar = this.zzm;
        if (zzfzpVar == null) {
            return;
        }
        zzfzg.zzr(zzfzpVar, new zzdtf(this, zzfdkVar, zzfdnVar), this.zzg);
    }

    public final synchronized void zzf() {
        zzfzp zzfzpVar = this.zzm;
        if (zzfzpVar == null) {
            return;
        }
        zzfzg.zzr(zzfzpVar, new zzdtb(this), this.zzg);
        this.zzm = null;
    }

    public final synchronized void zzg(String str, Map map) {
        zzfzp zzfzpVar = this.zzm;
        if (zzfzpVar == null) {
            return;
        }
        zzfzg.zzr(zzfzpVar, new zzdte(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final Context context = this.zzd;
        final zzcgv zzcgvVar = this.zzi;
        final String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcR);
        final zzape zzapeVar = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzfzp zzm = zzfzg.zzm(zzfzg.zzl(new zzfym() { // from class: com.google.android.gms.internal.ads.zzcmy
            @Override // com.google.android.gms.internal.ads.zzfym
            public final zzfzp zza() {
                Context context2 = context;
                zzape zzapeVar2 = zzapeVar;
                zzcgv zzcgvVar2 = zzcgvVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcmp zza = zzcnb.zza(context2, zzcoe.zza(), "", false, false, zzapeVar2, null, zzcgvVar2, null, null, zzaVar2, zzbep.zza(), null, null);
                final zzchg zza2 = zzchg.zza(zza);
                zza.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzcmz
                    @Override // com.google.android.gms.internal.ads.zzcoa
                    public final void zza(boolean z) {
                        zzchg.this.zzb();
                    }
                });
                zza.loadUrl(str2);
                return zza2;
            }
        }, zzchc.zze), new zzfsm() { // from class: com.google.android.gms.internal.ads.zzdta
            @Override // com.google.android.gms.internal.ads.zzfsm
            public final Object apply(Object obj) {
                zzcmp zzcmpVar = (zzcmp) obj;
                zzdtn.this.zza(zzcmpVar);
                return zzcmpVar;
            }
        }, this.zzg);
        this.zzm = zzm;
        zzchf.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbpu zzbpuVar) {
        zzfzp zzfzpVar = this.zzm;
        if (zzfzpVar == null) {
            return;
        }
        zzfzg.zzr(zzfzpVar, new zzdtc(this, str, zzbpuVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbpu zzbpuVar) {
        zzi(str, new zzdtm(this, weakReference, str, zzbpuVar, null));
    }

    public final synchronized void zzk(String str, zzbpu zzbpuVar) {
        zzfzp zzfzpVar = this.zzm;
        if (zzfzpVar == null) {
            return;
        }
        zzfzg.zzr(zzfzpVar, new zzdtd(this, str, zzbpuVar), this.zzg);
    }
}
