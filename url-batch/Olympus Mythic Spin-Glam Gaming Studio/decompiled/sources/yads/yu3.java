package yads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class yu3 extends jv3 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public yu3(iv3 iv3Var, HashSet hashSet, JSONObject jSONObject, long j) {
        super(iv3Var);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
