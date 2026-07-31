package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionSetStateJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionSetStateTemplate.kt */
/* loaded from: classes14.dex */
public final class DivActionSetStateTemplate implements JSONSerializable, JsonTemplate {
    public final Field stateId;
    public final Field temporary;
    public static final Companion Companion = new Companion(null);
    private static final Expression TEMPORARY_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionSetStateTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionSetStateTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionSetStateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionSetStateTemplate(Field field, Field field2) {
        this.stateId = field;
        this.temporary = field2;
    }

    public /* synthetic */ DivActionSetStateTemplate(ParsingEnvironment parsingEnvironment, DivActionSetStateTemplate divActionSetStateTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionSetStateTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionSetStateTemplate(ParsingEnvironment parsingEnvironment, DivActionSetStateTemplate divActionSetStateTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionSetState resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionSetStateJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetStateJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionSetStateJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionSetStateJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionSetStateTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
