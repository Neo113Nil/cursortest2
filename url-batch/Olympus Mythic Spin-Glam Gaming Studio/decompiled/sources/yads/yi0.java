package yads;

import android.view.View;
import android.widget.TextView;
import com.yandex.div.core.extension.DivExtensionHandler;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivExtension;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class yi0 implements DivExtensionHandler {
    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void bindView(Div2View div2View, ExpressionResolver expressionResolver, View view, DivBase divBase) {
        Object obj;
        JSONObject jSONObject;
        String string;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setHyphenationFrequency(2);
            List extensions = divBase.getExtensions();
            Locale locale = null;
            if (extensions != null) {
                Iterator it = extensions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((DivExtension) obj).id, "hyphenation")) {
                            break;
                        }
                    }
                }
                DivExtension divExtension = (DivExtension) obj;
                if (divExtension != null && (jSONObject = divExtension.params) != null && (string = jSONObject.getString(CommonUrlParts.LOCALE)) != null) {
                    locale = new Locale(string);
                }
            }
            if (locale != null) {
                textView.setTextLocale(locale);
            }
        }
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final boolean matches(DivBase divBase) {
        List extensions = divBase.getExtensions();
        if (extensions != null && !extensions.isEmpty()) {
            Iterator it = extensions.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((DivExtension) it.next()).id, "hyphenation")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.core.extension.DivExtensionHandler
    public final void unbindView(Div2View div2View, ExpressionResolver expressionResolver, View view, DivBase divBase) {
    }
}
