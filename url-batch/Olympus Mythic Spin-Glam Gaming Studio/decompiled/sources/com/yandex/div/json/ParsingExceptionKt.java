package com.yandex.div.json;

import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.yandex.div.internal.util.JsonArray;
import com.yandex.div.internal.util.JsonObject;
import com.yandex.div.internal.util.JsonUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParsingException.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u001a\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\u001a\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000b\u001a&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003\u001a,\u0010\u0006\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00012\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0000\u001a\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\u001a$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0000\u001a\u0016\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b\u001a!\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u0002H\u0015¢\u0006\u0002\u0010\u0017\u001a)\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00152\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u0002H\u0015¢\u0006\u0002\u0010\u0018\u001a,\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u001d\u001a1\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u0002H\u0015¢\u0006\u0002\u0010\u001e\u001a9\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u0002H\u00152\u0006\u0010\t\u001a\u00020\u001d¢\u0006\u0002\u0010\u001f\u001a)\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00152\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u0002H\u0015¢\u0006\u0002\u0010 \u001a1\u0010\u0014\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00152\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u0002H\u00152\u0006\u0010\t\u001a\u00020\u001d¢\u0006\u0002\u0010!\u001a\u0016\u0010\"\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b\u001a\u001e\u0010\"\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0016\u0010\"\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b\u001a*\u0010#\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u001d\u001a\u001a\u0010#\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u001d\u001a-\u0010&\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00152\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u0002H\u00152\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010'\u001a\u0016\u0010(\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\b\u001a\u0016\u0010*\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u001c\u001a\u000e\u0010*\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b\u001a,\u0010*\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u001d\u001a&\u0010*\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u001c\u001a\u001e\u0010*\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u001c\u001a\u000e\u0010,\u001a\u00020\b*\u0004\u0018\u00010\u001cH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006-"}, d2 = {"MAX_TO_STRING_LENGTH", "", "SILENT_PARSING_EXCEPTION", "Lcom/yandex/div/json/ParsingException;", "getSILENT_PARSING_EXCEPTION", "()Lcom/yandex/div/json/ParsingException;", "dependencyFailed", "path", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "key", PreferencesSerializer.fileExtension, "Lorg/json/JSONArray;", "index", "Lorg/json/JSONObject;", "invalidCondition", "message", "input", "invalidValue", "T", "value", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "expressionKey", "rawExpression", "wrongValue", "", "", "(Lorg/json/JSONArray;Ljava/lang/String;ILjava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "(Lorg/json/JSONArray;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)Lcom/yandex/div/json/ParsingException;", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "missingValue", "missingVariable", "expression", "variableName", "resolveFailed", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lcom/yandex/div/json/ParsingException;", "templateNotFound", "templateId", "typeMismatch", "wrongTypeValue", "trimLength", "div-data_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ParsingExceptionKt {
    private static final int MAX_TO_STRING_LENGTH = 100;

    @NotNull
    private static final ParsingException SILENT_PARSING_EXCEPTION = new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "", null, null, null, 28, null);

    @NotNull
    public static final ParsingException missingValue(@NotNull JSONObject jSONObject, @NotNull String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + str + "' is missing", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull JSONArray jSONArray, @NotNull String str, int i) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value at " + i + " position of '" + str + "' is missing", null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException missingValue(@NotNull String str, @NotNull String str2) {
        return new ParsingException(ParsingExceptionReason.MISSING_VALUE, "Value for key '" + str + "' at path '" + str2 + "' is missing", null, null, null, 28, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value for key '" + str + "' has wrong type " + obj.getClass().getName(), null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull JSONArray jSONArray, @NotNull String str, int i, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value at " + i + " position of '" + str + "' has wrong type " + obj.getClass().getName(), null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull String str) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Value at path '" + str + "' has wrong type", null, null, null, 28, null);
    }

    public static /* synthetic */ ParsingException typeMismatch$default(String str, String str2, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 8) != 0) {
            th = null;
        }
        return typeMismatch(str, str2, obj, th);
    }

    @NotNull
    public static final ParsingException typeMismatch(@NotNull String str, @NotNull String str2, @Nullable Object obj, @Nullable Throwable th) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Expression '" + str + "': '" + str2 + "' received value of wrong type: '" + obj + '\'', th, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException typeMismatch(int i, @NotNull Object obj) {
        return new ParsingException(ParsingExceptionReason.TYPE_MISMATCH, "Item builder data at " + i + " position has wrong type: " + obj.getClass().getName(), null, null, null, 28, null);
    }

    @NotNull
    public static final ParsingException templateNotFound(@NotNull JSONObject jSONObject, @NotNull String str) {
        return new ParsingException(ParsingExceptionReason.MISSING_TEMPLATE, "Template '" + str + "' is missing!", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject jSONObject, @NotNull String str, T t) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t) + "' for key '" + str + "' is not valid", null, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null), 4, null);
    }

    public static /* synthetic */ ParsingException invalidValue$default(String str, String str2, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 8) != 0) {
            th = null;
        }
        return invalidValue(str, str2, obj, th);
    }

    @NotNull
    public static final ParsingException invalidValue(@NotNull String str, @NotNull String str2, @Nullable Object obj, @Nullable Throwable th) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Field '" + str + "' with expression '" + str2 + "' received wrong value: '" + obj + '\'', th, null, null, 24, null);
    }

    private static final String trimLength(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() <= 100) {
            return valueOf;
        }
        return StringsKt.take(valueOf, 97) + "...";
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONObject jSONObject, @NotNull String str, T t, @NotNull Throwable th) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t) + "' for key '" + str + "' is not valid", th, new JsonObject(jSONObject), null, 16, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray jSONArray, @NotNull String str, int i, T t, @NotNull Throwable th) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t) + "' at " + i + " position of '" + str + "' is not valid", th, new JsonArray(jSONArray), null, 16, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull JSONArray jSONArray, @NotNull String str, int i, T t) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t) + "' at " + i + " position of '" + str + "' is not valid", null, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null), 4, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull String str, T t) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t) + "' at path '" + str + "' is not valid", null, null, null, 28, null);
    }

    public static /* synthetic */ ParsingException resolveFailed$default(String str, Object obj, Throwable th, int i, Object obj2) {
        if ((i & 4) != 0) {
            th = null;
        }
        return resolveFailed(str, obj, th);
    }

    @NotNull
    public static final <T> ParsingException resolveFailed(@NotNull String str, T t, @Nullable Throwable th) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t) + "' for key '" + str + "' could not be resolved", th, null, null, 24, null);
    }

    @NotNull
    public static final <T> ParsingException invalidValue(@NotNull String str, @NotNull String str2, T t) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, "Value '" + trimLength(t) + "' for key '" + str + "' at path '" + str2 + "' is not valid", null, null, null, 28, null);
    }

    public static /* synthetic */ ParsingException missingVariable$default(String str, String str2, String str3, Throwable th, int i, Object obj) {
        if ((i & 8) != 0) {
            th = null;
        }
        return missingVariable(str, str2, str3, th);
    }

    @NotNull
    public static final ParsingException missingVariable(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Throwable th) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "Undefined variable '" + str3 + "' at \"" + str + "\": \"" + str2 + '\"', th, null, null, 24, null);
    }

    public static /* synthetic */ ParsingException missingVariable$default(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return missingVariable(str, th);
    }

    @NotNull
    public static final ParsingException missingVariable(@NotNull String str, @Nullable Throwable th) {
        return new ParsingException(ParsingExceptionReason.MISSING_VARIABLE, "No variable could be resolved for '" + str, th, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull ParsingException parsingException) {
        Intrinsics.checkNotNull(parsingException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        return dependencyFailed(jSONObject, str, (Exception) parsingException);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value for key '" + str + "' is failed to create", exc, new JsonObject(jSONObject), JsonUtilsKt.summary$default(jSONObject, 0, 1, (Object) null));
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONArray jSONArray, @NotNull String str, int i, @NotNull ParsingException parsingException) {
        Intrinsics.checkNotNull(parsingException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        return dependencyFailed(jSONArray, str, i, (Exception) parsingException);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull JSONArray jSONArray, @NotNull String str, int i, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value at " + i + " position of '" + str + "' is failed to create", exc, new JsonArray(jSONArray), JsonUtilsKt.summary$default(jSONArray, 0, 1, (Object) null));
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull String str, @NotNull ParsingException parsingException) {
        Intrinsics.checkNotNull(parsingException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        return dependencyFailed(str, (Exception) parsingException);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull String str, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value at path '" + str + "' is failed to create", exc, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull String str, @NotNull String str2, @NotNull ParsingException parsingException) {
        Intrinsics.checkNotNull(parsingException, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
        return dependencyFailed(str, str2, (Exception) parsingException);
    }

    @NotNull
    public static final ParsingException dependencyFailed(@NotNull String str, @NotNull String str2, @NotNull Exception exc) {
        return new ParsingException(ParsingExceptionReason.DEPENDENCY_FAILED, "Value for key '" + str + "' at path '" + str2 + "' is failed to create", exc, null, null, 24, null);
    }

    @NotNull
    public static final ParsingException invalidCondition(@NotNull String str, @NotNull String str2) {
        return new ParsingException(ParsingExceptionReason.INVALID_VALUE, str, null, null, str2, 12, null);
    }

    @NotNull
    public static final ParsingException getSILENT_PARSING_EXCEPTION() {
        return SILENT_PARSING_EXCEPTION;
    }
}
