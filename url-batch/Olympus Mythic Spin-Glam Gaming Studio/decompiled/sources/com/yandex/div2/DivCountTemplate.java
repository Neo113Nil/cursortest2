package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCountTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivCountTemplate.kt */
/* loaded from: classes14.dex */
public abstract class DivCountTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivCountTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivCountTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCountTemplate.Companion.invoke$default(DivCountTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivCountTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivCountTemplate.kt */
    public static final class Infinity extends DivCountTemplate {
        private final DivInfinityCountTemplate value;

        public Infinity(DivInfinityCountTemplate divInfinityCountTemplate) {
            super(null);
            this.value = divInfinityCountTemplate;
        }

        public final DivInfinityCountTemplate getValue() {
            return this.value;
        }
    }

    private DivCountTemplate() {
    }

    /* compiled from: DivCountTemplate.kt */
    public static final class Fixed extends DivCountTemplate {
        private final DivFixedCountTemplate value;

        public Fixed(DivFixedCountTemplate divFixedCountTemplate) {
            super(null);
            this.value = divFixedCountTemplate;
        }

        public final DivFixedCountTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Infinity) {
            return ((Infinity) this).getValue();
        }
        if (this instanceof Fixed) {
            return ((Fixed) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivCountJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCountJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivCount resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivCountJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCountJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Infinity) {
            return "infinity";
        }
        if (this instanceof Fixed) {
            return "fixed";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivCountTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivCountTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivCountTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivCountJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivCountJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
