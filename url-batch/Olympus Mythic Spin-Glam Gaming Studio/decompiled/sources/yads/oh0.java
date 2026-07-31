package yads;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class oh0 implements DivCustomContainerViewAdapter {
    public static Integer a(DivCustom divCustom, String str) {
        Object m8023constructorimpl;
        JSONObject jSONObject = divCustom.customProps;
        String optString = jSONObject != null ? jSONObject.optString(str) : null;
        try {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Integer.valueOf(Color.parseColor(optString)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        return (Integer) (Result.m8028isFailureimpl(m8023constructorimpl) ? null : m8023constructorimpl);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer a = a(divCustom, "progress_color");
        if (a != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(a.intValue()));
        }
        Integer a2 = a(divCustom, "background_color");
        if (a2 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(a2.intValue()));
        }
        JSONObject jSONObject = divCustom.customProps;
        if (jSONObject != null && jSONObject.has("is_focusable")) {
            progressBar.setFocusable(jSONObject.optBoolean("is_focusable"));
        }
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom divCustom) {
    }
}
