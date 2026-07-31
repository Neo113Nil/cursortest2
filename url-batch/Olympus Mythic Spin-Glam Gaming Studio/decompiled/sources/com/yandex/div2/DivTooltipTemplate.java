package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivTooltipJsonParser;
import com.yandex.div2.DivTooltipMode;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTooltipTemplate.kt */
/* loaded from: classes13.dex */
public final class DivTooltipTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression CLOSE_BY_TAP_OUTSIDE_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression DURATION_DEFAULT_VALUE;
    private static final DivTooltipMode.Modal MODE_DEFAULT_VALUE;
    public final Field animationIn;
    public final Field animationOut;
    public final Field backgroundAccessibilityDescription;
    public final Field closeByTapOutside;
    public final Field div;
    public final Field duration;
    public final Field id;
    public final Field mode;
    public final Field offset;
    public final Field position;
    public final Field tapOutsideActions;

    public DivTooltipTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8, Field field9, Field field10, Field field11) {
        this.animationIn = field;
        this.animationOut = field2;
        this.backgroundAccessibilityDescription = field3;
        this.closeByTapOutside = field4;
        this.div = field5;
        this.duration = field6;
        this.id = field7;
        this.mode = field8;
        this.offset = field9;
        this.position = field10;
        this.tapOutsideActions = field11;
    }

    public /* synthetic */ DivTooltipTemplate(ParsingEnvironment parsingEnvironment, DivTooltipTemplate divTooltipTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divTooltipTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivTooltipTemplate(ParsingEnvironment parsingEnvironment, DivTooltipTemplate divTooltipTemplate, boolean z, JSONObject jSONObject) {
        this(r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false), r0.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivTooltip resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivTooltipJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivTooltipJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivTooltipJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivTooltipTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        CLOSE_BY_TAP_OUTSIDE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        DURATION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        MODE_DEFAULT_VALUE = new DivTooltipMode.Modal(new DivTooltipModeModal());
        CREATOR = new Function2() { // from class: com.yandex.div2.DivTooltipTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivTooltipTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivTooltipTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
