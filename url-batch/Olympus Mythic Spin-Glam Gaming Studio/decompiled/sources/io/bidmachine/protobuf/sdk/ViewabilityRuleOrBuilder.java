package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* loaded from: classes5.dex */
public interface ViewabilityRuleOrBuilder extends MessageOrBuilder {
    boolean getBillable();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    int getEvent();

    Measurement getMeasurement();

    MeasurementOrBuilder getMeasurementOrBuilder();

    MetricRequirement getRequiredMetrics(int i);

    int getRequiredMetricsCount();

    List<MetricRequirement> getRequiredMetricsList();

    MetricRequirementOrBuilder getRequiredMetricsOrBuilder(int i);

    List<? extends MetricRequirementOrBuilder> getRequiredMetricsOrBuilderList();

    boolean hasMeasurement();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
