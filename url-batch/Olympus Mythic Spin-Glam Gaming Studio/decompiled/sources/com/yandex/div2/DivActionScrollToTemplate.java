package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionScrollToJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionScrollToTemplate.kt */
/* loaded from: classes3.dex */
public final class DivActionScrollToTemplate implements JSONSerializable, JsonTemplate {
    public final Field animated;
    public final Field destination;
    public final Field id;
    public static final Companion Companion = new Companion(null);
    private static final Expression ANIMATED_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionScrollToTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionScrollToTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionScrollToTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionScrollToTemplate(Field field, Field field2, Field field3) {
        this.animated = field;
        this.destination = field2;
        this.id = field3;
    }

    public /* synthetic */ DivActionScrollToTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollToTemplate divActionScrollToTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionScrollToTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionScrollToTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollToTemplate divActionScrollToTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionScrollTo resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionScrollToJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollToJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionScrollToJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionScrollToJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionScrollToTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
