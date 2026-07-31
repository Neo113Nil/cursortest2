package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div2.PhoneMasks;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: PhoneInputMask.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\f\u001a\u00020\u0001*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"COUNTRY_CODE_END_MARKER", "", "DEFAULT_DECODING_MASK_KEY", "", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskKey;", "getDEFAULT_DECODING_MASK_KEY", "()Ljava/util/List;", "DEFAULT_MASK_DATA", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "getDEFAULT_MASK_DATA", "()Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "UNIVERSAL_MASK", "phoneMaskPattern", "getPhoneMaskPattern", "(Ljava/lang/String;)Ljava/lang/String;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PhoneInputMaskKt {

    @NotNull
    private static final String COUNTRY_CODE_END_MARKER = "*";

    @NotNull
    private static final List<BaseInputMask.MaskKey> DEFAULT_DECODING_MASK_KEY;

    @NotNull
    private static final BaseInputMask.MaskData DEFAULT_MASK_DATA;

    @NotNull
    private static final String UNIVERSAL_MASK = "000000000000000";

    @NotNull
    public static final List<BaseInputMask.MaskKey> getDEFAULT_DECODING_MASK_KEY() {
        return DEFAULT_DECODING_MASK_KEY;
    }

    static {
        List<BaseInputMask.MaskKey> listOf = CollectionsKt.listOf(new BaseInputMask.MaskKey('0', "\\d", '_'));
        DEFAULT_DECODING_MASK_KEY = listOf;
        DEFAULT_MASK_DATA = new BaseInputMask.MaskData(getPhoneMaskPattern(""), listOf, false);
    }

    @NotNull
    public static final BaseInputMask.MaskData getDEFAULT_MASK_DATA() {
        return DEFAULT_MASK_DATA;
    }

    @NotNull
    public static final String getPhoneMaskPattern(@NotNull String str) {
        if (StringsKt.isBlank(str)) {
            return UNIVERSAL_MASK;
        }
        JSONObject jSONObject = PhoneMasks.VALUE_DEFAULT_VALUE;
        int i = 0;
        while (true) {
            if (jSONObject.has("value")) {
                break;
            }
            String str2 = "*";
            if (i >= str.length()) {
                Object obj = jSONObject.get("*");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONObject = (JSONObject) obj;
                break;
            }
            int i2 = i + 1;
            String valueOf = String.valueOf(str.charAt(i));
            if (jSONObject.has(valueOf)) {
                str2 = valueOf;
            }
            Object obj2 = jSONObject.get(str2);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj2;
            i = i2;
        }
        return jSONObject.getString("value") + "00";
    }
}
