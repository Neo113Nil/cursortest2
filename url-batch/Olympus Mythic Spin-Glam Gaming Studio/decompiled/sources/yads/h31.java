package yads;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class h31 {
    public final eb3 a;
    public final z13 b;

    public h31() {
        eb3 eb3Var = new eb3();
        z13 z13Var = new z13();
        this.a = eb3Var;
        this.b = z13Var;
    }

    public final q31 a(JSONObject jSONObject) {
        int i;
        int i2;
        String str;
        y13 y13Var;
        q13 q13Var;
        yk ykVar;
        ArrayList arrayList;
        String str2 = "w";
        int i3 = jSONObject.getInt("w");
        int i4 = jSONObject.getInt("h");
        this.a.getClass();
        String a = eb3.a("url", jSONObject);
        if (jSONObject.has("smartCenterSettings")) {
            z13 z13Var = this.b;
            JSONObject jSONObject2 = jSONObject.getJSONObject("smartCenterSettings");
            z13Var.getClass();
            Object opt = jSONObject2.opt("ColorWizButton");
            String str3 = opt instanceof String ? (String) opt : null;
            Object opt2 = jSONObject2.opt("ColorWizButtonText");
            String str4 = opt2 instanceof String ? (String) opt2 : null;
            Object opt3 = jSONObject2.opt("ColorWizBack");
            String str5 = opt3 instanceof String ? (String) opt3 : null;
            Object opt4 = jSONObject2.opt("ColorWizBackRight");
            String str6 = opt4 instanceof String ? (String) opt4 : null;
            JSONObject optJSONObject = jSONObject2.optJSONObject("backgroundColors");
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("smart-center");
            JSONArray optJSONArray = jSONObject2.optJSONArray("smart-centers");
            if (optJSONObject2 != null) {
                str = a;
                i2 = i4;
                i = i3;
                q13Var = new q13(optJSONObject2.getInt(VastAttributes.HORIZONTAL_POSITION), optJSONObject2.getInt(VastAttributes.VERTICAL_POSITION), optJSONObject2.getInt("w"), optJSONObject2.getInt("h"));
            } else {
                i = i3;
                i2 = i4;
                str = a;
                q13Var = null;
            }
            if (optJSONObject != null) {
                Object opt5 = optJSONObject.opt(ViewHierarchyConstants.DIMENSION_TOP_KEY);
                String str7 = opt5 instanceof String ? (String) opt5 : null;
                Object opt6 = optJSONObject.opt("right");
                String str8 = opt6 instanceof String ? (String) opt6 : null;
                Object opt7 = optJSONObject.opt("left");
                String str9 = opt7 instanceof String ? (String) opt7 : null;
                Object opt8 = optJSONObject.opt("bottom");
                ykVar = new yk(str7, str8, str9, opt8 instanceof String ? (String) opt8 : null);
            } else {
                ykVar = null;
            }
            if (optJSONArray != null) {
                IntRange until = RangesKt.until(0, optJSONArray.length());
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
                Iterator it = until.iterator();
                while (it.hasNext()) {
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(((IntIterator) it).nextInt());
                    arrayList2.add(new q13(optJSONObject3.getInt(VastAttributes.HORIZONTAL_POSITION), optJSONObject3.getInt(VastAttributes.VERTICAL_POSITION), optJSONObject3.getInt(str2), optJSONObject3.getInt("h")));
                    it = it;
                    str2 = str2;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            y13Var = new y13(str3, str4, str5, str6, ykVar, q13Var, arrayList);
        } else {
            i = i3;
            i2 = i4;
            str = a;
            y13Var = null;
        }
        String optString = jSONObject.optString("sizeType");
        String str10 = optString.length() > 0 ? optString : null;
        boolean optBoolean = jSONObject.optBoolean("preload", true);
        String optString2 = jSONObject.optString("preview");
        return new q31(i, i2, str, str10, y13Var, optBoolean, optString2.length() > 0 ? optString2 : null);
    }
}
