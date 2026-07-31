package yads;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class nh0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        Context context = div2View.getContext();
        bb3 bb3Var = k92.d.a(context).c;
        JSONObject jSONObject = divCustom.customProps;
        Object obj = jSONObject != null ? jSONObject.get("on_image_url") : null;
        String str = obj instanceof String ? (String) obj : null;
        JSONObject jSONObject2 = divCustom.customProps;
        Object obj2 = jSONObject2 != null ? jSONObject2.get("off_image_url") : null;
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        n73 n73Var = new n73(context);
        if (str != null) {
            n73Var.setCheckedIcon(new BitmapDrawable(context.getResources(), bb3Var.a(str)));
        }
        if (str2 != null) {
            n73Var.setUncheckedIcon(new BitmapDrawable(context.getResources(), bb3Var.a(str2)));
        }
        JSONObject jSONObject3 = divCustom.customProps;
        if (jSONObject3 != null && jSONObject3.has("is_focusable")) {
            n73Var.setFocusable(jSONObject3.optBoolean("is_focusable"));
        }
        return n73Var;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return Intrinsics.areEqual("mute_button", str);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom divCustom) {
    }
}
