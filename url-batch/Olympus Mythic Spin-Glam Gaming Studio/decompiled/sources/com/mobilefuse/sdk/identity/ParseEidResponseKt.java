package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParseEidResponse.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a>\u0010\u0000\u001a \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¨\u0006\n"}, d2 = {"applyEidResponseToCurrentEidData", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/sdk/exception/BaseError;", "Lkotlin/Pair;", "Lcom/mobilefuse/sdk/identity/EidSdkData;", "", "", "currentEidData", "requestUserPayload", "responseJson", "mobilefuse-sdk-core_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes4.dex */
public final class ParseEidResponseKt {
    @NotNull
    public static final Either<BaseError, Pair<EidSdkData, Set<String>>> applyEidResponseToCurrentEidData(@NotNull EidSdkData currentEidData, @NotNull String requestUserPayload, @NotNull String responseJson) {
        Either errorResult;
        Object value;
        Intrinsics.checkNotNullParameter(currentEidData, "currentEidData");
        Intrinsics.checkNotNullParameter(requestUserPayload, "requestUserPayload");
        Intrinsics.checkNotNullParameter(responseJson, "responseJson");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            JSONObject jSONObject = new JSONObject(responseJson);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            String jSONObject2 = jSONObject.has("mfx") ? jSONObject.getJSONObject("mfx").toString() : currentEidData.getMfxPayload();
            JSONObject jSONObject3 = jSONObject.getJSONObject("sdk");
            int i = jSONObject3.getInt("ttl");
            JSONArray jSONArray = jSONObject3.has("del") ? jSONObject3.getJSONArray("del") : new JSONArray();
            Map mutableMap = MapsKt.toMutableMap(currentEidData.getSdkEids());
            JSONArray jSONArray2 = jSONObject3.has("ids") ? jSONObject3.getJSONArray("ids") : new JSONArray();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                String key = jSONObject4.getString("src");
                String value2 = jSONObject4.getString("id");
                if (!Intrinsics.areEqual(value2, (String) mutableMap.get(key))) {
                    linkedHashSet.add(key);
                }
                Intrinsics.checkNotNullExpressionValue(key, "key");
                Intrinsics.checkNotNullExpressionValue(value2, "value");
                linkedHashMap.put(key, value2);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                mutableMap.put(entry.getKey(), entry.getValue());
            }
            int length2 = jSONArray.length();
            for (int i3 = 0; i3 < length2; i3++) {
                String string = jSONArray.getString(i3);
                if (currentEidData.getSdkEids().containsKey(string)) {
                    linkedHashSet.add(string);
                    mutableMap.remove(string);
                }
            }
            errorResult = new SuccessResult(new SuccessResult(TuplesKt.to(new EidSdkData(System.currentTimeMillis() + (i * 1000), mutableMap, jSONObject2, requestUserPayload), linkedHashSet)));
        } catch (Throwable th) {
            if (ParseEidResponseKt$applyEidResponseToCurrentEidData$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$2[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            value = new ErrorResult(new ProcessingError(((Throwable) ((ErrorResult) errorResult).getValue()).getMessage()));
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new NoWhenBranchMatchedException();
            }
            value = ((SuccessResult) errorResult).getValue();
        }
        return (Either) value;
    }
}
