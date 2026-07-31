package io.intercom.android.sdk.models;

import com.amazon.a.a.o.b;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import expo.modules.notifications.service.NotificationsService;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Ticket.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b3\b\u0081\b\u0018\u0000 K2\u00020\u0001:\u0004HIJKB±\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000e0\fHÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0012HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0002\u0010/J\t\u0010A\u001a\u00020\u0019HÆ\u0003J¸\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019HÇ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010F\u001a\u00020\u0010H×\u0001J\t\u0010G\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b\u0016\u0010/R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006L"}, d2 = {"Lio/intercom/android/sdk/models/Ticket;", "", "id", "", "publicId", "title", "description", b.j, "emoji", "currentStatus", "Lio/intercom/android/sdk/models/Ticket$Status;", "statusList", "", "attributes", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "ticketTypeId", "", "assignee", "Lio/intercom/android/sdk/models/Participant$Builder;", "conversationId", "conversationButton", "Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "isRead", "", "latestStatusUpdatedAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$Status;Ljava/util/List;Ljava/util/List;ILio/intercom/android/sdk/models/Participant$Builder;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$ConversationButton;Ljava/lang/Boolean;J)V", "getId", "()Ljava/lang/String;", "getPublicId", "getTitle", "getDescription", "getIconUrl", "getEmoji", "getCurrentStatus", "()Lio/intercom/android/sdk/models/Ticket$Status;", "getStatusList", "()Ljava/util/List;", "getAttributes", "getTicketTypeId", "()I", "getAssignee", "()Lio/intercom/android/sdk/models/Participant$Builder;", "getConversationId", "getConversationButton", "()Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLatestStatusUpdatedAt", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$Status;Ljava/util/List;Ljava/util/List;ILio/intercom/android/sdk/models/Participant$Builder;Ljava/lang/String;Lio/intercom/android/sdk/models/Ticket$ConversationButton;Ljava/lang/Boolean;J)Lio/intercom/android/sdk/models/Ticket;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Status", "TicketAttribute", "ConversationButton", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Ticket {

    @SerializedName("assignee")
    private final Participant.Builder assignee;

    @SerializedName("attributes")
    private final List<TicketAttribute> attributes;

    @SerializedName("conversation_button")
    private final ConversationButton conversationButton;

    @SerializedName(CreateTicketDestinationKt.CONVERSATION_ID)
    private final String conversationId;

    @SerializedName("current_status")
    private final Status currentStatus;

    @SerializedName("description")
    private final String description;

    @SerializedName("emoji")
    private final String emoji;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName("id")
    private final String id;

    @SerializedName("read")
    private final Boolean isRead;

    @SerializedName("latest_status_updated_at")
    private final long latestStatusUpdatedAt;

    @SerializedName("public_ticket_id")
    private final String publicId;

    @SerializedName("status_list")
    private final List<Status> statusList;

    @SerializedName(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    @SerializedName("title")
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Ticket NULL = new Ticket(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, 32767, null);

    public Ticket() {
        this(null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0L, 32767, null);
    }

    public static /* synthetic */ Ticket copy$default(Ticket ticket, String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, int i, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j, int i2, Object obj) {
        long j2;
        String str8;
        String str9 = (i2 & 1) != 0 ? ticket.id : str;
        String str10 = (i2 & 2) != 0 ? ticket.publicId : str2;
        String str11 = (i2 & 4) != 0 ? ticket.title : str3;
        String str12 = (i2 & 8) != 0 ? ticket.description : str4;
        String str13 = (i2 & 16) != 0 ? ticket.iconUrl : str5;
        String str14 = (i2 & 32) != 0 ? ticket.emoji : str6;
        Status status2 = (i2 & 64) != 0 ? ticket.currentStatus : status;
        List list3 = (i2 & 128) != 0 ? ticket.statusList : list;
        List list4 = (i2 & 256) != 0 ? ticket.attributes : list2;
        int i3 = (i2 & 512) != 0 ? ticket.ticketTypeId : i;
        Participant.Builder builder2 = (i2 & 1024) != 0 ? ticket.assignee : builder;
        String str15 = (i2 & 2048) != 0 ? ticket.conversationId : str7;
        ConversationButton conversationButton2 = (i2 & 4096) != 0 ? ticket.conversationButton : conversationButton;
        Boolean bool2 = (i2 & 8192) != 0 ? ticket.isRead : bool;
        if ((i2 & 16384) != 0) {
            str8 = str9;
            j2 = ticket.latestStatusUpdatedAt;
        } else {
            j2 = j;
            str8 = str9;
        }
        return ticket.copy(str8, str10, str11, str12, str13, str14, status2, list3, list4, i3, builder2, str15, conversationButton2, bool2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    /* renamed from: component11, reason: from getter */
    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    /* renamed from: component12, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* renamed from: component13, reason: from getter */
    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    /* renamed from: component14, reason: from getter */
    public final Boolean getIsRead() {
        return this.isRead;
    }

    /* renamed from: component15, reason: from getter */
    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPublicId() {
        return this.publicId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEmoji() {
        return this.emoji;
    }

    /* renamed from: component7, reason: from getter */
    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    public final List<Status> component8() {
        return this.statusList;
    }

    public final List<TicketAttribute> component9() {
        return this.attributes;
    }

    public final Ticket copy(String id, String publicId, String title, String description, String iconUrl, String emoji, Status currentStatus, List<Status> statusList, List<? extends TicketAttribute> attributes, int ticketTypeId, Participant.Builder assignee, String conversationId, ConversationButton conversationButton, Boolean isRead, long latestStatusUpdatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(currentStatus, "currentStatus");
        Intrinsics.checkNotNullParameter(statusList, "statusList");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(assignee, "assignee");
        return new Ticket(id, publicId, title, description, iconUrl, emoji, currentStatus, statusList, attributes, ticketTypeId, assignee, conversationId, conversationButton, isRead, latestStatusUpdatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) other;
        return Intrinsics.areEqual(this.id, ticket.id) && Intrinsics.areEqual(this.publicId, ticket.publicId) && Intrinsics.areEqual(this.title, ticket.title) && Intrinsics.areEqual(this.description, ticket.description) && Intrinsics.areEqual(this.iconUrl, ticket.iconUrl) && Intrinsics.areEqual(this.emoji, ticket.emoji) && Intrinsics.areEqual(this.currentStatus, ticket.currentStatus) && Intrinsics.areEqual(this.statusList, ticket.statusList) && Intrinsics.areEqual(this.attributes, ticket.attributes) && this.ticketTypeId == ticket.ticketTypeId && Intrinsics.areEqual(this.assignee, ticket.assignee) && Intrinsics.areEqual(this.conversationId, ticket.conversationId) && Intrinsics.areEqual(this.conversationButton, ticket.conversationButton) && Intrinsics.areEqual(this.isRead, ticket.isRead) && this.latestStatusUpdatedAt == ticket.latestStatusUpdatedAt;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.publicId;
        int hashCode2 = (((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.emoji.hashCode()) * 31) + this.currentStatus.hashCode()) * 31) + this.statusList.hashCode()) * 31) + this.attributes.hashCode()) * 31) + Integer.hashCode(this.ticketTypeId)) * 31) + this.assignee.hashCode()) * 31;
        String str2 = this.conversationId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConversationButton conversationButton = this.conversationButton;
        int hashCode4 = (hashCode3 + (conversationButton == null ? 0 : conversationButton.hashCode())) * 31;
        Boolean bool = this.isRead;
        return ((hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31) + Long.hashCode(this.latestStatusUpdatedAt);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Ticket(id=");
        sb.append(this.id).append(", publicId=").append(this.publicId).append(", title=").append(this.title).append(", description=").append(this.description).append(", iconUrl=").append(this.iconUrl).append(", emoji=").append(this.emoji).append(", currentStatus=").append(this.currentStatus).append(", statusList=").append(this.statusList).append(", attributes=").append(this.attributes).append(", ticketTypeId=").append(this.ticketTypeId).append(", assignee=").append(this.assignee).append(", conversationId=");
        sb.append(this.conversationId).append(", conversationButton=").append(this.conversationButton).append(", isRead=").append(this.isRead).append(", latestStatusUpdatedAt=").append(this.latestStatusUpdatedAt).append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticket(String id, String str, String title, String description, String iconUrl, String emoji, Status currentStatus, List<Status> statusList, List<? extends TicketAttribute> attributes, int i, Participant.Builder assignee, String str2, ConversationButton conversationButton, Boolean bool, long j) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        Intrinsics.checkNotNullParameter(currentStatus, "currentStatus");
        Intrinsics.checkNotNullParameter(statusList, "statusList");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(assignee, "assignee");
        this.id = id;
        this.publicId = str;
        this.title = title;
        this.description = description;
        this.iconUrl = iconUrl;
        this.emoji = emoji;
        this.currentStatus = currentStatus;
        this.statusList = statusList;
        this.attributes = attributes;
        this.ticketTypeId = i;
        this.assignee = assignee;
        this.conversationId = str2;
        this.conversationButton = conversationButton;
        this.isRead = bool;
        this.latestStatusUpdatedAt = j;
    }

    public /* synthetic */ Ticket(String str, String str2, String str3, String str4, String str5, String str6, Status status, List list, List list2, int i, Participant.Builder builder, String str7, ConversationButton conversationButton, Boolean bool, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) == 0 ? str6 : "", (i2 & 64) != 0 ? new Status(null, null, null, false, 0L, 31, null) : status, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list, (i2 & 256) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 512) != 0 ? 0 : i, (i2 & 1024) != 0 ? new Participant.Builder() : builder, (i2 & 2048) != 0 ? null : str7, (i2 & 4096) != 0 ? null : conversationButton, (i2 & 8192) == 0 ? bool : null, (i2 & 16384) != 0 ? 0L : j);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPublicId() {
        return this.publicId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getEmoji() {
        return this.emoji;
    }

    public final Status getCurrentStatus() {
        return this.currentStatus;
    }

    public final List<Status> getStatusList() {
        return this.statusList;
    }

    public final List<TicketAttribute> getAttributes() {
        return this.attributes;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final Participant.Builder getAssignee() {
        return this.assignee;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final ConversationButton getConversationButton() {
        return this.conversationButton;
    }

    public final Boolean isRead() {
        return this.isRead;
    }

    public final long getLatestStatusUpdatedAt() {
        return this.latestStatusUpdatedAt;
    }

    /* compiled from: Ticket.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$Status;", "", "title", "", "type", "statusDetail", "isCurrentStatus", "", "createdDate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJ)V", "getTitle", "()Ljava/lang/String;", "getType", "getStatusDetail", "()Z", "getCreatedDate", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Status {
        public static final int $stable = 0;

        @SerializedName("created_date")
        private final long createdDate;

        @SerializedName("is_current_status")
        private final boolean isCurrentStatus;

        @SerializedName("status_detail")
        private final String statusDetail;

        @SerializedName("title")
        private final String title;

        @SerializedName("type")
        private final String type;

        public Status() {
            this(null, null, null, false, 0L, 31, null);
        }

        public static /* synthetic */ Status copy$default(Status status, String str, String str2, String str3, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = status.title;
            }
            if ((i & 2) != 0) {
                str2 = status.type;
            }
            if ((i & 4) != 0) {
                str3 = status.statusDetail;
            }
            if ((i & 8) != 0) {
                z = status.isCurrentStatus;
            }
            if ((i & 16) != 0) {
                j = status.createdDate;
            }
            long j2 = j;
            return status.copy(str, str2, str3, z, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStatusDetail() {
            return this.statusDetail;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsCurrentStatus() {
            return this.isCurrentStatus;
        }

        /* renamed from: component5, reason: from getter */
        public final long getCreatedDate() {
            return this.createdDate;
        }

        public final Status copy(String title, String type, String statusDetail, boolean isCurrentStatus, long createdDate) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(statusDetail, "statusDetail");
            return new Status(title, type, statusDetail, isCurrentStatus, createdDate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return Intrinsics.areEqual(this.title, status.title) && Intrinsics.areEqual(this.type, status.type) && Intrinsics.areEqual(this.statusDetail, status.statusDetail) && this.isCurrentStatus == status.isCurrentStatus && this.createdDate == status.createdDate;
        }

        public int hashCode() {
            return (((((((this.title.hashCode() * 31) + this.type.hashCode()) * 31) + this.statusDetail.hashCode()) * 31) + Boolean.hashCode(this.isCurrentStatus)) * 31) + Long.hashCode(this.createdDate);
        }

        public String toString() {
            return "Status(title=" + this.title + ", type=" + this.type + ", statusDetail=" + this.statusDetail + ", isCurrentStatus=" + this.isCurrentStatus + ", createdDate=" + this.createdDate + ')';
        }

        public Status(String title, String type, String statusDetail, boolean z, long j) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(statusDetail, "statusDetail");
            this.title = title;
            this.type = type;
            this.statusDetail = statusDetail;
            this.isCurrentStatus = z;
            this.createdDate = j;
        }

        public /* synthetic */ Status(String str, String str2, String str3, boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 0L : j);
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getType() {
            return this.type;
        }

        public final String getStatusDetail() {
            return this.statusDetail;
        }

        public final boolean isCurrentStatus() {
            return this.isCurrentStatus;
        }

        public final long getCreatedDate() {
            return this.createdDate;
        }
    }

    /* compiled from: Ticket.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019B9\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0007H&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0005\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "", "id", "", NotificationsService.IDENTIFIER_KEY, "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;)V", "getId", "()Ljava/lang/String;", "getIdentifier", "getName", "getRequired", "()Z", "getType", "()Lio/intercom/android/sdk/models/TicketAttributeType;", "hasValue", "PrimitiveAttribute", "ListAttribute", "DateTimeAttribute", "FilesAttribute", "UnSupported", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$DateTimeAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$ListAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$PrimitiveAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$UnSupported;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TicketAttribute {
        public static final int $stable = 0;

        @SerializedName("id")
        private final String id;

        @SerializedName(NotificationsService.IDENTIFIER_KEY)
        private final String identifier;

        @SerializedName("name")
        private final String name;

        @SerializedName("required")
        private final boolean required;

        @SerializedName("type")
        private final TicketAttributeType type;

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, z, ticketAttributeType);
        }

        public abstract boolean hasValue();

        private TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType) {
            this.id = str;
            this.identifier = str2;
            this.name = str3;
            this.required = z;
            this.type = ticketAttributeType;
        }

        public /* synthetic */ TicketAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, ticketAttributeType, null);
        }

        public final String getId() {
            return this.id;
        }

        public final String getIdentifier() {
            return this.identifier;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public final TicketAttributeType getType() {
            return this.type;
        }

        /* compiled from: Ticket.kt */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$PrimitiveAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", NotificationsService.IDENTIFIER_KEY, "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class PrimitiveAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public PrimitiveAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            public /* synthetic */ PrimitiveAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.STRING : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            public final String getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PrimitiveAttribute(String id, String identifier, String name, boolean z, TicketAttributeType type, String value) {
                super(id, identifier, name, z, type, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.isBlank(this.value);
            }
        }

        /* compiled from: Ticket.kt */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$ListAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", NotificationsService.IDENTIFIER_KEY, "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ListAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public ListAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            public /* synthetic */ ListAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.LIST : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            public final String getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ListAttribute(String id, String identifier, String name, boolean z, TicketAttributeType type, String value) {
                super(id, identifier, name, z, type, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.isBlank(this.value);
            }
        }

        /* compiled from: Ticket.kt */
        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$DateTimeAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", NotificationsService.IDENTIFIER_KEY, "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class DateTimeAttribute extends TicketAttribute {
            public static final int $stable = 0;

            @SerializedName("value")
            private final String value;

            public DateTimeAttribute() {
                this(null, null, null, false, null, null, 63, null);
            }

            public /* synthetic */ DateTimeAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? TicketAttributeType.DATETIME : ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            public final String getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DateTimeAttribute(String id, String identifier, String name, boolean z, TicketAttributeType type, String value) {
                super(id, identifier, name, z, type, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.isBlank(this.value);
            }
        }

        /* compiled from: Ticket.kt */
        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0007H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", NotificationsService.IDENTIFIER_KEY, "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/util/List;)V", "getValue", "()Ljava/util/List;", "hasValue", "File", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FilesAttribute extends TicketAttribute {
            public static final int $stable = 8;

            @SerializedName("value")
            private final List<File> value;

            public /* synthetic */ FilesAttribute(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, ticketAttributeType, list);
            }

            public final List<File> getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FilesAttribute(String id, String identifier, String name, boolean z, TicketAttributeType type, List<File> value) {
                super(id, identifier, name, z, type, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !this.value.isEmpty();
            }

            /* compiled from: Ticket.kt */
            @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$FilesAttribute$File;", "", "id", "", "name", "url", "fileType", "Lio/intercom/android/sdk/models/FileType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/FileType;)V", "getId", "()Ljava/lang/String;", "getName", "getUrl", "getFileType", "()Lio/intercom/android/sdk/models/FileType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class File {
                public static final int $stable = 0;

                @SerializedName("media_type")
                private final FileType fileType;

                @SerializedName("id")
                private final String id;

                @SerializedName("name")
                private final String name;

                @SerializedName("url")
                private final String url;

                public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, FileType fileType, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = file.id;
                    }
                    if ((i & 2) != 0) {
                        str2 = file.name;
                    }
                    if ((i & 4) != 0) {
                        str3 = file.url;
                    }
                    if ((i & 8) != 0) {
                        fileType = file.fileType;
                    }
                    return file.copy(str, str2, str3, fileType);
                }

                /* renamed from: component1, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                /* renamed from: component2, reason: from getter */
                public final String getName() {
                    return this.name;
                }

                /* renamed from: component3, reason: from getter */
                public final String getUrl() {
                    return this.url;
                }

                /* renamed from: component4, reason: from getter */
                public final FileType getFileType() {
                    return this.fileType;
                }

                public final File copy(String id, String name, String url, FileType fileType) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(fileType, "fileType");
                    return new File(id, name, url, fileType);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof File)) {
                        return false;
                    }
                    File file = (File) other;
                    return Intrinsics.areEqual(this.id, file.id) && Intrinsics.areEqual(this.name, file.name) && Intrinsics.areEqual(this.url, file.url) && this.fileType == file.fileType;
                }

                public int hashCode() {
                    return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.url.hashCode()) * 31) + this.fileType.hashCode();
                }

                public String toString() {
                    return "File(id=" + this.id + ", name=" + this.name + ", url=" + this.url + ", fileType=" + this.fileType + ')';
                }

                public File(String id, String name, String url, FileType fileType) {
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(fileType, "fileType");
                    this.id = id;
                    this.name = name;
                    this.url = url;
                    this.fileType = fileType;
                }

                public final String getId() {
                    return this.id;
                }

                public final String getName() {
                    return this.name;
                }

                public final String getUrl() {
                    return this.url;
                }

                public final FileType getFileType() {
                    return this.fileType;
                }
            }
        }

        /* compiled from: Ticket.kt */
        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$TicketAttribute$UnSupported;", "Lio/intercom/android/sdk/models/Ticket$TicketAttribute;", "id", "", NotificationsService.IDENTIFIER_KEY, "name", "required", "", "type", "Lio/intercom/android/sdk/models/TicketAttributeType;", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLio/intercom/android/sdk/models/TicketAttributeType;Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "hasValue", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class UnSupported extends TicketAttribute {
            public static final int $stable = 8;

            @SerializedName("value")
            private final Object value;

            public final Object getValue() {
                return this.value;
            }

            public /* synthetic */ UnSupported(String str, String str2, String str3, boolean z, TicketAttributeType ticketAttributeType, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, z, ticketAttributeType, (i & 32) != 0 ? "" : str4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnSupported(String id, String identifier, String name, boolean z, TicketAttributeType type, Object value) {
                super(id, identifier, name, z, type, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(identifier, "identifier");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }

            @Override // io.intercom.android.sdk.models.Ticket.TicketAttribute
            public boolean hasValue() {
                return !StringsKt.isBlank(this.value.toString());
            }
        }
    }

    /* compiled from: Ticket.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$ConversationButton;", "", "icon", "Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "text", "", "<init>", "(Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;Ljava/lang/String;)V", "getIcon", "()Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "IconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConversationButton {
        public static final int $stable = 0;

        @SerializedName("icon")
        private final IconType icon;

        @SerializedName("text")
        private final String text;

        public static /* synthetic */ ConversationButton copy$default(ConversationButton conversationButton, IconType iconType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                iconType = conversationButton.icon;
            }
            if ((i & 2) != 0) {
                str = conversationButton.text;
            }
            return conversationButton.copy(iconType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final IconType getIcon() {
            return this.icon;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final ConversationButton copy(IconType icon, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new ConversationButton(icon, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationButton)) {
                return false;
            }
            ConversationButton conversationButton = (ConversationButton) other;
            return this.icon == conversationButton.icon && Intrinsics.areEqual(this.text, conversationButton.text);
        }

        public int hashCode() {
            IconType iconType = this.icon;
            return ((iconType == null ? 0 : iconType.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ConversationButton(icon=" + this.icon + ", text=" + this.text + ')';
        }

        public ConversationButton(IconType iconType, String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.icon = iconType;
            this.text = text;
        }

        public final IconType getIcon() {
            return this.icon;
        }

        public final String getText() {
            return this.text;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Ticket.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$ConversationButton$IconType;", "", "<init>", "(Ljava/lang/String;I)V", "SEND", "CONVERSATION", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ IconType[] $VALUES;

            @SerializedName("send")
            public static final IconType SEND = new IconType("SEND", 0);

            @SerializedName("conversation")
            public static final IconType CONVERSATION = new IconType("CONVERSATION", 1);

            private static final /* synthetic */ IconType[] $values() {
                return new IconType[]{SEND, CONVERSATION};
            }

            public static EnumEntries<IconType> getEntries() {
                return $ENTRIES;
            }

            private IconType(String str, int i) {
            }

            static {
                IconType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            public static IconType valueOf(String str) {
                return (IconType) Enum.valueOf(IconType.class, str);
            }

            public static IconType[] values() {
                return (IconType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: Ticket.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/models/Ticket$Companion;", "", "<init>", "()V", "NULL", "Lio/intercom/android/sdk/models/Ticket;", "getNULL", "()Lio/intercom/android/sdk/models/Ticket;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Ticket getNULL() {
            return Ticket.NULL;
        }
    }
}
