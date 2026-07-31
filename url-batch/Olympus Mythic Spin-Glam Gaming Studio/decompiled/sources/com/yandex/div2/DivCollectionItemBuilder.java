package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivCollectionItemBuilderJsonParser;
import com.yandex.div2.DivCollectionItemBuilderPrototypeJsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCollectionItemBuilder.kt */
/* loaded from: classes9.dex */
public final class DivCollectionItemBuilder implements JSONSerializable, Hashable {
    private Integer _hash;
    public final Expression data;
    public final String dataElementName;
    public final List prototypes;
    public static final Companion Companion = new Companion(null);
    private static final String DATA_ELEMENT_NAME_DEFAULT_VALUE = "it";
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCollectionItemBuilder$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCollectionItemBuilder invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCollectionItemBuilder.Companion.fromJson(parsingEnvironment, jSONObject);
        }
    };

    public DivCollectionItemBuilder(Expression expression, String str, List list) {
        this.data = expression;
        this.dataElementName = str;
        this.prototypes = list;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this._hash;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.getOrCreateKotlinClass(DivCollectionItemBuilder.class).hashCode() + this.data.hashCode() + this.dataElementName.hashCode();
        Iterator it = this.prototypes.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Prototype) it.next()).hash();
        }
        int i2 = hashCode + i;
        this._hash = Integer.valueOf(i2);
        return i2;
    }

    public final boolean equals(DivCollectionItemBuilder divCollectionItemBuilder, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (divCollectionItemBuilder == null || !Intrinsics.areEqual(this.data.evaluate(expressionResolver), divCollectionItemBuilder.data.evaluate(expressionResolver2)) || !Intrinsics.areEqual(this.dataElementName, divCollectionItemBuilder.dataElementName)) {
            return false;
        }
        List list = this.prototypes;
        List list2 = divCollectionItemBuilder.prototypes;
        if (list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((Prototype) obj).equals((Prototype) list2.get(i), expressionResolver, expressionResolver2)) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCollectionItemBuilderJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCollectionItemBuilderJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivCollectionItemBuilder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DivCollectionItemBuilder fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivCollectionItemBuilderJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCollectionItemBuilderJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }

    /* compiled from: DivCollectionItemBuilder.kt */
    public static final class Prototype implements JSONSerializable, Hashable {
        private Integer _hash;
        public final Div div;
        public final Expression id;
        public final Expression selector;
        public static final Companion Companion = new Companion(null);
        private static final Expression SELECTOR_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCollectionItemBuilder$Prototype$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivCollectionItemBuilder.Prototype invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivCollectionItemBuilder.Prototype.Companion.fromJson(parsingEnvironment, jSONObject);
            }
        };

        public Prototype(Div div, Expression expression, Expression expression2) {
            this.div = div;
            this.id = expression;
            this.selector = expression2;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this._hash;
            if (num != null) {
                return num.intValue();
            }
            int hashCode = Reflection.getOrCreateKotlinClass(Prototype.class).hashCode() + this.div.hash();
            Expression expression = this.id;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0) + this.selector.hashCode();
            this._hash = Integer.valueOf(hashCode2);
            return hashCode2;
        }

        public final boolean equals(Prototype prototype, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (prototype == null || !this.div.equals(prototype.div, expressionResolver, expressionResolver2)) {
                return false;
            }
            Expression expression = this.id;
            String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
            Expression expression2 = prototype.id;
            return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && ((Boolean) this.selector.evaluate(expressionResolver)).booleanValue() == ((Boolean) prototype.selector.evaluate(expressionResolver2)).booleanValue();
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivCollectionItemBuilderPrototypeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCollectionItemBuilderPrototypeJsonEntityParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivCollectionItemBuilder.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Prototype fromJson(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((DivCollectionItemBuilderPrototypeJsonParser.EntityParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCollectionItemBuilderPrototypeJsonEntityParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
            }
        }
    }
}
