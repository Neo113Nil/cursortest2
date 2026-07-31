package com.iab.omid.library.corpmailru.walking.a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class b extends AsyncTask<Object, Void, String> {
    private a a;
    protected final InterfaceC0289b d;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0289b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public b(InterfaceC0289b interfaceC0289b) {
        this.d = interfaceC0289b;
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
