package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivNeighbourPageSizeTemplate.kt */
/* loaded from: classes10.dex */
public final class DivNeighbourPageSizeTemplate implements JSONSerializable, JsonTemplate {
    public final Field neighbourPageWidth;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivNeighbourPageSizeTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivNeighbourPageSizeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivNeighbourPageSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivNeighbourPageSizeTemplate(Field field) {
        this.neighbourPageWidth = field;
    }

    public /* synthetic */ DivNeighbourPageSizeTemplate(ParsingEnvironment parsingEnvironment, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divNeighbourPageSizeTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivNeighbourPageSizeTemplate(ParsingEnvironment parsingEnvironment, DivNeighbourPageSizeTemplate divNeighbourPageSizeTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivNeighbourPageSize resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivNeighbourPageSizeJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNeighbourPageSizeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivNeighbourPageSizeJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNeighbourPageSizeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivNeighbourPageSizeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
