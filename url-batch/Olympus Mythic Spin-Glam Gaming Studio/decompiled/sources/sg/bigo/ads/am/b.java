package sg.bigo.ads.am;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class b {
    private static String a;
    private static a b;

    public static class a {
        public final boolean a;

        @Nullable
        public final String b;

        @Nullable
        public final String c;

        @Nullable
        public final String d;

        @Nullable
        public final String e;

        public a(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.a = z;
            this.e = str;
            this.d = str2;
            this.c = str3;
            this.b = str4;
        }
    }

    @NonNull
    public static a a(Context context) {
        String str;
        String str2;
        String str3;
        PackageInfo packageInfo;
        String substring;
        String str4;
        String valueOf;
        int indexOf;
        a aVar = b;
        if (aVar != null) {
            return aVar;
        }
        boolean z = false;
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
        String str5 = null;
        String str6 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.chrome", 0);
        } catch (PackageManager.NameNotFoundException e) {
            e = e;
        } catch (Exception e2) {
            e = e2;
        }
        if (packageInfo == null || !"com.android.chrome".equals(packageInfo.packageName)) {
            str = "No chrome pkg";
            str2 = str;
            str3 = str5;
            a aVar2 = new a(z, a, str3, str6, str2);
            b = aVar2;
            return aVar2;
        }
        a = "com.android.chrome";
        String str7 = packageInfo.versionName;
        try {
            substring = (TextUtils.isEmpty(str7) || (indexOf = str7.indexOf(".")) < 0) ? null : str7.substring(0, indexOf);
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            str5 = str7;
            str = e.toString();
            str2 = str;
            str3 = str5;
            a aVar22 = new a(z, a, str3, str6, str2);
            b = aVar22;
            return aVar22;
        } catch (Exception e4) {
            e = e4;
            str5 = str7;
            str = e.toString();
            str2 = str;
            str3 = str5;
            a aVar222 = new a(z, a, str3, str6, str2);
            b = aVar222;
            return aVar222;
        }
        if (TextUtils.isEmpty(substring)) {
            str4 = "Invalid chrome version: ";
            valueOf = String.valueOf(str7);
        } else {
            if (Integer.parseInt(substring) >= 45) {
                z = true;
                str3 = str7;
                str2 = str5;
                a aVar2222 = new a(z, a, str3, str6, str2);
                b = aVar2222;
                return aVar2222;
            }
            str4 = "Chrome version is low: ";
            valueOf = String.valueOf(str7);
        }
        str5 = str4.concat(valueOf);
        str3 = str7;
        str2 = str5;
        a aVar22222 = new a(z, a, str3, str6, str2);
        b = aVar22222;
        return aVar22222;
    }
}
