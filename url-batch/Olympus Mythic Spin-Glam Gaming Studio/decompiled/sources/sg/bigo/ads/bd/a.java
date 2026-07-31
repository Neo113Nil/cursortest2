package sg.bigo.ads.bd;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes3.dex */
public final class a {
    @NonNull
    @WorkerThread
    public static sg.bigo.ads.an.a a(@NonNull Context context) {
        String str = "";
        boolean z = true;
        if ("Amazon".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) == 0) {
                    z = false;
                }
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        return new sg.bigo.ads.an.a(str, z);
    }
}
