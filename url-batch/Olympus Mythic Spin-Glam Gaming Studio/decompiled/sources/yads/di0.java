package yads;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class di0 extends DivActionHandler {
    public final ug0 a;

    public di0(ug0 ug0Var) {
        this.a = ug0Var;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression expression = divAction.url;
        if (expression != null) {
            Uri uri = (Uri) expression.evaluate(expressionResolver);
            if (Intrinsics.areEqual(uri.getScheme(), "mobileads") && Intrinsics.areEqual(uri.getHost(), "closeDialog")) {
                this.a.e();
            }
        }
        return super.handleAction(divAction, divViewFacade, expressionResolver);
    }
}
