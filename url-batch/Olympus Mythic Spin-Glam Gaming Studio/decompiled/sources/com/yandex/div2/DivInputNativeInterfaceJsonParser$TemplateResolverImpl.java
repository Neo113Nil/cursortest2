package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputTemplate;
import org.json.JSONObject;

/* compiled from: DivInputJsonParser.kt */
/* loaded from: classes4.dex */
public final class DivInputNativeInterfaceJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivInputNativeInterfaceJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivInput.NativeInterface resolve(ParsingContext parsingContext, DivInputTemplate.NativeInterfaceTemplate nativeInterfaceTemplate, JSONObject jSONObject) {
        return new DivInput.NativeInterface(JsonFieldResolver.resolveExpression(parsingContext, nativeInterfaceTemplate.color, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
