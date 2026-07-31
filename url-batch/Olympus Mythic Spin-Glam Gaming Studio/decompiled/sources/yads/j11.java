package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public final class j11 extends sn {
    public final SSLSocketFactory a;

    public j11(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    public static ArrayList a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new sz0((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }
}
