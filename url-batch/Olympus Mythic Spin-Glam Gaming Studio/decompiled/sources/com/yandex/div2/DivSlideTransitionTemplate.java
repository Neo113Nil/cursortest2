package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivSlideTransition;
import com.yandex.div2.DivSlideTransitionJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivSlideTransitionTemplate.kt */
/* loaded from: classes10.dex */
public final class DivSlideTransitionTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final Expression EDGE_DEFAULT_VALUE;
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression START_DELAY_DEFAULT_VALUE;
    public final Field distance;
    public final Field duration;
    public final Field edge;
    public final Field interpolator;
    public final Field startDelay;

    public DivSlideTransitionTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.distance = field;
        this.duration = field2;
        this.edge = field3;
        this.interpolator = field4;
        this.startDelay = field5;
    }

    public /* synthetic */ DivSlideTransitionTemplate(ParsingEnvironment parsingEnvironment, DivSlideTransitionTemplate divSlideTransitionTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divSlideTransitionTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivSlideTransitionTemplate(ParsingEnvironment parsingEnvironment, DivSlideTransitionTemplate divSlideTransitionTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivSlideTransition resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivSlideTransitionJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSlideTransitionJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivSlideTransitionJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivSlideTransitionJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivSlideTransitionTemplate.kt */
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
        EDGE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSlideTransition.Edge.BOTTOM, null, 2, null);
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        START_DELAY_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivSlideTransitionTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivSlideTransitionTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivSlideTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
