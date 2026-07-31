package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivChangeBoundsTransitionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivChangeBoundsTransitionTemplate.kt */
/* loaded from: classes14.dex */
public final class DivChangeBoundsTransitionTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    public final Field duration;
    public final Field interpolator;
    public final Field startDelay;

    public DivChangeBoundsTransitionTemplate(Field field, Field field2, Field field3) {
        this.duration = field;
        this.interpolator = field2;
        this.startDelay = field3;
    }

    public /* synthetic */ DivChangeBoundsTransitionTemplate(ParsingEnvironment parsingEnvironment, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divChangeBoundsTransitionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivChangeBoundsTransitionTemplate(ParsingEnvironment parsingEnvironment, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, boolean z, JSONObject jSONObject) {
        this(r1.nullField(false), r1.nullField(false), r1.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivChangeBoundsTransition resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivChangeBoundsTransitionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeBoundsTransitionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivChangeBoundsTransitionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivChangeBoundsTransitionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivChangeBoundsTransitionTemplate.kt */
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
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivChangeBoundsTransitionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivChangeBoundsTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
