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
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeds extends zzbsf {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdsk zzc;
    private final com.google.android.gms.ads.internal.util.client.zzr zzd;
    private final zzedh zze;
    private String zzf;
    private String zzg;

    public zzeds(Context context, zzedh zzedhVar, com.google.android.gms.ads.internal.util.client.zzr zzrVar, zzdsk zzdskVar) {
        this.zzb = context;
        this.zzc = zzdskVar;
        this.zzd = zzrVar;
        this.zze = zzedhVar;
    }

    public static void zzc(Context context, zzdsk zzdskVar, zzedh zzedhVar, String str, String str2) {
        zzd(context, zzdskVar, zzedhVar, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdsk zzdskVar, zzedh zzedhVar, String str, String str2, Map map) {
        String str3;
        String str4 = true != com.google.android.gms.ads.internal.zzu.zzo().zzA(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdskVar != null) {
            zzdsj zza = zzdskVar.zza();
            zza.zzb("gqi", str);
            zza.zzb("action", str2);
            zza.zzb("device_connectivity", str4);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza.zze();
        } else {
            str3 = "";
        }
        zzedhVar.zzd(new zzedj(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), str, str3, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzfsg.zzb(context, 0, intent, zzfsg.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzfsg.zza(context, 0, intent, 201326592);
    }

    private final String zzs() {
        zzecz zzeczVar = (zzecz) this.zza.get(this.zzf);
        return zzeczVar == null ? "" : zzeczVar.zzb();
    }

    private static String zzt(int i, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        return zze == null ? str : zze.getString(i);
    }

    private final void zzu(String str, String str2, Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzv() {
        boolean z;
        try {
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzbr zzz = com.google.android.gms.ads.internal.util.zzt.zzz(this.zzb);
            IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
            String str = this.zzg;
            String str2 = this.zzf;
            zzecz zzeczVar = (zzecz) this.zza.get(str2);
            z = zzz.zzg(wrap, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, zzeczVar == null ? "" : zzeczVar.zzc()));
            if (!z) {
                try {
                    z = zzz.zzf(ObjectWrapper.wrap(this.zzb), this.zzg, this.zzf);
                } catch (RemoteException e) {
                    e = e;
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to schedule offline notification poster.", e);
                    if (z) {
                    }
                }
            }
        } catch (RemoteException e2) {
            e = e2;
            z = false;
        }
        if (z) {
            this.zze.zzc(this.zzf);
            zzu(this.zzf, "offline_notification_worker_not_scheduled", zzfxu.zzd());
        }
    }

    private final void zzw(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzu.zzp();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzv();
            zzx(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzu(this.zzf, "asnpdi", zzfxu.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(activity);
            zzK.setTitle(zzt(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzt(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedl
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzeds.this.zzk(activity, zzmVar, dialogInterface, i);
                }
            }).setNegativeButton(zzt(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedm
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzeds.this.zzl(zzmVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedn
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzeds.this.zzm(zzmVar, dialogInterface);
                }
            });
            zzK.create().show();
            zzu(this.zzf, "rtsdi", zzfxu.zzd());
        }
    }

    private final void zzx(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog create;
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzt.zzK(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = com.google.android.gms.ads.internal.overlay.zzm.this;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        int i = R.layout.offline_ads_dialog;
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        XmlResourceParser layout = zze == null ? null : zze.getLayout(i);
        if (layout == null) {
            onCancelListener.setMessage(zzt(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            create = onCancelListener.create();
        } else {
            View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzs = zzs();
            if (!zzs.isEmpty()) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzs);
            }
            zzecz zzeczVar = (zzecz) this.zza.get(this.zzf);
            Drawable zza = zzeczVar != null ? zzeczVar.zza() : null;
            if (zza != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(zza);
            }
            create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzedr(this, create, timer, zzmVar), 3000L);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzA = com.google.android.gms.ads.internal.zzu.zzo().zzA(this.zzb);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzA ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzu(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (r8 == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzedh.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzedu zzeduVar = (zzedu) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzeduVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzb = zzeduVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzv();
                    zzx(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzu(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzedu zzeduVar = (zzedu) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzeduVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzb = zzeduVar.zzb();
        this.zzf = zzeduVar.zzc();
        this.zzg = zzeduVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhF)).booleanValue()) {
            zzw(zza, zzb);
            return;
        }
        zzu(this.zzf, "dialog_impression", zzfxu.zzd());
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = com.google.android.gms.ads.internal.util.zzt.zzK(zza);
        zzK.setTitle(zzt(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzt(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzt(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzeds.this.zzn(zza, zzb, dialogInterface, i);
            }
        }).setNegativeButton(zzt(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzedp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzeds.this.zzo(zzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzedq
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzeds.this.zzp(zzb, dialogInterface);
            }
        });
        zzK.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzh() {
        final com.google.android.gms.ads.internal.util.client.zzr zzrVar = this.zzd;
        this.zze.zze(new zzfio() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // com.google.android.gms.internal.ads.zzfio
            public final Object zza(Object obj) {
                zzedh.zzb(com.google.android.gms.ads.internal.util.client.zzr.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d9, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
    
        r11.put("notification_not_shown_reason", r10.getMessage());
        r10 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbsg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmap;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str = zzaVar.zza;
        String str2 = zzaVar.zzb;
        String str3 = zzaVar.zzc;
        String zzs = zzs();
        com.google.android.gms.ads.internal.zzu.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent zzr = zzr(context, "offline_notification_clicked", str2, str);
        PendingIntent zzr2 = zzr(context, "offline_notification_dismissed", str2, str);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "offline_notification_channel");
        if (zzs.isEmpty()) {
            builder.setContentTitle(zzt(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            builder.setContentTitle(String.format(zzt(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), zzs));
        }
        builder.setAutoCancel(true).setDeleteIntent(zzr2).setContentIntent(zzr).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhG)).intValue());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhI)).booleanValue() && !str3.isEmpty()) {
            try {
                bitmap = BitmapFactory.decodeStream(new URL(str3).openConnection().getInputStream());
            } catch (IOException unused) {
            }
            if (bitmap != null) {
                try {
                    builder.setLargeIcon(bitmap).setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
                } catch (Resources.NotFoundException unused2) {
                }
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            HashMap hashMap = new HashMap();
            notificationManager.notify(str2, 54321, builder.build());
            String str4 = "offline_notification_impression";
            zzu(str2, str4, hashMap);
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str2, 54321, builder.build());
        String str42 = "offline_notification_impression";
        zzu(str2, str42, hashMap2);
    }

    final /* synthetic */ void zzk(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzu(this.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzu.zzq().zzf(activity));
        zzv();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzl(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "rtsdc", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzn(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzu(this.zzf, "dialog_click", hashMap);
        zzw(activity, zzmVar);
    }

    final /* synthetic */ void zzo(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzu(this.zzf, "dialog_click", hashMap);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final void zzq(String str, zzdjb zzdjbVar) {
        String str2 = "";
        String zzx = !TextUtils.isEmpty(zzdjbVar.zzx()) ? zzdjbVar.zzx() : zzdjbVar.zzB() != null ? zzdjbVar.zzB() : "";
        zzbfd zzm = zzdjbVar.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfd zzn = zzdjbVar.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf = zzn.zzf();
                if (zzf != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzecv(zzx, str2, drawable));
    }
}
