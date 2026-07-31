package yads;

import android.widget.Toast;
import com.yandex.mobile.ads.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class aa0 extends Lambda implements Function0 {
    public final /* synthetic */ ba0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(ba0 ba0Var) {
        super(0);
        this.b = ba0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        synchronized (su1.a) {
            su1.b = true;
        }
        ba0 ba0Var = this.b;
        Toast.makeText(ba0Var.a, ba0Var.a.getString(R$string.debug_panel_logging_is_enabled), 0).show();
        return Unit.INSTANCE;
    }
}
