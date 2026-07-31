package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Vh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2686Vh implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ T8 A00;
    public final /* synthetic */ C2689Vk A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC2686Vh(C2689Vk c2689Vk, String str, T8 t8) {
        this.A01 = c2689Vk;
        this.A02 = str;
        this.A00 = t8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i;
        int i2;
        int i3;
        if (WU.A02(this)) {
            return;
        }
        try {
            C2631Te nvl = new C2631Te(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2688Vj c2688Vj = (C2688Vj) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 23));
                i = c2688Vj.A00;
                StringBuilder append2 = append.append(i).append(';');
                i2 = c2688Vj.A02;
                StringBuilder append3 = append2.append(i2).append(';');
                i3 = c2688Vj.A01;
                jSONArray.put(append3.append(i3).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A08().ABD(A00(10, 9, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), AbstractC2630Td.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
