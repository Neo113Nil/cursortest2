package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivSightAction;

/* loaded from: classes6.dex */
public final class cz2 extends DivActionHandler {
    public final lu a = new lu();
    public zh0 b;

    public final void a(zh0 zh0Var) {
        zh0 zh0Var2 = this.b;
        if (zh0Var2 != null) {
            zh0Var2.c.b = null;
        }
        if (zh0Var != null) {
            zh0Var.c.b = this.a;
        }
        this.b = zh0Var;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivSightAction divSightAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (!super.handleAction(divSightAction, divViewFacade, expressionResolver)) {
            zh0 zh0Var = this.b;
            if (!(zh0Var != null ? zh0Var.handleAction(divSightAction, divViewFacade, expressionResolver) : false)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (!super.handleAction(divAction, divViewFacade, expressionResolver)) {
            zh0 zh0Var = this.b;
            if (!(zh0Var != null ? zh0Var.handleAction(divAction, divViewFacade, expressionResolver) : false)) {
                return false;
            }
        }
        return true;
    }
}
