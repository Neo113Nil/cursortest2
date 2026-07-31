package com.five_corp.ad.internal.parser;

import com.facebook.appevents.UserDataStore;
import com.five_corp.ad.CreativeType;
import com.five_corp.ad.internal.ad.fullscreen.k;
import com.five_corp.ad.internal.ad.j;
import com.five_corp.ad.internal.m;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.appmetrica.analytics.impl.AbstractC5646rf;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class b {
    public static com.five_corp.ad.internal.ad.a a(JSONObject jSONObject) {
        int i;
        com.five_corp.ad.internal.ad.d dVar;
        int i2;
        com.five_corp.ad.internal.ad.h hVar;
        String str;
        com.five_corp.ad.internal.ad.h hVar2;
        com.five_corp.ad.internal.ad.g gVar;
        com.five_corp.ad.internal.ad.d dVar2;
        int i3;
        Long l;
        com.five_corp.ad.internal.ad.h hVar3;
        com.five_corp.ad.internal.ad.information_icon.e eVar;
        com.five_corp.ad.internal.ad.custom_layout.c cVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        j jVar;
        com.five_corp.ad.internal.ad.c cVar2;
        ArrayList arrayList3;
        com.five_corp.ad.internal.ad.h hVar4;
        com.five_corp.ad.internal.ad.h hVar5;
        int i4;
        long j;
        JSONArray jSONArray;
        String str2;
        com.five_corp.ad.internal.ad.h hVar6;
        ArrayList arrayList4;
        com.five_corp.ad.internal.ad.information_icon.e eVar2;
        com.five_corp.ad.internal.ad.fullscreen.h hVar7;
        int i5;
        com.five_corp.ad.internal.ad.fullscreen.e eVar3;
        com.five_corp.ad.internal.ad.h hVar8;
        int i6;
        ArrayList arrayList5;
        int i7;
        com.five_corp.ad.internal.ad.h hVar9;
        int i8;
        String str3;
        int i9;
        jSONObject.toString();
        String string = jSONObject.getString("ots");
        long j2 = jSONObject.getLong("ts");
        if (jSONObject.has("mpt")) {
            int i10 = jSONObject.getInt("mpt");
            int[] b = com.five_corp.ad.e.b(2);
            int length = b.length;
            for (int i11 = 0; i11 < length; i11++) {
                i = b[i11];
                if (i == 1) {
                    i9 = 1;
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    i9 = 3;
                }
                if (i9 != i10) {
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.b1, i10);
        }
        i = 1;
        com.five_corp.ad.internal.ad.h a = jSONObject.has(X3.i.Z) ? i.a(jSONObject.getJSONObject(X3.i.Z)) : new com.five_corp.ad.internal.ad.h(jSONObject.getString("m"), null, i == 1);
        if (jSONObject.has("mpc")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("mpc");
            dVar = new com.five_corp.ad.internal.ad.d(jSONObject2.has("sto") ? Long.valueOf(jSONObject2.getLong("sto")) : null);
        } else {
            dVar = null;
        }
        Long valueOf = jSONObject.has("maltms") ? Long.valueOf(jSONObject.getLong("maltms")) : null;
        com.five_corp.ad.internal.ad.h hVar10 = jSONObject.has("pi") ? new com.five_corp.ad.internal.ad.h(jSONObject.getString("pi"), null, false) : null;
        com.five_corp.ad.internal.ad.h a2 = jSONObject.has("ic") ? i.a(jSONObject.getJSONObject("ic")) : null;
        com.five_corp.ad.internal.ad.h a3 = jSONObject.has("iic") ? i.a(jSONObject.getJSONObject("iic")) : null;
        if (jSONObject.has("rt")) {
            int i12 = jSONObject.getInt("rt");
            for (int i13 : com.five_corp.ad.e.b(5)) {
                if (com.five_corp.ad.e.a(i13) == i12) {
                    i2 = i13;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.C0, i12);
        }
        i2 = 1;
        com.five_corp.ad.internal.ad.g gVar2 = new com.five_corp.ad.internal.ad.g(i2, jSONObject.optString("ru", null), jSONObject.optString("fbu", null));
        String string2 = jSONObject.has("iu") ? jSONObject.getString("iu") : null;
        if (jSONObject.has("info_icon")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("info_icon");
            JSONObject jSONObject4 = jSONObject3.getJSONObject(DownloadCommon.DOWNLOAD_REPORT_CANCEL);
            int i14 = jSONObject4.getInt(POBConstants.KEY_AT);
            l = valueOf;
            int i15 = 2;
            int[] b2 = com.five_corp.ad.e.b(2);
            gVar = gVar2;
            int length2 = b2.length;
            dVar2 = dVar;
            int i16 = 0;
            while (i16 < length2) {
                int i17 = length2;
                int i18 = b2[i16];
                int[] iArr = b2;
                if (i18 != 1) {
                    i6 = i15;
                    if (i18 != i6) {
                        throw null;
                    }
                } else {
                    i6 = 1;
                }
                if (i6 == i14) {
                    JSONArray optJSONArray = jSONObject4.optJSONArray("chs");
                    if (2 == i18 && (optJSONArray == null || optJSONArray.length() == 0)) {
                        throw new JSONException("chs is required when informationIconClickActionType is SHOW_CHOICES");
                    }
                    if (optJSONArray != null) {
                        arrayList5 = new ArrayList();
                        int i19 = 0;
                        while (i19 < optJSONArray.length()) {
                            JSONObject jSONObject5 = optJSONArray.getJSONObject(i19);
                            JSONArray jSONArray2 = optJSONArray;
                            String string3 = jSONObject5.getString("t");
                            int i20 = i;
                            int i21 = jSONObject5.getInt("cht");
                            String str4 = string;
                            int i22 = 3;
                            int[] b3 = com.five_corp.ad.e.b(3);
                            com.five_corp.ad.internal.ad.h hVar11 = a3;
                            int length3 = b3.length;
                            com.five_corp.ad.internal.ad.h hVar12 = a2;
                            int i23 = 0;
                            while (i23 < length3) {
                                int i24 = length3;
                                int i25 = b3[i23];
                                int[] iArr2 = b3;
                                if (i25 == 1) {
                                    i7 = i22;
                                    hVar9 = hVar10;
                                    i8 = 1;
                                } else if (i25 != 2) {
                                    i7 = i22;
                                    if (i25 != i7) {
                                        throw null;
                                    }
                                    hVar9 = hVar10;
                                    i8 = i7;
                                } else {
                                    i7 = i22;
                                    hVar9 = hVar10;
                                    i8 = 2;
                                }
                                if (i8 == i21) {
                                    if (i7 != i25) {
                                        str3 = null;
                                    } else {
                                        if (jSONObject5.isNull("url")) {
                                            throw new JSONException("url is required when informationIconClickChoiceType is OPEN_URL_OF_SPECIFIED");
                                        }
                                        str3 = jSONObject5.getString("url");
                                    }
                                    arrayList5.add(new com.five_corp.ad.internal.ad.information_icon.c(i25, string3, str3));
                                    i19++;
                                    string = str4;
                                    optJSONArray = jSONArray2;
                                    i = i20;
                                    hVar10 = hVar9;
                                    a3 = hVar11;
                                    a2 = hVar12;
                                } else {
                                    i23++;
                                    length3 = i24;
                                    hVar10 = hVar9;
                                    i22 = i7;
                                    b3 = iArr2;
                                }
                            }
                            throw new com.five_corp.ad.internal.exception.a(m.E1, i21);
                        }
                        hVar = a3;
                        str = string;
                        hVar2 = a2;
                        i3 = i;
                        hVar3 = hVar10;
                    } else {
                        hVar = a3;
                        str = string;
                        hVar2 = a2;
                        i3 = i;
                        hVar3 = hVar10;
                        arrayList5 = null;
                    }
                    com.five_corp.ad.internal.ad.information_icon.a aVar = new com.five_corp.ad.internal.ad.information_icon.a(i18, arrayList5);
                    JSONObject jSONObject6 = jSONObject3.getJSONObject(AbstractC5646rf.c);
                    com.five_corp.ad.internal.ad.information_icon.e eVar4 = new com.five_corp.ad.internal.ad.information_icon.e(aVar, new com.five_corp.ad.internal.ad.information_icon.f(!jSONObject6.isNull("mes") ? jSONObject6.getString("mes") : null));
                    if (1 == i18 && string2 == null) {
                        throw new JSONException("iu is required when informationIconClickActionType is OPEN_URL_OF_INFORMATION");
                    }
                    if (arrayList5 != null) {
                        Iterator it = arrayList5.iterator();
                        while (it.hasNext()) {
                            if (1 == ((com.five_corp.ad.internal.ad.information_icon.c) it.next()).b && string2 == null) {
                                throw new JSONException("iu is required when informationIconClickChoiceType is OPEN_URL_OF_INFORMATION");
                            }
                        }
                    }
                    eVar = eVar4;
                } else {
                    i16++;
                    string = string;
                    length2 = i17;
                    b2 = iArr;
                    i15 = 2;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.D1, i14);
        }
        hVar = a3;
        str = string;
        hVar2 = a2;
        gVar = gVar2;
        dVar2 = dVar;
        i3 = i;
        l = valueOf;
        hVar3 = hVar10;
        eVar = null;
        String string4 = jSONObject.has("an") ? jSONObject.getString("an") : null;
        String string5 = jSONObject.has("ti") ? jSONObject.getString("ti") : null;
        String string6 = jSONObject.has("bt") ? jSONObject.getString("bt") : null;
        String string7 = jSONObject.has(O6.w0) ? jSONObject.getString(O6.w0) : null;
        String string8 = jSONObject.has("ldt") ? jSONObject.getString("ldt") : null;
        ArrayList arrayList6 = new ArrayList();
        if (jSONObject.has("tr")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("tr");
            ArrayList arrayList7 = new ArrayList();
            int i26 = 0;
            while (i26 < jSONArray3.length()) {
                JSONObject jSONObject7 = jSONArray3.getJSONObject(i26);
                int i27 = jSONObject7.getInt("ev");
                com.five_corp.ad.internal.ad.beacon.e[] values = com.five_corp.ad.internal.ad.beacon.e.values();
                int length4 = values.length;
                int i28 = 0;
                while (i28 < length4) {
                    com.five_corp.ad.internal.ad.beacon.e eVar5 = values[i28];
                    JSONArray jSONArray4 = jSONArray3;
                    if (eVar5.a == i27) {
                        arrayList7.add(new com.five_corp.ad.internal.ad.beacon.d(eVar5, jSONObject7.getString("u"), jSONObject7.has("c") ? d.a(jSONObject7.getJSONObject("c")) : null, jSONObject7.optString("ua", null)));
                        i26++;
                        jSONArray3 = jSONArray4;
                    } else {
                        i28++;
                        jSONArray3 = jSONArray4;
                    }
                }
                throw new com.five_corp.ad.internal.exception.a(m.V0, i27);
            }
            cVar = null;
            arrayList = arrayList7;
        } else {
            cVar = null;
            arrayList = arrayList6;
        }
        JSONArray jSONArray5 = jSONObject.getJSONArray("scfg");
        ArrayList arrayList8 = new ArrayList();
        for (int i29 = 0; i29 < jSONArray5.length(); i29++) {
            JSONObject jSONObject8 = jSONArray5.getJSONObject(i29);
            arrayList8.add(new com.five_corp.ad.internal.ad.i(jSONObject8.getInt("c"), jSONObject8.getString("s")));
        }
        JSONArray jSONArray6 = jSONObject.getJSONArray("cfgs");
        ArrayList arrayList9 = new ArrayList();
        int i30 = 0;
        while (i30 < jSONArray6.length()) {
            JSONObject jSONObject9 = jSONArray6.getJSONObject(i30);
            int i31 = jSONObject9.getInt("id");
            com.five_corp.ad.internal.ad.custom_layout.c b4 = jSONObject9.has("lo") ? f.b(jSONObject9.getJSONObject("lo")) : cVar;
            if (jSONObject9.has(O6.W0)) {
                JSONObject jSONObject10 = jSONObject9.getJSONObject(O6.W0);
                if (jSONObject10.has("ori")) {
                    i5 = com.five_corp.ad.internal.ad.fullscreen.i.a(jSONObject10.getInt("ori"));
                    jSONArray = jSONArray6;
                } else {
                    jSONArray = jSONArray6;
                    i5 = 0;
                }
                arrayList4 = arrayList8;
                JSONObject jSONObject11 = jSONObject10.getJSONObject("fmid").getJSONObject("cf");
                int a4 = com.five_corp.ad.internal.ad.fullscreen.i.a(jSONObject11.getInt("o"));
                boolean z = jSONObject11.has("c") ? jSONObject11.getBoolean("c") : false;
                if (jSONObject11.has("ex")) {
                    eVar2 = eVar;
                    eVar3 = g.a(jSONObject11.getJSONObject("ex"));
                } else {
                    eVar2 = eVar;
                    eVar3 = null;
                }
                com.five_corp.ad.internal.ad.h a5 = jSONObject11.has("bg") ? i.a(jSONObject11.getJSONObject("bg")) : null;
                com.five_corp.ad.internal.ad.custom_layout.c b5 = f.b(jSONObject11.getJSONObject("lo"));
                str2 = string2;
                if (jSONObject11.has("lbg")) {
                    hVar6 = a;
                    hVar8 = i.a(jSONObject11.getJSONObject("lbg"));
                } else {
                    hVar6 = a;
                    hVar8 = null;
                }
                j = j2;
                com.five_corp.ad.internal.ad.fullscreen.f fVar = new com.five_corp.ad.internal.ad.fullscreen.f(new com.five_corp.ad.internal.ad.fullscreen.g(a4, z, eVar3, a5, b5, hVar8, jSONObject11.has("llo") ? f.b(jSONObject11.getJSONObject("llo")) : null));
                JSONObject jSONObject12 = jSONObject10.getJSONObject("fpost").getJSONObject("cf");
                com.five_corp.ad.internal.ad.fullscreen.i.a(jSONObject12.getInt("o"));
                hVar7 = new com.five_corp.ad.internal.ad.fullscreen.h(i5, fVar, new com.five_corp.ad.internal.ad.fullscreen.j(new k(jSONObject12.has("c") ? jSONObject12.getBoolean("c") : false, jSONObject12.has("i") ? i.a(jSONObject12.getJSONObject("i")) : null, jSONObject12.has("ex") ? g.a(jSONObject12.getJSONObject("ex")) : null, jSONObject12.has("bg") ? i.a(jSONObject12.getJSONObject("bg")) : null, f.b(jSONObject12.getJSONObject("lo")), jSONObject12.has("lbg") ? i.a(jSONObject12.getJSONObject("lbg")) : null, jSONObject12.has("llo") ? f.b(jSONObject12.getJSONObject("llo")) : null)), jSONObject10.has("bg") ? jSONObject10.getString("bg") : "FF000000");
            } else {
                j = j2;
                jSONArray = jSONArray6;
                str2 = string2;
                hVar6 = a;
                arrayList4 = arrayList8;
                eVar2 = eVar;
                hVar7 = null;
            }
            arrayList9.add(new com.five_corp.ad.internal.ad.format_config.a(i31, b4, hVar7));
            i30++;
            jSONArray6 = jSONArray;
            arrayList8 = arrayList4;
            j2 = j;
            eVar = eVar2;
            string2 = str2;
            a = hVar6;
            cVar = null;
        }
        long j3 = j2;
        String str5 = string2;
        com.five_corp.ad.internal.ad.h hVar13 = a;
        ArrayList arrayList10 = arrayList8;
        com.five_corp.ad.internal.ad.information_icon.e eVar6 = eVar;
        com.five_corp.ad.internal.ad.beacon.j jVar2 = com.five_corp.ad.internal.ad.beacon.j.e;
        com.five_corp.ad.internal.ad.beacon.k kVar = jVar2.a;
        if (jSONObject.has("vvty")) {
            int i32 = jSONObject.getInt("vvty");
            for (com.five_corp.ad.internal.ad.beacon.k kVar2 : com.five_corp.ad.internal.ad.beacon.k.values()) {
                if (kVar2.a == i32) {
                    kVar = kVar2;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.G1, i32);
        }
        double d = jVar2.c;
        if (jSONObject.has("vtar")) {
            d = jSONObject.getDouble("vtar");
        }
        com.five_corp.ad.internal.ad.beacon.i iVar = jVar2.b;
        if (jSONObject.has("vvct")) {
            int i33 = jSONObject.getInt("vvct");
            for (com.five_corp.ad.internal.ad.beacon.i iVar2 : com.five_corp.ad.internal.ad.beacon.i.values()) {
                if (iVar2.a == i33) {
                    iVar = iVar2;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.B1, i33);
        }
        com.five_corp.ad.internal.ad.beacon.j jVar3 = new com.five_corp.ad.internal.ad.beacon.j(kVar, iVar, d);
        com.five_corp.ad.internal.ad.beacon.f b6 = d.b(jSONObject.getJSONObject(POBConstants.KEY_IMPRESSION));
        com.five_corp.ad.internal.ad.beacon.f b7 = d.b(jSONObject.getJSONObject("vimp"));
        if (jSONObject.has("bcns")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("bcns");
            ArrayList arrayList11 = new ArrayList();
            for (int i34 = 0; i34 < jSONArray7.length(); i34++) {
                arrayList11.add(d.b(jSONArray7.getJSONObject(i34)));
            }
            arrayList2 = arrayList11;
        } else {
            arrayList2 = null;
        }
        if (jSONObject.has("vc")) {
            JSONObject jSONObject13 = jSONObject.getJSONObject("vc");
            ArrayList arrayList12 = new ArrayList();
            if (jSONObject13.has("vlms")) {
                JSONArray jSONArray8 = jSONObject13.getJSONArray("vlms");
                for (int i35 = 0; i35 < jSONArray8.length(); i35++) {
                    arrayList12.add(Integer.valueOf(jSONArray8.getInt(i35)));
                }
            }
            jVar = new j(arrayList12);
        } else {
            jVar = null;
        }
        String string9 = jSONObject.has("ext") ? jSONObject.getString("ext") : null;
        CreativeType creativeType = CreativeType.MOVIE;
        if (jSONObject.has(UserDataStore.CITY)) {
            creativeType = CreativeType.get(jSONObject.getInt(UserDataStore.CITY));
        }
        CreativeType creativeType2 = creativeType;
        if (jSONObject.has("dmc")) {
            JSONObject jSONObject14 = jSONObject.getJSONObject("dmc");
            if (jSONObject14.has("vdm")) {
                int i36 = jSONObject14.getInt("vdm");
                for (int i37 : com.five_corp.ad.e.b(2)) {
                    if (com.five_corp.ad.e.a(i37) == i36) {
                        i4 = i37;
                    }
                }
                throw new com.five_corp.ad.internal.exception.a(m.C1, i36);
            }
            i4 = 0;
            cVar2 = new com.five_corp.ad.internal.ad.c(i4);
        } else {
            cVar2 = null;
        }
        Long valueOf2 = Long.valueOf(j3);
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(hVar13);
        com.five_corp.ad.internal.ad.h hVar14 = hVar3;
        if (hVar3 != null) {
            arrayList13.add(hVar14);
        }
        com.five_corp.ad.internal.ad.h hVar15 = hVar2;
        if (hVar2 != null) {
            arrayList13.add(hVar15);
        }
        com.five_corp.ad.internal.ad.h hVar16 = hVar;
        if (hVar != null) {
            arrayList13.add(hVar16);
        }
        Iterator it2 = arrayList9.iterator();
        while (it2.hasNext()) {
            com.five_corp.ad.internal.ad.format_config.a aVar2 = (com.five_corp.ad.internal.ad.format_config.a) it2.next();
            ArrayList arrayList14 = new ArrayList();
            com.five_corp.ad.internal.ad.custom_layout.c cVar3 = aVar2.b;
            if (cVar3 != null) {
                arrayList14.add(cVar3);
            }
            com.five_corp.ad.internal.ad.fullscreen.h hVar17 = aVar2.c;
            if (hVar17 != null) {
                com.five_corp.ad.internal.ad.fullscreen.e eVar7 = hVar17.b.a.c;
                if (eVar7 != null && (hVar5 = eVar7.c.c) != null) {
                    arrayList13.add(hVar5);
                }
                com.five_corp.ad.internal.ad.h hVar18 = hVar17.b.a.d;
                if (hVar18 != null) {
                    arrayList13.add(hVar18);
                }
                com.five_corp.ad.internal.ad.h hVar19 = hVar17.b.a.f;
                if (hVar19 != null) {
                    arrayList13.add(hVar19);
                }
                arrayList14.add(hVar17.b.a.e);
                com.five_corp.ad.internal.ad.custom_layout.c cVar4 = hVar17.b.a.g;
                if (cVar4 != null) {
                    arrayList14.add(cVar4);
                }
                com.five_corp.ad.internal.ad.fullscreen.e eVar8 = hVar17.c.a.c;
                if (eVar8 != null && (hVar4 = eVar8.c.c) != null) {
                    arrayList13.add(hVar4);
                }
                com.five_corp.ad.internal.ad.h hVar20 = hVar17.c.a.b;
                if (hVar20 != null) {
                    arrayList13.add(hVar20);
                }
                com.five_corp.ad.internal.ad.h hVar21 = hVar17.c.a.d;
                if (hVar21 != null) {
                    arrayList13.add(hVar21);
                }
                com.five_corp.ad.internal.ad.h hVar22 = hVar17.c.a.f;
                if (hVar22 != null) {
                    arrayList13.add(hVar22);
                }
                arrayList14.add(hVar17.c.a.e);
                com.five_corp.ad.internal.ad.custom_layout.c cVar5 = hVar17.c.a.g;
                if (cVar5 != null) {
                    arrayList14.add(cVar5);
                }
            }
            Iterator it3 = arrayList14.iterator();
            while (it3.hasNext()) {
                Iterator it4 = ((com.five_corp.ad.internal.ad.custom_layout.c) it3.next()).c.iterator();
                while (it4.hasNext()) {
                    com.five_corp.ad.internal.ad.custom_layout.e eVar9 = (com.five_corp.ad.internal.ad.custom_layout.e) it4.next();
                    com.five_corp.ad.internal.ad.h hVar23 = eVar9.a.c;
                    if (hVar23 != null) {
                        arrayList13.add(hVar23);
                    }
                    com.five_corp.ad.internal.ad.custom_layout.j jVar4 = eVar9.a.d;
                    if (jVar4 != null && (arrayList3 = jVar4.b) != null) {
                        arrayList13.addAll(arrayList3);
                    }
                    com.five_corp.ad.internal.ad.custom_layout.g gVar3 = eVar9.a.e;
                    if (gVar3 != null) {
                        arrayList13.add(gVar3.a);
                    }
                    com.five_corp.ad.internal.ad.custom_layout.g gVar4 = eVar9.a.e;
                    if (gVar4 != null) {
                        arrayList13.add(gVar4.b);
                    }
                }
            }
        }
        return new com.five_corp.ad.internal.ad.a(creativeType2, str, valueOf2, i3, dVar2, gVar, str5, hVar13, l, hVar14, hVar15, hVar16, eVar6, string4, string5, string6, string7, string8, arrayList10, arrayList9, arrayList, jVar3, b6, b7, arrayList2, jVar, string9, arrayList13, cVar2);
    }
}
