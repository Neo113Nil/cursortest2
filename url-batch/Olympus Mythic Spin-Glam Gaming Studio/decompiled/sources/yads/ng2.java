package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes11.dex */
public final class ng2 {
    public static Intent a(Context context, mg2 mg2Var) {
        String str = mg2Var.b;
        String str2 = mg2Var.a;
        String str3 = mg2Var.i;
        Map map = mg2Var.c;
        Integer num = mg2Var.d;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str3 != null) {
            intent.setClassName(str2, str3);
        } else {
            intent.setData(Uri.parse(str));
            intent.setPackage(str2);
        }
        if (num == null || !(context instanceof Activity)) {
            intent.addFlags((num != null ? num.intValue() : 0) | 1342177280);
        } else {
            intent.addFlags(num.intValue());
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(str4, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(str4, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(str4, (String) value);
                } else if (value instanceof aq0) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m8023constructorimpl(intent.putExtra(str4, ((aq0) value).getValue()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m8023constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }
        }
        return intent;
    }
}
