package io.bidmachine.rendering.model;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.appmetrica.analytics.impl.M2;
import io.bidmachine.util.UtilsKt;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b,\u0018\u00002\u00020\u0001:\u0001?B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012$\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\r0\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\r\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0007\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u00100R5\u0010\u0011\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\r0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\r8\u0006¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u00108R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00100¨\u0006@"}, d2 = {"Lio/bidmachine/rendering/model/AdPhaseParams;", "", "", "sequence", "Lio/bidmachine/rendering/model/Background;", M2.g, "backgroundColor", "", "Lio/bidmachine/rendering/model/AdElementParams;", "adsList", "controlsList", "Lio/bidmachine/rendering/model/MethodParams;", "methodParamsList", "", "", "Lio/bidmachine/rendering/model/EventType;", "Lio/bidmachine/rendering/model/EventTaskParams;", "sourceEventTypeMap", "customParams", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "animationParams", "stateGroups", "<init>", "(ILio/bidmachine/rendering/model/Background;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "sourceName", "getEventTypeMap", "(Ljava/lang/String;)Ljava/util/Map;", "key", "getCustomParam", "(Ljava/lang/String;)Ljava/lang/String;", "a", "I", "getSequence", "()I", "b", "Lio/bidmachine/rendering/model/Background;", "getBackground", "()Lio/bidmachine/rendering/model/Background;", "c", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/Integer;", "getBackgroundColor$annotations", "()V", "d", "Ljava/util/List;", "getAdsList", "()Ljava/util/List;", EidRequestBuilder.REQUEST_FIELD_EMAIL, "getControlsList", InneractiveMediationDefs.GENDER_FEMALE, "getMethodParamsList", "g", "Ljava/util/Map;", "getSourceEventTypeMap", "()Ljava/util/Map;", "h", "getCustomParams", "i", "getAnimationParams", j.b, "getStateGroups", "Builder", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class AdPhaseParams {

    /* renamed from: a, reason: from kotlin metadata */
    private final int sequence;

    /* renamed from: b, reason: from kotlin metadata */
    private final Background background;

    /* renamed from: c, reason: from kotlin metadata */
    private final Integer backgroundColor;

    /* renamed from: d, reason: from kotlin metadata */
    private final List adsList;

    /* renamed from: e, reason: from kotlin metadata */
    private final List controlsList;

    /* renamed from: f, reason: from kotlin metadata */
    private final List methodParamsList;

    /* renamed from: g, reason: from kotlin metadata */
    private final Map sourceEventTypeMap;

    /* renamed from: h, reason: from kotlin metadata */
    private final Map customParams;

    /* renamed from: i, reason: from kotlin metadata */
    private final Map animationParams;

    /* renamed from: j, reason: from kotlin metadata */
    private final List stateGroups;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00002\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0011J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00002\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010%\u001a\u00020\u00002&\u0010$\u001a\"\u0012\u0004\u0012\u00020\u001f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0 \u0018\u00010\u001e¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00020\u00002\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e¢\u0006\u0004\b,\u0010&J#\u00100\u001a\u00020\u00002\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.\u0018\u00010 ¢\u0006\u0004\b0\u0010&J\u0015\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020.¢\u0006\u0004\b2\u00103J\u001d\u00105\u001a\u00020\u00002\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\"¢\u0006\u0004\b5\u0010\u0011J\u0015\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u001f¢\u0006\u0004\b7\u00108J\r\u0010:\u001a\u000209¢\u0006\u0004\b:\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R2\u0010$\u001a \u0012\u0004\u0012\u00020\u001f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR \u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010CR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010?R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\bI\u0010=\u0012\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "", "", "sequence", "<init>", "(I)V", "Lio/bidmachine/rendering/model/Background;", M2.g, "setBackground", "(Lio/bidmachine/rendering/model/Background;)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "backgroundColor", "setBackgroundColor", "(I)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "", "Lio/bidmachine/rendering/model/AdElementParams;", "adsElementParamsList", "setAdsElementParamsList", "(Ljava/util/List;)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "adElementParams", "addAdsElementParams", "(Lio/bidmachine/rendering/model/AdElementParams;)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "controlsElementParamsList", "setControlsElementParamsList", "addControlsElementParams", "Lio/bidmachine/rendering/model/MethodParams;", "methodParamsList", "setMethodParamsList", "methodParams", "addMethodParams", "(Lio/bidmachine/rendering/model/MethodParams;)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "", "", "", "Lio/bidmachine/rendering/model/EventType;", "", "Lio/bidmachine/rendering/model/EventTaskParams;", "sourceEventTypeMap", "setEventParamsList", "(Ljava/util/Map;)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "Lio/bidmachine/rendering/model/EventParams;", "eventParams", "addEventParams", "(Lio/bidmachine/rendering/model/EventParams;)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "customParams", "setCustomParams", "Lio/bidmachine/rendering/model/AnimationEventType;", "Lio/bidmachine/rendering/model/AnimationParams;", "animationParams", "setAnimationParams", "params", "addAnimationParams", "(Lio/bidmachine/rendering/model/AnimationParams;)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "stateGroups", "setStateGroups", "stateGroup", "addStateGroup", "(Ljava/lang/String;)Lio/bidmachine/rendering/model/AdPhaseParams$Builder;", "Lio/bidmachine/rendering/model/AdPhaseParams;", "build", "()Lio/bidmachine/rendering/model/AdPhaseParams;", "a", "I", "b", "Ljava/util/List;", "c", "d", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/Map;", InneractiveMediationDefs.GENDER_FEMALE, "g", "h", "i", "Lio/bidmachine/rendering/model/Background;", j.b, "getBackgroundColor$annotations", "()V", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: from kotlin metadata */
        private final int sequence;

        /* renamed from: i, reason: from kotlin metadata */
        private Background background;

        /* renamed from: b, reason: from kotlin metadata */
        private final List adsElementParamsList = new ArrayList();

        /* renamed from: c, reason: from kotlin metadata */
        private final List controlsElementParamsList = new ArrayList();

        /* renamed from: d, reason: from kotlin metadata */
        private final List methodParamsList = new ArrayList();

        /* renamed from: e, reason: from kotlin metadata */
        private final Map sourceEventTypeMap = new HashMap();

        /* renamed from: f, reason: from kotlin metadata */
        private final Map customParams = new HashMap();

        /* renamed from: g, reason: from kotlin metadata */
        private final Map animationParams = new EnumMap(AnimationEventType.class);

        /* renamed from: h, reason: from kotlin metadata */
        private final List stateGroups = new ArrayList();

        /* renamed from: j, reason: from kotlin metadata */
        private int backgroundColor = -16777216;

        public Builder(int i) {
            this.sequence = i;
        }

        @NotNull
        public final Builder addAdsElementParams(@NotNull AdElementParams adElementParams) {
            Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
            this.adsElementParamsList.add(adElementParams);
            return this;
        }

        @NotNull
        public final Builder addAnimationParams(@NotNull AnimationParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.animationParams.put(params.getEvent(), params);
            return this;
        }

        @NotNull
        public final Builder addControlsElementParams(@NotNull AdElementParams adElementParams) {
            Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
            this.controlsElementParamsList.add(adElementParams);
            return this;
        }

        @NotNull
        public final Builder addEventParams(@NotNull EventParams eventParams) {
            Intrinsics.checkNotNullParameter(eventParams, "eventParams");
            List<EventTaskParams> eventTaskParamsList = eventParams.getEventTaskParamsList();
            if (!eventTaskParamsList.isEmpty()) {
                String source = eventParams.getSource();
                Map map = (Map) this.sourceEventTypeMap.get(source);
                if (map == null) {
                    map = new EnumMap(EventType.class);
                    this.sourceEventTypeMap.put(source, map);
                }
                EventType eventType = eventParams.getEventType();
                List list = (List) map.get(eventType);
                if (list == null) {
                    list = new ArrayList();
                    map.put(eventType, list);
                }
                list.addAll(eventTaskParamsList);
            }
            return this;
        }

        @NotNull
        public final Builder addMethodParams(@NotNull MethodParams methodParams) {
            Intrinsics.checkNotNullParameter(methodParams, "methodParams");
            this.methodParamsList.add(methodParams);
            return this;
        }

        @NotNull
        public final Builder addStateGroup(@NotNull String stateGroup) {
            Intrinsics.checkNotNullParameter(stateGroup, "stateGroup");
            this.stateGroups.add(stateGroup);
            return this;
        }

        @NotNull
        public final AdPhaseParams build() {
            return new AdPhaseParams(this.sequence, this.background, Integer.valueOf(this.backgroundColor), this.adsElementParamsList, this.controlsElementParamsList, this.methodParamsList, this.sourceEventTypeMap, this.customParams, this.animationParams, this.stateGroups);
        }

        @NotNull
        public final Builder setAdsElementParamsList(@Nullable List<AdElementParams> adsElementParamsList) {
            UtilsKt.setSafely(this.adsElementParamsList, adsElementParamsList);
            return this;
        }

        @NotNull
        public final Builder setAnimationParams(@Nullable Map<AnimationEventType, AnimationParams> animationParams) {
            UtilsKt.setSafely(this.animationParams, animationParams);
            return this;
        }

        @NotNull
        public final Builder setBackground(@Nullable Background background) {
            this.background = background;
            return this;
        }

        @Deprecated
        @NotNull
        public final Builder setBackgroundColor(int backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        @NotNull
        public final Builder setControlsElementParamsList(@Nullable List<AdElementParams> controlsElementParamsList) {
            UtilsKt.setSafely(this.controlsElementParamsList, controlsElementParamsList);
            return this;
        }

        @NotNull
        public final Builder setCustomParams(@Nullable Map<String, String> customParams) {
            UtilsKt.setSafely(this.customParams, customParams);
            return this;
        }

        @NotNull
        public final Builder setEventParamsList(@Nullable Map<String, ? extends Map<EventType, List<EventTaskParams>>> sourceEventTypeMap) {
            UtilsKt.setSafely(this.sourceEventTypeMap, sourceEventTypeMap);
            return this;
        }

        @NotNull
        public final Builder setMethodParamsList(@Nullable List<MethodParams> methodParamsList) {
            UtilsKt.setSafely(this.methodParamsList, methodParamsList);
            return this;
        }

        @NotNull
        public final Builder setStateGroups(@Nullable List<String> stateGroups) {
            UtilsKt.setSafely(this.stateGroups, stateGroups);
            return this;
        }
    }

    public AdPhaseParams(int i, @Nullable Background background, @Nullable Integer num, @NotNull List<AdElementParams> adsList, @NotNull List<AdElementParams> controlsList, @NotNull List<MethodParams> methodParamsList, @NotNull Map<String, ? extends Map<EventType, ? extends List<EventTaskParams>>> sourceEventTypeMap, @NotNull Map<String, String> customParams, @NotNull Map<AnimationEventType, AnimationParams> animationParams, @NotNull List<String> stateGroups) {
        Intrinsics.checkNotNullParameter(adsList, "adsList");
        Intrinsics.checkNotNullParameter(controlsList, "controlsList");
        Intrinsics.checkNotNullParameter(methodParamsList, "methodParamsList");
        Intrinsics.checkNotNullParameter(sourceEventTypeMap, "sourceEventTypeMap");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        Intrinsics.checkNotNullParameter(animationParams, "animationParams");
        Intrinsics.checkNotNullParameter(stateGroups, "stateGroups");
        this.sequence = i;
        this.background = background;
        this.backgroundColor = num;
        this.adsList = adsList;
        this.controlsList = controlsList;
        this.methodParamsList = methodParamsList;
        this.sourceEventTypeMap = sourceEventTypeMap;
        this.customParams = customParams;
        this.animationParams = animationParams;
        this.stateGroups = stateGroups;
    }

    @Deprecated
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    @NotNull
    public final List<AdElementParams> getAdsList() {
        return this.adsList;
    }

    @NotNull
    public final Map<AnimationEventType, AnimationParams> getAnimationParams() {
        return this.animationParams;
    }

    @Nullable
    public final Background getBackground() {
        return this.background;
    }

    @Nullable
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<AdElementParams> getControlsList() {
        return this.controlsList;
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
    public final Map<EventType, List<EventTaskParams>> getEventTypeMap(@NotNull String sourceName) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        return (Map) this.sourceEventTypeMap.get(sourceName);
    }

    @NotNull
    public final List<MethodParams> getMethodParamsList() {
        return this.methodParamsList;
    }

    public final int getSequence() {
        return this.sequence;
    }

    @NotNull
    public final Map<String, Map<EventType, List<EventTaskParams>>> getSourceEventTypeMap() {
        return this.sourceEventTypeMap;
    }

    @NotNull
    public final List<String> getStateGroups() {
        return this.stateGroups;
    }

    public /* synthetic */ AdPhaseParams(int i, Background background, Integer num, List list, List list2, List list3, Map map, Map map2, Map map3, List list4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : background, (i2 & 4) != 0 ? -16777216 : num, list, list2, list3, map, map2, map3, list4);
    }
}
