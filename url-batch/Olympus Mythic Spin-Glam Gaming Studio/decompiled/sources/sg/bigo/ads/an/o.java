package sg.bigo.ads.an;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.io.File;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes5.dex */
public final class o {
    public static String a = "";

    public static String a(Context context) {
        String str;
        if (sg.bigo.ads.bh.d.b() && !r.a((CharSequence) a)) {
            return a;
        }
        if (r.a((CharSequence) a)) {
            if (context == null) {
                str = "";
            } else {
                str = context.getFilesDir() + File.separator + "sg_bigo_ad";
            }
            a = str;
        }
        File file = new File(a);
        if (!file.exists()) {
            file.mkdirs();
        }
        return a;
    }

    public static boolean a(Context context, String str) {
        return str != null && str.equals(b(context));
    }

    public static boolean a(Context context, @Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !"package.zip".equals(str2)) {
            return false;
        }
        return str.startsWith(i(context) + File.separator);
    }

    public static String b(Context context) {
        return j(context) + File.separator + FileUploadManager.i;
    }

    @Nullable
    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "file://" + d(context) + File.separator + str;
    }

    public static String c(Context context) {
        return j(context) + File.separator + "vpaid";
    }

    public static String c(Context context, @NonNull String str) {
        return i(context) + File.separator + str;
    }

    public static String d(Context context) {
        return j(context) + File.separator + "thumb";
    }

    public static String e(Context context) {
        return a(context) + File.separator + "image";
    }

    public static String f(Context context) {
        return a(context) + File.separator + "icon";
    }

    public static String g(Context context) {
        return a(context) + File.separator + "omsdk";
    }

    public static String h(Context context) {
        return a(context) + File.separator + "bannerjs";
    }

    public static String i(Context context) {
        return a(context) + File.separator + "playable_zip";
    }

    private static String j(Context context) {
        return a(context) + File.separator + "video";
    }
}
