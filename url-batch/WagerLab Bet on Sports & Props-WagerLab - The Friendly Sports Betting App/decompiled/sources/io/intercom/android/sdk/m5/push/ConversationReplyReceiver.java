package io.intercom.android.sdk.m5.push;

import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.RemoteInput;
import androidx.core.os.BundleCompat;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationReplyReceiver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/m5/push/ConversationReplyReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationReplyReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String string;
        String stringExtra;
        TaskStackBuilder taskStackBuilder;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        if (resultsFromIntent == null || (string = resultsFromIntent.getString(ConversationActionHandlerKt.KEY_TEXT_REPLY)) == null || (stringExtra = intent.getStringExtra(ConversationActionHandlerKt.KEY_CONVERSATION_ID)) == null) {
            return;
        }
        Bundle extras = intent.getExtras();
        Parcelable[] parcelableArray = extras != null ? BundleCompat.getParcelableArray(extras, ConversationActionHandlerKt.KEY_CUSTOM_STACK_INTENTS, Intent.class) : null;
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof Intent) {
                    arrayList.add(parcelable);
                }
            }
            taskStackBuilder = TaskStackBuilder.create(context);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                taskStackBuilder.addNextIntent((Intent) it.next());
            }
        } else {
            taskStackBuilder = null;
        }
        Data build = new Data.Builder().putString(ConversationActionHandlerKt.KEY_TEXT_REPLY, string).putString(ConversationActionHandlerKt.KEY_CONVERSATION_ID, stringExtra).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(SendMessageWorker.class).setInputData(build).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
        IntercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, context, new IntercomPushData.ConversationPushData("", "", stringExtra, new IntercomPushData.ConversationPushData.MessageData.Text(string), true, false), taskStackBuilder, true, null, 16, null);
    }
}
