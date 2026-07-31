package yads;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class vf3 {
    public static final vf3 A;
    public static final vf3 B;
    public static final vf3 C;
    public static final vf3 D;
    public static final vf3 E;
    public static final vf3 F;
    public static final vf3 G;
    public static final /* synthetic */ vf3[] H;
    public static final vf3 b;
    public static final vf3 c;
    public static final vf3 d;
    public static final vf3 e;
    public static final vf3 f;
    public static final vf3 g;
    public static final vf3 h;
    public static final vf3 i;
    public static final vf3 j;
    public static final vf3 k;
    public static final vf3 l;
    public static final vf3 m;
    public static final vf3 n;
    public static final vf3 o;
    public static final vf3 p;
    public static final vf3 q;
    public static final vf3 r;
    public static final vf3 s;
    public static final vf3 t;
    public static final vf3 u;
    public static final vf3 v;
    public static final vf3 w;
    public static final vf3 x;
    public static final vf3 y;
    public static final vf3 z;

    static {
        vf3 vf3Var = new vf3(0, "RENDERER_FAILED_DEQUEUE_OUTPUT_BUFFER");
        b = vf3Var;
        vf3 vf3Var2 = new vf3(1, "RENDERER_FAILED_DEQUEUE_INPUT_BUFFER");
        c = vf3Var2;
        vf3 vf3Var3 = new vf3(2, "RENDERER_FAILED_STOP");
        d = vf3Var3;
        vf3 vf3Var4 = new vf3(3, "RENDERER_FAILED_SET_SURFACE");
        e = vf3Var4;
        vf3 vf3Var5 = new vf3(4, "RENDERER_FAILED_RELEASE_OUTPUT_BUFFER");
        f = vf3Var5;
        vf3 vf3Var6 = new vf3(5, "RENDERER_FAILED_QUEUE_SECURE_INPUT_BUFFER");
        g = vf3Var6;
        vf3 vf3Var7 = new vf3(6, "RENDERER_MEDIA_CODEC_UNKNOWN");
        h = vf3Var7;
        vf3 vf3Var8 = new vf3(7, "TIMEOUT");
        i = vf3Var8;
        vf3 vf3Var9 = new vf3(8, "ILLEGAL_SEEK_POSITION");
        j = vf3Var9;
        vf3 vf3Var10 = new vf3(9, "DECODER_QUERY_ERROR");
        k = vf3Var10;
        vf3 vf3Var11 = new vf3(10, "DECODER_INITIALIZATION_ERROR");
        l = vf3Var11;
        vf3 vf3Var12 = new vf3(11, "DECODER_UNKNOWN_ERROR");
        m = vf3Var12;
        vf3 vf3Var13 = new vf3(12, "BEHIND_LIVE_WINDOW_ERROR");
        n = vf3Var13;
        vf3 vf3Var14 = new vf3(13, "DRM_KEYS_EXPIRED");
        o = vf3Var14;
        vf3 vf3Var15 = new vf3(14, "DRM_MEDIA_RESOURCE_BUSY");
        p = vf3Var15;
        vf3 vf3Var16 = new vf3(15, "DRM_SESSION_ERROR");
        q = vf3Var16;
        vf3 vf3Var17 = new vf3(16, "HTTP_CLEARTEXT_NOT_PERMITTED");
        r = vf3Var17;
        vf3 vf3Var18 = new vf3(17, "HTTP_CODE_UNAUTHORIZED");
        s = vf3Var18;
        vf3 vf3Var19 = new vf3(18, "HTTP_CODE_FORBIDDEN");
        t = vf3Var19;
        vf3 vf3Var20 = new vf3(19, "HTTP_CODE_NOT_FOUND");
        u = vf3Var20;
        vf3 vf3Var21 = new vf3(20, "HTTP_CODE_UNKNOWN");
        v = vf3Var21;
        vf3 vf3Var22 = new vf3(21, "SSL_HANDSHAKE_ERROR");
        w = vf3Var22;
        vf3 vf3Var23 = new vf3(22, "NETWORK_UNAVAILABLE");
        x = vf3Var23;
        vf3 vf3Var24 = new vf3(23, "CONTENT_PARSER_ERROR");
        y = vf3Var24;
        vf3 vf3Var25 = new vf3(24, "LOADER_UNEXPECTED_ERROR");
        z = vf3Var25;
        vf3 vf3Var26 = new vf3(25, "AUDIO_ERROR");
        A = vf3Var26;
        vf3 vf3Var27 = new vf3(26, "SUBTITLE_ERROR");
        B = vf3Var27;
        vf3 vf3Var28 = new vf3(27, "CACHE_ERROR");
        C = vf3Var28;
        vf3 vf3Var29 = new vf3(28, "UNKNOWN");
        D = vf3Var29;
        vf3 vf3Var30 = new vf3(29, "PLAYBACK_UNKNOWN");
        E = vf3Var30;
        vf3 vf3Var31 = new vf3(30, "UNKNOWN_NOT_MATCHED");
        F = vf3Var31;
        vf3 vf3Var32 = new vf3(31, "GENERAL_VPAID_ERROR");
        G = vf3Var32;
        vf3[] vf3VarArr = {vf3Var, vf3Var2, vf3Var3, vf3Var4, vf3Var5, vf3Var6, vf3Var7, vf3Var8, vf3Var9, vf3Var10, vf3Var11, vf3Var12, vf3Var13, vf3Var14, vf3Var15, vf3Var16, vf3Var17, vf3Var18, vf3Var19, vf3Var20, vf3Var21, vf3Var22, vf3Var23, vf3Var24, vf3Var25, vf3Var26, vf3Var27, vf3Var28, vf3Var29, vf3Var30, vf3Var31, vf3Var32};
        H = vf3VarArr;
        EnumEntriesKt.enumEntries(vf3VarArr);
    }

    public vf3(int i2, String str) {
    }

    public static vf3 valueOf(String str) {
        return (vf3) Enum.valueOf(vf3.class, str);
    }

    public static vf3[] values() {
        return (vf3[]) H.clone();
    }
}
