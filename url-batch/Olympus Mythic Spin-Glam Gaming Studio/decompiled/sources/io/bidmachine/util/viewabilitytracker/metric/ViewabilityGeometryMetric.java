package io.bidmachine.util.viewabilitytracker.metric;

import android.view.View;
import com.ironsource.C4643f8;
import io.bidmachine.util.ViewUtilsKt;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.log.TagLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewabilityGeometryMetric.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0013"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityGeometryMetric;", "Lio/bidmachine/util/viewabilitytracker/metric/Metric;", C4643f8.k, "", "minAlpha", "", "minWidthDp", "minHeightDp", "(ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "()Z", "getMinAlpha", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMinHeightDp", "getMinWidthDp", "check", "view", "Landroid/view/View;", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewabilityGeometryMetric implements Metric {

    @NotNull
    private static final TagLogger LOGGER = new TagLogger("GeometryMetric", null, 2, null);
    private final boolean isVisible;

    @Nullable
    private final Float minAlpha;

    @Nullable
    private final Float minHeightDp;

    @Nullable
    private final Float minWidthDp;

    public ViewabilityGeometryMetric(boolean z, @Nullable Float f, @Nullable Float f2, @Nullable Float f3) {
        this.isVisible = z;
        this.minAlpha = f;
        this.minWidthDp = f2;
        this.minHeightDp = f3;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    @Nullable
    public final Float getMinAlpha() {
        return this.minAlpha;
    }

    @Nullable
    public final Float getMinWidthDp() {
        return this.minWidthDp;
    }

    @Nullable
    public final Float getMinHeightDp() {
        return this.minHeightDp;
    }

    @Override // io.bidmachine.util.viewabilitytracker.metric.Metric
    public boolean check(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean isShown = view.isShown();
        if (this.isVisible && !isShown) {
            LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityGeometryMetric$check$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Check failed: view visibility (false), must be true - " + view;
                }
            }, 1, null);
            return false;
        }
        final float alpha = view.getAlpha();
        Float f = this.minAlpha;
        if (f != null && alpha < f.floatValue()) {
            LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityGeometryMetric$check$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Check failed: view alpha (" + alpha + "), must be more then " + this.getMinAlpha() + " - " + view;
                }
            }, 1, null);
            return false;
        }
        final int widthDp = ViewUtilsKt.getWidthDp(view);
        Float f2 = this.minWidthDp;
        if (f2 != null && widthDp < f2.floatValue()) {
            LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityGeometryMetric$check$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* renamed from: invoke */
                public final String mo4828invoke() {
                    return "Check failed: view width (" + widthDp + "), must be more then " + this.getMinWidthDp() + " - " + view;
                }
            }, 1, null);
            return false;
        }
        final int heightDp = ViewUtilsKt.getHeightDp(view);
        Float f3 = this.minHeightDp;
        if (f3 == null || heightDp >= f3.floatValue()) {
            return true;
        }
        LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityGeometryMetric$check$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return "Check failed: view height (" + heightDp + "), must be more then " + this.getMinHeightDp() + " - " + view;
            }
        }, 1, null);
        return false;
    }
}
