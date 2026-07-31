package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.reflect.KProperty;

/* loaded from: classes15.dex */
public final class sn3 implements dl1 {
    public final n22 a;

    public sn3(n22 n22Var) {
        this.a = n22Var;
    }

    @Override // yads.dl1
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // yads.dl1
    public final CheckBox getMuteControl() {
        qm2 qm2Var = this.a.c;
        KProperty kProperty = n22.g[2];
        return (CheckBox) qm2Var.a.get();
    }

    @Override // yads.dl1
    public final ProgressBar getVideoProgress() {
        qm2 qm2Var = this.a.d;
        KProperty kProperty = n22.g[3];
        return (ProgressBar) qm2Var.a.get();
    }
}
