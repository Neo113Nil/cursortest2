package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFixedLengthInputMask;
import com.yandex.div2.DivFixedLengthInputMaskJsonParser;
import com.yandex.div2.DivFixedLengthInputMaskPatternElementJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFixedLengthInputMask.kt */
/* loaded from: classes9.dex */
public final class DivFixedLengthInputMask implements JSONSerializable, Hashable, DivInputMaskBase {
    private Integer _hash;
    public final Expression alwaysVisible;
    public final Expression pattern;
    public final List patternElements;
    private final String rawTextVariable;
    public static final Companion Companion = new Companion(null);
    private static final Expression ALWAYS_VISIBLE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFixedLengthInputMask$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivFixedLengthInputMask invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFixedLengthInputMask.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivFixedLengthInputMask(Expression expression, Expression expression2, List list, String str) {
        this.alwaysVisible = expression;
        this.pattern = expression2;
        this.patternElements = list;
        this.rawTextVariable = str;
    }

    @Override // com.yandex.div2.DivInputMaskBase
    public String getRawTextVariable() {
        return this.rawTextVariable;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivFixedLengthInputMask.class).hashCode() + this.alwaysVisible.hashCode() + this.pattern.hashCode();
        Iterator it = this.patternElements.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((PatternElement) it.next()).hash();
        }
        int hashCode2 = hashCode + i + getRawTextVariable().hashCode();
        this._hash = Integer.valueOf(hashCode2);
        return hashCode2;
    }

    public final boolean equals(DivFixedLengthInputMask divFixedLengthInputMask, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divFixedLengthInputMask == null || ((Boolean) this.alwaysVisible.evaluate(expressionResolver)).booleanValue() != ((Boolean) divFixedLengthInputMask.alwaysVisible.evaluate(expressionResolver2)).booleanValue() || !Intrinsics.areEqual(this.pattern.evaluate(expressionResolver), divFixedLengthInputMask.pattern.evaluate(expressionResolver2))) {
            return false;
        }
        List list = this.patternElements;
        List list2 = divFixedLengthInputMask.patternElements;
        if (list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((PatternElement) obj).equals((PatternElement) list2.get(i), expressionResolver, expressionResolver2)) {
                return false;
            }
            i = i2;
        }
        return Intrinsics.areEqual(getRawTextVariable(), divFixedLengthInputMask.getRawTextVariable());
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFixedLengthInputMaskJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedLengthInputMaskJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFixedLengthInputMask.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivFixedLengthInputMask fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivFixedLengthInputMaskJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedLengthInputMaskJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivFixedLengthInputMask.kt */
    public static final class PatternElement implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Expression key;
        public final Expression placeholder;
        public final Expression regex;
        public static final Companion Companion = new Companion(null);
        private static final Expression PLACEHOLDER_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, "_", null, 2, null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivFixedLengthInputMask$PatternElement$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivFixedLengthInputMask.PatternElement invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivFixedLengthInputMask.PatternElement.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public PatternElement(Expression expression, Expression expression2, Expression expression3) {
            this.key = expression;
            this.placeholder = expression2;
            this.regex = expression3;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(PatternElement.class).hashCode() + this.key.hashCode() + this.placeholder.hashCode();
            Expression expression = this.regex;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            this._hash = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        public final boolean equals(PatternElement patternElement, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (patternElement == null || !Intrinsics.areEqual(this.key.evaluate(expressionResolver), patternElement.key.evaluate(expressionResolver2)) || !Intrinsics.areEqual(this.placeholder.evaluate(expressionResolver), patternElement.placeholder.evaluate(expressionResolver2))) {
                return false;
            }
            Expression expression = this.regex;
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            Expression expression2 = patternElement.regex;
            return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivFixedLengthInputMaskPatternElementJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedLengthInputMaskPatternElementJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivFixedLengthInputMask.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final PatternElement fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivFixedLengthInputMaskPatternElementJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFixedLengthInputMaskPatternElementJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
