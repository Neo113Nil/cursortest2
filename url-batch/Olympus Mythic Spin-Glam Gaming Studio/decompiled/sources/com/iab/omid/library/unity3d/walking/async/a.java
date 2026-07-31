package com.iab.omid.library.unity3d.walking.async;

import com.iab.omid.library.unity3d.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class a extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public a(b.InterfaceC0337b interfaceC0337b, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(interfaceC0337b);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
