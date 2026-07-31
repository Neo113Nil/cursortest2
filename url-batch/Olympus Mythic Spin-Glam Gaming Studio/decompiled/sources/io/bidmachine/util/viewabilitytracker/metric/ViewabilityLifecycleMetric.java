package io.bidmachine.util.viewabilitytracker.metric;

import android.view.View;
import io.bidmachine.util.log.LoggerInstance;
import io.bidmachine.util.log.TagLogger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewabilityLifecycleMetric.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityLifecycleMetric;", "Lio/bidmachine/util/viewabilitytracker/metric/Metric;", "states", "", "Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityLifecycleMetric$State;", "(Ljava/util/List;)V", "getStates", "()Ljava/util/List;", "check", "", "view", "Landroid/view/View;", "Companion", "State", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewabilityLifecycleMetric implements Metric {

    @NotNull
    private static final TagLogger LOGGER = new TagLogger("LifecycleMetric", null, 2, null);

    @NotNull
    private final List<State> states;

    /* compiled from: ViewabilityLifecycleMetric.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/metric/ViewabilityLifecycleMetric$State;", "", "(Ljava/lang/String;I)V", "HAS_WINDOW_FOCUS", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        HAS_WINDOW_FOCUS
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewabilityLifecycleMetric(@NotNull List<? extends State> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.states = states;
    }

    @NotNull
    public final List<State> getStates() {
        return this.states;
    }

    @Override // io.bidmachine.util.viewabilitytracker.metric.Metric
    public boolean check(@NotNull final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.states.contains(State.HAS_WINDOW_FOCUS) || view.hasWindowFocus()) {
            return true;
        }
        LoggerInstance.d$default(LOGGER, null, new Function0() { // from class: io.bidmachine.util.viewabilitytracker.metric.ViewabilityLifecycleMetric$check$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final String mo4828invoke() {
                return "Check failed: view window focus (false), must be true - " + view;
            }
        }, 1, null);
        return false;
    }
}
