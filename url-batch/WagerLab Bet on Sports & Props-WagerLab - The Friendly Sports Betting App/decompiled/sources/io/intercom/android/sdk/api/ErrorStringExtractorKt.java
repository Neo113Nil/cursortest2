package io.intercom.android.sdk.api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.logger.LumberMill;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorStringExtractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"extractErrorString", "", "errorObject", "Lio/intercom/android/sdk/api/ErrorObject;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ErrorStringExtractorKt {
    public static final String extractErrorString(ErrorObject errorObject) {
        String message;
        Intrinsics.checkNotNullParameter(errorObject, "errorObject");
        Twig logger = LumberMill.getLogger();
        if (!errorObject.hasErrorBody() || errorObject.getErrorBody() == null) {
            return "Something went wrong";
        }
        try {
            JsonObject jsonObject = (JsonObject) Injector.get().getGson().fromJson(errorObject.getErrorBody(), JsonObject.class);
            if (jsonObject == null) {
                return "Something went wrong";
            }
            if (jsonObject.has("error")) {
                String asString = jsonObject.get("error").getAsString();
                Intrinsics.checkNotNull(asString);
                return asString;
            }
            if (!jsonObject.has("errors")) {
                return "Something went wrong";
            }
            JsonArray asJsonArray = jsonObject.getAsJsonArray("errors");
            Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
            return CollectionsKt.joinToString$default(asJsonArray, " - ", null, null, 0, null, new Function1() { // from class: io.intercom.android.sdk.api.ErrorStringExtractorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence extractErrorString$lambda$0;
                    extractErrorString$lambda$0 = ErrorStringExtractorKt.extractErrorString$lambda$0((JsonElement) obj);
                    return extractErrorString$lambda$0;
                }
            }, 30, null);
        } catch (Exception e) {
            logger.e(e);
            Throwable throwable = errorObject.getThrowable();
            return (throwable == null || (message = throwable.getMessage()) == null) ? "Something went wrong" : message;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence extractErrorString$lambda$0(JsonElement jsonElement) {
        if (jsonElement.isJsonObject() && jsonElement.getAsJsonObject().has("message")) {
            String asString = jsonElement.getAsJsonObject().get("message").getAsString();
            Intrinsics.checkNotNull(asString);
            return asString;
        }
        return "Something went wrong";
    }
}
