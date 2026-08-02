package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeas implements com.google.android.gms.ads.internal.overlay.zzo, zzcoa {
    private final Context zza;
    private final zzcgv zzb;
    private zzeak zzc;
    private zzcmp zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzcy zzh;
    private boolean zzi;

    zzeas(Context context, zzcgv zzcgvVar) {
        this.zza = context;
        this.zzb = zzcgvVar;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzj("Ad inspector had an internal error.");
            try {
                zzcyVar.zze(zzffe.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Ad inspector had an internal error.");
            try {
                zzcyVar.zze(zzffe.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhH)).intValue()) {
                return true;
            }
        }
        com.google.android.gms.ads.internal.util.zze.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzcyVar.zze(zzffe.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcoa
    public final synchronized void zza(boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
        } else {
            com.google.android.gms.ads.internal.util.zze.zzj("Ad inspector failed to load.");
            try {
                com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzh;
                if (zzcyVar != null) {
                    zzcyVar.zze(zzffe.zzd(17, null, null));
                }
            } catch (RemoteException unused) {
            }
            this.zzi = true;
            this.zzd.destroy();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzh;
            if (zzcyVar != null) {
                try {
                    zzcyVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcmp zzcmpVar = this.zzd;
        if (zzcmpVar == null || zzcmpVar.zzaB()) {
            return null;
        }
        return this.zzd.zzk();
    }

    public final void zzh(zzeak zzeakVar) {
        this.zzc = zzeakVar;
    }

    final /* synthetic */ void zzi(String str) {
        JSONObject zze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzcy zzcyVar, zzbpv zzbpvVar, zzbqg zzbqgVar) {
        if (zzl(zzcyVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcmp zza = zzcnb.zza(this.zza, zzcoe.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbep.zza(), null, null);
                this.zzd = zza;
                zzcoc zzP = zza.zzP();
                if (zzP == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzcyVar.zze(zzffe.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.zzh = zzcyVar;
                zzP.zzL(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbpvVar, null, new zzbqm(this.zza), zzbqgVar);
                zzP.zzz(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhF));
                com.google.android.gms.ads.internal.zzt.zzi();
                com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            } catch (zzcna e) {
                com.google.android.gms.ads.internal.util.zze.zzk("Failed to obtain a web view for the ad inspector", e);
                try {
                    zzcyVar.zze(zzffe.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzear
                @Override // java.lang.Runnable
                public final void run() {
                    zzeas.this.zzi(str);
                }
            });
        }
    }
}
