package yads;

import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.view2.Div2View;

/* loaded from: classes6.dex */
public abstract class hh0 {
    public static final cz2 a(Div2View div2View) {
        DivActionHandler actionHandler = div2View.getActionHandler();
        cz2 cz2Var = actionHandler instanceof cz2 ? (cz2) actionHandler : null;
        if (cz2Var != null) {
            return cz2Var;
        }
        cz2 cz2Var2 = new cz2();
        div2View.setActionHandler(cz2Var2);
        return cz2Var2;
    }
}
