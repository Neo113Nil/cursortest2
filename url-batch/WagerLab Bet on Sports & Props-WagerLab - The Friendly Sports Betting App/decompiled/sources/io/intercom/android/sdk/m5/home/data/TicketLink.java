package io.intercom.android.sdk.m5.home.data;

import com.amazon.a.a.o.b;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeV2Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001d\u001a\u00020\u0003H×\u0001J\t\u0010\u001e\u001a\u00020\u0005H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/m5/home/data/TicketLink;", "", "ticketTypeId", "", "ticketTypeName", "", b.j, "displayOrder", "ticketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILio/intercom/android/sdk/blocks/lib/models/TicketType;)V", "getTicketTypeId", "()I", "getTicketTypeName", "()Ljava/lang/String;", "getIconUrl", "getDisplayOrder", "getTicketType", "()Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TicketLink {
    public static final int $stable = 8;

    @SerializedName("display_order")
    private final int displayOrder;

    @SerializedName("icon_url")
    private final String iconUrl;

    @SerializedName("ticket_type")
    private final TicketType ticketType;

    @SerializedName(CreateTicketDestinationKt.TICKET_TYPE_ID)
    private final int ticketTypeId;

    @SerializedName("ticket_type_name")
    private final String ticketTypeName;

    public static /* synthetic */ TicketLink copy$default(TicketLink ticketLink, int i, String str, String str2, int i2, TicketType ticketType, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = ticketLink.ticketTypeId;
        }
        if ((i3 & 2) != 0) {
            str = ticketLink.ticketTypeName;
        }
        if ((i3 & 4) != 0) {
            str2 = ticketLink.iconUrl;
        }
        if ((i3 & 8) != 0) {
            i2 = ticketLink.displayOrder;
        }
        if ((i3 & 16) != 0) {
            ticketType = ticketLink.ticketType;
        }
        TicketType ticketType2 = ticketType;
        String str3 = str2;
        return ticketLink.copy(i, str, str3, i2, ticketType2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTicketTypeName() {
        return this.ticketTypeName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    /* renamed from: component5, reason: from getter */
    public final TicketType getTicketType() {
        return this.ticketType;
    }

    public final TicketLink copy(int ticketTypeId, String ticketTypeName, String iconUrl, int displayOrder, TicketType ticketType) {
        Intrinsics.checkNotNullParameter(ticketTypeName, "ticketTypeName");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        return new TicketLink(ticketTypeId, ticketTypeName, iconUrl, displayOrder, ticketType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketLink)) {
            return false;
        }
        TicketLink ticketLink = (TicketLink) other;
        return this.ticketTypeId == ticketLink.ticketTypeId && Intrinsics.areEqual(this.ticketTypeName, ticketLink.ticketTypeName) && Intrinsics.areEqual(this.iconUrl, ticketLink.iconUrl) && this.displayOrder == ticketLink.displayOrder && Intrinsics.areEqual(this.ticketType, ticketLink.ticketType);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.ticketTypeId) * 31) + this.ticketTypeName.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + Integer.hashCode(this.displayOrder)) * 31) + this.ticketType.hashCode();
    }

    public String toString() {
        return "TicketLink(ticketTypeId=" + this.ticketTypeId + ", ticketTypeName=" + this.ticketTypeName + ", iconUrl=" + this.iconUrl + ", displayOrder=" + this.displayOrder + ", ticketType=" + this.ticketType + ')';
    }

    public TicketLink(int i, String ticketTypeName, String iconUrl, int i2, TicketType ticketType) {
        Intrinsics.checkNotNullParameter(ticketTypeName, "ticketTypeName");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(ticketType, "ticketType");
        this.ticketTypeId = i;
        this.ticketTypeName = ticketTypeName;
        this.iconUrl = iconUrl;
        this.displayOrder = i2;
        this.ticketType = ticketType;
    }

    public final int getTicketTypeId() {
        return this.ticketTypeId;
    }

    public final String getTicketTypeName() {
        return this.ticketTypeName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final TicketType getTicketType() {
        return this.ticketType;
    }
}
