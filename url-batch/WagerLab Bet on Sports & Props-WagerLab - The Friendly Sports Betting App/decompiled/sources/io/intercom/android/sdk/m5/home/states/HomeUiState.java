package io.intercom.android.sdk.m5.home.states;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.models.PoweredBy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeUiState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "", "<init>", "()V", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "Loading", "Content", "Error", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class HomeUiState {
    public static final int $stable = 0;

    public /* synthetic */ HomeUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract PoweredBy getPoweredBy();

    private HomeUiState() {
    }

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Loading;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy;)V", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends HomeUiState {
        public static final int $stable = 0;
        private final PoweredBy poweredBy;

        public static /* synthetic */ Loading copy$default(Loading loading, PoweredBy poweredBy, int i, Object obj) {
            if ((i & 1) != 0) {
                poweredBy = loading.poweredBy;
            }
            return loading.copy(poweredBy);
        }

        /* renamed from: component1, reason: from getter */
        public final PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public final Loading copy(PoweredBy poweredBy) {
            return new Loading(poweredBy);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.poweredBy, ((Loading) other).poweredBy);
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            if (poweredBy == null) {
                return 0;
            }
            return poweredBy.hashCode();
        }

        public String toString() {
            return "Loading(poweredBy=" + this.poweredBy + ')';
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public Loading(PoweredBy poweredBy) {
            super(null);
            this.poweredBy = poweredBy;
        }
    }

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JU\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÇ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010$H×\u0003J\t\u0010%\u001a\u00020&H×\u0001J\t\u0010'\u001a\u00020(H×\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "cards", "", "Lio/intercom/android/sdk/m5/home/data/HomeCards;", "adminsAvatars", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "botAvatar", "teammateAccessEnabled", "", "header", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;ZLio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;)V", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getCards", "()Ljava/util/List;", "getAdminsAvatars", "getBotAvatar", "()Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "getTeammateAccessEnabled", "()Z", "getHeader", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "ContentHeader", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content extends HomeUiState {
        public static final int $stable = 8;
        private final List<AvatarWrapper> adminsAvatars;
        private final AvatarWrapper botAvatar;
        private final List<HomeCards> cards;
        private final ContentHeader header;
        private final PoweredBy poweredBy;
        private final boolean teammateAccessEnabled;

        public static /* synthetic */ Content copy$default(Content content, PoweredBy poweredBy, List list, List list2, AvatarWrapper avatarWrapper, boolean z, ContentHeader contentHeader, int i, Object obj) {
            if ((i & 1) != 0) {
                poweredBy = content.poweredBy;
            }
            if ((i & 2) != 0) {
                list = content.cards;
            }
            if ((i & 4) != 0) {
                list2 = content.adminsAvatars;
            }
            if ((i & 8) != 0) {
                avatarWrapper = content.botAvatar;
            }
            if ((i & 16) != 0) {
                z = content.teammateAccessEnabled;
            }
            if ((i & 32) != 0) {
                contentHeader = content.header;
            }
            boolean z2 = z;
            ContentHeader contentHeader2 = contentHeader;
            return content.copy(poweredBy, list, list2, avatarWrapper, z2, contentHeader2);
        }

        /* renamed from: component1, reason: from getter */
        public final PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public final List<HomeCards> component2() {
            return this.cards;
        }

        public final List<AvatarWrapper> component3() {
            return this.adminsAvatars;
        }

        /* renamed from: component4, reason: from getter */
        public final AvatarWrapper getBotAvatar() {
            return this.botAvatar;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getTeammateAccessEnabled() {
            return this.teammateAccessEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final ContentHeader getHeader() {
            return this.header;
        }

        public final Content copy(PoweredBy poweredBy, List<? extends HomeCards> cards, List<AvatarWrapper> adminsAvatars, AvatarWrapper botAvatar, boolean teammateAccessEnabled, ContentHeader header) {
            Intrinsics.checkNotNullParameter(cards, "cards");
            Intrinsics.checkNotNullParameter(adminsAvatars, "adminsAvatars");
            Intrinsics.checkNotNullParameter(header, "header");
            return new Content(poweredBy, cards, adminsAvatars, botAvatar, teammateAccessEnabled, header);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.poweredBy, content.poweredBy) && Intrinsics.areEqual(this.cards, content.cards) && Intrinsics.areEqual(this.adminsAvatars, content.adminsAvatars) && Intrinsics.areEqual(this.botAvatar, content.botAvatar) && this.teammateAccessEnabled == content.teammateAccessEnabled && Intrinsics.areEqual(this.header, content.header);
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            int hashCode = (((((poweredBy == null ? 0 : poweredBy.hashCode()) * 31) + this.cards.hashCode()) * 31) + this.adminsAvatars.hashCode()) * 31;
            AvatarWrapper avatarWrapper = this.botAvatar;
            return ((((hashCode + (avatarWrapper != null ? avatarWrapper.hashCode() : 0)) * 31) + Boolean.hashCode(this.teammateAccessEnabled)) * 31) + this.header.hashCode();
        }

        public String toString() {
            return "Content(poweredBy=" + this.poweredBy + ", cards=" + this.cards + ", adminsAvatars=" + this.adminsAvatars + ", botAvatar=" + this.botAvatar + ", teammateAccessEnabled=" + this.teammateAccessEnabled + ", header=" + this.header + ')';
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public final List<HomeCards> getCards() {
            return this.cards;
        }

        public final List<AvatarWrapper> getAdminsAvatars() {
            return this.adminsAvatars;
        }

        public final AvatarWrapper getBotAvatar() {
            return this.botAvatar;
        }

        public final boolean getTeammateAccessEnabled() {
            return this.teammateAccessEnabled;
        }

        public final ContentHeader getHeader() {
            return this.header;
        }

        /* compiled from: HomeUiState.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0003567Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010(\u001a\u00020\bHÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u0012HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÇ\u0001J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00102\u001a\u000203H×\u0001J\t\u00104\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00068"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "", "showLogo", "", "logoUrl", "", "logoDarkUrl", "greeting", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;", "intro", "headerBackdropStyle", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "headerBackdropStyleDark", "showAvatars", "adminsAvatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "closeButtonColor", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$CloseButtonColor;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;ZLjava/util/List;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$CloseButtonColor;)V", "getShowLogo", "()Z", "getLogoUrl", "()Ljava/lang/String;", "getLogoDarkUrl", "getGreeting", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;", "getIntro", "getHeaderBackdropStyle", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "getHeaderBackdropStyleDark", "getShowAvatars", "getAdminsAvatars", "()Ljava/util/List;", "getCloseButtonColor", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$CloseButtonColor;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "CloseButtonColor", "ColoredText", "HeaderBackdropStyle", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ContentHeader {
            public static final int $stable = 8;
            private final List<AvatarWrapper> adminsAvatars;
            private final CloseButtonColor closeButtonColor;
            private final ColoredText greeting;
            private final HeaderBackdropStyle headerBackdropStyle;
            private final HeaderBackdropStyle headerBackdropStyleDark;
            private final ColoredText intro;
            private final String logoDarkUrl;
            private final String logoUrl;
            private final boolean showAvatars;
            private final boolean showLogo;

            public static /* synthetic */ ContentHeader copy$default(ContentHeader contentHeader, boolean z, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z2, List list, CloseButtonColor closeButtonColor, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = contentHeader.showLogo;
                }
                if ((i & 2) != 0) {
                    str = contentHeader.logoUrl;
                }
                if ((i & 4) != 0) {
                    str2 = contentHeader.logoDarkUrl;
                }
                if ((i & 8) != 0) {
                    coloredText = contentHeader.greeting;
                }
                if ((i & 16) != 0) {
                    coloredText2 = contentHeader.intro;
                }
                if ((i & 32) != 0) {
                    headerBackdropStyle = contentHeader.headerBackdropStyle;
                }
                if ((i & 64) != 0) {
                    headerBackdropStyle2 = contentHeader.headerBackdropStyleDark;
                }
                if ((i & 128) != 0) {
                    z2 = contentHeader.showAvatars;
                }
                if ((i & 256) != 0) {
                    list = contentHeader.adminsAvatars;
                }
                if ((i & 512) != 0) {
                    closeButtonColor = contentHeader.closeButtonColor;
                }
                List list2 = list;
                CloseButtonColor closeButtonColor2 = closeButtonColor;
                HeaderBackdropStyle headerBackdropStyle3 = headerBackdropStyle2;
                boolean z3 = z2;
                ColoredText coloredText3 = coloredText2;
                HeaderBackdropStyle headerBackdropStyle4 = headerBackdropStyle;
                return contentHeader.copy(z, str, str2, coloredText, coloredText3, headerBackdropStyle4, headerBackdropStyle3, z3, list2, closeButtonColor2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getShowLogo() {
                return this.showLogo;
            }

            /* renamed from: component10, reason: from getter */
            public final CloseButtonColor getCloseButtonColor() {
                return this.closeButtonColor;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLogoUrl() {
                return this.logoUrl;
            }

            /* renamed from: component3, reason: from getter */
            public final String getLogoDarkUrl() {
                return this.logoDarkUrl;
            }

            /* renamed from: component4, reason: from getter */
            public final ColoredText getGreeting() {
                return this.greeting;
            }

            /* renamed from: component5, reason: from getter */
            public final ColoredText getIntro() {
                return this.intro;
            }

            /* renamed from: component6, reason: from getter */
            public final HeaderBackdropStyle getHeaderBackdropStyle() {
                return this.headerBackdropStyle;
            }

            /* renamed from: component7, reason: from getter */
            public final HeaderBackdropStyle getHeaderBackdropStyleDark() {
                return this.headerBackdropStyleDark;
            }

            /* renamed from: component8, reason: from getter */
            public final boolean getShowAvatars() {
                return this.showAvatars;
            }

            public final List<AvatarWrapper> component9() {
                return this.adminsAvatars;
            }

            public final ContentHeader copy(boolean showLogo, String logoUrl, String logoDarkUrl, ColoredText greeting, ColoredText intro, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyleDark, boolean showAvatars, List<AvatarWrapper> adminsAvatars, CloseButtonColor closeButtonColor) {
                Intrinsics.checkNotNullParameter(greeting, "greeting");
                Intrinsics.checkNotNullParameter(intro, "intro");
                Intrinsics.checkNotNullParameter(headerBackdropStyle, "headerBackdropStyle");
                Intrinsics.checkNotNullParameter(adminsAvatars, "adminsAvatars");
                Intrinsics.checkNotNullParameter(closeButtonColor, "closeButtonColor");
                return new ContentHeader(showLogo, logoUrl, logoDarkUrl, greeting, intro, headerBackdropStyle, headerBackdropStyleDark, showAvatars, adminsAvatars, closeButtonColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ContentHeader)) {
                    return false;
                }
                ContentHeader contentHeader = (ContentHeader) other;
                return this.showLogo == contentHeader.showLogo && Intrinsics.areEqual(this.logoUrl, contentHeader.logoUrl) && Intrinsics.areEqual(this.logoDarkUrl, contentHeader.logoDarkUrl) && Intrinsics.areEqual(this.greeting, contentHeader.greeting) && Intrinsics.areEqual(this.intro, contentHeader.intro) && Intrinsics.areEqual(this.headerBackdropStyle, contentHeader.headerBackdropStyle) && Intrinsics.areEqual(this.headerBackdropStyleDark, contentHeader.headerBackdropStyleDark) && this.showAvatars == contentHeader.showAvatars && Intrinsics.areEqual(this.adminsAvatars, contentHeader.adminsAvatars) && Intrinsics.areEqual(this.closeButtonColor, contentHeader.closeButtonColor);
            }

            public int hashCode() {
                int hashCode = Boolean.hashCode(this.showLogo) * 31;
                String str = this.logoUrl;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.logoDarkUrl;
                int hashCode3 = (((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.greeting.hashCode()) * 31) + this.intro.hashCode()) * 31) + this.headerBackdropStyle.hashCode()) * 31;
                HeaderBackdropStyle headerBackdropStyle = this.headerBackdropStyleDark;
                return ((((((hashCode3 + (headerBackdropStyle != null ? headerBackdropStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.showAvatars)) * 31) + this.adminsAvatars.hashCode()) * 31) + this.closeButtonColor.hashCode();
            }

            public String toString() {
                return "ContentHeader(showLogo=" + this.showLogo + ", logoUrl=" + this.logoUrl + ", logoDarkUrl=" + this.logoDarkUrl + ", greeting=" + this.greeting + ", intro=" + this.intro + ", headerBackdropStyle=" + this.headerBackdropStyle + ", headerBackdropStyleDark=" + this.headerBackdropStyleDark + ", showAvatars=" + this.showAvatars + ", adminsAvatars=" + this.adminsAvatars + ", closeButtonColor=" + this.closeButtonColor + ')';
            }

            public ContentHeader(boolean z, String str, String str2, ColoredText greeting, ColoredText intro, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z2, List<AvatarWrapper> adminsAvatars, CloseButtonColor closeButtonColor) {
                Intrinsics.checkNotNullParameter(greeting, "greeting");
                Intrinsics.checkNotNullParameter(intro, "intro");
                Intrinsics.checkNotNullParameter(headerBackdropStyle, "headerBackdropStyle");
                Intrinsics.checkNotNullParameter(adminsAvatars, "adminsAvatars");
                Intrinsics.checkNotNullParameter(closeButtonColor, "closeButtonColor");
                this.showLogo = z;
                this.logoUrl = str;
                this.logoDarkUrl = str2;
                this.greeting = greeting;
                this.intro = intro;
                this.headerBackdropStyle = headerBackdropStyle;
                this.headerBackdropStyleDark = headerBackdropStyle2;
                this.showAvatars = z2;
                this.adminsAvatars = adminsAvatars;
                this.closeButtonColor = closeButtonColor;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ ContentHeader(boolean z, String str, String str2, ColoredText coloredText, ColoredText coloredText2, HeaderBackdropStyle headerBackdropStyle, HeaderBackdropStyle headerBackdropStyle2, boolean z2, List list, CloseButtonColor closeButtonColor, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(z, str, str2, coloredText, coloredText2, headerBackdropStyle, r9, r10, r11, r12);
                CloseButtonColor closeButtonColor2;
                List list2;
                boolean z3;
                HeaderBackdropStyle headerBackdropStyle3;
                str2 = (i & 4) != 0 ? null : str2;
                if ((i & 64) != 0) {
                    closeButtonColor2 = closeButtonColor;
                    list2 = list;
                    z3 = z2;
                    headerBackdropStyle3 = null;
                } else {
                    closeButtonColor2 = closeButtonColor;
                    list2 = list;
                    z3 = z2;
                    headerBackdropStyle3 = headerBackdropStyle2;
                }
            }

            public final boolean getShowLogo() {
                return this.showLogo;
            }

            public final String getLogoUrl() {
                return this.logoUrl;
            }

            public final String getLogoDarkUrl() {
                return this.logoDarkUrl;
            }

            public final ColoredText getGreeting() {
                return this.greeting;
            }

            public final ColoredText getIntro() {
                return this.intro;
            }

            public final HeaderBackdropStyle getHeaderBackdropStyle() {
                return this.headerBackdropStyle;
            }

            public final HeaderBackdropStyle getHeaderBackdropStyleDark() {
                return this.headerBackdropStyleDark;
            }

            public final boolean getShowAvatars() {
                return this.showAvatars;
            }

            public final List<AvatarWrapper> getAdminsAvatars() {
                return this.adminsAvatars;
            }

            public final CloseButtonColor getCloseButtonColor() {
                return this.closeButtonColor;
            }

            /* compiled from: HomeUiState.kt */
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$CloseButtonColor;", "", "backgroundColor", "", ViewProps.FOREGROUND_COLOR, "foregroundColorDark", "backgroundOpacity", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;F)V", "getBackgroundColor", "()Ljava/lang/String;", "getForegroundColor", "getForegroundColorDark", "getBackgroundOpacity", "()F", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class CloseButtonColor {
                public static final int $stable = 0;
                private final String backgroundColor;
                private final float backgroundOpacity;
                private final String foregroundColor;
                private final String foregroundColorDark;

                public static /* synthetic */ CloseButtonColor copy$default(CloseButtonColor closeButtonColor, String str, String str2, String str3, float f, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = closeButtonColor.backgroundColor;
                    }
                    if ((i & 2) != 0) {
                        str2 = closeButtonColor.foregroundColor;
                    }
                    if ((i & 4) != 0) {
                        str3 = closeButtonColor.foregroundColorDark;
                    }
                    if ((i & 8) != 0) {
                        f = closeButtonColor.backgroundOpacity;
                    }
                    return closeButtonColor.copy(str, str2, str3, f);
                }

                /* renamed from: component1, reason: from getter */
                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                /* renamed from: component2, reason: from getter */
                public final String getForegroundColor() {
                    return this.foregroundColor;
                }

                /* renamed from: component3, reason: from getter */
                public final String getForegroundColorDark() {
                    return this.foregroundColorDark;
                }

                /* renamed from: component4, reason: from getter */
                public final float getBackgroundOpacity() {
                    return this.backgroundOpacity;
                }

                public final CloseButtonColor copy(String backgroundColor, String foregroundColor, String foregroundColorDark, float backgroundOpacity) {
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
                    return new CloseButtonColor(backgroundColor, foregroundColor, foregroundColorDark, backgroundOpacity);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof CloseButtonColor)) {
                        return false;
                    }
                    CloseButtonColor closeButtonColor = (CloseButtonColor) other;
                    return Intrinsics.areEqual(this.backgroundColor, closeButtonColor.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, closeButtonColor.foregroundColor) && Intrinsics.areEqual(this.foregroundColorDark, closeButtonColor.foregroundColorDark) && Float.compare(this.backgroundOpacity, closeButtonColor.backgroundOpacity) == 0;
                }

                public int hashCode() {
                    int hashCode = ((this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode()) * 31;
                    String str = this.foregroundColorDark;
                    return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Float.hashCode(this.backgroundOpacity);
                }

                public String toString() {
                    return "CloseButtonColor(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ", foregroundColorDark=" + this.foregroundColorDark + ", backgroundOpacity=" + this.backgroundOpacity + ')';
                }

                public CloseButtonColor(String backgroundColor, String foregroundColor, String str, float f) {
                    Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                    Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
                    this.backgroundColor = backgroundColor;
                    this.foregroundColor = foregroundColor;
                    this.foregroundColorDark = str;
                    this.backgroundOpacity = f;
                }

                public /* synthetic */ CloseButtonColor(String str, String str2, String str3, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, (i & 4) != 0 ? null : str3, f);
                }

                public final String getBackgroundColor() {
                    return this.backgroundColor;
                }

                public final String getForegroundColor() {
                    return this.foregroundColor;
                }

                public final String getForegroundColorDark() {
                    return this.foregroundColorDark;
                }

                public final float getBackgroundOpacity() {
                    return this.backgroundOpacity;
                }
            }

            /* compiled from: HomeUiState.kt */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$ColoredText;", "", "text", "", ViewProps.OPACITY, "", "textColorType", "textColorTypeDark", "textColorDark", "textColorLight", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getOpacity", "()F", "getTextColorType", "getTextColorTypeDark", "getTextColorDark", "getTextColorLight", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ColoredText {
                public static final int $stable = 0;
                private final float opacity;
                private final String text;
                private final String textColorDark;
                private final String textColorLight;
                private final String textColorType;
                private final String textColorTypeDark;

                public static /* synthetic */ ColoredText copy$default(ColoredText coloredText, String str, float f, String str2, String str3, String str4, String str5, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = coloredText.text;
                    }
                    if ((i & 2) != 0) {
                        f = coloredText.opacity;
                    }
                    if ((i & 4) != 0) {
                        str2 = coloredText.textColorType;
                    }
                    if ((i & 8) != 0) {
                        str3 = coloredText.textColorTypeDark;
                    }
                    if ((i & 16) != 0) {
                        str4 = coloredText.textColorDark;
                    }
                    if ((i & 32) != 0) {
                        str5 = coloredText.textColorLight;
                    }
                    String str6 = str4;
                    String str7 = str5;
                    return coloredText.copy(str, f, str2, str3, str6, str7);
                }

                /* renamed from: component1, reason: from getter */
                public final String getText() {
                    return this.text;
                }

                /* renamed from: component2, reason: from getter */
                public final float getOpacity() {
                    return this.opacity;
                }

                /* renamed from: component3, reason: from getter */
                public final String getTextColorType() {
                    return this.textColorType;
                }

                /* renamed from: component4, reason: from getter */
                public final String getTextColorTypeDark() {
                    return this.textColorTypeDark;
                }

                /* renamed from: component5, reason: from getter */
                public final String getTextColorDark() {
                    return this.textColorDark;
                }

                /* renamed from: component6, reason: from getter */
                public final String getTextColorLight() {
                    return this.textColorLight;
                }

                public final ColoredText copy(String text, float opacity, String textColorType, String textColorTypeDark, String textColorDark, String textColorLight) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(textColorLight, "textColorLight");
                    return new ColoredText(text, opacity, textColorType, textColorTypeDark, textColorDark, textColorLight);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ColoredText)) {
                        return false;
                    }
                    ColoredText coloredText = (ColoredText) other;
                    return Intrinsics.areEqual(this.text, coloredText.text) && Float.compare(this.opacity, coloredText.opacity) == 0 && Intrinsics.areEqual(this.textColorType, coloredText.textColorType) && Intrinsics.areEqual(this.textColorTypeDark, coloredText.textColorTypeDark) && Intrinsics.areEqual(this.textColorDark, coloredText.textColorDark) && Intrinsics.areEqual(this.textColorLight, coloredText.textColorLight);
                }

                public int hashCode() {
                    int hashCode = ((this.text.hashCode() * 31) + Float.hashCode(this.opacity)) * 31;
                    String str = this.textColorType;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.textColorTypeDark;
                    int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.textColorDark;
                    return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.textColorLight.hashCode();
                }

                public String toString() {
                    return "ColoredText(text=" + this.text + ", opacity=" + this.opacity + ", textColorType=" + this.textColorType + ", textColorTypeDark=" + this.textColorTypeDark + ", textColorDark=" + this.textColorDark + ", textColorLight=" + this.textColorLight + ')';
                }

                public ColoredText(String text, float f, String str, String str2, String str3, String textColorLight) {
                    Intrinsics.checkNotNullParameter(text, "text");
                    Intrinsics.checkNotNullParameter(textColorLight, "textColorLight");
                    this.text = text;
                    this.opacity = f;
                    this.textColorType = str;
                    this.textColorTypeDark = str2;
                    this.textColorDark = str3;
                    this.textColorLight = textColorLight;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public /* synthetic */ ColoredText(String str, float f, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, f, str2, str3, r7, r8);
                    String str6;
                    String str7;
                    str2 = (i & 4) != 0 ? null : str2;
                    str3 = (i & 8) != 0 ? null : str3;
                    if ((i & 16) != 0) {
                        str6 = str5;
                        str7 = null;
                    } else {
                        str6 = str5;
                        str7 = str4;
                    }
                }

                public final String getText() {
                    return this.text;
                }

                public final float getOpacity() {
                    return this.opacity;
                }

                public final String getTextColorType() {
                    return this.textColorType;
                }

                public final String getTextColorTypeDark() {
                    return this.textColorTypeDark;
                }

                public final String getTextColorDark() {
                    return this.textColorDark;
                }

                public final String getTextColorLight() {
                    return this.textColorLight;
                }
            }

            /* compiled from: HomeUiState.kt */
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "", "<init>", "()V", "fade", "", "getFade", "()Z", "Solid", "Gradient", "Image", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Gradient;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Image;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static abstract class HeaderBackdropStyle {
                public static final int $stable = 0;

                public /* synthetic */ HeaderBackdropStyle(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public abstract boolean getFade();

                private HeaderBackdropStyle() {
                }

                /* compiled from: HomeUiState.kt */
                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "color", "Landroidx/compose/ui/graphics/Color;", "fade", "", "<init>", "(JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getColor-0d7_KjU", "()J", "J", "getFade", "()Z", "component1", "component1-0d7_KjU", "component2", "copy", "copy-DxMtmZc", "(JZ)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Solid;", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Solid extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final long color;
                    private final boolean fade;

                    public /* synthetic */ Solid(long j, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, z);
                    }

                    /* renamed from: copy-DxMtmZc$default, reason: not valid java name */
                    public static /* synthetic */ Solid m11533copyDxMtmZc$default(Solid solid, long j, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            j = solid.color;
                        }
                        if ((i & 2) != 0) {
                            z = solid.fade;
                        }
                        return solid.m11535copyDxMtmZc(j, z);
                    }

                    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
                    public final long getColor() {
                        return this.color;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final boolean getFade() {
                        return this.fade;
                    }

                    /* renamed from: copy-DxMtmZc, reason: not valid java name */
                    public final Solid m11535copyDxMtmZc(long color, boolean fade) {
                        return new Solid(color, fade, null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Solid)) {
                            return false;
                        }
                        Solid solid = (Solid) other;
                        return Color.m5658equalsimpl0(this.color, solid.color) && this.fade == solid.fade;
                    }

                    public int hashCode() {
                        return (Color.m5664hashCodeimpl(this.color) * 31) + Boolean.hashCode(this.fade);
                    }

                    public String toString() {
                        return "Solid(color=" + ((Object) Color.m5665toStringimpl(this.color)) + ", fade=" + this.fade + ')';
                    }

                    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
                    public final long m11536getColor0d7_KjU() {
                        return this.color;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    private Solid(long j, boolean z) {
                        super(null);
                        this.color = j;
                        this.fade = z;
                    }
                }

                /* compiled from: HomeUiState.kt */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Gradient;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "fade", "", "<init>", "(Ljava/util/List;Z)V", "getColors", "()Ljava/util/List;", "getFade", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Gradient extends HeaderBackdropStyle {
                    public static final int $stable = 8;
                    private final List<Color> colors;
                    private final boolean fade;

                    /* JADX WARN: Multi-variable type inference failed */
                    public static /* synthetic */ Gradient copy$default(Gradient gradient, List list, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            list = gradient.colors;
                        }
                        if ((i & 2) != 0) {
                            z = gradient.fade;
                        }
                        return gradient.copy(list, z);
                    }

                    public final List<Color> component1() {
                        return this.colors;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final boolean getFade() {
                        return this.fade;
                    }

                    public final Gradient copy(List<Color> colors, boolean fade) {
                        Intrinsics.checkNotNullParameter(colors, "colors");
                        return new Gradient(colors, fade);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Gradient)) {
                            return false;
                        }
                        Gradient gradient = (Gradient) other;
                        return Intrinsics.areEqual(this.colors, gradient.colors) && this.fade == gradient.fade;
                    }

                    public int hashCode() {
                        return (this.colors.hashCode() * 31) + Boolean.hashCode(this.fade);
                    }

                    public String toString() {
                        return "Gradient(colors=" + this.colors + ", fade=" + this.fade + ')';
                    }

                    public final List<Color> getColors() {
                        return this.colors;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Gradient(List<Color> colors, boolean z) {
                        super(null);
                        Intrinsics.checkNotNullParameter(colors, "colors");
                        this.colors = colors;
                        this.fade = z;
                    }
                }

                /* compiled from: HomeUiState.kt */
                @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J0\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0005H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Image;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "fallbackColor", "Landroidx/compose/ui/graphics/Color;", "imageUrl", "", "fade", "", "<init>", "(JLjava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFallbackColor-0d7_KjU", "()J", "J", "getImageUrl", "()Ljava/lang/String;", "getFade", "()Z", "component1", "component1-0d7_KjU", "component2", "component3", "copy", "copy-ek8zF_U", "(JLjava/lang/String;Z)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle$Image;", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
                public static final /* data */ class Image extends HeaderBackdropStyle {
                    public static final int $stable = 0;
                    private final boolean fade;
                    private final long fallbackColor;
                    private final String imageUrl;

                    public /* synthetic */ Image(long j, String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
                        this(j, str, z);
                    }

                    /* renamed from: copy-ek8zF_U$default, reason: not valid java name */
                    public static /* synthetic */ Image m11529copyek8zF_U$default(Image image, long j, String str, boolean z, int i, Object obj) {
                        if ((i & 1) != 0) {
                            j = image.fallbackColor;
                        }
                        if ((i & 2) != 0) {
                            str = image.imageUrl;
                        }
                        if ((i & 4) != 0) {
                            z = image.fade;
                        }
                        return image.m11531copyek8zF_U(j, str, z);
                    }

                    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
                    public final long getFallbackColor() {
                        return this.fallbackColor;
                    }

                    /* renamed from: component2, reason: from getter */
                    public final String getImageUrl() {
                        return this.imageUrl;
                    }

                    /* renamed from: component3, reason: from getter */
                    public final boolean getFade() {
                        return this.fade;
                    }

                    /* renamed from: copy-ek8zF_U, reason: not valid java name */
                    public final Image m11531copyek8zF_U(long fallbackColor, String imageUrl, boolean fade) {
                        return new Image(fallbackColor, imageUrl, fade, null);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Image)) {
                            return false;
                        }
                        Image image = (Image) other;
                        return Color.m5658equalsimpl0(this.fallbackColor, image.fallbackColor) && Intrinsics.areEqual(this.imageUrl, image.imageUrl) && this.fade == image.fade;
                    }

                    public int hashCode() {
                        int m5664hashCodeimpl = Color.m5664hashCodeimpl(this.fallbackColor) * 31;
                        String str = this.imageUrl;
                        return ((m5664hashCodeimpl + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.fade);
                    }

                    public String toString() {
                        return "Image(fallbackColor=" + ((Object) Color.m5665toStringimpl(this.fallbackColor)) + ", imageUrl=" + this.imageUrl + ", fade=" + this.fade + ')';
                    }

                    /* renamed from: getFallbackColor-0d7_KjU, reason: not valid java name */
                    public final long m11532getFallbackColor0d7_KjU() {
                        return this.fallbackColor;
                    }

                    public final String getImageUrl() {
                        return this.imageUrl;
                    }

                    @Override // io.intercom.android.sdk.m5.home.states.HomeUiState.Content.ContentHeader.HeaderBackdropStyle
                    public boolean getFade() {
                        return this.fade;
                    }

                    private Image(long j, String str, boolean z) {
                        super(null);
                        this.fallbackColor = j;
                        this.imageUrl = str;
                        this.fade = z;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Content(PoweredBy poweredBy, List<? extends HomeCards> cards, List<AvatarWrapper> adminsAvatars, AvatarWrapper avatarWrapper, boolean z, ContentHeader header) {
            super(null);
            Intrinsics.checkNotNullParameter(cards, "cards");
            Intrinsics.checkNotNullParameter(adminsAvatars, "adminsAvatars");
            Intrinsics.checkNotNullParameter(header, "header");
            this.poweredBy = poweredBy;
            this.cards = cards;
            this.adminsAvatars = adminsAvatars;
            this.botAvatar = avatarWrapper;
            this.teammateAccessEnabled = z;
            this.header = header;
        }
    }

    /* compiled from: HomeUiState.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "header", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "<init>", "(Lio/intercom/android/sdk/models/PoweredBy;Lio/intercom/android/sdk/m5/components/ErrorState;Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;)V", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "getHeader", "()Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "ErrorHeader", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends HomeUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;
        private final ErrorHeader header;
        private final PoweredBy poweredBy;

        public static /* synthetic */ Error copy$default(Error error, PoweredBy poweredBy, ErrorState errorState, ErrorHeader errorHeader, int i, Object obj) {
            if ((i & 1) != 0) {
                poweredBy = error.poweredBy;
            }
            if ((i & 2) != 0) {
                errorState = error.errorState;
            }
            if ((i & 4) != 0) {
                errorHeader = error.header;
            }
            return error.copy(poweredBy, errorState, errorHeader);
        }

        /* renamed from: component1, reason: from getter */
        public final PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        /* renamed from: component2, reason: from getter */
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        /* renamed from: component3, reason: from getter */
        public final ErrorHeader getHeader() {
            return this.header;
        }

        public final Error copy(PoweredBy poweredBy, ErrorState errorState, ErrorHeader header) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(header, "header");
            return new Error(poweredBy, errorState, header);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.poweredBy, error.poweredBy) && Intrinsics.areEqual(this.errorState, error.errorState) && Intrinsics.areEqual(this.header, error.header);
        }

        public int hashCode() {
            PoweredBy poweredBy = this.poweredBy;
            return ((((poweredBy == null ? 0 : poweredBy.hashCode()) * 31) + this.errorState.hashCode()) * 31) + this.header.hashCode();
        }

        public String toString() {
            return "Error(poweredBy=" + this.poweredBy + ", errorState=" + this.errorState + ", header=" + this.header + ')';
        }

        @Override // io.intercom.android.sdk.m5.home.states.HomeUiState
        public PoweredBy getPoweredBy() {
            return this.poweredBy;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        public final ErrorHeader getHeader() {
            return this.header;
        }

        /* compiled from: HomeUiState.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "", "backgroundColor", "", ViewProps.FOREGROUND_COLOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getForegroundColor", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ErrorHeader {
            public static final int $stable = 0;
            private final String backgroundColor;
            private final String foregroundColor;

            public static /* synthetic */ ErrorHeader copy$default(ErrorHeader errorHeader, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = errorHeader.backgroundColor;
                }
                if ((i & 2) != 0) {
                    str2 = errorHeader.foregroundColor;
                }
                return errorHeader.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* renamed from: component2, reason: from getter */
            public final String getForegroundColor() {
                return this.foregroundColor;
            }

            public final ErrorHeader copy(String backgroundColor, String foregroundColor) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
                return new ErrorHeader(backgroundColor, foregroundColor);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ErrorHeader)) {
                    return false;
                }
                ErrorHeader errorHeader = (ErrorHeader) other;
                return Intrinsics.areEqual(this.backgroundColor, errorHeader.backgroundColor) && Intrinsics.areEqual(this.foregroundColor, errorHeader.foregroundColor);
            }

            public int hashCode() {
                return (this.backgroundColor.hashCode() * 31) + this.foregroundColor.hashCode();
            }

            public String toString() {
                return "ErrorHeader(backgroundColor=" + this.backgroundColor + ", foregroundColor=" + this.foregroundColor + ')';
            }

            public ErrorHeader(String backgroundColor, String foregroundColor) {
                Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
                Intrinsics.checkNotNullParameter(foregroundColor, "foregroundColor");
                this.backgroundColor = backgroundColor;
                this.foregroundColor = foregroundColor;
            }

            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            public final String getForegroundColor() {
                return this.foregroundColor;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PoweredBy poweredBy, ErrorState errorState, ErrorHeader header) {
            super(null);
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(header, "header");
            this.poweredBy = poweredBy;
            this.errorState = errorState;
            this.header = header;
        }
    }
}
