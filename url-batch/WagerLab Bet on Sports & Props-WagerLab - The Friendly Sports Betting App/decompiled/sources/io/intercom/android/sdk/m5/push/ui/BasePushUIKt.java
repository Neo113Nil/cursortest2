package io.intercom.android.sdk.m5.push.ui;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.push.NotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BasePushUI.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, d2 = {"createBaseNotificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "context", "Landroid/content/Context;", "contentTitle", "", "contentText", "notificationChannel", "Lio/intercom/android/sdk/m5/push/NotificationChannel;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BasePushUIKt {
    public static final NotificationCompat.Builder createBaseNotificationBuilder(Context context, String contentTitle, String contentText, NotificationChannel notificationChannel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentTitle, "contentTitle");
        Intrinsics.checkNotNullParameter(contentText, "contentText");
        Intrinsics.checkNotNullParameter(notificationChannel, "notificationChannel");
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(context, notificationChannel.getChannelName()).setContentTitle(contentTitle).setContentText(contentText).setSmallIcon(R.drawable.intercom_push_icon).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "setAutoCancel(...)");
        return autoCancel;
    }
}
