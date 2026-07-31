package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.וֹ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1190 extends AbstractC1241 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final AbstractC0544 f3086;

    public C1190(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442, AbstractC0544 abstractC05443) {
        super(abstractC0544, abstractC05442);
        this.f3086 = abstractC05443;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1241
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1190.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        AbstractC0544 abstractC0544 = this.f3086;
        AbstractC0544 abstractC05442 = ((C1190) obj).f3086;
        return abstractC0544 != null ? abstractC0544.equals(abstractC05442) : abstractC05442 == null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1241
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        AbstractC0544 abstractC0544 = this.f3086;
        return hashCode + (abstractC0544 != null ? abstractC0544.hashCode() : 0);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC1241
    public final String toString() {
        return super.toString() + StringFog.decrypt("OyiM\n", "GxWsIsEvNQE=\n") + this.f3086.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        C0954 m4041 = this.f3246.m4041(c0785, c0880);
        C0954 m40412 = this.f3086.m4041(c0785, c0880);
        try {
            Object obj = this.f3247.m4041(c0785, c0880).f2276;
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put((String) m4041.f2276, m40412.f2276);
            } else if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(m4041.m4249().intValue(), m40412.f2276);
            } else if (obj instanceof Map) {
                ((Map) obj).put(m4041.f2276, m40412.f2276);
            } else if (obj instanceof List) {
                ((List) obj).set(m4041.m4249().intValue(), m40412.f2276);
            } else if (obj.getClass().isArray()) {
                ((Object[]) obj)[m4041.m4249().intValue()] = m40412.f2276;
            } else {
                new C1262(c0880, c0785, StringFog.decrypt("NvbTzNw099wS6NTC2n38zVP31MHdd+DDA/CB09tgss8L9NPG3Wf7xR2khg==\n", "c4Sho64Ukqo=\n") + this + StringFog.decrypt("KAEfD0IcvV1oG0sUEBCnVi9gYltfC/RSYRtKFUMQpENgSUseVEW7UWVeXA8Q\n", "Dzs/ezBl1DM=\n") + obj, null).m4002(c0880.m4231());
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("sNnya5WnmZmUx/Vlk+6SiNXY9WaU5I6Ghd+gdJLz3IqN2/JhlPSVgJuLpw==\n", "9auABOeH/O8=\n"));
            sb.append(this);
            new C1262(c0880, c0785, AbstractC1293.m4543("aA==\n", "Ty9y+DwERcQ=\n", sb), e).m4002(c0880.m4231());
        }
        return m40412;
    }
}
