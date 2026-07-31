package yads;

import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class qh0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        am2 am2Var = new am2(div2View.getContext());
        JSONObject jSONObject = divCustom.customProps;
        if (jSONObject != null) {
            if (jSONObject.has("is_focusable")) {
                am2Var.setFocusable(jSONObject.optBoolean("is_focusable"));
            }
            if (jSONObject.has("descendant_focusability")) {
                am2Var.setDescendantFocusability(jSONObject.optInt("descendant_focusability"));
            }
        }
        return am2Var;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return Intrinsics.areEqual("rating", str);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom divCustom) {
    }
}
