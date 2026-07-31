package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.O6;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdzo implements zzdir, com.google.android.gms.ads.internal.client.zza, zzdej, zzddt, zzdgk {
    private final Context zzc;
    private final zzfmp zzd;
    private final zzeaj zze;
    private final zzflo zzf;
    private final zzfld zzg;
    private final zzele zzh;
    private final String zzi;

    @Nullable
    private Boolean zzk;
    private long zzj = -1;

    @VisibleForTesting
    final AtomicBoolean zza = new AtomicBoolean(false);

    @VisibleForTesting
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhS)).booleanValue();

    public zzdzo(Context context, zzfmp zzfmpVar, zzeaj zzeajVar, zzflo zzfloVar, zzfld zzfldVar, zzele zzeleVar, String str) {
        this.zzc = context;
        this.zzd = zzfmpVar;
        this.zze = zzeajVar;
        this.zzf = zzfloVar;
        this.zzg = zzfldVar;
        this.zzh = zzeleVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String str;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcj);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzr(this.zzc);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(z);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzeai zzg(String str) {
        zzflo zzfloVar = this.zzf;
        zzfln zzflnVar = zzfloVar.zzb;
        zzeai zza = this.zze.zza();
        zza.zza(zzflnVar.zzb);
        zzfld zzfldVar = this.zzg;
        zza.zzb(zzfldVar);
        zza.zzc("action", str);
        zza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfldVar.zzt;
        if (!list.isEmpty()) {
            zza.zzc("ancn", (String) list.get(0));
        }
        if (zzfldVar.zzb()) {
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzt(this.zzc) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhZ)).booleanValue()) {
            boolean zza2 = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzfloVar);
            zza.zzc("scar", String.valueOf(zza2));
            if (zza2) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfloVar.zza.zza.zzd;
                zza.zzc("ragent", zzmVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zzi(zzeai zzeaiVar) {
        if (!this.zzg.zzb()) {
            zzeaiVar.zzd();
            return;
        }
        this.zzh.zze(new zzelg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzeaiVar.zzg(), 2));
    }

    private final boolean zzj() {
        int i = this.zzg.zzb;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzeai zzg = zzg("ifts");
            zzg.zzc("reason", O6.G1);
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzg.zzc("arec", String.valueOf(i));
            }
            String zza = this.zzd.zza(str);
            if (zza != null) {
                zzg.zzc("areec", zza);
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzd(zzdol zzdolVar) {
        if (this.zzl) {
            zzeai zzg = zzg("ifts");
            zzg.zzc("reason", TelemetryCategory.EXCEPTION);
            if (!TextUtils.isEmpty(zzdolVar.getMessage())) {
                zzg.zzc("msg", zzdolVar.getMessage());
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdH() {
        if (zzf()) {
            zzeai zzg = zzg("adapter_impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzg.zzc("po", "1");
                zzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzg.zzc("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpr)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true != this.zza.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzps)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "1" : "0");
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzdI() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzeai zzg = zzg("impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpr)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc("foreground", true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc) ? "1" : "0");
                zzg.zzc("fg_show", true == this.zza.get() ? "1" : "0");
            }
            zzi(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zze() {
        if (this.zzl) {
            zzeai zzg = zzg("ifts");
            zzg.zzc("reason", "blocked");
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzeai zzg = zzg("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpr)).booleanValue() && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzJ(this.zzc));
                zzg.zzc("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzps)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? "0" : "1");
            }
            zzg.zzd();
        }
    }
}
