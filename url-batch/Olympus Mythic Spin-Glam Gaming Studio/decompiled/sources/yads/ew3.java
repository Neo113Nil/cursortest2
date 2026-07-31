package yads;

import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ew3 extends yu3 {
    public ew3(iv3 iv3Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(iv3Var, hashSet, jSONObject, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.jv3, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        qv3 qv3Var;
        if (!TextUtils.isEmpty(str) && (qv3Var = qv3.c) != null) {
            for (av3 av3Var : Collections.unmodifiableCollection(qv3Var.a)) {
                if (this.c.contains(av3Var.h)) {
                    i9 i9Var = av3Var.e;
                    if (this.e >= i9Var.f) {
                        i9Var.e = 2;
                        kw3.a.a((WebView) i9Var.b.get(), "setNativeViewHierarchy", str, i9Var.a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        if (ov3.b(this.d, this.b.a)) {
            return null;
        }
        iv3 iv3Var = this.b;
        JSONObject jSONObject = this.d;
        iv3Var.a = jSONObject;
        return jSONObject.toString();
    }
}
