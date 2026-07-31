package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import expo.modules.notifications.service.NotificationsService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NotificationPermissionChecker.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a$\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\nH\u0000¨\u0006\u000b"}, d2 = {"showNotification", "", "context", "Landroid/content/Context;", "notificationId", "", NotificationsService.NOTIFICATION_KEY, "Landroid/app/Notification;", "showNotifications", NotificationsService.NOTIFICATIONS_KEY, "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NotificationPermissionCheckerKt {
    public static final void showNotification(Context context, int i, Notification notification) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notification, "notification");
        showNotifications(context, MapsKt.mapOf(TuplesKt.to(Integer.valueOf(i), notification)));
    }

    public static final void showNotifications(Context context, Map<Integer, ? extends Notification> notifications) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        if (Build.VERSION.SDK_INT < 33 || ActivityCompat.checkSelfPermission(context, "android.permission.POST_NOTIFICATIONS") == 0) {
            for (Map.Entry<Integer, ? extends Notification> entry : notifications.entrySet()) {
                from.notify(entry.getKey().intValue(), entry.getValue());
            }
        }
    }
}
