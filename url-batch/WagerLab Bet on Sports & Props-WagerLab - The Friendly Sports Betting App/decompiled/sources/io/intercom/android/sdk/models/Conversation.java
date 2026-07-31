package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.LastParticipatingAdmin;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: Conversation.kt */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020D0CJ\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0007J\f\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\u0007J\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020FJ\u0006\u0010K\u001a\u00020FJ\u0006\u0010L\u001a\u00020DJ\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J\t\u0010R\u001a\u00020\rHÆ\u0003J\t\u0010S\u001a\u00020\u000fHÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\t\u0010Z\u001a\u00020\u0018HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010 HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jñ\u0001\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010b\u001a\u00020\u00052\b\u0010c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010d\u001a\u00020eH×\u0001J\t\u0010f\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010'R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010&R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0018\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010&¨\u0006g"}, d2 = {"Lio/intercom/android/sdk/models/Conversation;", "", "id", "", "isRead", "", "participantBuilderList", "", "Lio/intercom/android/sdk/models/Participant$Builder;", "partBuilderList", "Lio/intercom/android/sdk/models/Part$Builder;", "groupConversationParticipantIds", "lastParticipatingAdminBuilder", "Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "composerState", "Lio/intercom/android/sdk/models/ComposerState;", "preventEndUserReplies", "inboundConversationsDisabled", "notificationStatus", "state", "isInbound", "ticket", "Lio/intercom/android/sdk/models/Ticket;", "uiFlags", "Lio/intercom/android/sdk/models/ConversationUiFlags;", "header", "Lio/intercom/android/sdk/models/Header;", "conversationEndedButton", "Lio/intercom/android/sdk/models/ConversationEndedButton;", "footerNotice", "Lio/intercom/android/sdk/models/FooterNotice;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "teamIntro", "specialNotice", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;Lio/intercom/android/sdk/models/ComposerState;ZZLjava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/Ticket;Lio/intercom/android/sdk/models/ConversationUiFlags;Lio/intercom/android/sdk/models/Header;Lio/intercom/android/sdk/models/ConversationEndedButton;Lio/intercom/android/sdk/models/FooterNotice;Lio/intercom/android/sdk/models/PoweredBy;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getParticipantBuilderList", "()Ljava/util/List;", "getPartBuilderList", "getGroupConversationParticipantIds", "getLastParticipatingAdminBuilder", "()Lio/intercom/android/sdk/models/LastParticipatingAdmin$Builder;", "getComposerState", "()Lio/intercom/android/sdk/models/ComposerState;", "getPreventEndUserReplies", "getInboundConversationsDisabled", "getNotificationStatus", "getState", "getTicket", "()Lio/intercom/android/sdk/models/Ticket;", "getUiFlags", "()Lio/intercom/android/sdk/models/ConversationUiFlags;", "getHeader", "()Lio/intercom/android/sdk/models/Header;", "getConversationEndedButton", "()Lio/intercom/android/sdk/models/ConversationEndedButton;", "getFooterNotice", "()Lio/intercom/android/sdk/models/FooterNotice;", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getTeamIntro", "getSpecialNotice", "getParticipants", "", "Lio/intercom/android/sdk/models/Participant;", "parts", "Lio/intercom/android/sdk/models/Part;", "groupConversationParticipants", "lastParticipatingAdmin", "Lio/intercom/android/sdk/models/LastParticipatingAdmin;", "lastPart", "getLastAdminPart", "lastAdmin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Conversation {
    public static final int $stable = 8;

    @SerializedName("composer_state")
    private final ComposerState composerState;

    @SerializedName("conversation_ended_button")
    private final ConversationEndedButton conversationEndedButton;

    @SerializedName("footer_notice")
    private final FooterNotice footerNotice;

    @SerializedName("group_conversation_participant_ids")
    private final List<String> groupConversationParticipantIds;
    private final Header header;
    private final String id;

    @SerializedName("inbound_conversations_disabled")
    private final boolean inboundConversationsDisabled;

    @SerializedName("is_inbound")
    private final boolean isInbound;

    @SerializedName("read")
    private final boolean isRead;

    @SerializedName("last_participating_admin")
    private final LastParticipatingAdmin.Builder lastParticipatingAdminBuilder;

    @SerializedName("notification_status")
    private final String notificationStatus;

    @SerializedName("conversation_parts")
    private final List<Part.Builder> partBuilderList;

    @SerializedName("participants")
    private final List<Participant.Builder> participantBuilderList;

    @SerializedName("powered_by")
    private final PoweredBy poweredBy;

    @SerializedName("prevent_end_user_replies")
    private final boolean preventEndUserReplies;

    @SerializedName("special_notice")
    private final String specialNotice;
    private final String state;

    @SerializedName("team_intro")
    private final String teamIntro;
    private final Ticket ticket;

    @SerializedName("ui_flags")
    private final ConversationUiFlags uiFlags;

    public Conversation() {
        this(null, false, null, null, null, null, null, false, false, null, null, false, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, boolean z, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str2, String str3, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str4, String str5, int i, Object obj) {
        String str6;
        String str7;
        String str8 = (i & 1) != 0 ? conversation.id : str;
        boolean z5 = (i & 2) != 0 ? conversation.isRead : z;
        List list4 = (i & 4) != 0 ? conversation.participantBuilderList : list;
        List list5 = (i & 8) != 0 ? conversation.partBuilderList : list2;
        List list6 = (i & 16) != 0 ? conversation.groupConversationParticipantIds : list3;
        LastParticipatingAdmin.Builder builder2 = (i & 32) != 0 ? conversation.lastParticipatingAdminBuilder : builder;
        ComposerState composerState2 = (i & 64) != 0 ? conversation.composerState : composerState;
        boolean z6 = (i & 128) != 0 ? conversation.preventEndUserReplies : z2;
        boolean z7 = (i & 256) != 0 ? conversation.inboundConversationsDisabled : z3;
        String str9 = (i & 512) != 0 ? conversation.notificationStatus : str2;
        String str10 = (i & 1024) != 0 ? conversation.state : str3;
        boolean z8 = (i & 2048) != 0 ? conversation.isInbound : z4;
        Ticket ticket2 = (i & 4096) != 0 ? conversation.ticket : ticket;
        ConversationUiFlags conversationUiFlags2 = (i & 8192) != 0 ? conversation.uiFlags : conversationUiFlags;
        String str11 = str8;
        Header header2 = (i & 16384) != 0 ? conversation.header : header;
        ConversationEndedButton conversationEndedButton2 = (i & 32768) != 0 ? conversation.conversationEndedButton : conversationEndedButton;
        FooterNotice footerNotice2 = (i & 65536) != 0 ? conversation.footerNotice : footerNotice;
        PoweredBy poweredBy2 = (i & 131072) != 0 ? conversation.poweredBy : poweredBy;
        String str12 = (i & 262144) != 0 ? conversation.teamIntro : str4;
        if ((i & 524288) != 0) {
            str7 = str12;
            str6 = conversation.specialNotice;
        } else {
            str6 = str5;
            str7 = str12;
        }
        return conversation.copy(str11, z5, list4, list5, list6, builder2, composerState2, z6, z7, str9, str10, z8, ticket2, conversationUiFlags2, header2, conversationEndedButton2, footerNotice2, poweredBy2, str7, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    /* renamed from: component11, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsInbound() {
        return this.isInbound;
    }

    /* renamed from: component13, reason: from getter */
    public final Ticket getTicket() {
        return this.ticket;
    }

    /* renamed from: component14, reason: from getter */
    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    /* renamed from: component15, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    /* renamed from: component16, reason: from getter */
    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    /* renamed from: component17, reason: from getter */
    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    /* renamed from: component18, reason: from getter */
    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    /* renamed from: component19, reason: from getter */
    public final String getTeamIntro() {
        return this.teamIntro;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    /* renamed from: component20, reason: from getter */
    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final List<Participant.Builder> component3() {
        return this.participantBuilderList;
    }

    public final List<Part.Builder> component4() {
        return this.partBuilderList;
    }

    public final List<String> component5() {
        return this.groupConversationParticipantIds;
    }

    /* renamed from: component6, reason: from getter */
    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    /* renamed from: component7, reason: from getter */
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    public final Conversation copy(String id, boolean isRead, List<Participant.Builder> participantBuilderList, List<Part.Builder> partBuilderList, List<String> groupConversationParticipantIds, LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, ComposerState composerState, boolean preventEndUserReplies, boolean inboundConversationsDisabled, String notificationStatus, String state, boolean isInbound, Ticket ticket, ConversationUiFlags uiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String teamIntro, String specialNotice) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(participantBuilderList, "participantBuilderList");
        Intrinsics.checkNotNullParameter(partBuilderList, "partBuilderList");
        Intrinsics.checkNotNullParameter(groupConversationParticipantIds, "groupConversationParticipantIds");
        Intrinsics.checkNotNullParameter(lastParticipatingAdminBuilder, "lastParticipatingAdminBuilder");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(notificationStatus, "notificationStatus");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uiFlags, "uiFlags");
        return new Conversation(id, isRead, participantBuilderList, partBuilderList, groupConversationParticipantIds, lastParticipatingAdminBuilder, composerState, preventEndUserReplies, inboundConversationsDisabled, notificationStatus, state, isInbound, ticket, uiFlags, header, conversationEndedButton, footerNotice, poweredBy, teamIntro, specialNotice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) other;
        return Intrinsics.areEqual(this.id, conversation.id) && this.isRead == conversation.isRead && Intrinsics.areEqual(this.participantBuilderList, conversation.participantBuilderList) && Intrinsics.areEqual(this.partBuilderList, conversation.partBuilderList) && Intrinsics.areEqual(this.groupConversationParticipantIds, conversation.groupConversationParticipantIds) && Intrinsics.areEqual(this.lastParticipatingAdminBuilder, conversation.lastParticipatingAdminBuilder) && Intrinsics.areEqual(this.composerState, conversation.composerState) && this.preventEndUserReplies == conversation.preventEndUserReplies && this.inboundConversationsDisabled == conversation.inboundConversationsDisabled && Intrinsics.areEqual(this.notificationStatus, conversation.notificationStatus) && Intrinsics.areEqual(this.state, conversation.state) && this.isInbound == conversation.isInbound && Intrinsics.areEqual(this.ticket, conversation.ticket) && Intrinsics.areEqual(this.uiFlags, conversation.uiFlags) && Intrinsics.areEqual(this.header, conversation.header) && Intrinsics.areEqual(this.conversationEndedButton, conversation.conversationEndedButton) && Intrinsics.areEqual(this.footerNotice, conversation.footerNotice) && Intrinsics.areEqual(this.poweredBy, conversation.poweredBy) && Intrinsics.areEqual(this.teamIntro, conversation.teamIntro) && Intrinsics.areEqual(this.specialNotice, conversation.specialNotice);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.id.hashCode() * 31) + Boolean.hashCode(this.isRead)) * 31) + this.participantBuilderList.hashCode()) * 31) + this.partBuilderList.hashCode()) * 31) + this.groupConversationParticipantIds.hashCode()) * 31) + this.lastParticipatingAdminBuilder.hashCode()) * 31) + this.composerState.hashCode()) * 31) + Boolean.hashCode(this.preventEndUserReplies)) * 31) + Boolean.hashCode(this.inboundConversationsDisabled)) * 31) + this.notificationStatus.hashCode()) * 31) + this.state.hashCode()) * 31) + Boolean.hashCode(this.isInbound)) * 31;
        Ticket ticket = this.ticket;
        int hashCode2 = (((hashCode + (ticket == null ? 0 : ticket.hashCode())) * 31) + this.uiFlags.hashCode()) * 31;
        Header header = this.header;
        int hashCode3 = (hashCode2 + (header == null ? 0 : header.hashCode())) * 31;
        ConversationEndedButton conversationEndedButton = this.conversationEndedButton;
        int hashCode4 = (hashCode3 + (conversationEndedButton == null ? 0 : conversationEndedButton.hashCode())) * 31;
        FooterNotice footerNotice = this.footerNotice;
        int hashCode5 = (hashCode4 + (footerNotice == null ? 0 : footerNotice.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int hashCode6 = (hashCode5 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31;
        String str = this.teamIntro;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.specialNotice;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Conversation(id=");
        sb.append(this.id).append(", isRead=").append(this.isRead).append(", participantBuilderList=").append(this.participantBuilderList).append(", partBuilderList=").append(this.partBuilderList).append(", groupConversationParticipantIds=").append(this.groupConversationParticipantIds).append(", lastParticipatingAdminBuilder=").append(this.lastParticipatingAdminBuilder).append(", composerState=").append(this.composerState).append(", preventEndUserReplies=").append(this.preventEndUserReplies).append(", inboundConversationsDisabled=").append(this.inboundConversationsDisabled).append(", notificationStatus=").append(this.notificationStatus).append(", state=").append(this.state).append(", isInbound=");
        sb.append(this.isInbound).append(", ticket=").append(this.ticket).append(", uiFlags=").append(this.uiFlags).append(", header=").append(this.header).append(", conversationEndedButton=").append(this.conversationEndedButton).append(", footerNotice=").append(this.footerNotice).append(", poweredBy=").append(this.poweredBy).append(", teamIntro=").append(this.teamIntro).append(", specialNotice=").append(this.specialNotice).append(')');
        return sb.toString();
    }

    public Conversation(String id, boolean z, List<Participant.Builder> participantBuilderList, List<Part.Builder> partBuilderList, List<String> groupConversationParticipantIds, LastParticipatingAdmin.Builder lastParticipatingAdminBuilder, ComposerState composerState, boolean z2, boolean z3, String notificationStatus, String state, boolean z4, Ticket ticket, ConversationUiFlags uiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(participantBuilderList, "participantBuilderList");
        Intrinsics.checkNotNullParameter(partBuilderList, "partBuilderList");
        Intrinsics.checkNotNullParameter(groupConversationParticipantIds, "groupConversationParticipantIds");
        Intrinsics.checkNotNullParameter(lastParticipatingAdminBuilder, "lastParticipatingAdminBuilder");
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(notificationStatus, "notificationStatus");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uiFlags, "uiFlags");
        this.id = id;
        this.isRead = z;
        this.participantBuilderList = participantBuilderList;
        this.partBuilderList = partBuilderList;
        this.groupConversationParticipantIds = groupConversationParticipantIds;
        this.lastParticipatingAdminBuilder = lastParticipatingAdminBuilder;
        this.composerState = composerState;
        this.preventEndUserReplies = z2;
        this.inboundConversationsDisabled = z3;
        this.notificationStatus = notificationStatus;
        this.state = state;
        this.isInbound = z4;
        this.ticket = ticket;
        this.uiFlags = uiFlags;
        this.header = header;
        this.conversationEndedButton = conversationEndedButton;
        this.footerNotice = footerNotice;
        this.poweredBy = poweredBy;
        this.teamIntro = str;
        this.specialNotice = str2;
    }

    public /* synthetic */ Conversation(String str, boolean z, List list, List list2, List list3, LastParticipatingAdmin.Builder builder, ComposerState composerState, boolean z2, boolean z3, String str2, String str3, boolean z4, Ticket ticket, ConversationUiFlags conversationUiFlags, Header header, ConversationEndedButton conversationEndedButton, FooterNotice footerNotice, PoweredBy poweredBy, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? CollectionsKt.emptyList() : list3, (i & 32) != 0 ? new LastParticipatingAdmin.Builder() : builder, (i & 64) != 0 ? ComposerState.INSTANCE.getNULL() : composerState, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? "" : str2, (i & 1024) == 0 ? str3 : "", (i & 2048) == 0 ? z4 : false, (i & 4096) != 0 ? null : ticket, (i & 8192) != 0 ? ConversationUiFlags.INSTANCE.getDEFAULT() : conversationUiFlags, (i & 16384) != 0 ? null : header, (i & 32768) != 0 ? null : conversationEndedButton, (i & 65536) != 0 ? null : footerNotice, (i & 131072) != 0 ? null : poweredBy, (i & 262144) != 0 ? null : str4, (i & 524288) != 0 ? null : str5);
    }

    public final String getId() {
        return this.id;
    }

    public final boolean isRead() {
        return this.isRead;
    }

    public final List<Participant.Builder> getParticipantBuilderList() {
        return this.participantBuilderList;
    }

    public final List<Part.Builder> getPartBuilderList() {
        return this.partBuilderList;
    }

    public final List<String> getGroupConversationParticipantIds() {
        return this.groupConversationParticipantIds;
    }

    public final LastParticipatingAdmin.Builder getLastParticipatingAdminBuilder() {
        return this.lastParticipatingAdminBuilder;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public final boolean getPreventEndUserReplies() {
        return this.preventEndUserReplies;
    }

    public final boolean getInboundConversationsDisabled() {
        return this.inboundConversationsDisabled;
    }

    public final String getNotificationStatus() {
        return this.notificationStatus;
    }

    public final String getState() {
        return this.state;
    }

    public final boolean isInbound() {
        return this.isInbound;
    }

    public final Ticket getTicket() {
        return this.ticket;
    }

    public final ConversationUiFlags getUiFlags() {
        return this.uiFlags;
    }

    public final Header getHeader() {
        return this.header;
    }

    public final ConversationEndedButton getConversationEndedButton() {
        return this.conversationEndedButton;
    }

    public final FooterNotice getFooterNotice() {
        return this.footerNotice;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final String getTeamIntro() {
        return this.teamIntro;
    }

    public final String getSpecialNotice() {
        return this.specialNotice;
    }

    public final Map<String, Participant> getParticipants() {
        List<Participant.Builder> list = this.participantBuilderList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Participant.Builder builder : list) {
            Pair pair = TuplesKt.to(builder.build().getId(), builder.build());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public final List<Part> parts() {
        List<Part.Builder> list = this.partBuilderList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Part build = ((Part.Builder) it.next()).build();
            Participant participant = getParticipants().get(build.getParticipantId());
            if (participant != null) {
                build.setParticipant(participant);
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    public final List<Participant> groupConversationParticipants() {
        List<String> list = this.groupConversationParticipantIds;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Participant participant = getParticipants().get((String) it.next());
            if (participant != null) {
                arrayList.add(participant);
            }
        }
        return arrayList;
    }

    public final LastParticipatingAdmin lastParticipatingAdmin() {
        LastParticipatingAdmin build = this.lastParticipatingAdminBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final Part lastPart() {
        Part part = (Part) CollectionsKt.lastOrNull((List) parts());
        if (part != null) {
            return part;
        }
        Part NULL = Part.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        return NULL;
    }

    public final Part getLastAdminPart() {
        Part part;
        List<Part> parts = parts();
        ListIterator<Part> listIterator = parts.listIterator(parts.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                part = null;
                break;
            }
            part = listIterator.previous();
            if (part.isAdmin()) {
                break;
            }
        }
        Part part2 = part;
        if (part2 != null) {
            return part2;
        }
        Part NULL = Part.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        return NULL;
    }

    public final Participant lastAdmin() {
        Object obj = null;
        for (Object obj2 : getParticipants().values()) {
            if (((Participant) obj2).isAdmin()) {
                obj = obj2;
            }
        }
        Participant participant = (Participant) obj;
        if (participant != null) {
            return participant;
        }
        Participant NULL = Participant.NULL;
        Intrinsics.checkNotNullExpressionValue(NULL, "NULL");
        return NULL;
    }
}
