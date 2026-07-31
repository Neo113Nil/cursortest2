package sg.bigo.ads.bs;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.B5;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.bo.a;
import sg.bigo.ads.bo.f;
import sg.bigo.ads.common.utils.l;

/* loaded from: classes11.dex */
public class b<T extends sg.bigo.ads.bo.a> extends c<T> {
    public static final f a = f.a("text/plain;charset=utf-8");
    public JSONObject b;
    public byte[] c;
    public f d;
    public boolean e;
    public boolean f;
    public int g;
    public String h;
    public int i;
    private String q;

    public b(int i, @NonNull T t, Context context) {
        super(i, t, true, context);
        this.i = -1;
    }

    @Override // sg.bigo.ads.bs.c
    @NonNull
    public final String a() {
        return "POST";
    }

    protected final void a(Map<String, Object> map) {
        if (this.b == null || l.a(map)) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            try {
                this.b.putOpt(entry.getKey(), entry.getValue());
            } catch (JSONException unused) {
            }
        }
        this.c = null;
    }

    @Override // sg.bigo.ads.bs.c
    @Nullable
    public final f b() {
        f fVar = this.d;
        return fVar != null ? fVar : a;
    }

    @Override // sg.bigo.ads.bs.c
    @Nullable
    public final byte[] c() {
        JSONObject jSONObject;
        if (this.c == null && (jSONObject = this.b) != null) {
            String jSONObject2 = jSONObject.toString();
            this.q = jSONObject2;
            try {
                if (this.e) {
                    String a2 = sg.bigo.ads.bc.a.a(jSONObject2, "FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F");
                    if (TextUtils.isEmpty(a2)) {
                        this.f = false;
                    } else {
                        this.f = true;
                        this.q = a2;
                        a("enc", "1");
                    }
                }
            } catch (Exception unused) {
                this.f = false;
            }
            try {
                this.c = this.q.getBytes(B5.O);
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        return this.c;
    }

    @Override // sg.bigo.ads.bs.c
    @Nullable
    public final String d() {
        return e() >= 0 ? this.q : "content is null.";
    }

    @Override // sg.bigo.ads.bs.c
    public final int e() {
        int i = this.i;
        if (i > 0) {
            return i;
        }
        byte[] c = c();
        return c != null ? c.length : super.e();
    }

    @Override // sg.bigo.ads.bs.c
    public final boolean f() {
        return this.f;
    }
}
