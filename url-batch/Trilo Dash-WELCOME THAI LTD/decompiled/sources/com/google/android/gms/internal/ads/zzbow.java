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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzbow implements zzbol {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdwg zzb;
    private final zzfgo zzc;
    private final zzbwo zze;
    private final zzeen zzf;
    private com.google.android.gms.ads.internal.overlay.zzu zzg = null;
    private final zzcfn zzd = new zzcfn(null);

    public zzbow(com.google.android.gms.ads.internal.zzb zzbVar, zzbwo zzbwoVar, zzeen zzeenVar, zzdwg zzdwgVar, zzfgo zzfgoVar) {
        this.zza = zzbVar;
        this.zze = zzbwoVar;
        this.zzf = zzeenVar;
        this.zzb = zzdwgVar;
        this.zzc = zzfgoVar;
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

    static Uri zzc(Context context, zzaoc zzaocVar, Uri uri, View view, Activity activity) {
        if (zzaocVar == null) {
            return uri;
        }
        try {
            return zzaocVar.zze(uri) ? zzaocVar.zza(uri, context, view, activity) : uri;
        } catch (zzaod unused) {
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
    
        if (com.google.android.gms.internal.ads.zzbov.zzc(r11, r5, r6, r7) == null) goto L28;
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
        zzcli zzcliVar = (zzcli) zzaVar;
        Context context = zzcliVar.getContext();
        zzaoc zzK = zzcliVar.zzK();
        View zzH = zzcliVar.zzH();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent = null;
        Uri build = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri zzd = zzd(zzc(context, zzK, Uri.parse(str2), zzH, null));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdz)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(zzd.getScheme())) {
                build = zzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(zzd.getScheme())) {
                build = zzd.buildUpon().scheme("http").build();
            }
            ArrayList arrayList = new ArrayList();
            Intent zza = zzbov.zza(zzd, context, zzK, zzH);
            Intent zza2 = zzbov.zza(build, context, zzK, zzH);
            if (z3) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, zza);
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzm(context, zza2);
            }
            ResolveInfo zzd2 = zzbov.zzd(zza, arrayList, context, zzK, zzH);
            if (zzd2 != null) {
                intent = zzbov.zzb(zza, zzd2, context, zzK, zzH);
            } else {
                if (zza2 != null && (zzc = zzbov.zzc(zza2, context, zzK, zzH)) != null) {
                    intent = zzbov.zzb(zza, zzc, context, zzK, zzH);
                }
                if (arrayList.size() != 0) {
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
                            intent = zzbov.zzb(zza, resolveInfo, context, zzK, zzH);
                            break loop0;
                        }
                    }
                    if (parseBoolean) {
                        intent = zzbov.zzb(zza, (ResolveInfo) arrayList.get(0), context, zzK, zzH);
                    }
                }
                intent = zza;
            }
        }
        if (!z || this.zzf == null || intent == null || !zzj(zzaVar, zzcliVar.getContext(), intent.getData().toString(), str)) {
            try {
                ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z2);
            } catch (ActivityNotFoundException e) {
                com.google.android.gms.ads.internal.util.zze.zzj(e.getMessage());
            }
        }
    }

    private final void zzi(boolean z) {
        zzbwo zzbwoVar = this.zze;
        if (zzbwoVar != null) {
            zzbwoVar.zza(z);
        }
    }

    private final boolean zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        boolean zzv = com.google.android.gms.ads.internal.zzt.zzo().zzv(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(context);
        zzdwg zzdwgVar = this.zzb;
        if (zzdwgVar != null) {
            zzeev.zzc(context, zzdwgVar, this.zzc, this.zzf, str2, "offline_open");
        }
        zzcli zzcliVar = (zzcli) zzaVar;
        boolean z = zzcliVar.zzQ().zzi() && zzcliVar.zzk() == null;
        if (zzv) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (NotificationManagerCompat.from(context).areNotificationsEnabled() && zzw != null && !z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgX)).booleanValue()) {
                if (zzcliVar.zzQ().zzi()) {
                    zzeev.zzh(zzcliVar.zzk(), null, zzw, this.zzf, this.zzb, this.zzc, str2, str);
                } else {
                    ((zzcmn) zzaVar).zzaG(zzw, this.zzf, this.zzb, this.zzc, str2, str, 14);
                }
                zzdwg zzdwgVar2 = this.zzb;
                if (zzdwgVar2 != null) {
                    zzeev.zzc(context, zzdwgVar2, this.zzc, this.zzf, str2, "dialog_impression");
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
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgX)).booleanValue()) {
                    hashMap.put("dialog_not_shown_reason", "notification_flow_disabled");
                } else if (z) {
                    hashMap.put("dialog_not_shown_reason", "fullscreen_no_activity");
                }
            }
            zzeev.zzd(context, this.zzb, this.zzc, this.zzf, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(int i) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgo zzfgoVar = this.zzc;
            zzfgn zzb = zzfgn.zzb("cct_action");
            zzb.zza("cct_open_status", zzbiv.zza(i));
            zzfgoVar.zzb(zzb);
            return;
        }
        zzdwf zza = this.zzb.zza();
        zza.zzb("action", "cct_action");
        zza.zzb("cct_open_status", zzbiv.zza(i));
        zza.zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035b  */
    @Override // com.google.android.gms.internal.ads.zzbol
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
        zzcli zzcliVar = (zzcli) zzaVar;
        String zzc = zzcdp.zzc((String) map.get("u"), zzcliVar.getContext(), true);
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
        zzfbg zzF = zzcliVar.zzF();
        zzfbj zzR = zzcliVar.zzR();
        boolean z3 = false;
        if (zzF == null || zzR == null) {
            str = "";
            z = false;
        } else {
            z = zzF.zzak;
            str = zzR.zzb;
        }
        boolean z4 = (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzid)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str3)) {
            if (zzcliVar.zzaC()) {
                com.google.android.gms.ads.internal.util.zze.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzi(false);
                ((zzcmn) zzaVar).zzaH(zzf(map), zzb(map), z4);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str3)) {
            zzi(false);
            if (zzc != null) {
                ((zzcmn) zzaVar).zzaI(zzf(map), zzb(map), zzc, z4);
                return;
            } else {
                ((zzcmn) zzaVar).zzaJ(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z4);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str3)) {
            Context context = zzcliVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdB)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdH)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdF)).booleanValue()) {
                        String str4 = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdG);
                        if (!str4.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator it = zzfpe.zzc(zzfof.zzc(';')).zzd(str4).iterator();
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
            boolean zzg = zzbiw.zzg(zzcliVar.getContext());
            if (z3) {
                if (zzg) {
                    zzi(true);
                    if (TextUtils.isEmpty(zzc)) {
                        com.google.android.gms.ads.internal.util.zze.zzj("Cannot open browser with null or empty url");
                        zzk(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), Uri.parse(zzc), zzcliVar.zzH(), zzcliVar.zzk()));
                    if (z && this.zzf != null && zzj(zzaVar, zzcliVar.getContext(), zzd.toString(), str)) {
                        return;
                    }
                    this.zzg = new zzbot(this);
                    ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z4);
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
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgP)).booleanValue()) {
                zzi(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Package name missing from open app action.");
                    return;
                }
                if (z && this.zzf != null && zzj(zzaVar, zzcliVar.getContext(), str5, str)) {
                    return;
                }
                PackageManager packageManager = zzcliVar.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z4);
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
                Uri zzd2 = zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), data, zzcliVar.zzH(), zzcliVar.zzk()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgQ)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                        z2 = !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhb)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id");
                        HashMap hashMap2 = new HashMap();
                        if (z2) {
                            hashMap = hashMap2;
                            obj2 = obj;
                            str2 = zzc;
                            this.zzg = new zzbou(this, z4, zzaVar, hashMap2, map);
                            z4 = false;
                        } else {
                            hashMap = hashMap2;
                            obj2 = obj;
                            str2 = zzc;
                        }
                        if (intent2 != null) {
                            if (!z || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), intent2.getData().toString(), str)) {
                                ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z4);
                                return;
                            } else {
                                if (z2) {
                                    HashMap hashMap3 = hashMap;
                                    hashMap3.put((String) map.get("event_id"), true);
                                    ((zzbrc) zzaVar).zzd("openIntentAsync", hashMap3);
                                    return;
                                }
                                return;
                            }
                        }
                        HashMap hashMap4 = hashMap;
                        String uri = !TextUtils.isEmpty(str2) ? zzd(zzc(zzcliVar.getContext(), zzcliVar.zzK(), Uri.parse(str2), zzcliVar.zzH(), zzcliVar.zzk())).toString() : str2;
                        if (!z || this.zzf == null || !zzj(zzaVar, zzcliVar.getContext(), uri, str)) {
                            ((zzcmn) zzaVar).zzaF(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri, (String) map.get("m"), (String) map.get(obj2), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z4);
                            return;
                        } else {
                            if (z2) {
                                hashMap4.put((String) map.get("event_id"), true);
                                ((zzbrc) zzaVar).zzd("openIntentAsync", hashMap4);
                                return;
                            }
                            return;
                        }
                    }
                }
                intent2.setData(zzd2);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhb)).booleanValue()) {
                }
                HashMap hashMap22 = new HashMap();
                if (z2) {
                }
                if (intent2 != null) {
                }
            }
        }
        obj = "p";
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhb)).booleanValue()) {
        }
        HashMap hashMap222 = new HashMap();
        if (z2) {
        }
        if (intent2 != null) {
        }
    }
}
