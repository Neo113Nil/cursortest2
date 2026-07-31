package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTrigger;
import com.yandex.div2.DivTriggerJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTriggerTemplate.kt */
/* loaded from: classes5.dex */
public final class DivTriggerTemplate implements JSONSerializable, JsonTemplate {
    public final Field actions;
    public final Field condition;
    public final Field mode;
    public static final Companion Companion = new Companion(null);
    private static final Expression MODE_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivTrigger.Mode.ON_CONDITION, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTriggerTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTriggerTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTriggerTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivTriggerTemplate(Field field, Field field2, Field field3) {
        this.actions = field;
        this.condition = field2;
        this.mode = field3;
    }

    public /* synthetic */ DivTriggerTemplate(ParsingEnvironment parsingEnvironment, DivTriggerTemplate divTriggerTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTriggerTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivTriggerTemplate(ParsingEnvironment parsingEnvironment, DivTriggerTemplate divTriggerTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTrigger resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTriggerJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTriggerJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTriggerJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTriggerJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTriggerTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
