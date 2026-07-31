package com.ogury.ad.internal;

import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class nb {
    public static final nb A;
    public static final nb B;
    public static final nb C;
    public static final nb D;
    public static final nb E;
    public static final nb F;
    public static final nb G;
    public static final nb H;
    public static final nb I;
    public static final /* synthetic */ nb[] J;
    public static final nb e;
    public static final nb f;
    public static final nb g;
    public static final nb h;
    public static final nb i;
    public static final nb j;
    public static final nb k;
    public static final nb l;
    public static final nb m;
    public static final nb n;
    public static final nb o;
    public static final nb p;
    public static final nb q;
    public static final nb r;
    public static final nb s;
    public static final nb t;
    public static final nb u;
    public static final nb v;
    public static final nb w;
    public static final nb x;
    public static final nb y;
    public static final nb z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    static {
        nb nbVar = new nb("LE_001_CONDITIONS_NOT_MET_NO_INTERNET_CONNECTION", 0, "LE-001", "SDK_EVENT_LOAD_ERROR", "CONDITIONS_NOT_MET", "No Internet connection");
        e = nbVar;
        nb nbVar2 = new nb("LE_008_CONFIG_RESTRICTIONS_AD_DISABLED", 1, "LE-008", "SDK_EVENT_LOAD_ERROR", "CONFIG_RESTRICTIONS", "Ad disabled");
        f = nbVar2;
        nb nbVar3 = new nb("LE_009_ADSYNC_ERROR_REQUEST_FAILED", 2, "LE-009", "SDK_EVENT_LOAD_ERROR", "ADSYNC_ERROR", "Request failed");
        g = nbVar3;
        nb nbVar4 = new nb("LE_011_ADSYNC_ERROR_NO_AD_RECEIVED", 3, "LE-011", "SDK_EVENT_LOAD_ERROR", "ADSYNC_ERROR", "No ad received");
        h = nbVar4;
        nb nbVar5 = new nb("LE_015_SDK_NEVER_INITIALIZED", 4, "LE-015", "SDK_EVENT_LOAD_ERROR", "INIT_ERROR", "SDK never initialized (asset key not found)");
        i = nbVar5;
        nb nbVar6 = new nb("LE_015_SDK_NOT_INITIALIZED", 5, "LE-015", "SDK_EVENT_LOAD_ERROR", "INIT_ERROR", "SDK not initialized");
        j = nbVar6;
        nb nbVar7 = new nb("LE_015_SDK_INITIALIZATION_FAILED", 6, "LE-015", "SDK_EVENT_LOAD_ERROR", "INIT_ERROR", "SDK initialization failed");
        k = nbVar7;
        nb nbVar8 = new nb("LE_016_SDK_CONFIGURATION_SYNCHRONIZATION_FAILED", 7, "LE-016", "SDK_EVENT_LOAD_ERROR", "PROFIG_ERROR", "SDK configuration synchronization failed");
        l = nbVar8;
        nb nbVar9 = new nb("LE_016_SDK_CONFIGURATION_NOT_SYNCED", 8, "LE-016", "SDK_EVENT_LOAD_ERROR", "PROFIG_ERROR", "SDK configuration is not synced");
        m = nbVar9;
        nb nbVar10 = new nb("LE_017_AD_ERROR_AD_MARKUP_PARSING_HAS_FAILED", 9, "LE-017", "SDK_EVENT_LOAD_ERROR", "AD_PARSING_ERROR", "Ad markup parsing has failed");
        n = nbVar10;
        nb nbVar11 = new nb("LE_017_AD_ERROR_AD_RESPONSE_PARSING_FAILED", 10, "LE-017", "SDK_EVENT_LOAD_ERROR", "AD_PARSING_ERROR", "Ad response parsing has failed");
        o = nbVar11;
        nb nbVar12 = new nb("LE_018_EMPTY_AD_HTML", 11, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", "The ad HTML is empty");
        p = nbVar12;
        nb nbVar13 = new nb("LE_018_TIMEOUT", 12, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", AndroidInitializeBoldSDK.MSG_TIMEOUT);
        q = nbVar13;
        nb nbVar14 = new nb("LE_018_WEBVIEW_AD_CONTENT_EMBEDDING_ERROR", 13, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", "Webview ad content embedding error");
        r = nbVar14;
        nb nbVar15 = new nb("LE_018_AD_UNLOAD", 14, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", "Ad unloaded");
        s = nbVar15;
        nb nbVar16 = new nb("LE_018_WEBVIEW_NULL", 15, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", "WebView is null");
        t = nbVar16;
        nb nbVar17 = new nb("LE_018_NO_WEBVIEW_LOADED", 16, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", "No WebView loaded");
        u = nbVar17;
        nb nbVar18 = new nb("LE_018_UNKNOWN", 17, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", "Unknown error");
        v = nbVar18;
        nb nbVar19 = new nb("LE_018_RENDER_PROCESS_GONE", 18, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", "Webview terminated by the OS");
        w = nbVar19;
        nb nbVar20 = new nb("LE_018_MRAID_FILE_FAILED_DOWNLOAD", 19, "LE-018", "SDK_EVENT_LOAD_ERROR", "PRECACHE_ERROR", "Mraid file failed to download");
        nb nbVar21 = new nb("LE_019_AD_ERROR_LOAD_DROPPED", 20, "LE-019", "SDK_EVENT_LOAD_ERROR", "CALL_ERROR", "Load dropped");
        x = nbVar21;
        nb nbVar22 = new nb("SE_001_CONFIG_RESTRICTIONS_AD_DISABLED", 21, "SE-001", "SDK_EVENT_SHOW_ERROR", "CONFIG_RESTRICTIONS", "Ad disabled");
        y = nbVar22;
        nb nbVar23 = new nb("SE_002_CONFIG_RESTRICTIONS_AD_EXPIRED", 22, "SE-002", "SDK_EVENT_SHOW_ERROR", "CONFIG_RESTRICTIONS", "Ad expired");
        z = nbVar23;
        nb nbVar24 = new nb("SE_003_SDK_NEVER_INITIALIZED", 23, "SE-003", "SDK_EVENT_SHOW_ERROR", "INIT_ERROR", "SDK never initialized (asset key not found)");
        A = nbVar24;
        nb nbVar25 = new nb("SE_003_SDK_NOT_INITIALIZED", 24, "SE-003", "SDK_EVENT_SHOW_ERROR", "INIT_ERROR", "SDK not initialized");
        B = nbVar25;
        nb nbVar26 = new nb("SE_003_SDK_INITIALIZATION_FAILED", 25, "SE-003", "SDK_EVENT_SHOW_ERROR", "INIT_ERROR", "SDK initialization failed");
        C = nbVar26;
        nb nbVar27 = new nb("SE_004_PRECACHE_ERROR_NO_AD_LOADED", 26, "SE-004", "SDK_EVENT_SHOW_ERROR", "PRECACHE_ERROR", "No ad loaded");
        D = nbVar27;
        nb nbVar28 = new nb("SE_006_PROFIG_ERROR_PROFIG_NOT_SYNCED", 27, "SE-006", "SDK_EVENT_SHOW_ERROR", "PROFIG_ERROR", "SDK configuration is not synced");
        E = nbVar28;
        nb nbVar29 = new nb("SE_008_CONDITIONS_NOT_MET_VIEW_IN_BACKGROUND", 28, "SE-008", "SDK_EVENT_SHOW_ERROR", "CONDITIONS_NOT_MET", "View in background");
        F = nbVar29;
        nb nbVar30 = new nb("SE_009_CONDITIONS_NOT_MET_ANOTHER_AD_ALREADY_DISPLAYED", 29, "SE-009", "SDK_EVENT_SHOW_ERROR", "CONDITIONS_NOT_MET", "Another ad already displayed");
        G = nbVar30;
        nb nbVar31 = new nb("SE_010_CONDITIONS_NOT_MET_NO_INTERNET", 30, "SE-010", "SDK_EVENT_SHOW_ERROR", "CONDITIONS_NOT_MET", "No Internet connection");
        H = nbVar31;
        nb nbVar32 = new nb("SE_011_CONDITIONS_NOT_MET_WV_TERMINATED", 31, "SE-011", "SDK_EVENT_SHOW_ERROR", "CONDITIONS_NOT_MET", "Webview terminated by the OS");
        I = nbVar32;
        nb[] nbVarArr = {nbVar, nbVar2, nbVar3, nbVar4, nbVar5, nbVar6, nbVar7, nbVar8, nbVar9, nbVar10, nbVar11, nbVar12, nbVar13, nbVar14, nbVar15, nbVar16, nbVar17, nbVar18, nbVar19, nbVar20, nbVar21, nbVar22, nbVar23, nbVar24, nbVar25, nbVar26, nbVar27, nbVar28, nbVar29, nbVar30, nbVar31, nbVar32};
        J = nbVarArr;
        EnumEntriesKt.enumEntries(nbVarArr);
    }

    public nb(String str, int i2, String str2, String str3, String str4, String str5) {
        this.a = str2;
        this.b = str3;
        this.c = str4;
        this.d = str5;
    }

    public static nb valueOf(String str) {
        return (nb) Enum.valueOf(nb.class, str);
    }

    public static nb[] values() {
        return (nb[]) J.clone();
    }
}
