package sg.bigo.ads.cj;

import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.core.i;

/* loaded from: classes11.dex */
public final class h implements i.b {
    private final int a;
    private final int b;
    private final String c;

    public h(@NonNull JSONObject jSONObject) {
        this.a = jSONObject.optInt("w");
        this.b = jSONObject.optInt("h");
        this.c = jSONObject.optString("data");
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final int a() {
        return this.a;
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final int b() {
        return this.b;
    }

    @Override // sg.bigo.ads.api.core.i.b
    public final String c() {
        return this.c;
    }
}
