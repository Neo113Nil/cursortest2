package io.bidmachine.tracking;

import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.utils.ProtoUtilsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\u0015\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u00020\u0004H\u0002J\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0006J\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\rJ\u0016\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tJ\u001c\u0010\u001c\u001a\u00020\u00002\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u001e\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u001f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010 R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lio/bidmachine/tracking/EventData;", "", "()V", "customParamsBuilder", "Lcom/explorestack/protobuf/Struct$Builder;", "<set-?>", "", "isBillable", "()Z", "", "networkName", "getNetworkName", "()Ljava/lang/String;", "", "price", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "addCustomParam", "key", "value", "addCustomParams", "customParams", "", "getCustomParams", "Lcom/explorestack/protobuf/Struct;", "obtainCustomParamsBuilder", "setCustomParam", "setCustomParams", "setIsBillable", "setNetworkName", "setPrice", "(Ljava/lang/Double;)Lio/bidmachine/tracking/EventData;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class EventData {

    @Nullable
    private Struct.Builder customParamsBuilder;
    private boolean isBillable;

    @Nullable
    private String networkName;

    @Nullable
    private Double price;

    private final Struct.Builder obtainCustomParamsBuilder() {
        Struct.Builder builder = this.customParamsBuilder;
        if (builder != null) {
            return builder;
        }
        Struct.Builder newBuilder = Struct.newBuilder();
        this.customParamsBuilder = newBuilder;
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder().also {\n    …amsBuilder = it\n        }");
        return newBuilder;
    }

    @NotNull
    public final EventData addCustomParam(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Struct.Builder obtainCustomParamsBuilder = obtainCustomParamsBuilder();
        Value valueOrNull = ProtoUtilsKt.toValueOrNull(value);
        if (valueOrNull != null) {
            obtainCustomParamsBuilder.putFields(key, valueOrNull);
        }
        return this;
    }

    @NotNull
    public final EventData addCustomParams(@Nullable Map<String, ? extends Object> customParams) {
        Struct.Builder obtainCustomParamsBuilder = obtainCustomParamsBuilder();
        if (customParams != null) {
            for (Map.Entry<String, ? extends Object> entry : customParams.entrySet()) {
                Value valueOrNull = ProtoUtilsKt.toValueOrNull(entry.getValue());
                if (valueOrNull != null) {
                    obtainCustomParamsBuilder.putFields(entry.getKey(), valueOrNull);
                }
            }
        }
        return this;
    }

    @Nullable
    public final Struct getCustomParams() {
        Struct.Builder builder = this.customParamsBuilder;
        if (builder != null) {
            return builder.build();
        }
        return null;
    }

    @Nullable
    public final String getNetworkName() {
        return this.networkName;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    /* renamed from: isBillable, reason: from getter */
    public final boolean getIsBillable() {
        return this.isBillable;
    }

    @NotNull
    public final EventData setCustomParam(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        obtainCustomParamsBuilder().putFields(key, ProtoUtilsKt.toProtoValue(value));
        return this;
    }

    @NotNull
    public final EventData setCustomParams(@Nullable Map<String, ? extends Object> customParams) {
        this.customParamsBuilder = ProtoUtilsKt.toStructBuilderOrNull(customParams);
        return this;
    }

    @NotNull
    public final EventData setIsBillable(boolean isBillable) {
        this.isBillable = isBillable;
        return this;
    }

    @NotNull
    public final EventData setNetworkName(@Nullable String networkName) {
        this.networkName = networkName;
        return this;
    }

    @NotNull
    public final EventData setPrice(@Nullable Double price) {
        this.price = price;
        return this;
    }

    @NotNull
    public final EventData setCustomParam(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        obtainCustomParamsBuilder().putFields(key, ProtoUtilsKt.toProtoValue(Double.valueOf(value)));
        return this;
    }

    @NotNull
    public final EventData setCustomParam(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        obtainCustomParamsBuilder().putFields(key, ProtoUtilsKt.toProtoValue(value));
        return this;
    }
}
