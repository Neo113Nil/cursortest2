package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ｰ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1321 {

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final List f3647;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final List f3648;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final List f3649;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final List f3650;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final boolean f3651;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean f3652;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean f3653;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean f3654;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean f3655;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean f3656;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f3657;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f3658;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f3659;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f3660;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3661;

    public C1321() {
        this.f3650 = new ArrayList();
        this.f3649 = new ArrayList();
        this.f3648 = new ArrayList();
        this.f3647 = new ArrayList();
    }

    public C1321(JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.f3650 = new ArrayList();
        this.f3649 = new ArrayList();
        this.f3648 = new ArrayList();
        this.f3647 = new ArrayList();
        this.f3661 = jSONObject.optString(StringFog.decrypt("IImIwJxdm7cgnq3nmEe9\n", "Qe3eqfkq2Ns=\n"));
        this.f3660 = jSONObject.optString(StringFog.decrypt("FR1hldk1034XElab2Q==\n", "dHk3/LxCgx8=\n"));
        this.f3659 = jSONObject.optString(StringFog.decrypt("bTW5Xv9ZdsRkMg==\n", "B0btMbY3HKE=\n"));
        this.f3658 = jSONObject.optBoolean(StringFog.decrypt("T8xXgnTVeFJfyHG5eNJATw==\n", "Or8y1RG3Ljs=\n"));
        jSONObject.optBoolean(StringFog.decrypt("rPRN/ZfrdMWr6EXPseVeyLfz\n", "2YcoqvKJN60=\n"));
        this.f3657 = jSONObject.optString(StringFog.decrypt("yQJdMXrGPEjE\n", "vHAxYQijWiE=\n"));
        this.f3656 = jSONObject.optBoolean(StringFog.decrypt("rbR3s3BQumKFow==\n", "xMc50gQ5zAc=\n"));
        this.f3655 = jSONObject.optBoolean(StringFog.decrypt("6kKMKWGCcZPobJImQadxk/he\n", "jC3+SgTRFP0=\n"));
        this.f3654 = jSONObject.optBoolean(StringFog.decrypt("mb05IR+hHMmO\n", "69haVG3Sdb8=\n"));
        this.f3653 = jSONObject.optBoolean(StringFog.decrypt("OqjH/i9vgwgsqcvEOg==\n", "T9uitE4Z4ns=\n"), true);
        this.f3652 = jSONObject.optBoolean(StringFog.decrypt("CgJBDuiWMkQ1Ag==\n", "f3EkS5DiQCU=\n"));
        this.f3651 = jSONObject.optBoolean(StringFog.decrypt("mrfAHEPWX1WDoNgMacthYoOr+xdUwE1n\n", "6sWvfyalLAM=\n"), true);
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("JV95RCOeDA==\n", "UzYcM2r6f8o=\n"));
        ArrayList arrayList4 = null;
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object opt = optJSONArray.opt(i);
                if (opt != null) {
                    arrayList.add(opt);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f3650 = arrayList;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(StringFog.decrypt("fXGp1Qo+0rJ5YYnTNTDItG53\n", "HBLdvHxXpts=\n"));
        if (optJSONArray2 != null) {
            arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                Object opt2 = optJSONArray2.opt(i2);
                if (opt2 != null) {
                    arrayList2.add(opt2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            this.f3649 = arrayList2;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray(StringFog.decrypt("AvvPdjx3HHIT/MVzKg==\n", "dJKqAU8jczs=\n"));
        if (optJSONArray3 != null) {
            arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                Object opt3 = optJSONArray3.opt(i3);
                if (opt3 != null) {
                    arrayList3.add(opt3);
                }
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            this.f3648 = arrayList3;
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray(StringFog.decrypt("ZR+sC9Y4EjJpOKgd1Q==\n", "BnPNeKVdYWY=\n"));
        if (optJSONArray4 != null) {
            arrayList4 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                Object opt4 = optJSONArray4.opt(i4);
                if (opt4 != null) {
                    arrayList4.add(opt4);
                }
            }
        }
        if (arrayList4 != null) {
            this.f3647 = arrayList4;
        }
    }
}
