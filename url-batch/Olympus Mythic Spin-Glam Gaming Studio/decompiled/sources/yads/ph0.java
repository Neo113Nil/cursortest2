package yads;

import android.R;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import com.yandex.mobile.ads.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class ph0 implements DivCustomContainerViewAdapter {
    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(DivCustom divCustom, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        int i;
        String str = null;
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        JSONObject jSONObject = divCustom.customProps;
        if (jSONObject == null || !jSONObject.has("progress_color")) {
            str = POBCTAOverlayData.DEFAULT_CTA_TEXT_COLOR;
        } else {
            JSONObject jSONObject2 = divCustom.customProps;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("progress_color");
            }
        }
        try {
            i = Color.parseColor(str);
        } catch (Throwable unused) {
            i = -16777216;
        }
        Drawable drawable = progressBar.getContext().getDrawable(R$drawable.monetization_ads_internal_circular_close_progress);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        progressBar.setProgressDrawable(drawable);
        JSONObject jSONObject3 = divCustom.customProps;
        if (jSONObject3 != null && jSONObject3.has("is_focusable")) {
            progressBar.setFocusable(jSONObject3.optBoolean("is_focusable"));
        }
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final boolean isCustomTypeSupported(String str) {
        return Intrinsics.areEqual(str, "close_progress_view");
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, DivCustom divCustom) {
    }
}
