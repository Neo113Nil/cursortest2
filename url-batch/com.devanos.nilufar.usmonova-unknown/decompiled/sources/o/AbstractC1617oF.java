package o;

import android.app.Notification;

/* renamed from: o.oF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1617oF {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    public static Notification.Builder b(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
