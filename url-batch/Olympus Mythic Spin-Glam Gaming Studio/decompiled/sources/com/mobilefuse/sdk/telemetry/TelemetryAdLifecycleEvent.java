package com.mobilefuse.sdk.telemetry;

import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetrySdkTypes.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryAdLifecycleEvent;", "", "()V", "AD_CLICKED", "Lkotlin/Pair;", "", "AD_CLOSED", "AD_COLLAPSED", "AD_EARNED_REWARD", "AD_ERROR", "AD_EXPANDED", "AD_EXPIRED", "AD_LOADED", "AD_NOT_FILLED", "AD_RENDERED", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
/* loaded from: classes15.dex */
public final class TelemetryAdLifecycleEvent {

    @NotNull
    public static final String AD_ERROR = "onAdError";

    @NotNull
    public static final TelemetryAdLifecycleEvent INSTANCE = new TelemetryAdLifecycleEvent();

    @NotNull
    public static final Pair<String, String> AD_LOADED = new Pair<>(h.ae, X3.i.r);

    @NotNull
    public static final Pair<String, String> AD_NOT_FILLED = new Pair<>("adNotFilled", "not filled");

    @NotNull
    public static final Pair<String, String> AD_CLOSED = new Pair<>(h.ah, "closed");

    @NotNull
    public static final Pair<String, String> AD_RENDERED = new Pair<>("adRendered", "rendered");

    @NotNull
    public static final Pair<String, String> AD_CLICKED = new Pair<>("adClicked", "clicked");

    @NotNull
    public static final Pair<String, String> AD_EXPIRED = new Pair<>("adExpired", "expired");

    @NotNull
    public static final Pair<String, String> AD_EXPANDED = new Pair<>("adExpanded", "expanded");

    @NotNull
    public static final Pair<String, String> AD_COLLAPSED = new Pair<>("adCollapsed", "collapsed");

    @NotNull
    public static final Pair<String, String> AD_EARNED_REWARD = new Pair<>("userEarnedReward", "user earned reward");

    private TelemetryAdLifecycleEvent() {
    }
}
