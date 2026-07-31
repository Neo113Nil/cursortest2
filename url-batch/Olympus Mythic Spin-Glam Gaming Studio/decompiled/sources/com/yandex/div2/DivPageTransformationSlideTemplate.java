package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivPageTransformationSlideJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivPageTransformationSlideTemplate.kt */
/* loaded from: classes5.dex */
public final class DivPageTransformationSlideTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression INTERPOLATOR_DEFAULT_VALUE;
    private static final Expression NEXT_PAGE_ALPHA_DEFAULT_VALUE;
    private static final Expression NEXT_PAGE_SCALE_DEFAULT_VALUE;
    private static final Expression PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE;
    private static final Expression PREVIOUS_PAGE_SCALE_DEFAULT_VALUE;
    public final Field interpolator;
    public final Field nextPageAlpha;
    public final Field nextPageScale;
    public final Field previousPageAlpha;
    public final Field previousPageScale;

    public DivPageTransformationSlideTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.interpolator = field;
        this.nextPageAlpha = field2;
        this.nextPageScale = field3;
        this.previousPageAlpha = field4;
        this.previousPageScale = field5;
    }

    public /* synthetic */ DivPageTransformationSlideTemplate(ParsingEnvironment parsingEnvironment, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divPageTransformationSlideTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivPageTransformationSlideTemplate(ParsingEnvironment parsingEnvironment, DivPageTransformationSlideTemplate divPageTransformationSlideTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivPageTransformationSlide resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivPageTransformationSlideJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationSlideJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivPageTransformationSlideJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivPageTransformationSlideJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivPageTransformationSlideTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        INTERPOLATOR_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        Double valueOf = Double.valueOf(1.0d);
        NEXT_PAGE_ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        NEXT_PAGE_SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PREVIOUS_PAGE_ALPHA_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        PREVIOUS_PAGE_SCALE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, valueOf, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivPageTransformationSlideTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivPageTransformationSlideTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivPageTransformationSlideTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
