package io.bidmachine.rendering.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.util.UtilsKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/bidmachine/rendering/utils/PrivacySheetParamsParser;", "", "<init>", "()V", "", PreferencesSerializer.fileExtension, "Lio/bidmachine/rendering/model/PrivacySheetParams;", "parseJson", "(Ljava/lang/String;)Lio/bidmachine/rendering/model/PrivacySheetParams;", "typeName", "Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;", "a", "(Ljava/lang/String;)Lio/bidmachine/rendering/model/PrivacySheetParams$ActionType;", "base64Png", "Landroid/graphics/Bitmap;", "b", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class PrivacySheetParamsParser {

    @NotNull
    public static final PrivacySheetParamsParser INSTANCE = new PrivacySheetParamsParser();

    private PrivacySheetParamsParser() {
    }

    private final PrivacySheetParams.ActionType a(String typeName) {
        for (PrivacySheetParams.ActionType actionType : PrivacySheetParams.ActionType.values()) {
            if (StringsKt.equals(actionType.name(), typeName, true)) {
                return actionType;
            }
        }
        return null;
    }

    private final Bitmap b(String base64Png) {
        Object m8023constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bytes = base64Png.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] decodeBase64$default = UtilsKt.decodeBase64$default(bytes, 0, 1, (Object) null);
            m8023constructorimpl = Result.m8023constructorimpl(decodeBase64$default == null ? null : BitmapFactory.decodeByteArray(decodeBase64$default, 0, decodeBase64$default.length));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (Bitmap) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    @Nullable
    public static final PrivacySheetParams parseJson(@NotNull String json) {
        Object m8023constructorimpl;
        Intrinsics.checkNotNullParameter(json, "json");
        PrivacySheetParamsParser privacySheetParamsParser = INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(json);
            String optString = jSONObject.optString("title");
            Intrinsics.checkNotNullExpressionValue(optString, "rootObject.optString(\"title\")");
            String optString2 = jSONObject.optString("subtitle");
            Intrinsics.checkNotNullExpressionValue(optString2, "rootObject.optString(\"subtitle\")");
            String optString3 = jSONObject.optString("footer_title");
            Intrinsics.checkNotNullExpressionValue(optString3, "rootObject.optString(\"footer_title\")");
            String optString4 = jSONObject.optString("footer_text");
            Intrinsics.checkNotNullExpressionValue(optString4, "rootObject.optString(\"footer_text\")");
            JSONArray optJSONArray = jSONObject.optJSONArray("actions");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            } else {
                Intrinsics.checkNotNullExpressionValue(optJSONArray, "rootObject.optJSONArray(\"actions\") ?: JSONArray()");
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "actionsArray.getJSONObject(i)");
                String optString5 = jSONObject2.optString("type");
                Intrinsics.checkNotNullExpressionValue(optString5, "actionObject.optString(\"type\")");
                PrivacySheetParams.ActionType a = privacySheetParamsParser.a(optString5);
                if (a != null) {
                    String optString6 = jSONObject2.optString("title");
                    Intrinsics.checkNotNullExpressionValue(optString6, "actionObject.optString(\"title\")");
                    String optString7 = jSONObject2.optString("data");
                    Intrinsics.checkNotNullExpressionValue(optString7, "actionObject.optString(\"data\")");
                    String it = jSONObject2.optString("icon");
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    if (StringsKt.isBlank(it)) {
                        it = null;
                    }
                    arrayList.add(new PrivacySheetParams.Action(a, optString6, optString7, it != null ? privacySheetParamsParser.b(it) : null));
                }
            }
            m8023constructorimpl = Result.m8023constructorimpl(new PrivacySheetParams(optString, optString2, arrayList, optString3, optString4));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (PrivacySheetParams) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }
}
