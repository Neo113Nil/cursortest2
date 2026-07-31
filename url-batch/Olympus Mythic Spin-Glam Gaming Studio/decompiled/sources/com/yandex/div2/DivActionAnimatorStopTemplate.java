package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStopTemplate.kt */
/* loaded from: classes4.dex */
public final class DivActionAnimatorStopTemplate implements JSONSerializable, JsonTemplate {
    public final Field animatorId;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionAnimatorStopTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionAnimatorStopTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionAnimatorStopTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionAnimatorStopTemplate(Field field) {
        this.animatorId = field;
    }

    public /* synthetic */ DivActionAnimatorStopTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionAnimatorStopTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    public DivActionAnimatorStopTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, boolean z, JSONObject jSONObject) {
        this(Field.INSTANCE.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionAnimatorStop resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionAnimatorStopJsonParser$TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionAnimatorStopJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionAnimatorStopJsonParser$TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionAnimatorStopJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionAnimatorStopTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
