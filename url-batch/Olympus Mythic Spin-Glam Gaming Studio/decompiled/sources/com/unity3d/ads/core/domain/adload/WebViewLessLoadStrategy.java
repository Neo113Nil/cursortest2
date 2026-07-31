package com.unity3d.ads.core.domain.adload;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebViewLessLoadStrategy.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JN\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H¦B¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/adload/WebViewLessLoadStrategy;", "", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "webViewUrl", "", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "opportunityId", "Lcom/google/protobuf/ByteString;", "response", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "placementId", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface WebViewLessLoadStrategy {
    @Nullable
    Object invoke(@NotNull CoroutineScope coroutineScope, @NotNull String str, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull ByteString byteString, @NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull String str2, @NotNull DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, @NotNull Continuation continuation);
}
