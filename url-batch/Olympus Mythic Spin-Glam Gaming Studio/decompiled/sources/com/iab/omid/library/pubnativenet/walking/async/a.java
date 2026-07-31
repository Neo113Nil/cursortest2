package com.iab.omid.library.pubnativenet.walking.async;

import com.iab.omid.library.pubnativenet.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0329b interfaceC0329b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0329b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
