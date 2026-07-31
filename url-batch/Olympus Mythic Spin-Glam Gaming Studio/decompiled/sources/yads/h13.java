package yads;

import android.view.View;
import com.ironsource.X3;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivExtension;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class h13 implements DivExtensionHandler {
    public final mt1 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public h13(mt1 mt1Var) {
        this.a = mt1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, DivBase divBase) {
        Integer valueOf;
        j13 j13Var = (j13) this.b.get(div2View.getDivData());
        if (j13Var == null) {
            return;
        }
        view.setVisibility(8);
        j13Var.d.getClass();
        DivExtension a = vh0.a(divBase, "view");
        if (a == null) {
            return;
        }
        j13Var.e.getClass();
        JSONObject jSONObject = a.params;
        if (jSONObject != null) {
            try {
                valueOf = Integer.valueOf(jSONObject.getInt(X3.i.L));
            } catch (JSONException unused) {
            }
            if (valueOf == null) {
                ArrayList k = j13Var.a.k();
                if (valueOf.intValue() < 0 || valueOf.intValue() >= k.size()) {
                    return;
                }
                m12 m12Var = (m12) k.get(valueOf.intValue());
                f22 a2 = j13Var.f.a(view, new w92(valueOf.intValue()));
                try {
                    cz2 a3 = hh0.a(div2View);
                    gg0 gg0Var = j13Var.c;
                    ku kuVar = (ku) a3.a.b.get(valueOf);
                    if (kuVar == null) {
                        kuVar = new ku(gg0Var);
                        a3.a.a.put(valueOf, kuVar);
                    }
                    m12Var.a(a2, kuVar);
                    view.setVisibility(0);
                    return;
                } catch (v02 e) {
                    j13Var.b.reportError("Failed to bind DivKit Slider Inner Ad", e);
                    return;
                }
            }
            return;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean matches(DivBase divBase) {
        Integer valueOf;
        JSONObject jSONObject;
        DivExtension a = vh0.a(divBase, "view");
        if (a == null) {
            return false;
        }
        JSONObject jSONObject2 = a.params;
        String str = null;
        if (jSONObject2 != null) {
            try {
                valueOf = Integer.valueOf(jSONObject2.getInt(X3.i.L));
            } catch (JSONException unused) {
            }
            jSONObject = a.params;
            if (jSONObject != null) {
                try {
                    str = jSONObject.getString("view_name");
                } catch (JSONException unused2) {
                }
            }
            return valueOf != null && Intrinsics.areEqual("native_ad_view", str);
        }
        valueOf = null;
        jSONObject = a.params;
        if (jSONObject != null) {
        }
        if (valueOf != null) {
            return false;
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, DivBase divBase) {
    }
}
