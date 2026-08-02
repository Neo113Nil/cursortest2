package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdsi {
    private final zzfef zza;
    private final Executor zzb;
    private final zzduy zzc;
    private final zzdtt zzd;
    private final Context zze;
    private final zzdxq zzf;
    private final zzfir zzg;
    private final zzfkm zzh;
    private final zzego zzi;

    public zzdsi(zzfef zzfefVar, Executor executor, zzduy zzduyVar, Context context, zzdxq zzdxqVar, zzfir zzfirVar, zzfkm zzfkmVar, zzego zzegoVar, zzdtt zzdttVar) {
        this.zza = zzfefVar;
        this.zzb = executor;
        this.zzc = zzduyVar;
        this.zze = context;
        this.zzf = zzdxqVar;
        this.zzg = zzfirVar;
        this.zzh = zzfkmVar;
        this.zzi = zzegoVar;
        this.zzd = zzdttVar;
    }

    private final void zzh(zzcmp zzcmpVar) {
        zzi(zzcmpVar);
        zzcmpVar.zzaf("/video", zzbpt.zzl);
        zzcmpVar.zzaf("/videoMeta", zzbpt.zzm);
        zzcmpVar.zzaf("/precache", new zzclc());
        zzcmpVar.zzaf("/delayPageLoaded", zzbpt.zzp);
        zzcmpVar.zzaf("/instrument", zzbpt.zzn);
        zzcmpVar.zzaf("/log", zzbpt.zzg);
        zzcmpVar.zzaf("/click", zzbpt.zza(null));
        if (this.zza.zzb != null) {
            zzcmpVar.zzP().zzC(true);
            zzcmpVar.zzaf("/open", new zzbqf(null, null, null, null, null));
        } else {
            zzcmpVar.zzP().zzC(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcmpVar.getContext())) {
            zzcmpVar.zzaf("/logScionEvent", new zzbqa(zzcmpVar.getContext()));
        }
    }

    private static final void zzi(zzcmp zzcmpVar) {
        zzcmpVar.zzaf("/videoClicked", zzbpt.zzh);
        zzcmpVar.zzP().zzE(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcT)).booleanValue()) {
            zzcmpVar.zzaf("/getNativeAdViewSignals", zzbpt.zzs);
        }
        zzcmpVar.zzaf("/getNativeClickMeta", zzbpt.zzt);
    }

    public final zzfzp zza(final JSONObject jSONObject) {
        return zzfzg.zzn(zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdry
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzdsi.this.zze(obj);
            }
        }, this.zzb), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzdsi.this.zzc(jSONObject, (zzcmp) obj);
            }
        }, this.zzb);
    }

    public final zzfzp zzb(final String str, final String str2, final zzfdk zzfdkVar, final zzfdn zzfdnVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfzg.zzn(zzfzg.zzi(null), new zzfyn() { // from class: com.google.android.gms.internal.ads.zzdsb
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzdsi.this.zzd(zzqVar, zzfdkVar, zzfdnVar, str, str2, obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ zzfzp zzc(JSONObject jSONObject, final zzcmp zzcmpVar) throws Exception {
        final zzchg zza = zzchg.zza(zzcmpVar);
        if (this.zza.zzb != null) {
            zzcmpVar.zzai(zzcoe.zzd());
        } else {
            zzcmpVar.zzai(zzcoe.zze());
        }
        zzcmpVar.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzdrx
            @Override // com.google.android.gms.internal.ads.zzcoa
            public final void zza(boolean z) {
                zzdsi.this.zzf(zzcmpVar, zza, z);
            }
        });
        zzcmpVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    final /* synthetic */ zzfzp zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfdk zzfdkVar, zzfdn zzfdnVar, String str, String str2, Object obj) throws Exception {
        final zzcmp zza = this.zzc.zza(zzqVar, zzfdkVar, zzfdnVar);
        final zzchg zza2 = zzchg.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzai(zzcoe.zzd());
        } else {
            zzdtq zzb = this.zzd.zzb();
            zza.zzP().zzL(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzb, null, null);
            zzi(zza);
        }
        zza.zzP().zzz(new zzcoa() { // from class: com.google.android.gms.internal.ads.zzdsc
            @Override // com.google.android.gms.internal.ads.zzcoa
            public final void zza(boolean z) {
                zzdsi.this.zzg(zza, zza2, z);
            }
        });
        zza.zzad(str, str2, null);
        return zza2;
    }

    final /* synthetic */ zzfzp zze(Object obj) throws Exception {
        zzcmp zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzchg zza2 = zzchg.zza(zza);
        zzh(zza);
        zza.zzP().zzF(new zzcob() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // com.google.android.gms.internal.ads.zzcob
            public final void zza() {
                zzchg.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcS));
        return zza2;
    }

    final /* synthetic */ void zzf(zzcmp zzcmpVar, zzchg zzchgVar, boolean z) {
        if (this.zza.zza != null && zzcmpVar.zzs() != null) {
            zzcmpVar.zzs().zzs(this.zza.zza);
        }
        zzchgVar.zzb();
    }

    final /* synthetic */ void zzg(zzcmp zzcmpVar, zzchg zzchgVar, boolean z) {
        if (!z) {
            zzchgVar.zze(new zzekr(1, "Html video Web View failed to load."));
            return;
        }
        if (this.zza.zza != null && zzcmpVar.zzs() != null) {
            zzcmpVar.zzs().zzs(this.zza.zza);
        }
        zzchgVar.zzb();
    }
}
