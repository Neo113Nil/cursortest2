package yads;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class mh0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        CustomizableMediaView customizableMediaView = new CustomizableMediaView(div2View.getContext());
        JSONObject jSONObject = divCustom.customProps;
        if (jSONObject != null) {
            if (jSONObject.has("is_focusable")) {
                customizableMediaView.setFocusable(jSONObject.optBoolean("is_focusable"));
            }
            if (jSONObject.has("descendant_focusability")) {
                customizableMediaView.setDescendantFocusability(jSONObject.optInt("descendant_focusability"));
            }
        }
        return customizableMediaView;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return Intrinsics.areEqual("media", str);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom divCustom) {
    }
}
