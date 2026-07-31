package io.bidmachine.protobuf;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.CreativeExtension;
import java.util.List;

/* loaded from: classes13.dex */
public interface CreativeExtensionOrBuilder extends MessageOrBuilder {
    CreativeExtension.AssetAppearance getAsset();

    CreativeExtension.AssetAppearanceOrBuilder getAssetOrBuilder();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* renamed from: getDefaultInstanceForType */
    /* synthetic */ MessageLite mo3244getDefaultInstanceForType();

    CreativeExtension.Feature getFeatures(int i);

    int getFeaturesCount();

    List<CreativeExtension.Feature> getFeaturesList();

    CreativeExtension.FeatureOrBuilder getFeaturesOrBuilder(int i);

    List<? extends CreativeExtension.FeatureOrBuilder> getFeaturesOrBuilderList();

    CreativeExtension.Postbanner getPostbanners(int i);

    int getPostbannersCount();

    List<CreativeExtension.Postbanner> getPostbannersList();

    CreativeExtension.PostbannerOrBuilder getPostbannersOrBuilder(int i);

    List<? extends CreativeExtension.PostbannerOrBuilder> getPostbannersOrBuilderList();

    boolean hasAsset();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
