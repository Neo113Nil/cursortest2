package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div2.PropertyVariableJsonParser;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: PropertyVariableTemplate.kt */
/* loaded from: classes3.dex */
public final class PropertyVariableTemplate implements JSONSerializable, JsonTemplate {
    public final Field get;
    public final Field name;
    public final Field newValueVariableName;
    public final Field set;
    public final Field valueType;
    public static final Companion Companion = new Companion(null);
    private static final String NEW_VALUE_VARIABLE_NAME_DEFAULT_VALUE = "new_value";
    private static final Function2 CREATOR = new Function2() { // from class: com.yandex.div2.PropertyVariableTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final PropertyVariableTemplate invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new PropertyVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    public PropertyVariableTemplate(Field field, Field field2, Field field3, Field field4, Field field5) {
        this.get = field;
        this.name = field2;
        this.newValueVariableName = field3;
        this.set = field4;
        this.valueType = field5;
    }

    public /* synthetic */ PropertyVariableTemplate(ParsingEnvironment parsingEnvironment, PropertyVariableTemplate propertyVariableTemplate, boolean z, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(parsingEnvironment, (i & 2) != 0 ? null : propertyVariableTemplate, (i & 4) != 0 ? false : z, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PropertyVariableTemplate(ParsingEnvironment parsingEnvironment, PropertyVariableTemplate propertyVariableTemplate, boolean z, JSONObject jSONObject) {
        this(r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false), r7.nullField(false));
        Field.Companion companion = Field.INSTANCE;
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    @Override // com.yandex.div.json.JsonTemplate
    public PropertyVariable resolve(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
        return ((PropertyVariableJsonParser.TemplateResolverImpl) BuiltInParserKt.getBuiltInParserComponent().getPropertyVariableJsonTemplateResolver().getValue()).resolve((ParsingContext) parsingEnvironment, this, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((PropertyVariableJsonParser.TemplateParserImpl) BuiltInParserKt.getBuiltInParserComponent().getPropertyVariableJsonTemplateParser().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    /* compiled from: PropertyVariableTemplate.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
