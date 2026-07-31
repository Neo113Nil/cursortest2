package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᒬ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public final class C0823 implements InterfaceC1212 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0812 f2025;

    public C0823(C0812 c0812) {
        this.f2025 = c0812;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC1212
    /* renamed from: ﾒ */
    public final void mo3995() {
        HashMap hashMap;
        this.f2025.f1998.f1868 = AbstractC0590.m4087().mo4096();
        AbstractC0580.m4078(StringFog.decrypt("3dTF+VM9lcLs9sr5VzmE3w==\n", "nrurlzZe4a0=\n"), StringFog.decrypt("zkjuzcKMscntAfTCyZSxxuZI58nEwLvI5E/4z9SPqtQ=\n", "iiGdrKDg2Kc=\n"));
        C0791 c0791 = this.f2025.f1998;
        c0791.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = (c0791.f1874 != null ? new ArrayList(c0791.f1874) : new ArrayList()).iterator();
        while (it.hasNext()) {
            C0786 c0786 = (C0786) it.next();
            if (c0791.m4207(c0786.f1857.f2831)) {
                arrayList.add(c0786);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0786 c07862 = (C0786) it2.next();
            String str = C0791.f1862;
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("cinqplTY72xRYA==\n", "NkCZxza0hgI=\n"));
            sb.append(c07862.f1857.f2830);
            AbstractC0580.m4081(str, str, AbstractC1293.m4543("lVpC27I6VNPaSw==\n", "tTkttdxfN6c=\n", sb), true);
            String str2 = c07862.f1857.f2831;
            synchronized (c0791) {
                hashMap = c0791.f1872;
            }
            c0791.m4206(str2, (JSONObject) hashMap.get(str2));
            AbstractC1026.m4316(new C0935(c07862));
            ((ArrayList) c0791.m4199()).remove(c07862);
        }
    }
}
