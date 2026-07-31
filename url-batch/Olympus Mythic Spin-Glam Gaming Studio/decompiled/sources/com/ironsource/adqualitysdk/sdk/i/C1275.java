package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﻋ, reason: contains not printable characters */
/* loaded from: classes14.dex */
public final class C1275 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1086 f3438;

    public C1275(C1086 c1086) {
        this.f3438 = c1086;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4512(ArrayList arrayList) {
        JSONObject jSONObject;
        C1079 c1079;
        try {
            if (arrayList.isEmpty()) {
                C1086.m4373(this.f3438);
                return;
            }
            PriorityQueue priorityQueue = new PriorityQueue();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                priorityQueue.add(new C1071((C0515) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (C1071 c1071 = (C1071) priorityQueue.poll(); c1071 != null; c1071 = (C1071) priorityQueue.poll()) {
                C1086 c1086 = this.f3438;
                c1086.getClass();
                AbstractC0590 m4087 = AbstractC0590.m4087();
                synchronized (c1071) {
                    jSONObject = c1071.f2723.f479;
                }
                String optString = jSONObject.optString(StringFog.decrypt("FZqLJA==\n", "ZfbsSgmkXok=\n"));
                String str = c1086.f2756;
                C0600 c0600 = (C0600) m4087;
                if (optString != null) {
                    c1079 = (C1079) c0600.mo4096().get(optString);
                } else {
                    c0600.getClass();
                    c1079 = null;
                }
                if (c1079 != null && c1079.m4366(str)) {
                    C0404 c0404 = this.f3438.f2768;
                    C0515 c0515 = c1071.f2723;
                    c0404.getClass();
                    C0916.m4240().post(new C0407(c0404, c0515));
                }
                if (TextUtils.isEmpty(c1071.m4359())) {
                    c1071.m4364(this.f3438.f2767.f960.m4177());
                }
                arrayList2.add(c1071);
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            C1086.m4375(this.f3438, arrayList2, new C1276(this));
        } catch (Exception unused) {
            C1086.m4373(this.f3438);
        }
    }
}
