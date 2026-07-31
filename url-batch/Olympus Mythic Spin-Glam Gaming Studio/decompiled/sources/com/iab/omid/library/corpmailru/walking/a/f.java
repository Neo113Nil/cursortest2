package com.iab.omid.library.corpmailru.walking.a;

import android.text.TextUtils;
import com.iab.omid.library.corpmailru.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class f extends a {
    public f(b.InterfaceC0289b interfaceC0289b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0289b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.corpmailru.b.a a = com.iab.omid.library.corpmailru.b.a.a();
        if (a != null) {
            for (com.iab.omid.library.corpmailru.adsession.a aVar : a.b()) {
                if (((a) this).a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.corpmailru.d.b.b(this.b, this.d.b())) {
            return null;
        }
        this.d.a(this.b);
        return this.b.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.corpmailru.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
