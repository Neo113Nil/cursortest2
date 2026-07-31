package io.bidmachine.util.viewabilitytracker.metric;

import android.graphics.Rect;
import android.view.View;
import io.bidmachine.util.Percent;
import io.bidmachine.util.ViewUtilsKt;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.log.TagLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewabilityVisibilityMetric.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityVisibilityMetric;", "Lio/bidmachine/util/viewabilitytracker/metric/Metric;", "scope", "Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityVisibilityMetric$Scope;", "minVisiblePercentage", "", "(Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityVisibilityMetric$Scope;F)V", "getMinVisiblePercentage", "()F", "getScope", "()Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityVisibilityMetric$Scope;", "check", "", "view", "Landroid/view/View;", "Companion", "Scope", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class ViewabilityVisibilityMetric implements Metric {

    @NotNull
    private static final TagLogger LOGGER = new TagLogger("VisibilityMetric", null, 2, null);
    private final float minVisiblePercentage;

    @NotNull
    private final Scope scope;

    /* compiled from: ViewabilityVisibilityMetric.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityVisibilityMetric$Scope;", "", "(Ljava/lang/String;I)V", "PARENT_VIEW", "SCREEN", "SAFE_AREA", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Scope {
        PARENT_VIEW,
        SCREEN,
        SAFE_AREA
    }

    /* compiled from: ViewabilityVisibilityMetric.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scope.values().length];
            try {
                iArr[Scope.PARENT_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scope.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scope.SAFE_AREA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ViewabilityVisibilityMetric(@NotNull Scope scope, @Percent float f) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.minVisiblePercentage = f;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }

    public final float getMinVisiblePercentage() {
        return this.minVisiblePercentage;
    }

    @Override // io.bidmachine.util.viewabilitytracker.metric.Metric
    public boolean check(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = WhenMappings.$EnumSwitchMapping$0[this.scope.ordinal()];
        if (i == 1) {
            Rect rect = new Rect();
            if (!view.getGlobalVisibleRect(rect)) {
                LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityVisibilityMetric$check$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Check failed: view is completely clipped - " + view;
                    }
                }, 1, null);
                return false;
            }
            final float width = ((rect.width() * rect.height()) / (view.getWidth() * view.getHeight())) * 100;
            if (width < this.minVisiblePercentage) {
                LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityVisibilityMetric$check$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Check failed: view not completely visible (" + width + "%), must be more then " + this.getMinVisiblePercentage() + "% - " + view;
                    }
                }, 1, null);
                return false;
            }
            View findContentOrRootView = ViewUtilsKt.findContentOrRootView(view);
            if (findContentOrRootView == null) {
                LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityVisibilityMetric$check$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Check failed: content or root layout not found - " + view;
                    }
                }, 1, null);
                return false;
            }
            Rect rect2 = new Rect();
            findContentOrRootView.getGlobalVisibleRect(rect2);
            if (!Rect.intersects(rect, rect2)) {
                LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityVisibilityMetric$check$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Check failed: view is out of current window - " + view;
                    }
                }, 1, null);
                return false;
            }
        } else if (i == 2) {
            LoggerInstance.e$default(LOGGER, (Object) null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityVisibilityMetric$check$5
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Check not supported (scope - " + ViewabilityVisibilityMetric.this.getScope().name() + ')';
                }
            }, 1, (Object) null);
        } else if (i == 3) {
            LoggerInstance.e$default(LOGGER, (Object) null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityVisibilityMetric$check$6
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Check not supported (scope - " + ViewabilityVisibilityMetric.this.getScope().name() + ')';
                }
            }, 1, (Object) null);
        }
        return true;
    }
}
