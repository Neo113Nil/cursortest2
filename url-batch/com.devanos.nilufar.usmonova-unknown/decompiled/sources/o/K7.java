package o;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.view.autofill.AutofillId;
import com.google.firebase.messaging.CommonNotificationBuilder;
import java.lang.invoke.MethodHandles;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class K7 {
    public static /* bridge */ /* synthetic */ boolean B(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }

    public static /* synthetic */ NotificationChannel D(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel(CommonNotificationBuilder.FCM_FALLBACK_NOTIFICATION_CHANNEL, str, 3);
    }

    public static /* bridge */ /* synthetic */ AutofillId f(Object obj) {
        return (AutofillId) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup m(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    public static /* synthetic */ Locale.LanguageRange s(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void u() {
    }
}
