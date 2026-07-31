package com.vungle.ads.fpd;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,+B\u0007¢\u0006\u0004\b%\u0010&B'\b\u0017\u0012\u0006\u0010'\u001a\u00020\u000f\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b%\u0010*J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tH\u0007J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u0018\u0010\u001a\u001a\u00020\u00002\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0007J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\tH\u0007J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u000fH\u0007J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u000fH\u0007J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\tH\u0007¨\u0006-"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "", "levelPercentile", "setLevelPercentile", "", "page", "setPage", "", "timeSpent", "setTimeSpent", "signupDate", "setSignupDate", "userScorePercentile", "setUserScorePercentile", SDKConstants.PARAM_USER_ID, "setUserID", "", NativeProtocol.AUDIENCE_FRIENDS, "setFriends", "userLevelPercentile", "setUserLevelPercentile", "healthPercentile", "setHealthPercentile", "sessionStartTime", "setSessionStartTime", "sessionDuration", "setSessionDuration", "inGamePurchasesUSD", "setInGamePurchasesUSD", "<init>", "()V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
@Serializable
/* loaded from: classes6.dex */
public final class SessionContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public Float a;

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/fpd/SessionContext$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/SessionContext;", "serializer", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SessionContext$$serializer.INSTANCE;
        }
    }

    public SessionContext() {
    }

    public static final void write$Self(@NotNull SessionContext self, @NotNull CompositeEncoder output, @NotNull SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.a == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 0, FloatSerializer.INSTANCE, self.a);
    }

    @Deprecated
    @NotNull
    public final SessionContext setFriends(@Nullable List<String> friends) {
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setHealthPercentile(float healthPercentile) {
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setInGamePurchasesUSD(float inGamePurchasesUSD) {
        return this;
    }

    @NotNull
    public final SessionContext setLevelPercentile(float levelPercentile) {
        if (0.0f <= levelPercentile && levelPercentile <= 100.0f) {
            this.a = Float.valueOf(levelPercentile);
        }
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setPage(@NotNull String page) {
        Intrinsics.checkNotNullParameter(page, "page");
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setSessionDuration(int sessionDuration) {
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setSessionStartTime(int sessionStartTime) {
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setSignupDate(int signupDate) {
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setTimeSpent(int timeSpent) {
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setUserID(@NotNull String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setUserLevelPercentile(float userLevelPercentile) {
        return this;
    }

    @Deprecated
    @NotNull
    public final SessionContext setUserScorePercentile(float userScorePercentile) {
        return this;
    }

    @Deprecated
    public /* synthetic */ SessionContext(int i, Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
    }
}
