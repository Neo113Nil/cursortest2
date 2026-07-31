package yads;

import android.net.Uri;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivExtension;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class oi0 {
    public final ni0 a(DivBase divBase) {
        Object m8023constructorimpl;
        DivExtension a = vh0.a(divBase, "click");
        if (a == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = a.params;
            String string = jSONObject != null ? jSONObject.getString("url") : null;
            m8023constructorimpl = Result.m8023constructorimpl(string != null ? Uri.parse(string) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            m8023constructorimpl = null;
        }
        Uri uri = (Uri) m8023constructorimpl;
        if (uri != null) {
            return new ni0(uri);
        }
        return null;
    }
}
