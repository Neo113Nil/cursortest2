package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzegw extends zzbyu {
    private final Context zza;
    private final zzdxq zzb;
    private final zzcgu zzc;
    private final zzego zzd;
    private final zzfir zze;

    public zzegw(Context context, zzego zzegoVar, zzcgu zzcguVar, zzdxq zzdxqVar, zzfir zzfirVar) {
        this.zza = context;
        this.zzb = zzdxqVar;
        this.zzc = zzcguVar;
        this.zzd = zzegoVar;
        this.zze = zzfirVar;
    }

    public static void zzc(Context context, zzdxq zzdxqVar, zzfir zzfirVar, zzego zzegoVar, String str, String str2) {
        zzd(context, zzdxqVar, zzfirVar, zzegoVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdxq zzdxqVar, zzfir zzfirVar, zzego zzegoVar, String str, String str2, Map map) {
        String zzf;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhs)).booleanValue()) {
            zzfiq zzb = zzfiq.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzo().zzv(context) ? CustomTabsCallback.ONLINE_EXTRAS_KEY : "offline");
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            zzf = zzfirVar.zza(zzb);
        } else {
            zzdxp zza = zzdxqVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", true == com.google.android.gms.ads.internal.zzt.zzo().zzv(context) ? CustomTabsCallback.ONLINE_EXTRAS_KEY : "offline");
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            zzf = zza.zzf();
        }
        zzegoVar.zzd(new zzegq(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), str, zzf, 2));
    }

    public static void zzh(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar, final com.google.android.gms.ads.internal.util.zzbr zzbrVar, final zzego zzegoVar, final zzdxq zzdxqVar, final zzfir zzfirVar, final String str, final String str2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzG = com.google.android.gms.ads.internal.util.zzs.zzG(activity);
        final Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        zzG.setTitle(zzd == null ? "Open ad when you're back online." : zzd.getString(R.string.offline_opt_in_title)).setMessage(zzd == null ? "We'll send you a notification with a link to the advertiser site." : zzd.getString(R.string.offline_opt_in_message)).setPositiveButton(zzd == null ? "OK" : zzd.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegs
            /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
            
                if (r0.zzf(com.google.android.gms.dynamic.ObjectWrapper.wrap(r10), r14, r13) == false) goto L11;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(DialogInterface dialogInterface, int i) {
                final com.google.android.gms.ads.internal.overlay.zzl zzlVar2;
                zzdxq zzdxqVar2 = zzdxq.this;
                Activity activity2 = activity;
                zzfir zzfirVar2 = zzfirVar;
                zzego zzegoVar2 = zzegoVar;
                String str3 = str;
                com.google.android.gms.ads.internal.util.zzbr zzbrVar2 = zzbrVar;
                String str4 = str2;
                Resources resources = zzd;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar3 = zzlVar;
                if (zzdxqVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "confirm");
                    zzlVar2 = zzlVar3;
                    zzegw.zzd(activity2, zzdxqVar2, zzfirVar2, zzegoVar2, str3, "dialog_click", hashMap);
                } else {
                    zzlVar2 = zzlVar3;
                }
                try {
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzh("Failed to schedule offline notification poster.", e);
                }
                zzegoVar2.zzc(str3);
                if (zzdxqVar2 != null) {
                    zzegw.zzc(activity2, zzdxqVar2, zzfirVar2, zzegoVar2, str3, "offline_notification_worker_not_scheduled");
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                AlertDialog.Builder zzG2 = com.google.android.gms.ads.internal.util.zzs.zzG(activity2);
                zzG2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegr
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        com.google.android.gms.ads.internal.overlay.zzl zzlVar4 = com.google.android.gms.ads.internal.overlay.zzl.this;
                        if (zzlVar4 != null) {
                            zzlVar4.zzb();
                        }
                    }
                });
                AlertDialog create = zzG2.create();
                create.show();
                Timer timer = new Timer();
                timer.schedule(new zzegv(create, timer, zzlVar2), 3000L);
            }
        }).setNegativeButton(zzd == null ? "No thanks" : zzd.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzego zzegoVar2 = zzego.this;
                String str3 = str;
                zzdxq zzdxqVar2 = zzdxqVar;
                Activity activity2 = activity;
                zzfir zzfirVar2 = zzfirVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzegoVar2.zzc(str3);
                if (zzdxqVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    zzegw.zzd(activity2, zzdxqVar2, zzfirVar2, zzegoVar2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegu
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzego zzegoVar2 = zzego.this;
                String str3 = str;
                zzdxq zzdxqVar2 = zzdxqVar;
                Activity activity2 = activity;
                zzfir zzfirVar2 = zzfirVar;
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = zzlVar;
                zzegoVar2.zzc(str3);
                if (zzdxqVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    zzegw.zzd(activity2, zzdxqVar2, zzfirVar2, zzegoVar2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        zzG.create().show();
    }

    private final void zzi(String str, String str2, Map map) {
        zzd(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzv = com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzv ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.zza;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzi(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (r8 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzego.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzf() {
        zzego zzegoVar = this.zzd;
        final zzcgu zzcguVar = this.zzc;
        zzegoVar.zze(new zzfhk() { // from class: com.google.android.gms.internal.ads.zzegk
            @Override // com.google.android.gms.internal.ads.zzfhk
            public final Object zza(Object obj) {
                zzego.zzb(zzcgu.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzg(context);
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        PendingIntent zza = zzfqd.zza(context, 0, intent, zzfqd.zza | BasicMeasure.EXACTLY, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent zza2 = zzfqd.zza(context, 0, intent2, zzfqd.zza | BasicMeasure.EXACTLY, 0);
        Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(zzd == null ? "View the ad you saved when you were offline" : zzd.getString(R.string.offline_notification_title)).setContentText(zzd == null ? "Tap to open ad" : zzd.getString(R.string.offline_notification_text)).setAutoCancel(true).setDeleteIntent(zza2).setContentIntent(zza).setSmallIcon(context.getApplicationInfo().icon).build());
        zzi(str2, "offline_notification_impression", new HashMap());
    }
}
