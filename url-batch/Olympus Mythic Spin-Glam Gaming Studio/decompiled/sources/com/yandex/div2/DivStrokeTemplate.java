package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivStrokeJsonParser;
import com.yandex.div2.DivStrokeStyle;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivStrokeTemplate.kt */
/* loaded from: classes9.dex */
public final class DivStrokeTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final DivStrokeStyle.Solid STYLE_DEFAULT_VALUE = new DivStrokeStyle.Solid(new DivStrokeStyleSolid());
    private static final Expression UNIT_DEFAULT_VALUE;
    private static final Expression WIDTH_DEFAULT_VALUE;
    public final Field color;
    public final Field style;
    public final Field unit;
    public final Field width;

    public DivStrokeTemplate(Field field, Field field2, Field field3, Field field4) {
        this.color = field;
        this.style = field2;
        this.unit = field3;
        this.width = field4;
    }

    public /* synthetic */ DivStrokeTemplate(ParsingEnvironment parsingEnvironment, DivStrokeTemplate divStrokeTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divStrokeTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivStrokeTemplate(ParsingEnvironment parsingEnvironment, DivStrokeTemplate divStrokeTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivStroke resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivStrokeJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivStrokeJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivStrokeJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivStrokeTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        WIDTH_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivStrokeTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivStrokeTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivStrokeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
