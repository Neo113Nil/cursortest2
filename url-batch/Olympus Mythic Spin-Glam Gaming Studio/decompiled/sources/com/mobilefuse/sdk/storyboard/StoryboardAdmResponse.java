package com.mobilefuse.sdk.storyboard;

import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.json.JSONObjectGetValueOrNullKt;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.storyboard.overlay.OverlayResponse;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.sdk.video.ClickthroughBehaviourKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: StoryboardAdmResponse.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0086\b\u0018\u0000 =2\u00020\u0001:\u0001=Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00102\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00104\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010%J\u0010\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0090\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u000bHÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017¨\u0006>"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "", "type", "Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "adm", "", "clickBehavior", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "forceSkipSeconds", "", "maxEndCards", "", "endCardCloseSeconds", "muted", "", "blockSkipSeconds", "overlay", "Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "uiAdm", "(Lcom/mobilefuse/sdk/network/model/AdmMediaType;Ljava/lang/String;Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;Lcom/mobilefuse/sdk/CloseConfigResponse;Ljava/lang/String;)V", "getAdm", "()Ljava/lang/String;", "getBlockSkipSeconds", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getClickBehavior", "()Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "getCloseConfigResponse", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "getEndCardCloseSeconds", "getForceSkipSeconds", "getMaxEndCards", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMuted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOverlay", "()Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;", "getType", "()Lcom/mobilefuse/sdk/network/model/AdmMediaType;", "getUiAdm", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/mobilefuse/sdk/network/model/AdmMediaType;Ljava/lang/String;Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Boolean;Ljava/lang/Float;Lcom/mobilefuse/sdk/storyboard/overlay/OverlayResponse;Lcom/mobilefuse/sdk/CloseConfigResponse;Ljava/lang/String;)Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "equals", "other", "hashCode", "toString", "Companion", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public final /* data */ class StoryboardAdmResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String adm;

    @Nullable
    private final Float blockSkipSeconds;

    @Nullable
    private final ClickthroughBehaviour clickBehavior;

    @Nullable
    private final CloseConfigResponse closeConfigResponse;

    @Nullable
    private final Float endCardCloseSeconds;

    @Nullable
    private final Float forceSkipSeconds;

    @Nullable
    private final Integer maxEndCards;

    @Nullable
    private final Boolean muted;

    @Nullable
    private final OverlayResponse overlay;

    @NotNull
    private final AdmMediaType type;

    @Nullable
    private final String uiAdm;

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AdmMediaType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getUiAdm() {
        return this.uiAdm;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAdm() {
        return this.adm;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final ClickthroughBehaviour getClickBehavior() {
        return this.clickBehavior;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getEndCardCloseSeconds() {
        return this.endCardCloseSeconds;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getMuted() {
        return this.muted;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final OverlayResponse getOverlay() {
        return this.overlay;
    }

    @NotNull
    public final StoryboardAdmResponse copy(@NotNull AdmMediaType type, @Nullable String adm, @Nullable ClickthroughBehaviour clickBehavior, @Nullable Float forceSkipSeconds, @Nullable Integer maxEndCards, @Nullable Float endCardCloseSeconds, @Nullable Boolean muted, @Nullable Float blockSkipSeconds, @Nullable OverlayResponse overlay, @Nullable CloseConfigResponse closeConfigResponse, @Nullable String uiAdm) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new StoryboardAdmResponse(type, adm, clickBehavior, forceSkipSeconds, maxEndCards, endCardCloseSeconds, muted, blockSkipSeconds, overlay, closeConfigResponse, uiAdm);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryboardAdmResponse)) {
            return false;
        }
        StoryboardAdmResponse storyboardAdmResponse = (StoryboardAdmResponse) other;
        return Intrinsics.areEqual(this.type, storyboardAdmResponse.type) && Intrinsics.areEqual(this.adm, storyboardAdmResponse.adm) && Intrinsics.areEqual(this.clickBehavior, storyboardAdmResponse.clickBehavior) && Intrinsics.areEqual((Object) this.forceSkipSeconds, (Object) storyboardAdmResponse.forceSkipSeconds) && Intrinsics.areEqual(this.maxEndCards, storyboardAdmResponse.maxEndCards) && Intrinsics.areEqual((Object) this.endCardCloseSeconds, (Object) storyboardAdmResponse.endCardCloseSeconds) && Intrinsics.areEqual(this.muted, storyboardAdmResponse.muted) && Intrinsics.areEqual((Object) this.blockSkipSeconds, (Object) storyboardAdmResponse.blockSkipSeconds) && Intrinsics.areEqual(this.overlay, storyboardAdmResponse.overlay) && Intrinsics.areEqual(this.closeConfigResponse, storyboardAdmResponse.closeConfigResponse) && Intrinsics.areEqual(this.uiAdm, storyboardAdmResponse.uiAdm);
    }

    public int hashCode() {
        AdmMediaType admMediaType = this.type;
        int hashCode = (admMediaType != null ? admMediaType.hashCode() : 0) * 31;
        String str = this.adm;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ClickthroughBehaviour clickthroughBehaviour = this.clickBehavior;
        int hashCode3 = (hashCode2 + (clickthroughBehaviour != null ? clickthroughBehaviour.hashCode() : 0)) * 31;
        Float f = this.forceSkipSeconds;
        int hashCode4 = (hashCode3 + (f != null ? f.hashCode() : 0)) * 31;
        Integer num = this.maxEndCards;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Float f2 = this.endCardCloseSeconds;
        int hashCode6 = (hashCode5 + (f2 != null ? f2.hashCode() : 0)) * 31;
        Boolean bool = this.muted;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Float f3 = this.blockSkipSeconds;
        int hashCode8 = (hashCode7 + (f3 != null ? f3.hashCode() : 0)) * 31;
        OverlayResponse overlayResponse = this.overlay;
        int hashCode9 = (hashCode8 + (overlayResponse != null ? overlayResponse.hashCode() : 0)) * 31;
        CloseConfigResponse closeConfigResponse = this.closeConfigResponse;
        int hashCode10 = (hashCode9 + (closeConfigResponse != null ? closeConfigResponse.hashCode() : 0)) * 31;
        String str2 = this.uiAdm;
        return hashCode10 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StoryboardAdmResponse(type=" + this.type + ", adm=" + this.adm + ", clickBehavior=" + this.clickBehavior + ", forceSkipSeconds=" + this.forceSkipSeconds + ", maxEndCards=" + this.maxEndCards + ", endCardCloseSeconds=" + this.endCardCloseSeconds + ", muted=" + this.muted + ", blockSkipSeconds=" + this.blockSkipSeconds + ", overlay=" + this.overlay + ", closeConfigResponse=" + this.closeConfigResponse + ", uiAdm=" + this.uiAdm + ")";
    }

    public StoryboardAdmResponse(@NotNull AdmMediaType type, @Nullable String str, @Nullable ClickthroughBehaviour clickthroughBehaviour, @Nullable Float f, @Nullable Integer num, @Nullable Float f2, @Nullable Boolean bool, @Nullable Float f3, @Nullable OverlayResponse overlayResponse, @Nullable CloseConfigResponse closeConfigResponse, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.adm = str;
        this.clickBehavior = clickthroughBehaviour;
        this.forceSkipSeconds = f;
        this.maxEndCards = num;
        this.endCardCloseSeconds = f2;
        this.muted = bool;
        this.blockSkipSeconds = f3;
        this.overlay = overlayResponse;
        this.closeConfigResponse = closeConfigResponse;
        this.uiAdm = str2;
    }

    @NotNull
    public final AdmMediaType getType() {
        return this.type;
    }

    @Nullable
    public final String getAdm() {
        return this.adm;
    }

    @Nullable
    public final ClickthroughBehaviour getClickBehavior() {
        return this.clickBehavior;
    }

    @Nullable
    public final Float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    @Nullable
    public final Integer getMaxEndCards() {
        return this.maxEndCards;
    }

    @Nullable
    public final Float getEndCardCloseSeconds() {
        return this.endCardCloseSeconds;
    }

    @Nullable
    public final Boolean getMuted() {
        return this.muted;
    }

    @Nullable
    public final Float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    @Nullable
    public final OverlayResponse getOverlay() {
        return this.overlay;
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @Nullable
    public final String getUiAdm() {
        return this.uiAdm;
    }

    /* compiled from: StoryboardAdmResponse.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse$Companion;", "", "()V", "admStoryboardResponseParse", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lcom/mobilefuse/sdk/storyboard/StoryboardAdmResponse;", "jsonText", "", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Either<BaseError, StoryboardAdmResponse> admStoryboardResponseParse(@NotNull String jsonText) {
            Either errorResult;
            Object value;
            Intrinsics.checkNotNullParameter(jsonText, "jsonText");
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            try {
                JSONObject jSONObject = new JSONObject(jsonText);
                AdmMediaType.Companion companion = AdmMediaType.INSTANCE;
                String string = jSONObject.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "json.getString(\"type\")");
                AdmMediaType fromValue = companion.fromValue(string);
                Intrinsics.checkNotNull(fromValue);
                String stringOrNull = JSONObjectGetValueOrNullKt.getStringOrNull(jSONObject, "adm");
                String obj = stringOrNull != null ? StringsKt.trim(stringOrNull).toString() : null;
                String stringOrNull2 = JSONObjectGetValueOrNullKt.getStringOrNull(jSONObject, "click_behavior");
                ClickthroughBehaviour fromValue2 = stringOrNull2 != null ? ClickthroughBehaviourKt.fromValue(ClickthroughBehaviour.INSTANCE, stringOrNull2) : null;
                Integer intOrNull = JSONObjectGetValueOrNullKt.getIntOrNull(jSONObject, "max_end_cards");
                Float floatOrNull = JSONObjectGetValueOrNullKt.getFloatOrNull(jSONObject, "end_card_close_seconds");
                Boolean booleanOrNull = JSONObjectGetValueOrNullKt.getBooleanOrNull(jSONObject, "muted");
                Float floatOrNull2 = JSONObjectGetValueOrNullKt.getFloatOrNull(jSONObject, "force_skip_seconds");
                Float floatOrNull3 = JSONObjectGetValueOrNullKt.getFloatOrNull(jSONObject, "block_skip_seconds");
                JSONObject optJSONObject = jSONObject.optJSONObject("overlay");
                OverlayResponse parseResponse = optJSONObject != null ? OverlayResponse.INSTANCE.parseResponse(optJSONObject) : null;
                JSONObject optJSONObject2 = jSONObject.optJSONObject("mraid_close_pos");
                CloseConfigResponse parseResponse2 = optJSONObject2 != null ? CloseConfigResponse.INSTANCE.parseResponse(optJSONObject2) : null;
                String stringOrNull3 = JSONObjectGetValueOrNullKt.getStringOrNull(jSONObject, "ui_adm");
                errorResult = new SuccessResult(new SuccessResult(new StoryboardAdmResponse(fromValue, obj, fromValue2, floatOrNull2, intOrNull, floatOrNull, booleanOrNull, floatOrNull3, parseResponse, parseResponse2, stringOrNull3 != null ? StringsKt.trim(stringOrNull3).toString() : null)));
            } catch (Throwable th) {
                if (StoryboardAdmResponse$Companion$admStoryboardResponseParse$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                    StabilityHelper.logException("[Automatically caught]", th);
                }
                errorResult = new ErrorResult(th);
            }
            if (errorResult instanceof ErrorResult) {
                value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
            } else {
                if (!(errorResult instanceof SuccessResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                value = ((SuccessResult) errorResult).getValue();
            }
            return (Either) value;
        }
    }
}
