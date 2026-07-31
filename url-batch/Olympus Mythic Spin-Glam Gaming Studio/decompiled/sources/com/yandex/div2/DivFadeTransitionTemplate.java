package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivFadeTransitionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivFadeTransitionTemplate.kt */
/* loaded from: classes13.dex */
public final class DivFadeTransitionTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression ALPHA_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    public final Field alpha;
    public final Field duration;
    public final Field interpolator;
    public final Field startDelay;

    public DivFadeTransitionTemplate(Field field, Field field2, Field field3, Field field4) {
        this.alpha = field;
        this.duration = field2;
        this.interpolator = field3;
        this.startDelay = field4;
    }

    public /* synthetic */ DivFadeTransitionTemplate(ParsingEnvironment parsingEnvironment, DivFadeTransitionTemplate divFadeTransitionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divFadeTransitionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivFadeTransitionTemplate(ParsingEnvironment parsingEnvironment, DivFadeTransitionTemplate divFadeTransitionTemplate, boolean z, JSONObject jSONObject) {
        this(r2.nullField(false), r2.nullField(false), r2.nullField(false), r2.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivFadeTransition resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivFadeTransitionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFadeTransitionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivFadeTransitionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivFadeTransitionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivFadeTransitionTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivFadeTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivFadeTransitionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivFadeTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
