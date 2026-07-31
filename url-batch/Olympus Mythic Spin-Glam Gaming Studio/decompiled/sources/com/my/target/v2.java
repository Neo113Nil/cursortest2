package com.my.target;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.common.models.ImageData;
import com.my.target.d7;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class v2 {
    final y a;
    final n b;
    final ei c;

    private v2(y yVar, n nVar) {
        this.a = yVar;
        this.b = nVar;
        this.c = ei.a(yVar, nVar);
    }

    public static v2 a(y yVar, n nVar) {
        return new v2(yVar, nVar);
    }

    c7 a(JSONObject jSONObject, x0 x0Var, sh shVar) {
        x0 x0Var2;
        String str;
        int i;
        ArrayList arrayList;
        JSONArray jSONArray;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject2;
        String optString;
        String optString2;
        th a;
        ArrayList arrayList2;
        String str12;
        int i2;
        String str13;
        String str14;
        ArrayList arrayList3;
        int i3;
        x0 x0Var3 = x0Var;
        String str15 = "message=";
        String str16 = "src";
        String str17 = POBConstants.KEY_FORMAT;
        String str18 = "mediafiles";
        String str19 = IronSourceConstants.EVENTS_DURATION;
        String str20 = "preview";
        String str21 = "id";
        String str22 = "image";
        String str23 = "type";
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            String str24 = "video";
            if (jSONArray2.length() < 2) {
                x0Var3.a("items").c(3006);
                return null;
            }
            ArrayList arrayList4 = new ArrayList();
            int i4 = 0;
            while (i4 < jSONArray2.length()) {
                try {
                    jSONObject2 = jSONArray2.getJSONObject(i4);
                    str3 = str15;
                    try {
                        optString = jSONObject2.optString(str21);
                    } catch (Throwable th) {
                        th = th;
                        arrayList = arrayList4;
                        jSONArray = jSONArray2;
                        str2 = str23;
                        x0Var2 = x0Var3;
                        str4 = str17;
                        str5 = str18;
                        str6 = str19;
                        str7 = str20;
                        str8 = str21;
                        str9 = str22;
                        str10 = str24;
                        str11 = str16;
                        try {
                            x0 b = x0Var2.b(i4);
                            StringBuilder sb = new StringBuilder();
                            str = str3;
                            try {
                                sb.append(str);
                                sb.append(th.getMessage());
                                i = 3001;
                                try {
                                    b.a(3001, sb.toString(), th);
                                    i4++;
                                    str23 = str2;
                                    str15 = str;
                                    str16 = str11;
                                    str21 = str8;
                                    str22 = str9;
                                    str19 = str6;
                                    str20 = str7;
                                    jSONArray2 = jSONArray;
                                    str24 = str10;
                                    str18 = str5;
                                    str17 = str4;
                                    x0Var3 = x0Var2;
                                    arrayList4 = arrayList;
                                } catch (Throwable th2) {
                                    th = th2;
                                    x0Var2.a(i, str + th.getMessage(), th);
                                    return null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i = 3001;
                                x0Var2.a(i, str + th.getMessage(), th);
                                return null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str = str3;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    arrayList = arrayList4;
                    jSONArray = jSONArray2;
                    str2 = str23;
                    x0Var2 = x0Var3;
                    str3 = str15;
                }
                if (TextUtils.isEmpty(optString)) {
                    x0Var3.b(i4).a(str21).c(3006);
                    arrayList = arrayList4;
                    jSONArray = jSONArray2;
                    str2 = str23;
                    x0Var2 = x0Var3;
                    str4 = str17;
                    str5 = str18;
                    str6 = str19;
                    str7 = str20;
                    str8 = str21;
                } else {
                    str8 = str21;
                    try {
                        optString2 = jSONObject2.optString(str23);
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        try {
                            x0Var3.b(i4).a(str23).c(3006);
                            arrayList = arrayList4;
                            jSONArray = jSONArray2;
                            str2 = str23;
                            x0Var2 = x0Var3;
                            str4 = str17;
                            str5 = str18;
                            str6 = str19;
                            str7 = str20;
                        } catch (Throwable th7) {
                            th = th7;
                            arrayList = arrayList4;
                            jSONArray = jSONArray2;
                            str2 = str23;
                            x0Var2 = x0Var3;
                            str4 = str17;
                            str5 = str18;
                            str6 = str19;
                            str7 = str20;
                            str9 = str22;
                            str10 = str24;
                            str11 = str16;
                            x0 b2 = x0Var2.b(i4);
                            StringBuilder sb2 = new StringBuilder();
                            str = str3;
                            sb2.append(str);
                            sb2.append(th.getMessage());
                            i = 3001;
                            b2.a(3001, sb2.toString(), th);
                            i4++;
                            str23 = str2;
                            str15 = str;
                            str16 = str11;
                            str21 = str8;
                            str22 = str9;
                            str19 = str6;
                            str20 = str7;
                            jSONArray2 = jSONArray;
                            str24 = str10;
                            str18 = str5;
                            str17 = str4;
                            x0Var3 = x0Var2;
                            arrayList4 = arrayList;
                        }
                    } else {
                        int i5 = i4;
                        try {
                            a = th.a(x0Var.c(), shVar);
                            arrayList2 = arrayList4;
                            jSONArray = jSONArray2;
                            str12 = str17;
                            i2 = i5;
                            String str25 = str24;
                            str11 = str16;
                            str13 = str25;
                            str14 = str23;
                            try {
                                this.c.a(a, jSONObject2, optString, 0.0f, x0Var);
                            } catch (Throwable th8) {
                                th = th8;
                                x0Var2 = x0Var3;
                                str10 = str13;
                                i4 = i2;
                                str5 = str18;
                                str6 = str19;
                                str7 = str20;
                                str9 = str22;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            arrayList = arrayList4;
                            jSONArray = jSONArray2;
                            str2 = str23;
                            x0Var2 = x0Var3;
                            str4 = str17;
                            str5 = str18;
                            str6 = str19;
                            str7 = str20;
                            str10 = str24;
                            i4 = i5;
                            str11 = str16;
                            str9 = str22;
                        }
                        if (str22.equals(optString2)) {
                            try {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject(str22);
                                x0 a2 = x0Var3.b(i2).a(str22);
                                String optString3 = jSONObject3.optString("url");
                                if (TextUtils.isEmpty(optString3)) {
                                    a2.a("url").c(3006);
                                } else {
                                    int optInt = jSONObject3.optInt("width");
                                    if (optInt == 0) {
                                        a2.a("width").c(3006);
                                    } else {
                                        int optInt2 = jSONObject3.optInt("height");
                                        if (optInt2 == 0) {
                                            a2.a("height").c(3006);
                                        } else {
                                            arrayList3 = arrayList2;
                                            try {
                                                arrayList3.add(new d7(optString, optString2, ImageData.newImageData(optString3, optInt, optInt2), a));
                                                arrayList = arrayList3;
                                                str10 = str13;
                                                i3 = i2;
                                                str5 = str18;
                                                str6 = str19;
                                                str7 = str20;
                                                str9 = str22;
                                                str4 = str12;
                                                str18 = null;
                                                x0Var2 = x0Var;
                                                str = str3;
                                                i4 = i3;
                                                str2 = str14;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                arrayList = arrayList3;
                                                x0Var2 = x0Var3;
                                                str10 = str13;
                                                i4 = i2;
                                                str5 = str18;
                                                str6 = str19;
                                                str7 = str20;
                                                str9 = str22;
                                                str4 = str12;
                                                str2 = str14;
                                                x0 b22 = x0Var2.b(i4);
                                                StringBuilder sb22 = new StringBuilder();
                                                str = str3;
                                                sb22.append(str);
                                                sb22.append(th.getMessage());
                                                i = 3001;
                                                b22.a(3001, sb22.toString(), th);
                                                i4++;
                                                str23 = str2;
                                                str15 = str;
                                                str16 = str11;
                                                str21 = str8;
                                                str22 = str9;
                                                str19 = str6;
                                                str20 = str7;
                                                jSONArray2 = jSONArray;
                                                str24 = str10;
                                                str18 = str5;
                                                str17 = str4;
                                                x0Var3 = x0Var2;
                                                arrayList4 = arrayList;
                                            }
                                        }
                                    }
                                }
                                x0Var2 = x0Var3;
                                str10 = str13;
                                i4 = i2;
                                str5 = str18;
                                str6 = str19;
                                str7 = str20;
                                str9 = str22;
                                str4 = str12;
                                str = str3;
                                arrayList = arrayList2;
                                str2 = str14;
                            } catch (Throwable th11) {
                                th = th11;
                                arrayList3 = arrayList2;
                            }
                        } else {
                            if (str13.equals(optString2)) {
                                try {
                                    JSONObject jSONObject4 = jSONObject2.getJSONObject(str13);
                                    JSONObject jSONObject5 = jSONObject4.getJSONObject(str20);
                                    str9 = str22;
                                    try {
                                        String optString4 = jSONObject5.optString("url");
                                        arrayList2 = arrayList2;
                                        try {
                                            x0 a3 = x0Var3.b(i2).a(str13).a(str20);
                                            if (TextUtils.isEmpty(optString4)) {
                                                try {
                                                    a3.a("url").c(3006);
                                                } catch (Throwable th12) {
                                                    th = th12;
                                                    x0Var2 = x0Var3;
                                                    str10 = str13;
                                                    i4 = i2;
                                                    str5 = str18;
                                                    str6 = str19;
                                                    str7 = str20;
                                                    str4 = str12;
                                                    arrayList = arrayList2;
                                                    str2 = str14;
                                                    x0 b222 = x0Var2.b(i4);
                                                    StringBuilder sb222 = new StringBuilder();
                                                    str = str3;
                                                    sb222.append(str);
                                                    sb222.append(th.getMessage());
                                                    i = 3001;
                                                    b222.a(3001, sb222.toString(), th);
                                                    i4++;
                                                    str23 = str2;
                                                    str15 = str;
                                                    str16 = str11;
                                                    str21 = str8;
                                                    str22 = str9;
                                                    str19 = str6;
                                                    str20 = str7;
                                                    jSONArray2 = jSONArray;
                                                    str24 = str10;
                                                    str18 = str5;
                                                    str17 = str4;
                                                    x0Var3 = x0Var2;
                                                    arrayList4 = arrayList;
                                                }
                                            } else {
                                                int optInt3 = jSONObject5.optInt("width");
                                                if (optInt3 == 0) {
                                                    a3.a("width").c(3006);
                                                } else {
                                                    int optInt4 = jSONObject5.optInt("height");
                                                    if (optInt4 == 0) {
                                                        a3.a("height").c(3006);
                                                    } else {
                                                        int optInt5 = jSONObject4.optInt(str19);
                                                        if (optInt5 == 0) {
                                                            x0Var3.b(i2).a(str13).a(str19).c(3006);
                                                        } else {
                                                            JSONArray jSONArray3 = jSONObject4.getJSONArray(str18);
                                                            str6 = str19;
                                                            try {
                                                                ArrayList arrayList5 = new ArrayList();
                                                                str7 = str20;
                                                                int i6 = 0;
                                                                while (i6 < jSONArray3.length()) {
                                                                    try {
                                                                        try {
                                                                            x0 b3 = x0Var3.b(i2).a(str13).a(str18).b(i6);
                                                                            str10 = str13;
                                                                            try {
                                                                                JSONObject optJSONObject = jSONArray3.optJSONObject(i6);
                                                                                str5 = str18;
                                                                                String str26 = str12;
                                                                                JSONArray jSONArray4 = jSONArray3;
                                                                                try {
                                                                                    String optString5 = optJSONObject.optString(str26);
                                                                                    if (TextUtils.isEmpty(optString5)) {
                                                                                        try {
                                                                                            b3.a(str26).c(3006);
                                                                                            i3 = i2;
                                                                                            str4 = str26;
                                                                                        } catch (Throwable th13) {
                                                                                            th = th13;
                                                                                            x0Var2 = x0Var3;
                                                                                            i4 = i2;
                                                                                            str4 = str26;
                                                                                            arrayList = arrayList2;
                                                                                            str2 = str14;
                                                                                            x0 b2222 = x0Var2.b(i4);
                                                                                            StringBuilder sb2222 = new StringBuilder();
                                                                                            str = str3;
                                                                                            sb2222.append(str);
                                                                                            sb2222.append(th.getMessage());
                                                                                            i = 3001;
                                                                                            b2222.a(3001, sb2222.toString(), th);
                                                                                            i4++;
                                                                                            str23 = str2;
                                                                                            str15 = str;
                                                                                            str16 = str11;
                                                                                            str21 = str8;
                                                                                            str22 = str9;
                                                                                            str19 = str6;
                                                                                            str20 = str7;
                                                                                            jSONArray2 = jSONArray;
                                                                                            str24 = str10;
                                                                                            str18 = str5;
                                                                                            str17 = str4;
                                                                                            x0Var3 = x0Var2;
                                                                                            arrayList4 = arrayList;
                                                                                        }
                                                                                    } else {
                                                                                        str4 = str26;
                                                                                        String str27 = str11;
                                                                                        try {
                                                                                            String optString6 = optJSONObject.optString(str27);
                                                                                            if (TextUtils.isEmpty(optString6)) {
                                                                                                try {
                                                                                                    b3.a(str27).c(3006);
                                                                                                    i3 = i2;
                                                                                                    str11 = str27;
                                                                                                } catch (Throwable th14) {
                                                                                                    th = th14;
                                                                                                    x0Var2 = x0Var;
                                                                                                    i4 = i2;
                                                                                                    str11 = str27;
                                                                                                    arrayList = arrayList2;
                                                                                                    str2 = str14;
                                                                                                    x0 b22222 = x0Var2.b(i4);
                                                                                                    StringBuilder sb22222 = new StringBuilder();
                                                                                                    str = str3;
                                                                                                    sb22222.append(str);
                                                                                                    sb22222.append(th.getMessage());
                                                                                                    i = 3001;
                                                                                                    b22222.a(3001, sb22222.toString(), th);
                                                                                                    i4++;
                                                                                                    str23 = str2;
                                                                                                    str15 = str;
                                                                                                    str16 = str11;
                                                                                                    str21 = str8;
                                                                                                    str22 = str9;
                                                                                                    str19 = str6;
                                                                                                    str20 = str7;
                                                                                                    jSONArray2 = jSONArray;
                                                                                                    str24 = str10;
                                                                                                    str18 = str5;
                                                                                                    str17 = str4;
                                                                                                    x0Var3 = x0Var2;
                                                                                                    arrayList4 = arrayList;
                                                                                                }
                                                                                            } else {
                                                                                                i3 = i2;
                                                                                                str11 = str27;
                                                                                                try {
                                                                                                    int optInt6 = optJSONObject.optInt("width", 0);
                                                                                                    if (optInt6 == 0) {
                                                                                                        b3.a("width").c(3006);
                                                                                                    } else {
                                                                                                        int optInt7 = optJSONObject.optInt("height", 0);
                                                                                                        if (optInt7 == 0) {
                                                                                                            try {
                                                                                                                b3.a("height").c(3006);
                                                                                                            } catch (Throwable th15) {
                                                                                                                th = th15;
                                                                                                                x0Var2 = x0Var;
                                                                                                                arrayList = arrayList2;
                                                                                                                i4 = i3;
                                                                                                                str2 = str14;
                                                                                                                x0 b222222 = x0Var2.b(i4);
                                                                                                                StringBuilder sb222222 = new StringBuilder();
                                                                                                                str = str3;
                                                                                                                sb222222.append(str);
                                                                                                                sb222222.append(th.getMessage());
                                                                                                                i = 3001;
                                                                                                                b222222.a(3001, sb222222.toString(), th);
                                                                                                                i4++;
                                                                                                                str23 = str2;
                                                                                                                str15 = str;
                                                                                                                str16 = str11;
                                                                                                                str21 = str8;
                                                                                                                str22 = str9;
                                                                                                                str19 = str6;
                                                                                                                str20 = str7;
                                                                                                                jSONArray2 = jSONArray;
                                                                                                                str24 = str10;
                                                                                                                str18 = str5;
                                                                                                                str17 = str4;
                                                                                                                x0Var3 = x0Var2;
                                                                                                                arrayList4 = arrayList;
                                                                                                            }
                                                                                                        } else {
                                                                                                            arrayList5.add(new d7.a(optString5, optString6, optInt6, optInt7));
                                                                                                        }
                                                                                                    }
                                                                                                    i6++;
                                                                                                    x0Var3 = x0Var;
                                                                                                    jSONArray3 = jSONArray4;
                                                                                                    i2 = i3;
                                                                                                    str13 = str10;
                                                                                                    str18 = str5;
                                                                                                    str12 = str4;
                                                                                                } catch (Throwable th16) {
                                                                                                    th = th16;
                                                                                                }
                                                                                            }
                                                                                        } catch (Throwable th17) {
                                                                                            th = th17;
                                                                                            i3 = i2;
                                                                                            str11 = str27;
                                                                                            x0Var2 = x0Var;
                                                                                            arrayList = arrayList2;
                                                                                            i4 = i3;
                                                                                            str2 = str14;
                                                                                            x0 b2222222 = x0Var2.b(i4);
                                                                                            StringBuilder sb2222222 = new StringBuilder();
                                                                                            str = str3;
                                                                                            sb2222222.append(str);
                                                                                            sb2222222.append(th.getMessage());
                                                                                            i = 3001;
                                                                                            b2222222.a(3001, sb2222222.toString(), th);
                                                                                            i4++;
                                                                                            str23 = str2;
                                                                                            str15 = str;
                                                                                            str16 = str11;
                                                                                            str21 = str8;
                                                                                            str22 = str9;
                                                                                            str19 = str6;
                                                                                            str20 = str7;
                                                                                            jSONArray2 = jSONArray;
                                                                                            str24 = str10;
                                                                                            str18 = str5;
                                                                                            str17 = str4;
                                                                                            x0Var3 = x0Var2;
                                                                                            arrayList4 = arrayList;
                                                                                        }
                                                                                    }
                                                                                    i6++;
                                                                                    x0Var3 = x0Var;
                                                                                    jSONArray3 = jSONArray4;
                                                                                    i2 = i3;
                                                                                    str13 = str10;
                                                                                    str18 = str5;
                                                                                    str12 = str4;
                                                                                } catch (Throwable th18) {
                                                                                    th = th18;
                                                                                    i3 = i2;
                                                                                    str4 = str26;
                                                                                }
                                                                            } catch (Throwable th19) {
                                                                                th = th19;
                                                                                i3 = i2;
                                                                                str5 = str18;
                                                                                str4 = str12;
                                                                                x0Var2 = x0Var;
                                                                                arrayList = arrayList2;
                                                                                i4 = i3;
                                                                                str2 = str14;
                                                                                x0 b22222222 = x0Var2.b(i4);
                                                                                StringBuilder sb22222222 = new StringBuilder();
                                                                                str = str3;
                                                                                sb22222222.append(str);
                                                                                sb22222222.append(th.getMessage());
                                                                                i = 3001;
                                                                                b22222222.a(3001, sb22222222.toString(), th);
                                                                                i4++;
                                                                                str23 = str2;
                                                                                str15 = str;
                                                                                str16 = str11;
                                                                                str21 = str8;
                                                                                str22 = str9;
                                                                                str19 = str6;
                                                                                str20 = str7;
                                                                                jSONArray2 = jSONArray;
                                                                                str24 = str10;
                                                                                str18 = str5;
                                                                                str17 = str4;
                                                                                x0Var3 = x0Var2;
                                                                                arrayList4 = arrayList;
                                                                            }
                                                                        } catch (Throwable th20) {
                                                                            th = th20;
                                                                            str10 = str13;
                                                                        }
                                                                    } catch (Throwable th21) {
                                                                        th = th21;
                                                                        str10 = str13;
                                                                        i3 = i2;
                                                                        str5 = str18;
                                                                        str4 = str12;
                                                                        arrayList = arrayList2;
                                                                        x0Var2 = x0Var;
                                                                        i4 = i3;
                                                                        str2 = str14;
                                                                        x0 b222222222 = x0Var2.b(i4);
                                                                        StringBuilder sb222222222 = new StringBuilder();
                                                                        str = str3;
                                                                        sb222222222.append(str);
                                                                        sb222222222.append(th.getMessage());
                                                                        i = 3001;
                                                                        b222222222.a(3001, sb222222222.toString(), th);
                                                                        i4++;
                                                                        str23 = str2;
                                                                        str15 = str;
                                                                        str16 = str11;
                                                                        str21 = str8;
                                                                        str22 = str9;
                                                                        str19 = str6;
                                                                        str20 = str7;
                                                                        jSONArray2 = jSONArray;
                                                                        str24 = str10;
                                                                        str18 = str5;
                                                                        str17 = str4;
                                                                        x0Var3 = x0Var2;
                                                                        arrayList4 = arrayList;
                                                                    }
                                                                }
                                                                str10 = str13;
                                                                i3 = i2;
                                                                str5 = str18;
                                                                str4 = str12;
                                                                try {
                                                                    d7 d7Var = new d7(optString, optString2, new d7.b(ImageData.newImageData(optString4, optInt3, optInt4), arrayList5, optInt5), a);
                                                                    arrayList = arrayList2;
                                                                    try {
                                                                        arrayList.add(d7Var);
                                                                        x0Var2 = x0Var;
                                                                        str = str3;
                                                                        i4 = i3;
                                                                        str2 = str14;
                                                                    } catch (Throwable th22) {
                                                                        th = th22;
                                                                        x0Var2 = x0Var;
                                                                        i4 = i3;
                                                                        str2 = str14;
                                                                        x0 b2222222222 = x0Var2.b(i4);
                                                                        StringBuilder sb2222222222 = new StringBuilder();
                                                                        str = str3;
                                                                        sb2222222222.append(str);
                                                                        sb2222222222.append(th.getMessage());
                                                                        i = 3001;
                                                                        b2222222222.a(3001, sb2222222222.toString(), th);
                                                                        i4++;
                                                                        str23 = str2;
                                                                        str15 = str;
                                                                        str16 = str11;
                                                                        str21 = str8;
                                                                        str22 = str9;
                                                                        str19 = str6;
                                                                        str20 = str7;
                                                                        jSONArray2 = jSONArray;
                                                                        str24 = str10;
                                                                        str18 = str5;
                                                                        str17 = str4;
                                                                        x0Var3 = x0Var2;
                                                                        arrayList4 = arrayList;
                                                                    }
                                                                } catch (Throwable th23) {
                                                                    th = th23;
                                                                    arrayList = arrayList2;
                                                                }
                                                            } catch (Throwable th24) {
                                                                th = th24;
                                                                str10 = str13;
                                                                i3 = i2;
                                                                str5 = str18;
                                                                str7 = str20;
                                                                str4 = str12;
                                                                arrayList = arrayList2;
                                                                x0Var2 = x0Var;
                                                                i4 = i3;
                                                                str2 = str14;
                                                                x0 b22222222222 = x0Var2.b(i4);
                                                                StringBuilder sb22222222222 = new StringBuilder();
                                                                str = str3;
                                                                sb22222222222.append(str);
                                                                sb22222222222.append(th.getMessage());
                                                                i = 3001;
                                                                b22222222222.a(3001, sb22222222222.toString(), th);
                                                                i4++;
                                                                str23 = str2;
                                                                str15 = str;
                                                                str16 = str11;
                                                                str21 = str8;
                                                                str22 = str9;
                                                                str19 = str6;
                                                                str20 = str7;
                                                                jSONArray2 = jSONArray;
                                                                str24 = str10;
                                                                str18 = str5;
                                                                str17 = str4;
                                                                x0Var3 = x0Var2;
                                                                arrayList4 = arrayList;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            x0Var2 = x0Var3;
                                            str10 = str13;
                                            i4 = i2;
                                            str5 = str18;
                                            str6 = str19;
                                            str7 = str20;
                                            str4 = str12;
                                            str = str3;
                                            arrayList = arrayList2;
                                            str2 = str14;
                                        } catch (Throwable th25) {
                                            th = th25;
                                            str10 = str13;
                                            i3 = i2;
                                            str5 = str18;
                                            str6 = str19;
                                        }
                                    } catch (Throwable th26) {
                                        th = th26;
                                        arrayList = arrayList2;
                                        str10 = str13;
                                        i3 = i2;
                                        str5 = str18;
                                        str6 = str19;
                                        str7 = str20;
                                        str4 = str12;
                                        x0Var2 = x0Var;
                                        i4 = i3;
                                        str2 = str14;
                                        x0 b222222222222 = x0Var2.b(i4);
                                        StringBuilder sb222222222222 = new StringBuilder();
                                        str = str3;
                                        sb222222222222.append(str);
                                        sb222222222222.append(th.getMessage());
                                        i = 3001;
                                        b222222222222.a(3001, sb222222222222.toString(), th);
                                        i4++;
                                        str23 = str2;
                                        str15 = str;
                                        str16 = str11;
                                        str21 = str8;
                                        str22 = str9;
                                        str19 = str6;
                                        str20 = str7;
                                        jSONArray2 = jSONArray;
                                        str24 = str10;
                                        str18 = str5;
                                        str17 = str4;
                                        x0Var3 = x0Var2;
                                        arrayList4 = arrayList;
                                    }
                                } catch (Throwable th27) {
                                    th = th27;
                                    arrayList = arrayList2;
                                    str10 = str13;
                                    i3 = i2;
                                    str5 = str18;
                                    str6 = str19;
                                    str7 = str20;
                                    str9 = str22;
                                }
                            } else {
                                arrayList = arrayList2;
                                x0Var2 = x0Var3;
                                str10 = str13;
                                i4 = i2;
                                str5 = str18;
                                str6 = str19;
                                str7 = str20;
                                str9 = str22;
                                str4 = str12;
                                try {
                                    str2 = str14;
                                    try {
                                        x0Var2.b(i4).a(str2).c(3009, "type=" + optString2);
                                        str = str3;
                                    } catch (Throwable th28) {
                                        th = th28;
                                    }
                                } catch (Throwable th29) {
                                    th = th29;
                                }
                            }
                            str2 = str14;
                            x0 b2222222222222 = x0Var2.b(i4);
                            StringBuilder sb2222222222222 = new StringBuilder();
                            str = str3;
                            sb2222222222222.append(str);
                            sb2222222222222.append(th.getMessage());
                            i = 3001;
                            b2222222222222.a(3001, sb2222222222222.toString(), th);
                        }
                        i4++;
                        str23 = str2;
                        str15 = str;
                        str16 = str11;
                        str21 = str8;
                        str22 = str9;
                        str19 = str6;
                        str20 = str7;
                        jSONArray2 = jSONArray;
                        str24 = str10;
                        str18 = str5;
                        str17 = str4;
                        x0Var3 = x0Var2;
                        arrayList4 = arrayList;
                    }
                }
                str9 = str22;
                str10 = str24;
                str = str3;
                str11 = str16;
                i4++;
                str23 = str2;
                str15 = str;
                str16 = str11;
                str21 = str8;
                str22 = str9;
                str19 = str6;
                str20 = str7;
                jSONArray2 = jSONArray;
                str24 = str10;
                str18 = str5;
                str17 = str4;
                x0Var3 = x0Var2;
                arrayList4 = arrayList;
            }
            ArrayList arrayList6 = arrayList4;
            x0 x0Var4 = x0Var3;
            if (arrayList6.size() >= 2) {
                return new c7(arrayList6);
            }
            x0Var4.c(3008, "parsed collage items less than 2");
            return null;
        } catch (Throwable th30) {
            th = th30;
            x0Var2 = x0Var3;
            str = "message=";
        }
    }
}
