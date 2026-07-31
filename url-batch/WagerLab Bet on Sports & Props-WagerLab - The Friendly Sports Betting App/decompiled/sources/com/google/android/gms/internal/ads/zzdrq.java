package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.media3.exoplayer.offline.DownloadService;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdrq implements zzdau, com.google.android.gms.ads.internal.client.zza, zzcwm, zzcvw, zzcyn {
    private final Context zzc;
    private final zzfdv zzd;
    private final zzdsm zze;
    private final zzfcu zzf;
    private final zzfcj zzg;
    private final zzecn zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhj)).booleanValue();

    public zzdrq(Context context, zzfdv zzfdvVar, zzdsm zzdsmVar, zzfcu zzfcuVar, zzfcj zzfcjVar, zzecn zzecnVar, String str) {
        this.zzc = context;
        this.zzd = zzfdvVar;
        this.zze = zzdsmVar;
        this.zzf = zzfcuVar;
        this.zzg = zzfcjVar;
        this.zzh = zzecnVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String str;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbG);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzt(this.zzc);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(z);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdsl zzg(String str) {
        zzfcu zzfcuVar = this.zzf;
        zzfct zzfctVar = zzfcuVar.zzb;
        zzdsl zza = this.zze.zza();
        zza.zza(zzfctVar.zzb);
        zzfcj zzfcjVar = this.zzg;
        zza.zzb(zzfcjVar);
        zza.zzc("action", str);
        zza.zzc(FirebaseAnalytics.Param.AD_FORMAT, this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfcjVar.zzt;
        if (!list.isEmpty()) {
            zza.zzc("ancn", (String) list.get(0));
        }
        if (zzfcjVar.zzb()) {
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().zzs(this.zzc) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            zza.zzc("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhq)).booleanValue()) {
            boolean zza2 = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(zzfcuVar);
            zza.zzc("scar", String.valueOf(zza2));
            if (zza2) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcuVar.zza.zza.zzd;
                zza.zzc("ragent", zzmVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zzi(zzdsl zzdslVar) {
        if (!this.zzg.zzb()) {
            zzdslVar.zzd();
            return;
        }
        this.zzh.zze(new zzecp(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), this.zzf.zzb.zzb.zzb, zzdslVar.zzg(), 2));
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

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzl) {
            zzdsl zzg = zzg("ifts");
            zzg.zzc("reason", "adapter");
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

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzd(zzdgo zzdgoVar) {
        if (this.zzl) {
            zzdsl zzg = zzg("ifts");
            zzg.zzc("reason", NotificationsService.EXCEPTION_KEY);
            if (!TextUtils.isEmpty(zzdgoVar.getMessage())) {
                zzg.zzc("msg", zzdgoVar.getMessage());
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdL() {
        if (zzf()) {
            zzdsl zzg = zzg("adapter_impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzg.zzc("po", "1");
                zzg.zzc("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            } else {
                zzg.zzc("po", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzok)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                zzg.zzc("fg_show", true != this.zza.get() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzol)).booleanValue() && zzj()) {
                zzg.zzc("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().zzf() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
            }
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdau
    public final void zzdM() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        if (zzf() || this.zzg.zzb()) {
            zzdsl zzg = zzg("impression");
            zzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                zzg.zzc("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzj));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzok)).booleanValue() && zzj()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                zzg.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
                zzg.zzc("fg_show", true != this.zza.get() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
            }
            zzi(zzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zze() {
        if (this.zzl) {
            zzdsl zzg = zzg("ifts");
            zzg.zzc("reason", "blocked");
            zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyn
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            this.zzj = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzdsl zzg = zzg("presentation");
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzok)).booleanValue();
            String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            if (booleanValue && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                com.google.android.gms.ads.internal.zzt.zzc();
                atomicBoolean.set(!com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc));
                zzg.zzc(DownloadService.KEY_FOREGROUND, true != atomicBoolean.get() ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzol)).booleanValue() && zzj()) {
                if (true == com.google.android.gms.ads.internal.zzt.zzg().zzf()) {
                    str = "1";
                }
                zzg.zzc("fg_al", str);
            }
            zzg.zzd();
        }
    }
}
