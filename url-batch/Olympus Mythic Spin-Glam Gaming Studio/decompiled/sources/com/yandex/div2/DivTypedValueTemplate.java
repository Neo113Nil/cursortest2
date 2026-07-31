package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTypedValueTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTypedValueTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivTypedValueTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTypedValueTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTypedValueTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTypedValueTemplate.Companion.invoke$default(DivTypedValueTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivTypedValueTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Str extends DivTypedValueTemplate {
        private final StrValueTemplate value;

        public Str(StrValueTemplate strValueTemplate) {
            super(null);
            this.value = strValueTemplate;
        }

        public final StrValueTemplate getValue() {
            return this.value;
        }
    }

    private DivTypedValueTemplate() {
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Integer extends DivTypedValueTemplate {
        private final IntegerValueTemplate value;

        public Integer(IntegerValueTemplate integerValueTemplate) {
            super(null);
            this.value = integerValueTemplate;
        }

        public final IntegerValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Number extends DivTypedValueTemplate {
        private final NumberValueTemplate value;

        public Number(NumberValueTemplate numberValueTemplate) {
            super(null);
            this.value = numberValueTemplate;
        }

        public final NumberValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Color extends DivTypedValueTemplate {
        private final ColorValueTemplate value;

        public Color(ColorValueTemplate colorValueTemplate) {
            super(null);
            this.value = colorValueTemplate;
        }

        public final ColorValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Bool extends DivTypedValueTemplate {
        private final BoolValueTemplate value;

        public Bool(BoolValueTemplate boolValueTemplate) {
            super(null);
            this.value = boolValueTemplate;
        }

        public final BoolValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Url extends DivTypedValueTemplate {
        private final UrlValueTemplate value;

        public Url(UrlValueTemplate urlValueTemplate) {
            super(null);
            this.value = urlValueTemplate;
        }

        public final UrlValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Dict extends DivTypedValueTemplate {
        private final DictValueTemplate value;

        public Dict(DictValueTemplate dictValueTemplate) {
            super(null);
            this.value = dictValueTemplate;
        }

        public final DictValueTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Array extends DivTypedValueTemplate {
        private final ArrayValueTemplate value;

        public Array(ArrayValueTemplate arrayValueTemplate) {
            super(null);
            this.value = arrayValueTemplate;
        }

        public final ArrayValueTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Str) {
            return ((Str) this).getValue();
        }
        if (this instanceof Integer) {
            return ((Integer) this).getValue();
        }
        if (this instanceof Number) {
            return ((Number) this).getValue();
        }
        if (this instanceof Color) {
            return ((Color) this).getValue();
        }
        if (this instanceof Bool) {
            return ((Bool) this).getValue();
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
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTypedValueJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTypedValueJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTypedValue resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTypedValueJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTypedValueJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Str) {
            return "string";
        }
        if (this instanceof Integer) {
            return "integer";
        }
        if (this instanceof Number) {
            return "number";
        }
        if (this instanceof Color) {
            return "color";
        }
        if (this instanceof Bool) {
            return "boolean";
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
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivTypedValueTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivTypedValueTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivTypedValueTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivTypedValueJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTypedValueJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
