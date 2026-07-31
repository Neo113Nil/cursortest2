package io.bidmachine;

import android.content.Context;
import io.bidmachine.internal.C6012g;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.protobuf.sdk.AssetCache;
import io.bidmachine.util.cache.MediaFileCacheManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lio/bidmachine/BidMachineAssetCacheInitializer;", "", "()V", "configure", "", "context", "Landroid/content/Context;", "initResponse", "Lio/bidmachine/protobuf/InitResponse;", "getMediaFileCacheManagerConfiguration", "Lio/bidmachine/util/cache/MediaFileCacheManager$Configuration;", "toPolicyLimit", "Lio/bidmachine/util/cache/MediaFileCacheManager$PolicyLimit;", "Lio/bidmachine/protobuf/sdk/AssetCache$PolicyLimit;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class BidMachineAssetCacheInitializer {
    private final MediaFileCacheManager.Configuration getMediaFileCacheManagerConfiguration(InitResponse initResponse) {
        MediaFileCacheManager.Configuration configuration = null;
        try {
            if (!initResponse.hasAssetCacheConfiguration()) {
                return null;
            }
            AssetCache.Configuration assetCacheConfiguration = initResponse.getAssetCacheConfiguration();
            AssetCache.CleanConfiguration cleanConfiguration = assetCacheConfiguration.getCleanConfiguration();
            MediaFileCacheManager.CleanConfiguration cleanConfiguration2 = new MediaFileCacheManager.CleanConfiguration(cleanConfiguration.getTriggerOnStartup(), cleanConfiguration.getTriggerOnCaching(), cleanConfiguration.getTriggerOnDiskIssue());
            AssetCache.ConnectionConfiguration connectionConfiguration = assetCacheConfiguration.getConnectionConfiguration();
            Duration.Companion companion = Duration.Companion;
            long headRequestTimeoutMs = connectionConfiguration.getHeadRequestTimeoutMs();
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            MediaFileCacheManager.ConnectionConfiguration connectionConfiguration2 = new MediaFileCacheManager.ConnectionConfiguration(DurationKt.toDuration(headRequestTimeoutMs, durationUnit), DurationKt.toDuration(connectionConfiguration.getDownloadRequestTimeoutMs(), durationUnit), null);
            AssetCache.PolicyConfiguration policyConfiguration = assetCacheConfiguration.getPolicyConfiguration();
            AssetCache.PolicyLimit maxPingTimeMs = policyConfiguration.getDownloadPolicy().getMaxPingTimeMs();
            Intrinsics.checkNotNullExpressionValue(maxPingTimeMs, "protobufPolicyConfig.downloadPolicy.maxPingTimeMs");
            MediaFileCacheManager.PolicyLimit policyLimit = toPolicyLimit(maxPingTimeMs);
            AssetCache.PolicyLimit maxFileSizeBytes = policyConfiguration.getDownloadPolicy().getMaxFileSizeBytes();
            Intrinsics.checkNotNullExpressionValue(maxFileSizeBytes, "protobufPolicyConfig.dow…adPolicy.maxFileSizeBytes");
            MediaFileCacheManager.DownloadPolicy downloadPolicy = new MediaFileCacheManager.DownloadPolicy(policyLimit, toPolicyLimit(maxFileSizeBytes));
            List<AssetCache.EvictionPolicy> evictionPoliciesList = policyConfiguration.getEvictionPoliciesList();
            Intrinsics.checkNotNullExpressionValue(evictionPoliciesList, "protobufPolicyConfig.evictionPoliciesList");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(evictionPoliciesList, 10));
            Iterator it = evictionPoliciesList.iterator();
            while (it.hasNext()) {
                AssetCache.EvictionPolicy evictionPolicy = (AssetCache.EvictionPolicy) it.next();
                double score = evictionPolicy.getScore();
                double minDiskAppliedPercent = evictionPolicy.getMinDiskAppliedPercent();
                double maxDiskAppliedPercent = evictionPolicy.getMaxDiskAppliedPercent();
                Duration.Companion companion2 = Duration.Companion;
                Iterator it2 = it;
                try {
                    MediaFileCacheManager.PolicyLimit policyLimit2 = new MediaFileCacheManager.PolicyLimit(Duration.m8147getInWholeMillisecondsimpl(DurationKt.toDuration(evictionPolicy.getMaxTtlSeconds().getThreshold(), DurationUnit.SECONDS)), evictionPolicy.getMaxTtlSeconds().getWeight());
                    AssetCache.PolicyLimit minFrequency = evictionPolicy.getMinFrequency();
                    Intrinsics.checkNotNullExpressionValue(minFrequency, "it.minFrequency");
                    MediaFileCacheManager.PolicyLimit policyLimit3 = toPolicyLimit(minFrequency);
                    AssetCache.PolicyLimit maxImageSizeBytes = evictionPolicy.getMaxImageSizeBytes();
                    Intrinsics.checkNotNullExpressionValue(maxImageSizeBytes, "it.maxImageSizeBytes");
                    MediaFileCacheManager.PolicyLimit policyLimit4 = toPolicyLimit(maxImageSizeBytes);
                    AssetCache.PolicyLimit maxVideoSizeBytes = evictionPolicy.getMaxVideoSizeBytes();
                    Intrinsics.checkNotNullExpressionValue(maxVideoSizeBytes, "it.maxVideoSizeBytes");
                    arrayList.add(new MediaFileCacheManager.EvictionPolicy(score, minDiskAppliedPercent, maxDiskAppliedPercent, policyLimit2, policyLimit3, policyLimit4, toPolicyLimit(maxVideoSizeBytes)));
                    it = it2;
                    configuration = null;
                } catch (Throwable unused) {
                    return null;
                }
            }
            return new MediaFileCacheManager.Configuration(cleanConfiguration2, connectionConfiguration2, new MediaFileCacheManager.PolicyConfiguration(downloadPolicy, arrayList));
        } catch (Throwable unused2) {
            return configuration;
        }
    }

    private final MediaFileCacheManager.PolicyLimit toPolicyLimit(AssetCache.PolicyLimit policyLimit) {
        return new MediaFileCacheManager.PolicyLimit(policyLimit.getThreshold(), policyLimit.getWeight());
    }

    public final void configure(@NotNull Context context, @NotNull InitResponse initResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initResponse, "initResponse");
        C6012g c6012g = C6012g.a;
        c6012g.b(context);
        MediaFileCacheManager.Configuration mediaFileCacheManagerConfiguration = getMediaFileCacheManagerConfiguration(initResponse);
        if (mediaFileCacheManagerConfiguration != null) {
            c6012g.a(context, mediaFileCacheManagerConfiguration);
        }
        c6012g.c(context);
    }
}
