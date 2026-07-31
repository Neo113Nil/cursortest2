package io.intercom.android.sdk.m5.conversation.states;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 P2\u00020\u0001:\u0001PB·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00100\tHÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\b<J\u0010\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\b>J\u0010\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\b@J\u0010\u0010A\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\bBJ\u0010\u0010C\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\bDJ\u0010\u0010E\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\bFJ\u000b\u0010G\u001a\u0004\u0018\u00010\u0019HÆ\u0003JÈ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÇ\u0001¢\u0006\u0004\bI\u0010JJ\u0013\u0010K\u001a\u00020\f2\b\u0010L\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010M\u001a\u00020\u0005H×\u0001J\t\u0010N\u001a\u00020OH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b0\u0010+R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006Q"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "", "title", "Lio/intercom/android/sdk/ui/common/StringProvider;", "navIcon", "", "subTitle", "subTitleLeadingIcon", "avatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "displayActiveIndicator", "", "ticketStatusState", "Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "headerMenuItems", "Lio/intercom/android/sdk/m5/conversation/states/HeaderMenuItem;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColorDark", "contentColor", "contentColorDark", "subTitleColor", "subTitleColorDark", "pushNotificationsBannerState", "Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "<init>", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;Ljava/util/List;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTitle", "()Lio/intercom/android/sdk/ui/common/StringProvider;", "getNavIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubTitle", "getSubTitleLeadingIcon", "getAvatars", "()Ljava/util/List;", "getDisplayActiveIndicator", "()Z", "getTicketStatusState", "()Lio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;", "getHeaderMenuItems", "getBackgroundColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getBackgroundColorDark-QN2ZGVo", "getContentColor-QN2ZGVo", "getContentColorDark-QN2ZGVo", "getSubTitleColor-QN2ZGVo", "getSubTitleColorDark-QN2ZGVo", "getPushNotificationsBannerState", "()Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component9-QN2ZGVo", "component10", "component10-QN2ZGVo", "component11", "component11-QN2ZGVo", "component12", "component12-QN2ZGVo", "component13", "component13-QN2ZGVo", "component14", "component14-QN2ZGVo", "component15", "copy", "copy-N4y9b34", "(Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Lio/intercom/android/sdk/ui/common/StringProvider;Ljava/lang/Integer;Ljava/util/List;ZLio/intercom/android/sdk/m5/conversation/states/TicketProgressRowState;Ljava/util/List;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Lio/intercom/android/sdk/m5/conversation/states/PushNotificationsBannerState;)Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TopAppBarUiState {
    private final List<AvatarWrapper> avatars;
    private final Color backgroundColor;
    private final Color backgroundColorDark;
    private final Color contentColor;
    private final Color contentColorDark;
    private final boolean displayActiveIndicator;
    private final List<HeaderMenuItem> headerMenuItems;
    private final Integer navIcon;
    private final PushNotificationsBannerState pushNotificationsBannerState;
    private final StringProvider subTitle;
    private final Color subTitleColor;
    private final Color subTitleColorDark;
    private final Integer subTitleLeadingIcon;
    private final TicketProgressRowState ticketStatusState;
    private final StringProvider title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: default, reason: not valid java name */
    private static final TopAppBarUiState f174default = new TopAppBarUiState(new StringProvider.ActualString(""), null, null, null, CollectionsKt.emptyList(), false, null, CollectionsKt.emptyList(), null, null, null, null, null, null, null, 16130, null);

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z, TicketProgressRowState ticketProgressRowState, List list2, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, PushNotificationsBannerState pushNotificationsBannerState, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, num, stringProvider2, num2, list, z, ticketProgressRowState, list2, color, color2, color3, color4, color5, color6, pushNotificationsBannerState);
    }

    /* renamed from: component1, reason: from getter */
    public final StringProvider getTitle() {
        return this.title;
    }

    /* renamed from: component10-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    /* renamed from: component11-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getContentColor() {
        return this.contentColor;
    }

    /* renamed from: component12-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getContentColorDark() {
        return this.contentColorDark;
    }

    /* renamed from: component13-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getSubTitleColor() {
        return this.subTitleColor;
    }

    /* renamed from: component14-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getSubTitleColorDark() {
        return this.subTitleColorDark;
    }

    /* renamed from: component15, reason: from getter */
    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getNavIcon() {
        return this.navIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    public final List<AvatarWrapper> component5() {
        return this.avatars;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    /* renamed from: component7, reason: from getter */
    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    public final List<HeaderMenuItem> component8() {
        return this.headerMenuItems;
    }

    /* renamed from: component9-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: copy-N4y9b34, reason: not valid java name */
    public final TopAppBarUiState m11207copyN4y9b34(StringProvider title, Integer navIcon, StringProvider subTitle, Integer subTitleLeadingIcon, List<AvatarWrapper> avatars, boolean displayActiveIndicator, TicketProgressRowState ticketStatusState, List<? extends HeaderMenuItem> headerMenuItems, Color backgroundColor, Color backgroundColorDark, Color contentColor, Color contentColorDark, Color subTitleColor, Color subTitleColorDark, PushNotificationsBannerState pushNotificationsBannerState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        return new TopAppBarUiState(title, navIcon, subTitle, subTitleLeadingIcon, avatars, displayActiveIndicator, ticketStatusState, headerMenuItems, backgroundColor, backgroundColorDark, contentColor, contentColorDark, subTitleColor, subTitleColorDark, pushNotificationsBannerState, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAppBarUiState)) {
            return false;
        }
        TopAppBarUiState topAppBarUiState = (TopAppBarUiState) other;
        return Intrinsics.areEqual(this.title, topAppBarUiState.title) && Intrinsics.areEqual(this.navIcon, topAppBarUiState.navIcon) && Intrinsics.areEqual(this.subTitle, topAppBarUiState.subTitle) && Intrinsics.areEqual(this.subTitleLeadingIcon, topAppBarUiState.subTitleLeadingIcon) && Intrinsics.areEqual(this.avatars, topAppBarUiState.avatars) && this.displayActiveIndicator == topAppBarUiState.displayActiveIndicator && Intrinsics.areEqual(this.ticketStatusState, topAppBarUiState.ticketStatusState) && Intrinsics.areEqual(this.headerMenuItems, topAppBarUiState.headerMenuItems) && Intrinsics.areEqual(this.backgroundColor, topAppBarUiState.backgroundColor) && Intrinsics.areEqual(this.backgroundColorDark, topAppBarUiState.backgroundColorDark) && Intrinsics.areEqual(this.contentColor, topAppBarUiState.contentColor) && Intrinsics.areEqual(this.contentColorDark, topAppBarUiState.contentColorDark) && Intrinsics.areEqual(this.subTitleColor, topAppBarUiState.subTitleColor) && Intrinsics.areEqual(this.subTitleColorDark, topAppBarUiState.subTitleColorDark) && Intrinsics.areEqual(this.pushNotificationsBannerState, topAppBarUiState.pushNotificationsBannerState);
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        Integer num = this.navIcon;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        StringProvider stringProvider = this.subTitle;
        int hashCode3 = (hashCode2 + (stringProvider == null ? 0 : stringProvider.hashCode())) * 31;
        Integer num2 = this.subTitleLeadingIcon;
        int hashCode4 = (((((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.avatars.hashCode()) * 31) + Boolean.hashCode(this.displayActiveIndicator)) * 31;
        TicketProgressRowState ticketProgressRowState = this.ticketStatusState;
        int hashCode5 = (((hashCode4 + (ticketProgressRowState == null ? 0 : ticketProgressRowState.hashCode())) * 31) + this.headerMenuItems.hashCode()) * 31;
        Color color = this.backgroundColor;
        int m5664hashCodeimpl = (hashCode5 + (color == null ? 0 : Color.m5664hashCodeimpl(color.m5667unboximpl()))) * 31;
        Color color2 = this.backgroundColorDark;
        int m5664hashCodeimpl2 = (m5664hashCodeimpl + (color2 == null ? 0 : Color.m5664hashCodeimpl(color2.m5667unboximpl()))) * 31;
        Color color3 = this.contentColor;
        int m5664hashCodeimpl3 = (m5664hashCodeimpl2 + (color3 == null ? 0 : Color.m5664hashCodeimpl(color3.m5667unboximpl()))) * 31;
        Color color4 = this.contentColorDark;
        int m5664hashCodeimpl4 = (m5664hashCodeimpl3 + (color4 == null ? 0 : Color.m5664hashCodeimpl(color4.m5667unboximpl()))) * 31;
        Color color5 = this.subTitleColor;
        int m5664hashCodeimpl5 = (m5664hashCodeimpl4 + (color5 == null ? 0 : Color.m5664hashCodeimpl(color5.m5667unboximpl()))) * 31;
        Color color6 = this.subTitleColorDark;
        int m5664hashCodeimpl6 = (m5664hashCodeimpl5 + (color6 == null ? 0 : Color.m5664hashCodeimpl(color6.m5667unboximpl()))) * 31;
        PushNotificationsBannerState pushNotificationsBannerState = this.pushNotificationsBannerState;
        return m5664hashCodeimpl6 + (pushNotificationsBannerState != null ? pushNotificationsBannerState.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TopAppBarUiState(title=");
        sb.append(this.title).append(", navIcon=").append(this.navIcon).append(", subTitle=").append(this.subTitle).append(", subTitleLeadingIcon=").append(this.subTitleLeadingIcon).append(", avatars=").append(this.avatars).append(", displayActiveIndicator=").append(this.displayActiveIndicator).append(", ticketStatusState=").append(this.ticketStatusState).append(", headerMenuItems=").append(this.headerMenuItems).append(", backgroundColor=").append(this.backgroundColor).append(", backgroundColorDark=").append(this.backgroundColorDark).append(", contentColor=").append(this.contentColor).append(", contentColorDark=");
        sb.append(this.contentColorDark).append(", subTitleColor=").append(this.subTitleColor).append(", subTitleColorDark=").append(this.subTitleColorDark).append(", pushNotificationsBannerState=").append(this.pushNotificationsBannerState).append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TopAppBarUiState(StringProvider title, Integer num, StringProvider stringProvider, Integer num2, List<AvatarWrapper> avatars, boolean z, TicketProgressRowState ticketProgressRowState, List<? extends HeaderMenuItem> headerMenuItems, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, PushNotificationsBannerState pushNotificationsBannerState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(headerMenuItems, "headerMenuItems");
        this.title = title;
        this.navIcon = num;
        this.subTitle = stringProvider;
        this.subTitleLeadingIcon = num2;
        this.avatars = avatars;
        this.displayActiveIndicator = z;
        this.ticketStatusState = ticketProgressRowState;
        this.headerMenuItems = headerMenuItems;
        this.backgroundColor = color;
        this.backgroundColorDark = color2;
        this.contentColor = color3;
        this.contentColorDark = color4;
        this.subTitleColor = color5;
        this.subTitleColorDark = color6;
        this.pushNotificationsBannerState = pushNotificationsBannerState;
    }

    public final StringProvider getTitle() {
        return this.title;
    }

    public final Integer getNavIcon() {
        return this.navIcon;
    }

    public final StringProvider getSubTitle() {
        return this.subTitle;
    }

    public final Integer getSubTitleLeadingIcon() {
        return this.subTitleLeadingIcon;
    }

    public final List<AvatarWrapper> getAvatars() {
        return this.avatars;
    }

    public final boolean getDisplayActiveIndicator() {
        return this.displayActiveIndicator;
    }

    public final TicketProgressRowState getTicketStatusState() {
        return this.ticketStatusState;
    }

    public /* synthetic */ TopAppBarUiState(StringProvider stringProvider, Integer num, StringProvider stringProvider2, Integer num2, List list, boolean z, TicketProgressRowState ticketProgressRowState, List list2, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, PushNotificationsBannerState pushNotificationsBannerState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringProvider, (i & 2) != 0 ? null : num, stringProvider2, num2, list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : ticketProgressRowState, (i & 128) != 0 ? CollectionsKt.emptyList() : list2, (i & 256) != 0 ? null : color, (i & 512) != 0 ? null : color2, (i & 1024) != 0 ? null : color3, (i & 2048) != 0 ? null : color4, (i & 4096) != 0 ? null : color5, (i & 8192) != 0 ? null : color6, (i & 16384) != 0 ? null : pushNotificationsBannerState, null);
    }

    public final List<HeaderMenuItem> getHeaderMenuItems() {
        return this.headerMenuItems;
    }

    /* renamed from: getBackgroundColor-QN2ZGVo, reason: not valid java name */
    public final Color m11208getBackgroundColorQN2ZGVo() {
        return this.backgroundColor;
    }

    /* renamed from: getBackgroundColorDark-QN2ZGVo, reason: not valid java name */
    public final Color m11209getBackgroundColorDarkQN2ZGVo() {
        return this.backgroundColorDark;
    }

    /* renamed from: getContentColor-QN2ZGVo, reason: not valid java name */
    public final Color m11210getContentColorQN2ZGVo() {
        return this.contentColor;
    }

    /* renamed from: getContentColorDark-QN2ZGVo, reason: not valid java name */
    public final Color m11211getContentColorDarkQN2ZGVo() {
        return this.contentColorDark;
    }

    /* renamed from: getSubTitleColor-QN2ZGVo, reason: not valid java name */
    public final Color m11212getSubTitleColorQN2ZGVo() {
        return this.subTitleColor;
    }

    /* renamed from: getSubTitleColorDark-QN2ZGVo, reason: not valid java name */
    public final Color m11213getSubTitleColorDarkQN2ZGVo() {
        return this.subTitleColorDark;
    }

    public final PushNotificationsBannerState getPushNotificationsBannerState() {
        return this.pushNotificationsBannerState;
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState$Companion;", "", "<init>", "()V", "default", "Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "getDefault", "()Lio/intercom/android/sdk/m5/conversation/states/TopAppBarUiState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TopAppBarUiState getDefault() {
            return TopAppBarUiState.f174default;
        }
    }
}
