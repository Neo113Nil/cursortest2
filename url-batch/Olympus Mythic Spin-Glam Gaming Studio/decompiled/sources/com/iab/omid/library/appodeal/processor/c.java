package com.iab.omid.library.appodeal.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.appodeal.processor.a;
import com.iab.omid.library.appodeal.utils.e;
import com.iab.omid.library.appodeal.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class c implements a {
    private final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    @NonNull
    ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.appodeal.internal.c c = com.iab.omid.library.appodeal.internal.c.c();
        if (c != null) {
            Collection<com.iab.omid.library.appodeal.adsession.a> a = c.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a.size() * 2) + 3);
            Iterator<com.iab.omid.library.appodeal.adsession.a> it = a.iterator();
            while (it.hasNext()) {
                View e = it.next().e();
                if (e != null && h.g(e) && (rootView = e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float d = h.d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.d(arrayList.get(size - 1)) > d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.appodeal.processor.a
    public JSONObject a(View view) {
        JSONObject a = com.iab.omid.library.appodeal.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.appodeal.utils.c.a(a, e.a());
        return a;
    }

    @Override // com.iab.omid.library.appodeal.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0268a interfaceC0268a, boolean z, boolean z2) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0268a.a(it.next(), this.a, jSONObject, z2);
        }
    }
}
