package io.bidmachine.util.viewabilitytracker.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewabilityTrackerParams.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/bidmachine/util/viewabilitytracker/model/ViewabilityTrackerParams;", "", "viewabilityRuleList", "", "Lio/bidmachine/util/viewabilitytracker/model/ViewabilityRule;", "(Ljava/util/List;)V", "getViewabilityRuleList", "()Ljava/util/List;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public final class ViewabilityTrackerParams {

    @NotNull
    private final List<ViewabilityRule> viewabilityRuleList;

    public ViewabilityTrackerParams(@NotNull List<ViewabilityRule> viewabilityRuleList) {
        Intrinsics.checkNotNullParameter(viewabilityRuleList, "viewabilityRuleList");
        this.viewabilityRuleList = viewabilityRuleList;
    }

    @NotNull
    public final List<ViewabilityRule> getViewabilityRuleList() {
        return this.viewabilityRuleList;
    }
}
