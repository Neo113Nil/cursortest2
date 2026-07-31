package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.צּ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1188 extends AbstractRunnableC0913 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ JSONObject f3083;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f3084;

    public C1188(ArrayList arrayList, JSONObject jSONObject) {
        this.f3084 = arrayList;
        this.f3083 = jSONObject;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        Iterator it = this.f3084.iterator();
        while (it.hasNext()) {
            C0375 c0375 = (C0375) it.next();
            JSONObject jSONObject = this.f3083;
            Context context = c0375.f192.f3683.f3194;
            String str = AbstractC1183.f3032;
            int i = AbstractC1182.f3014;
            Intent putExtra = new Intent(str).putExtra(AbstractC1183.f3024, jSONObject.toString());
            C1223 m4471 = C1223.m4471(context);
            if (m4471.f3222) {
                synchronized (m4471.f3220) {
                    try {
                        putExtra.getAction();
                        String resolveTypeIfNeeded = putExtra.resolveTypeIfNeeded(m4471.f3221.getContentResolver());
                        putExtra.getData();
                        String scheme = putExtra.getScheme();
                        putExtra.getCategories();
                        boolean z = (putExtra.getFlags() & 8) != 0;
                        if (z) {
                            Log.v(C1223.f3217, StringFog.decrypt("t+AksUVfIteCpSOnWUxr\n", "5YVX3ikpS7k=\n") + resolveTypeIfNeeded + StringFog.decrypt("AwU9mh6nLks=\n", "I3Ze8nvKS2s=\n") + scheme + StringFog.decrypt("RVXdloMfQuYLTps=\n", "ZTq7tupxNoM=\n") + putExtra);
                        }
                        ArrayList arrayList = (ArrayList) m4471.f3219.get(putExtra.getAction());
                        if (arrayList != null) {
                            if (z) {
                                Log.v(C1223.f3217, StringFog.decrypt("l7jTyzFi/QG/qNOYfg==\n", "1tunol4M3W0=\n") + arrayList);
                            }
                            if (arrayList.size() > 0) {
                                if (arrayList.get(0) != null) {
                                    throw new ClassCastException();
                                }
                                if (!z) {
                                    throw null;
                                }
                                StringFog.decrypt("sDCOPDNxjQrdMJ0+MnaQGd03kzMvfZFN\n", "/VH6X1sY420=\n");
                                throw null;
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
