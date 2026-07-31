package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTextRangeMaskBaseJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTextRangeMaskBase.kt */
/* loaded from: classes5.dex */
public final class DivTextRangeMaskBase implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression isEnabled;
    public static final Companion Companion = new Companion(null);
    private static final Expression IS_ENABLED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTextRangeMaskBase$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTextRangeMaskBase invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeMaskBase.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivTextRangeMaskBase(Expression expression) {
        this.isEnabled = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivTextRangeMaskBase.class).hashCode() + this.isEnabled.hashCode();
        this._hash = Integer.valueOf(hashCode);
        return hashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTextRangeMaskBaseJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskBaseJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTextRangeMaskBase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivTextRangeMaskBase fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivTextRangeMaskBaseJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTextRangeMaskBaseJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
