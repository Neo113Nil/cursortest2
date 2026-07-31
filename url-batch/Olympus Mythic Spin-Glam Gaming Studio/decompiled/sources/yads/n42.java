package yads;

import android.content.Context;
import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class n42 {
    public final lf1 a;
    public final li b;
    public final eb3 c;
    public final r41 d;
    public final wi0 e;
    public final lg0 f;
    public final f52 g;
    public final gz2 h;
    public final oj1 i;
    public final cb j;
    public final td k;

    public n42(Context context, mt1 mt1Var) {
        lf1 lf1Var = new lf1(context, mt1Var);
        li liVar = new li(context, mt1Var, lf1Var, 8);
        eb3 eb3Var = new eb3();
        r41 r41Var = new r41();
        wi0 wi0Var = new wi0(mt1Var);
        lg0 lg0Var = new lg0();
        f52 f52Var = new f52();
        gz2 gz2Var = new gz2();
        oj1 oj1Var = new oj1();
        cb cbVar = new cb(mt1Var);
        td tdVar = new td();
        this.a = lf1Var;
        this.b = liVar;
        this.c = eb3Var;
        this.d = r41Var;
        this.e = wi0Var;
        this.f = lg0Var;
        this.g = f52Var;
        this.h = gz2Var;
        this.i = oj1Var;
        this.j = cbVar;
        this.k = tdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:431:0x00d3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s12 a(String str, dm dmVar) {
        String str2;
        String str3;
        JSONObject jSONObject;
        String str4;
        Iterator<String> it;
        List list;
        String str5;
        j03 j03Var;
        List list2;
        String str6;
        JSONArray jSONArray;
        int i;
        j6 j6Var;
        k6 k6Var;
        y03 y03Var;
        a13 a13Var;
        JSONObject jSONObject2;
        String string;
        dq2 dq2Var;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String string2;
        JSONObject optJSONObject;
        String str15;
        JSONObject jSONObject3;
        String a;
        dm dmVar2 = dmVar;
        String str16 = "ad_pod";
        String str17 = "additionalInfo";
        JSONObject jSONObject4 = new JSONObject(str).getJSONObject("native");
        String str18 = "ads";
        String str19 = "Native Ad json has not required attributes";
        if (!o42.a(jSONObject4, "ads")) {
            throw new o12("Native Ad json has not required attributes");
        }
        List emptyList = CollectionsKt.emptyList();
        List emptyList2 = CollectionsKt.emptyList();
        List emptyList3 = CollectionsKt.emptyList();
        List emptyList4 = CollectionsKt.emptyList();
        List emptyList5 = CollectionsKt.emptyList();
        Iterator<String> keys = jSONObject4.keys();
        List list3 = emptyList;
        List list4 = emptyList2;
        List list5 = emptyList3;
        List list6 = emptyList4;
        List list7 = emptyList5;
        y4 y4Var = null;
        String str20 = null;
        bz2 bz2Var = null;
        b6 b6Var = null;
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                String str21 = "assets";
                String str22 = "showNotices";
                it = keys;
                String str23 = "renderTrackingUrls";
                list = list4;
                str2 = str16;
                switch (next.hashCode()) {
                    case -1777460514:
                        str3 = str17;
                        jSONObject = jSONObject4;
                        str4 = str18;
                        str5 = str19;
                        if (next.equals("showNotices")) {
                            ArrayList arrayList = new ArrayList();
                            JSONArray jSONArray2 = jSONObject.getJSONArray("showNotices");
                            int length = jSONArray2.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                arrayList.add(a(jSONArray2.getJSONObject(i2)));
                            }
                            dmVar2 = dmVar;
                            list7 = arrayList;
                            jSONObject4 = jSONObject;
                            str19 = str5;
                            keys = it;
                            list4 = list;
                            str16 = str2;
                            str18 = str4;
                            str17 = str3;
                        }
                        dmVar2 = dmVar;
                        jSONObject4 = jSONObject;
                        str19 = str5;
                        keys = it;
                        list4 = list;
                        str16 = str2;
                        str18 = str4;
                        str17 = str3;
                    case -1422646231:
                        str3 = str17;
                        jSONObject = jSONObject4;
                        str4 = str18;
                        str5 = str19;
                        String str24 = str2;
                        if (next.equals(str24)) {
                            JSONObject jSONObject5 = jSONObject.getJSONObject(str24);
                            JSONArray optJSONArray = jSONObject5.optJSONArray("items");
                            if (optJSONArray != null) {
                                int length2 = optJSONArray.length();
                                ArrayList arrayList2 = new ArrayList(length2);
                                int i3 = 0;
                                while (i3 < length2) {
                                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                                    long optLong = optJSONObject2.optLong(IronSourceConstants.EVENTS_DURATION);
                                    JSONObject optJSONObject3 = optJSONObject2.optJSONObject("skip");
                                    if (optJSONObject3 != null) {
                                        String optString = optJSONObject3.optString("transition_strategy");
                                        y03[] values = y03.values();
                                        int length3 = values.length;
                                        str6 = str24;
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 < length3) {
                                                int i5 = length3;
                                                y03Var = values[i4];
                                                jSONArray = optJSONArray;
                                                if (!Intrinsics.areEqual(y03Var.b, optString)) {
                                                    i4++;
                                                    length3 = i5;
                                                    optJSONArray = jSONArray;
                                                }
                                            } else {
                                                jSONArray = optJSONArray;
                                                y03Var = null;
                                            }
                                        }
                                        String optString2 = optJSONObject3.optString(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY);
                                        a13[] values2 = a13.values();
                                        int length4 = values2.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < length4) {
                                                i = length2;
                                                a13Var = values2[i6];
                                                a13[] a13VarArr = values2;
                                                if (!Intrinsics.areEqual(a13Var.b, optString2)) {
                                                    i6++;
                                                    length2 = i;
                                                    values2 = a13VarArr;
                                                }
                                            } else {
                                                i = length2;
                                                a13Var = null;
                                            }
                                        }
                                        j6Var = new j6(y03Var, a13Var, optJSONObject3.optLong(POBCTAOverlayData.KEY_CTA_DELAY));
                                    } else {
                                        str6 = str24;
                                        jSONArray = optJSONArray;
                                        i = length2;
                                        j6Var = null;
                                    }
                                    String optString3 = optJSONObject2.optString("transition_policy");
                                    k6[] values3 = k6.values();
                                    int length5 = values3.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 < length5) {
                                            k6Var = values3[i7];
                                            if (Intrinsics.areEqual(k6Var.b, optString3)) {
                                                break;
                                            }
                                            i7++;
                                        } else {
                                            k6Var = null;
                                        }
                                    }
                                    arrayList2.add(new i6(optLong, j6Var, k6Var));
                                    i3++;
                                    length2 = i;
                                    str24 = str6;
                                    optJSONArray = jSONArray;
                                }
                                str2 = str24;
                                list2 = arrayList2;
                            } else {
                                str2 = str24;
                                list2 = CollectionsKt.emptyList();
                            }
                            dmVar2 = dmVar;
                            jSONObject4 = jSONObject;
                            b6Var = new b6(list2, jSONObject5.optInt("closable_ad_position"), jSONObject5.optInt("reward_ad_position", RangesKt.coerceAtLeast(CollectionsKt.getLastIndex(list2), 0)));
                            str19 = str5;
                            keys = it;
                            list4 = list;
                            str16 = str2;
                            str18 = str4;
                            str17 = str3;
                        } else {
                            str2 = str24;
                            dmVar2 = dmVar;
                            jSONObject4 = jSONObject;
                            str19 = str5;
                            keys = it;
                            list4 = list;
                            str16 = str2;
                            str18 = str4;
                            str17 = str3;
                        }
                        break;
                    case -1408207997:
                        str3 = str17;
                        jSONObject = jSONObject4;
                        str4 = str18;
                        str5 = str19;
                        if (next.equals("assets")) {
                            list3 = this.b.a(jSONObject, dmVar2);
                            jSONObject4 = jSONObject;
                            str19 = str5;
                            keys = it;
                            list4 = list;
                            str16 = str2;
                            str18 = str4;
                            str17 = str3;
                        }
                        dmVar2 = dmVar;
                        jSONObject4 = jSONObject;
                        str19 = str5;
                        keys = it;
                        list4 = list;
                        str16 = str2;
                        str18 = str4;
                        str17 = str3;
                    case -113850029:
                        str3 = str17;
                        JSONObject jSONObject6 = jSONObject4;
                        str4 = str18;
                        str5 = str19;
                        if (next.equals("impressionData")) {
                            this.d.getClass();
                            try {
                                Json json = ad1.a;
                                jSONObject2 = jSONObject6;
                                try {
                                    string = jSONObject2.getString("impressionData");
                                } catch (Exception e) {
                                    e = e;
                                    Log.e("ImpressionDataParser", String.valueOf(e.getMessage()));
                                    jSONObject4 = jSONObject2;
                                    str19 = str5;
                                    keys = it;
                                    list4 = list;
                                    str16 = str2;
                                    str18 = str4;
                                    str17 = str3;
                                    y4Var = null;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                jSONObject2 = jSONObject6;
                            }
                            if (string.length() == 0 || Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, string)) {
                                throw new JSONException("Json has not required attributes");
                                break;
                            } else {
                                jSONObject4 = jSONObject2;
                                y4Var = new y4(string);
                                str19 = str5;
                                keys = it;
                                list4 = list;
                                str16 = str2;
                                str18 = str4;
                                str17 = str3;
                            }
                        } else {
                            jSONObject = jSONObject6;
                            dmVar2 = dmVar;
                            jSONObject4 = jSONObject;
                            str19 = str5;
                            keys = it;
                            list4 = list;
                            str16 = str2;
                            str18 = str4;
                            str17 = str3;
                        }
                        break;
                    case 96432:
                        if (!next.equals(str18)) {
                            str3 = str17;
                            jSONObject = jSONObject4;
                            str4 = str18;
                            break;
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            JSONArray jSONArray3 = jSONObject4.getJSONArray(str18);
                            String str25 = str18;
                            int length6 = jSONArray3.length();
                            JSONObject jSONObject7 = jSONObject4;
                            int i8 = 0;
                            while (i8 < length6) {
                                int i9 = length6;
                                JSONObject jSONObject8 = jSONArray3.getJSONObject(i8);
                                JSONArray jSONArray4 = jSONArray3;
                                String str26 = "link";
                                int i10 = i8;
                                if (!o42.a(jSONObject8, "adType", str21, "link")) {
                                    throw new o12(str19);
                                }
                                this.g.getClass();
                                String optString4 = jSONObject8.optString("adType");
                                if (optString4 == null || optString4.length() == 0 || Intrinsics.areEqual(optString4, POBCommonConstants.NULL_VALUE)) {
                                    throw new o12(str19);
                                }
                                dq2[] values4 = dq2.values();
                                String str27 = str21;
                                int length7 = values4.length;
                                ArrayList arrayList4 = arrayList3;
                                int i11 = 0;
                                while (true) {
                                    if (i11 < length7) {
                                        int i12 = length7;
                                        dq2Var = values4[i11];
                                        dq2[] dq2VarArr = values4;
                                        if (!Intrinsics.areEqual(dq2Var.b, optString4)) {
                                            i11++;
                                            length7 = i12;
                                            values4 = dq2VarArr;
                                        }
                                    } else {
                                        dq2Var = null;
                                    }
                                }
                                if (dq2Var == null) {
                                    throw new o12(str19);
                                }
                                ArrayList a2 = this.b.a(jSONObject8, dmVar2);
                                HashSet hashSet = new HashSet();
                                HashSet hashSet2 = new HashSet();
                                Iterator<String> keys2 = jSONObject8.keys();
                                String str28 = null;
                                String str29 = null;
                                String str30 = null;
                                String str31 = null;
                                y4 y4Var2 = null;
                                bb bbVar = null;
                                LinkedHashMap linkedHashMap = null;
                                kf1 kf1Var = null;
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    if (next2 != null) {
                                        String str32 = str22;
                                        switch (next2.hashCode()) {
                                            case -1777460514:
                                                str11 = str23;
                                                str12 = str19;
                                                str13 = str32;
                                                if (next2.equals(str13)) {
                                                    ArrayList arrayList5 = new ArrayList();
                                                    JSONArray jSONArray5 = jSONObject8.getJSONArray(str13);
                                                    str9 = str26;
                                                    str10 = str17;
                                                    int i13 = 0;
                                                    for (int length8 = jSONArray5.length(); i13 < length8; length8 = length8) {
                                                        arrayList5.add(a(jSONArray5.getJSONObject(i13)));
                                                        i13++;
                                                    }
                                                    hashSet2.addAll(arrayList5);
                                                    break;
                                                } else {
                                                    str9 = str26;
                                                    str10 = str17;
                                                    break;
                                                }
                                            case -974297739:
                                                str14 = str19;
                                                str11 = str23;
                                                if (!next2.equals(str17)) {
                                                    str9 = str26;
                                                    str13 = str32;
                                                    str12 = str14;
                                                    str10 = str17;
                                                    break;
                                                } else {
                                                    cb cbVar = this.j;
                                                    cbVar.getClass();
                                                    try {
                                                        jSONObject3 = jSONObject8.getJSONObject(str17);
                                                        a = bd1.a("offerId", jSONObject3);
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        str15 = str14;
                                                    }
                                                    if (dq2Var == dq2.e && a == null) {
                                                        str15 = str14;
                                                        throw new o12(str15);
                                                        break;
                                                    } else {
                                                        str15 = str14;
                                                        try {
                                                            String a3 = bd1.a("additionalText", jSONObject3);
                                                            String a4 = bd1.a("performanceOpeningUrl", jSONObject3);
                                                            String str33 = (a4 == null || a4.length() <= 0) ? null : a4;
                                                            Json json2 = ad1.a;
                                                            String optString5 = jSONObject3.has("attributes") ? jSONObject3.optString("attributes") : null;
                                                            JSONObject a5 = optString5 != null ? ad1.a(optString5) : null;
                                                            bbVar = new bb(a5 != null ? bd1.a("bannerId", a5) : null, a5 != null ? bd1.a("campaignId", a5) : null, a5 != null ? bd1.a("placeId", a5) : null, a, a3, str33);
                                                            str19 = str15;
                                                            str22 = str32;
                                                            str23 = str11;
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                        }
                                                    }
                                                    e = e4;
                                                    cbVar.a.reportError("Failed to create AdInfo", e);
                                                    str19 = str15;
                                                    str22 = str32;
                                                    str23 = str11;
                                                    bbVar = null;
                                                }
                                                break;
                                            case -113850029:
                                                str14 = str19;
                                                str11 = str23;
                                                if (!next2.equals("impressionData")) {
                                                    str9 = str26;
                                                    str13 = str32;
                                                    str12 = str14;
                                                    str10 = str17;
                                                    break;
                                                } else {
                                                    this.d.getClass();
                                                    try {
                                                        Json json3 = ad1.a;
                                                        string2 = jSONObject8.getString("impressionData");
                                                    } catch (Exception e5) {
                                                        Log.e("ImpressionDataParser", String.valueOf(e5.getMessage()));
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                        y4Var2 = null;
                                                    }
                                                    if (string2.length() == 0 || Intrinsics.areEqual(POBCommonConstants.NULL_VALUE, string2)) {
                                                        throw new JSONException("Json has not required attributes");
                                                        break;
                                                    } else {
                                                        y4Var2 = new y4(string2);
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                    }
                                                }
                                                break;
                                            case 3355:
                                                str14 = str19;
                                                str11 = str23;
                                                if (!next2.equals("id")) {
                                                    str9 = str26;
                                                    str13 = str32;
                                                    str12 = str14;
                                                    str10 = str17;
                                                    break;
                                                } else {
                                                    str30 = jSONObject8.optString("id", "");
                                                    if (str30.length() > 0) {
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                    } else {
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                        str30 = null;
                                                    }
                                                }
                                            case 98494:
                                                str14 = str19;
                                                str11 = str23;
                                                if (!next2.equals("cid")) {
                                                    str9 = str26;
                                                    str13 = str32;
                                                    str12 = str14;
                                                    str10 = str17;
                                                    break;
                                                } else {
                                                    str29 = jSONObject8.optString("cid", "");
                                                    if (str29.length() > 0) {
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                    } else {
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                        str29 = null;
                                                    }
                                                }
                                            case 3062218:
                                                str14 = str19;
                                                str11 = str23;
                                                if (!next2.equals("crid")) {
                                                    str9 = str26;
                                                    str13 = str32;
                                                    str12 = str14;
                                                    str10 = str17;
                                                    break;
                                                } else {
                                                    str28 = jSONObject8.optString("crid", "");
                                                    if (str28.length() > 0) {
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                    } else {
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                        str28 = null;
                                                    }
                                                }
                                            case 3237038:
                                                str14 = str19;
                                                str11 = str23;
                                                if (!next2.equals("info")) {
                                                    str9 = str26;
                                                    str13 = str32;
                                                    str12 = str14;
                                                    str10 = str17;
                                                    break;
                                                } else {
                                                    str31 = jSONObject8.optString(next2, "");
                                                    if (str31.length() > 0) {
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                    } else {
                                                        str22 = str32;
                                                        str23 = str11;
                                                        str19 = str14;
                                                        str31 = null;
                                                    }
                                                }
                                            case 3321850:
                                                str14 = str19;
                                                str11 = str23;
                                                if (!next2.equals(str26)) {
                                                    str9 = str26;
                                                    str13 = str32;
                                                    str12 = str14;
                                                    str10 = str17;
                                                    break;
                                                } else {
                                                    kf1Var = this.a.a(jSONObject8.getJSONObject(next2), dmVar2);
                                                    str22 = str32;
                                                    str23 = str11;
                                                    str19 = str14;
                                                }
                                            case 458247106:
                                                str14 = str19;
                                                str11 = str23;
                                                if (next2.equals("renderTrackingUrl")) {
                                                    this.c.getClass();
                                                    hashSet.add(eb3.a(next2, jSONObject8));
                                                }
                                                str9 = str26;
                                                str13 = str32;
                                                str12 = str14;
                                                str10 = str17;
                                                break;
                                            case 635399221:
                                                str14 = str19;
                                                str11 = str23;
                                                if (next2.equals("showNotice")) {
                                                    hashSet2.add(a(jSONObject8.getJSONObject(next2)));
                                                }
                                                str9 = str26;
                                                str13 = str32;
                                                str12 = str14;
                                                str10 = str17;
                                                break;
                                            case 833620496:
                                                str14 = str19;
                                                str11 = str23;
                                                if (next2.equals("analyticsParameters") && (optJSONObject = jSONObject8.optJSONObject(next2)) != null) {
                                                    this.k.getClass();
                                                    Sequence asSequence = SequencesKt.asSequence(optJSONObject.keys());
                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                    for (Iterator it2 = asSequence.iterator(); it2.hasNext(); it2 = it2) {
                                                        Object next3 = it2.next();
                                                        linkedHashMap2.put(next3, optJSONObject.get((String) next3));
                                                    }
                                                    linkedHashMap = linkedHashMap2;
                                                    str22 = str32;
                                                    str23 = str11;
                                                    str19 = str14;
                                                }
                                                str9 = str26;
                                                str13 = str32;
                                                str12 = str14;
                                                str10 = str17;
                                                break;
                                            case 1320758513:
                                                if (next2.equals(str23)) {
                                                    ArrayList arrayList6 = new ArrayList();
                                                    JSONArray jSONArray6 = jSONObject8.getJSONArray(str23);
                                                    str11 = str23;
                                                    str14 = str19;
                                                    int i14 = 0;
                                                    for (int length9 = jSONArray6.length(); i14 < length9; length9 = length9) {
                                                        arrayList6.add(jSONArray6.getString(i14));
                                                        i14++;
                                                    }
                                                    hashSet.addAll(arrayList6);
                                                    str9 = str26;
                                                    str13 = str32;
                                                    str12 = str14;
                                                    str10 = str17;
                                                    break;
                                                }
                                                str9 = str26;
                                                str11 = str23;
                                                str12 = str19;
                                                str13 = str32;
                                                str10 = str17;
                                            default:
                                                str9 = str26;
                                                str11 = str23;
                                                str12 = str19;
                                                str13 = str32;
                                                str10 = str17;
                                                break;
                                        }
                                    } else {
                                        str9 = str26;
                                        str10 = str17;
                                        str11 = str23;
                                        str12 = str19;
                                        str13 = str22;
                                    }
                                    str22 = str13;
                                    str19 = str12;
                                    str26 = str9;
                                    str17 = str10;
                                    str23 = str11;
                                }
                                String str34 = str17;
                                String str35 = str23;
                                String str36 = str19;
                                String str37 = str22;
                                bb bbVar2 = bbVar;
                                ry1 ry1Var = new ry1(dq2Var, a2, str30, str31, bbVar2 != null ? bbVar2.e : null, kf1Var, y4Var2, CollectionsKt.toList(hashSet), CollectionsKt.toList(hashSet2), new j00((bbVar2 == null || (str8 = bbVar2.a) == null) ? str28 : str8, (bbVar2 == null || (str7 = bbVar2.b) == null) ? str29 : str7, bbVar2 != null ? bbVar2.c : null, bbVar2 != null ? bbVar2.d : null, bbVar2 != null ? bbVar2.f : null), new x22(linkedHashMap));
                                if (a2.isEmpty() || kf1Var == null) {
                                    throw new o12(str36);
                                }
                                arrayList4.add(ry1Var);
                                i8 = i10 + 1;
                                arrayList3 = arrayList4;
                                str22 = str37;
                                str19 = str36;
                                length6 = i9;
                                jSONArray3 = jSONArray4;
                                str21 = str27;
                                str17 = str34;
                                str23 = str35;
                            }
                            list4 = arrayList3;
                            keys = it;
                            str16 = str2;
                            str18 = str25;
                            jSONObject4 = jSONObject7;
                        }
                        break;
                    case 116643:
                        if (!next.equals("ver")) {
                            str3 = str17;
                            jSONObject = jSONObject4;
                            str4 = str18;
                            break;
                        } else {
                            String optString6 = jSONObject4.optString(next);
                            if (optString6 == null || optString6.length() == 0 || Intrinsics.areEqual(optString6, POBCommonConstants.NULL_VALUE)) {
                                throw new o12(str19);
                            }
                            str20 = optString6;
                            keys = it;
                            list4 = list;
                            str16 = str2;
                        }
                        break;
                    case 1320758513:
                        if (!next.equals("renderTrackingUrls")) {
                            str3 = str17;
                            jSONObject = jSONObject4;
                            str4 = str18;
                            break;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            JSONArray jSONArray7 = jSONObject4.getJSONArray("renderTrackingUrls");
                            int length10 = jSONArray7.length();
                            for (int i15 = 0; i15 < length10; i15++) {
                                arrayList7.add(jSONArray7.getString(i15));
                            }
                            list5 = arrayList7;
                            keys = it;
                            list4 = list;
                            str16 = str2;
                        }
                    case 1434631203:
                        if (!next.equals("settings")) {
                            str3 = str17;
                            jSONObject = jSONObject4;
                            str4 = str18;
                            break;
                        } else {
                            JSONObject jSONObject9 = jSONObject4.getJSONObject("settings");
                            Iterator<String> keys3 = jSONObject9.keys();
                            JSONObject jSONObject10 = null;
                            String str38 = null;
                            Long l = null;
                            boolean z = false;
                            boolean z2 = false;
                            while (keys3.hasNext()) {
                                String next4 = keys3.next();
                                if (next4 != null) {
                                    switch (next4.hashCode()) {
                                        case -975961388:
                                            if (next4.equals("templateType") && ((str38 = jSONObject9.optString(next4)) == null || str38.length() == 0 || Intrinsics.areEqual(str38, POBCommonConstants.NULL_VALUE))) {
                                                throw new o12(str19);
                                            }
                                            break;
                                        case 370967731:
                                            if (next4.equals("highlightingEnabled")) {
                                                z = jSONObject9.getBoolean(next4);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1352271078:
                                            if (next4.equals("multiBannerAutoScrollInterval")) {
                                                l = Long.valueOf(jSONObject9.getLong(next4));
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 1971060391:
                                            if (next4.equals("isLoopingVideo")) {
                                                z2 = jSONObject9.optBoolean(next4);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 2028941137:
                                            if (next4.equals("mediaAssetImageFallback")) {
                                                jSONObject10 = jSONObject9.getJSONObject(next4);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                }
                            }
                            if (jSONObject10 != null) {
                                this.i.getClass();
                                if (jSONObject10.has("width") && jSONObject10.has("height")) {
                                    j03Var = new j03(jSONObject10.getInt("width"), jSONObject10.getInt("height"));
                                    bz2Var = new bz2(str38, l, z, z2, j03Var);
                                    keys = it;
                                    list4 = list;
                                    str16 = str2;
                                }
                            }
                            j03Var = null;
                            bz2Var = new bz2(str38, l, z, z2, j03Var);
                            keys = it;
                            list4 = list;
                            str16 = str2;
                        }
                        break;
                    case 1557034613:
                        if (!next.equals("designs")) {
                            str3 = str17;
                            jSONObject = jSONObject4;
                            str4 = str18;
                            break;
                        } else {
                            boolean z3 = dmVar2.b;
                            ArrayList arrayList8 = new ArrayList();
                            JSONArray jSONArray8 = jSONObject4.getJSONArray("designs");
                            int length11 = jSONArray8.length();
                            for (int i16 = 0; i16 < length11; i16++) {
                                fg0 a6 = this.f.a(jSONArray8.getJSONObject(i16));
                                ri0 a7 = a6 != null ? this.e.a(a6, z3) : null;
                                if (a7 != null) {
                                    arrayList8.add(a7);
                                }
                            }
                            list6 = arrayList8;
                            keys = it;
                            list4 = list;
                            str16 = str2;
                        }
                    default:
                        str3 = str17;
                        jSONObject = jSONObject4;
                        str4 = str18;
                        break;
                }
            } else {
                str2 = str16;
                str3 = str17;
                jSONObject = jSONObject4;
                str4 = str18;
                it = keys;
                list = list4;
            }
            str5 = str19;
            dmVar2 = dmVar;
            jSONObject4 = jSONObject;
            str19 = str5;
            keys = it;
            list4 = list;
            str16 = str2;
            str18 = str4;
            str17 = str3;
        }
        String str39 = str19;
        List list8 = list4;
        if (list8.isEmpty()) {
            throw new o12(str39);
        }
        return new s12(list8, list3, list5, y4Var, MapsKt.mapOf(TuplesKt.to("status", go2.c)), list6, list7, str20, bz2Var, b6Var);
    }

    public final ez2 a(JSONObject jSONObject) {
        Object m8023constructorimpl;
        Object m8023constructorimpl2;
        Object m8023constructorimpl3;
        fz2 fz2Var;
        if (o42.a(jSONObject, POBCTAOverlayData.KEY_CTA_DELAY, "url")) {
            long j = jSONObject.getLong(POBCTAOverlayData.KEY_CTA_DELAY);
            this.c.getClass();
            String a = eb3.a("url", jSONObject);
            try {
                Result.Companion companion = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(Double.valueOf(jSONObject.optInt("visibilityPercent", 0)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m8028isFailureimpl(m8023constructorimpl)) {
                m8023constructorimpl = null;
            }
            Double d = (Double) m8023constructorimpl;
            int coerceIn = (int) RangesKt.coerceIn(d != null ? d.doubleValue() : 0.0d, 0.0d, 100.0d);
            try {
                m8023constructorimpl2 = Result.m8023constructorimpl(jSONObject.getString("type"));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.INSTANCE;
                m8023constructorimpl2 = Result.m8023constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m8028isFailureimpl(m8023constructorimpl2)) {
                m8023constructorimpl2 = null;
            }
            String str = (String) m8023constructorimpl2;
            if (str != null) {
                try {
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    m8023constructorimpl3 = Result.m8023constructorimpl(fz2.valueOf(upperCase));
                } catch (Throwable th3) {
                    Result.Companion companion4 = Result.INSTANCE;
                    m8023constructorimpl3 = Result.m8023constructorimpl(ResultKt.createFailure(th3));
                }
                if (Result.m8028isFailureimpl(m8023constructorimpl3)) {
                    m8023constructorimpl3 = null;
                }
                fz2Var = (fz2) m8023constructorimpl3;
            } else {
                fz2Var = null;
            }
            if (fz2Var == null) {
                this.h.getClass();
                if (StringsKt.contains$default((CharSequence) a, (CharSequence) "/rtbcount/", false, 2, (Object) null)) {
                    fz2Var = fz2.c;
                } else if (StringsKt.contains$default((CharSequence) a, (CharSequence) "/count/", false, 2, (Object) null)) {
                    fz2Var = fz2.b;
                } else {
                    fz2Var = fz2.d;
                }
            }
            return new ez2(coerceIn, j, a, fz2Var);
        }
        throw new o12("Native Ad json has not required attributes");
    }
}
