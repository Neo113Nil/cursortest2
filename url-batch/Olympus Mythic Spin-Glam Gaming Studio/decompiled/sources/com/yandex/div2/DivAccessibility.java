package com.yandex.div2;

import com.facebook.share.internal.ShareConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.sglib.easymobile.androidnative.gdpr.SplitContent;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAccessibilityJsonParser;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: DivAccessibility.kt */
/* loaded from: classes10.dex */
public final class DivAccessibility implements JSONSerializable, Hashable {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression MODE_DEFAULT_VALUE;
    private static final Expression MUTE_AFTER_ACTION_DEFAULT_VALUE;
    private static final Type TYPE_DEFAULT_VALUE;
    private Integer _hash;
    public final Expression description;
    public final Expression hint;
    public final Expression isChecked;
    public final Expression mode;
    public final Expression muteAfterAction;
    public final Expression stateDescription;
    public final Type type;

    public DivAccessibility(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Type type) {
        this.description = expression;
        this.hint = expression2;
        this.isChecked = expression3;
        this.mode = expression4;
        this.muteAfterAction = expression5;
        this.stateDescription = expression6;
        this.type = type;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivAccessibility.class).hashCode();
        Expression expression = this.description;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.hint;
        int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.isChecked;
        int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0) + this.mode.hashCode() + this.muteAfterAction.hashCode();
        Expression expression4 = this.stateDescription;
        int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0) + this.type.hashCode();
        this._hash = Integer.valueOf(hashCode5);
        return hashCode5;
    }

    public final boolean equals(DivAccessibility divAccessibility, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divAccessibility == null) {
            return false;
        }
        Expression expression = this.description;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = divAccessibility.description;
        if (!Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression3 = this.hint;
        String str2 = expression3 != null ? (String) expression3.evaluate(expressionResolver) : null;
        Expression expression4 = divAccessibility.hint;
        if (!Intrinsics.areEqual(str2, expression4 != null ? (String) expression4.evaluate(expressionResolver2) : null)) {
            return false;
        }
        Expression expression5 = this.isChecked;
        Boolean bool = expression5 != null ? (Boolean) expression5.evaluate(expressionResolver) : null;
        Expression expression6 = divAccessibility.isChecked;
        if (!Intrinsics.areEqual(bool, expression6 != null ? (Boolean) expression6.evaluate(expressionResolver2) : null) || this.mode.evaluate(expressionResolver) != divAccessibility.mode.evaluate(expressionResolver2) || ((Boolean) this.muteAfterAction.evaluate(expressionResolver)).booleanValue() != ((Boolean) divAccessibility.muteAfterAction.evaluate(expressionResolver2)).booleanValue()) {
            return false;
        }
        Expression expression7 = this.stateDescription;
        String str3 = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
        Expression expression8 = divAccessibility.stateDescription;
        return Intrinsics.areEqual(str3, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null) && this.type == divAccessibility.type;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAccessibilityJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAccessibilityJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAccessibility.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivAccessibility fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivAccessibilityJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAccessibilityJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Mode.DEFAULT, null, 2, null);
        MUTE_AFTER_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        TYPE_DEFAULT_VALUE = Type.AUTO;
        CREATOR = new Function2() { // from class: com.yandex.div2.DivAccessibility$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivAccessibility invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivAccessibility.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };
    }

    /* compiled from: DivAccessibility.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/yandex/div2/DivAccessibility$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "NONE", "BUTTON", ShareConstants.IMAGE_URL, "TEXT", "EDIT_TEXT", "HEADER", "TAB_BAR", "LIST", "SELECT", "CHECKBOX", "RADIO", "AUTO", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Type {
        NONE("none"),
        BUTTON(SplitContent.BUTTON_VALUE),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER(POBCTAOverlayData.KEY_CTA_HEADER),
        TAB_BAR("tab_bar"),
        LIST("list"),
        SELECT("select"),
        CHECKBOX("checkbox"),
        RADIO("radio"),
        AUTO("auto");


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivAccessibility$Type$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivAccessibility.Type type) {
                return DivAccessibility.Type.INSTANCE.toString(type);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivAccessibility$Type$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivAccessibility.Type invoke(@NotNull String str) {
                return DivAccessibility.Type.INSTANCE.fromString(str);
            }
        };

        Type(String str) {
            this.value = str;
        }

        /* compiled from: DivAccessibility.kt */
        /* renamed from: com.yandex.div2.DivAccessibility$Type$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Type type) {
                return type.value;
            }

            public final Type fromString(String str) {
                Type type = Type.NONE;
                if (Intrinsics.areEqual(str, type.value)) {
                    return type;
                }
                Type type2 = Type.BUTTON;
                if (Intrinsics.areEqual(str, type2.value)) {
                    return type2;
                }
                Type type3 = Type.IMAGE;
                if (Intrinsics.areEqual(str, type3.value)) {
                    return type3;
                }
                Type type4 = Type.TEXT;
                if (Intrinsics.areEqual(str, type4.value)) {
                    return type4;
                }
                Type type5 = Type.EDIT_TEXT;
                if (Intrinsics.areEqual(str, type5.value)) {
                    return type5;
                }
                Type type6 = Type.HEADER;
                if (Intrinsics.areEqual(str, type6.value)) {
                    return type6;
                }
                Type type7 = Type.TAB_BAR;
                if (Intrinsics.areEqual(str, type7.value)) {
                    return type7;
                }
                Type type8 = Type.LIST;
                if (Intrinsics.areEqual(str, type8.value)) {
                    return type8;
                }
                Type type9 = Type.SELECT;
                if (Intrinsics.areEqual(str, type9.value)) {
                    return type9;
                }
                Type type10 = Type.CHECKBOX;
                if (Intrinsics.areEqual(str, type10.value)) {
                    return type10;
                }
                Type type11 = Type.RADIO;
                if (Intrinsics.areEqual(str, type11.value)) {
                    return type11;
                }
                Type type12 = Type.AUTO;
                if (Intrinsics.areEqual(str, type12.value)) {
                    return type12;
                }
                return null;
            }
        }
    }

    /* compiled from: DivAccessibility.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/yandex/div2/DivAccessibility$Mode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "DEFAULT", "MERGE", "EXCLUDE", "Converter", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Mode {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE(POBProfileInfo.COUNTRY_FILTERING_BLOCK_MODE);


        @NotNull
        private final String value;

        /* renamed from: Converter, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        public static final Function1 TO_STRING = new Function1() { // from class: com.yandex.div2.DivAccessibility$Mode$Converter$TO_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull DivAccessibility.Mode mode) {
                return DivAccessibility.Mode.INSTANCE.toString(mode);
            }
        };

        @NotNull
        public static final Function1 FROM_STRING = new Function1() { // from class: com.yandex.div2.DivAccessibility$Mode$Converter$FROM_STRING$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final DivAccessibility.Mode invoke(@NotNull String str) {
                return DivAccessibility.Mode.INSTANCE.fromString(str);
            }
        };

        Mode(String str) {
            this.value = str;
        }

        /* compiled from: DivAccessibility.kt */
        /* renamed from: com.yandex.div2.DivAccessibility$Mode$Converter, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final String toString(Mode mode) {
                return mode.value;
            }

            public final Mode fromString(String str) {
                Mode mode = Mode.DEFAULT;
                if (Intrinsics.areEqual(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.MERGE;
                if (Intrinsics.areEqual(str, mode2.value)) {
                    return mode2;
                }
                Mode mode3 = Mode.EXCLUDE;
                if (Intrinsics.areEqual(str, mode3.value)) {
                    return mode3;
                }
                return null;
            }
        }
    }
}
