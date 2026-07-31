package io.bidmachine.rendering.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C4643f8;
import com.ironsource.X3;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.impl.M2;
import io.bidmachine.rendering.internal.g;
import io.bidmachine.util.UtilsKt;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityTrackerParams;
import io.bidmachine.util.visibilitytracking.VisibilityParams;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b,\u0018\u00002\u00020\u0001:\u0001>Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lio/bidmachine/rendering/model/AdParams;", "", "Lio/bidmachine/rendering/model/CacheType;", "cacheType", "Ljava/util/Queue;", "Lio/bidmachine/rendering/model/AdPhaseParams;", "adPhaseParamsQueue", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "viewabilityTrackerParams", "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", C4643f8.s, "placeholderParams", "Lio/bidmachine/rendering/model/Orientation;", X3.i.n, "Lio/bidmachine/rendering/model/Background;", M2.g, "Lio/bidmachine/rendering/model/WatermarkParams;", "watermarkParams", "", "", "customParams", "<init>", "(Lio/bidmachine/rendering/model/CacheType;Ljava/util/Queue;Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;Lio/bidmachine/util/visibilitytracking/VisibilityParams;Lio/bidmachine/rendering/model/AdPhaseParams;Lio/bidmachine/rendering/model/Orientation;Lio/bidmachine/rendering/model/Background;Lio/bidmachine/rendering/model/WatermarkParams;Ljava/util/Map;)V", "key", "getCustomParam", "(Ljava/lang/String;)Ljava/lang/String;", "a", "Lio/bidmachine/rendering/model/CacheType;", "getCacheType", "()Lio/bidmachine/rendering/model/CacheType;", "b", "Ljava/util/Queue;", "getAdPhaseParamsQueue", "()Ljava/util/Queue;", "c", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "getViewabilityTrackerParams", "()Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "d", "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "getVisibilityParams", "()Lio/bidmachine/util/visibilitytracking/VisibilityParams;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lio/bidmachine/rendering/model/AdPhaseParams;", "getPlaceholderParams", "()Lio/bidmachine/rendering/model/AdPhaseParams;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/rendering/model/Orientation;", "getOrientation", "()Lio/bidmachine/rendering/model/Orientation;", "g", "Lio/bidmachine/rendering/model/Background;", "getBackground", "()Lio/bidmachine/rendering/model/Background;", "h", "Lio/bidmachine/rendering/model/WatermarkParams;", "getWatermarkParams", "()Lio/bidmachine/rendering/model/WatermarkParams;", "i", "Ljava/util/Map;", "getCustomParams", "()Ljava/util/Map;", "Builder", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class AdParams {

    /* renamed from: a, reason: from kotlin metadata */
    private final CacheType cacheType;

    /* renamed from: b, reason: from kotlin metadata */
    private final Queue adPhaseParamsQueue;

    /* renamed from: c, reason: from kotlin metadata */
    private final ViewabilityTrackerParams viewabilityTrackerParams;

    /* renamed from: d, reason: from kotlin metadata */
    private final VisibilityParams visibilityParams;

    /* renamed from: e, reason: from kotlin metadata */
    private final AdPhaseParams placeholderParams;

    /* renamed from: f, reason: from kotlin metadata */
    private final Orientation orientation;

    /* renamed from: g, reason: from kotlin metadata */
    private final Background background;

    /* renamed from: h, reason: from kotlin metadata */
    private final WatermarkParams watermarkParams;

    /* renamed from: i, reason: from kotlin metadata */
    private final Map customParams;

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lio/bidmachine/rendering/model/AdParams$Builder;", "", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "viewabilityTrackerParams", "<init>", "(Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;)V", "Ljava/util/Queue;", "Lio/bidmachine/rendering/model/AdPhaseParams;", "adPhaseParamsQueue", "setAdPhaseParamsQueue", "(Ljava/util/Queue;)Lio/bidmachine/rendering/model/AdParams$Builder;", "adPhaseParams", "addAdPhaseParams", "(Lio/bidmachine/rendering/model/AdPhaseParams;)Lio/bidmachine/rendering/model/AdParams$Builder;", "", "", "customParams", "setCustomParams", "(Ljava/util/Map;)Lio/bidmachine/rendering/model/AdParams$Builder;", "Lio/bidmachine/rendering/model/CacheType;", "cacheType", "setCacheType", "(Lio/bidmachine/rendering/model/CacheType;)Lio/bidmachine/rendering/model/AdParams$Builder;", "placeholderParams", "setPlaceholderParams", "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", C4643f8.s, "setVisibilityParams", "(Lio/bidmachine/util/visibilitytracking/VisibilityParams;)Lio/bidmachine/rendering/model/AdParams$Builder;", "Lio/bidmachine/rendering/model/Orientation;", X3.i.n, "setOrientation", "(Lio/bidmachine/rendering/model/Orientation;)Lio/bidmachine/rendering/model/AdParams$Builder;", "Lio/bidmachine/rendering/model/Background;", M2.g, "setBackground", "(Lio/bidmachine/rendering/model/Background;)Lio/bidmachine/rendering/model/AdParams$Builder;", "Lio/bidmachine/rendering/model/WatermarkParams;", "watermarkParams", "setWatermarkParams", "(Lio/bidmachine/rendering/model/WatermarkParams;)Lio/bidmachine/rendering/model/AdParams$Builder;", "Lio/bidmachine/rendering/model/AdParams;", "build", "()Lio/bidmachine/rendering/model/AdParams;", "a", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "b", "Ljava/util/Queue;", "", "c", "Ljava/util/Map;", "d", "Lio/bidmachine/rendering/model/CacheType;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lio/bidmachine/rendering/model/AdPhaseParams;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/util/visibilitytracking/VisibilityParams;", "g", "Lio/bidmachine/rendering/model/Orientation;", "h", "Lio/bidmachine/rendering/model/Background;", "i", "Lio/bidmachine/rendering/model/WatermarkParams;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: from kotlin metadata */
        private final ViewabilityTrackerParams viewabilityTrackerParams;

        /* renamed from: b, reason: from kotlin metadata */
        private final Queue adPhaseParamsQueue;

        /* renamed from: c, reason: from kotlin metadata */
        private final Map customParams;

        /* renamed from: d, reason: from kotlin metadata */
        private CacheType cacheType;

        /* renamed from: e, reason: from kotlin metadata */
        private AdPhaseParams placeholderParams;

        /* renamed from: f, reason: from kotlin metadata */
        private VisibilityParams visibilityParams;

        /* renamed from: g, reason: from kotlin metadata */
        private Orientation orientation;

        /* renamed from: h, reason: from kotlin metadata */
        private Background background;

        /* renamed from: i, reason: from kotlin metadata */
        private WatermarkParams watermarkParams;

        public Builder(@NotNull ViewabilityTrackerParams viewabilityTrackerParams) {
            Intrinsics.checkNotNullParameter(viewabilityTrackerParams, "viewabilityTrackerParams");
            this.viewabilityTrackerParams = viewabilityTrackerParams;
            this.adPhaseParamsQueue = new LinkedList();
            this.customParams = new HashMap();
        }

        @NotNull
        public final Builder addAdPhaseParams(@NotNull AdPhaseParams adPhaseParams) {
            Intrinsics.checkNotNullParameter(adPhaseParams, "adPhaseParams");
            this.adPhaseParamsQueue.add(adPhaseParams);
            return this;
        }

        @NotNull
        public final AdParams build() {
            Background background = this.background;
            CacheType cacheType = this.cacheType;
            if (cacheType == null) {
                cacheType = g.a.b();
            }
            CacheType cacheType2 = cacheType;
            Queue queue = this.adPhaseParamsQueue;
            ViewabilityTrackerParams viewabilityTrackerParams = this.viewabilityTrackerParams;
            VisibilityParams visibilityParams = this.visibilityParams;
            if (visibilityParams == null) {
                visibilityParams = VisibilityParams.INSTANCE.getDefault();
            }
            return new AdParams(cacheType2, queue, viewabilityTrackerParams, visibilityParams, this.placeholderParams, this.orientation, background, this.watermarkParams, this.customParams);
        }

        @NotNull
        public final Builder setAdPhaseParamsQueue(@Nullable Queue<AdPhaseParams> adPhaseParamsQueue) {
            UtilsKt.setSafely(this.adPhaseParamsQueue, adPhaseParamsQueue);
            return this;
        }

        @NotNull
        public final Builder setBackground(@Nullable Background background) {
            this.background = background;
            return this;
        }

        @NotNull
        public final Builder setCacheType(@NotNull CacheType cacheType) {
            Intrinsics.checkNotNullParameter(cacheType, "cacheType");
            this.cacheType = cacheType;
            return this;
        }

        @NotNull
        public final Builder setCustomParams(@Nullable Map<String, String> customParams) {
            UtilsKt.setSafely(this.customParams, customParams);
            return this;
        }

        @NotNull
        public final Builder setOrientation(@Nullable Orientation orientation) {
            this.orientation = orientation;
            return this;
        }

        @NotNull
        public final Builder setPlaceholderParams(@Nullable AdPhaseParams placeholderParams) {
            this.placeholderParams = placeholderParams;
            return this;
        }

        @NotNull
        public final Builder setVisibilityParams(@Nullable VisibilityParams visibilityParams) {
            this.visibilityParams = visibilityParams;
            return this;
        }

        @NotNull
        public final Builder setWatermarkParams(@Nullable WatermarkParams watermarkParams) {
            this.watermarkParams = watermarkParams;
            return this;
        }
    }

    public AdParams(@NotNull CacheType cacheType, @NotNull Queue<AdPhaseParams> adPhaseParamsQueue, @NotNull ViewabilityTrackerParams viewabilityTrackerParams, @NotNull VisibilityParams visibilityParams, @Nullable AdPhaseParams adPhaseParams, @Nullable Orientation orientation, @Nullable Background background, @Nullable WatermarkParams watermarkParams, @NotNull Map<String, String> customParams) {
        Intrinsics.checkNotNullParameter(cacheType, "cacheType");
        Intrinsics.checkNotNullParameter(adPhaseParamsQueue, "adPhaseParamsQueue");
        Intrinsics.checkNotNullParameter(viewabilityTrackerParams, "viewabilityTrackerParams");
        Intrinsics.checkNotNullParameter(visibilityParams, "visibilityParams");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        this.cacheType = cacheType;
        this.adPhaseParamsQueue = adPhaseParamsQueue;
        this.viewabilityTrackerParams = viewabilityTrackerParams;
        this.visibilityParams = visibilityParams;
        this.placeholderParams = adPhaseParams;
        this.orientation = orientation;
        this.background = background;
        this.watermarkParams = watermarkParams;
        this.customParams = customParams;
    }

    @NotNull
    public final Queue<AdPhaseParams> getAdPhaseParamsQueue() {
        return this.adPhaseParamsQueue;
    }

    @Nullable
    public final Background getBackground() {
        return this.background;
    }

    @NotNull
    public final CacheType getCacheType() {
        return this.cacheType;
    }

    @Nullable
    public final String getCustomParam(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (String) this.customParams.get(key);
    }

    @NotNull
    public final Map<String, String> getCustomParams() {
        return this.customParams;
    }

    @Nullable
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public final AdPhaseParams getPlaceholderParams() {
        return this.placeholderParams;
    }

    @NotNull
    public final ViewabilityTrackerParams getViewabilityTrackerParams() {
        return this.viewabilityTrackerParams;
    }

    @NotNull
    public final VisibilityParams getVisibilityParams() {
        return this.visibilityParams;
    }

    @Nullable
    public final WatermarkParams getWatermarkParams() {
        return this.watermarkParams;
    }

    public /* synthetic */ AdParams(CacheType cacheType, Queue queue, ViewabilityTrackerParams viewabilityTrackerParams, VisibilityParams visibilityParams, AdPhaseParams adPhaseParams, Orientation orientation, Background background, WatermarkParams watermarkParams, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cacheType, queue, viewabilityTrackerParams, visibilityParams, (i & 16) != 0 ? null : adPhaseParams, (i & 32) != 0 ? null : orientation, (i & 64) != 0 ? null : background, (i & 128) != 0 ? null : watermarkParams, map);
    }
}
