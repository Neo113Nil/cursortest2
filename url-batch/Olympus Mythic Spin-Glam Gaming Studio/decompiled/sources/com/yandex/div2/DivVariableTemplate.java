package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivVariableTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivVariableTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivVariableTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivVariableTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivVariableTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivVariableTemplate.Companion.invoke$default(DivVariableTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivVariableTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Str extends DivVariableTemplate {
        private final StrVariableTemplate value;

        public Str(StrVariableTemplate strVariableTemplate) {
            super(null);
            this.value = strVariableTemplate;
        }

        public final StrVariableTemplate getValue() {
            return this.value;
        }
    }

    private DivVariableTemplate() {
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Number extends DivVariableTemplate {
        private final NumberVariableTemplate value;

        public Number(NumberVariableTemplate numberVariableTemplate) {
            super(null);
            this.value = numberVariableTemplate;
        }

        public final NumberVariableTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Integer extends DivVariableTemplate {
        private final IntegerVariableTemplate value;

        public Integer(IntegerVariableTemplate integerVariableTemplate) {
            super(null);
            this.value = integerVariableTemplate;
        }

        public final IntegerVariableTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Bool extends DivVariableTemplate {
        private final BoolVariableTemplate value;

        public Bool(BoolVariableTemplate boolVariableTemplate) {
            super(null);
            this.value = boolVariableTemplate;
        }

        public final BoolVariableTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Color extends DivVariableTemplate {
        private final ColorVariableTemplate value;

        public Color(ColorVariableTemplate colorVariableTemplate) {
            super(null);
            this.value = colorVariableTemplate;
        }

        public final ColorVariableTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Url extends DivVariableTemplate {
        private final UrlVariableTemplate value;

        public Url(UrlVariableTemplate urlVariableTemplate) {
            super(null);
            this.value = urlVariableTemplate;
        }

        public final UrlVariableTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Dict extends DivVariableTemplate {
        private final DictVariableTemplate value;

        public Dict(DictVariableTemplate dictVariableTemplate) {
            super(null);
            this.value = dictVariableTemplate;
        }

        public final DictVariableTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Array extends DivVariableTemplate {
        private final ArrayVariableTemplate value;

        public Array(ArrayVariableTemplate arrayVariableTemplate) {
            super(null);
            this.value = arrayVariableTemplate;
        }

        public final ArrayVariableTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Property extends DivVariableTemplate {
        private final PropertyVariableTemplate value;

        public Property(PropertyVariableTemplate propertyVariableTemplate) {
            super(null);
            this.value = propertyVariableTemplate;
        }

        public final PropertyVariableTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Str) {
            return ((Str) this).getValue();
        }
        if (this instanceof Number) {
            return ((Number) this).getValue();
        }
        if (this instanceof Integer) {
            return ((Integer) this).getValue();
        }
        if (this instanceof Bool) {
            return ((Bool) this).getValue();
        }
        if (this instanceof Color) {
            return ((Color) this).getValue();
        }
        if (this instanceof Url) {
            return ((Url) this).getValue();
        }
        if (this instanceof Dict) {
            return ((Dict) this).getValue();
        }
        if (this instanceof Array) {
            return ((Array) this).getValue();
        }
        if (this instanceof Property) {
            return ((Property) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivVariableJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVariableJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivVariable resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivVariableJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVariableJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Str) {
            return "string";
        }
        if (this instanceof Number) {
            return "number";
        }
        if (this instanceof Integer) {
            return "integer";
        }
        if (this instanceof Bool) {
            return "boolean";
        }
        if (this instanceof Color) {
            return "color";
        }
        if (this instanceof Url) {
            return "url";
        }
        if (this instanceof Dict) {
            return "dict";
        }
        if (this instanceof Array) {
            return "array";
        }
        if (this instanceof Property) {
            return "property";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivVariableTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivVariableTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivVariableTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivVariableJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivVariableJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
