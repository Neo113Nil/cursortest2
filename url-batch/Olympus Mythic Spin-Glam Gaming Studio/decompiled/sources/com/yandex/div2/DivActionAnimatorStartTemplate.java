package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.DivActionAnimatorStartJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivActionAnimatorStartTemplate.kt */
/* loaded from: classes8.dex */
public final class DivActionAnimatorStartTemplate implements JSONSerializable, JsonTemplate {
    public final Field animatorId;
    public final Field direction;
    public final Field duration;
    public final Field endValue;
    public final Field interpolator;
    public final Field repeatCount;
    public final Field startDelay;
    public final Field startValue;
    public static final Companion Companion = new Companion(null);
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.DivActionAnimatorStartTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final DivActionAnimatorStartTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionAnimatorStartTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public DivActionAnimatorStartTemplate(Field field, Field field2, Field field3, Field field4, Field field5, Field field6, Field field7, Field field8) {
        this.animatorId = field;
        this.direction = field2;
        this.duration = field3;
        this.endValue = field4;
        this.interpolator = field5;
        this.repeatCount = field6;
        this.startDelay = field7;
        this.startValue = field8;
    }

    public /* synthetic */ DivActionAnimatorStartTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : divActionAnimatorStartTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivActionAnimatorStartTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, boolean z, JSONObject jSONObject) {
        this(r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false), r10.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public DivActionAnimatorStart resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((DivActionAnimatorStartJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionAnimatorStartJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((DivActionAnimatorStartJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getDivActionAnimatorStartJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: DivActionAnimatorStartTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
