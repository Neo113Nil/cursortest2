package com.iab.omid.library.fyber.walking.async;

import com.iab.omid.library.fyber.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0293b interfaceC0293b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0293b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
