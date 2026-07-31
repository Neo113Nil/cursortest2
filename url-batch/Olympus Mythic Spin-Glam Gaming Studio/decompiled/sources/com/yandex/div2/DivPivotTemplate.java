package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPivotTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPivotTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivPivotTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivPivotTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivPivotTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPivotTemplate.Companion.invoke$default(DivPivotTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivPivotTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivPivotTemplate.kt */
    public static final class Fixed extends DivPivotTemplate {
        private final DivPivotFixedTemplate value;

        public Fixed(DivPivotFixedTemplate divPivotFixedTemplate) {
            super(null);
            this.value = divPivotFixedTemplate;
        }

        public final DivPivotFixedTemplate getValue() {
            return this.value;
        }
    }

    private DivPivotTemplate() {
    }

    /* compiled from: DivPivotTemplate.kt */
    public static final class Percentage extends DivPivotTemplate {
        private final DivPivotPercentageTemplate value;

        public Percentage(DivPivotPercentageTemplate divPivotPercentageTemplate) {
            super(null);
            this.value = divPivotPercentageTemplate;
        }

        public final DivPivotPercentageTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof Fixed) {
            return ((Fixed) this).getValue();
        }
        if (this instanceof Percentage) {
            return ((Percentage) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPivotJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPivot resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPivotJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Fixed) {
            return "pivot-fixed";
        }
        if (this instanceof Percentage) {
            return "pivot-percentage";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivPivotTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivPivotTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivPivotTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivPivotJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPivotJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
