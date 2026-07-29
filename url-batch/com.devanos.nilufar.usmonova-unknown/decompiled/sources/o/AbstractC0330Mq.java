package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.devanos.nilufar.usmonova.R;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;

/* renamed from: o.Mq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0330Mq {
    public static final int a;

    static {
        int i = AbstractC0434Qq.c;
        a = 12451000;
    }

    public Intent a(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && EB.B(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                C0985ef a2 = Z10.a(context);
                sb.append(a2.a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x023d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        Bundle bundle;
        int i2 = AbstractC0434Qq.c;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !AbstractC0434Qq.b.get()) {
            synchronized (AbstractC0022At.l) {
                try {
                    if (!AbstractC0022At.m) {
                        AbstractC0022At.m = true;
                        try {
                            bundle = Z10.a(context).a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            AbstractC0022At.n = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i3 = AbstractC0022At.n;
            if (i3 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i3 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + a + " but found " + i3 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        int i4 = 0;
        if (!EB.B(context)) {
            if (EB.y == null) {
                EB.y = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!EB.y.booleanValue()) {
                z = true;
                if (i >= 0) {
                    throw new IllegalArgumentException();
                }
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                int i5 = 9;
                if (z) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    synchronized (C0460Rq.class) {
                        if (C0460Rq.i == null) {
                            V20 v20 = g30.a;
                            synchronized (g30.class) {
                                if (g30.c == null) {
                                    g30.c = context.getApplicationContext();
                                } else {
                                    Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
                            C0460Rq c0460Rq = new C0460Rq(i4);
                            context.getApplicationContext();
                            C0460Rq.i = c0460Rq;
                        }
                    }
                    if (C0460Rq.A(packageInfo2)) {
                        if (z) {
                            AbstractC1473m3.n(packageInfo);
                            if (!C0460Rq.A(packageInfo)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i6 = packageInfo2.versionCode;
                            if ((i6 == -1 ? -1 : i6 / 1000) < (i != -1 ? i / 1000 : -1)) {
                                Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + i6);
                                i5 = 2;
                            } else {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                                        i5 = 1;
                                        if (i5 != 18) {
                                        }
                                        if (z2) {
                                        }
                                    }
                                }
                                i5 = !applicationInfo.enabled ? 3 : 0;
                            }
                        } else {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                }
                if (i5 != 18) {
                    if (i5 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | Exception unused4) {
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return i5;
                }
                return 18;
            }
        }
        z = false;
        if (i >= 0) {
        }
    }
}
