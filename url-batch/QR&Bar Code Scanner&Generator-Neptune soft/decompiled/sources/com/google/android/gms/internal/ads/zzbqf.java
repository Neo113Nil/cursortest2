package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzbqf implements zzbpu {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdxq zzb;
    private final zzfir zzc;
    private final zzbxz zze;
    private final zzego zzf;
    private com.google.android.gms.ads.internal.overlay.zzx zzg = null;
    private final zzcgu zzd = new zzcgu(null);

    public zzbqf(com.google.android.gms.ads.internal.zzb zzbVar, zzbxz zzbxzVar, zzego zzegoVar, zzdxq zzdxqVar, zzfir zzfirVar) {
        this.zza = zzbVar;
        this.zze = zzbxzVar;
        this.zzf = zzegoVar;
        this.zzb = zzdxqVar;
        this.zzc = zzfirVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzape zzapeVar, Uri uri, View view, Activity activity) {
        if (zzapeVar == null) {
            return uri;
        }
        try {
            return zzapeVar.zze(uri) ? zzapeVar.zza(uri, context, view, activity) : uri;
        } catch (zzapf unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:
    
        if (com.google.android.gms.internal.ads.zzbqe.zzc(r11, r5, r6, r7) == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        r11 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzc;
        boolean z3 = true;
        zzi(true);
        zzcmp zzcmpVar = (zzcmp) zzaVar;
        Context context = zzcmpVar.getContext();
        zzape zzK = zzcmpVar.zzK();
        View zzH = zzcmpVar.zzH();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent = null;
        Uri build = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri zzd = zzd(zzc(context, zzK, Uri.parse(str2), zzH, null));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdF)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(zzd.getScheme())) {
                build = zzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(zzd.getScheme())) {
                build = zzd.buildUpon().scheme("http").build();
            }
            ArrayList arrayList = new ArrayList();
            Intent zza = zzbqe.zza(zzd, context, zzK, zzH);
            Intent zza2 = zzbqe.zza(build, context, zzK, zzH);
            if (z3) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, zza);
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, zza2);
            }
            ResolveInfo zzd2 = zzbqe.zzd(zza, arrayList, context, zzK, zzH);
            if (zzd2 != null) {
                intent = zzbqe.zzb(zza, zzd2, context, zzK, zzH);
            } else {
                if (zza2 != null && (zzc = zzbqe.zzc(zza2, context, zzK, zzH)) != null) {
                    intent = zzbqe.zzb(zza, zzc, context, zzK, zzH);
                }
                if (!arrayList.isEmpty()) {
                    if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        int size = arrayList.size();
                        int i = 0;
                        loop0: while (i < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            do {
                                int i2 = i + 1;
                                if (it.hasNext()) {
                                }
                            } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                            intent = zzbqe.zzb(zza, resolveInfo, context, zzK, zzH);
                            break loop0;
                        }
                    }
                    if (parseBoolean) {
                        intent = zzbqe.zzb(zza, (ResolveInfo) arrayList.get(0), context, zzK, zzH);
                    }
                }
                intent = zza;
            }
        }
        if (!z || this.zzf == null || intent == null || !zzj(zzaVar, zzcmpVar.getContext(), intent.getData().toString(), str)) {
            try {
                ((zzcnu) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z2);
            } catch (ActivityNotFoundException e) {
                com.google.android.gms.ads.internal.util.zze.zzj(e.getMessage());
            }
        }
    }

    private final void zzi(boolean z) {
        zzbxz zzbxzVar = this.zze;
        if (zzbxzVar != null) {
            zzbxzVar.zza(z);
        }
    }

    private final boolean zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        boolean zzv = com.google.android.gms.ads.internal.zzt.zzo().zzv(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
        zzdxq zzdxqVar = this.zzb;
        if (zzdxqVar != null) {
            zzegw.zzc(context, zzdxqVar, this.zzc, this.zzf, str2, "offline_open");
        }
        zzcmp zzcmpVar = (zzcmp) zzaVar;
        boolean z = zzcmpVar.zzQ().zzi() && zzcmpVar.zzk() == null;
        if (zzv) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (NotificationManagerCompat.from(context).areNotificationsEnabled() && zzw != null && !z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhk)).booleanValue()) {
                if (zzcmpVar.zzQ().zzi()) {
                    zzegw.zzh(zzcmpVar.zzk(), null, zzw, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    ((zzcnu) zzaVar).zzaG(zzw, this.zzf, this.zzb, this.zzc, str2, str, 14);
                }
                zzdxq zzdxqVar2 = this.zzb;
                if (zzdxqVar2 != null) {
                    zzegw.zzc(context, zzdxqVar2, this.zzc, this.zzf, str2, "dialog_impression");
                }
                zzaVar.onAdClicked();
                return true;
            }
        }
        this.zzf.zzc(str2);
        if (this.zzb != null) {
            HashMap hashMap = new HashMap();
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                hashMap.put("dialog_not_shown_reason", "notifications_disabled");
            } else if (zzw == null) {
                hashMap.put("dialog_not_shown_reason", "work_manager_unavailable");
            } else {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhk)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzegw.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhs)).booleanValue()) {
            zzfir zzfirVar = this.zzc;
            zzfiq zzb = zzfiq.zzb("cct_action");
            zzb.zza("cct_open_status", zzbjz.zza(i));
            zzfirVar.zzb(zzb);
            return;
        }
        zzdxp zza = this.zzb.zza();
        zza.zzb("action", "cct_action");
        zza.zzb("cct_open_status", zzbjz.zza(i));
        zza.zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035b  */
    @Override // com.google.android.gms.internal.ads.zzbpu
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(com.google.android.gms.ads.internal.client.zza zzaVar, Map map) {
        String str;
        boolean z;
        Object obj;
        boolean z2;
        HashMap hashMap;
        Object obj2;
        String str2;
        zzcmp zzcmpVar = (zzcmp) zzaVar;
        String zzc = zzcew.zzc((String) map.get("u"), zzcmpVar.getContext(), true);
        String str3 = (String) map.get("a");
        if (str3 == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(zzc);
            return;
        }
        zzfdk zzF = zzcmpVar.zzF();
        zzfdn zzR = zzcmpVar.zzR();
        boolean z3 = false;
        if (zzF == null || zzR == null) {
            str = "";
            z = false;
        } else {
            z = zzF.zzak;
            str = zzR.zzb;
        }
        boolean z4 = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziu)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str3)) {
            if (zzcmpVar.zzaC()) {
                com.google.android.gms.ads.internal.util.zze.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzi(false);
                ((zzcnu) zzaVar).zzaH(zzf(map), zzb(map), z4);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str3)) {
            zzi(false);
            if (zzc != null) {
                ((zzcnu) zzaVar).zzaI(zzf(map), zzb(map), zzc, z4);
                return;
            } else {
                ((zzcnu) zzaVar).zzaJ(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z4);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str3)) {
            Context context = zzcmpVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdH)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdN)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdL)).booleanValue()) {
                        String str4 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdM);
                        if (!str4.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator it = zzftk.zzc(zzfsj.zzc(';')).zzd(str4).iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equals(packageName)) {
                                }
                            }
                        }
                    }
                    z3 = true;
                    break;
                }
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
            }
            boolean zzg = zzbka.zzg(zzcmpVar.getContext());
            if (z3) {
                if (zzg) {
                    zzi(true);
                    if (TextUtils.isEmpty(zzc)) {
                        com.google.android.gms.ads.internal.util.zze.zzj("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcmpVar.getContext(), zzcmpVar.zzK(), Uri.parse(zzc), zzcmpVar.zzH(), zzcmpVar.zzk()));
                    if (z && this.zzf != null && zzj(zzaVar, zzcmpVar.getContext(), zzd.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbqc(this);
                    ((zzcnu) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z4);
                    return;
                }
                zzk(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzh(zzaVar, map, z, str, z4);
            return;
        }
        if ("app".equalsIgnoreCase(str3) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzh(zzaVar, map, z, str, z4);
            return;
        }
        if ("open_app".equalsIgnoreCase(str3)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhc)).booleanValue()) {
                zzi(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Package name missing from open app action.");
                    return;
                }
                if (z && this.zzf != null && zzj(zzaVar, zzcmpVar.getContext(), str5, str)) {
                    return;
                }
                PackageManager packageManager = zzcmpVar.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzcnu) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z4);
                    return;
                }
                return;
            }
            return;
        }
        zzi(true);
        String str6 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                intent = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                obj = "p";
                Uri zzd2 = zzd(zzc(zzcmpVar.getContext(), zzcmpVar.zzK(), data, zzcmpVar.zzH(), zzcmpVar.zzk()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhd)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                        z2 = !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzho)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id");
                        HashMap hashMap2 = new HashMap();
                        if (z2) {
                            hashMap = hashMap2;
                            obj2 = obj;
                            str2 = zzc;
                            this.zzg = new zzbqd(this, z4, zzaVar, hashMap2, map);
                            z4 = false;
                        } else {
                            hashMap = hashMap2;
                            obj2 = obj;
                            str2 = zzc;
                        }
                        if (intent2 != null) {
                            if (!z || this.zzf == null || !zzj(zzaVar, zzcmpVar.getContext(), intent2.getData().toString(), str)) {
                                ((zzcnu) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z4);
                                return;
                            } else {
                                if (z2) {
                                    HashMap hashMap3 = hashMap;
                                    hashMap3.put((String) map.get("event_id"), true);
                                    ((zzbsn) zzaVar).zzd("openIntentAsync", hashMap3);
                                    return;
                                }
                                return;
                            }
                        }
                        HashMap hashMap4 = hashMap;
                        String uri = !TextUtils.isEmpty(str2) ? zzd(zzc(zzcmpVar.getContext(), zzcmpVar.zzK(), Uri.parse(str2), zzcmpVar.zzH(), zzcmpVar.zzk())).toString() : str2;
                        if (!z || this.zzf == null || !zzj(zzaVar, zzcmpVar.getContext(), uri, str)) {
                            ((zzcnu) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri, (String) map.get("m"), (String) map.get(obj2), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z4);
                            return;
                        } else {
                            if (z2) {
                                hashMap4.put((String) map.get("event_id"), true);
                                ((zzbsn) zzaVar).zzd("openIntentAsync", hashMap4);
                                return;
                            }
                            return;
                        }
                    }
                }
                intent2.setData(zzd2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzho)).booleanValue()) {
                }
                HashMap hashMap22 = new HashMap();
                if (z2) {
                }
                if (intent2 != null) {
                }
            }
        }
        obj = "p";
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzho)).booleanValue()) {
        }
        HashMap hashMap222 = new HashMap();
        if (z2) {
        }
        if (intent2 != null) {
        }
    }
}
