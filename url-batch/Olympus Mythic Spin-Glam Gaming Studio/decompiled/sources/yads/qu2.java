package yads;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class qu2 implements ap2 {
    public final vw2 a;
    public final tu2 b;
    public final ou2 c;
    public final Context d;

    public qu2(Context context, mt1 mt1Var) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        tu2 tu2Var = new tu2(mt1Var);
        ou2 ou2Var = new ou2();
        this.a = vw2Var2;
        this.b = tu2Var;
        this.c = ou2Var;
        this.d = context.getApplicationContext();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:8|9|(1:11)(1:113)|12|(1:14)(1:112)|15|(1:17)(1:111)|18|(1:20)(1:110)|21|(3:103|104|(2:106|(39:109|24|25|26|(1:28)(1:97)|29|30|31|32|(1:34)|35|36|37|38|(1:40)|41|(1:43)(1:90)|44|(1:46)(1:89)|47|(1:49)|50|(1:52)(1:88)|53|(14:60|61|(13:82|83|84|64|(1:66)(1:81)|67|68|69|70|(1:72)|73|74|75)|63|64|(0)(0)|67|68|69|70|(0)|73|74|75)|87|61|(0)|63|64|(0)(0)|67|68|69|70|(0)|73|74|75)))|23|24|25|26|(0)(0)|29|30|31|32|(0)|35|36|37|38|(0)|41|(0)(0)|44|(0)(0)|47|(0)|50|(0)(0)|53|(16:55|57|60|61|(0)|63|64|(0)(0)|67|68|69|70|(0)|73|74|75)|87|61|(0)|63|64|(0)(0)|67|68|69|70|(0)|73|74|75) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03eb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03ec, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x025f, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0239, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x023a, code lost:
    
        r7 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m8023constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ea A[Catch: JSONException -> 0x0076, TryCatch #1 {JSONException -> 0x0076, blocks: (B:9:0x0038, B:11:0x006b, B:12:0x007b, B:14:0x00b7, B:15:0x00c4, B:17:0x00f1, B:18:0x00f8, B:20:0x0169, B:21:0x0174, B:26:0x01d8, B:28:0x01ea, B:29:0x01f8, B:32:0x0244, B:35:0x024b, B:38:0x0269, B:41:0x0270, B:43:0x028e, B:44:0x029b, B:46:0x02af, B:47:0x02bd, B:49:0x0305, B:50:0x0309, B:52:0x034d, B:53:0x035a, B:55:0x036d, B:57:0x0375, B:60:0x037c, B:61:0x0386, B:64:0x03af, B:66:0x03c1, B:67:0x03ce, B:70:0x03f6, B:73:0x03fd, B:80:0x03ec, B:93:0x025f, B:96:0x023a, B:31:0x0228, B:69:0x03da, B:37:0x024f), top: B:8:0x0038, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x028e A[Catch: JSONException -> 0x0076, TryCatch #1 {JSONException -> 0x0076, blocks: (B:9:0x0038, B:11:0x006b, B:12:0x007b, B:14:0x00b7, B:15:0x00c4, B:17:0x00f1, B:18:0x00f8, B:20:0x0169, B:21:0x0174, B:26:0x01d8, B:28:0x01ea, B:29:0x01f8, B:32:0x0244, B:35:0x024b, B:38:0x0269, B:41:0x0270, B:43:0x028e, B:44:0x029b, B:46:0x02af, B:47:0x02bd, B:49:0x0305, B:50:0x0309, B:52:0x034d, B:53:0x035a, B:55:0x036d, B:57:0x0375, B:60:0x037c, B:61:0x0386, B:64:0x03af, B:66:0x03c1, B:67:0x03ce, B:70:0x03f6, B:73:0x03fd, B:80:0x03ec, B:93:0x025f, B:96:0x023a, B:31:0x0228, B:69:0x03da, B:37:0x024f), top: B:8:0x0038, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02af A[Catch: JSONException -> 0x0076, TryCatch #1 {JSONException -> 0x0076, blocks: (B:9:0x0038, B:11:0x006b, B:12:0x007b, B:14:0x00b7, B:15:0x00c4, B:17:0x00f1, B:18:0x00f8, B:20:0x0169, B:21:0x0174, B:26:0x01d8, B:28:0x01ea, B:29:0x01f8, B:32:0x0244, B:35:0x024b, B:38:0x0269, B:41:0x0270, B:43:0x028e, B:44:0x029b, B:46:0x02af, B:47:0x02bd, B:49:0x0305, B:50:0x0309, B:52:0x034d, B:53:0x035a, B:55:0x036d, B:57:0x0375, B:60:0x037c, B:61:0x0386, B:64:0x03af, B:66:0x03c1, B:67:0x03ce, B:70:0x03f6, B:73:0x03fd, B:80:0x03ec, B:93:0x025f, B:96:0x023a, B:31:0x0228, B:69:0x03da, B:37:0x024f), top: B:8:0x0038, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0305 A[Catch: JSONException -> 0x0076, TryCatch #1 {JSONException -> 0x0076, blocks: (B:9:0x0038, B:11:0x006b, B:12:0x007b, B:14:0x00b7, B:15:0x00c4, B:17:0x00f1, B:18:0x00f8, B:20:0x0169, B:21:0x0174, B:26:0x01d8, B:28:0x01ea, B:29:0x01f8, B:32:0x0244, B:35:0x024b, B:38:0x0269, B:41:0x0270, B:43:0x028e, B:44:0x029b, B:46:0x02af, B:47:0x02bd, B:49:0x0305, B:50:0x0309, B:52:0x034d, B:53:0x035a, B:55:0x036d, B:57:0x0375, B:60:0x037c, B:61:0x0386, B:64:0x03af, B:66:0x03c1, B:67:0x03ce, B:70:0x03f6, B:73:0x03fd, B:80:0x03ec, B:93:0x025f, B:96:0x023a, B:31:0x0228, B:69:0x03da, B:37:0x024f), top: B:8:0x0038, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x034d A[Catch: JSONException -> 0x0076, TryCatch #1 {JSONException -> 0x0076, blocks: (B:9:0x0038, B:11:0x006b, B:12:0x007b, B:14:0x00b7, B:15:0x00c4, B:17:0x00f1, B:18:0x00f8, B:20:0x0169, B:21:0x0174, B:26:0x01d8, B:28:0x01ea, B:29:0x01f8, B:32:0x0244, B:35:0x024b, B:38:0x0269, B:41:0x0270, B:43:0x028e, B:44:0x029b, B:46:0x02af, B:47:0x02bd, B:49:0x0305, B:50:0x0309, B:52:0x034d, B:53:0x035a, B:55:0x036d, B:57:0x0375, B:60:0x037c, B:61:0x0386, B:64:0x03af, B:66:0x03c1, B:67:0x03ce, B:70:0x03f6, B:73:0x03fd, B:80:0x03ec, B:93:0x025f, B:96:0x023a, B:31:0x0228, B:69:0x03da, B:37:0x024f), top: B:8:0x0038, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03c1 A[Catch: JSONException -> 0x0076, TryCatch #1 {JSONException -> 0x0076, blocks: (B:9:0x0038, B:11:0x006b, B:12:0x007b, B:14:0x00b7, B:15:0x00c4, B:17:0x00f1, B:18:0x00f8, B:20:0x0169, B:21:0x0174, B:26:0x01d8, B:28:0x01ea, B:29:0x01f8, B:32:0x0244, B:35:0x024b, B:38:0x0269, B:41:0x0270, B:43:0x028e, B:44:0x029b, B:46:0x02af, B:47:0x02bd, B:49:0x0305, B:50:0x0309, B:52:0x034d, B:53:0x035a, B:55:0x036d, B:57:0x0375, B:60:0x037c, B:61:0x0386, B:64:0x03af, B:66:0x03c1, B:67:0x03ce, B:70:0x03f6, B:73:0x03fd, B:80:0x03ec, B:93:0x025f, B:96:0x023a, B:31:0x0228, B:69:0x03da, B:37:0x024f), top: B:8:0x0038, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0393 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f6  */
    @Override // yads.ap2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u82 u82Var) {
        lm0 lm0Var;
        JSONObject optJSONObject;
        Map map;
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        JSONArray optJSONArray;
        Set set;
        List b;
        JSONObject optJSONObject2;
        ry2 ry2Var;
        JSONObject optJSONObject3;
        yd2 yd2Var;
        Object m8023constructorimpl3;
        String optString;
        tu2 tu2Var = this.b;
        tu2Var.b.getClass();
        int i = u82Var.a;
        zp2 zp2Var = new zp2(u82Var.b);
        Map map2 = u82Var.c;
        if (map2 == null) {
            map2 = MapsKt.emptyMap();
        }
        yp2 yp2Var = new yp2(i, zp2Var, map2);
        su2 su2Var = tu2Var.a;
        String str = (String) su2Var.b.a(yp2Var);
        Object obj = null;
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean optBoolean = jSONObject.optBoolean("custom_click_handling_enabled");
            boolean optBoolean2 = jSONObject.optBoolean("legacy_visibility_logic_enabled");
            boolean optBoolean3 = jSONObject.optBoolean("legacy_vast_tracking_enabled");
            boolean optBoolean4 = jSONObject.optBoolean("overlapping_view_tracking_enabled");
            boolean optBoolean5 = jSONObject.optBoolean("overlapping_window_tracking_enabled");
            boolean optBoolean6 = jSONObject.optBoolean("open_measurement_sdk_disabled");
            Json json = ad1.a;
            Boolean valueOf = jSONObject.has("visibility_error_indicator_enabled") ? Boolean.valueOf(jSONObject.optBoolean("visibility_error_indicator_enabled")) : null;
            String optString2 = jSONObject.optString("mraid_controller", null);
            String optString3 = jSONObject.optString("open_measurement_sdk_controller", null);
            String optString4 = jSONObject.optString("click_handler_type", null);
            String optString5 = jSONObject.optString("ad_host", null);
            String optString6 = jSONObject.optString("divkit_font", null);
            String optString7 = jSONObject.optString("instream_design", null);
            boolean optBoolean7 = jSONObject.optBoolean("sensitive_mode_disabled");
            boolean optBoolean8 = jSONObject.optBoolean("hard_sensitive_mode_enabled");
            boolean optBoolean9 = jSONObject.optBoolean("encrypted_requests_enabled");
            Boolean valueOf2 = jSONObject.has("mediation_sensitive_mode_disabled") ? Boolean.valueOf(jSONObject.optBoolean("mediation_sensitive_mode_disabled")) : null;
            boolean optBoolean10 = jSONObject.optBoolean("fused_location_provider_disabled");
            boolean optBoolean11 = jSONObject.optBoolean("lock_screen_enabled");
            boolean optBoolean12 = jSONObject.optBoolean("impression_validation_on_click_enabled");
            boolean optBoolean13 = jSONObject.optBoolean("legacy_slider_impression_enabled");
            long optLong = jSONObject.optLong("reload_timeout");
            su2Var.c.getClass();
            long currentTimeMillis = System.currentTimeMillis() + (optLong > 0 ? optLong * 1000 : 86400000L);
            int optInt = jSONObject.optInt("ad_ids_storage_size");
            int optInt2 = jSONObject.optInt("native_web_view_pool_size");
            long optLong2 = jSONObject.optLong("max_disk_cache_size_bytes_for_video");
            long optLong3 = jSONObject.optLong("max_disk_cache_size_bytes_for_request_queue");
            Integer a = ad1.a("ad_request_max_retries", jSONObject);
            Integer a2 = ad1.a("ping_request_max_retries", jSONObject);
            boolean optBoolean14 = jSONObject.optBoolean("show_version_validation_error_log", false);
            boolean optBoolean15 = jSONObject.optBoolean("show_version_validation_error_indicator", false);
            boolean optBoolean16 = jSONObject.optBoolean("fullscreen_back_button_enabled", false);
            boolean optBoolean17 = jSONObject.optBoolean("location_consent", false);
            boolean optBoolean18 = jSONObject.optBoolean("divkit_disabled", false);
            boolean optBoolean19 = jSONObject.optBoolean("libssl_enabled", false);
            String optString8 = jSONObject.optString("light_bundle_script_url", null);
            boolean optBoolean20 = jSONObject.optBoolean("should_wait_light_bundle_script_loading_on_configuration", false);
            boolean optBoolean21 = jSONObject.optBoolean("should_start_light_bundle_script_loading_on_configuration", false);
            boolean optBoolean22 = jSONObject.optBoolean("client_bidding_startup_initialization_enabled");
            boolean optBoolean23 = jSONObject.optBoolean("header_bidding_startup_initialization_enabled");
            JSONObject optJSONObject4 = jSONObject.optJSONObject("bidding_settings");
            ap b2 = optJSONObject4 != null ? su2Var.e.b(optJSONObject4) : null;
            JSONObject optJSONObject5 = jSONObject.optJSONObject("encryption");
            su2Var.d.getClass();
            if (optJSONObject5 != null) {
                try {
                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("rsa");
                    if (optJSONObject6 != null) {
                        String optString9 = optJSONObject6.optString("public_key", "");
                        Integer a3 = ad1.a("version", optJSONObject6);
                        if (optString9.length() > 0 && a3 != null) {
                            lm0Var = new lm0(a3.intValue(), optString9);
                            boolean optBoolean24 = jSONObject.optBoolean("legacy_impression_callback_enabled", false);
                            boolean optBoolean25 = jSONObject.optBoolean("close_fullscreen_with_adtune_disabled", false);
                            boolean optBoolean26 = jSONObject.optBoolean("render_asset_validation_enabled", false);
                            boolean optBoolean27 = jSONObject.optBoolean("automatic_sdk_initialization_delay_enabled", false);
                            boolean optBoolean28 = jSONObject.optBoolean("native_banner_enabled", false);
                            boolean optBoolean29 = jSONObject.optBoolean("use_divkit_close_action_instead_system_click", false);
                            obj = null;
                            String optString10 = jSONObject.optString("banner_size_calculation_type", null);
                            String optString11 = jSONObject.optString("startup_version", null);
                            optJSONObject = jSONObject.optJSONObject("startup_parameters");
                            if (optJSONObject == null) {
                                su2Var.h.getClass();
                                map = a43.a(optJSONObject);
                            } else {
                                map = null;
                            }
                            boolean optBoolean30 = jSONObject.optBoolean("app_open_ad_preloading_enabled", false);
                            boolean optBoolean31 = jSONObject.optBoolean("interstitial_preloading_enabled", false);
                            boolean optBoolean32 = jSONObject.optBoolean("rewarded_preloading_enabled", false);
                            boolean optBoolean33 = jSONObject.optBoolean("new_false_click_tracking_enabled", false);
                            boolean optBoolean34 = jSONObject.optBoolean("varioqub_enabled", false);
                            boolean optBoolean35 = jSONObject.optBoolean("crash_tracker_enabled", false);
                            boolean optBoolean36 = jSONObject.optBoolean("error_tracker_enabled", false);
                            boolean optBoolean37 = jSONObject.optBoolean("anr_tracker_enabled", false);
                            Result.Companion companion = Result.INSTANCE;
                            m8023constructorimpl = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("anr_tracker_interval")));
                            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                                m8023constructorimpl = null;
                            }
                            Long l = (Long) m8023constructorimpl;
                            m8023constructorimpl2 = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("anr_tracker_threshold")));
                            if (Result.m8028isFailureimpl(m8023constructorimpl2)) {
                                m8023constructorimpl2 = null;
                            }
                            Long l2 = (Long) m8023constructorimpl2;
                            boolean optBoolean38 = jSONObject.optBoolean("exit_info_anr_tracker_enabled", false);
                            Integer a4 = su2.a("exit_info_anr_tracker_max_results", jSONObject);
                            Integer a5 = su2.a("exit_info_anr_tracker_historical_threshold_days", jSONObject);
                            Boolean valueOf3 = !jSONObject.has("exit_info_anr_tracker_enriched_traces_enabled") ? Boolean.valueOf(jSONObject.optBoolean("exit_info_anr_tracker_enriched_traces_enabled")) : null;
                            boolean optBoolean39 = jSONObject.optBoolean("crash_ignore_enabled", false);
                            boolean optBoolean40 = jSONObject.optBoolean("pause_ad_on_adtune_enabled", false);
                            optJSONArray = jSONObject.optJSONArray("crash_stack_trace_exclusion_rules");
                            if (optJSONArray == null) {
                                su2Var.f.getClass();
                                set = fn0.a(optJSONArray);
                            } else {
                                set = null;
                            }
                            boolean optBoolean41 = jSONObject.optBoolean("time_stamping_tracking_urls_enabled", false);
                            boolean optBoolean42 = jSONObject.optBoolean("app_ad_analytics_reporting_enabled", true);
                            boolean optBoolean43 = jSONObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
                            Integer a6 = su2.a("network_thread_pool_size", jSONObject);
                            Integer a7 = su2.a("image_loading_thread_pool_size", jSONObject);
                            Integer a8 = su2.a("timeout_interval_for_request", jSONObject);
                            Integer a9 = su2.a("timeout_interval_for_ping_request", jSONObject);
                            s6 s6Var = su2Var.g;
                            JSONObject optJSONObject7 = jSONObject.optJSONObject("verification_configuration");
                            s6Var.getClass();
                            d7 a10 = s6.a(optJSONObject7);
                            boolean optBoolean44 = jSONObject.optBoolean("sdk_tracking_reporter_enabled", false);
                            b = ad1.b("fallback_hosts", jSONObject);
                            if (b == null) {
                                b = CollectionsKt.emptyList();
                            }
                            List list = b;
                            boolean optBoolean45 = jSONObject.optBoolean("should_prefetch_dns", false);
                            boolean optBoolean46 = jSONObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
                            boolean optBoolean47 = jSONObject.optBoolean("outstream_wrapper_video_supported", false);
                            boolean optBoolean48 = jSONObject.optBoolean("validate_click_in_web_view", false);
                            boolean optBoolean49 = jSONObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
                            Integer a11 = su2.a("instream_qrcode_size_in_px", jSONObject);
                            boolean optBoolean50 = jSONObject.optBoolean("hide_bottom_navigation_bar", false);
                            boolean optBoolean51 = jSONObject.optBoolean("pre_warm_web_view_on_background", false);
                            boolean optBoolean52 = jSONObject.optBoolean("sdk_network_debug_enabled", false);
                            boolean optBoolean53 = jSONObject.optBoolean("support_gif", false);
                            tv0 a12 = !jSONObject.has("font") ? vv0.a(jSONObject.getJSONObject("font")) : null;
                            boolean optBoolean54 = jSONObject.optBoolean("force_default_player", false);
                            optJSONObject2 = jSONObject.optJSONObject("session");
                            su2Var.i.getClass();
                            if (optJSONObject2 != null && (optString = optJSONObject2.optString("token")) != null && optString.length() != 0) {
                                ry2Var = new ry2(optString);
                                optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                                ae2 ae2Var = su2Var.j;
                                ae2Var.getClass();
                                if (optJSONObject3 != null) {
                                    try {
                                        Json json2 = ae2Var.a;
                                        String jSONObject2 = optJSONObject3.toString();
                                        json2.getSerializersModule();
                                        yd2Var = (yd2) json2.decodeFromString(yd2.Companion.serializer(), jSONObject2);
                                    } catch (Exception unused) {
                                    }
                                    List a13 = su2.a(jSONObject.optJSONArray("smart_preload_blocks"));
                                    JSONObject optJSONObject8 = jSONObject.optJSONObject("mediation_ad_load_timeouts");
                                    pq1 b3 = optJSONObject8 != null ? oq1.b(optJSONObject8.toString()) : null;
                                    boolean optBoolean55 = jSONObject.optBoolean("is_new_request_parameters_enabled", false);
                                    boolean optBoolean56 = jSONObject.optBoolean("advertising_ids_fallback_enabled", false);
                                    Result.Companion companion2 = Result.INSTANCE;
                                    m8023constructorimpl3 = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("advertising_ids_receive_timeout")));
                                    if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
                                        m8023constructorimpl3 = null;
                                    }
                                    return new bu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean25, optBoolean24, optBoolean18, optBoolean6, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean26, optBoolean27, optBoolean28, optBoolean29, optBoolean30, optBoolean31, optBoolean32, optBoolean33, optBoolean34, a, a2, uw2.a().e(), uw2.a().c(), optBoolean17, valueOf, optString10, optString2, optString3, "8.1.0", optString4, optString7, optString5, optString6, valueOf2, lm0Var, optBoolean22, optBoolean23, b2, optString11, map, optBoolean35, optBoolean36, optBoolean37, l, l2, optBoolean38, a4, a5, valueOf3, optBoolean39, optBoolean40, set, optBoolean41, optBoolean42, optBoolean43, a6, a7, a8, a9, a10, optBoolean44, list, optBoolean45, optBoolean46, optBoolean47, optBoolean48, optBoolean49, a11, optBoolean50, optBoolean51, a12, optBoolean54, optBoolean53, ry2Var, yd2Var, optBoolean52, a13, b3, optBoolean55, optBoolean56, (Long) m8023constructorimpl3);
                                }
                                yd2Var = null;
                                List a132 = su2.a(jSONObject.optJSONArray("smart_preload_blocks"));
                                JSONObject optJSONObject82 = jSONObject.optJSONObject("mediation_ad_load_timeouts");
                                if (optJSONObject82 != null) {
                                }
                                boolean optBoolean552 = jSONObject.optBoolean("is_new_request_parameters_enabled", false);
                                boolean optBoolean562 = jSONObject.optBoolean("advertising_ids_fallback_enabled", false);
                                Result.Companion companion22 = Result.INSTANCE;
                                m8023constructorimpl3 = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("advertising_ids_receive_timeout")));
                                if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
                                }
                                return new bu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean25, optBoolean24, optBoolean18, optBoolean6, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean26, optBoolean27, optBoolean28, optBoolean29, optBoolean30, optBoolean31, optBoolean32, optBoolean33, optBoolean34, a, a2, uw2.a().e(), uw2.a().c(), optBoolean17, valueOf, optString10, optString2, optString3, "8.1.0", optString4, optString7, optString5, optString6, valueOf2, lm0Var, optBoolean22, optBoolean23, b2, optString11, map, optBoolean35, optBoolean36, optBoolean37, l, l2, optBoolean38, a4, a5, valueOf3, optBoolean39, optBoolean40, set, optBoolean41, optBoolean42, optBoolean43, a6, a7, a8, a9, a10, optBoolean44, list, optBoolean45, optBoolean46, optBoolean47, optBoolean48, optBoolean49, a11, optBoolean50, optBoolean51, a12, optBoolean54, optBoolean53, ry2Var, yd2Var, optBoolean52, a132, b3, optBoolean552, optBoolean562, (Long) m8023constructorimpl3);
                            }
                            ry2Var = null;
                            optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                            ae2 ae2Var2 = su2Var.j;
                            ae2Var2.getClass();
                            if (optJSONObject3 != null) {
                            }
                            yd2Var = null;
                            List a1322 = su2.a(jSONObject.optJSONArray("smart_preload_blocks"));
                            JSONObject optJSONObject822 = jSONObject.optJSONObject("mediation_ad_load_timeouts");
                            if (optJSONObject822 != null) {
                            }
                            boolean optBoolean5522 = jSONObject.optBoolean("is_new_request_parameters_enabled", false);
                            boolean optBoolean5622 = jSONObject.optBoolean("advertising_ids_fallback_enabled", false);
                            Result.Companion companion222 = Result.INSTANCE;
                            m8023constructorimpl3 = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("advertising_ids_receive_timeout")));
                            if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
                            }
                            return new bu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean25, optBoolean24, optBoolean18, optBoolean6, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean26, optBoolean27, optBoolean28, optBoolean29, optBoolean30, optBoolean31, optBoolean32, optBoolean33, optBoolean34, a, a2, uw2.a().e(), uw2.a().c(), optBoolean17, valueOf, optString10, optString2, optString3, "8.1.0", optString4, optString7, optString5, optString6, valueOf2, lm0Var, optBoolean22, optBoolean23, b2, optString11, map, optBoolean35, optBoolean36, optBoolean37, l, l2, optBoolean38, a4, a5, valueOf3, optBoolean39, optBoolean40, set, optBoolean41, optBoolean42, optBoolean43, a6, a7, a8, a9, a10, optBoolean44, list, optBoolean45, optBoolean46, optBoolean47, optBoolean48, optBoolean49, a11, optBoolean50, optBoolean51, a12, optBoolean54, optBoolean53, ry2Var, yd2Var, optBoolean52, a1322, b3, optBoolean5522, optBoolean5622, (Long) m8023constructorimpl3);
                        }
                    }
                } catch (JSONException e) {
                    e = e;
                    obj = null;
                    boolean z = ob1.a;
                    su2Var.a.reportError("Can't parse sdk configuration response", e);
                    return obj;
                }
            }
            lm0Var = null;
            boolean optBoolean242 = jSONObject.optBoolean("legacy_impression_callback_enabled", false);
            boolean optBoolean252 = jSONObject.optBoolean("close_fullscreen_with_adtune_disabled", false);
            boolean optBoolean262 = jSONObject.optBoolean("render_asset_validation_enabled", false);
            boolean optBoolean272 = jSONObject.optBoolean("automatic_sdk_initialization_delay_enabled", false);
            boolean optBoolean282 = jSONObject.optBoolean("native_banner_enabled", false);
            boolean optBoolean292 = jSONObject.optBoolean("use_divkit_close_action_instead_system_click", false);
            obj = null;
            String optString102 = jSONObject.optString("banner_size_calculation_type", null);
            String optString112 = jSONObject.optString("startup_version", null);
            optJSONObject = jSONObject.optJSONObject("startup_parameters");
            if (optJSONObject == null) {
            }
            boolean optBoolean302 = jSONObject.optBoolean("app_open_ad_preloading_enabled", false);
            boolean optBoolean312 = jSONObject.optBoolean("interstitial_preloading_enabled", false);
            boolean optBoolean322 = jSONObject.optBoolean("rewarded_preloading_enabled", false);
            boolean optBoolean332 = jSONObject.optBoolean("new_false_click_tracking_enabled", false);
            boolean optBoolean342 = jSONObject.optBoolean("varioqub_enabled", false);
            boolean optBoolean352 = jSONObject.optBoolean("crash_tracker_enabled", false);
            boolean optBoolean362 = jSONObject.optBoolean("error_tracker_enabled", false);
            boolean optBoolean372 = jSONObject.optBoolean("anr_tracker_enabled", false);
            Result.Companion companion3 = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("anr_tracker_interval")));
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
            }
            Long l3 = (Long) m8023constructorimpl;
            m8023constructorimpl2 = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("anr_tracker_threshold")));
            if (Result.m8028isFailureimpl(m8023constructorimpl2)) {
            }
            Long l22 = (Long) m8023constructorimpl2;
            boolean optBoolean382 = jSONObject.optBoolean("exit_info_anr_tracker_enabled", false);
            Integer a42 = su2.a("exit_info_anr_tracker_max_results", jSONObject);
            Integer a52 = su2.a("exit_info_anr_tracker_historical_threshold_days", jSONObject);
            if (!jSONObject.has("exit_info_anr_tracker_enriched_traces_enabled")) {
            }
            boolean optBoolean392 = jSONObject.optBoolean("crash_ignore_enabled", false);
            boolean optBoolean402 = jSONObject.optBoolean("pause_ad_on_adtune_enabled", false);
            optJSONArray = jSONObject.optJSONArray("crash_stack_trace_exclusion_rules");
            if (optJSONArray == null) {
            }
            boolean optBoolean412 = jSONObject.optBoolean("time_stamping_tracking_urls_enabled", false);
            boolean optBoolean422 = jSONObject.optBoolean("app_ad_analytics_reporting_enabled", true);
            boolean optBoolean432 = jSONObject.optBoolean("app_metrica_easy_integration_auto_activation_disabled", false);
            Integer a62 = su2.a("network_thread_pool_size", jSONObject);
            Integer a72 = su2.a("image_loading_thread_pool_size", jSONObject);
            Integer a82 = su2.a("timeout_interval_for_request", jSONObject);
            Integer a92 = su2.a("timeout_interval_for_ping_request", jSONObject);
            s6 s6Var2 = su2Var.g;
            JSONObject optJSONObject72 = jSONObject.optJSONObject("verification_configuration");
            s6Var2.getClass();
            d7 a102 = s6.a(optJSONObject72);
            boolean optBoolean442 = jSONObject.optBoolean("sdk_tracking_reporter_enabled", false);
            b = ad1.b("fallback_hosts", jSONObject);
            if (b == null) {
            }
            List list2 = b;
            boolean optBoolean452 = jSONObject.optBoolean("should_prefetch_dns", false);
            boolean optBoolean462 = jSONObject.optBoolean("should_use_ad_rendered_web_view_callback", false);
            boolean optBoolean472 = jSONObject.optBoolean("outstream_wrapper_video_supported", false);
            boolean optBoolean482 = jSONObject.optBoolean("validate_click_in_web_view", false);
            boolean optBoolean492 = jSONObject.optBoolean("pass_full_screen_height_from_sdk_enabled", false);
            Integer a112 = su2.a("instream_qrcode_size_in_px", jSONObject);
            boolean optBoolean502 = jSONObject.optBoolean("hide_bottom_navigation_bar", false);
            boolean optBoolean512 = jSONObject.optBoolean("pre_warm_web_view_on_background", false);
            boolean optBoolean522 = jSONObject.optBoolean("sdk_network_debug_enabled", false);
            boolean optBoolean532 = jSONObject.optBoolean("support_gif", false);
            if (!jSONObject.has("font")) {
            }
            boolean optBoolean542 = jSONObject.optBoolean("force_default_player", false);
            optJSONObject2 = jSONObject.optJSONObject("session");
            su2Var.i.getClass();
            if (optJSONObject2 != null) {
                ry2Var = new ry2(optString);
                optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
                ae2 ae2Var22 = su2Var.j;
                ae2Var22.getClass();
                if (optJSONObject3 != null) {
                }
                yd2Var = null;
                List a13222 = su2.a(jSONObject.optJSONArray("smart_preload_blocks"));
                JSONObject optJSONObject8222 = jSONObject.optJSONObject("mediation_ad_load_timeouts");
                if (optJSONObject8222 != null) {
                }
                boolean optBoolean55222 = jSONObject.optBoolean("is_new_request_parameters_enabled", false);
                boolean optBoolean56222 = jSONObject.optBoolean("advertising_ids_fallback_enabled", false);
                Result.Companion companion2222 = Result.INSTANCE;
                m8023constructorimpl3 = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("advertising_ids_receive_timeout")));
                if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
                }
                return new bu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean252, optBoolean242, optBoolean18, optBoolean6, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean262, optBoolean272, optBoolean282, optBoolean292, optBoolean302, optBoolean312, optBoolean322, optBoolean332, optBoolean342, a, a2, uw2.a().e(), uw2.a().c(), optBoolean17, valueOf, optString102, optString2, optString3, "8.1.0", optString4, optString7, optString5, optString6, valueOf2, lm0Var, optBoolean22, optBoolean23, b2, optString112, map, optBoolean352, optBoolean362, optBoolean372, l3, l22, optBoolean382, a42, a52, valueOf3, optBoolean392, optBoolean402, set, optBoolean412, optBoolean422, optBoolean432, a62, a72, a82, a92, a102, optBoolean442, list2, optBoolean452, optBoolean462, optBoolean472, optBoolean482, optBoolean492, a112, optBoolean502, optBoolean512, a12, optBoolean542, optBoolean532, ry2Var, yd2Var, optBoolean522, a13222, b3, optBoolean55222, optBoolean56222, (Long) m8023constructorimpl3);
            }
            ry2Var = null;
            optJSONObject3 = jSONObject.optJSONObject("playback_optimization_config");
            ae2 ae2Var222 = su2Var.j;
            ae2Var222.getClass();
            if (optJSONObject3 != null) {
            }
            yd2Var = null;
            List a132222 = su2.a(jSONObject.optJSONArray("smart_preload_blocks"));
            JSONObject optJSONObject82222 = jSONObject.optJSONObject("mediation_ad_load_timeouts");
            if (optJSONObject82222 != null) {
            }
            boolean optBoolean552222 = jSONObject.optBoolean("is_new_request_parameters_enabled", false);
            boolean optBoolean562222 = jSONObject.optBoolean("advertising_ids_fallback_enabled", false);
            Result.Companion companion22222 = Result.INSTANCE;
            m8023constructorimpl3 = Result.m8023constructorimpl(Long.valueOf(jSONObject.getLong("advertising_ids_receive_timeout")));
            if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
            }
            return new bu2(optInt, optInt2, optLong2, optLong3, currentTimeMillis, optBoolean, optBoolean10, optBoolean11, optBoolean7, optBoolean8, optBoolean2, optBoolean3, optBoolean4, optBoolean5, optBoolean12, optBoolean13, optBoolean15, optBoolean14, optBoolean16, optBoolean252, optBoolean242, optBoolean18, optBoolean6, optBoolean19, optString8, optBoolean20, optBoolean21, optBoolean9, optBoolean262, optBoolean272, optBoolean282, optBoolean292, optBoolean302, optBoolean312, optBoolean322, optBoolean332, optBoolean342, a, a2, uw2.a().e(), uw2.a().c(), optBoolean17, valueOf, optString102, optString2, optString3, "8.1.0", optString4, optString7, optString5, optString6, valueOf2, lm0Var, optBoolean22, optBoolean23, b2, optString112, map, optBoolean352, optBoolean362, optBoolean372, l3, l22, optBoolean382, a42, a52, valueOf3, optBoolean392, optBoolean402, set, optBoolean412, optBoolean422, optBoolean432, a62, a72, a82, a92, a102, optBoolean442, list2, optBoolean452, optBoolean462, optBoolean472, optBoolean482, optBoolean492, a112, optBoolean502, optBoolean512, a12, optBoolean542, optBoolean532, ry2Var, yd2Var, optBoolean522, a132222, b3, optBoolean552222, optBoolean562222, (Long) m8023constructorimpl3);
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public final boolean a() {
        vw2 vw2Var;
        bu2 a = this.a.a(this.d);
        if (a != null) {
            ou2 ou2Var = this.c;
            q53 q53Var = ou2Var.a.a;
            if (System.currentTimeMillis() < a.e) {
                ou2Var.b.getClass();
                if (Intrinsics.areEqual("8.1.0", a.U)) {
                    ou2Var.c.getClass();
                    vw2 vw2Var2 = vw2.l;
                    if (vw2Var2 == null) {
                        synchronized (vw2.k) {
                            vw2Var = vw2.l;
                            if (vw2Var == null) {
                                vw2Var = new vw2();
                                vw2.l = vw2Var;
                            }
                        }
                        vw2Var2 = vw2Var;
                    }
                    if (Intrinsics.areEqual(vw2Var2.e(), a.N)) {
                        ou2Var.c.getClass();
                        if (!zy.b(a)) {
                            ou2Var.c.getClass();
                            if (!zy.a(a)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
