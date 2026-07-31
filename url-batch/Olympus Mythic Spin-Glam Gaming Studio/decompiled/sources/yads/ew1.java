package yads;

import com.safedk.android.internal.partials.YandexNetworkBridge;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ew1 {
    public final vb2 a;

    public ew1(vb2 vb2Var) {
        this.a = vb2Var;
    }

    public final void a(qw1 qw1Var, String str) {
        b("notifyErrorEvent(" + JSONObject.quote(qw1Var.a()) + ", " + JSONObject.quote(str) + ")");
    }

    public final void b(String str) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("window.mraidbridge.%s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        a(format);
    }

    public final void a(qw1 qw1Var) {
        b("nativeCallComplete(" + JSONObject.quote(qw1Var.a()) + ")");
    }

    public final void a(xc1... xc1VarArr) {
        if (xc1VarArr.length == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("fireChangeEvent({");
        int length = xc1VarArr.length;
        String str = "";
        int i = 0;
        while (i < length) {
            xc1 xc1Var = xc1VarArr[i];
            sb.append(str);
            sb.append(xc1Var.a());
            i++;
            str = ", ";
        }
        sb.append("})");
        b(sb.toString());
    }

    public final void a(String str) {
        YandexNetworkBridge.webviewLoadUrl(this.a, "javascript: " + str);
        boolean z = ob1.a;
    }
}
