package com.iab.omid.library.pubmatic.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.pubmatic.walking.async.b;
import com.iab.omid.library.pubmatic.walking.async.d;
import com.iab.omid.library.pubmatic.walking.async.e;
import com.iab.omid.library.pubmatic.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class b implements b.InterfaceC0323b {
    private JSONObject a;
    private final com.iab.omid.library.pubmatic.walking.async.c b;

    public b(com.iab.omid.library.pubmatic.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.pubmatic.walking.async.b.InterfaceC0323b
    @VisibleForTesting
    public JSONObject a() {
        return this.a;
    }

    @Override // com.iab.omid.library.pubmatic.walking.async.b.InterfaceC0323b
    @VisibleForTesting
    public void a(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public void a(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new e(this, hashSet, jSONObject, j));
    }

    public void b() {
        this.b.b(new d(this));
    }

    public void b(JSONObject jSONObject, HashSet<String> hashSet, long j) {
        this.b.b(new f(this, hashSet, jSONObject, j));
    }
}
