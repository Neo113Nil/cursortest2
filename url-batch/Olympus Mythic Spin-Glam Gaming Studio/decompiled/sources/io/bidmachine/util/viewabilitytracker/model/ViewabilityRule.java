package io.bidmachine.util.viewabilitytracker.model;

import io.bidmachine.util.viewabilitytracker.metric.Metric;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewabilityRule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/model/ViewabilityRule;", "", "actionEvent", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "viewabilityMeasurement", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityMeasurement;", "metrics", "", "Lio/bidmachine/util/viewabilitytracker/metric/Metric;", "(Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;Lio/bidmachine/util/viewabilitytracker/model/ViewabilityMeasurement;Ljava/util/Collection;)V", "getActionEvent", "()Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "getMetrics", "()Ljava/util/Collection;", "getViewabilityMeasurement", "()Lio/bidmachine/util/viewabilitytracker/model/ViewabilityMeasurement;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewabilityRule {

    @NotNull
    private final ActionEvent actionEvent;

    @NotNull
    private final Collection<Metric> metrics;

    @NotNull
    private final ViewabilityMeasurement viewabilityMeasurement;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewabilityRule(@NotNull ActionEvent actionEvent, @NotNull ViewabilityMeasurement viewabilityMeasurement, @NotNull Collection<? extends Metric> metrics) {
        Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
        Intrinsics.checkNotNullParameter(viewabilityMeasurement, "viewabilityMeasurement");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.actionEvent = actionEvent;
        this.viewabilityMeasurement = viewabilityMeasurement;
        this.metrics = metrics;
    }

    @NotNull
    public final ActionEvent getActionEvent() {
        return this.actionEvent;
    }

    @NotNull
    public final ViewabilityMeasurement getViewabilityMeasurement() {
        return this.viewabilityMeasurement;
    }

    @NotNull
    public final Collection<Metric> getMetrics() {
        return this.metrics;
    }
}
