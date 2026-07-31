package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivDrawableTemplate;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDrawableTemplate.kt */
/* loaded from: classes12.dex */
public abstract class DivDrawableTemplate implements JSONSerializable, JsonTemplate {
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDrawableTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivDrawableTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivDrawableTemplate.Companion.invoke$default(DivDrawableTemplate.Companion, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    public /* synthetic */ DivDrawableTemplate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: DivDrawableTemplate.kt */
    public static final class Shape extends DivDrawableTemplate {
        private final DivShapeDrawableTemplate value;

        public Shape(DivShapeDrawableTemplate divShapeDrawableTemplate) {
            super(null);
            this.value = divShapeDrawableTemplate;
        }

        public final DivShapeDrawableTemplate getValue() {
            return this.value;
        }
    }

    private DivDrawableTemplate() {
    }

    public final Object value() {
        if (this instanceof Shape) {
            return ((Shape) this).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDrawableJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDrawableJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivDrawable resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivDrawableJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDrawableJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    public final String getType() {
        if (this instanceof Shape) {
            return "shape_drawable";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: DivDrawableTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ DivDrawableTemplate invoke$default(Companion companion, ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.invoke(parsingEnvironment, z, jSONObject);
        }

        public final DivDrawableTemplate invoke(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
            return ((DivDrawableJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDrawableJsonTemplateParser().getValue()).deserialize((ParsingContext) parsingEnvironment, jSONObject);
        }
    }
}
