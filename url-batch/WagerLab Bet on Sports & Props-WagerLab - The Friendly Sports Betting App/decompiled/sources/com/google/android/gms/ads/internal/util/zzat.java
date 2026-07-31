package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdvo;
import com.google.android.gms.internal.ads.zzdvs;
import com.google.android.gms.internal.ads.zzgpd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes4.dex */
public final class zzat {
    private final Context zza;
    private final zzdvs zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzat(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzat.this.zzg();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzs().zza();
        this.zzk = com.google.android.gms.ads.internal.zzt.zzs().zzb();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzo().zzb();
    }

    private final boolean zzs(float f, float f2, float f3, float f4) {
        return Math.abs(this.zzi.x - f) < ((float) this.zzh) && Math.abs(this.zzi.y - f2) < ((float) this.zzh) && Math.abs(this.zzj.x - f3) < ((float) this.zzh) && Math.abs(this.zzj.y - f4) < ((float) this.zzh);
    }

    private final void zzt(Context context) {
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        final int zzu2 = zzu(arrayList, "Shake", true);
        final int zzu3 = zzu(arrayList, "Flick", true);
        int ordinal = this.zzb.zzf().ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzO = zzs.zzO(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        zzO.setTitle("Setup gesture");
        zzO.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        zzO.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                zzat.this.zzb();
            }
        });
        zzO.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                zzat.this.zzi(atomicInteger, i, zzu2, zzu3, dialogInterface, i2);
            }
        });
        zzO.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                zzat.this.zzb();
            }
        });
        zzO.create().show();
    }

    private static final int zzu(List list, String str, boolean z) {
        if (!z) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        sb.append(this.zzd);
        sb.append("}");
        return sb.toString();
    }

    public final void zza(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.zzg;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfq)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !zzs(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (zzs(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzb() {
        try {
            Context context = this.zza;
            if (!(context instanceof Activity)) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzo().zzi())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzo().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int zzu = zzu(arrayList, "Ad information", true);
            final int zzu2 = zzu(arrayList, str, true);
            final int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue();
            final int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            final int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder zzO = zzs.zzO(context);
            zzO.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                    zzat.this.zzh(zzu, zzu2, zzu3, zzu4, zzu5, dialogInterface, i2);
                }
            });
            zzO.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public final void zzc(String str) {
        this.zzd = str;
    }

    public final void zzd(String str) {
        this.zze = str;
    }

    public final void zze(String str) {
        this.zzc = str;
    }

    public final void zzf(String str) {
        this.zzf = str;
    }

    final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzb();
    }

    final /* synthetic */ void zzh(int i, int i2, int i3, int i4, int i5, DialogInterface dialogInterface, int i6) {
        if (i6 != i) {
            if (i6 == i2) {
                int i7 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Creative Preview] selected.");
                zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzat.this.zzo();
                    }
                });
                return;
            }
            if (i6 == i3) {
                int i8 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Troubleshooting] selected.");
                zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzat.this.zzp();
                    }
                });
                return;
            }
            if (i6 == i4) {
                zzdvs zzdvsVar = this.zzb;
                final zzgpd zzgpdVar = zzbzh.zzf;
                zzgpd zzgpdVar2 = zzbzh.zza;
                if (zzdvsVar.zzs()) {
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzat.this.zzl();
                        }
                    });
                    return;
                } else {
                    zzgpdVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzap
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzat.this.zzk(zzgpdVar);
                        }
                    });
                    return;
                }
            }
            if (i6 == i5) {
                zzdvs zzdvsVar2 = this.zzb;
                final zzgpd zzgpdVar3 = zzbzh.zzf;
                zzgpd zzgpdVar4 = zzbzh.zza;
                if (zzdvsVar2.zzs()) {
                    zzgpdVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzat.this.zzn();
                        }
                    });
                    return;
                } else {
                    zzgpdVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzat.this.zzm(zzgpdVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        Context context = this.zza;
        if (!(context instanceof Activity)) {
            int i9 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
            return;
        }
        String str = this.zzc;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            com.google.android.gms.ads.internal.zzt.zzc();
            Map zzU = zzs.zzU(build);
            for (String str3 : zzU.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) zzU.get(str3));
                sb.append("\n\n");
            }
            String trim = sb.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzO = zzs.zzO(context);
        zzO.setMessage(str2);
        zzO.setTitle("Ad Information");
        zzO.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface2, int i10) {
                zzat.this.zzj(str2, dialogInterface2, i10);
            }
        });
        zzO.setNegativeButton("Close", zzao.zza);
        zzO.create().show();
    }

    final /* synthetic */ void zzi(AtomicInteger atomicInteger, int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (atomicInteger.get() != i) {
            if (atomicInteger.get() == i2) {
                this.zzb.zze(zzdvo.SHAKE);
            } else if (atomicInteger.get() == i3) {
                this.zzb.zze(zzdvo.FLICK);
            } else {
                this.zzb.zze(zzdvo.NONE);
            }
        }
        zzb();
    }

    final /* synthetic */ void zzj(String str, DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzc();
        zzs.zzY(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void zzk(zzgpd zzgpdVar) {
        zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
        Context context = this.zza;
        if (zzo.zze(context, this.zzd, this.zze)) {
            zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzat.this.zzr();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzo().zzf(context, this.zzd, this.zze);
        }
    }

    final /* synthetic */ void zzl() {
        com.google.android.gms.ads.internal.zzt.zzo().zzc(this.zza);
    }

    final /* synthetic */ void zzm(zzgpd zzgpdVar) {
        zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
        Context context = this.zza;
        if (zzo.zze(context, this.zzd, this.zze)) {
            zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzat.this.zzq();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzt.zzo().zzf(context, this.zzd, this.zze);
        }
    }

    final /* synthetic */ void zzn() {
        zzt(this.zza);
    }

    final /* synthetic */ void zzo() {
        zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzo.zzd(context, str, str2)) {
            zzo.zzn(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if (ExifInterface.GPS_MEASUREMENT_2D.equals(zzo.zza)) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Creative is not pushed for this device.");
            zzo.zzn(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzo.zza)) {
            int i2 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("The app is not linked for creative preview.");
            zzo.zzf(context, str, str2);
        } else if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(zzo.zza)) {
            int i3 = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for in app preview.");
            zzo.zzn(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    final /* synthetic */ void zzp() {
        zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm = zzo.zzm();
        Context context = this.zza;
        zzo.zzl(zzo.zze(context, str, str2));
        if (!zzo.zzm()) {
            zzo.zzf(context, str, str2);
            return;
        }
        if (!zzm && !TextUtils.isEmpty(str3)) {
            zzo.zzh(context, str2, str3, str);
        }
        int i = zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for debug signals.");
        zzo.zzn(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void zzq() {
        zzt(this.zza);
    }

    final /* synthetic */ void zzr() {
        com.google.android.gms.ads.internal.zzt.zzo().zzc(this.zza);
    }

    public zzat(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
