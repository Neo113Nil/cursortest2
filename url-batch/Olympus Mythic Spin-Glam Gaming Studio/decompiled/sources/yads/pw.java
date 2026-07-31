package yads;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class pw {
    public final uo2 a;

    public pw(uo2 uo2Var) {
        this.a = uo2Var;
    }

    public static void a(Context context, Function2 function2) {
        if (qw.a == null) {
            synchronized (qw.b) {
                try {
                    if (qw.a == null) {
                        qw.a = rw.a(context);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        sw swVar = qw.a;
        if (swVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function2.invoke("gdpr", swVar.c());
        function2.invoke(InMobiSdk.IM_GDPR_CONSENT_IAB, swVar.b());
        function2.invoke("parsed_purpose_consents", swVar.d());
        function2.invoke("parsed_vendor_consents", swVar.e());
        function2.invoke("cmp_present", Integer.valueOf(swVar.a() ? 1 : 0).toString());
    }
}
