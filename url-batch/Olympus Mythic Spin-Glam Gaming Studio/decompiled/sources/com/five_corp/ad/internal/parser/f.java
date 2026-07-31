package com.five_corp.ad.internal.parser;

import com.five_corp.ad.internal.ad.custom_layout.j;
import com.five_corp.ad.internal.ad.custom_layout.l;
import com.five_corp.ad.internal.m;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class f {
    public static com.five_corp.ad.internal.ad.custom_layout.b a(JSONObject jSONObject) {
        int i;
        int i2;
        int i3 = 1;
        l lVar = new l(1, null, null);
        if (jSONObject.has("tr")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("tr");
            int i4 = jSONObject2.getInt("t");
            for (int i5 : com.five_corp.ad.e.b(5)) {
                if (i5 != 1) {
                    i2 = 2;
                    if (i5 != 2) {
                        if (i5 != 3) {
                            i2 = 4;
                            if (i5 != 4) {
                                if (i5 != 5) {
                                    throw null;
                                }
                                i2 = 5;
                            }
                        } else {
                            i2 = 3;
                        }
                    }
                } else {
                    i2 = 1;
                }
                if (i2 == i4) {
                    lVar = new l(i5, jSONObject2.has("s") ? Integer.valueOf(jSONObject2.getInt("s")) : null, jSONObject2.has(EidRequestBuilder.REQUEST_FIELD_EMAIL) ? Integer.valueOf(jSONObject2.getInt(EidRequestBuilder.REQUEST_FIELD_EMAIL)) : null);
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.h1, i4);
        }
        if (jSONObject.has("sn")) {
            int i6 = jSONObject.getInt("sn");
            int[] b = com.five_corp.ad.e.b(3);
            int length = b.length;
            for (int i7 = 0; i7 < length; i7++) {
                i = b[i7];
                if (com.five_corp.ad.e.a(i) != i6) {
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.e1, i6);
        }
        i = 1;
        if (jSONObject.has("ps")) {
            int i8 = jSONObject.getInt("ps");
            for (int i9 : com.five_corp.ad.e.b(3)) {
                if (com.five_corp.ad.e.a(i9) == i8) {
                    i3 = i9;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.f1, i8);
        }
        return new com.five_corp.ad.internal.ad.custom_layout.b(lVar, i, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0270 A[LOOP:1: B:5:0x0046->B:10:0x0270, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.five_corp.ad.internal.ad.custom_layout.c b(JSONObject jSONObject) {
        int i;
        int i2;
        Boolean bool;
        int i3;
        com.five_corp.ad.internal.ad.custom_layout.d dVar;
        int i4;
        com.five_corp.ad.internal.ad.custom_layout.d dVar2;
        ArrayList arrayList;
        int i5 = jSONObject.getInt("w");
        int i6 = jSONObject.getInt("h");
        JSONArray jSONArray = jSONObject.getJSONArray("ls");
        ArrayList arrayList2 = new ArrayList();
        int i7 = 0;
        while (i7 < jSONArray.length()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("o");
            int i8 = jSONObject3.getInt("o");
            JSONArray jSONArray2 = jSONArray;
            int[] b = com.five_corp.ad.e.b(7);
            int i9 = i5;
            int length = b.length;
            int i10 = i6;
            int i11 = 0;
            while (i11 < length) {
                int i12 = b[i11];
                int i13 = length;
                switch (i12) {
                    case 1:
                        i = 1;
                        if (i == i8) {
                            switch (com.five_corp.ad.e.a(i12)) {
                                case 0:
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("t");
                                    String string = jSONObject4.getString("t");
                                    String string2 = jSONObject4.getString("c");
                                    String string3 = jSONObject4.getString("bg");
                                    if (jSONObject4.has("g")) {
                                        int i14 = jSONObject4.getInt("g");
                                        int[] b2 = com.five_corp.ad.e.b(3);
                                        int length2 = b2.length;
                                        int i15 = 0;
                                        while (i15 < length2) {
                                            int i16 = length2;
                                            int i17 = b2[i15];
                                            int[] iArr = b2;
                                            if (i17 == 1) {
                                                bool = null;
                                                i4 = 1;
                                            } else if (i17 != 2) {
                                                i4 = 3;
                                                bool = null;
                                                if (i17 != 3) {
                                                    throw null;
                                                }
                                            } else {
                                                bool = null;
                                                i4 = 2;
                                            }
                                            if (i4 == i14) {
                                                i3 = i17;
                                            } else {
                                                i15++;
                                                length2 = i16;
                                                b2 = iArr;
                                            }
                                        }
                                        throw new com.five_corp.ad.internal.exception.a(m.g1, i14);
                                    }
                                    bool = null;
                                    i3 = 0;
                                    dVar = new com.five_corp.ad.internal.ad.custom_layout.d(1, new com.five_corp.ad.internal.ad.custom_layout.h(string, string2, string3, i3, jSONObject4.has(InneractiveMediationDefs.GENDER_FEMALE) ? Boolean.valueOf(jSONObject4.getBoolean(InneractiveMediationDefs.GENDER_FEMALE)) : bool, jSONObject4.has("bf") ? Boolean.valueOf(jSONObject4.getBoolean("bf")) : bool, jSONObject4.has("s") ? Integer.valueOf(jSONObject4.getInt("s")) : bool), null, null, null, null);
                                    arrayList2.add(new com.five_corp.ad.internal.ad.custom_layout.e(dVar, jSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObject2.getInt(VastAttributes.VERTICAL_POSITION), jSONObject2.getInt("z"), jSONObject2.getInt("w"), jSONObject2.getInt("h"), jSONObject2.has("cn") ? a(jSONObject2.getJSONObject("cn")) : bool));
                                    i7++;
                                    jSONArray = jSONArray2;
                                    i5 = i9;
                                    i6 = i10;
                                case 1:
                                    dVar2 = new com.five_corp.ad.internal.ad.custom_layout.d(2, null, i.a(jSONObject3.getJSONObject("i")), null, null, null);
                                    dVar = dVar2;
                                    bool = null;
                                    arrayList2.add(new com.five_corp.ad.internal.ad.custom_layout.e(dVar, jSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObject2.getInt(VastAttributes.VERTICAL_POSITION), jSONObject2.getInt("z"), jSONObject2.getInt("w"), jSONObject2.getInt("h"), jSONObject2.has("cn") ? a(jSONObject2.getJSONObject("cn")) : bool));
                                    i7++;
                                    jSONArray = jSONArray2;
                                    i5 = i9;
                                    i6 = i10;
                                    break;
                                case 2:
                                    jSONObject3.getJSONObject("m");
                                    dVar2 = new com.five_corp.ad.internal.ad.custom_layout.d(3, null, null, null, null, null);
                                    dVar = dVar2;
                                    bool = null;
                                    arrayList2.add(new com.five_corp.ad.internal.ad.custom_layout.e(dVar, jSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObject2.getInt(VastAttributes.VERTICAL_POSITION), jSONObject2.getInt("z"), jSONObject2.getInt("w"), jSONObject2.getInt("h"), jSONObject2.has("cn") ? a(jSONObject2.getJSONObject("cn")) : bool));
                                    i7++;
                                    jSONArray = jSONArray2;
                                    i5 = i9;
                                    i6 = i10;
                                    break;
                                case 3:
                                    JSONObject jSONObject5 = jSONObject3.getJSONObject("h");
                                    int i18 = jSONObject5.getInt("w");
                                    jSONObject5.getInt("h");
                                    if (jSONObject5.has("r")) {
                                        JSONArray jSONArray3 = jSONObject5.getJSONArray("r");
                                        arrayList = new ArrayList();
                                        for (int i19 = 0; i19 < jSONArray3.length(); i19++) {
                                            arrayList.add(i.a(jSONArray3.getJSONObject(i19)));
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    dVar = new com.five_corp.ad.internal.ad.custom_layout.d(4, null, null, new j(i18, arrayList, jSONObject5.getString("s")), null, null);
                                    bool = null;
                                    arrayList2.add(new com.five_corp.ad.internal.ad.custom_layout.e(dVar, jSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObject2.getInt(VastAttributes.VERTICAL_POSITION), jSONObject2.getInt("z"), jSONObject2.getInt("w"), jSONObject2.getInt("h"), jSONObject2.has("cn") ? a(jSONObject2.getJSONObject("cn")) : bool));
                                    i7++;
                                    jSONArray = jSONArray2;
                                    i5 = i9;
                                    i6 = i10;
                                    break;
                                case 4:
                                    JSONObject jSONObject6 = jSONObject3.getJSONObject("p");
                                    dVar2 = new com.five_corp.ad.internal.ad.custom_layout.d(5, null, null, null, new com.five_corp.ad.internal.ad.custom_layout.g(i.a(jSONObject6.getJSONObject(InneractiveMediationDefs.GENDER_FEMALE)), i.a(jSONObject6.getJSONObject("b"))), null);
                                    dVar = dVar2;
                                    bool = null;
                                    arrayList2.add(new com.five_corp.ad.internal.ad.custom_layout.e(dVar, jSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObject2.getInt(VastAttributes.VERTICAL_POSITION), jSONObject2.getInt("z"), jSONObject2.getInt("w"), jSONObject2.getInt("h"), jSONObject2.has("cn") ? a(jSONObject2.getJSONObject("cn")) : bool));
                                    i7++;
                                    jSONArray = jSONArray2;
                                    i5 = i9;
                                    i6 = i10;
                                    break;
                                case 5:
                                    JSONObject jSONObject7 = jSONObject3.getJSONObject("c");
                                    dVar2 = new com.five_corp.ad.internal.ad.custom_layout.d(6, null, null, null, null, new com.five_corp.ad.internal.ad.custom_layout.f(jSONObject7.getString("cc"), jSONObject7.getString("bc"), jSONObject7.getString("pc"), jSONObject7.getString("fc")));
                                    dVar = dVar2;
                                    bool = null;
                                    arrayList2.add(new com.five_corp.ad.internal.ad.custom_layout.e(dVar, jSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObject2.getInt(VastAttributes.VERTICAL_POSITION), jSONObject2.getInt("z"), jSONObject2.getInt("w"), jSONObject2.getInt("h"), jSONObject2.has("cn") ? a(jSONObject2.getJSONObject("cn")) : bool));
                                    i7++;
                                    jSONArray = jSONArray2;
                                    i5 = i9;
                                    i6 = i10;
                                    break;
                                case 6:
                                    dVar2 = new com.five_corp.ad.internal.ad.custom_layout.d(7, null, null, null, null, null);
                                    dVar = dVar2;
                                    bool = null;
                                    arrayList2.add(new com.five_corp.ad.internal.ad.custom_layout.e(dVar, jSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObject2.getInt(VastAttributes.VERTICAL_POSITION), jSONObject2.getInt("z"), jSONObject2.getInt("w"), jSONObject2.getInt("h"), jSONObject2.has("cn") ? a(jSONObject2.getJSONObject("cn")) : bool));
                                    i7++;
                                    jSONArray = jSONArray2;
                                    i5 = i9;
                                    i6 = i10;
                                    break;
                                default:
                                    throw new com.five_corp.ad.internal.exception.b(m.A3, null);
                            }
                        } else {
                            i11++;
                            length = i13;
                        }
                    case 2:
                        i = 2;
                        if (i == i8) {
                        }
                        break;
                    case 3:
                        i = 3;
                        if (i == i8) {
                        }
                        break;
                    case 4:
                        i2 = 4;
                        i = i2;
                        if (i == i8) {
                        }
                        break;
                    case 5:
                        i2 = 6;
                        i = i2;
                        if (i == i8) {
                        }
                        break;
                    case 6:
                        i = 7;
                        if (i == i8) {
                        }
                        break;
                    case 7:
                        i = 9;
                        if (i == i8) {
                        }
                        break;
                    default:
                        throw null;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.d1, i8);
        }
        int i20 = i5;
        int i21 = i6;
        JSONArray jSONArray4 = jSONObject.getJSONArray("cs");
        ArrayList arrayList3 = new ArrayList();
        int i22 = 0;
        while (i22 < jSONArray4.length()) {
            JSONObject jSONObject8 = jSONArray4.getJSONObject(i22);
            int i23 = jSONObject8.getInt("t");
            int[] b3 = com.five_corp.ad.e.b(9);
            int length3 = b3.length;
            int i24 = 0;
            while (i24 < length3) {
                int i25 = b3[i24];
                JSONArray jSONArray5 = jSONArray4;
                if (com.five_corp.ad.e.a(i25) == i23) {
                    arrayList3.add(new com.five_corp.ad.internal.ad.custom_layout.a(i25, jSONObject8.getInt(VastAttributes.HORIZONTAL_POSITION), jSONObject8.getInt(VastAttributes.VERTICAL_POSITION), jSONObject8.getInt("z"), jSONObject8.getInt("w"), jSONObject8.getInt("h"), jSONObject8.has("cn") ? a(jSONObject8.getJSONObject("cn")) : null, jSONObject8.has("url") ? jSONObject8.getString("url") : null));
                    i22++;
                    jSONArray4 = jSONArray5;
                } else {
                    i24++;
                    jSONArray4 = jSONArray5;
                }
            }
            throw new com.five_corp.ad.internal.exception.a(m.c1, i23);
        }
        return new com.five_corp.ad.internal.ad.custom_layout.c(i20, i21, arrayList2, arrayList3);
    }
}
