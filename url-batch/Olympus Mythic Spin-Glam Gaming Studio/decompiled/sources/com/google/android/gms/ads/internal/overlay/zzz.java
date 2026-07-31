package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzgrx;
import com.google.android.gms.internal.ads.zzgry;
import com.google.android.gms.internal.ads.zzgrz;
import com.google.android.gms.internal.ads.zzgsa;
import com.google.android.gms.internal.ads.zzgst;
import com.google.android.gms.internal.ads.zzgsv;
import com.google.android.gms.internal.ads.zzgsw;
import com.google.android.gms.internal.ads.zzgsx;
import com.google.android.gms.internal.ads.zzgsy;
import com.google.android.gms.internal.ads.zzgtl;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzz {
    private zzgsw zzf;

    @Nullable
    private zzclm zzc = null;
    private boolean zze = false;

    @Nullable
    private String zza = null;

    @Nullable
    private zzgrz zzd = null;

    @Nullable
    private String zzb = null;

    private final void zzl() {
        if (this.zzf == null) {
            this.zzf = new zzx(this);
        }
    }

    private final zzgsy zzm() {
        zzgsx zzc = zzgsy.zzc();
        if (!((Boolean) zzba.zzc().zzd(zzbjg.zznh)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zzb(this.zzb);
        }
        return zzc.zzc();
    }

    public final synchronized void zza(@Nullable zzclm zzclmVar, Context context) {
        this.zzc = zzclmVar;
        if (!zzb(context)) {
            zzg("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zzi("on_play_store_bind", hashMap);
    }

    public final synchronized boolean zzb(Context context) {
        if (!zzgtl.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzgsa.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzl();
        this.zze = true;
        return true;
    }

    public final void zzc(@Nullable zzclm zzclmVar, @Nullable zzgst zzgstVar) {
        if (zzclmVar == null) {
            zzg("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzclmVar;
        if (!this.zze && !zzb(zzclmVar.getContext())) {
            zzg("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzba.zzc().zzd(zzbjg.zznh)).booleanValue()) {
            this.zzb = zzgstVar.zzb();
        }
        zzl();
        zzgrz zzgrzVar = this.zzd;
        if (zzgrzVar != null) {
            zzgrzVar.zza(zzgstVar, this.zzf);
        }
    }

    @VisibleForTesting
    final void zzg(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zzi("onError", hashMap);
        }
    }

    @VisibleForTesting
    final void zzh(String str) {
        zzi(str, new HashMap());
    }

    @VisibleForTesting
    final void zzi(final String str, final Map map) {
        zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzz.this.zzk(str, map);
            }
        });
    }

    @VisibleForTesting
    final void zzj(zzgsv zzgsvVar) {
        if (!TextUtils.isEmpty(zzgsvVar.zzb())) {
            if (!((Boolean) zzba.zzc().zzd(zzbjg.zznh)).booleanValue()) {
                this.zza = zzgsvVar.zzb();
            }
        }
        switch (zzgsvVar.zza()) {
            case 8152:
                zzh("onLMDOverlayOpened");
                break;
            case 8153:
                zzh("onLMDOverlayClicked");
                break;
            case 8155:
                zzh("onLMDOverlayClose");
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
                hashMap.put("error", String.valueOf(zzgsvVar.zza()));
                zzi("onLMDOverlayFailedToOpen", hashMap);
                break;
        }
    }

    final /* synthetic */ void zzk(String str, Map map) {
        zzclm zzclmVar = this.zzc;
        if (zzclmVar != null) {
            zzclmVar.zze(str, map);
        }
    }

    public final void zzd() {
        zzgrz zzgrzVar;
        if (!this.zze || (zzgrzVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgrzVar.zzd(zzm(), this.zzf);
            zzh("onLMDOverlayExpand");
        }
    }

    public final void zze() {
        zzgrz zzgrzVar;
        if (!this.zze || (zzgrzVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzgrzVar.zzc(zzm(), this.zzf);
            zzh("onLMDOverlayCollapse");
        }
    }

    public final void zzf() {
        zzgrz zzgrzVar;
        if (!this.zze || (zzgrzVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzgrx zzc = zzgry.zzc();
        if (!((Boolean) zzba.zzc().zzd(zzbjg.zznh)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzc.zza(str);
            } else {
                zzg("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zzb(this.zzb);
        }
        zzgrzVar.zzb(zzc.zzc(), this.zzf);
    }
}
