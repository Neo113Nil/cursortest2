package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdoa {
    private final zzdnn zza;
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdsk zzd;
    private final Executor zze;
    private final zzauo zzf;
    private final VersionInfoParcel zzg;
    private final zzbjn zzh;
    private final zzedh zzi;
    private final zzfll zzj;
    private final zzeds zzk;
    private final zzffk zzl;
    private ListenableFuture zzm;

    zzdoa(zzdnx zzdnxVar) {
        Context context;
        Executor executor;
        zzauo zzauoVar;
        VersionInfoParcel versionInfoParcel;
        com.google.android.gms.ads.internal.zza zzaVar;
        zzedh zzedhVar;
        zzfll zzfllVar;
        zzdsk zzdskVar;
        zzeds zzedsVar;
        zzffk zzffkVar;
        context = zzdnxVar.zzb;
        this.zzc = context;
        executor = zzdnxVar.zze;
        this.zze = executor;
        zzauoVar = zzdnxVar.zzf;
        this.zzf = zzauoVar;
        versionInfoParcel = zzdnxVar.zzg;
        this.zzg = versionInfoParcel;
        zzaVar = zzdnxVar.zza;
        this.zzb = zzaVar;
        this.zza = new zzdnn();
        this.zzh = new zzbjn();
        zzedhVar = zzdnxVar.zzd;
        this.zzi = zzedhVar;
        zzfllVar = zzdnxVar.zzh;
        this.zzj = zzfllVar;
        zzdskVar = zzdnxVar.zzc;
        this.zzd = zzdskVar;
        zzedsVar = zzdnxVar.zzi;
        this.zzk = zzedsVar;
        zzffkVar = zzdnxVar.zzj;
        this.zzl = zzffkVar;
    }

    final /* synthetic */ zzcej zza(zzcej zzcejVar) {
        zzcejVar.zzag("/result", this.zzh);
        zzcgb zzN = zzcejVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzedh zzedhVar = this.zzi;
        zzfll zzfllVar = this.zzj;
        zzdsk zzdskVar = this.zzd;
        zzdnn zzdnnVar = this.zza;
        zzN.zzR(null, zzdnnVar, zzdnnVar, zzdnnVar, zzdnnVar, false, null, zzbVar, null, null, zzedhVar, zzfllVar, zzdskVar, null, null, null, null, null, null);
        return zzcejVar;
    }

    final /* synthetic */ ListenableFuture zzf(String str, JSONObject jSONObject, zzcej zzcejVar) throws Exception {
        return this.zzh.zzb(zzcejVar, str, jSONObject);
    }

    public final synchronized ListenableFuture zzg(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return zzgcj.zzh(null);
        }
        return zzgcj.zzn(listenableFuture, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzdno
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzdoa.this.zzf(str, jSONObject, (zzcej) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzfel zzfelVar, zzfeo zzfeoVar, zzcni zzcniVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgcj.zzr(listenableFuture, new zzdnu(this, zzfelVar, zzfeoVar, zzcniVar), this.zze);
    }

    public final synchronized void zzi() {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgcj.zzr(listenableFuture, new zzdnq(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgcj.zzr(listenableFuture, new zzdnt(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdr);
        final Context context = this.zzc;
        final zzauo zzauoVar = this.zzf;
        final VersionInfoParcel versionInfoParcel = this.zzg;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzeds zzedsVar = this.zzk;
        final zzffk zzffkVar = this.zzl;
        ListenableFuture zzm = zzgcj.zzm(zzgcj.zzk(new zzgbp() { // from class: com.google.android.gms.internal.ads.zzceu
            @Override // com.google.android.gms.internal.ads.zzgbp
            public final ListenableFuture zza() {
                com.google.android.gms.ads.internal.zzu.zzz();
                Context context2 = context;
                zzcgd zza = zzcgd.zza();
                zzauo zzauoVar2 = zzauoVar;
                zzeds zzedsVar2 = zzedsVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcej zza2 = zzcew.zza(context2, zza, "", false, false, zzauoVar2, null, versionInfoParcel, null, null, zzaVar2, zzbav.zza(), null, null, zzedsVar2, zzffkVar);
                final zzbzs zza3 = zzbzs.zza(zza2);
                zza2.zzN().zzB(new zzcfz() { // from class: com.google.android.gms.internal.ads.zzcet
                    @Override // com.google.android.gms.internal.ads.zzcfz
                    public final void zza(boolean z, int i, String str2, String str3) {
                        zzbzs.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzbzo.zze), new zzful() { // from class: com.google.android.gms.internal.ads.zzdnp
            @Override // com.google.android.gms.internal.ads.zzful
            public final Object apply(Object obj) {
                zzcej zzcejVar = (zzcej) obj;
                zzdoa.this.zza(zzcejVar);
                return zzcejVar;
            }
        }, this.zze);
        this.zzm = zzm;
        zzbzr.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbix zzbixVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgcj.zzr(listenableFuture, new zzdnr(this, str, zzbixVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbix zzbixVar) {
        zzl(str, new zzdnz(this, weakReference, str, zzbixVar, null));
    }

    public final synchronized void zzn(String str, zzbix zzbixVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgcj.zzr(listenableFuture, new zzdns(this, str, zzbixVar), this.zze);
    }
}
