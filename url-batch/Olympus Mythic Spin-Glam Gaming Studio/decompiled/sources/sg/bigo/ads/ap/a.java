package sg.bigo.ads.ap;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.unity3d.services.core.fid.Constants;

/* loaded from: classes14.dex */
public final class a {
    private static String a = "";
    private static boolean b = true;

    @NonNull
    public static String a(@NonNull Context context) {
        if (!TextUtils.isEmpty(a) || !b) {
            return a;
        }
        try {
            Class<?> cls = Class.forName("com.appsflyer.AppsFlyerLib");
            Object invoke = cls.getMethod("getAppsFlyerUID", Context.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), context);
            if (invoke instanceof String) {
                a = (String) invoke;
            }
        } catch (Exception unused) {
            b = false;
        }
        return a;
    }
}
