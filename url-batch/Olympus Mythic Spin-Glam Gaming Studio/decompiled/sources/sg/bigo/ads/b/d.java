package sg.bigo.ads.b;

import android.content.Context;
import android.os.Process;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class d implements g<JSONObject> {
    @Override // sg.bigo.ads.b.g
    public final /* synthetic */ JSONObject a(Context context) {
        JSONObject jSONObject = new JSONObject();
        int myUid = Process.myUid();
        if (myUid / 100000 == 0) {
            myUid = 0;
        }
        if (myUid > 0) {
            jSONObject.put(sg.bigo.ads.a.a.w, myUid);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return sg.bigo.ads.a.a.s;
    }
}
