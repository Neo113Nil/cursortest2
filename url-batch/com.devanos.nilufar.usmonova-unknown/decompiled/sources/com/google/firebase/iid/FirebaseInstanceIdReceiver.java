package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.MessagingAnalytics;
import com.google.firebase.messaging.ServiceStarter;
import java.util.concurrent.ExecutionException;
import o.AbstractC0445Rb;
import o.C0419Qb;
import o.DY;

/* loaded from: classes.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC0445Rb {
    private static final String TAG = "FirebaseMessaging";

    private static Intent createServiceIntent(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // o.AbstractC0445Rb
    public int onMessageReceive(Context context, C0419Qb c0419Qb) {
        try {
            return ((Integer) DY.b(new FcmBroadcastProcessor(context).process(c0419Qb.h))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return ServiceStarter.ERROR_UNKNOWN;
        }
    }

    @Override // o.AbstractC0445Rb
    public void onNotificationDismissed(Context context, Bundle bundle) {
        Intent createServiceIntent = createServiceIntent(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (MessagingAnalytics.shouldUploadScionMetrics(createServiceIntent)) {
            MessagingAnalytics.logNotificationDismiss(createServiceIntent);
        }
    }
}
