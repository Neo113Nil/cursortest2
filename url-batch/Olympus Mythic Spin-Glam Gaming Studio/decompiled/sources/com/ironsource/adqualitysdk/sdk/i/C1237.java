package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﹲ, reason: contains not printable characters */
/* loaded from: classes15.dex */
public final class C1237 extends AbstractC1241 {
    public C1237(AbstractC0544 abstractC0544, AbstractC0544 abstractC05442) {
        super(abstractC0544, abstractC05442);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0544
    /* renamed from: ﾒ */
    public final C0954 mo4042(C0785 c0785, C0880 c0880) {
        Object obj;
        C0954 m4041 = this.f3246.m4041(c0785, c0880);
        try {
            obj = this.f3247.m4041(c0785, c0880).f2276;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("HfWqP2LstVI5660xZKW+Q3j0rTJjr6JNKPP4N3W48EEg96o1Y7+5Szan/w==\n", "WIfYUBDM0CQ=\n"));
            sb.append(this);
            new C1262(c0880, c0785, AbstractC1293.m4543("5A==\n", "wx0WQTu3QHc=\n", sb), e).m4002(c0880.m4231());
        }
        if (obj instanceof JSONObject) {
            return new C0954(((JSONObject) obj).opt((String) m4041.f2276));
        }
        if (obj instanceof JSONArray) {
            return new C0954(((JSONArray) obj).opt(m4041.m4249().intValue()));
        }
        if (obj instanceof Map) {
            return new C0954(((Map) obj).get(m4041.f2276));
        }
        if (obj instanceof List) {
            return new C0954(((List) obj).get(m4041.m4249().intValue()));
        }
        if (obj.getClass().isArray()) {
            return new C0954(((Object[]) obj)[m4041.m4249().intValue()]);
        }
        new C1262(c0880, c0785, StringFog.decrypt("qShpT+VNfgmNNm5B4wR1GMwpbkLkDmkWnC47R/IZOxqUKmlF5B5yEIJ6PA==\n", "7FobIJdtG38=\n") + this + StringFog.decrypt("gYyDCJ833u7BltcTzTvE5Ybt/lyCIJfhyJbWEp47x/DJxNcZiW7Y4szTwAjN\n", "prajfO1Ot4A=\n") + obj, null).m4002(c0880.m4231());
        return new C0954(null);
    }
}
