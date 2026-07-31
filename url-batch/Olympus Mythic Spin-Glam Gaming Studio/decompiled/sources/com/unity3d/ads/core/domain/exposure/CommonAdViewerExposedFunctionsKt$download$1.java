package com.unity3d.ads.core.domain.exposure;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CacheFile;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class CommonAdViewerExposedFunctionsKt$download$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CacheFile $cacheFile;
    final /* synthetic */ SessionRepository $sessionRepository;

    CommonAdViewerExposedFunctionsKt$download$1(SessionRepository sessionRepository, CacheFile cacheFile, AdObject adObject) {
        this.$sessionRepository = sessionRepository;
        this.$cacheFile = cacheFile;
        this.$adObject = adObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.unity3d.ads.adplayer.ExposedFunction, kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object[] objArr, Continuation continuation) {
        CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$1;
        int i;
        boolean disableCustomScheme;
        String str;
        CacheResult cacheResult;
        if (continuation instanceof CommonAdViewerExposedFunctionsKt$download$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$download$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$download$1$invoke$1) continuation;
            int i2 = commonAdViewerExposedFunctionsKt$download$1$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$download$1$invoke$1.label = i2 - Integer.MIN_VALUE;
                CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$12 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
                Object obj = commonAdViewerExposedFunctionsKt$download$1$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$download$1$invoke$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Object obj2 = objArr[0];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) obj2;
                    String string = jSONObject.getString("url");
                    JSONArray jSONArray = (JSONArray) ArraysKt.getOrNull(objArr, 2);
                    int optInt = jSONObject.optInt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
                    disableCustomScheme = this.$sessionRepository.getFeatureFlags().getDisableCustomScheme();
                    CacheFile cacheFile = this.$cacheFile;
                    Intrinsics.checkNotNull(string);
                    AdObject adObject = this.$adObject;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.L$0 = string;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.Z$0 = disableCustomScheme;
                    commonAdViewerExposedFunctionsKt$download$1$invoke$12.label = 1;
                    obj = CacheFile.DefaultImpls.invoke$default(cacheFile, string, adObject, jSONArray, optInt, 0, null, commonAdViewerExposedFunctionsKt$download$1$invoke$12, 48, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = string;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    disableCustomScheme = commonAdViewerExposedFunctionsKt$download$1$invoke$12.Z$0;
                    str = (String) commonAdViewerExposedFunctionsKt$download$1$invoke$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                cacheResult = (CacheResult) obj;
                if (cacheResult instanceof CacheResult.Success) {
                    if (cacheResult instanceof CacheResult.Failure) {
                        throw new IllegalStateException(((CacheResult.Failure) cacheResult).getError().name().toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (disableCustomScheme) {
                    return str;
                }
                return "unity-ads-cache://unity.ads.cache/" + ((CacheResult.Success) cacheResult).getCachedFile().getName();
            }
        }
        commonAdViewerExposedFunctionsKt$download$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$download$1$invoke$1(this, continuation);
        CommonAdViewerExposedFunctionsKt$download$1$invoke$1 commonAdViewerExposedFunctionsKt$download$1$invoke$122 = commonAdViewerExposedFunctionsKt$download$1$invoke$1;
        Object obj3 = commonAdViewerExposedFunctionsKt$download$1$invoke$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$download$1$invoke$122.label;
        if (i != 0) {
        }
        cacheResult = (CacheResult) obj3;
        if (cacheResult instanceof CacheResult.Success) {
        }
    }
}
