package io.intercom.android.sdk.models;

import com.amazon.a.a.o.b;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenMessengerResponse.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002./B]\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000fHÆ\u0003J_\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÇ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020,H×\u0001J\t\u0010-\u001a\u00020\tH×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse;", "", "composerSuggestions", "Lio/intercom/android/sdk/models/ComposerSuggestions;", "newConversationData", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;", "composerState", "Lio/intercom/android/sdk/models/ComposerState;", b.B, "", "poweredBy", "Lio/intercom/android/sdk/models/PoweredBy;", "openInboundConversations", "", "privacyNotice", "Lio/intercom/android/sdk/models/PrivacyNotice;", "<init>", "(Lio/intercom/android/sdk/models/ComposerSuggestions;Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;Lio/intercom/android/sdk/models/ComposerState;Ljava/lang/String;Lio/intercom/android/sdk/models/PoweredBy;Ljava/util/List;Lio/intercom/android/sdk/models/PrivacyNotice;)V", "getComposerSuggestions", "()Lio/intercom/android/sdk/models/ComposerSuggestions;", "getNewConversationData", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;", "getComposerState", "()Lio/intercom/android/sdk/models/ComposerState;", "getRequestId", "()Ljava/lang/String;", "getPoweredBy", "()Lio/intercom/android/sdk/models/PoweredBy;", "getOpenInboundConversations", "()Ljava/util/List;", "getPrivacyNotice", "()Lio/intercom/android/sdk/models/PrivacyNotice;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "NewConversationData", "IconType", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class OpenMessengerResponse {
    public static final int $stable = 8;

    @SerializedName("composer_state")
    private final ComposerState composerState;

    @SerializedName(MetricTracker.Object.COMPOSER_SUGGESTIONS)
    private final ComposerSuggestions composerSuggestions;

    @SerializedName("new_conversation")
    private final NewConversationData newConversationData;

    @SerializedName("open_inbound_conversation_ids")
    private final List<String> openInboundConversations;

    @SerializedName("powered_by")
    private final PoweredBy poweredBy;

    @SerializedName("privacy_policy_notice")
    private final PrivacyNotice privacyNotice;

    @SerializedName("request_id")
    private final String requestId;

    public OpenMessengerResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OpenMessengerResponse copy$default(OpenMessengerResponse openMessengerResponse, ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List list, PrivacyNotice privacyNotice, int i, Object obj) {
        if ((i & 1) != 0) {
            composerSuggestions = openMessengerResponse.composerSuggestions;
        }
        if ((i & 2) != 0) {
            newConversationData = openMessengerResponse.newConversationData;
        }
        if ((i & 4) != 0) {
            composerState = openMessengerResponse.composerState;
        }
        if ((i & 8) != 0) {
            str = openMessengerResponse.requestId;
        }
        if ((i & 16) != 0) {
            poweredBy = openMessengerResponse.poweredBy;
        }
        if ((i & 32) != 0) {
            list = openMessengerResponse.openInboundConversations;
        }
        if ((i & 64) != 0) {
            privacyNotice = openMessengerResponse.privacyNotice;
        }
        List list2 = list;
        PrivacyNotice privacyNotice2 = privacyNotice;
        PoweredBy poweredBy2 = poweredBy;
        ComposerState composerState2 = composerState;
        return openMessengerResponse.copy(composerSuggestions, newConversationData, composerState2, str, poweredBy2, list2, privacyNotice2);
    }

    /* renamed from: component1, reason: from getter */
    public final ComposerSuggestions getComposerSuggestions() {
        return this.composerSuggestions;
    }

    /* renamed from: component2, reason: from getter */
    public final NewConversationData getNewConversationData() {
        return this.newConversationData;
    }

    /* renamed from: component3, reason: from getter */
    public final ComposerState getComposerState() {
        return this.composerState;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component5, reason: from getter */
    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final List<String> component6() {
        return this.openInboundConversations;
    }

    /* renamed from: component7, reason: from getter */
    public final PrivacyNotice getPrivacyNotice() {
        return this.privacyNotice;
    }

    public final OpenMessengerResponse copy(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String requestId, PoweredBy poweredBy, List<String> openInboundConversations, PrivacyNotice privacyNotice) {
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(openInboundConversations, "openInboundConversations");
        return new OpenMessengerResponse(composerSuggestions, newConversationData, composerState, requestId, poweredBy, openInboundConversations, privacyNotice);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenMessengerResponse)) {
            return false;
        }
        OpenMessengerResponse openMessengerResponse = (OpenMessengerResponse) other;
        return Intrinsics.areEqual(this.composerSuggestions, openMessengerResponse.composerSuggestions) && Intrinsics.areEqual(this.newConversationData, openMessengerResponse.newConversationData) && Intrinsics.areEqual(this.composerState, openMessengerResponse.composerState) && Intrinsics.areEqual(this.requestId, openMessengerResponse.requestId) && Intrinsics.areEqual(this.poweredBy, openMessengerResponse.poweredBy) && Intrinsics.areEqual(this.openInboundConversations, openMessengerResponse.openInboundConversations) && Intrinsics.areEqual(this.privacyNotice, openMessengerResponse.privacyNotice);
    }

    public int hashCode() {
        ComposerSuggestions composerSuggestions = this.composerSuggestions;
        int hashCode = (composerSuggestions == null ? 0 : composerSuggestions.hashCode()) * 31;
        NewConversationData newConversationData = this.newConversationData;
        int hashCode2 = (((hashCode + (newConversationData == null ? 0 : newConversationData.hashCode())) * 31) + this.composerState.hashCode()) * 31;
        String str = this.requestId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PoweredBy poweredBy = this.poweredBy;
        int hashCode4 = (((hashCode3 + (poweredBy == null ? 0 : poweredBy.hashCode())) * 31) + this.openInboundConversations.hashCode()) * 31;
        PrivacyNotice privacyNotice = this.privacyNotice;
        return hashCode4 + (privacyNotice != null ? privacyNotice.hashCode() : 0);
    }

    public String toString() {
        return "OpenMessengerResponse(composerSuggestions=" + this.composerSuggestions + ", newConversationData=" + this.newConversationData + ", composerState=" + this.composerState + ", requestId=" + this.requestId + ", poweredBy=" + this.poweredBy + ", openInboundConversations=" + this.openInboundConversations + ", privacyNotice=" + this.privacyNotice + ')';
    }

    public OpenMessengerResponse(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List<String> openInboundConversations, PrivacyNotice privacyNotice) {
        Intrinsics.checkNotNullParameter(composerState, "composerState");
        Intrinsics.checkNotNullParameter(openInboundConversations, "openInboundConversations");
        this.composerSuggestions = composerSuggestions;
        this.newConversationData = newConversationData;
        this.composerState = composerState;
        this.requestId = str;
        this.poweredBy = poweredBy;
        this.openInboundConversations = openInboundConversations;
        this.privacyNotice = privacyNotice;
    }

    public final ComposerSuggestions getComposerSuggestions() {
        return this.composerSuggestions;
    }

    public final NewConversationData getNewConversationData() {
        return this.newConversationData;
    }

    public final ComposerState getComposerState() {
        return this.composerState;
    }

    public /* synthetic */ OpenMessengerResponse(ComposerSuggestions composerSuggestions, NewConversationData newConversationData, ComposerState composerState, String str, PoweredBy poweredBy, List list, PrivacyNotice privacyNotice, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : composerSuggestions, (i & 2) != 0 ? null : newConversationData, (i & 4) != 0 ? ComposerState.INSTANCE.getNULL() : composerState, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : poweredBy, (i & 32) != 0 ? CollectionsKt.emptyList() : list, (i & 64) != 0 ? null : privacyNotice);
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final PoweredBy getPoweredBy() {
        return this.poweredBy;
    }

    public final List<String> getOpenInboundConversations() {
        return this.openInboundConversations;
    }

    public final PrivacyNotice getPrivacyNotice() {
        return this.privacyNotice;
    }

    /* compiled from: OpenMessengerResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002,-B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÇ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010)\u001a\u00020*H×\u0001J\t\u0010+\u001a\u00020\u000eH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001c¨\u0006."}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData;", "", SDKConstants.PARAM_GAME_REQUESTS_CTA, "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "homeCard", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "parts", "", "Lio/intercom/android/sdk/models/Part$Builder;", "participants", "Lio/intercom/android/sdk/models/Participant$Builder;", "header", "Lio/intercom/android/sdk/models/Header;", "teamIntro", "", "specialNotice", "<init>", "(Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;Ljava/util/List;Ljava/util/List;Lio/intercom/android/sdk/models/Header;Ljava/lang/String;Ljava/lang/String;)V", "getCta", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "getHomeCard", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "getParts", "()Ljava/util/List;", "getParticipants", "getHeader", "()Lio/intercom/android/sdk/models/Header;", "getTeamIntro", "()Ljava/lang/String;", "getSpecialNotice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Cta", "HomeCard", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewConversationData {
        public static final int $stable = 8;

        @SerializedName(SDKConstants.PARAM_GAME_REQUESTS_CTA)
        private final Cta cta;

        @SerializedName("header")
        private final Header header;

        @SerializedName("home_card")
        private final HomeCard homeCard;

        @SerializedName("participants")
        private final List<Participant.Builder> participants;

        @SerializedName("parts")
        private final List<Part.Builder> parts;

        @SerializedName("special_notice")
        private final String specialNotice;

        @SerializedName("team_intro")
        private final String teamIntro;

        public static /* synthetic */ NewConversationData copy$default(NewConversationData newConversationData, Cta cta, HomeCard homeCard, List list, List list2, Header header, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                cta = newConversationData.cta;
            }
            if ((i & 2) != 0) {
                homeCard = newConversationData.homeCard;
            }
            if ((i & 4) != 0) {
                list = newConversationData.parts;
            }
            if ((i & 8) != 0) {
                list2 = newConversationData.participants;
            }
            if ((i & 16) != 0) {
                header = newConversationData.header;
            }
            if ((i & 32) != 0) {
                str = newConversationData.teamIntro;
            }
            if ((i & 64) != 0) {
                str2 = newConversationData.specialNotice;
            }
            String str3 = str;
            String str4 = str2;
            Header header2 = header;
            List list3 = list;
            return newConversationData.copy(cta, homeCard, list3, list2, header2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final Cta getCta() {
            return this.cta;
        }

        /* renamed from: component2, reason: from getter */
        public final HomeCard getHomeCard() {
            return this.homeCard;
        }

        public final List<Part.Builder> component3() {
            return this.parts;
        }

        public final List<Participant.Builder> component4() {
            return this.participants;
        }

        /* renamed from: component5, reason: from getter */
        public final Header getHeader() {
            return this.header;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTeamIntro() {
            return this.teamIntro;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSpecialNotice() {
            return this.specialNotice;
        }

        public final NewConversationData copy(Cta cta, HomeCard homeCard, List<Part.Builder> parts, List<Participant.Builder> participants, Header header, String teamIntro, String specialNotice) {
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(homeCard, "homeCard");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(participants, "participants");
            return new NewConversationData(cta, homeCard, parts, participants, header, teamIntro, specialNotice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewConversationData)) {
                return false;
            }
            NewConversationData newConversationData = (NewConversationData) other;
            return Intrinsics.areEqual(this.cta, newConversationData.cta) && Intrinsics.areEqual(this.homeCard, newConversationData.homeCard) && Intrinsics.areEqual(this.parts, newConversationData.parts) && Intrinsics.areEqual(this.participants, newConversationData.participants) && Intrinsics.areEqual(this.header, newConversationData.header) && Intrinsics.areEqual(this.teamIntro, newConversationData.teamIntro) && Intrinsics.areEqual(this.specialNotice, newConversationData.specialNotice);
        }

        public int hashCode() {
            int hashCode = ((((((this.cta.hashCode() * 31) + this.homeCard.hashCode()) * 31) + this.parts.hashCode()) * 31) + this.participants.hashCode()) * 31;
            Header header = this.header;
            int hashCode2 = (hashCode + (header == null ? 0 : header.hashCode())) * 31;
            String str = this.teamIntro;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.specialNotice;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "NewConversationData(cta=" + this.cta + ", homeCard=" + this.homeCard + ", parts=" + this.parts + ", participants=" + this.participants + ", header=" + this.header + ", teamIntro=" + this.teamIntro + ", specialNotice=" + this.specialNotice + ')';
        }

        public NewConversationData(Cta cta, HomeCard homeCard, List<Part.Builder> parts, List<Participant.Builder> participants, Header header, String str, String str2) {
            Intrinsics.checkNotNullParameter(cta, "cta");
            Intrinsics.checkNotNullParameter(homeCard, "homeCard");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(participants, "participants");
            this.cta = cta;
            this.homeCard = homeCard;
            this.parts = parts;
            this.participants = participants;
            this.header = header;
            this.teamIntro = str;
            this.specialNotice = str2;
        }

        public final Cta getCta() {
            return this.cta;
        }

        public final HomeCard getHomeCard() {
            return this.homeCard;
        }

        public final List<Part.Builder> getParts() {
            return this.parts;
        }

        public /* synthetic */ NewConversationData(Cta cta, HomeCard homeCard, List list, List list2, Header header, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(cta, homeCard, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : header, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2);
        }

        public final List<Participant.Builder> getParticipants() {
            return this.participants;
        }

        public final Header getHeader() {
            return this.header;
        }

        public final String getTeamIntro() {
            return this.teamIntro;
        }

        public final String getSpecialNotice() {
            return this.specialNotice;
        }

        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$Cta;", "", "text", "", "subtitle", "icon", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;)V", "getText", "()Ljava/lang/String;", "getSubtitle", "getIcon", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cta {
            public static final int $stable = 0;

            @SerializedName("icon")
            private final IconType icon;

            @SerializedName("subtitle")
            private final String subtitle;

            @SerializedName("text")
            private final String text;

            public static /* synthetic */ Cta copy$default(Cta cta, String str, String str2, IconType iconType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cta.text;
                }
                if ((i & 2) != 0) {
                    str2 = cta.subtitle;
                }
                if ((i & 4) != 0) {
                    iconType = cta.icon;
                }
                return cta.copy(str, str2, iconType);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final IconType getIcon() {
                return this.icon;
            }

            public final Cta copy(String text, String subtitle, IconType icon) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(icon, "icon");
                return new Cta(text, subtitle, icon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Cta)) {
                    return false;
                }
                Cta cta = (Cta) other;
                return Intrinsics.areEqual(this.text, cta.text) && Intrinsics.areEqual(this.subtitle, cta.subtitle) && this.icon == cta.icon;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.icon.hashCode();
            }

            public String toString() {
                return "Cta(text=" + this.text + ", subtitle=" + this.subtitle + ", icon=" + this.icon + ')';
            }

            public Cta(String text, String str, IconType icon) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(icon, "icon");
                this.text = text;
                this.subtitle = str;
                this.icon = icon;
            }

            public /* synthetic */ Cta(String str, String str2, IconType iconType, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, iconType);
            }

            public final String getText() {
                return this.text;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final IconType getIcon() {
                return this.icon;
            }
        }

        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "", "text", "", "subtitle", "avatarDetails", "Lio/intercom/android/sdk/models/AvatarDetails;", "icon", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/models/AvatarDetails;Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;)V", "getText", "()Ljava/lang/String;", "getSubtitle", "getAvatarDetails", "()Lio/intercom/android/sdk/models/AvatarDetails;", "getIcon", "()Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HomeCard {
            public static final int $stable = 8;

            @SerializedName("avatar_details")
            private final AvatarDetails avatarDetails;

            @SerializedName("icon")
            private final IconType icon;

            @SerializedName("subtitle")
            private final String subtitle;

            @SerializedName("text")
            private final String text;

            public static /* synthetic */ HomeCard copy$default(HomeCard homeCard, String str, String str2, AvatarDetails avatarDetails, IconType iconType, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = homeCard.text;
                }
                if ((i & 2) != 0) {
                    str2 = homeCard.subtitle;
                }
                if ((i & 4) != 0) {
                    avatarDetails = homeCard.avatarDetails;
                }
                if ((i & 8) != 0) {
                    iconType = homeCard.icon;
                }
                return homeCard.copy(str, str2, avatarDetails, iconType);
            }

            /* renamed from: component1, reason: from getter */
            public final String getText() {
                return this.text;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            /* renamed from: component4, reason: from getter */
            public final IconType getIcon() {
                return this.icon;
            }

            public final HomeCard copy(String text, String subtitle, AvatarDetails avatarDetails, IconType icon) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new HomeCard(text, subtitle, avatarDetails, icon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HomeCard)) {
                    return false;
                }
                HomeCard homeCard = (HomeCard) other;
                return Intrinsics.areEqual(this.text, homeCard.text) && Intrinsics.areEqual(this.subtitle, homeCard.subtitle) && Intrinsics.areEqual(this.avatarDetails, homeCard.avatarDetails) && this.icon == homeCard.icon;
            }

            public int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                String str = this.subtitle;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                AvatarDetails avatarDetails = this.avatarDetails;
                int hashCode3 = (hashCode2 + (avatarDetails == null ? 0 : avatarDetails.hashCode())) * 31;
                IconType iconType = this.icon;
                return hashCode3 + (iconType != null ? iconType.hashCode() : 0);
            }

            public String toString() {
                return "HomeCard(text=" + this.text + ", subtitle=" + this.subtitle + ", avatarDetails=" + this.avatarDetails + ", icon=" + this.icon + ')';
            }

            public HomeCard(String text, String str, AvatarDetails avatarDetails, IconType iconType) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
                this.subtitle = str;
                this.avatarDetails = avatarDetails;
                this.icon = iconType;
            }

            public /* synthetic */ HomeCard(String str, String str2, AvatarDetails avatarDetails, IconType iconType, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : avatarDetails, (i & 8) != 0 ? null : iconType);
            }

            public final String getText() {
                return this.text;
            }

            public final String getSubtitle() {
                return this.subtitle;
            }

            public final AvatarDetails getAvatarDetails() {
                return this.avatarDetails;
            }

            public final IconType getIcon() {
                return this.icon;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OpenMessengerResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "", "<init>", "(Ljava/lang/String;I)V", "CHEVRON", "QUESTION_BUBBLE", "PAPER_PLANE", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IconType[] $VALUES;

        @SerializedName("chevron")
        public static final IconType CHEVRON = new CHEVRON("CHEVRON", 0);

        @SerializedName("question_bubble")
        public static final IconType QUESTION_BUBBLE = new QUESTION_BUBBLE("QUESTION_BUBBLE", 1);

        @SerializedName("paper_plane")
        public static final IconType PAPER_PLANE = new PAPER_PLANE("PAPER_PLANE", 2);

        private static final /* synthetic */ IconType[] $values() {
            return new IconType[]{CHEVRON, QUESTION_BUBBLE, PAPER_PLANE};
        }

        public /* synthetic */ IconType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<IconType> getEntries() {
            return $ENTRIES;
        }

        public abstract Integer getIcon();

        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/models/OpenMessengerResponse.IconType.CHEVRON", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class CHEVRON extends IconType {
            CHEVRON(String str, int i) {
                super(str, i, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_chevron);
            }
        }

        private IconType(String str, int i) {
        }

        static {
            IconType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/models/OpenMessengerResponse.IconType.QUESTION_BUBBLE", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class QUESTION_BUBBLE extends IconType {
            QUESTION_BUBBLE(String str, int i) {
                super(str, i, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_conversation_card_question);
            }
        }

        /* compiled from: OpenMessengerResponse.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\r\u0010\u0002\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"io/intercom/android/sdk/models/OpenMessengerResponse.IconType.PAPER_PLANE", "Lio/intercom/android/sdk/models/OpenMessengerResponse$IconType;", "getIcon", "", "()Ljava/lang/Integer;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class PAPER_PLANE extends IconType {
            PAPER_PLANE(String str, int i) {
                super(str, i, null);
            }

            @Override // io.intercom.android.sdk.models.OpenMessengerResponse.IconType
            public Integer getIcon() {
                return Integer.valueOf(R.drawable.intercom_send_message_icon);
            }
        }

        public static IconType valueOf(String str) {
            return (IconType) Enum.valueOf(IconType.class, str);
        }

        public static IconType[] values() {
            return (IconType[]) $VALUES.clone();
        }
    }
}
