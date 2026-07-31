package yads;

import android.content.Context;
import android.view.View;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBase;

/* loaded from: classes5.dex */
public final class mi0 implements DivExtensionHandler {
    public final ki0 a;
    public final oi0 b;

    public mi0(ki0 ki0Var) {
        oi0 oi0Var = new oi0();
        this.a = ki0Var;
        this.b = oi0Var;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, DivBase divBase) {
        Context context = view.getContext();
        ni0 a = this.b.a(divBase);
        if (a != null) {
            ju juVar = new ju(context, new li0(this.a, a));
            view.setOnTouchListener(juVar);
            view.setOnClickListener(juVar);
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(DivBase divBase) {
        return this.b.a(divBase) != null;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, DivBase divBase) {
        view.setOnTouchListener(null);
        view.setOnClickListener(null);
    }
}
