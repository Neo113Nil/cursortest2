package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.sdk.LifecycleMetric;
import java.util.List;

/* loaded from: classes5.dex */
public interface LifecycleMetricOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    LifecycleMetric.LifecycleState getRequiredStates(int i);

    int getRequiredStatesCount();

    List<LifecycleMetric.LifecycleState> getRequiredStatesList();

    int getRequiredStatesValue(int i);

    List<Integer> getRequiredStatesValueList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
