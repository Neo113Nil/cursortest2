package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivAccessibility;
import com.yandex.div2.DivAccessibilityJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivAccessibilityTemplate.kt */
/* loaded from: classes15.dex */
public final class DivAccessibilityTemplate implements JSONSerializable, JsonTemplate {
    private static final Function2 CREATOR;
    public static final Companion Companion = new Companion(null);
    private static final Expression MODE_DEFAULT_VALUE;
    private static final Expression MUTE_AFTER_ACTION_DEFAULT_VALUE;
    private static final DivAccessibility.Type TYPE_DEFAULT_VALUE;
    public final Field description;
    public final Field hint;
    public final Field isChecked;
    public final Field mode;
    public final Field muteAfterAction;
    public final Field stateDescription;
    public final Field type;

    public DivAccessibilityTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7) {
        this.description = field;
        this.hint = field2;
        this.isChecked = field3;
        this.mode = field4;
        this.muteAfterAction = field5;
        this.stateDescription = field6;
        this.type = field7;
    }

    public /* synthetic */ DivAccessibilityTemplate(ParsingEnvironment parsingEnvironment, DivAccessibilityTemplate divAccessibilityTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divAccessibilityTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivAccessibilityTemplate(ParsingEnvironment parsingEnvironment, DivAccessibilityTemplate divAccessibilityTemplate, boolean z, JSONObject jSONObject) {
        this(r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivAccessibility resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivAccessibilityJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAccessibilityJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivAccessibilityJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivAccessibilityJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivAccessibilityTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        MODE_DEFAULT_VALUE = Expression.Companion.constant$default(companion, DivAccessibility.Mode.DEFAULT, null, 2, null);
        MUTE_AFTER_ACTION_DEFAULT_VALUE = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        TYPE_DEFAULT_VALUE = DivAccessibility.Type.AUTO;
        CREATOR = new Function2() { // from class: com.yandex.div2.DivAccessibilityTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivAccessibilityTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivAccessibilityTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }
}
