package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivCount;
import com.yandex.div2.DivNumberAnimatorJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivNumberAnimatorTemplate.kt */
/* loaded from: classes12.dex */
public final class DivNumberAnimatorTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DIRECTION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final DivCount.Fixed REPEAT_COUNT_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    public final Field cancelActions;
    public final Field direction;
    public final Field duration;
    public final Field endActions;
    public final Field endValue;
    public final Field id;
    public final Field interpolator;
    public final Field repeatCount;
    public final Field startDelay;
    public final Field startValue;
    public final Field variableName;

    public DivNumberAnimatorTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.cancelActions = field;
        this.direction = field2;
        this.duration = field3;
        this.endActions = field4;
        this.endValue = field5;
        this.id = field6;
        this.interpolator = field7;
        this.repeatCount = field8;
        this.startDelay = field9;
        this.startValue = field10;
        this.variableName = field11;
    }

    public /* synthetic */ DivNumberAnimatorTemplate(ParsingEnvironment parsingEnvironment, DivNumberAnimatorTemplate divNumberAnimatorTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divNumberAnimatorTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivNumberAnimatorTemplate(ParsingEnvironment parsingEnvironment, DivNumberAnimatorTemplate divNumberAnimatorTemplate, boolean z, JSONObject jSONObject) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivNumberAnimator resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivNumberAnimatorJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNumberAnimatorJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivNumberAnimatorJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivNumberAnimatorJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivNumberAnimatorTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DIRECTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationDirection.NORMAL, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.LINEAR, null, 2, null);
        REPEAT_COUNT_DEFAULT_VALUE = new DivCount.Fixed(new DivFixedCount(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivNumberAnimatorTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivNumberAnimatorTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivNumberAnimatorTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
