package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.internal.template.Field;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivFocus;
import com.yandex.div2.DivFocusTemplate;
import org.json.JSONObject;

/* compiled from: DivFocusJsonParser.kt */
/* loaded from: classes5.dex */
public final class DivFocusNextFocusIdsJsonParser$TemplateResolverImpl implements TemplateResolver {
    private final JsonParserComponent component;

    public DivFocusNextFocusIdsJsonParser$TemplateResolverImpl(JsonParserComponent jsonParserComponent) {
        this.component = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    public DivFocus.NextFocusIds resolve(ParsingContext parsingContext, DivFocusTemplate.NextFocusIdsTemplate nextFocusIdsTemplate, JSONObject jSONObject) {
        Field field = nextFocusIdsTemplate.down;
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocus.NextFocusIds(JsonFieldResolver.resolveOptionalExpression(parsingContext, field, jSONObject, "down", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.forward, jSONObject, ToolBar.FORWARD, typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.left, jSONObject, "left", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.right, jSONObject, "right", typeHelper), JsonFieldResolver.resolveOptionalExpression(parsingContext, nextFocusIdsTemplate.up, jSONObject, "up", typeHelper));
    }
}
