package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import io.intercom.android.sdk.models.Participant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActiveBot.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u001dH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/models/ActiveBot;", "", "participant", "Lio/intercom/android/sdk/models/Participant$Builder;", "isAi", "", "useBotUx", "isIdentityCustomized", "streamingPart", "Lio/intercom/android/sdk/models/StreamingPart;", "<init>", "(Lio/intercom/android/sdk/models/Participant$Builder;ZZZLio/intercom/android/sdk/models/StreamingPart;)V", "getParticipant", "()Lio/intercom/android/sdk/models/Participant$Builder;", "()Z", "getUseBotUx", "getStreamingPart", "()Lio/intercom/android/sdk/models/StreamingPart;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ActiveBot {
    public static final int $stable = 8;

    @SerializedName("has_ai")
    private final boolean isAi;

    @SerializedName("has_customized_identity")
    private final boolean isIdentityCustomized;

    @SerializedName("participant")
    private final Participant.Builder participant;

    @SerializedName("streaming_part")
    private final StreamingPart streamingPart;

    @SerializedName("use_bot_ux")
    private final boolean useBotUx;

    public ActiveBot() {
        this(null, false, false, false, null, 31, null);
    }

    public static /* synthetic */ ActiveBot copy$default(ActiveBot activeBot, Participant.Builder builder, boolean z, boolean z2, boolean z3, StreamingPart streamingPart, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = activeBot.participant;
        }
        if ((i & 2) != 0) {
            z = activeBot.isAi;
        }
        if ((i & 4) != 0) {
            z2 = activeBot.useBotUx;
        }
        if ((i & 8) != 0) {
            z3 = activeBot.isIdentityCustomized;
        }
        if ((i & 16) != 0) {
            streamingPart = activeBot.streamingPart;
        }
        StreamingPart streamingPart2 = streamingPart;
        boolean z4 = z2;
        return activeBot.copy(builder, z, z4, z3, streamingPart2);
    }

    /* renamed from: component1, reason: from getter */
    public final Participant.Builder getParticipant() {
        return this.participant;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAi() {
        return this.isAi;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseBotUx() {
        return this.useBotUx;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsIdentityCustomized() {
        return this.isIdentityCustomized;
    }

    /* renamed from: component5, reason: from getter */
    public final StreamingPart getStreamingPart() {
        return this.streamingPart;
    }

    public final ActiveBot copy(Participant.Builder participant, boolean isAi, boolean useBotUx, boolean isIdentityCustomized, StreamingPart streamingPart) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        return new ActiveBot(participant, isAi, useBotUx, isIdentityCustomized, streamingPart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveBot)) {
            return false;
        }
        ActiveBot activeBot = (ActiveBot) other;
        return Intrinsics.areEqual(this.participant, activeBot.participant) && this.isAi == activeBot.isAi && this.useBotUx == activeBot.useBotUx && this.isIdentityCustomized == activeBot.isIdentityCustomized && Intrinsics.areEqual(this.streamingPart, activeBot.streamingPart);
    }

    public int hashCode() {
        int hashCode = ((((((this.participant.hashCode() * 31) + Boolean.hashCode(this.isAi)) * 31) + Boolean.hashCode(this.useBotUx)) * 31) + Boolean.hashCode(this.isIdentityCustomized)) * 31;
        StreamingPart streamingPart = this.streamingPart;
        return hashCode + (streamingPart == null ? 0 : streamingPart.hashCode());
    }

    public String toString() {
        return "ActiveBot(participant=" + this.participant + ", isAi=" + this.isAi + ", useBotUx=" + this.useBotUx + ", isIdentityCustomized=" + this.isIdentityCustomized + ", streamingPart=" + this.streamingPart + ')';
    }

    public ActiveBot(Participant.Builder participant, boolean z, boolean z2, boolean z3, StreamingPart streamingPart) {
        Intrinsics.checkNotNullParameter(participant, "participant");
        this.participant = participant;
        this.isAi = z;
        this.useBotUx = z2;
        this.isIdentityCustomized = z3;
        this.streamingPart = streamingPart;
    }

    public final Participant.Builder getParticipant() {
        return this.participant;
    }

    public /* synthetic */ ActiveBot(Participant.Builder builder, boolean z, boolean z2, boolean z3, StreamingPart streamingPart, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Participant.Builder() : builder, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : streamingPart);
    }

    public final boolean isAi() {
        return this.isAi;
    }

    public final boolean getUseBotUx() {
        return this.useBotUx;
    }

    public final boolean isIdentityCustomized() {
        return this.isIdentityCustomized;
    }

    public final StreamingPart getStreamingPart() {
        return this.streamingPart;
    }
}
