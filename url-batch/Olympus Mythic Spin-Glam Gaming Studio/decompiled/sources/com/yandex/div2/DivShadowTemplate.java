package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivShadowJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivShadowTemplate.kt */
/* loaded from: classes12.dex */
public final class DivShadowTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Expression BLUR_DEFAULT_VALUE;
    private static final Expression COLOR_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    public final Field alpha;
    public final Field blur;
    public final Field color;
    public final Field offset;

    public DivShadowTemplate(Field field, Field field2, Field field3, Field field4) {
        this.alpha = field;
        this.blur = field2;
        this.color = field3;
        this.offset = field4;
    }

    public /* synthetic */ DivShadowTemplate(ParsingEnvironment parsingEnvironment, DivShadowTemplate divShadowTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divShadowTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivShadowTemplate(ParsingEnvironment parsingEnvironment, DivShadowTemplate divShadowTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivShadow resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivShadowJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShadowJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivShadowJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivShadowJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivShadowTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        BLUR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        COLOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivShadowTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivShadowTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivShadowTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
