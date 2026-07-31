package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class uu3 implements sv3 {
    public static final uu3 e = new uu3(new uv3());
    public Date a;
    public boolean b;
    public final uv3 c;
    public boolean d;

    public uu3(uv3 uv3Var) {
        this.c = uv3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.sv3
    public final void a(boolean z) {
        if (!this.d && z) {
            Date date = new Date();
            Date date2 = this.a;
            if (date2 == null || date.after(date2)) {
                this.a = date;
                if (this.b) {
                    Iterator it = Collections.unmodifiableCollection(qv3.c.b).iterator();
                    while (it.hasNext()) {
                        i9 i9Var = ((av3) it.next()).e;
                        Date date3 = this.a;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        i9Var.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            ov3.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            kw3.a.a((WebView) i9Var.b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.d = z;
    }
}
