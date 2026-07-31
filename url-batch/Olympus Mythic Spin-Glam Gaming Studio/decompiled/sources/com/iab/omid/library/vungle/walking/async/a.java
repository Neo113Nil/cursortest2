package com.iab.omid.library.vungle.walking.async;

import com.iab.omid.library.vungle.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class a extends b {
    public final HashSet<String> c;
    public final JSONObject d;
    public final long e;

    public a(b.InterfaceC0343b interfaceC0343b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0343b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
