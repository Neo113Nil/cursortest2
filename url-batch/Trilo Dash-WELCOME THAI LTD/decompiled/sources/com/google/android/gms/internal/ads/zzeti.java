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

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzeti implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzeti(zzfvk zzfvkVar, Context context) {
        this.zza = zzfvkVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeti.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(1:3)(1:54)|4|(1:6)(1:53)|7|(3:9|(2:12|10)|13)|14|(3:46|47|(12:49|50|17|18|19|(7:21|22|23|(2:29|(3:32|(3:35|(2:38|39)(1:37)|33)|40))|25|26|27)|42|23|(0)|25|26|27))|16|17|18|19|(0)|42|23|(0)|25|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[Catch: Exception -> 0x00c5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c5, blocks: (B:19:0x009e, B:21:0x00ac), top: B:18:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzetg zzc() throws Exception {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String str;
        String str2;
        boolean equals;
        PackageInfo packageInfo2;
        PackageManager packageManager = this.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z = zzd(packageManager, "geo:0,0?q=donuts") != null;
        boolean z2 = zzd(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        boolean zzp = zzcfb.zzp();
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
                    String str3 = Build.FINGERPRINT;
                    Context context2 = this.zzb;
                    if (packageManager != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(zzgqi.zza(context2));
                                    break;
                                }
                            }
                        }
                    }
                    equals = false;
                    com.google.android.gms.ads.internal.zzt.zzp();
                    return new zzetg(z, z2, country, zzp, isLatchsky, isSidewinder, language, arrayList, str, str2, str3, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
                }
                str2 = null;
                String str32 = Build.FINGERPRINT;
                Context context22 = this.zzb;
                if (packageManager != null) {
                }
                equals = false;
                com.google.android.gms.ads.internal.zzt.zzp();
                return new zzetg(z, z2, country, zzp, isLatchsky, isSidewinder, language, arrayList, str, str2, str32, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
            }
        }
        str = null;
        packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        str2 = null;
        String str322 = Build.FINGERPRINT;
        Context context222 = this.zzb;
        if (packageManager != null) {
        }
        equals = false;
        com.google.android.gms.ads.internal.zzt.zzp();
        return new zzetg(z, z2, country, zzp, isLatchsky, isSidewinder, language, arrayList, str, str2, str322, equals, Build.MODEL, new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID);
    }
}
