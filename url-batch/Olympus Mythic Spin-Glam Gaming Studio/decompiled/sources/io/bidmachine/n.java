package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import io.bidmachine.core.UtilsKt;
import io.bidmachine.internal.C6019n;
import io.bidmachine.internal.S;
import io.bidmachine.internal.T;
import io.bidmachine.protobuf.Extras;
import io.bidmachine.protobuf.InitResponse;
import io.bidmachine.util.MathUtils;
import io.bidmachine.util.SharedPreferenceUtilsKt;
import io.bidmachine.utils.DeviceUtils;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
abstract class n {
    private static final T a = new T();
    private static SharedPreferences b;

    static void A(Context context) {
        g(context, u(context) + 1);
    }

    static Boolean B(Context context) {
        return UtilsKt.convertToBooleanOrNull(Integer.valueOf(SharedPreferenceUtilsKt.optInt(E(context), "is_google_play_instant", -1)));
    }

    static long C(Context context) {
        SharedPreferences E = E(context);
        long optLong = SharedPreferenceUtilsKt.optLong(E, "first_app_launch_ms", 0L);
        if (optLong != 0) {
            return optLong;
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferenceUtilsKt.putLongOrRemove(E, "first_app_launch_ms", Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    static long D(Context context) {
        SharedPreferences E = E(context);
        long optLong = SharedPreferenceUtilsKt.optLong(E, "last_bootup_time", 0L);
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        if (Math.abs(optLong - currentTimeMillis) <= 3000) {
            return optLong;
        }
        SharedPreferenceUtilsKt.putLongOrRemove(E, "last_bootup_time", Long.valueOf(currentTimeMillis));
        return currentTimeMillis;
    }

    static SharedPreferences E(Context context) {
        if (b == null) {
            b = context.getSharedPreferences("BidMachinePref", 0);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit a(String str, int i, SharedPreferences.Editor editor) {
        SharedPreferenceUtilsKt.putStringOrRemove(editor, "bid_machine_ifv", str);
        SharedPreferenceUtilsKt.putIntOrRemove(editor, "bid_machine_ifv_ttl_session_count_remaining", Integer.valueOf(i));
        return Unit.INSTANCE;
    }

    static String b(Context context, final int i) {
        final String uuid = UUID.randomUUID().toString();
        SharedPreferenceUtilsKt.edit(E(context), new Function1() { // from class: io.bidmachine.n$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit a2;
                a2 = n.a(uuid, i, (SharedPreferences.Editor) obj);
                return a2;
            }
        });
        return uuid;
    }

    static void c(Context context, int i) {
        if (i == 0) {
            return;
        }
        e(context, d(context) + i);
    }

    static String d(Context context, int i) {
        String optStringOrNull = SharedPreferenceUtilsKt.optStringOrNull(E(context), "bid_machine_ifv", null);
        return !TextUtils.isEmpty(optStringOrNull) ? optStringOrNull : b(context, i);
    }

    static void e(Context context, int i) {
        SharedPreferenceUtilsKt.putIntOrRemove(E(context), "bid_machine_ifv_ttl_session_count_remaining", Integer.valueOf(MathUtils.nonNegative(i)));
    }

    static void f(Context context, int i) {
        SharedPreferenceUtilsKt.putIntOrRemove(E(context), "bid_machine_ifv_last_ttl_session_count", Integer.valueOf(MathUtils.nonNegative(i)));
    }

    static void g(Context context, int i) {
        SharedPreferenceUtilsKt.putIntOrRemove(E(context), "session_count", Integer.valueOf(i));
    }

    static Extras h(Context context) {
        SharedPreferences E = E(context);
        try {
            return Extras.parseFrom(Base64.decode(SharedPreferenceUtilsKt.optStringOrNull(E, "init_extras", null), 0));
        } catch (Exception unused) {
            SharedPreferenceUtilsKt.remove(E, "init_extras");
            return null;
        }
    }

    static InitResponse i(Context context) {
        SharedPreferences E = E(context);
        try {
            return InitResponse.parseFrom(Base64.decode(E.getString("initData", null), 0));
        } catch (Exception unused) {
            SharedPreferenceUtilsKt.remove(E, "initData");
            return null;
        }
    }

    static String j(Context context) {
        String optStringOrNull = SharedPreferenceUtilsKt.optStringOrNull(E(context), "init_data_session_id", null);
        return optStringOrNull != null ? optStringOrNull : "";
    }

    static Long k(Context context) {
        return a(E(context), "install_begin_sec");
    }

    static Long l(Context context) {
        return a(E(context), "install_begin_server_sec");
    }

    static Long m(Context context) {
        return a(E(context), "install_referrer_click_sec");
    }

    static Long n(Context context) {
        return a(E(context), "install_referrer_click_server_sec");
    }

    static String o(Context context) {
        return SharedPreferenceUtilsKt.optStringOrNull(E(context), "install_referrer_url", null);
    }

    static String p(Context context) {
        return SharedPreferenceUtilsKt.optStringOrNull(E(context), "install_version", null);
    }

    static int q(Context context) {
        return E(context).getInt("bid_machine_ifv_last_ttl_session_count", 0);
    }

    static long r(Context context) {
        return SharedPreferenceUtilsKt.optLong(E(context), "last_session_duration", 0L);
    }

    static io.bidmachine.internal.y s(Context context) {
        return io.bidmachine.internal.y.a(Integer.valueOf(SharedPreferenceUtilsKt.optInt(E(context), "restriction_mode", -1)));
    }

    static long t(Context context) {
        return SharedPreferenceUtilsKt.optLong(E(context), "sdk_install_time", 0L);
    }

    static int u(Context context) {
        return SharedPreferenceUtilsKt.optInt(E(context), "session_count", 0);
    }

    static String v(Context context) {
        return SharedPreferenceUtilsKt.optStringOrNull(E(context), "ua", null);
    }

    static String w(Context context) {
        return SharedPreferenceUtilsKt.optStringOrNull(E(context), "ua_device_os", null);
    }

    static long x(Context context) {
        return SharedPreferenceUtilsKt.optLong(E(context), "ua_exp", -1L);
    }

    static String y(Context context) {
        String v = v(context);
        if (TextUtils.isEmpty(v) || !DeviceUtils.getOsVersion().equals(w(context)) || x(context) <= System.currentTimeMillis()) {
            return null;
        }
        return v;
    }

    static boolean z(Context context) {
        return E(context).contains("bid_machine_ifv");
    }

    static void c(Context context, long j) {
        SharedPreferenceUtilsKt.putLongOrRemove(E(context), "current_session_duration", Long.valueOf(j));
    }

    static List g(Context context) {
        String optStringOrNull = SharedPreferenceUtilsKt.optStringOrNull(E(context), "history_version_milestone_list", null);
        if (TextUtils.isEmpty(optStringOrNull)) {
            return Collections.emptyList();
        }
        try {
            return a.a(new JSONArray(optStringOrNull));
        } catch (Throwable unused) {
            return Collections.emptyList();
        }
    }

    static void b(Context context, String str) {
        SharedPreferenceUtilsKt.putStringOrRemove(E(context), "ua", str);
    }

    static void a(Context context, int i) {
        int d;
        if (i != 0 && (d = d(context)) > 0) {
            e(context, MathUtils.nonNegative(d - i));
        }
    }

    static void b(Context context, long j) {
        SharedPreferenceUtilsKt.putLongOrRemove(E(context), "ua_exp", Long.valueOf(j));
    }

    static long e(Context context) {
        return SharedPreferenceUtilsKt.optLong(E(context), "current_session_duration", 0L);
    }

    static S f(Context context) {
        String optStringOrNull = SharedPreferenceUtilsKt.optStringOrNull(E(context), "current_version_milestone", null);
        if (TextUtils.isEmpty(optStringOrNull)) {
            return null;
        }
        try {
            return a.a(new JSONObject(optStringOrNull));
        } catch (Throwable unused) {
            return null;
        }
    }

    static void c(Context context) {
        SharedPreferenceUtilsKt.remove(E(context), "init_extras");
    }

    static void c(Context context, String str) {
        SharedPreferenceUtilsKt.putStringOrRemove(E(context), "ua_device_os", str);
    }

    static int d(Context context) {
        return E(context).getInt("bid_machine_ifv_ttl_session_count_remaining", 0);
    }

    static void b(Context context) {
        SharedPreferenceUtilsKt.clear(E(context));
    }

    static void d(Context context, long j) {
        SharedPreferenceUtilsKt.putLongOrRemove(E(context), "last_session_duration", Long.valueOf(j));
    }

    static void a(Context context) {
        d(context, e(context));
    }

    static void a(Context context, InitResponse initResponse, String str) {
        try {
            SharedPreferenceUtilsKt.putStringOrRemove(E(context), "initData", Base64.encodeToString(initResponse.toByteArray(), 0));
            SharedPreferenceUtilsKt.putStringOrRemove(E(context), "init_data_session_id", str);
        } catch (Exception unused) {
        }
    }

    static void a(Context context, Extras extras) {
        try {
            SharedPreferenceUtilsKt.putStringOrRemove(E(context), "init_extras", Base64.encodeToString(extras.toByteArray(), 0));
        } catch (Exception unused) {
        }
    }

    static void a(Context context, String str, long j) {
        b(context, str);
        c(context, DeviceUtils.getOsVersion());
        b(context, j);
    }

    static String a(Context context, String str) {
        return SharedPreferenceUtilsKt.optStringOrNull(E(context), "hw_info_" + str, null);
    }

    static void a(Context context, String str, String str2) {
        SharedPreferenceUtilsKt.putStringOrRemove(E(context), "hw_info_" + str, str2);
    }

    static void a(Context context, long j) {
        SharedPreferenceUtilsKt.putLongOrRemove(E(context), "sdk_install_time", Long.valueOf(j));
    }

    static void a(Context context, S s) {
        SharedPreferenceUtilsKt.putStringOrRemove(E(context), "current_version_milestone", s != null ? a.a(s).toString() : null);
    }

    static void a(Context context, List list) {
        if (list.isEmpty()) {
            SharedPreferenceUtilsKt.remove(E(context), "history_version_milestone_list");
        } else {
            SharedPreferenceUtilsKt.putStringOrRemove(E(context), "history_version_milestone_list", a.a(list).toString());
        }
    }

    static void a(Context context, final C6019n c6019n) {
        SharedPreferenceUtilsKt.edit(E(context), new Function1() { // from class: io.bidmachine.n$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit a2;
                a2 = n.a(C6019n.this, (SharedPreferences.Editor) obj);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit a(C6019n c6019n, SharedPreferences.Editor editor) {
        SharedPreferenceUtilsKt.putStringOrRemove(editor, "install_referrer_url", c6019n.e());
        SharedPreferenceUtilsKt.putStringOrRemove(editor, "install_version", c6019n.f());
        SharedPreferenceUtilsKt.putLongOrRemove(editor, "install_referrer_click_sec", c6019n.c());
        SharedPreferenceUtilsKt.putLongOrRemove(editor, "install_begin_sec", c6019n.a());
        SharedPreferenceUtilsKt.putLongOrRemove(editor, "install_referrer_click_server_sec", c6019n.d());
        SharedPreferenceUtilsKt.putLongOrRemove(editor, "install_begin_server_sec", c6019n.b());
        SharedPreferenceUtilsKt.putIntOrRemove(editor, "is_google_play_instant", UtilsKt.convertToIntOrNull(c6019n.i()));
        return Unit.INSTANCE;
    }

    static void a(Context context, io.bidmachine.internal.y yVar) {
        if (yVar == null) {
            SharedPreferenceUtilsKt.remove(E(context), "restriction_mode");
        } else {
            SharedPreferenceUtilsKt.putIntOrRemove(E(context), "restriction_mode", Integer.valueOf(yVar.b()));
        }
    }

    private static Long a(SharedPreferences sharedPreferences, String str) {
        long optLong = SharedPreferenceUtilsKt.optLong(sharedPreferences, str, -1L);
        if (optLong != -1) {
            return Long.valueOf(optLong);
        }
        return null;
    }
}
