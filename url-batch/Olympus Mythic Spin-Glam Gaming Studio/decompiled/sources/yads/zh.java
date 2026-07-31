package yads;

import android.content.Context;
import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zh {
    public final mt1 a;
    public final lf1 b;
    public final Context c;

    public zh(Context context, mt1 mt1Var, lf1 lf1Var) {
        this.a = mt1Var;
        this.b = lf1Var;
        this.c = context.getApplicationContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ph a(JSONObject jSONObject, dm dmVar) {
        ai v92Var;
        if (!o42.a(jSONObject, "name", "type", "clickable", "required")) {
            throw new o12("Native Ad json has not required attributes");
        }
        String optString = jSONObject.optString("type");
        if (optString == null || optString.length() == 0 || Intrinsics.areEqual(optString, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        String optString2 = jSONObject.optString("name");
        if (optString2 == null || optString2.length() == 0 || Intrinsics.areEqual(optString2, POBCommonConstants.NULL_VALUE)) {
            throw new o12("Native Ad json has not required attributes");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("link");
        kf1 a = optJSONObject == null ? null : this.b.a(optJSONObject, dmVar);
        Context context = this.c;
        mt1 mt1Var = this.a;
        if (Intrinsics.areEqual(optString2, "close_button")) {
            v92Var = new cw();
        } else {
            if (!Intrinsics.areEqual(optString2, "feedback")) {
                switch (optString.hashCode()) {
                    case -1034364087:
                        if (optString.equals("number")) {
                            v92Var = new v92();
                            break;
                        }
                        boolean z = ob1.a;
                        throw new o12("Native Ad json has not required attributes");
                    case -951532658:
                        if (optString.equals("qrcode")) {
                            v92Var = new gv();
                            break;
                        }
                        boolean z2 = ob1.a;
                        throw new o12("Native Ad json has not required attributes");
                    case -891985903:
                        if (optString.equals("string")) {
                            v92Var = new u43();
                            break;
                        }
                        boolean z22 = ob1.a;
                        throw new o12("Native Ad json has not required attributes");
                    case -410956671:
                        if (optString.equals("container")) {
                            v92Var = new dm0();
                            break;
                        }
                        boolean z222 = ob1.a;
                        throw new o12("Native Ad json has not required attributes");
                    case 100313435:
                        if (optString.equals("image")) {
                            v92Var = new t31();
                            break;
                        }
                        boolean z2222 = ob1.a;
                        throw new o12("Native Ad json has not required attributes");
                    case 103772132:
                        if (optString.equals("media")) {
                            v92Var = new en1(context, mt1Var, dmVar);
                            break;
                        }
                        boolean z22222 = ob1.a;
                        throw new o12("Native Ad json has not required attributes");
                    case 1124446108:
                        if (optString.equals("warning")) {
                            v92Var = new jn3();
                            break;
                        }
                        boolean z222222 = ob1.a;
                        throw new o12("Native Ad json has not required attributes");
                    default:
                        boolean z2222222 = ob1.a;
                        throw new o12("Native Ad json has not required attributes");
                }
            }
            v92Var = new qt0(new t31());
        }
        Object a2 = v92Var.a(jSONObject);
        boolean z3 = jSONObject.getBoolean("required");
        boolean z4 = jSONObject.getBoolean("clickable");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("layoutRestriction");
        return new ph(optString2, optString, a2, a, z4, z3, optJSONObject2 == null ? null : new wd1(ad1.a("minWidth", optJSONObject2), ad1.a("minHeight", optJSONObject2)));
    }
}
