package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.analytics.SDKAnalyticPayload;
import java.util.List;

/* loaded from: classes5.dex */
public interface SDKAnalyticPayloadOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    SDKAnalyticPayload.Metric getMetrics(int i);

    int getMetricsCount();

    List<SDKAnalyticPayload.Metric> getMetricsList();

    SDKAnalyticPayload.MetricOrBuilder getMetricsOrBuilder(int i);

    List<? extends SDKAnalyticPayload.MetricOrBuilder> getMetricsOrBuilderList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
