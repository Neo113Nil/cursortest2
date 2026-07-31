package yads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m93 {
    public static final m93 g = new m93();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final k93 j = new k93();
    public static final l93 k = new l93();
    public long f;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final xu3 d = new xu3();
    public final fv3 c = new fv3();
    public final iv3 e = new iv3(new pv3());

    public final void a(View view, vv3 vv3Var, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z2;
        if (jw3.a(view) == null) {
            xu3 xu3Var = this.d;
            char c = xu3Var.d.contains(view) ? (char) 1 : xu3Var.j ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject a = vv3Var.a(view);
            ov3.a(jSONObject, a);
            xu3 xu3Var2 = this.d;
            if (xu3Var2.a.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) xu3Var2.a.get(view);
                if (obj2 != null) {
                    xu3Var2.a.remove(view);
                }
                obj = obj2;
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    a.put("adSessionId", obj);
                } catch (JSONException e) {
                    Log.e("OMIDLIB", "Error with setting ad session id", e);
                }
                xu3 xu3Var3 = this.d;
                if (xu3Var3.i.containsKey(view)) {
                    xu3Var3.i.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    a.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException e2) {
                    Log.e("OMIDLIB", "Error with setting has window focus", e2);
                }
                boolean contains = this.d.h.contains(obj);
                Object valueOf = Boolean.valueOf(contains);
                if (contains) {
                    try {
                        a.put("isPipActive", valueOf);
                    } catch (JSONException e3) {
                        Log.e("OMIDLIB", "Error with setting is picture-in-picture active", e3);
                    }
                }
                this.d.j = true;
                return;
            }
            xu3 xu3Var4 = this.d;
            su3 su3Var = (su3) xu3Var4.b.get(view);
            if (su3Var != null) {
                xu3Var4.b.remove(view);
            }
            if (su3Var != null) {
                zv3 zv3Var = su3Var.a;
                JSONArray jSONArray = new JSONArray();
                Iterator it = su3Var.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                try {
                    a.put("isFriendlyObstructionFor", jSONArray);
                    a.put("friendlyObstructionClass", zv3Var.b);
                    a.put("friendlyObstructionPurpose", zv3Var.c);
                    a.put("friendlyObstructionReason", zv3Var.d);
                } catch (JSONException e4) {
                    Log.e("OMIDLIB", "Error with setting friendly obstruction", e4);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            vv3Var.a(view, a, this, c == 1, z || z2);
        }
    }
}
