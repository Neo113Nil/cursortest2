package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTimerJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTimerTemplate.kt */
/* loaded from: classes10.dex */
public final class DivTimerTemplate implements JSONSerializable, JsonTemplate {
    public final Field duration;
    public final Field endActions;
    public final Field id;
    public final Field tickActions;
    public final Field tickInterval;
    public final Field valueVariable;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, 0L, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivTimerTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivTimerTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivTimerTemplate(parsingEnvironment, (DivTimerTemplate) null, false, jSONObject, 6, (DefaultConstructorMarker) null);
        }
    };

    public DivTimerTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6) {
        this.duration = field;
        this.endActions = field2;
        this.id = field3;
        this.tickActions = field4;
        this.tickInterval = field5;
        this.valueVariable = field6;
    }

    public /* synthetic */ DivTimerTemplate(ParsingEnvironment parsingEnvironment, DivTimerTemplate divTimerTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTimerTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivTimerTemplate(ParsingEnvironment parsingEnvironment, DivTimerTemplate divTimerTemplate, boolean z, JSONObject jSONObject) {
        this(r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTimer resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTimerJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTimerJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTimerJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTimerJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTimerTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
