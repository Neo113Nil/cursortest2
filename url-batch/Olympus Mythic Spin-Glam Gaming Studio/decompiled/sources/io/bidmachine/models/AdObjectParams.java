package io.bidmachine.models;

import androidx.annotation.CallSuper;
import com.explorestack.protobuf.Value;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.TrackEventType;
import io.bidmachine.protobuf.AdExtension;
import io.bidmachine.protobuf.CreativeLoadingMethod;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.sdk.ViewabilityConfiguration;
import io.bidmachine.unified.AdObjectMediationParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.util.viewabilitytracker.model.ViewabilityTrackerParams;
import io.bidmachine.utils.ProtoUtils;
import io.bidmachine.utils.ProtoUtilsKt;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0004J\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\fJ\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020!H&J\u0018\u0010\"\u001a\u00020\u001a2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0004J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0005J\u001c\u0010&\u001a\u00020\u001a2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020+0*H\u0005R$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR#\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\n¨\u0006,"}, d2 = {"Lio/bidmachine/models/AdObjectParams;", "", "ad", "Lcom/explorestack/protobuf/adcom/Ad;", "(Lcom/explorestack/protobuf/adcom/Ad;)V", "height", "", "getHeight", "()I", "setHeight", "(I)V", "trackUrls", "", "Lio/bidmachine/TrackEventType;", "", "", "getTrackUrls", "()Ljava/util/Map;", "unifiedMediationParams", "Lio/bidmachine/unified/AdObjectMediationParams;", "viewabilityTrackerParams", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "width", "getWidth", "setWidth", "addEvent", "", "trackEventType", "url", "getData", "getMediationParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "isValid", "", "prepareEvents", "events", "", "Lcom/explorestack/protobuf/adcom/Ad$Event;", "prepareExtensions", "adExtension", "Lio/bidmachine/protobuf/AdExtension;", "extensionMap", "", "Lcom/explorestack/protobuf/Value;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AdObjectParams {

    @NotNull
    private final Map<TrackEventType, List<String>> trackUrls;

    @NotNull
    private final AdObjectMediationParams unifiedMediationParams;

    @Nullable
    public final ViewabilityTrackerParams viewabilityTrackerParams;

    public AdObjectParams(@NotNull Ad ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.trackUrls = new EnumMap(TrackEventType.class);
        this.unifiedMediationParams = new AdObjectMediationParams();
        AdExtension findFirstAdExtension = ProtoUtilsKt.findFirstAdExtension(ad);
        if (findFirstAdExtension != null) {
            prepareExtensions(findFirstAdExtension);
            ViewabilityConfiguration viewabilityConfiguration = findFirstAdExtension.getViewabilityConfiguration();
            Intrinsics.checkNotNullExpressionValue(viewabilityConfiguration, "adExtension.viewabilityConfiguration");
            this.viewabilityTrackerParams = ProtoUtilsKt.toViewabilityTrackerParams(viewabilityConfiguration);
        } else {
            this.viewabilityTrackerParams = null;
        }
        Map<String, Value> fieldsMap = ad.getExt().getFieldsMap();
        Intrinsics.checkNotNullExpressionValue(fieldsMap, "ad.ext.fieldsMap");
        prepareExtensions(fieldsMap);
        Map<String, Object> data = getData();
        String id = ad.getId();
        Intrinsics.checkNotNullExpressionValue(id, "ad.id");
        data.put("creativeId", id);
    }

    protected final void addEvent(@NotNull TrackEventType trackEventType, @Nullable String url) {
        Intrinsics.checkNotNullParameter(trackEventType, "trackEventType");
        ProtoUtils.addEvent(this.trackUrls, trackEventType, url);
    }

    @NotNull
    public final Map<String, Object> getData() {
        Map<String, Object> params = this.unifiedMediationParams.getParams();
        Intrinsics.checkNotNullExpressionValue(params, "unifiedMediationParams.params");
        return params;
    }

    public final int getHeight() {
        return getMediationParams().getInteger("height");
    }

    @NotNull
    public final UnifiedMediationParams getMediationParams() {
        return this.unifiedMediationParams;
    }

    @NotNull
    public final Map<TrackEventType, List<String>> getTrackUrls() {
        return this.trackUrls;
    }

    public final int getWidth() {
        return getMediationParams().getInteger("width");
    }

    public abstract boolean isValid();

    protected final void prepareEvents(@Nullable List<Ad.Event> events) {
        ProtoUtils.prepareEvents(this.trackUrls, events);
    }

    @CallSuper
    protected final void prepareExtensions(@NotNull AdExtension adExtension) {
        Intrinsics.checkNotNullParameter(adExtension, "adExtension");
        prepareEvents(adExtension.getEventList());
        Map<String, Object> data = getData();
        data.put(UnifiedMediationParams.KEY_USE_NATIVE_CLOSE, Boolean.valueOf(adExtension.getUseNativeClose()));
        CreativeLoadingMethod creativeLoadingMethod = adExtension.getCreativeLoadingMethod();
        Intrinsics.checkNotNullExpressionValue(creativeLoadingMethod, "adExtension.creativeLoadingMethod");
        data.put(UnifiedMediationParams.KEY_CACHE_CONTROL, creativeLoadingMethod);
        data.put(UnifiedMediationParams.KEY_PLACEHOLDER_TIMEOUT_SEC, Float.valueOf(adExtension.getPlaceholderTimeout()));
        data.put(UnifiedMediationParams.KEY_SKIP_OFFSET, Integer.valueOf(adExtension.getSkipoffset()));
        data.put(UnifiedMediationParams.KEY_COMPANION_SKIP_OFFSET, Integer.valueOf(adExtension.getCompanionSkipoffset()));
        data.put(UnifiedMediationParams.KEY_R1, Boolean.valueOf(adExtension.getR1()));
        data.put(UnifiedMediationParams.KEY_R2, Boolean.valueOf(adExtension.getR2()));
        String storeUrl = adExtension.getStoreUrl();
        Intrinsics.checkNotNullExpressionValue(storeUrl, "adExtension.storeUrl");
        data.put(UnifiedMediationParams.KEY_STORE_URL, storeUrl);
        data.put(UnifiedMediationParams.KEY_PROGRESS_DURATION, Integer.valueOf(adExtension.getProgressDuration()));
        AdExtension.ControlAsset closeButton = adExtension.getCloseButton();
        if (closeButton != null && closeButton != AdExtension.ControlAsset.getDefaultInstance()) {
            data.put(UnifiedMediationParams.KEY_CLOSE_BUTTON_CONTROL_ASSET, closeButton);
        }
        AdExtension.ControlAsset countdown = adExtension.getCountdown();
        if (countdown != null && countdown != AdExtension.ControlAsset.getDefaultInstance()) {
            data.put(UnifiedMediationParams.KEY_COUNTDOWN_CONTROL_ASSET, countdown);
        }
        AdExtension.ControlAsset progress = adExtension.getProgress();
        if (progress != null && progress != AdExtension.ControlAsset.getDefaultInstance()) {
            data.put(UnifiedMediationParams.KEY_PROGRESS_CONTROL_ASSET, progress);
        }
        Rendering renderingConfiguration = adExtension.getRenderingConfiguration();
        if (renderingConfiguration == null || renderingConfiguration == Rendering.getDefaultInstance()) {
            return;
        }
        data.put(UnifiedMediationParams.KEY_RENDERING_CONFIGURATION, renderingConfiguration);
    }

    public final void setHeight(int i) {
        getData().put("height", Integer.valueOf(i));
    }

    public final void setWidth(int i) {
        getData().put("width", Integer.valueOf(i));
    }

    @CallSuper
    protected final void prepareExtensions(@NotNull Map<String, Value> extensionMap) {
        Intrinsics.checkNotNullParameter(extensionMap, "extensionMap");
        Value value = extensionMap.get(UnifiedMediationParams.KEY_OM_SDK_ENABLED);
        if (value == null) {
            return;
        }
        getData().put(UnifiedMediationParams.KEY_OM_SDK_ENABLED, Boolean.valueOf(value.getBoolValue()));
    }
}
