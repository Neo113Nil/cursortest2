package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivScaleTransitionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivScaleTransitionTemplate.kt */
/* loaded from: classes12.dex */
public final class DivScaleTransitionTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression PIVOT_X_DEFAULT_VALUE;
    private static final Expression PIVOT_Y_DEFAULT_VALUE;
    private static final Expression SCALE_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    public final Field duration;
    public final Field interpolator;
    public final Field pivotX;
    public final Field pivotY;
    public final Field scale;
    public final Field startDelay;

    public DivScaleTransitionTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6) {
        this.duration = field;
        this.interpolator = field2;
        this.pivotX = field3;
        this.pivotY = field4;
        this.scale = field5;
        this.startDelay = field6;
    }

    public /* synthetic */ DivScaleTransitionTemplate(ParsingEnvironment parsingEnvironment, DivScaleTransitionTemplate divScaleTransitionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divScaleTransitionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivScaleTransitionTemplate(ParsingEnvironment parsingEnvironment, DivScaleTransitionTemplate divScaleTransitionTemplate, boolean z, JSONObject jSONObject) {
        this(r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false), r8.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivScaleTransition resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivScaleTransitionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivScaleTransitionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivScaleTransitionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivScaleTransitionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivScaleTransitionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(0.5d);
        PIVOT_X_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PIVOT_Y_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivScaleTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivScaleTransitionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivScaleTransitionTemplate(parsingEnvironment, (DivScaleTransitionTemplate) null, false, jSONObject, 6, (DefaultConstructorMarker) null);
            }
        };
    }
}
