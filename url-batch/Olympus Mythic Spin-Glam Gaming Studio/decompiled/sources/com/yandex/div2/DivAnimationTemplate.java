package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAnimationJsonParser;
import com.yandex.div2.DivCount;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAnimationTemplate.kt */
/* loaded from: classes15.dex */
public final class DivAnimationTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final DivCount.Infinity REPEAT_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    public final Field duration;
    public final Field endValue;
    public final Field interpolator;
    public final Field items;
    public final Field name;
    public final Field repeat;
    public final Field startDelay;
    public final Field startValue;

    public DivAnimationTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8) {
        this.duration = field;
        this.endValue = field2;
        this.interpolator = field3;
        this.items = field4;
        this.name = field5;
        this.repeat = field6;
        this.startDelay = field7;
        this.startValue = field8;
    }

    public /* synthetic */ DivAnimationTemplate(ParsingEnvironment parsingEnvironment, DivAnimationTemplate divAnimationTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divAnimationTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivAnimationTemplate(ParsingEnvironment parsingEnvironment, DivAnimationTemplate divAnimationTemplate, boolean z, JSONObject jSONObject) {
        this(r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivAnimation resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivAnimationJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimationJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAnimationJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAnimationJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAnimationTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 300L, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.SPRING, null, 2, null);
        REPEAT_DEFAULT_VALUE = new DivCount.Infinity(new DivInfinityCount());
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivAnimationTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivAnimationTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivAnimationTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
