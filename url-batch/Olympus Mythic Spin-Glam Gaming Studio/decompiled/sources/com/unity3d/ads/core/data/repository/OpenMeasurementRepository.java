package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OpenMeasurementRepository.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H¦@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "", "omData", "Lcom/unity3d/ads/core/data/model/OMData;", "getOmData", "()Lcom/unity3d/ads/core/data/model/OMData;", "isOMActive", "", "()Z", "setOMActive", "(Z)V", "activateOM", "Lcom/unity3d/ads/core/data/model/OMResult;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startSession", "opportunityId", "Lcom/google/protobuf/ByteString;", "webView", "Landroid/webkit/WebView;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/unity3d/ads/core/data/model/OmidOptions;", "(Lcom/google/protobuf/ByteString;Landroid/webkit/WebView;Lcom/unity3d/ads/core/data/model/OmidOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finishSession", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "impressionOccurred", "signalLoaded", "(Lcom/google/protobuf/ByteString;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasSessionFinished", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OpenMeasurementRepository {
    @Nullable
    Object activateOM(@NotNull Context context, @NotNull Continuation continuation);

    @Nullable
    Object finishSession(@NotNull ByteString byteString, @NotNull Continuation continuation);

    @NotNull
    OMData getOmData();

    boolean hasSessionFinished(@NotNull ByteString opportunityId);

    @Nullable
    Object impressionOccurred(@NotNull ByteString byteString, boolean z, @NotNull Continuation continuation);

    boolean isOMActive();

    void setOMActive(boolean z);

    @Nullable
    Object startSession(@NotNull ByteString byteString, @Nullable WebView webView, @NotNull OmidOptions omidOptions, @NotNull Continuation continuation);
}
