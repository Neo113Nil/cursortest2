package io.branch.referral.util;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import io.branch.receivers.SharingBroadcastReceiver;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharingUtil.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lio/branch/referral/util/SharingUtil;", "", "()V", "sharedURL", "", "getSharedURL", "()Ljava/lang/String;", "setSharedURL", "(Ljava/lang/String;)V", "share", "", "text", "title", "subject", "activity", "Landroid/app/Activity;", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharingUtil {
    public static final SharingUtil INSTANCE = new SharingUtil();
    private static String sharedURL = "";

    private SharingUtil() {
    }

    public final String getSharedURL() {
        return sharedURL;
    }

    public final void setSharedURL(String str) {
        sharedURL = str;
    }

    @JvmStatic
    public static final void share(String text, String title, String subject, Activity activity) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(activity, "activity");
        sharedURL = text;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", text);
        intent.putExtra("android.intent.extra.TITLE", title);
        intent.putExtra("android.intent.extra.SUBJECT", subject);
        activity.startActivityForResult(Intent.createChooser(intent, title, PendingIntent.getBroadcast(activity.getApplicationContext(), 0, new Intent(activity.getApplicationContext(), (Class<?>) SharingBroadcastReceiver.class), 134217728 | 33554432).getIntentSender()), 1002);
    }
}
