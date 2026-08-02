package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzfqr;
import com.google.android.gms.internal.ads.zzfqs;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzfrc;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrf;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrh;
import com.google.android.gms.internal.ads.zzfsb;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
public final class zzw {
    private zzfrf zzf;
    private zzcmp zzc = null;
    private boolean zze = false;
    private String zza = null;
    private zzfqs zzd = null;
    private String zzb = null;

    private final zzfrh zzl() {
        zzfrg zzc = zzfrh.zzc();
        if (!((Boolean) zzay.zzc().zzb(zzbjc.zziT)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.zzb);
        }
        return zzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzv(this);
        }
    }

    public final synchronized void zza(zzcmp zzcmpVar, Context context) {
        this.zzc = zzcmpVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfqs zzfqsVar;
        if (!this.zze || (zzfqsVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfqsVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        zzfqs zzfqsVar;
        if (!this.zze || (zzfqsVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfqq zzc = zzfqr.zzc();
        if (!((Boolean) zzay.zzc().zzb(zzbjc.zziT)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.zzb);
        }
        zzfqsVar.zzb(zzc.zzc(), this.zzf);
    }

    final void zzd(String str) {
        zze(str, new HashMap());
    }

    final void zze(final String str, final Map map) {
        zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzu
            @Override // java.lang.Runnable
            public final void run() {
                zzw.this.zzh(str, map);
            }
        });
    }

    final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzfqs zzfqsVar;
        if (!this.zze || (zzfqsVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfqsVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    final /* synthetic */ void zzh(String str, Map map) {
        zzcmp zzcmpVar = this.zzc;
        if (zzcmpVar != null) {
            zzcmpVar.zzd(str, map);
        }
    }

    final void zzi(zzfre zzfreVar) {
        if (!TextUtils.isEmpty(zzfreVar.zzb())) {
            if (!((Boolean) zzay.zzc().zzb(zzbjc.zziT)).booleanValue()) {
                this.zza = zzfreVar.zzb();
            }
        }
        switch (zzfreVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfreVar.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }

    public final void zzj(zzcmp zzcmpVar, zzfrc zzfrcVar) {
        if (zzcmpVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcmpVar;
        if (!this.zze && !zzk(zzcmpVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzay.zzc().zzb(zzbjc.zziT)).booleanValue()) {
            this.zzb = zzfrcVar.zzg();
        }
        zzm();
        zzfqs zzfqsVar = this.zzd;
        if (zzfqsVar != null) {
            zzfqsVar.zzd(zzfrcVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzfsb.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfqt.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
