package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* loaded from: classes6.dex */
public interface ViewabilityConfigurationOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    ViewabilityRule getRules(int i);

    int getRulesCount();

    List<ViewabilityRule> getRulesList();

    ViewabilityRuleOrBuilder getRulesOrBuilder(int i);

    List<? extends ViewabilityRuleOrBuilder> getRulesOrBuilderList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
