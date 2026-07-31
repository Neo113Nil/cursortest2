package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivShapeTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivShapeTemplate.kt */
/* loaded from: classes9.dex */
public abstract class DivShapeTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivShapeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivShapeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivShapeTemplate.Companion.invoke$default(DivShapeTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivShapeTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivShapeTemplate.kt */
    public static final class RoundedRectangle extends DivShapeTemplate {
        private final DivRoundedRectangleShapeTemplate value;

        public RoundedRectangle(DivRoundedRectangleShapeTemplate divRoundedRectangleShapeTemplate) {
            super(null);
            this.value = divRoundedRectangleShapeTemplate;
        }

        public final DivRoundedRectangleShapeTemplate getValue() {
            return this.value;
        }
    }

    private DivShapeTemplate() {
    }

    /* compiled from: DivShapeTemplate.kt */
    public static final class Circle extends DivShapeTemplate {
        private final DivCircleShapeTemplate value;

        public Circle(DivCircleShapeTemplate divCircleShapeTemplate) {
            super(null);
            this.value = divCircleShapeTemplate;
        }

        public final DivCircleShapeTemplate getValue() {
            return this.value;
        }
    }

    public final Object value() {
        if (this instanceof RoundedRectangle) {
            return ((RoundedRectangle) this).getValue();
        }
        if (this instanceof Circle) {
            return ((Circle) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivShapeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivShape resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivShapeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof RoundedRectangle) {
            return "rounded_rectangle";
        }
        if (this instanceof Circle) {
            return "circle";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivShapeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivShapeTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivShapeTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivShapeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShapeJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
