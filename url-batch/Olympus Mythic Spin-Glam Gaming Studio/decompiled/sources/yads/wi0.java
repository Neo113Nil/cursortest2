package yads;

import com.yandex.div.DivDataTag;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div2.DivData;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class wi0 {
    public final mt1 a;
    public final sh0 b;
    public final uh0 c;
    public final ti0 d;
    public final am e;

    public wi0(mt1 mt1Var) {
        sh0 sh0Var = new sh0(mt1Var);
        uh0 uh0Var = new uh0();
        ti0 ti0Var = new ti0();
        am amVar = new am();
        this.a = mt1Var;
        this.b = sh0Var;
        this.c = uh0Var;
        this.d = ti0Var;
        this.e = amVar;
    }

    public final ri0 a(fg0 fg0Var, boolean z) {
        DivData divData;
        mg0[] mg0VarArr = mg0.b;
        if (Intrinsics.areEqual("divkit", fg0Var.a)) {
            try {
                String str = fg0Var.b;
                String str2 = fg0Var.c;
                if (z) {
                    this.e.getClass();
                    str2 = am.a(str2);
                }
                JSONObject jSONObject = new JSONObject(str2);
                JSONObject jSONObject2 = jSONObject.getJSONObject("card");
                JSONObject jSONObject3 = jSONObject.has("templates") ? jSONObject.getJSONObject("templates") : null;
                ArrayList arrayList = fg0Var.d;
                sh0 sh0Var = this.b;
                sh0Var.getClass();
                try {
                    DivParsingEnvironment divParsingEnvironment = new DivParsingEnvironment(ParsingErrorLogger.LOG, null, 2, null);
                    if (jSONObject3 != null) {
                        divParsingEnvironment.parseTemplates(jSONObject3);
                    }
                    divData = DivData.Companion.fromJson(divParsingEnvironment, jSONObject2);
                } catch (Throwable th) {
                    sh0Var.a.reportError("Failed to create DivData", th);
                    divData = null;
                }
                this.c.getClass();
                DivDataTag divDataTag = new DivDataTag(UUID.randomUUID().toString());
                Set a = this.d.a(jSONObject2);
                if (divData != null) {
                    return new ri0(str, jSONObject2, jSONObject3, arrayList, divData, divDataTag, a, new gg0(fg0Var.e));
                }
            } catch (Throwable th2) {
                this.a.reportError("Failed to parse DivKit design", th2);
            }
        }
        return null;
    }
}
