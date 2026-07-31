package com.ogury.core.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ogury/core/internal/LogEnablerReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LogEnablerReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (StringsKt.equals$default(intent.getAction(), "com.ogury.sdk.intent.ENABLE_LOGS", false, 2, null) && intent.hasExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL)) {
            Bundle extras = intent.getExtras();
            Integer valueOf = extras != null ? Integer.valueOf(extras.getInt(AppLovinEventTypes.USER_COMPLETED_LEVEL)) : null;
            if (valueOf != null) {
                IntegrationLogger.setLevel(valueOf.intValue());
            }
        }
    }
}
