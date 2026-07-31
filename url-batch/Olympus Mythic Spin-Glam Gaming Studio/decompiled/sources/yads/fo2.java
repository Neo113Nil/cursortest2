package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class fo2 {
    public static final fo2 A;
    public static final fo2 B;
    public static final /* synthetic */ fo2[] C;
    public static final fo2 c;
    public static final fo2 d;
    public static final fo2 e;
    public static final fo2 f;
    public static final fo2 g;
    public static final fo2 h;
    public static final fo2 i;
    public static final fo2 j;
    public static final fo2 k;
    public static final fo2 l;
    public static final fo2 m;
    public static final fo2 n;
    public static final fo2 o;
    public static final fo2 p;
    public static final fo2 q;
    public static final fo2 r;
    public static final fo2 s;
    public static final fo2 t;
    public static final fo2 u;
    public static final fo2 v;
    public static final fo2 w;
    public static final fo2 x;
    public static final fo2 y;
    public static final fo2 z;
    public final String b;

    static {
        fo2 fo2Var = new fo2(0, "AD_LOADING_RESULT", "ad_loading_result");
        c = fo2Var;
        fo2 fo2Var2 = new fo2(1, "AD_RENDERING_RESULT", "ad_rendering_result");
        fo2 fo2Var3 = new fo2(2, "ADAPTER_AUTO_REFRESH", "adapter_auto_refresh");
        d = fo2Var3;
        fo2 fo2Var4 = new fo2(3, "ADAPTER_INVALID", "adapter_invalid");
        e = fo2Var4;
        fo2 fo2Var5 = new fo2(4, "ADAPTER_REQUEST", "adapter_request");
        f = fo2Var5;
        fo2 fo2Var6 = new fo2(5, "ADAPTER_RESPONSE", "adapter_response");
        g = fo2Var6;
        fo2 fo2Var7 = new fo2(6, "ADAPTER_BIDDER_TOKEN_REQUEST", "adapter_bidder_token_request");
        h = fo2Var7;
        fo2 fo2Var8 = new fo2(7, "ADTUNE", "adtune");
        i = fo2Var8;
        fo2 fo2Var9 = new fo2(8, "REQUEST", "ad_request");
        j = fo2Var9;
        fo2 fo2Var10 = new fo2(9, "RESPONSE", "ad_response");
        fo2 fo2Var11 = new fo2(10, "VAST_REQUEST", "vast_request");
        fo2 fo2Var12 = new fo2(11, "VAST_RESPONSE", "vast_response");
        fo2 fo2Var13 = new fo2(12, "VAST_WRAPPER_REQUEST", "vast_wrapper_request");
        fo2 fo2Var14 = new fo2(13, "VAST_WRAPPER_RESPONSE", "vast_wrapper_response");
        fo2 fo2Var15 = new fo2(14, "VIDEO_AD_START", "video_ad_start");
        fo2 fo2Var16 = new fo2(15, "VIDEO_AD_COMPLETE", "video_ad_complete");
        fo2 fo2Var17 = new fo2(16, "VIDEO_AD_PLAYER_ERROR", "video_ad_player_error");
        fo2 fo2Var18 = new fo2(17, "VMAP_REQUEST", "vmap_request");
        fo2 fo2Var19 = new fo2(18, "VMAP_RESPONSE", "vmap_response");
        fo2 fo2Var20 = new fo2(19, "RENDERING_START", "rendering_start");
        k = fo2Var20;
        fo2 fo2Var21 = new fo2(20, "DSP_RENDERING_START", "dsp_rendering_start");
        l = fo2Var21;
        fo2 fo2Var22 = new fo2(21, "IMPRESSION_TRACKING_START", "impression_tracking_start");
        m = fo2Var22;
        fo2 fo2Var23 = new fo2(22, "IMPRESSION_TRACKING_SUCCESS", "impression_tracking_success");
        n = fo2Var23;
        fo2 fo2Var24 = new fo2(23, "IMPRESSION_TRACKING_FAILURE", "impression_tracking_failure");
        o = fo2Var24;
        fo2 fo2Var25 = new fo2(24, "FORCED_IMPRESSION_TRACKING_FAILURE", "forced_impression_tracking_failure");
        p = fo2Var25;
        fo2 fo2Var26 = new fo2(25, "ADAPTER_ACTION", "adapter_action");
        q = fo2Var26;
        fo2 fo2Var27 = new fo2(26, "CLICK", "click");
        r = fo2Var27;
        fo2 fo2Var28 = new fo2(27, "CLOSE", "close");
        s = fo2Var28;
        fo2 fo2Var29 = new fo2(28, "DEEPLINK", "deeplink");
        t = fo2Var29;
        fo2 fo2Var30 = new fo2(29, "BOUND_ASSETS", "bound_assets");
        u = fo2Var30;
        fo2 fo2Var31 = new fo2(30, "RENDERED_ASSETS", "rendered_assets");
        v = fo2Var31;
        fo2 fo2Var32 = new fo2(31, "REBIND", "rebind");
        fo2 fo2Var33 = new fo2(32, "BINDING_FAILURE", "binding_failure");
        fo2 fo2Var34 = new fo2(33, "EXPECTED_VIEW_MISSING", "expected_view_missing");
        fo2 fo2Var35 = new fo2(34, "RETURNED_TO_APP", "returned_to_app");
        fo2 fo2Var36 = new fo2(35, "REWARD", "reward");
        w = fo2Var36;
        fo2 fo2Var37 = new fo2(36, "VIDEO_AD_RENDERING_RESULT", "video_ad_rendering_result");
        fo2 fo2Var38 = new fo2(37, "MULTIBANNER_EVENT", "multibanner_event");
        fo2 fo2Var39 = new fo2(38, "AD_VIEW_SIZE_INFO", "ad_view_size_info");
        fo2 fo2Var40 = new fo2(39, "DSP_IMPRESSION_TRACKING_START", "dsp_impression_tracking_start");
        x = fo2Var40;
        fo2 fo2Var41 = new fo2(40, "DSP_IMPRESSION_TRACKING_SUCCESS", "dsp_impression_tracking_success");
        y = fo2Var41;
        fo2 fo2Var42 = new fo2(41, "DSP_IMPRESSION_TRACKING_FAILURE", "dsp_impression_tracking_failure");
        z = fo2Var42;
        fo2 fo2Var43 = new fo2(42, "DSP_FORCED_IMPRESSION_TRACKING_FAILURE", "dsp_forced_impression_tracking_failure");
        A = fo2Var43;
        fo2 fo2Var44 = new fo2(43, "LOG", CreativeInfo.f);
        fo2 fo2Var45 = new fo2(44, "OPEN_BIDDING_TOKEN_GENERATION_RESULT", "open_bidding_token_generation_result");
        fo2 fo2Var46 = new fo2(45, "SDK_CONFIGURATION_SUCCESS", "sdk_configuration_success");
        fo2 fo2Var47 = new fo2(46, "SDK_CONFIGURATION_FAILURE", "sdk_configuration_failure");
        fo2 fo2Var48 = new fo2(47, "SDK_TRACKING_EVENT", "tracking_event");
        fo2 fo2Var49 = new fo2(48, "AD_VERIFICATION_RESULT", "ad_verification_result");
        fo2 fo2Var50 = new fo2(49, "SDK_CONFIGURATION_REQUEST", "sdk_configuration_request");
        fo2 fo2Var51 = new fo2(50, "ACTIVITY_RESULT_OPENED", "activity_result_opened");
        fo2 fo2Var52 = new fo2(51, "CLIENT_BIDDING_LOADING_RESULT", "client_bidding_loading_result");
        B = fo2Var52;
        fo2[] fo2VarArr = {fo2Var, fo2Var2, fo2Var3, fo2Var4, fo2Var5, fo2Var6, fo2Var7, fo2Var8, fo2Var9, fo2Var10, fo2Var11, fo2Var12, fo2Var13, fo2Var14, fo2Var15, fo2Var16, fo2Var17, fo2Var18, fo2Var19, fo2Var20, fo2Var21, fo2Var22, fo2Var23, fo2Var24, fo2Var25, fo2Var26, fo2Var27, fo2Var28, fo2Var29, fo2Var30, fo2Var31, fo2Var32, fo2Var33, fo2Var34, fo2Var35, fo2Var36, fo2Var37, fo2Var38, fo2Var39, fo2Var40, fo2Var41, fo2Var42, fo2Var43, fo2Var44, fo2Var45, fo2Var46, fo2Var47, fo2Var48, fo2Var49, fo2Var50, fo2Var51, fo2Var52, new fo2(52, "ACTIVITY_ACTION", "activity_action"), new fo2(53, "SDK_NETWORK_DEBUG", "sdk_network_debug"), new fo2(54, "SMART_PRELOAD_SKIPPED", "smart_preload_skipped"), new fo2(55, "SMART_PRELOAD_ERROR", "smart_preload_error"), new fo2(56, "SMART_PRELOAD_RESULTS", "smart_preload_results")};
        C = fo2VarArr;
        EnumEntriesKt.enumEntries(fo2VarArr);
    }

    public fo2(int i2, String str, String str2) {
        this.b = str2;
    }

    public static fo2 valueOf(String str) {
        return (fo2) Enum.valueOf(fo2.class, str);
    }

    public static fo2[] values() {
        return (fo2[]) C.clone();
    }
}
