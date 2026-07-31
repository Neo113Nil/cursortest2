package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivTransformJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTransformTemplate.kt */
/* loaded from: classes14.dex */
public final class DivTransformTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivPivot.Percentage PIVOT_X_DEFAULT_VALUE;
    private static final DivPivot.Percentage PIVOT_Y_DEFAULT_VALUE;
    public final Field pivotX;
    public final Field pivotY;
    public final Field rotation;

    public DivTransformTemplate(Field field, Field field2, Field field3) {
        this.pivotX = field;
        this.pivotY = field2;
        this.rotation = field3;
    }

    public /* synthetic */ DivTransformTemplate(ParsingEnvironment parsingEnvironment, DivTransformTemplate divTransformTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTransformTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivTransformTemplate(ParsingEnvironment parsingEnvironment, DivTransformTemplate divTransformTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTransform resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTransformJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTransformJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTransformJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTransformJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTransformTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double valueOf = Double.valueOf(50.0d);
        PIVOT_X_DEFAULT_VALUE = new DivPivot.Percentage(new DivPivotPercentage(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        PIVOT_Y_DEFAULT_VALUE = new DivPivot.Percentage(new DivPivotPercentage(Expression.Companion.constant$default(companion, valueOf, null, 2, null)));
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTransformTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTransformTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTransformTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
