package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivData;
import com.yandex.div2.DivDataJsonParser;
import com.yandex.div2.DivDataTemplate;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivDataTemplate.kt */
/* loaded from: classes.dex */
public final class DivDataTemplate implements JSONSerializable, JsonTemplate {
    public final Field functions;
    public final Field logId;
    public final Field states;
    public final Field timers;
    public final Field transitionAnimationSelector;
    public final Field variableTriggers;
    public final Field variables;
    public static final Companion Companion = new Companion(null);
    private static final Expression TRANSITION_ANIMATION_SELECTOR_DEFAULT_VALUE = Expression.Companion.constant$default(Expression.INSTANCE, DivTransitionSelector.NONE, null, 2, null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDataTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivDataTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivDataTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivDataTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7) {
        this.functions = field;
        this.logId = field2;
        this.states = field3;
        this.timers = field4;
        this.transitionAnimationSelector = field5;
        this.variableTriggers = field6;
        this.variables = field7;
    }

    public /* synthetic */ DivDataTemplate(ParsingEnvironment parsingEnvironment, DivDataTemplate divDataTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divDataTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivDataTemplate(ParsingEnvironment parsingEnvironment, DivDataTemplate divDataTemplate, boolean z, JSONObject jSONObject) {
        this(r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false), r9.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivData resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivDataJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDataJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivDataJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDataJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivDataTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivDataTemplate.kt */
    public static final class StateTemplate implements JSONSerializable, JsonTemplate {
        public final Field div;
        public final Field stateId;
        public static final Companion Companion = new Companion(null);
        private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivDataTemplate$StateTemplate$Companion$CREATOR$1
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final DivDataTemplate.StateTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return new DivDataTemplate.StateTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };

        public StateTemplate(Field field, Field field2) {
            this.div = field;
            this.stateId = field2;
        }

        public /* synthetic */ StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(parsingEnvironment, (i & 2) != 0 ? null : stateTemplate, (i & 4) != 0 ? false : z, jSONObject);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StateTemplate(ParsingEnvironment parsingEnvironment, StateTemplate stateTemplate, boolean z, JSONObject jSONObject) {
            this(r1.nullField(false), r1.nullField(false));
            Field.Companion companion = Field.INSTANCE;
            throw new UnsupportedOperationException("Do not use this constructor directly.");
        }

        @Override // com.yandex.div.json.JsonTemplate
        public DivData.State resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((DivDataStateJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDataStateJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((DivDataStateJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivDataStateJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }

        /* compiled from: DivDataTemplate.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
