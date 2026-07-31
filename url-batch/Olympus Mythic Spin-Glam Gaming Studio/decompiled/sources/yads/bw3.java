package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class bw3 extends yu3 {
    public bw3(iv3 iv3Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(iv3Var, hashSet, jSONObject, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.jv3, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        qv3 qv3Var = qv3.c;
        if (qv3Var != null) {
            for (av3 av3Var : Collections.unmodifiableCollection(qv3Var.a)) {
                if (this.c.contains(av3Var.h)) {
                    i9 i9Var = av3Var.e;
                    if (this.e >= i9Var.f && i9Var.e != 3) {
                        i9Var.e = 3;
                        kw3.a.a((WebView) i9Var.b.get(), "setNativeViewHierarchy", str, i9Var.a);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return this.d.toString();
    }
}
