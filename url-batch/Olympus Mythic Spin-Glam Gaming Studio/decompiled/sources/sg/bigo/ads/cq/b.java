package sg.bigo.ads.cq;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.an.g;
import sg.bigo.ads.cs.j;

/* loaded from: classes3.dex */
public final class b {
    private static final b i = new b();
    public sg.bigo.ads.cs.a a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public j c;
    public sg.bigo.ads.cr.a d;
    public Context e;
    public sg.bigo.ads.an.j f;
    public sg.bigo.ads.an.j g;
    public g h;

    private b() {
    }

    public static b a() {
        return i;
    }

    public final void a(String str, @NonNull Map<String, Object> map) {
        if (!sg.bigo.ads.bw.a.s() && this.b.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
            sg.bigo.ads.cr.a aVar = this.d;
            if (aVar != null && aVar.d) {
                if (this.c == null) {
                    this.c = new j(this.e, aVar, this.f, this.g, this.h);
                }
                this.c.a(str, jSONObject);
            } else {
                sg.bigo.ads.cs.a aVar2 = this.a;
                if (aVar2 != null) {
                    aVar2.a(str, jSONObject);
                }
            }
        }
    }
}
