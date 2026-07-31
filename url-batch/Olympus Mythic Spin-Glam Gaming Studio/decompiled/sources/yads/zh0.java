package yads;

import android.content.Context;
import android.net.Uri;
import com.ironsource.X3;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivSightAction;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zh0 extends DivActionHandler {
    public final fz a;
    public final ai0 b;
    public final ki0 c;
    public final bj0 d;
    public final aj0 e;
    public final ou f;

    public zh0(Context context, v3 v3Var, yu2 yu2Var, t8 t8Var, fz fzVar, ai0 ai0Var, ki0 ki0Var) {
        bj0 bj0Var = new bj0(new pd2(context, v3Var, yu2Var, a93.c), v3Var, t8Var);
        Context context2 = ((nt3) yu2Var).a;
        aj0 aj0Var = new aj0(t8Var, pr.a(context2, context2));
        ou ouVar = new ou();
        this.a = fzVar;
        this.b = ai0Var;
        this.c = ki0Var;
        this.d = bj0Var;
        this.e = aj0Var;
        this.f = ouVar;
    }

    public final boolean a(JSONObject jSONObject, Uri uri, DivViewFacade divViewFacade) {
        Map hashMap;
        if (!Intrinsics.areEqual(uri.getScheme(), "mobileads")) {
            return false;
        }
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != 94750088) {
                if (hashCode != 866535483) {
                    if (hashCode != 986975867) {
                        if (hashCode == 1270469668 && host.equals("trackUrl")) {
                            LinkedHashMap a = this.f.a(divViewFacade.getView(), null);
                            bj0 bj0Var = this.d;
                            io2 a2 = bj0Var.d.a(bj0Var.b, bj0Var.c);
                            String queryParameter = uri.getQueryParameter("trackingUrl");
                            if (queryParameter == null || queryParameter.length() <= 0) {
                                return true;
                            }
                            bj0Var.a.a(queryParameter, a, a2);
                            return true;
                        }
                    } else if (host.equals("trackAnalytics")) {
                        aj0 aj0Var = this.e;
                        aj0Var.getClass();
                        String queryParameter2 = uri.getQueryParameter(X3.i.j0);
                        if (queryParameter2 == null) {
                            return true;
                        }
                        String str = queryParameter2.length() != 0 ? queryParameter2 : null;
                        if (str == null) {
                            return true;
                        }
                        if (jSONObject == null || (hashMap = MapsKt.toMutableMap(yc1.a(jSONObject))) == null) {
                            hashMap = new HashMap();
                        }
                        aj0Var.b.a(new ho2(str, hashMap, aj0Var.a.i));
                        return true;
                    }
                } else if (host.equals("closeAd")) {
                    this.a.e();
                    return true;
                }
            } else if (host.equals("click")) {
                this.c.a(uri, divViewFacade.getView());
                return true;
            }
        }
        return this.b.a(uri);
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivSightAction divSightAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(divSightAction, divViewFacade, expressionResolver)) {
            return true;
        }
        Expression url = divSightAction.getUrl();
        return url != null && a(divSightAction.getPayload(), (Uri) url.evaluate(expressionResolver), divViewFacade);
    }

    @Override // com.yandex.div.core.DivActionHandler
    public final boolean handleAction(DivAction divAction, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (super.handleAction(divAction, divViewFacade, expressionResolver)) {
            return true;
        }
        Expression expression = divAction.url;
        return expression != null && a(divAction.payload, (Uri) expression.evaluate(expressionResolver), divViewFacade);
    }
}
