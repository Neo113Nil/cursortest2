package io.intercom.android.sdk.m5.push;

import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgsKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ConversationDeepLinkRouter.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a,\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000\u001aA\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0014\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"buildIntentForConversationScreen", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "conversationId", "", "customStack", "Landroid/app/TaskStackBuilder;", "buildIntentForDeepLinkScreen", "uri", "instanceId", "buildIntentForMessagesScreen", "buildBasePendingIntent", "requestCode", "", "finalIntent", "Landroid/content/Intent;", "extras", "Landroid/os/Bundle;", "(Landroid/content/Context;Ljava/lang/Integer;Landroid/content/Intent;Landroid/app/TaskStackBuilder;Landroid/os/Bundle;)Landroid/app/PendingIntent;", "DEFAULT_REQUEST_CODE", "INTERCOM_PUSH_INSTANCE_ID", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationDeepLinkRouterKt {
    private static final int DEFAULT_REQUEST_CODE = 0;
    public static final String INTERCOM_PUSH_INSTANCE_ID = "io.intercom.android.sdk.INTERCOM_PUSH_INSTANCE_ID";

    public static final PendingIntent buildIntentForConversationScreen(Context context, String conversationId, TaskStackBuilder taskStackBuilder) {
        Context context2;
        String str;
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        if (StringsKt.isBlank(conversationId)) {
            context2 = context;
            str = conversationId;
            intent = null;
        } else {
            str = conversationId;
            context2 = context;
            intent = IntercomRootActivityArgsKt.getIntentForArgs$default(context2, new IntercomRootActivityArgs.ConversationScreenArgs(str, "", false, null, null, null, 48, null), null, null, 4, null);
        }
        return buildBasePendingIntent(context2, intent != null ? Integer.valueOf(str.hashCode()) : null, intent, taskStackBuilder, null);
    }

    public static final PendingIntent buildIntentForDeepLinkScreen(Context context, String uri, String instanceId, TaskStackBuilder taskStackBuilder) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        if (StringsKt.isBlank(uri)) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(uri));
            intent.addCategory("android.intent.category.BROWSABLE");
        }
        return buildBasePendingIntent(context, intent != null ? Integer.valueOf(uri.hashCode()) : null, intent, taskStackBuilder, BundleKt.bundleOf(TuplesKt.to(INTERCOM_PUSH_INSTANCE_ID, instanceId)));
    }

    public static final PendingIntent buildIntentForMessagesScreen(Context context, TaskStackBuilder taskStackBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        return buildBasePendingIntent(context, 0, IntercomRootActivityArgsKt.getIntentForArgs$default(context, IntercomRootActivityArgs.MessagesScreenArgs.INSTANCE, null, null, 4, null), taskStackBuilder, null);
    }

    static /* synthetic */ PendingIntent buildBasePendingIntent$default(Context context, Integer num, Intent intent, TaskStackBuilder taskStackBuilder, Bundle bundle, int i, Object obj) {
        if ((i & 16) != 0) {
            bundle = null;
        }
        return buildBasePendingIntent(context, num, intent, taskStackBuilder, bundle);
    }

    private static final PendingIntent buildBasePendingIntent(Context context, Integer num, Intent intent, TaskStackBuilder taskStackBuilder, Bundle bundle) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        if (bundle != null) {
            if (intent != null) {
                intent.putExtras(bundle);
            }
            launchIntentForPackage.putExtras(bundle);
        }
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        if (taskStackBuilder == null) {
            if (intent != null) {
                return PendingIntent.getActivity(context, intValue, intent, 201326592);
            }
            return PendingIntent.getActivity(context, intValue, launchIntentForPackage, 201326592);
        }
        if (intent != null) {
            Intent[] intents = taskStackBuilder.getIntents();
            Intrinsics.checkNotNullExpressionValue(intents, "getIntents(...)");
            Intent[] intentArr = intents;
            int length = intentArr.length;
            while (true) {
                if (i < length) {
                    if (Intrinsics.areEqual(intentArr[i].getComponent(), intent.getComponent())) {
                        break;
                    }
                    i++;
                } else {
                    taskStackBuilder.addNextIntent(intent);
                    break;
                }
            }
        }
        return taskStackBuilder.getPendingIntent(intValue, 201326592);
    }
}
