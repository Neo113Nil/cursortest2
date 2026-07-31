package yads;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.X3;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class bl3 {
    public final SharedPreferences a;
    public final zk3 b;

    public bl3(Context context) {
        SharedPreferences a = dz2.a(new dz2(), context, "ViewSizeInfoStorage");
        zk3 zk3Var = new zk3();
        this.a = a;
        this.b = zk3Var;
    }

    public final void a(cl3 cl3Var, yk3 yk3Var) {
        String a = a(cl3Var);
        this.b.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", yk3Var.a.a);
        jSONObject2.put("height", yk3Var.a.b);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("width", yk3Var.b.a);
        jSONObject3.put("height", yk3Var.b.b);
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject4.put("value", yk3Var.c.a.a);
        String name = yk3Var.c.a.b.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject4.put(X3.a.t, lowerCase);
        jSONObject5.put("value", yk3Var.c.b.a);
        String lowerCase2 = yk3Var.c.b.b.name().toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        jSONObject5.put(X3.a.t, lowerCase2);
        jSONObject6.put("width", jSONObject4);
        jSONObject6.put("height", jSONObject5);
        JSONObject jSONObject7 = new JSONObject(yk3Var.d);
        jSONObject.put("view", jSONObject2);
        jSONObject.put("layout_params", jSONObject3);
        jSONObject.put("measured", jSONObject6);
        jSONObject.put("additional_info", jSONObject7);
        String jSONObject8 = jSONObject.toString();
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(a, jSONObject8);
        edit.apply();
    }

    public static String a(cl3 cl3Var) {
        return cl3Var.a() + "-" + cl3Var.b();
    }
}
