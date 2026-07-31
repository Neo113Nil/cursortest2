package com.iab.omid.library.corpmailru.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.corpmailru.walking.a.b;
import com.iab.omid.library.corpmailru.walking.a.d;
import com.iab.omid.library.corpmailru.walking.a.e;
import com.iab.omid.library.corpmailru.walking.a.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class b implements b.InterfaceC0289b {
    private JSONObject a;
    private final com.iab.omid.library.corpmailru.walking.a.c b;

    public b(com.iab.omid.library.corpmailru.walking.a.c cVar) {
        this.b = cVar;
    }

    public void a() {
        this.b.b(new d(this));
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.InterfaceC0289b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }

    @Override // com.iab.omid.library.corpmailru.walking.a.b.InterfaceC0289b
    @VisibleForTesting
    public JSONObject b() {
        return this.a;
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }
}
