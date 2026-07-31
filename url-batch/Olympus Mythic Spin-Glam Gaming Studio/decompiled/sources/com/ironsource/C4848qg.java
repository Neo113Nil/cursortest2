package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.qg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C4848qg {
    private NetworkSettings b;
    private ArrayList<String> a = new ArrayList<>();
    private JSONObject c = null;
    private boolean d = true;

    C4848qg() {
    }

    public void a(NetworkSettings networkSettings) {
        this.b = networkSettings;
    }

    public JSONObject b() {
        return this.c;
    }

    @Nullable
    public NetworkSettings c() {
        return this.b;
    }

    public ArrayList<String> d() {
        return this.a;
    }

    public boolean e() {
        return this.d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.add(str);
    }

    public void a(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public static C4848qg a() {
        return new C4848qg();
    }
}
