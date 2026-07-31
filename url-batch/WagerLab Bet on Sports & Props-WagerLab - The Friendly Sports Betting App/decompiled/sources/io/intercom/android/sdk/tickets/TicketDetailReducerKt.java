package io.intercom.android.sdk.tickets;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketLaunchedFrom;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketDetailReducer.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002\u001a\u0014\u0010\u0012\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0010*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0013*\u00020\u0017H\u0000¨\u0006\u0018"}, d2 = {"computeTicketViewState", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", "ticket", "Lio/intercom/android/sdk/models/Ticket;", Participant.USER_TYPE, "Lio/intercom/android/sdk/identity/UserIdentity;", "activeAdminsAvatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "launchedFrom", "Lio/intercom/android/sdk/tickets/TicketLaunchedFrom;", "conversationButtonState", "Lio/intercom/android/sdk/tickets/ConversationButtonState;", "conversationButton", "Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "isUnassignedOrBot", "", "Lio/intercom/android/sdk/models/Participant;", "isDone", "Lio/intercom/android/sdk/tickets/TicketStatus;", "currentTicketStatus", "isLoading", "toTicketStatus", "Lio/intercom/android/sdk/models/Ticket$Status;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketDetailReducerKt {

    /* compiled from: TicketDetailReducer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ticket.ConversationButton.IconType.values().length];
            try {
                iArr[Ticket.ConversationButton.IconType.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ticket.ConversationButton.IconType.CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ TicketDetailState.TicketDetailContentState computeTicketViewState$default(Ticket ticket, UserIdentity userIdentity, List list, TicketLaunchedFrom ticketLaunchedFrom, int i, Object obj) {
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        return computeTicketViewState(ticket, userIdentity, list, ticketLaunchedFrom);
    }

    public static final TicketDetailState.TicketDetailContentState computeTicketViewState(Ticket ticket, UserIdentity user, List<AvatarWrapper> activeAdminsAvatars, TicketLaunchedFrom launchedFrom) {
        List listOf;
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(activeAdminsAvatars, "activeAdminsAvatars");
        Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
        String title = ticket.getTitle();
        Participant build = ticket.getAssignee().build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        if (isUnassignedOrBot(build) && !activeAdminsAvatars.isEmpty()) {
            listOf = CollectionsKt.take(activeAdminsAvatars, 3);
        } else {
            Avatar avatar = ticket.getAssignee().build().getAvatar();
            Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
            listOf = CollectionsKt.listOf(new AvatarWrapper(avatar, false, 2, null));
        }
        List list = listOf;
        String statusDetail = ticket.getCurrentStatus().getStatusDetail();
        long color = toTicketStatus(ticket.getCurrentStatus()).getColor();
        List<Ticket.Status> statusList = ticket.getStatusList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(statusList, 10));
        for (Ticket.Status status : statusList) {
            arrayList.add(new TicketTimelineCardState.ProgressSection(isDone(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus())), isLoading(toTicketStatus(status), toTicketStatus(ticket.getCurrentStatus()))));
        }
        TicketTimelineCardState ticketTimelineCardState = new TicketTimelineCardState(list, statusDetail, "", color, arrayList, ticket.getCurrentStatus().getTitle(), Long.valueOf(ticket.getLatestStatusUpdatedAt()), null);
        List<Ticket.TicketAttribute> attributes = ticket.getAttributes();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : attributes) {
            if (((Ticket.TicketAttribute) obj).hasValue()) {
                arrayList2.add(obj);
            }
        }
        String email = user.getEmail();
        Intrinsics.checkNotNullExpressionValue(email, "getEmail(...)");
        return new TicketDetailState.TicketDetailContentState(title, ticketTimelineCardState, arrayList2, email, ticket.getConversationId(), conversationButtonState(ticket.getConversationButton(), launchedFrom));
    }

    private static final ConversationButtonState conversationButtonState(Ticket.ConversationButton conversationButton, TicketLaunchedFrom ticketLaunchedFrom) {
        String str;
        boolean z = ((ticketLaunchedFrom instanceof TicketLaunchedFrom.Conversation) || conversationButton == null) ? false : true;
        Integer num = null;
        Ticket.ConversationButton.IconType icon = conversationButton != null ? conversationButton.getIcon() : null;
        int i = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i == 1) {
            num = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i == 2) {
            num = Integer.valueOf(R.drawable.intercom_messages_icon);
        }
        if (conversationButton == null || (str = conversationButton.getText()) == null) {
            str = "";
        }
        return new ConversationButtonState(z, num, new StringProvider.ActualString(str));
    }

    private static final boolean isUnassignedOrBot(Participant participant) {
        return Intrinsics.areEqual(participant, Participant.create("", "", Participant.USER_TYPE, "", Avatar.create("", ""), false)) || participant.isBot().booleanValue();
    }

    public static final boolean isDone(TicketStatus ticketStatus, TicketStatus currentTicketStatus) {
        Intrinsics.checkNotNullParameter(ticketStatus, "<this>");
        Intrinsics.checkNotNullParameter(currentTicketStatus, "currentTicketStatus");
        return currentTicketStatus.ordinal() >= ticketStatus.ordinal();
    }

    public static final boolean isLoading(TicketStatus ticketStatus, TicketStatus currentTicketStatus) {
        Intrinsics.checkNotNullParameter(ticketStatus, "<this>");
        Intrinsics.checkNotNullParameter(currentTicketStatus, "currentTicketStatus");
        return currentTicketStatus.ordinal() == ticketStatus.ordinal() && currentTicketStatus.ordinal() < ArraysKt.getLastIndex(TicketStatus.values());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final TicketStatus toTicketStatus(Ticket.Status status) {
        Intrinsics.checkNotNullParameter(status, "<this>");
        String type = status.getType();
        switch (type.hashCode()) {
            case -882067636:
                if (type.equals("waiting_on_customer")) {
                    return TicketStatus.WaitingOnCustomer;
                }
                break;
            case -753541113:
                if (type.equals("in_progress")) {
                    return TicketStatus.InProgress;
                }
                break;
            case -341328904:
                if (type.equals("resolved")) {
                    return TicketStatus.Resolved;
                }
                break;
            case 348678395:
                if (type.equals(MetricTracker.Action.SUBMITTED)) {
                    return TicketStatus.Submitted;
                }
                break;
        }
        return TicketStatus.Submitted;
    }
}
