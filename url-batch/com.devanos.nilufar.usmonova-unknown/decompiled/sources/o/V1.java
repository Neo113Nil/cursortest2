package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class V1 extends P1 {
    public final /* synthetic */ W1 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ N1 c;

    public V1(W1 w1, String str, N1 n1) {
        this.a = w1;
        this.b = str;
        this.c = n1;
    }

    public final void a(Object obj) {
        W1 w1 = this.a;
        ArrayList arrayList = w1.d;
        LinkedHashMap linkedHashMap = w1.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        N1 n1 = this.c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + n1 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            w1.b(intValue, n1, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    public final void b() {
        this.a.e(this.b);
    }
}
