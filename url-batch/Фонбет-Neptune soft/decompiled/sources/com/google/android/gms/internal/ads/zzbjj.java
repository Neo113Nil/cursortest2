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
import androidx.webkit.ProxyConfig;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbjj implements zzbix {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdsk zzb;
    private final zzbrk zzd;
    private final zzedh zze;
    private final zzcni zzf;
    private com.google.android.gms.ads.internal.overlay.zzy zzg = null;
    private final zzgcu zzh = zzbzo.zzf;
    private final com.google.android.gms.ads.internal.util.client.zzr zzc = new com.google.android.gms.ads.internal.util.client.zzr(null);

    public zzbjj(com.google.android.gms.ads.internal.zzb zzbVar, zzbrk zzbrkVar, zzedh zzedhVar, zzdsk zzdskVar, zzcni zzcniVar) {
        this.zza = zzbVar;
        this.zzd = zzbrkVar;
        this.zze = zzedhVar;
        this.zzb = zzdskVar;
        this.zzf = zzcniVar;
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

    static Uri zzc(Context context, zzauo zzauoVar, Uri uri, View view, Activity activity, zzffk zzffkVar) {
        if (zzauoVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzla)).booleanValue() || zzffkVar == null) {
                if (zzauoVar.zze(uri)) {
                    uri = zzauoVar.zza(uri, context, view, activity);
                }
            } else if (zzauoVar.zze(uri)) {
                uri = zzffkVar.zza(uri, context, view, activity);
            }
        } catch (zzaup unused) {
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        HashMap hashMap;
        Object obj;
        Object obj2;
        boolean z2;
        zzcej zzcejVar = (zzcej) zzaVar;
        zzfel zzD = zzcejVar.zzD();
        zzfeo zzR = zzcejVar.zzR();
        boolean z3 = false;
        if (zzD == null || zzR == null) {
            str3 = "";
            z = false;
        } else {
            String str4 = zzR.zzb;
            z = zzD.zzai;
            str3 = str4;
        }
        boolean z4 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjP)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzlM)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcejVar.zzaF()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcft) zzaVar).zzaL(zzf(map), zzb(map), z4);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzkV)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1")) {
                z3 = true;
            }
            if (str != null) {
                ((zzcft) zzaVar).zzaN(zzf(map), zzb(map), str, z4, z3);
                return;
            } else {
                ((zzcft) zzaVar).zzaM(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z4);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            zzcejVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeb)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzef)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    z3 = true;
                }
            }
            boolean zzg = zzbct.zzg(zzcejVar.getContext());
            if (z3) {
                if (zzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcejVar.getContext(), zzcejVar.zzI(), Uri.parse(str), zzcejVar.zzF(), zzcejVar.zzi(), zzcejVar.zzS()));
                    if (z && this.zze != null && zzl(zzaVar, zzcejVar.getContext(), zzd.toString(), str3)) {
                        return;
                    }
                    this.zzg = new zzbjg(this);
                    ((zzcft) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z4, z5);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, z, str3, z4, z5);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z, str3, z4, z5);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzht)).booleanValue()) {
                zzk(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Package name missing from open app action.");
                    return;
                }
                if (z && this.zze != null && zzl(zzaVar, zzcejVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzcejVar.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzcft) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z4, z5);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str6 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str6)) {
            try {
                intent = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zzd2 = zzd(zzc(zzcejVar.getContext(), zzcejVar.zzI(), data, zzcejVar.zzF(), zzcejVar.zzi(), zzcejVar.zzS()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhu)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                    }
                }
                intent2.setData(zzd2);
            }
        }
        boolean z6 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhM)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap hashMap2 = new HashMap();
        if (z6) {
            hashMap = hashMap2;
            obj2 = "p";
            obj = "event_id";
            this.zzg = new zzbjh(this, z4, zzaVar, hashMap, map);
            z2 = false;
        } else {
            hashMap = hashMap2;
            obj = "event_id";
            obj2 = "p";
            z2 = z4;
        }
        if (intent2 != null) {
            if (!z || this.zze == null || !zzl(zzaVar, zzcejVar.getContext(), intent2.getData().toString(), str3)) {
                ((zzcft) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzg), z2, z5);
                return;
            } else {
                if (z6) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get(obj), true);
                    ((zzbls) zzaVar).zzd("openIntentAsync", hashMap3);
                    return;
                }
                return;
            }
        }
        HashMap hashMap4 = hashMap;
        String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcejVar.getContext(), zzcejVar.zzI(), Uri.parse(str), zzcejVar.zzF(), zzcejVar.zzi(), zzcejVar.zzS())).toString() : str;
        if (!z || this.zze == null || !zzl(zzaVar, zzcejVar.getContext(), uri, str3)) {
            ((zzcft) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri, (String) map.get("m"), (String) map.get(obj2), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzg), z2, z5);
        } else if (z6) {
            hashMap4.put((String) map.get(obj), true);
            ((zzbls) zzaVar).zzd("openIntentAsync", hashMap4);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdsk zzdskVar = this.zzb;
        if (zzdskVar != null) {
            zzeds.zzd(context, zzdskVar, this.zze, str, "dialog_not_shown", zzfxu.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0105, code lost:
    
        if (com.google.android.gms.internal.ads.zzbji.zzc(r2, r11, r12, r13, r14) == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        r21 = r6;
        r10 = r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        Intent intent;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzc;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z4 = true;
        zzk(true);
        zzcej zzcejVar = (zzcej) zzaVar;
        Context context = zzcejVar.getContext();
        zzauo zzI = zzcejVar.zzI();
        View zzF = zzcejVar.zzF();
        zzffk zzS = zzcejVar.zzS();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent2 = null;
        Uri build = null;
        try {
            if (!TextUtils.isEmpty(str2)) {
                Uri zzd = zzd(zzc(context, zzI, Uri.parse(str2), zzF, null, zzS));
                boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
                boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
                if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdZ)).booleanValue()) {
                        z4 = false;
                    }
                }
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(zzd.getScheme())) {
                    build = zzd.buildUpon().scheme(ProxyConfig.MATCH_HTTPS).build();
                } else if (ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(zzd.getScheme())) {
                    build = zzd.buildUpon().scheme(ProxyConfig.MATCH_HTTP).build();
                }
                Uri uri = build;
                ArrayList arrayList = new ArrayList();
                Intent zza = zzbji.zza(zzd, context, zzI, zzF, zzS);
                Intent zza2 = zzbji.zza(uri, context, zzI, zzF, zzS);
                if (z4) {
                    com.google.android.gms.ads.internal.zzu.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzo(context, zza);
                    com.google.android.gms.ads.internal.zzu.zzp();
                    com.google.android.gms.ads.internal.util.zzt.zzo(context, zza2);
                }
                ArrayList arrayList2 = arrayList;
                ResolveInfo zzd2 = zzbji.zzd(zza, arrayList, context, zzI, zzF, zzS);
                if (zzd2 == null) {
                    if (zza2 != null && (zzc = zzbji.zzc(zza2, context, zzI, zzF, zzS)) != null) {
                        intent = zzbji.zzb(zza, zzc, context, zzI, zzF, zzS);
                    }
                    if (!arrayList2.isEmpty()) {
                        if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                            int size = arrayList2.size();
                            int i = 0;
                            loop0: while (i < size) {
                                ArrayList arrayList3 = arrayList2;
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList3.get(i);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                do {
                                    int i2 = i + 1;
                                    if (it.hasNext()) {
                                    }
                                } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                                intent2 = zzbji.zzb(zza, resolveInfo, context, zzI, zzF, zzS);
                                break loop0;
                            }
                        }
                        ArrayList arrayList4 = arrayList2;
                        if (parseBoolean) {
                            intent2 = zzbji.zzb(zza, (ResolveInfo) arrayList4.get(0), context, zzI, zzF, zzS);
                        }
                    }
                    intent = zza;
                    if (z || this.zze == null || intent == null) {
                        zzaVar2 = zzaVar;
                    } else {
                        zzaVar2 = zzaVar;
                        if (zzl(zzaVar2, zzcejVar.getContext(), intent.getData().toString(), str)) {
                            return;
                        }
                    }
                    ((zzcft) zzaVar2).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z2, z3);
                    return;
                }
                intent2 = zzbji.zzb(zza, zzd2, context, zzI, zzF, zzS);
            }
            ((zzcft) zzaVar2).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z2, z3);
            return;
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
            return;
        }
        intent = intent2;
        if (z) {
        }
        zzaVar2 = zzaVar;
    }

    private final void zzk(boolean z) {
        zzbrk zzbrkVar = this.zzd;
        if (zzbrkVar != null) {
            zzbrkVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzhE)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbbw.zzhD)).booleanValue()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        zzbst zzbstVar;
        zzdsk zzdskVar = this.zzb;
        if (zzdskVar != null) {
            zzeds.zzc(context, zzdskVar, this.zze, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzu.zzo().zzA(context)) {
            this.zze.zzh(this.zzc, str2);
            return false;
        }
        zzcej zzcejVar = (zzcej) zzaVar;
        zzfel zzD = zzcejVar.zzD();
        boolean z = (zzD == null || (zzbstVar = zzD.zzad) == null || !zzbstVar.zza || zzbstVar.zzb == null || !zzbstVar.zzc) ? false : true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhJ)).booleanValue() && z) {
            zzdsk zzdskVar2 = this.zzb;
            if (zzdskVar2 != null) {
                zzeds.zzc(context, zzdskVar2, this.zze, str2, "onfs");
            }
            return false;
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzz = com.google.android.gms.ads.internal.util.zzt.zzz(context);
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean areNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
        boolean zzi = com.google.android.gms.ads.internal.zzu.zzq().zzi(context, "offline_notification_channel");
        boolean z2 = zzcejVar.zzO().zzi() && zzcejVar.zzi() == null;
        if (!areNotificationsEnabled) {
            com.google.android.gms.ads.internal.zzu.zzp();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            }
            zzi(context, str2, "notifications_disabled");
            return false;
        }
        if (zzi) {
            zzi(context, str2, "notification_channel_disabled");
            return false;
        }
        if (zzz == null) {
            zzi(context, str2, "work_manager_unavailable");
            return false;
        }
        if (z2) {
            zzi(context, str2, "ad_no_activity");
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhB)).booleanValue()) {
            zzi(context, str2, "notification_flow_disabled");
            return false;
        }
        if (zzcejVar.zzL() == null || zzcejVar.zzi() == null) {
            ((zzcft) zzaVar).zzaK(str2, str, 14);
        } else {
            zzedt zze = zzedu.zze();
            zze.zza(zzcejVar.zzi());
            zze.zzb(null);
            zze.zzc(str2);
            zze.zzd(str);
            try {
                zzcejVar.zzL().zzf(zze.zze());
            } catch (Exception e) {
                zzi(context, str2, e.getMessage());
                return false;
            }
        }
        zzaVar.onAdClicked();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        String str;
        zzdsk zzdskVar = this.zzb;
        if (zzdskVar == null) {
            return;
        }
        zzdsj zza = zzdskVar.zza();
        zza.zzb("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            default:
                str = "WRONG_EXP_SETUP";
                break;
        }
        zza.zzb("cct_open_status", str);
        zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcej zzcejVar = (zzcej) zzaVar;
        if (zzcejVar.zzD() != null) {
            hashMap = zzcejVar.zzD().zzaw;
        }
        String zzc = zzbyc.zzc(str, zzcejVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            zzgcj.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzjg)).booleanValue() && this.zzf != null && zzcni.zzj(zzc)) ? this.zzf.zzb(zzc, com.google.android.gms.ads.internal.client.zzay.zze()) : zzgcj.zzh(zzc), new zzbjf(this, map, zzaVar, str2), this.zzh);
        } else {
            this.zza.zzb(zzc);
        }
    }
}
