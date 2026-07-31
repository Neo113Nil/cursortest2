package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivInputMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivInputMaskTemplate.kt */
/* loaded from: classes13.dex */
public abstract class DivInputMaskTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivInputMaskTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivInputMaskTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputMaskTemplate.Companion.invoke$default(DivInputMaskTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivInputMaskTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivInputMaskTemplate.kt */
    public static final class FixedLength extends DivInputMaskTemplate {
        private final DivFixedLengthInputMaskTemplate value;

        public FixedLength(DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate) {
            super(null);
            this.value = divFixedLengthInputMaskTemplate;
        }

        public final DivFixedLengthInputMaskTemplate getValue() {
            return this.value;
        }
    }

    private DivInputMaskTemplate() {
    }

    /* compiled from: DivInputMaskTemplate.kt */
    public static final class Currency extends DivInputMaskTemplate {
        private final DivCurrencyInputMaskTemplate value;

        public Currency(DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate) {
            super(null);
            this.value = divCurrencyInputMaskTemplate;
        }

        public final DivCurrencyInputMaskTemplate getValue() {
            return this.value;
        }
    }

    /* compiled from: DivInputMaskTemplate.kt */
    public static final class Phone extends DivInputMaskTemplate {
        private final DivPhoneInputMaskTemplate value;

        public Phone(DivPhoneInputMaskTemplate divPhoneInputMaskTemplate) {
            super(null);
            this.value = divPhoneInputMaskTemplate;
        }

        public final DivPhoneInputMaskTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof FixedLength) {
            return ((FixedLength) this).getValue();
        }
        if (this instanceof Currency) {
            return ((Currency) this).getValue();
        }
        if (this instanceof Phone) {
            return ((Phone) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivInputMaskJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputMaskJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivInputMask resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivInputMaskJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputMaskJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof FixedLength) {
            return "fixed_length";
        }
        if (this instanceof Currency) {
            return "currency";
        }
        if (this instanceof Phone) {
            return "phone";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivInputMaskTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivInputMaskTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivInputMaskTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivInputMaskJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivInputMaskJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
