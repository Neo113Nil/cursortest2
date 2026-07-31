package io.intercom.android.sdk.m5.push;

import android.app.Notification;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.Person;
import androidx.core.content.pm.ShortcutInfoCompat;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.push.IntercomPushData;
import io.intercom.android.sdk.m5.push.ui.ConversationShortcutKt;
import io.intercom.android.sdk.m5.push.ui.ConversationStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.DeepLinkStylePushUIKt;
import io.intercom.android.sdk.m5.push.ui.IntercomPushConversation;
import io.intercom.android.sdk.utilities.GroupConversationTextFormatter;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IntercomNotificationHandler.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001aJ\"\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J;\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0000¢\u0006\u0002\b#J\u000e\u0010$\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013JF\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050&2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002JB\u0010-\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0015\u0010.\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b/R*\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u00060"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomNotificationHandler;", "", "<init>", "()V", "conversations", "", "Lio/intercom/android/sdk/m5/push/ui/IntercomPushConversation;", "getConversations$intercom_sdk_base_release$annotations", "getConversations$intercom_sdk_base_release", "()Ljava/util/List;", "setConversations$intercom_sdk_base_release", "(Ljava/util/List;)V", "twig", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "Lcom/intercom/twig/Twig;", "processIntercomPushNotification", "", "context", "Landroid/content/Context;", "intercomPushData", "Lio/intercom/android/sdk/m5/push/IntercomPushData;", "customStack", "Landroid/app/TaskStackBuilder;", "timeProvider", "Lio/intercom/android/sdk/utilities/commons/TimeProvider;", "processIntercomPushNotification$intercom_sdk_base_release", "processDeepLinkPushNotification", "deepLinkPushData", "Lio/intercom/android/sdk/m5/push/IntercomPushData$DeepLinkPushData;", "processConversationPushNotification", "conversationPushData", "Lio/intercom/android/sdk/m5/push/IntercomPushData$ConversationPushData;", "isSilent", "", "processConversationPushNotification$intercom_sdk_base_release", "clear", "updateConversations", "Lkotlin/Pair;", "timestamp", "", "avatarBitmap", "Landroid/graphics/Bitmap;", "contentImageUri", "Landroid/net/Uri;", "getOrCreateConversation", "setUpNotificationChannels", "setUpNotificationChannels$intercom_sdk_base_release", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomNotificationHandler {
    public static final IntercomNotificationHandler INSTANCE = new IntercomNotificationHandler();
    private static List<IntercomPushConversation> conversations = CollectionsKt.emptyList();
    private static final Twig twig = LumberMill.getLogger();
    public static final int $stable = 8;

    public static /* synthetic */ void getConversations$intercom_sdk_base_release$annotations() {
    }

    private IntercomNotificationHandler() {
    }

    public final List<IntercomPushConversation> getConversations$intercom_sdk_base_release() {
        return conversations;
    }

    public final void setConversations$intercom_sdk_base_release(List<IntercomPushConversation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        conversations = list;
    }

    public static /* synthetic */ void processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData intercomPushData, TaskStackBuilder taskStackBuilder, TimeProvider timeProvider, int i, Object obj) {
        if ((i & 8) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release(context, intercomPushData, taskStackBuilder, timeProvider);
    }

    public final void processIntercomPushNotification$intercom_sdk_base_release(Context context, IntercomPushData intercomPushData, TaskStackBuilder customStack, TimeProvider timeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intercomPushData, "intercomPushData");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        if (intercomPushData instanceof IntercomPushData.DeepLinkPushData) {
            processDeepLinkPushNotification(context, (IntercomPushData.DeepLinkPushData) intercomPushData, customStack);
        } else {
            if (!(intercomPushData instanceof IntercomPushData.ConversationPushData)) {
                throw new NoWhenBranchMatchedException();
            }
            processConversationPushNotification$intercom_sdk_base_release$default(this, context, (IntercomPushData.ConversationPushData) intercomPushData, customStack, false, timeProvider, 8, null);
        }
    }

    private final void processDeepLinkPushNotification(final Context context, final IntercomPushData.DeepLinkPushData deepLinkPushData, final TaskStackBuilder customStack) {
        twig.i("This is a push only message", new Object[0]);
        Injector.get().getMetricTracker().receivedPushOnlyNotification("instance_id:" + deepLinkPushData.getInstanceId(), deepLinkPushData.getInstanceId());
        IntercomPushBitmapUtilsKt.loadBitmaps$default(context, deepLinkPushData.getContentImageUrl(), null, null, new Function2() { // from class: io.intercom.android.sdk.m5.push.IntercomNotificationHandler$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit processDeepLinkPushNotification$lambda$0;
                processDeepLinkPushNotification$lambda$0 = IntercomNotificationHandler.processDeepLinkPushNotification$lambda$0(context, deepLinkPushData, customStack, (Bitmap) obj, (Bitmap) obj2);
                return processDeepLinkPushNotification$lambda$0;
            }
        }, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processDeepLinkPushNotification$lambda$0(Context context, IntercomPushData.DeepLinkPushData deepLinkPushData, TaskStackBuilder taskStackBuilder, Bitmap bitmap, Bitmap bitmap2) {
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(deepLinkPushData, "$deepLinkPushData");
        NotificationPermissionCheckerKt.showNotification(context, deepLinkPushData.getNotificationId(), DeepLinkStylePushUIKt.buildDeepLinkNotification(context, deepLinkPushData, bitmap, taskStackBuilder));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void processConversationPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler intercomNotificationHandler, Context context, IntercomPushData.ConversationPushData conversationPushData, TaskStackBuilder taskStackBuilder, boolean z, TimeProvider timeProvider, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            timeProvider = TimeProvider.SYSTEM;
        }
        intercomNotificationHandler.processConversationPushNotification$intercom_sdk_base_release(context, conversationPushData, taskStackBuilder, z2, timeProvider);
    }

    public final void processConversationPushNotification$intercom_sdk_base_release(final Context context, final IntercomPushData.ConversationPushData conversationPushData, final TaskStackBuilder customStack, final boolean isSilent, final TimeProvider timeProvider) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(conversationPushData, "conversationPushData");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        if (Injector.get().getDataLayer().getHostAppState().getValue().isBackgrounded()) {
            twig.i("This is a background push message", new Object[0]);
            Injector.get().getMetricTracker().receivedPushNotification(conversationPushData.getConversationId());
            if (conversationPushData.getMessageData() instanceof IntercomPushData.ConversationPushData.MessageData.Image) {
                str = ((IntercomPushData.ConversationPushData.MessageData.Image) conversationPushData.getMessageData()).getUrl();
            } else {
                str = "";
            }
            IntercomPushBitmapUtilsKt.loadBitmaps(context, str, conversationPushData.getAvatarUrl(), conversationPushData.getAuthorName(), new Function2() { // from class: io.intercom.android.sdk.m5.push.IntercomNotificationHandler$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit processConversationPushNotification$lambda$4;
                    processConversationPushNotification$lambda$4 = IntercomNotificationHandler.processConversationPushNotification$lambda$4(context, conversationPushData, timeProvider, isSilent, customStack, (Bitmap) obj, (Bitmap) obj2);
                    return processConversationPushNotification$lambda$4;
                }
            });
            return;
        }
        twig.i("Intercom message received but not displayed in notification bar. This happened because the host app was in the foreground.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit processConversationPushNotification$lambda$4(Context context, IntercomPushData.ConversationPushData conversationPushData, TimeProvider timeProvider, boolean z, TaskStackBuilder taskStackBuilder, Bitmap bitmap, Bitmap bitmap2) {
        NotificationChannel notificationChannel;
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(conversationPushData, "$conversationPushData");
        Intrinsics.checkNotNullParameter(timeProvider, "$timeProvider");
        Pair<IntercomPushConversation, List<IntercomPushConversation>> updateConversations = INSTANCE.updateConversations(context, conversationPushData, timeProvider.currentTimeMillis(), bitmap2, bitmap != null ? IntercomPushBitmapUtilsKt.getBitmapUri(context, bitmap) : null);
        IntercomPushConversation component1 = updateConversations.component1();
        List<IntercomPushConversation> component2 = updateConversations.component2();
        Pair<List<ShortcutInfoCompat>, ShortcutInfoCompat> createTemporaryShortcut = ConversationShortcutKt.createTemporaryShortcut(context, component1.getConversationId(), component1.getConversationTitle(), bitmap2);
        List<ShortcutInfoCompat> component12 = createTemporaryShortcut.component1();
        ShortcutInfoCompat component22 = createTemporaryShortcut.component2();
        if (conversationPushData.isNewConversation()) {
            notificationChannel = NotificationChannel.NEW_CHATS_CHANNEL;
        } else {
            notificationChannel = NotificationChannel.CHAT_REPLIES_CHANNEL;
        }
        NotificationChannel notificationChannel2 = notificationChannel;
        Notification buildConversationStyleNotification = ConversationStylePushUIKt.buildConversationStyleNotification(context, component1, component22, conversationPushData, notificationChannel2, z, taskStackBuilder);
        Notification buildConversationStyleSummaryNotification = component2.size() > 1 ? ConversationStylePushUIKt.buildConversationStyleSummaryNotification(context, component2, notificationChannel2, taskStackBuilder) : null;
        Map createMapBuilder = MapsKt.createMapBuilder();
        createMapBuilder.put(Integer.valueOf(conversationPushData.getNotificationId()), buildConversationStyleNotification);
        if (buildConversationStyleSummaryNotification != null) {
            createMapBuilder.put(Integer.valueOf(ConversationStylePushUIKt.SUMMARY_NOTIFICATION_ID), buildConversationStyleSummaryNotification);
        }
        NotificationPermissionCheckerKt.showNotifications(context, MapsKt.build(createMapBuilder));
        Twig twig2 = twig;
        Intrinsics.checkNotNullExpressionValue(twig2, "twig");
        ConversationShortcutKt.resetShortcuts(context, component12, component22, twig2);
        return Unit.INSTANCE;
    }

    public final synchronized void clear(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!conversations.isEmpty()) {
            twig.i("Removing Intercom push notifications.", new Object[0]);
        }
        NotificationManagerCompat.from(context).cancelAll();
        conversations = CollectionsKt.emptyList();
    }

    private final synchronized Pair<IntercomPushConversation, List<IntercomPushConversation>> updateConversations(Context context, IntercomPushData.ConversationPushData conversationPushData, long timestamp, Bitmap avatarBitmap, Uri contentImageUri) {
        try {
            try {
                final IntercomPushConversation orCreateConversation = getOrCreateConversation(context, conversations, conversationPushData, timestamp, avatarBitmap, contentImageUri);
                List<IntercomPushConversation> mutableList = CollectionsKt.toMutableList((Collection) conversations);
                CollectionsKt.removeAll((List) mutableList, new Function1() { // from class: io.intercom.android.sdk.m5.push.IntercomNotificationHandler$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean updateConversations$lambda$6;
                        updateConversations$lambda$6 = IntercomNotificationHandler.updateConversations$lambda$6(IntercomPushConversation.this, (IntercomPushConversation) obj);
                        return Boolean.valueOf(updateConversations$lambda$6);
                    }
                });
                mutableList.add(orCreateConversation);
                conversations = mutableList;
                return TuplesKt.to(orCreateConversation, mutableList);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean updateConversations$lambda$6(IntercomPushConversation conversation, IntercomPushConversation it) {
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(it.getConversationId(), conversation.getConversationId());
    }

    private final IntercomPushConversation getOrCreateConversation(Context context, List<IntercomPushConversation> conversations2, IntercomPushData.ConversationPushData conversationPushData, long timestamp, Bitmap avatarBitmap, Uri contentImageUri) {
        Object obj;
        List build;
        String conversationTitle;
        Iterator<T> it = conversations2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((IntercomPushConversation) obj).getConversationId(), conversationPushData.getConversationId())) {
                break;
            }
        }
        IntercomPushConversation intercomPushConversation = (IntercomPushConversation) obj;
        if (intercomPushConversation == null) {
            String conversationId = conversationPushData.getConversationId();
            String authorName = conversationPushData.getAuthorName();
            if (StringsKt.isBlank(authorName)) {
                authorName = context.getString(R.string.intercom_new_notifications);
                Intrinsics.checkNotNullExpressionValue(authorName, "getString(...)");
            }
            return new IntercomPushConversation(conversationId, authorName, CollectionsKt.listOf(ConversationStylePushUIKt.toMessage(conversationPushData, timestamp, avatarBitmap, contentImageUri)));
        }
        IntercomPushConversation.Message message = (IntercomPushConversation.Message) CollectionsKt.lastOrNull((List) intercomPushConversation.getMessages());
        if (message != null && message.getIsCurrentUser() && !conversationPushData.isCurrentUser()) {
            build = CollectionsKt.listOf(ConversationStylePushUIKt.toMessage(conversationPushData, timestamp, avatarBitmap, contentImageUri));
        } else {
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.addAll(intercomPushConversation.getMessages());
            createListBuilder.add(ConversationStylePushUIKt.toMessage(conversationPushData, timestamp, avatarBitmap, contentImageUri));
            build = CollectionsKt.build(createListBuilder);
        }
        List list = build;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Person person = ((IntercomPushConversation.Message) obj2).getPerson();
            if (hashSet.add(person != null ? person.getKey() : null)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Person person2 = ((IntercomPushConversation.Message) it2.next()).getPerson();
            if (person2 != null) {
                arrayList2.add(person2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.size() > 1) {
            conversationTitle = GroupConversationTextFormatter.groupConversationTitle(String.valueOf(((Person) CollectionsKt.last((List) arrayList3)).getName()), CollectionsKt.getLastIndex(arrayList3), context).toString();
        } else {
            conversationTitle = intercomPushConversation.getConversationTitle();
        }
        return IntercomPushConversation.copy$default(intercomPushConversation, null, conversationTitle, list, 1, null);
    }

    public final void setUpNotificationChannels$intercom_sdk_base_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationChannelCompat build = new NotificationChannelCompat.Builder(NotificationChannel.CHAT_REPLIES_CHANNEL.getChannelName(), 4).setName(context.getString(R.string.intercom_notification_channel_chat_replies_title)).setDescription(context.getString(R.string.intercom_notification_channel_chat_replies_description)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        NotificationChannelCompat build2 = new NotificationChannelCompat.Builder(NotificationChannel.NEW_CHATS_CHANNEL.getChannelName(), 4).setName(context.getString(R.string.intercom_notification_channel_new_chats_title)).setDescription(context.getString(R.string.intercom_notification_channel_new_chats_description)).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        NotificationChannelCompat build3 = new NotificationChannelCompat.Builder(NotificationChannel.ACTIONS_CHANNEL.getChannelName(), 4).setName(context.getString(R.string.intercom_notification_channel_actions_title)).setDescription(context.getString(R.string.intercom_notification_channel_actions_description)).build();
        Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
        NotificationManagerCompat.from(context).createNotificationChannelsCompat(CollectionsKt.listOf((Object[]) new NotificationChannelCompat[]{build, build2, build3}));
    }
}
