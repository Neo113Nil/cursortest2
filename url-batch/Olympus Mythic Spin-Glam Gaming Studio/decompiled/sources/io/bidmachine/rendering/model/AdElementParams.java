package io.bidmachine.rendering.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.rendering.measurer.MeasurerFactory;
import io.bidmachine.util.UtilsKt;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b:\u0018\u00002\u00020\u0001:\u0001TB¿\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\b#\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bN\u0010G\u001a\u0004\bO\u0010IR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010.\u001a\u0004\bQ\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bR\u0010.\u001a\u0004\bS\u00100¨\u0006U"}, d2 = {"Lio/bidmachine/rendering/model/AdElementParams;", "", "Lio/bidmachine/rendering/model/AdElementType;", "adElementType", "", "name", "Lio/bidmachine/rendering/model/Resource;", "resource", "source", "placeholder", "text", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "elementLayoutParams", "Lio/bidmachine/rendering/model/AppearanceParams;", "appearanceParams", "", "customParams", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "animationParams", "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "measurerFactory", "", "Lio/bidmachine/rendering/model/MeasurerParams;", "measurerParamsList", "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "brokenCreativeDetectorParams", "Lio/bidmachine/rendering/model/ScriptConfig;", "scriptsConfig", "<init>", "(Lio/bidmachine/rendering/model/AdElementType;Ljava/lang/String;Lio/bidmachine/rendering/model/Resource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/bidmachine/rendering/model/ElementLayoutParams;Lio/bidmachine/rendering/model/AppearanceParams;Ljava/util/Map;Ljava/util/Map;Lio/bidmachine/rendering/measurer/MeasurerFactory;Ljava/util/List;Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;Ljava/util/List;)V", "key", "getCustomParam", "(Ljava/lang/String;)Ljava/lang/String;", "eventType", "getAnimationParams", "(Lio/bidmachine/rendering/model/AnimationEventType;)Lio/bidmachine/rendering/model/AnimationParams;", "a", "Lio/bidmachine/rendering/model/AdElementType;", "getAdElementType", "()Lio/bidmachine/rendering/model/AdElementType;", "b", "Lio/bidmachine/rendering/model/Resource;", "getResource", "()Lio/bidmachine/rendering/model/Resource;", "c", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "getSource$annotations", "()V", "d", "getPlaceholder", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Lio/bidmachine/rendering/model/ElementLayoutParams;", "getElementLayoutParams", "()Lio/bidmachine/rendering/model/ElementLayoutParams;", InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/rendering/model/AppearanceParams;", "getAppearanceParams", "()Lio/bidmachine/rendering/model/AppearanceParams;", "g", "Ljava/util/Map;", "getCustomParams", "()Ljava/util/Map;", "h", "i", "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "getMeasurerFactory", "()Lio/bidmachine/rendering/measurer/MeasurerFactory;", j.b, "Ljava/util/List;", "getMeasurerParamsList", "()Ljava/util/List;", CampaignEx.JSON_KEY_AD_K, "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "getBrokenCreativeDetectorParams", "()Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "l", "getScriptsConfig", "m", "getName", "n", "getText", "Builder", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class AdElementParams {

    /* renamed from: a, reason: from kotlin metadata */
    private final AdElementType adElementType;

    /* renamed from: b, reason: from kotlin metadata */
    private final Resource resource;

    /* renamed from: c, reason: from kotlin metadata */
    private final String source;

    /* renamed from: d, reason: from kotlin metadata */
    private final String placeholder;

    /* renamed from: e, reason: from kotlin metadata */
    private final ElementLayoutParams elementLayoutParams;

    /* renamed from: f, reason: from kotlin metadata */
    private final AppearanceParams appearanceParams;

    /* renamed from: g, reason: from kotlin metadata */
    private final Map customParams;

    /* renamed from: h, reason: from kotlin metadata */
    private final Map animationParams;

    /* renamed from: i, reason: from kotlin metadata */
    private final MeasurerFactory measurerFactory;

    /* renamed from: j, reason: from kotlin metadata */
    private final List measurerParamsList;

    /* renamed from: k, reason: from kotlin metadata */
    private final BrokenCreativeDetectorParams brokenCreativeDetectorParams;

    /* renamed from: l, reason: from kotlin metadata */
    private final List scriptsConfig;

    /* renamed from: m, reason: from kotlin metadata */
    private final String name;

    /* renamed from: n, reason: from kotlin metadata */
    private final String text;

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\u00002\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u0016J#\u0010\u001f\u001a\u00020\u00002\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010\u000fJ\u001d\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00002\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u00002\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u001d\u00102\u001a\u00020\u00002\u000e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010'¢\u0006\u0004\b2\u0010+J\r\u00104\u001a\u000203¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bC\u00109\u0012\u0004\bD\u0010ER\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00109R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u00109R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010K¨\u0006O"}, d2 = {"Lio/bidmachine/rendering/model/AdElementParams$Builder;", "", "Lio/bidmachine/rendering/model/AdElementType;", "adElementType", "", "name", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "elementLayoutParams", "Lio/bidmachine/rendering/model/AppearanceParams;", "appearanceParams", "<init>", "(Lio/bidmachine/rendering/model/AdElementType;Ljava/lang/String;Lio/bidmachine/rendering/model/ElementLayoutParams;Lio/bidmachine/rendering/model/AppearanceParams;)V", "", "customParams", "setCustomParams", "(Ljava/util/Map;)Lio/bidmachine/rendering/model/AdElementParams$Builder;", "Lio/bidmachine/rendering/model/Resource;", "resource", "setResource", "(Lio/bidmachine/rendering/model/Resource;)Lio/bidmachine/rendering/model/AdElementParams$Builder;", "source", "setSource", "(Ljava/lang/String;)Lio/bidmachine/rendering/model/AdElementParams$Builder;", "placeholder", "setPlaceholder", "text", "setText", "", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "animationParams", "setAnimationParams", "eventType", "addAnimationParams", "(Lio/bidmachine/rendering/model/AnimationEventType;Lio/bidmachine/rendering/model/AnimationParams;)Lio/bidmachine/rendering/model/AdElementParams$Builder;", "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "measurerFactory", "setMeasurerFactory", "(Lio/bidmachine/rendering/measurer/MeasurerFactory;)Lio/bidmachine/rendering/model/AdElementParams$Builder;", "", "Lio/bidmachine/rendering/model/MeasurerParams;", "measurerParamsList", "setMeasurerParamsList", "(Ljava/util/List;)Lio/bidmachine/rendering/model/AdElementParams$Builder;", "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "brokenCreativeDetectorParams", "setBrokenCreativeDetectorParams", "(Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;)Lio/bidmachine/rendering/model/AdElementParams$Builder;", "Lio/bidmachine/rendering/model/ScriptConfig;", "scriptsConfig", "setScriptsConfig", "Lio/bidmachine/rendering/model/AdElementParams;", "build", "()Lio/bidmachine/rendering/model/AdElementParams;", "a", "Lio/bidmachine/rendering/model/AdElementType;", "b", "Ljava/lang/String;", "c", "Lio/bidmachine/rendering/model/ElementLayoutParams;", "d", "Lio/bidmachine/rendering/model/AppearanceParams;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/Map;", InneractiveMediationDefs.GENDER_FEMALE, "g", "Lio/bidmachine/rendering/model/Resource;", "h", "getSource$annotations", "()V", "i", j.b, CampaignEx.JSON_KEY_AD_K, "Lio/bidmachine/rendering/measurer/MeasurerFactory;", "l", "Ljava/util/List;", "m", "Lio/bidmachine/rendering/model/BrokenCreativeDetectorParams;", "n", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: from kotlin metadata */
        private final AdElementType adElementType;

        /* renamed from: b, reason: from kotlin metadata */
        private final String name;

        /* renamed from: c, reason: from kotlin metadata */
        private final ElementLayoutParams elementLayoutParams;

        /* renamed from: d, reason: from kotlin metadata */
        private final AppearanceParams appearanceParams;

        /* renamed from: e, reason: from kotlin metadata */
        private final Map customParams;

        /* renamed from: f, reason: from kotlin metadata */
        private final Map animationParams;

        /* renamed from: g, reason: from kotlin metadata */
        private Resource resource;

        /* renamed from: h, reason: from kotlin metadata */
        private String source;

        /* renamed from: i, reason: from kotlin metadata */
        private String placeholder;

        /* renamed from: j, reason: from kotlin metadata */
        private String text;

        /* renamed from: k, reason: from kotlin metadata */
        private MeasurerFactory measurerFactory;

        /* renamed from: l, reason: from kotlin metadata */
        private List measurerParamsList;

        /* renamed from: m, reason: from kotlin metadata */
        private BrokenCreativeDetectorParams brokenCreativeDetectorParams;

        /* renamed from: n, reason: from kotlin metadata */
        private List scriptsConfig;

        public Builder(@NotNull AdElementType adElementType, @NotNull String name, @NotNull ElementLayoutParams elementLayoutParams, @NotNull AppearanceParams appearanceParams) {
            Intrinsics.checkNotNullParameter(adElementType, "adElementType");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(elementLayoutParams, "elementLayoutParams");
            Intrinsics.checkNotNullParameter(appearanceParams, "appearanceParams");
            this.adElementType = adElementType;
            this.name = name;
            this.elementLayoutParams = elementLayoutParams;
            this.appearanceParams = appearanceParams;
            this.customParams = new HashMap();
            this.animationParams = new EnumMap(AnimationEventType.class);
        }

        @NotNull
        public final Builder addAnimationParams(@NotNull AnimationEventType eventType, @NotNull AnimationParams animationParams) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(animationParams, "animationParams");
            this.animationParams.put(eventType, animationParams);
            return this;
        }

        @NotNull
        public final AdElementParams build() {
            return new AdElementParams(this.adElementType, this.name, this.resource, this.source, this.placeholder, this.text, this.elementLayoutParams, this.appearanceParams, this.customParams, this.animationParams, this.measurerFactory, this.measurerParamsList, this.brokenCreativeDetectorParams, this.scriptsConfig);
        }

        @NotNull
        public final Builder setAnimationParams(@Nullable Map<AnimationEventType, AnimationParams> animationParams) {
            UtilsKt.setSafely(this.animationParams, animationParams);
            return this;
        }

        @NotNull
        public final Builder setBrokenCreativeDetectorParams(@Nullable BrokenCreativeDetectorParams brokenCreativeDetectorParams) {
            this.brokenCreativeDetectorParams = brokenCreativeDetectorParams;
            return this;
        }

        @NotNull
        public final Builder setCustomParams(@Nullable Map<String, String> customParams) {
            UtilsKt.setSafely(this.customParams, customParams);
            return this;
        }

        @NotNull
        public final Builder setMeasurerFactory(@Nullable MeasurerFactory measurerFactory) {
            this.measurerFactory = measurerFactory;
            return this;
        }

        @NotNull
        public final Builder setMeasurerParamsList(@Nullable List<MeasurerParams> measurerParamsList) {
            this.measurerParamsList = measurerParamsList;
            return this;
        }

        @NotNull
        public final Builder setPlaceholder(@Nullable String placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        @NotNull
        public final Builder setResource(@Nullable Resource resource) {
            this.resource = resource;
            return this;
        }

        @NotNull
        public final Builder setScriptsConfig(@Nullable List<ScriptConfig> scriptsConfig) {
            this.scriptsConfig = scriptsConfig;
            return this;
        }

        @Deprecated
        @NotNull
        public final Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        @NotNull
        public final Builder setText(@Nullable String text) {
            this.text = text;
            return this;
        }
    }

    public AdElementParams(@NotNull AdElementType adElementType, @NotNull String name, @Nullable Resource resource, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull ElementLayoutParams elementLayoutParams, @NotNull AppearanceParams appearanceParams, @NotNull Map<String, String> customParams, @NotNull Map<AnimationEventType, AnimationParams> animationParams, @Nullable MeasurerFactory measurerFactory, @Nullable List<MeasurerParams> list, @Nullable BrokenCreativeDetectorParams brokenCreativeDetectorParams, @Nullable List<ScriptConfig> list2) {
        Intrinsics.checkNotNullParameter(adElementType, "adElementType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(elementLayoutParams, "elementLayoutParams");
        Intrinsics.checkNotNullParameter(appearanceParams, "appearanceParams");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        Intrinsics.checkNotNullParameter(animationParams, "animationParams");
        this.adElementType = adElementType;
        this.resource = resource;
        this.source = str;
        this.placeholder = str2;
        this.elementLayoutParams = elementLayoutParams;
        this.appearanceParams = appearanceParams;
        this.customParams = customParams;
        this.animationParams = animationParams;
        this.measurerFactory = measurerFactory;
        this.measurerParamsList = list;
        this.brokenCreativeDetectorParams = brokenCreativeDetectorParams;
        this.scriptsConfig = list2;
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = name.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        this.name = lowerCase;
        this.text = str3 != null ? str3 : str;
    }

    @Deprecated
    public static /* synthetic */ void getSource$annotations() {
    }

    @NotNull
    public final AdElementType getAdElementType() {
        return this.adElementType;
    }

    @NotNull
    public final Map<AnimationEventType, AnimationParams> getAnimationParams() {
        return this.animationParams;
    }

    @NotNull
    public final AppearanceParams getAppearanceParams() {
        return this.appearanceParams;
    }

    @Nullable
    public final BrokenCreativeDetectorParams getBrokenCreativeDetectorParams() {
        return this.brokenCreativeDetectorParams;
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

    @NotNull
    public final ElementLayoutParams getElementLayoutParams() {
        return this.elementLayoutParams;
    }

    @Nullable
    public final MeasurerFactory getMeasurerFactory() {
        return this.measurerFactory;
    }

    @Nullable
    public final List<MeasurerParams> getMeasurerParamsList() {
        return this.measurerParamsList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @Nullable
    public final Resource getResource() {
        return this.resource;
    }

    @Nullable
    public final List<ScriptConfig> getScriptsConfig() {
        return this.scriptsConfig;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final AnimationParams getAnimationParams(@NotNull AnimationEventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return (AnimationParams) this.animationParams.get(eventType);
    }

    public /* synthetic */ AdElementParams(AdElementType adElementType, String str, Resource resource, String str2, String str3, String str4, ElementLayoutParams elementLayoutParams, AppearanceParams appearanceParams, Map map, Map map2, MeasurerFactory measurerFactory, List list, BrokenCreativeDetectorParams brokenCreativeDetectorParams, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adElementType, str, (i & 4) != 0 ? null : resource, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, elementLayoutParams, appearanceParams, (i & 256) != 0 ? new HashMap() : map, (i & 512) != 0 ? new EnumMap(AnimationEventType.class) : map2, (i & 1024) != 0 ? null : measurerFactory, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? null : brokenCreativeDetectorParams, (i & 8192) != 0 ? null : list2);
    }
}
