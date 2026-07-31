package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.extractor.ts.TsExtractor;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.facebook.soloader.Elf64;
import com.google.firebase.analytics.FirebaseAnalytics;
import expo.modules.devlauncher.launcher.manifest.DevLauncherOrientation;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfcj {
    public final zzbxc zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfdf zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final List zzaC;
    public final boolean zzaD;
    public final int zzaE;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbtc zzad;
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbvt zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfco zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v284, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v291, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v308, types: [java.util.List] */
    zzfcj(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List list;
        List list2;
        char c;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgjz.zzi();
        zzgjz zzi = zzgjz.zzi();
        HashMap hashMap = new HashMap();
        zzgjz zzi2 = zzgjz.zzi();
        zzgjz zzi3 = zzgjz.zzi();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        zzgjz zzgjzVar = zzi;
        HashMap hashMap2 = hashMap;
        zzgjz zzgjzVar2 = zzi2;
        zzgjz zzgjzVar3 = zzi3;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i5 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i6 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        int i7 = 0;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        double d = 0.0d;
        zzfco zzfcoVar = null;
        zzbxc zzbxcVar = null;
        zzbtc zzbtcVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        String str = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        List list3 = emptyList11;
        List list4 = emptyList12;
        List list5 = emptyList13;
        List list6 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        int i8 = 0;
        int i9 = 0;
        zzbvt zzbvtVar = null;
        String str20 = str19;
        String str21 = str20;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? "" : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_instance_name")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("debug_signals")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1964744830:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("offline_ad_config")) {
                        c = 'O';
                        break;
                    }
                    c = 65535;
                    break;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("recursive_server_response_data")) {
                        c = 'E';
                        break;
                    }
                    c = 65535;
                    break;
                case -1843156475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_consent")) {
                        c = 'G';
                        break;
                    }
                    c = 65535;
                    break;
                case -1840512279:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_urls")) {
                        c = 'Q';
                        break;
                    }
                    c = 65535;
                    break;
                case -1828733410:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("network_ping_config")) {
                        c = 'N';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case -1785028569:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("parallel_key")) {
                        c = 'I';
                        break;
                    }
                    c = 65535;
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_name")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("backend_query_id")) {
                        c = IOUtils.DIR_SEPARATOR_UNIX;
                        break;
                    }
                    c = 65535;
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("nofill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("showable_impression_type")) {
                        c = AbstractJsonLexerKt.COMMA;
                        break;
                    }
                    c = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("test_mode_enabled")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("extras")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals(AppEventsConstants.EVENT_PARAM_AD_TYPE)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("fill_urls")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_complete_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("valid_from_timestamp")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_instance_id")) {
                        c = Typography.less;
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -652881372:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("on_device_storage_configs")) {
                        c = 'S';
                        break;
                    }
                    c = 65535;
                    break;
                case -570101180:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("late_load_urls")) {
                        c = 'J';
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rtb_native_required_assets")) {
                        c = Typography.greater;
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_timeout_ms")) {
                        c = Typography.amp;
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals(ShareConstants.STORY_DEEP_LINK_URL)) {
                        c = '@';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("native_required_asset_viewability")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_offline_ad")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("id")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("data")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("request_id")) {
                        c = 'D';
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_closable_area_disabled")) {
                        c = Typography.dollar;
                        break;
                    }
                    c = 65535;
                    break;
                case 542250332:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("consent_form_action_identifier")) {
                        c = 'H';
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 805095541:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("analytics_event_name_to_parameters_map")) {
                        c = 'M';
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals(FirebaseAnalytics.Param.TRANSACTION_ID)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rewards")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapter_response_info_key")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("cache_hit_urls")) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case 1303622534:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("preload_sort_value")) {
                        c = 'L';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422388341:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_collapsible")) {
                        c = 'F';
                        break;
                    }
                    c = 65535;
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_source_id")) {
                        c = AbstractJsonLexerKt.COLON;
                        break;
                    }
                    c = 65535;
                    break;
                case 1556932485:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("post_click_lifecycle_monitoring_duration_ms")) {
                        c = 'P';
                        break;
                    }
                    c = 65535;
                    break;
                case 1565514205:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("adapter_only_third_party_impression")) {
                        c = 'T';
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("video_reward_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("use_third_party_container_height")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2075506442:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str22.equals("render_serially")) {
                        c = 'K';
                        break;
                    }
                    c = 65535;
                    break;
                case 2117205836:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str22.equals("flow_control")) {
                        c = 'R';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 1:
                    i8 = zzc(jsonReader.nextString());
                    emptyList9 = list;
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 5:
                    i9 = zzd(jsonReader.nextInt());
                    emptyList9 = list;
                    break;
                case 6:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 7:
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case '\b':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case '\t':
                    str21 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case '\n':
                    str20 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 11:
                    zzbvtVar = zzbvt.zza(com.google.android.gms.ads.internal.util.zzbp.zze(jsonReader));
                    emptyList9 = list;
                    break;
                case '\f':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case '\r':
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    break;
                case 14:
                    list2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 15:
                    list3 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 16:
                    i4 = jsonReader.nextInt();
                    emptyList9 = list;
                    break;
                case 17:
                    list4 = zzfck.zza(jsonReader);
                    emptyList9 = list;
                    break;
                case 18:
                    zzfcoVar = new zzfco(jsonReader);
                    emptyList9 = list;
                    break;
                case 19:
                    list6 = zzfck.zza(jsonReader);
                    emptyList9 = list;
                    break;
                case 20:
                    list5 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 22:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    emptyList9 = list;
                    break;
                case 23:
                    str3 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 24:
                    str4 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 25:
                    str5 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader).toString();
                    emptyList9 = list;
                    break;
                case 26:
                    zzbxcVar = zzbxc.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    emptyList9 = list;
                    break;
                case 27:
                    str6 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 28:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    emptyList9 = list;
                    break;
                case 29:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    emptyList9 = list;
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '%':
                    i = zze(jsonReader.nextString());
                    emptyList9 = list;
                    break;
                case '&':
                    i5 = jsonReader.nextInt();
                    emptyList9 = list;
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '(':
                    str7 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case ')':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    emptyList9 = list;
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case ',':
                    i6 = jsonReader.nextInt();
                    emptyList9 = list;
                    break;
                case '-':
                    i2 = jsonReader.nextInt();
                    emptyList9 = list;
                    break;
                case '.':
                    str8 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case '/':
                    str9 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case '0':
                    z11 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '1':
                    zzbtcVar = zzbtc.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    emptyList9 = list;
                    break;
                case '2':
                    jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    zztVar = com.google.android.gms.ads.internal.client.zzt.zza(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                    emptyList9 = list;
                    break;
                case '4':
                    str10 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case '5':
                    z12 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '6':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    emptyList9 = list;
                    break;
                case '7':
                    str11 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case '8':
                    str18 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case '9':
                    str12 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case Elf64.Ehdr.E_SHENTSIZE /* 58 */:
                    str13 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case ';':
                    str14 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case '<':
                    str15 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    z13 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case Elf64.Ehdr.E_SHSTRNDX /* 62 */:
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                    emptyList9 = list;
                    break;
                case '?':
                    z14 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case '@':
                    str = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 'A':
                    z15 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 'C':
                    z16 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case 'D':
                    str16 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 'E':
                    str17 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 'F':
                    z17 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case TsExtractor.TS_SYNC_BYTE /* 71 */:
                    z18 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case 'H':
                    i7 = jsonReader.nextInt();
                    emptyList9 = list;
                    break;
                case 'I':
                    str19 = jsonReader.nextString();
                    emptyList9 = list;
                    break;
                case 'J':
                    zzgjzVar = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 'K':
                    z19 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case 'L':
                    d = jsonReader.nextDouble();
                    emptyList9 = list;
                    break;
                case 'M':
                    if (((Boolean) zzbci.zzat.zzg()).booleanValue()) {
                        hashMap2 = com.google.android.gms.ads.internal.util.zzbp.zzc(jsonReader);
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList9 = list;
                    }
                case MdtaMetadataEntry.TYPE_INDICATOR_UNSIGNED_INT64 /* 78 */:
                    if (((Boolean) zzbci.zzjo.zzg()).booleanValue()) {
                        zzvVar = com.google.android.gms.ads.internal.util.client.zzv.zzb(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList9 = list;
                    }
                case 'O':
                    if (((Boolean) zzbci.zzjq.zzg()).booleanValue()) {
                        zzwVar = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList9 = list;
                    }
                case 'P':
                    if (((Boolean) zzbci.zznG.zzg()).booleanValue()) {
                        i3 = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                    emptyList9 = list;
                    break;
                case 'Q':
                    zzgjzVar2 = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
                    emptyList9 = list;
                    break;
                case 'R':
                    z20 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                case 'S':
                    if (((Boolean) zzbci.zzio.zzg()).booleanValue()) {
                        zzgjzVar3 = zzdtq.zza(jsonReader);
                        emptyList9 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        emptyList9 = list;
                    }
                case 'T':
                    z21 = jsonReader.nextBoolean();
                    emptyList9 = list;
                    break;
                default:
                    jsonReader.skipValue();
                    emptyList9 = list;
                    break;
            }
            emptyList10 = list2;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i8;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzf = emptyList4;
        this.zze = i9;
        this.zzg = emptyList5;
        this.zzh = emptyList6;
        this.zzi = emptyList7;
        this.zzj = str21;
        this.zzk = str20;
        this.zzl = zzbvtVar;
        this.zzm = emptyList8;
        this.zzn = emptyList9;
        this.zzo = emptyList10;
        this.zzp = list3;
        this.zzq = i4;
        this.zzr = list4;
        this.zzs = zzfcoVar;
        this.zzt = list5;
        this.zzu = list6;
        this.zzw = str2;
        this.zzv = jSONObject12;
        this.zzx = str3;
        this.zzy = str4;
        this.zzz = str5;
        this.zzA = zzbxcVar;
        this.zzB = str6;
        this.zzC = jSONObject7;
        this.zzD = jSONObject8;
        this.zzJ = z;
        this.zzK = z2;
        this.zzL = z3;
        this.zzM = z4;
        this.zzN = z5;
        this.zzO = z6;
        this.zzP = z7;
        this.zzQ = i;
        this.zzR = i5;
        this.zzT = z8;
        this.zzU = str7;
        this.zzV = new zzfdf(jSONObject9);
        this.zzW = z9;
        this.zzX = z10;
        this.zzY = i6;
        this.zzZ = str8;
        this.zzaa = i2;
        this.zzab = str9;
        this.zzac = z11;
        this.zzad = zzbtcVar;
        this.zzae = zztVar;
        this.zzaf = str10;
        this.zzag = z12;
        this.zzah = jSONObject10;
        this.zzE = str11;
        this.zzF = str12;
        this.zzG = str13;
        this.zzH = str14;
        this.zzI = str15;
        this.zzai = z13;
        this.zzaj = jSONObject11;
        this.zzak = z14;
        this.zzal = str;
        this.zzam = z15;
        this.zzS = z16;
        this.zzan = str16;
        this.zzao = str17;
        this.zzap = str18;
        this.zzaq = z17;
        this.zzar = z18;
        this.zzas = i7;
        this.zzau = zzgjzVar;
        this.zzat = str19;
        this.zzav = z19;
        this.zzaw = hashMap2;
        this.zzax = zzvVar;
        this.zzay = zzwVar;
        this.zzaz = d;
        this.zzaA = zzgjzVar2;
        this.zzaB = z20;
        this.zzaC = zzgjzVar3;
        this.zzaD = z21;
        this.zzaE = i3;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE.equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 4) {
            return i;
        }
        return 0;
    }

    private static int zze(String str) {
        if (DevLauncherOrientation.LANDSCAPE.equalsIgnoreCase(str)) {
            return 6;
        }
        return DevLauncherOrientation.PORTRAIT.equalsIgnoreCase(str) ? 7 : -1;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
