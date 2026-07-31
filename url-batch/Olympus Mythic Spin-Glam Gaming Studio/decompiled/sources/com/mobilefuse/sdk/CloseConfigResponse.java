package com.mobilefuse.sdk;

import com.mobilefuse.sdk.json.JSONObjectGetValueOrNullKt;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: CloseConfigResponse.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010¨\u0006\""}, d2 = {"Lcom/mobilefuse/sdk/CloseConfigResponse;", "", "pos", "Lcom/mobilefuse/sdk/PositionType;", "width", "", "height", "xOffset", "yOffset", "(Lcom/mobilefuse/sdk/PositionType;FFLjava/lang/Float;Ljava/lang/Float;)V", "getHeight", "()F", "getPos", "()Lcom/mobilefuse/sdk/PositionType;", "getWidth", "getXOffset", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getYOffset", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/mobilefuse/sdk/PositionType;FFLjava/lang/Float;Ljava/lang/Float;)Lcom/mobilefuse/sdk/CloseConfigResponse;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes12.dex */
public final /* data */ class CloseConfigResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final float height;

    @NotNull
    private final PositionType pos;
    private final float width;

    @Nullable
    private final Float xOffset;

    @Nullable
    private final Float yOffset;

    public static /* synthetic */ CloseConfigResponse copy$default(CloseConfigResponse closeConfigResponse, PositionType positionType, float f, float f2, Float f3, Float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            positionType = closeConfigResponse.pos;
        }
        if ((i & 2) != 0) {
            f = closeConfigResponse.width;
        }
        float f5 = f;
        if ((i & 4) != 0) {
            f2 = closeConfigResponse.height;
        }
        float f6 = f2;
        if ((i & 8) != 0) {
            f3 = closeConfigResponse.xOffset;
        }
        Float f7 = f3;
        if ((i & 16) != 0) {
            f4 = closeConfigResponse.yOffset;
        }
        return closeConfigResponse.copy(positionType, f5, f6, f7, f4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final PositionType getPos() {
        return this.pos;
    }

    /* renamed from: component2, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getXOffset() {
        return this.xOffset;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getYOffset() {
        return this.yOffset;
    }

    @NotNull
    public final CloseConfigResponse copy(@NotNull PositionType pos, float width, float height, @Nullable Float xOffset, @Nullable Float yOffset) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        return new CloseConfigResponse(pos, width, height, xOffset, yOffset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseConfigResponse)) {
            return false;
        }
        CloseConfigResponse closeConfigResponse = (CloseConfigResponse) other;
        return Intrinsics.areEqual(this.pos, closeConfigResponse.pos) && Float.compare(this.width, closeConfigResponse.width) == 0 && Float.compare(this.height, closeConfigResponse.height) == 0 && Intrinsics.areEqual((Object) this.xOffset, (Object) closeConfigResponse.xOffset) && Intrinsics.areEqual((Object) this.yOffset, (Object) closeConfigResponse.yOffset);
    }

    public int hashCode() {
        PositionType positionType = this.pos;
        int hashCode = (((((positionType != null ? positionType.hashCode() : 0) * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.height)) * 31;
        Float f = this.xOffset;
        int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
        Float f2 = this.yOffset;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CloseConfigResponse(pos=" + this.pos + ", width=" + this.width + ", height=" + this.height + ", xOffset=" + this.xOffset + ", yOffset=" + this.yOffset + ")";
    }

    public CloseConfigResponse(@NotNull PositionType pos, float f, float f2, @Nullable Float f3, @Nullable Float f4) {
        Intrinsics.checkNotNullParameter(pos, "pos");
        this.pos = pos;
        this.width = f;
        this.height = f2;
        this.xOffset = f3;
        this.yOffset = f4;
    }

    @NotNull
    public final PositionType getPos() {
        return this.pos;
    }

    public final float getWidth() {
        return this.width;
    }

    public final float getHeight() {
        return this.height;
    }

    @Nullable
    public final Float getXOffset() {
        return this.xOffset;
    }

    @Nullable
    public final Float getYOffset() {
        return this.yOffset;
    }

    /* compiled from: CloseConfigResponse.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/sdk/CloseConfigResponse$Companion;", "", "()V", "getPosition", "Lcom/mobilefuse/sdk/PositionType;", "value", "", "parseResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CloseConfigResponse parseResponse(@Nullable JSONObject json) {
            if (json == null) {
                return null;
            }
            try {
                PositionType position = getPosition(JSONObjectGetValueOrNullKt.getStringOrNull(json, "pos"));
                if (position == null) {
                    position = PositionType.tr;
                }
                PositionType positionType = position;
                Float floatOrNull = JSONObjectGetValueOrNullKt.getFloatOrNull(json, "w");
                float floatValue = floatOrNull != null ? floatOrNull.floatValue() : 50.0f;
                Float floatOrNull2 = JSONObjectGetValueOrNullKt.getFloatOrNull(json, "h");
                return new CloseConfigResponse(positionType, floatValue, floatOrNull2 != null ? floatOrNull2.floatValue() : 50.0f, JSONObjectGetValueOrNullKt.getFloatOrNull(json, "offset_x"), JSONObjectGetValueOrNullKt.getFloatOrNull(json, "offset_y"));
            } catch (Throwable th) {
                StabilityHelper.logException(this, th);
                return null;
            }
        }

        private final PositionType getPosition(String value) {
            for (PositionType positionType : PositionType.values()) {
                if (StringsKt.equals(positionType.name(), value, true)) {
                    return positionType;
                }
            }
            return null;
        }
    }
}
