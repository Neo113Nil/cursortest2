package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivEdgeInsetsJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivEdgeInsetsTemplate.kt */
/* loaded from: classes14.dex */
public final class DivEdgeInsetsTemplate implements JSONSerializable, JsonTemplate {
    private static final Expression BOTTOM_DEFAULT_VALUE;
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression LEFT_DEFAULT_VALUE;
    private static final Expression RIGHT_DEFAULT_VALUE;
    private static final Expression TOP_DEFAULT_VALUE;
    private static final Expression UNIT_DEFAULT_VALUE;
    public final Field bottom;
    public final Field end;
    public final Field left;
    public final Field right;
    public final Field start;
    public final Field top;
    public final Field unit;

    public DivEdgeInsetsTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7) {
        this.bottom = field;
        this.end = field2;
        this.left = field3;
        this.right = field4;
        this.start = field5;
        this.top = field6;
        this.unit = field7;
    }

    public /* synthetic */ DivEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivEdgeInsetsTemplate divEdgeInsetsTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divEdgeInsetsTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivEdgeInsetsTemplate(ParsingEnvironment parsingEnvironment, DivEdgeInsetsTemplate divEdgeInsetsTemplate, boolean z, JSONObject jSONObject) {
        this(r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivEdgeInsets resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivEdgeInsetsJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivEdgeInsetsJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivEdgeInsetsJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivEdgeInsetsJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivEdgeInsetsTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        BOTTOM_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        LEFT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        RIGHT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        TOP_DEFAULT_VALUE = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        UNIT_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivSizeUnit.DP, null, 2, null);
        CREATOR = new Function2() { // from class: com.yandex.div2.DivEdgeInsetsTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivEdgeInsetsTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivEdgeInsetsTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
