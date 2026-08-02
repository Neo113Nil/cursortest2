package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzevl implements zzeve {
    private final zzfzq zza;
    private final Context zzb;

    public zzevl(zzfzq zzfzqVar, Context context) {
        this.zza = zzfzqVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevl.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(1:3)(1:60)|4|(1:6)(1:59)|7|(3:9|(2:12|10)|13)|14|(3:53|54|(13:56|17|18|19|(8:21|22|23|(1:25)(3:35|(3:38|(3:41|(2:44|45)(1:43)|39)|46)|47)|26|(1:34)(1:30)|31|32)|49|23|(0)(0)|26|(1:28)|34|31|32))|16|17|18|19|(0)|49|23|(0)(0)|26|(0)|34|31|32) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:19:0x009c, B:21:0x00aa), top: B:18:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzevj zzc() throws Exception {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        String str2;
        String str3;
        boolean z;
        PackageInfo packageInfo2;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z2 = zzd(packageManager, "geo:0,0?q=donuts") != null;
        boolean z3 = zzd(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        boolean zzq = zzcgi.zzq();
        boolean isLatchsky = DeviceProperties.isLatchsky(this.zzb);
        boolean isSidewinder = DeviceProperties.isSidewinder(this.zzb);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        Context context = this.zzb;
        ResolveInfo zzd = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zzd != null && (activityInfo = zzd.activityInfo) != null) {
            try {
                packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                str = packageInfo.versionCode + "." + activityInfo.packageName;
                packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    str2 = packageInfo2.versionCode + "." + packageInfo2.packageName;
                    String str4 = Build.FINGERPRINT;
                    Context context2 = this.zzb;
                    if (packageManager == null) {
                        str3 = str4;
                        z = false;
                    } else {
                        str3 = str4;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                                    z = resolveActivity.activityInfo.packageName.equals(zzgxw.zza(context2));
                                    break;
                                }
                            }
                        }
                        z = false;
                    }
                    com.google.android.gms.ads.internal.zzt.zzp();
                    return new zzevj(z2, z3, country, zzq, isLatchsky, isSidewinder, language, arrayList, str, str2, str3, z, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziR)).booleanValue() && DeviceProperties.isBstar(this.zzb));
                }
                str2 = null;
                String str42 = Build.FINGERPRINT;
                Context context22 = this.zzb;
                if (packageManager == null) {
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                return new zzevj(z2, z3, country, zzq, isLatchsky, isSidewinder, language, arrayList, str, str2, str3, z, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziR)).booleanValue() && DeviceProperties.isBstar(this.zzb));
            }
        }
        str = null;
        packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        str2 = null;
        String str422 = Build.FINGERPRINT;
        Context context222 = this.zzb;
        if (packageManager == null) {
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzevj(z2, z3, country, zzq, isLatchsky, isSidewinder, language, arrayList, str, str2, str3, z, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, !((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zziR)).booleanValue() && DeviceProperties.isBstar(this.zzb));
    }
}
