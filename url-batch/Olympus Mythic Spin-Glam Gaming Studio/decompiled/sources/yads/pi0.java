package yads;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.yandex.div.R;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.R$style;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pi0 {
    public final m12 a;
    public final d2 b;
    public final mt1 c;
    public Dialog d;

    public pi0(m12 m12Var, d2 d2Var, mt1 mt1Var) {
        this.a = m12Var;
        this.b = d2Var;
        this.c = mt1Var;
    }

    public final void a(Activity activity) {
        ri0 ri0Var;
        Object obj;
        try {
            List f = this.a.f();
            if (f != null) {
                Iterator it = f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    String str = ((ri0) obj).a;
                    ng0[] ng0VarArr = ng0.b;
                    if (Intrinsics.areEqual(str, "close_dialog")) {
                        break;
                    }
                }
                ri0Var = (ri0) obj;
            } else {
                ri0Var = null;
            }
            if (ri0Var == null) {
                this.b.e();
                return;
            }
            AttributeSet attributeSet = null;
            int i = 0;
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(activity, R.style.Div), (DivConfiguration) LazyKt.lazy(new qi0(activity, null)).getValue(), 0, null, 4, null), attributeSet, i, 6, null);
            div2View.setTag("");
            Dialog dialog = new Dialog(activity, R$style.MonetizationAdsInternal_FullscreenDialog);
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: yads.pi0$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    pi0.a(pi0.this, dialogInterface);
                }
            });
            div2View.setActionHandler(new iw(new hw(dialog, this.b)));
            div2View.setData(ri0Var.e, ri0Var.f);
            dialog.setContentView(div2View);
            wg0.a(dialog);
            this.d = dialog;
            dialog.show();
        } catch (Throwable th) {
            this.c.reportError("Failed to show DivKit close dialog", th);
        }
    }

    public static final void a(pi0 pi0Var, DialogInterface dialogInterface) {
        pi0Var.d = null;
    }
}
