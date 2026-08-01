package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.vectorharbor.planetvectorsurvey.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class t21 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final ct0 a(Context context) {
        ct0 ct0Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    eb b = x40.b(-1, null, 6);
                    pm0 pm0Var = new pm0(new ds0(contentResolver, uriFor, new s21(b, nk.l(Looper.getMainLooper())), b, context, null));
                    xt0 xt0Var = new xt0(null);
                    gl glVar = vm.a;
                    obj = a50.N(pm0Var, new jj(nz.Q(xt0Var, o40.a)), new at0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                ct0Var = (ct0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ct0Var;
    }

    public static final vh b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof vh) {
            return (vh) tag;
        }
        return null;
    }
}
