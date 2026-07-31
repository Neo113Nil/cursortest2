package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputValidatorBaseJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputValidatorBase.kt */
/* loaded from: classes12.dex */
public final class DivInputValidatorBase implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression allowEmpty;
    public final Expression labelId;
    public final String variable;
    public static final Companion Companion = new Companion(null);
    private static final Expression ALLOW_EMPTY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputValidatorBase$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputValidatorBase invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidatorBase.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivInputValidatorBase(Expression expression, Expression expression2, String str) {
        this.allowEmpty = expression;
        this.labelId = expression2;
        this.variable = str;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivInputValidatorBase.class).hashCode() + this.allowEmpty.hashCode();
        Expression expression = this.labelId;
        int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
        String str = this.variable;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this._hash = Integer.valueOf(hashCode3);
        return hashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputValidatorBaseJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorBaseJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivInputValidatorBase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivInputValidatorBase fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivInputValidatorBaseJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputValidatorBaseJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
