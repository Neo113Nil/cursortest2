package io.bidmachine.rendering.internal;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import io.bidmachine.util.Executable;
import io.bidmachine.util.ProcessUrlResult;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.Utils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n {

    public static final class a extends BroadcastReceiver {
        final /* synthetic */ Executable a;

        a(Executable executable) {
            this.a = executable;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            context.unregisterReceiver(this);
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getSUCCESS(), this.a);
        }
    }

    public final void a(Context context, Uri uri, Executable executable) {
        long j;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        try {
            j = a(applicationContext, uri);
        } catch (Exception e) {
            k.b(e);
            j = -1;
        }
        if (j == -1) {
            UiUtils.INSTANCE.onUiThreadWithArgSafely(ProcessUrlResult.INSTANCE.getFAIL(), executable);
        } else {
            Utils.registerBroadcastReceiver(new a(executable), applicationContext, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }

    private final long a(Context context, Uri uri) {
        DownloadManager downloadManager = Utils.getDownloadManager(context);
        if (downloadManager == null) {
            return -1L;
        }
        DownloadManager.Request notificationVisibility = new DownloadManager.Request(uri).setNotificationVisibility(1);
        Intrinsics.checkNotNullExpressionValue(notificationVisibility, "Request(uri)\n           …VISIBLE_NOTIFY_COMPLETED)");
        return downloadManager.enqueue(notificationVisibility);
    }
}
