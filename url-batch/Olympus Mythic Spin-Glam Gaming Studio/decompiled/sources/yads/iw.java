package yads;

import android.net.Uri;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iw extends DivActionHandler {
    public final hw a;

    public iw(hw hwVar) {
        this.a = hwVar;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Expression expression = divAction.url;
        boolean z = false;
        if (expression != null) {
            String uri = ((Uri) expression.evaluate(expressionResolver)).toString();
            if (Intrinsics.areEqual(uri, "close_ad")) {
                hw hwVar = this.a;
                vg0.a(hwVar.a);
                hwVar.b.e();
            } else if (Intrinsics.areEqual(uri, "close_dialog")) {
                vg0.a(this.a.a);
            }
            z = true;
        }
        return z ? z : super.handleAction(divAction, divViewFacade, expressionResolver);
    }
}
