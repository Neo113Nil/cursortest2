package io.intercom.android.sdk.m5.conversation.reducers;

import android.text.format.DateUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.CurrentlyTypingState;
import io.intercom.android.sdk.m5.conversation.states.EventLabelSegment;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.TypingIndicatorType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EventContent;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.tickets.TicketDetailReducerKt;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import io.intercom.android.sdk.utilities.extensions.PartExtensionsKt;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationPartsReducer.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002\u001a\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0002\u001a$\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0002\u001a\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0000¨\u0006\u001a"}, d2 = {"reduceMessages", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "clientState", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "config", "Lio/intercom/android/sdk/identity/AppConfig;", "shouldShowQuickReplies", "", "Lio/intercom/android/sdk/models/Part;", "isLastPart", "isAdminOrAltParticipant", "part", "reduceEvent", "hasPendingMessageAfter", "pendingMessages", "", "", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage;", "getGroupingPosition", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "allParts", FirebaseAnalytics.Param.INDEX, "", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationPartsReducerKt {

    /* compiled from: ConversationPartsReducer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageStyle.values().length];
            try {
                iArr[MessageStyle.TICKET_STATE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageStyle.MERGED_PRIMARY_CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<ContentRow> reduceMessages(ConversationClientState conversationClientState, UserIdentity userIdentity, AppConfig config) {
        int i;
        boolean add;
        ConversationClientState clientState = conversationClientState;
        Intrinsics.checkNotNullParameter(clientState, "clientState");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(config, "config");
        Conversation conversation = clientState.getConversation();
        if (conversation == null) {
            return CollectionsKt.emptyList();
        }
        if (conversation.getTicket() != null && !ConversationExtensionsKt.hasNonTicketParts(conversation) && clientState.getPendingMessages().isEmpty()) {
            return CollectionsKt.listOf(new ContentRow.BigTicketRow(TicketDetailReducerKt.computeTicketViewState$default(conversation.getTicket(), userIdentity, null, new TicketLaunchedFrom.Conversation(conversation.getTicket()), 4, null), conversation.getTicket().getId()));
        }
        List createListBuilder = CollectionsKt.createListBuilder();
        List<Part> parts = conversation.parts();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parts) {
            List<ReplyOption> replyOptions = ((Part) obj).getReplyOptions();
            Intrinsics.checkNotNullExpressionValue(replyOptions, "getReplyOptions(...)");
            if (replyOptions.isEmpty() || !conversation.getPreventEndUserReplies()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Part part = (Part) obj2;
            if (part.getMessageStyle() != MessageStyle.QUICK_REPLY || (i2 == CollectionsKt.getLastIndex(conversation.parts()) && !hasPendingMessageAfter(part, clientState.getPendingMessages()))) {
                arrayList2.add(obj2);
            }
            i2 = i3;
        }
        ArrayList arrayList3 = arrayList2;
        Object lastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList3.iterator();
        while (true) {
            i = 1000;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Calendar calendar = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
            calendar.setTime(new Date(1000 * ((Part) next).getCreatedAt()));
            Integer valueOf = Integer.valueOf(calendar.get(6));
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((List) obj3).add(next);
        }
        for (List list : linkedHashMap.values()) {
            boolean isToday = DateUtils.isToday(((Part) CollectionsKt.first(list)).getCreatedAt() * i);
            if (!((Part) CollectionsKt.first(list)).isInitialMessage() || (!PartExtensionsKt.isLinkCard((Part) CollectionsKt.first(list)) && !isToday)) {
                createListBuilder.add(new ContentRow.DayDividerRow(((Part) CollectionsKt.first(list)).getCreatedAt()));
            }
            List list2 = list;
            Collection<PendingMessage> values = clientState.getPendingMessages().values();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(values, 10));
            Iterator<T> it2 = values.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((PendingMessage) it2.next()).getPart());
            }
            List plus = CollectionsKt.plus((Collection) list2, (Iterable) arrayList4);
            List createListBuilder2 = CollectionsKt.createListBuilder();
            List list3 = list;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            int i4 = 0;
            for (Object obj4 : list3) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Part part2 = (Part) obj4;
                if (clientState.getNewMessageId() != null && Intrinsics.areEqual(clientState.getNewMessageId(), part2.getId())) {
                    String id = part2.getId();
                    Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                    createListBuilder2.add(new ContentRow.NewMessagesRow(id));
                }
                if (part2.isInitialMessage() && PartExtensionsKt.isLinkCard(part2)) {
                    add = createListBuilder2.add(new ContentRow.AskedAboutRow(part2));
                } else if (part2.isEvent().booleanValue()) {
                    add = createListBuilder2.add(reduceEvent(part2));
                } else if (part2.getMessageStyle() == MessageStyle.POST) {
                    add = createListBuilder2.add(new ContentRow.PostCardRow(part2, config.getName()));
                } else if (part2.getMessageStyle() == MessageStyle.NOTE) {
                    add = createListBuilder2.add(new ContentRow.NoteCardRow(part2, config.getName()));
                } else if (part2.getMessageStyle() == MessageStyle.FIN_ANSWER) {
                    add = createListBuilder2.add(new ContentRow.FinAnswerRow(part2, getGroupingPosition(plus, i4)));
                } else if (PartExtensionsKt.isQuickReplyOnly(part2)) {
                    List<ReplyOption> replyOptions2 = part2.getReplyOptions();
                    Intrinsics.checkNotNullExpressionValue(replyOptions2, "getReplyOptions(...)");
                    String id2 = part2.getId();
                    Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
                    add = createListBuilder2.add(new ContentRow.QuickRepliesRow(replyOptions2, id2));
                } else {
                    boolean isAdminOrAltParticipant = isAdminOrAltParticipant(part2, userIdentity);
                    Part part3 = (Part) lastOrNull;
                    boolean z = Intrinsics.areEqual(part2.getId(), part3 != null ? part3.getId() : null) && conversationClientState.getPendingMessages().isEmpty() && !conversationClientState.getFinStreamingData().isFinStreaming() && Intrinsics.areEqual(conversationClientState.getCurrentlyTypingState(), new CurrentlyTypingState(null, false, null, TypingIndicatorType.NONE, 7, null));
                    part2.setParentConversation(conversation);
                    ContentRow.BubbleMessageRow bubbleMessageRow = new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(part2, z, isAdminOrAltParticipant, conversationClientState.getFailedAttributeIdentifiers(), conversationClientState.getLoadingAttributeIdentifiers()), getGroupingPosition(plus, i4), null, false, false, 16, null);
                    if (shouldShowQuickReplies(part2, z, isAdminOrAltParticipant)) {
                        createListBuilder2.add(bubbleMessageRow);
                        List<ReplyOption> replyOptions3 = part2.getReplyOptions();
                        Intrinsics.checkNotNullExpressionValue(replyOptions3, "getReplyOptions(...)");
                        String id3 = part2.getId();
                        Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
                        add = createListBuilder2.add(new ContentRow.QuickRepliesRow(replyOptions3, id3));
                    } else {
                        add = createListBuilder2.add(bubbleMessageRow);
                    }
                }
                arrayList5.add(Boolean.valueOf(add));
                clientState = conversationClientState;
                i4 = i5;
            }
            createListBuilder.addAll(CollectionsKt.build(createListBuilder2));
            i = 1000;
            clientState = conversationClientState;
        }
        return CollectionsKt.build(createListBuilder);
    }

    private static final boolean shouldShowQuickReplies(Part part, boolean z, boolean z2) {
        if (!z) {
            return false;
        }
        List<ReplyOption> replyOptions = part.getReplyOptions();
        Intrinsics.checkNotNullExpressionValue(replyOptions, "getReplyOptions(...)");
        return !replyOptions.isEmpty() && z2;
    }

    public static final boolean isAdminOrAltParticipant(Part part, UserIdentity userIdentity) {
        Intrinsics.checkNotNullParameter(part, "part");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        return part.isAdmin() || !part.getParticipant().isUserWithId(userIdentity.getIntercomId());
    }

    private static final ContentRow reduceEvent(Part part) {
        ArrayList listOf;
        MessageStyle messageStyle = part.getMessageStyle();
        int i = messageStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageStyle.ordinal()];
        if (i == 1) {
            String status = part.getEventData().getStatus();
            String eventAsPlainText = part.getEventData().getEventAsPlainText();
            long createdAt = part.getCreatedAt();
            String customStateLabel = part.getEventData().getCustomStateLabel();
            String customStatePrefix = part.getEventData().getCustomStatePrefix();
            String id = part.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            return new ContentRow.TicketStatusRow(status, eventAsPlainText, createdAt, customStateLabel, customStatePrefix, id);
        }
        if (i == 2) {
            String mergedConversationId = part.getEventData().getMergedConversationId();
            String description = part.getEventData().getDescription();
            String id2 = part.getId();
            Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
            return new ContentRow.MergedConversationRow(description, mergedConversationId, id2);
        }
        if (!part.getEventData().getEventContent().isEmpty()) {
            List<EventContent> eventContent = part.getEventData().getEventContent();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(eventContent, 10));
            for (EventContent eventContent2 : eventContent) {
                arrayList.add(new EventLabelSegment(eventContent2.getText(), eventContent2.getWeight()));
            }
            listOf = arrayList;
        } else {
            listOf = CollectionsKt.listOf(new EventLabelSegment(part.getEventData().getEventAsPlainText(), null));
        }
        Avatar create = Avatar.create(part.getEventData().getParticipant().getAvatar().getImageUrl(), part.getEventData().getParticipant().getInitial());
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        String id3 = part.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getId(...)");
        return new ContentRow.EventRow(listOf, create, id3);
    }

    private static final boolean hasPendingMessageAfter(Part part, Map<String, PendingMessage> map) {
        Long l;
        long createdAt = part.getCreatedAt();
        Iterator<T> it = map.values().iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((PendingMessage) it.next()).getPart().getCreatedAt());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        Long l2 = l;
        return l2 != null && createdAt < l2.longValue();
    }

    public static final GroupingPosition getGroupingPosition(List<? extends Part> allParts, int i) {
        Intrinsics.checkNotNullParameter(allParts, "allParts");
        return (PartExtensionsKt.hasPreviousConcatPartNewStyle(allParts, i) && PartExtensionsKt.hasNextConcatPartNewStyle(allParts, i)) ? GroupingPosition.MIDDLE : PartExtensionsKt.hasPreviousConcatPartNewStyle(allParts, i) ? GroupingPosition.BOTTOM : PartExtensionsKt.hasNextConcatPartNewStyle(allParts, i) ? GroupingPosition.TOP : GroupingPosition.STANDALONE;
    }
}
