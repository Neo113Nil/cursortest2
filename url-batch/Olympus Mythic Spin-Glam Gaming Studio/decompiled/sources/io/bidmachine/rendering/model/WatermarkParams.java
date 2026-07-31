package io.bidmachine.rendering.model;

import io.bidmachine.util.network.NetworkUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lio/bidmachine/rendering/model/WatermarkParams;", "", "Lio/bidmachine/rendering/model/WatermarkParams$Algorithm;", "algorithm", "", "payload", "", "baseColor", "Lio/bidmachine/rendering/model/WatermarkParams$Location;", "location", "<init>", "(Lio/bidmachine/rendering/model/WatermarkParams$Algorithm;Ljava/lang/String;ILio/bidmachine/rendering/model/WatermarkParams$Location;)V", "a", "Lio/bidmachine/rendering/model/WatermarkParams$Algorithm;", "getAlgorithm", "()Lio/bidmachine/rendering/model/WatermarkParams$Algorithm;", "b", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "c", "I", "getBaseColor", "()I", "d", "Lio/bidmachine/rendering/model/WatermarkParams$Location;", "getLocation", "()Lio/bidmachine/rendering/model/WatermarkParams$Location;", "Algorithm", NetworkUtils.HEADER_LOCATION, "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class WatermarkParams {

    /* renamed from: a, reason: from kotlin metadata */
    private final Algorithm algorithm;

    /* renamed from: b, reason: from kotlin metadata */
    private final String payload;

    /* renamed from: c, reason: from kotlin metadata */
    private final int baseColor;

    /* renamed from: d, reason: from kotlin metadata */
    private final Location location;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/rendering/model/WatermarkParams$Algorithm;", "", "(Ljava/lang/String;I)V", "RGB_STRIP", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Algorithm {
        RGB_STRIP
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/bidmachine/rendering/model/WatermarkParams$Location;", "", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_CENTER", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_CENTER", "BOTTOM_RIGHT", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Location {
        TOP_LEFT,
        TOP_CENTER,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_CENTER,
        BOTTOM_RIGHT
    }

    public WatermarkParams(@NotNull Algorithm algorithm, @NotNull String payload, int i, @NotNull Location location) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(location, "location");
        this.algorithm = algorithm;
        this.payload = payload;
        this.baseColor = i;
        this.location = location;
    }

    @NotNull
    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final int getBaseColor() {
        return this.baseColor;
    }

    @NotNull
    public final Location getLocation() {
        return this.location;
    }

    @NotNull
    public final String getPayload() {
        return this.payload;
    }
}
