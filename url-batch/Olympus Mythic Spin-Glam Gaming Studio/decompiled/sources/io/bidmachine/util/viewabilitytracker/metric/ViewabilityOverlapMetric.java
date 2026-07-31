package io.bidmachine.util.viewabilitytracker.metric;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import io.bidmachine.util.Percent;
import io.bidmachine.util.Utils;
import io.bidmachine.util.ViewUtilsKt;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.log.TagLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewabilityOverlapMetric.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityOverlapMetric;", "Lio/bidmachine/util/viewabilitytracker/metric/Metric;", "scope", "Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityOverlapMetric$Scope;", "maxOverlapPercentage", "", "(Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityOverlapMetric$Scope;F)V", "getMaxOverlapPercentage", "()F", "minVisiblePercent", "getMinVisiblePercent$annotations", "()V", "getScope", "()Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityOverlapMetric$Scope;", "check", "", "view", "Landroid/view/View;", "Companion", "Scope", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class ViewabilityOverlapMetric implements Metric {

    @NotNull
    private static final TagLogger LOGGER = new TagLogger("OverlapMetric", null, 2, null);
    private final float maxOverlapPercentage;
    private final float minVisiblePercent;

    @NotNull
    private final Scope scope;

    /* compiled from: ViewabilityOverlapMetric.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityOverlapMetric$Scope;", "", "(Ljava/lang/String;I)V", "VIEW_SIBLINGS", "ALL_VIEWS", "WINDOWS", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum Scope {
        VIEW_SIBLINGS,
        ALL_VIEWS,
        WINDOWS
    }

    /* compiled from: ViewabilityOverlapMetric.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scope.values().length];
            try {
                iArr[Scope.VIEW_SIBLINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scope.ALL_VIEWS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Scope.WINDOWS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Percent
    private static /* synthetic */ void getMinVisiblePercent$annotations() {
    }

    public ViewabilityOverlapMetric(@NotNull Scope scope, @Percent float f) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
        this.maxOverlapPercentage = f;
        this.minVisiblePercent = 100 - f;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }

    public final float getMaxOverlapPercentage() {
        return this.maxOverlapPercentage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.ViewGroup] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c4 -> B:21:0x0073). Please report as a decompilation issue!!! */
    @Override // io.bidmachine.util.viewabilitytracker.metric.Metric
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean check(@NotNull View view) {
        ?? r5;
        Intrinsics.checkNotNullParameter(view, "view");
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = view;
        int i = WhenMappings.$EnumSwitchMapping$0[this.scope.ordinal()];
        if (i == 1) {
            Rect rect = new Rect();
            if (!((View) ref$ObjectRef.element).getGlobalVisibleRect(rect)) {
                LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityOverlapMetric$check$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final String mo4828invoke() {
                        return "Check failed: view is completely clipped - " + ref$ObjectRef.element;
                    }
                }, 1, null);
                return false;
            }
            View rootView = ((View) ref$ObjectRef.element).getRootView();
            ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
            ViewParent parent = ((View) ref$ObjectRef.element).getParent();
            if (parent instanceof ViewGroup) {
                r5 = (ViewGroup) parent;
                while (r5 != 0) {
                    int childCount = r5.getChildCount();
                    for (int indexOfChild = r5.indexOfChild((View) ref$ObjectRef.element) + 1; indexOfChild < childCount; indexOfChild++) {
                        final View childAt = r5.getChildAt(indexOfChild);
                        Intrinsics.checkNotNullExpressionValue(childAt, "parent.getChildAt(i)");
                        if (ViewUtilsKt.isViewVisible(childAt)) {
                            Rect locationInWindow = ViewUtilsKt.getLocationInWindow(childAt);
                            if (Rect.intersects(rect, locationInWindow)) {
                                final float notOverlappedAreaPercent = Utils.getNotOverlappedAreaPercent(rect, locationInWindow);
                                if (notOverlappedAreaPercent < this.minVisiblePercent) {
                                    LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityOverlapMetric$check$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        @NotNull
                                        /* renamed from: invoke */
                                        public final String mo4828invoke() {
                                            float f;
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Check failed: view is covered by another view (");
                                            sb.append(notOverlappedAreaPercent);
                                            sb.append("% / ");
                                            f = this.minVisiblePercent;
                                            sb.append(f);
                                            sb.append("%) - ");
                                            sb.append(ref$ObjectRef.element);
                                            sb.append(", overlapping view - ");
                                            sb.append(childAt);
                                            sb.append(')');
                                            return sb.toString();
                                        }
                                    }, 1, null);
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    if (r5 != viewGroup) {
                        ref$ObjectRef.element = r5;
                        ViewParent parent2 = r5.getParent();
                        if (parent2 instanceof ViewGroup) {
                            r5 = (ViewGroup) parent2;
                        }
                    }
                }
            }
            r5 = 0;
            while (r5 != 0) {
            }
        } else if (i == 2) {
            LoggerInstance.e$default(LOGGER, (Object) null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityOverlapMetric$check$3
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Check not supported (scope - " + ViewabilityOverlapMetric.this.getScope().name() + ')';
                }
            }, 1, (Object) null);
        } else if (i == 3) {
            LoggerInstance.e$default(LOGGER, (Object) null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityOverlapMetric$check$4
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Check not supported (scope - " + ViewabilityOverlapMetric.this.getScope().name() + ')';
                }
            }, 1, (Object) null);
        }
        return true;
    }
}
