package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzeea implements com.google.android.gms.ads.internal.overlay.zzr, zzcni {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzedp zzc;
    private zzclm zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdk zzh;
    private boolean zzi;

    zzeea(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzq(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkv)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
            try {
                zzdkVar.zze(zzfmy.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdkVar.zze(zzfmy.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzky)).intValue()) {
                return true;
            }
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector cannot be opened because it is already open.");
        try {
            zzdkVar.zze(zzfmy.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcni
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzn();
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector failed to load.");
        try {
            zzcfv zzh = com.google.android.gms.ads.internal.zzt.zzh();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            zzh.zzh(new Exception(sb.toString()), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzh;
            if (zzdkVar != null) {
                zzdkVar.zze(zzfmy.zzd(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdV() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdW(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzh;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zze(null);
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

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        this.zzf = true;
        zzn();
    }

    public final void zzl(zzedp zzedpVar) {
        this.zzc = zzedpVar;
    }

    public final synchronized void zzm(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbrd zzbrdVar, zzbqw zzbqwVar, zzbqi zzbqiVar) {
        if (zzq(zzdkVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzclm zza = zzcmc.zza(this.zza, zzcnw.zzb(), "", false, false, null, null, this.zzb, null, null, null, zzbif.zza(), null, null, null, null, null);
                this.zzd = zza;
                zzcnk zzP = zza.zzP();
                if (zzP == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdkVar.zze(zzfmy.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = zzdkVar;
                Context context = this.zza;
                zzP.zzab(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbrdVar, null, new zzbrc(context), zzbqwVar, zzbqiVar, null, null, null, null, null);
                zzP.zzG(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkw));
                com.google.android.gms.ads.internal.zzt.zzb();
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            } catch (zzcmb e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to obtain a web view for the ad inspector", e2);
                try {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "InspectorUi.openInspector 0");
                    zzdkVar.zze(zzfmy.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzn() {
        if (this.zze && this.zzf) {
            zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeea.this.zzp();
                }
            });
        }
    }

    @Nullable
    public final Activity zzo() {
        zzclm zzclmVar = this.zzd;
        if (zzclmVar == null || zzclmVar.zzX()) {
            return null;
        }
        return this.zzd.zzj();
    }

    final /* synthetic */ void zzp() {
        this.zzd.zzc("window.inspectorInfo", this.zzc.zzr().toString());
    }
}
