package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class sm0 {
    public final dx2 a;
    public final fy2 b;
    public final rg0 c;
    public final zg1 d;
    public final jc e;
    public final tm0 f;
    public final ic g;
    public final om0 h;

    public sm0(Context context, v3 v3Var) {
        dx2 dx2Var = new dx2();
        fy2 fy2Var = new fy2();
        rg0 rg0Var = new rg0();
        zg1 a = yg1.a(context);
        jc jcVar = new jc();
        tm0 tm0Var = new tm0();
        this.a = dx2Var;
        this.b = fy2Var;
        this.c = rg0Var;
        this.d = a;
        this.e = jcVar;
        this.f = tm0Var;
        jx jxVar = v3Var.b;
        this.g = jxVar.b;
        this.h = jxVar.a;
    }

    public final void a(Context context, Function2 function2) {
        Location a;
        function2.invoke("app_id", context.getPackageName());
        function2.invoke("app_version_code", ff.a(context));
        function2.invoke(CommonUrlParts.APP_VERSION, ff.b(context));
        function2.invoke("vast-integration-type", "inapp_sdk");
        function2.invoke("sdk_version", this.a.a("%d.%d%d"));
        function2.invoke("sdk_version_name", this.a.a("%d.%d.%d"));
        function2.invoke("sdk_vendor", "yandex");
        function2.invoke(this.f.b(), this.c.a(context));
        this.c.b.getClass();
        function2.invoke(CommonUrlParts.LOCALE, ug1.a(context.getResources().getConfiguration().locale));
        function2.invoke("content_language", this.c.b.a(context));
        List b = this.c.b.b(context);
        function2.invoke("device_languages", b != null ? CollectionsKt.joinToString$default(b, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null);
        Object c = this.f.c();
        this.c.getClass();
        function2.invoke(c, rg0.a());
        Object d = this.f.d();
        this.c.getClass();
        function2.invoke(d, Build.MODEL);
        Object e = this.f.e();
        this.c.getClass();
        function2.invoke(e, "android");
        Object f = this.f.f();
        this.c.getClass();
        function2.invoke(f, Build.VERSION.RELEASE);
        if (!this.b.b(context) && (a = this.d.a()) != null) {
            function2.invoke("location_timestamp", String.valueOf(a.getTime()));
            function2.invoke("lat", String.valueOf(a.getLatitude()));
            function2.invoke(POBConstants.KEY_LONGITUDE, String.valueOf(a.getLongitude()));
            function2.invoke("precision", String.valueOf(Math.round(a.getAccuracy())));
        }
        if (!this.b.b(context)) {
            function2.invoke(this.f.a(), this.h.a);
            function2.invoke(CommonUrlParts.APP_SET_ID, this.g.d);
            mc mcVar = this.g.a;
            boolean z = false;
            if (mcVar != null) {
                boolean z2 = mcVar.b;
                String str = mcVar.a;
                this.e.getClass();
                boolean z3 = (str == null || str.length() == 0 || Intrinsics.areEqual(MobileFuseDefaults.ADVERTISING_ID_ZEROS, str)) ? false : true;
                if (!z2 && z3) {
                    function2.invoke("google_aid", str);
                }
            }
            mc mcVar2 = this.g.b;
            if (mcVar2 != null) {
                boolean z4 = mcVar2.b;
                String str2 = mcVar2.a;
                this.e.getClass();
                if (str2 != null && str2.length() != 0 && !Intrinsics.areEqual(MobileFuseDefaults.ADVERTISING_ID_ZEROS, str2)) {
                    z = true;
                }
                if (!z4 && z) {
                    function2.invoke("huawei_oaid", str2);
                }
            }
        }
        function2.invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(hl3.d(context)));
        function2.invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(hl3.b(context)));
        function2.invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        function2.invoke(CommonUrlParts.SCREEN_DPI, String.valueOf(hl3.a(context)));
    }
}
