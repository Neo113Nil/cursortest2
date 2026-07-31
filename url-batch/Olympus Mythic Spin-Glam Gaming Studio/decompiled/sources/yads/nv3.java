package yads;

import android.util.Log;
import android.view.View;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class nv3 {
    public final vv3 a;

    public nv3(vv3 vv3Var) {
        this.a = vv3Var;
    }

    public final JSONObject a(View view) {
        JSONObject a = ov3.a(0, 0, 0, 0);
        try {
            a.put("noOutputDevice", mv3.a[pg0.a(wu3.a() != 1 ? 2 : aw3.a)] == 1);
        } catch (JSONException e) {
            Log.e("OMIDLIB", "Error with setting output device status", e);
        }
        return a;
    }
}
