package io.ably.lib.util;

import com.google.gson.JsonElement;
import io.ably.lib.http.HttpCore;
import io.ably.lib.util.Serialisation;

/* loaded from: classes7.dex */
public class StringUtils {
    public static Serialisation.FromJsonElement<String> fromJsonElement = new Serialisation.FromJsonElement<String>() { // from class: io.ably.lib.util.StringUtils.1
        @Override // io.ably.lib.util.Serialisation.FromJsonElement
        public String fromJsonElement(JsonElement jsonElement) {
            return jsonElement.getAsJsonPrimitive().getAsString();
        }
    };
    public static HttpCore.ResponseHandler<String> httpResponseHandler = new Serialisation.HttpResponseHandler(String.class, fromJsonElement);
    public static HttpCore.BodyHandler<String> httpBodyHandler = new Serialisation.HttpBodyHandler(String[].class, fromJsonElement);

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
