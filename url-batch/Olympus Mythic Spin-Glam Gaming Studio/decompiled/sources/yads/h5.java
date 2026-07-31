package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h5 {
    public static final h5 A;
    public static final h5 B;
    public static final h5 C;
    public static final h5 D;
    public static final h5 E;
    public static final h5 F;
    public static final /* synthetic */ h5[] G;
    public static final h5 c;
    public static final h5 d;
    public static final h5 e;
    public static final h5 f;
    public static final h5 g;
    public static final h5 h;
    public static final h5 i;
    public static final h5 j;
    public static final h5 k;
    public static final h5 l;
    public static final h5 m;
    public static final h5 n;
    public static final h5 o;
    public static final h5 p;
    public static final h5 q;
    public static final h5 r;
    public static final h5 s;
    public static final h5 t;
    public static final h5 u;
    public static final h5 v;
    public static final h5 w;
    public static final h5 x;
    public static final h5 y;
    public static final h5 z;
    public final String b;

    static {
        h5 h5Var = new h5(0, "ADAPTER_LOADING", "adapter_loading_duration");
        c = h5Var;
        h5 h5Var2 = new h5(1, "ADVERTISING_INFO_LOADING", "advertising_info_loading_duration");
        d = h5Var2;
        h5 h5Var3 = new h5(2, "AD_LOADING", "ad_loading_duration");
        e = h5Var3;
        h5 h5Var4 = new h5(3, "AD_RENDER", "ad_rendering_duration");
        f = h5Var4;
        h5 h5Var5 = new h5(4, "BIDDING_DATA_LOADING", "bidding_data_loading_duration");
        g = h5Var5;
        h5 h5Var6 = new h5(5, "IDENTIFIERS_LOADING", "identifiers_loading_duration");
        h = h5Var6;
        h5 h5Var7 = new h5(6, "SDK_INITIALIZATION", "sdk_initialization_duration");
        i = h5Var7;
        h5 h5Var8 = new h5(7, "SDK_CONFIGURATION_QUEUE", "sdk_configuration_queue_duration");
        j = h5Var8;
        h5 h5Var9 = new h5(8, "SDK_CONFIGURATION_LOADING", "sdk_configuration_loading_duration");
        k = h5Var9;
        h5 h5Var10 = new h5(9, "SDK_CONFIGURATION_REQUEST_QUEUE", "sdk_configuration_request_queue_duration");
        l = h5Var10;
        h5 h5Var11 = new h5(10, "SDK_CONFIGURATION_REQUEST", "sdk_configuration_request_duration");
        m = h5Var11;
        h5 h5Var12 = new h5(11, "RESOURCES_LOADING", "resources_loading_duration");
        n = h5Var12;
        h5 h5Var13 = new h5(12, "VERIFICATION_RESOURCES_LOADING", "verification_resources_loading_duration");
        o = h5Var13;
        h5 h5Var14 = new h5(13, "IMAGE_LOADING", "image_loading_duration");
        p = h5Var14;
        h5 h5Var15 = new h5(14, "VIDEO_CACHING", "video_caching_duration");
        q = h5Var15;
        h5 h5Var16 = new h5(15, "WEB_VIEW_CACHING", "web_view_caching_duration");
        r = h5Var16;
        h5 h5Var17 = new h5(16, "NETWORK_REQUEST_QUEUE", "network_request_queue_duration");
        s = h5Var17;
        h5 h5Var18 = new h5(17, "NETWORK_REQUEST", "network_request_durations");
        t = h5Var18;
        h5 h5Var19 = new h5(18, "VAST_REQUEST_QUEUE", "vast_request_queue_duration");
        u = h5Var19;
        h5 h5Var20 = new h5(19, "VAST_LOADING", "vast_loading_durations");
        v = h5Var20;
        h5 h5Var21 = new h5(20, "VAST_ADS_LOADING", "vast_ads_loading_duration");
        w = h5Var21;
        h5 h5Var22 = new h5(21, "WRAPPERS_LOADING", "wrappers_loading_duration");
        x = h5Var22;
        h5 h5Var23 = new h5(22, "VIDEO_AD_RENDERING", "video_ad_rendering_duration");
        y = h5Var23;
        h5 h5Var24 = new h5(23, "VIDEO_AD_PREPARE", "video_ad_prepare_duration");
        z = h5Var24;
        h5 h5Var25 = new h5(24, "VMAP_REQUEST_QUEUE", "vmap_request_queue_duration");
        A = h5Var25;
        h5 h5Var26 = new h5(25, "VMAP_LOADING", "vmap_loading_duration");
        B = h5Var26;
        h5 h5Var27 = new h5(26, "BIDDER_TOKEN_LOADING", "bidder_token_loading_duration");
        C = h5Var27;
        h5 h5Var28 = new h5(27, "BIDDER_TOKEN_GENERATION", "bidder_token_generation_duration");
        D = h5Var28;
        h5 h5Var29 = new h5(28, "DNS_PREFETCH", "dns_prefetch_duration");
        E = h5Var29;
        h5 h5Var30 = new h5(29, "CLIENT_BIDDING_DATA_LOADING", "client_bidding_data_loading_duration");
        F = h5Var30;
        h5[] h5VarArr = {h5Var, h5Var2, h5Var3, h5Var4, h5Var5, h5Var6, h5Var7, h5Var8, h5Var9, h5Var10, h5Var11, h5Var12, h5Var13, h5Var14, h5Var15, h5Var16, h5Var17, h5Var18, h5Var19, h5Var20, h5Var21, h5Var22, h5Var23, h5Var24, h5Var25, h5Var26, h5Var27, h5Var28, h5Var29, h5Var30};
        G = h5VarArr;
        EnumEntriesKt.enumEntries(h5VarArr);
    }

    public h5(int i2, String str, String str2) {
        this.b = str2;
    }

    public static h5 valueOf(String str) {
        return (h5) Enum.valueOf(h5.class, str);
    }

    public static h5[] values() {
        return (h5[]) G.clone();
    }
}
