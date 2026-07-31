package com.iab.omid.library.smaato.walking.async;

import com.iab.omid.library.smaato.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class e extends a {
    public e(b.InterfaceC0333b interfaceC0333b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0333b, hashSet, jSONObject, j);
    }

    private void b(String str) {
        com.iab.omid.library.smaato.internal.c c = com.iab.omid.library.smaato.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.smaato.adsession.a aVar : c.b()) {
                if (this.c.contains(aVar.c())) {
                    aVar.d().a(str, this.e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.smaato.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
