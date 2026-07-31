package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ḻ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1042 extends AbstractRunnableC0913 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0970 f2636;

    public C1042(C0970 c0970) {
        this.f2636 = c0970;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo3946() {
        C0786 c0786 = this.f2636.f2323;
        C1112 c1112 = c0786.f1857;
        if (c1112.f2825 == null) {
            c1112.f2825 = new C0484(c1112.f2833.optJSONObject(C1112.f2821));
        }
        C0484 c0484 = c1112.f2825;
        if (c0484 != null) {
            synchronized (c0786) {
                c0786.f1851 = c0484;
            }
            if (c0786.f1854.mo4039()) {
                C4551b.f133 = c0484;
            }
        }
        c0786.f1857.m4408().m4182(StringFog.decrypt("Xi4zR5x/+wBZKyBL\n", "ME9HLuoauXI=\n"), c0786.f1854);
        Iterator it = c0786.f1857.m4407().keySet().iterator();
        while (it.hasNext()) {
            C0754 c0754 = (C0754) c0786.f1857.m4407().get((String) it.next());
            if (!c0754.f1686) {
                c0786.f1852.add(new C0880(c0786, c0786.f1855, c0786.f1854, c0786.m4187(c0754), c0786.f1857.m4408()));
            }
        }
        c0786.m4188();
        Iterator it2 = c0786.m4186().iterator();
        while (it2.hasNext()) {
            ((C0880) it2.next()).m4230();
        }
        C0696 c0696 = this.f2636.f2320.f1867;
        if (c0696 != null) {
            AbstractC1026.m4312(new C0706(c0696, this.f2636.f2322, EnumC0718.f1596));
        }
        AbstractC0580.m4078(StringFog.decrypt("gcG6JN/E0Amw47Uk28DBFA==\n", "wq7USrqnpGY=\n"), this.f2636.f2323.f1857.f2830 + StringFog.decrypt("9umlpcE1JCW5+Oq42jMkNKX5rL7DPD5xv+Sjv8YxKzis764=\n", "1orKy69QR1E=\n"));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0913
    /* renamed from: ﾒ */
    public final void mo4007(Throwable th) {
        try {
            ((JSONObject) C0791.m4192(this.f2636.f2320).get(this.f2636.f2323.f1857.f2831)).put(StringFog.decrypt("LoYq4w==\n", "R+hDl5721Yo=\n"), false);
        } catch (JSONException e) {
            String decrypt = StringFog.decrypt("uvlgcpktiN6L229ynSmZww==\n", "+ZYOHPxO/LE=\n");
            AbstractC0580.m4080(decrypt, decrypt, StringFog.decrypt("NEJzMFWr+ZEFRGgxQKvjmhhEIStIq+mbH15kPFPk+NQHVXMsTuTk1BtDbjE=\n", "cTABXyeLivQ=\n"), e, null, false);
        }
        C0696 c0696 = this.f2636.f2320.f1867;
        if (c0696 != null) {
            AbstractC1026.m4312(new C0712(c0696, this.f2636.f2322, EnumC0724.f1642));
        }
        String decrypt2 = StringFog.decrypt("hzXUvnlJA562F9u+fU0Sgw==\n", "xFq60Bwqd/E=\n");
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("7BwBgmebuJLAGhqMedKrlccJUw==\n", "qW5z7RW70fw=\n"));
        sb.append(this.f2636.f2323.f1857.f2830);
        AbstractC0577.m4069(decrypt2, AbstractC1293.m4543("p6Mls+b2JOvosg==\n", "h8BK3YiTR58=\n", sb), th, true, true, true);
        AbstractC0580.m4074(StringFog.decrypt("oXBuhY+ZIluZR3u7\n", "4BQ/8O71Sy8=\n"), StringFog.decrypt("K0k+sSg+e8pKSH23Lz5m3Q4HabwzIHGYA0l3oDMteNEQTnCzegVH+Q52a7U2JWDBSnRan3o=\n", "aice1FpMFLg=\n") + this.f2636.f2323.f1857.f2830 + StringFog.decrypt("DLbbtKUHKNBDp5o=\n", "LNW02stiS6Q=\n"));
    }
}
