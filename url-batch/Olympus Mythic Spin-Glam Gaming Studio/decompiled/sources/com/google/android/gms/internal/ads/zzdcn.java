package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
final class zzdcn implements zzdfd, zzdek, zzdej {

    @VisibleForTesting
    zzcas zza;

    @VisibleForTesting
    zzcas zzb;
    private final Context zzc;
    private final zzfld zzd;

    @Nullable
    private final zzclm zze;
    private final Clock zzf;
    private final zzeaj zzg;

    @Nullable
    private final String zzh;
    private final zzdcg zzi;

    zzdcn(Context context, zzfld zzfldVar, @Nullable zzclm zzclmVar, zzbzy zzbzyVar, @Nullable zzflo zzfloVar, Clock clock, zzeaj zzeajVar, zzdcg zzdcgVar) {
        this.zzc = context;
        this.zzd = zzfldVar;
        this.zze = zzclmVar;
        this.zzf = clock;
        this.zzg = zzeajVar;
        this.zzi = zzdcgVar;
        this.zzh = zzfloVar.zzb.zzb.zzb;
    }

    private final void zze(boolean z, boolean z2) {
        zzclm zzclmVar;
        Activity zzj;
        zzbzz zzbzzVar = this.zzd.zzad;
        if (zzbzzVar == null) {
            return;
        }
        if (z) {
            String str = zzbzzVar.zze;
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                bundle.putString("targetPackage", str);
                bundle.putString(Constants.REFERRER, zzbzzVar.zzg);
                bundle.putBundle("extra_query_params", zzbzzVar.zzh);
                if (z2 && (zzclmVar = this.zze) != null && (zzj = zzclmVar.zzj()) != null && zzj.getWindow() != null && zzj.getWindow().getDecorView() != null) {
                    bundle.putBinder("window_token", zzj.getWindow().getDecorView().getWindowToken());
                }
                zzf(bundle, "ppfla");
                return;
            }
        }
        zzf(null, "ppwla");
    }

    private final void zzf(@Nullable Bundle bundle, String str) {
        try {
            zzdcm zzdcmVar = new zzdcm(this, str, this.zzf.elapsedRealtime());
            ArrayList arrayList = new ArrayList();
            if (bundle != null) {
                arrayList.add(bundle);
            }
            this.zzi.zza(this.zzc, arrayList, zzdcmVar);
        } catch (Throwable th) {
            zzi(th, "invokeHsdpPrewarmOrPrefetch");
        }
    }

    private final void zzi(Throwable th, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoF)).booleanValue()) {
            if (this.zzb == null) {
                this.zzb = zzcaq.zzc(this.zzc);
            }
            this.zzb.zzh(th, "HsdpServiceUnsampled.".concat(str));
        } else {
            if (this.zza == null) {
                this.zza = zzcaq.zza(this.zzc);
            }
            this.zza.zzh(th, "HsdpService.".concat(str));
        }
    }

    private final boolean zzj() {
        zzbzz zzbzzVar;
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoC)).booleanValue() && (zzbzzVar = this.zzd.zzad) != null && zzbzzVar.zzd;
    }

    private final boolean zzk(int i) {
        zzbzz zzbzzVar = this.zzd.zzad;
        return (zzbzzVar == null || (i & zzbzzVar.zzf) == 0) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzb(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzc(@Nullable Context context) {
        zzbzz zzbzzVar = this.zzd.zzad;
        if (zzbzzVar == null || !zzj()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoD)).booleanValue()) {
            String str = zzbzzVar.zze;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                this.zzi.zzb(this.zzc, str);
            } catch (Throwable th) {
                zzi(th, "invokeEndSession");
            }
        }
    }

    final /* synthetic */ void zzd(String str, long j, String str2, Bundle bundle) {
        String jSONObject = bundle != null ? new com.google.android.gms.ads.internal.util.client.zzf().zzn(bundle, new JSONObject()).toString() : null;
        zzeaj zzeajVar = this.zzg;
        long elapsedRealtime = this.zzf.elapsedRealtime() - j;
        String str3 = this.zzh;
        String encodeToString = jSONObject != null ? Base64.encodeToString(jSONObject.getBytes(), 1) : null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoE)).booleanValue()) {
            zzeai zza = zzeajVar.zza();
            zza.zzc("action", str);
            zza.zzc("ppwpfl", String.valueOf(elapsedRealtime));
            zza.zzc("ppwpfst", str2);
            if (str3 != null) {
                zza.zzc("gqi", str3);
            }
            if (encodeToString != null) {
                zza.zzc("ppwpferr", encodeToString);
            }
            zza.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        zzbzz zzbzzVar = this.zzd.zzad;
        if (zzbzzVar == null || !zzbzzVar.zza) {
            return;
        }
        if (zzj()) {
            if (zzk(4)) {
                zze(zzk(8), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoG)).booleanValue());
                return;
            }
            return;
        }
        if (zzk(256)) {
            ArrayList arrayList = new ArrayList();
            if (zzk(512)) {
                String str = zzbzzVar.zzb;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                arrayList.add(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        zzbzz zzbzzVar = this.zzd.zzad;
        if (zzbzzVar == null || !zzbzzVar.zza) {
            return;
        }
        if (zzj()) {
            if (zzk(1)) {
                zze(zzk(2), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoH)).booleanValue());
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbzzVar.zzb;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }
}
