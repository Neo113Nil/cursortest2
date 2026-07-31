package com.iab.omid.library.bytedance2.walking;

import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.bytedance2.walking.async.b;
import com.iab.omid.library.bytedance2.walking.async.d;
import com.iab.omid.library.bytedance2.walking.async.e;
import com.iab.omid.library.bytedance2.walking.async.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class b implements b.InterfaceC0281b {
    private JSONObject a;
    private final com.iab.omid.library.bytedance2.walking.async.c b;

    public b(com.iab.omid.library.bytedance2.walking.async.c cVar) {
        this.b = cVar;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0281b
    @VisibleForTesting
    public JSONObject a() {
        return this.a;
    }

    @Override // com.iab.omid.library.bytedance2.walking.async.b.InterfaceC0281b
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
