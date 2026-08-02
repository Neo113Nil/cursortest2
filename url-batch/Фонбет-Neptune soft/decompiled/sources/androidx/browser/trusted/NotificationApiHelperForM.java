package androidx.browser.trusted;

import android.app.NotificationManager;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
public class NotificationApiHelperForM {
    static Parcelable[] getActiveNotifications(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications;
        activeNotifications = notificationManager.getActiveNotifications();
        return activeNotifications;
    }

    private NotificationApiHelperForM() {
    }
}
