package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes5.dex */
public final class s72 {
    public final ii3 a;
    public final v52 b;
    public final double c;

    public s72(zo0 zo0Var, ii3 ii3Var) {
        double d;
        v52 v52Var = new v52(zo0Var);
        this.a = ii3Var;
        this.b = v52Var;
        Double d2 = ii3Var.d;
        if (d2 != null) {
            d2 = d2.doubleValue() == 0.0d ? null : d2;
            if (d2 != null) {
                d = d2.doubleValue();
                this.c = d;
            }
        }
        d = 1.0d;
        this.c = d;
    }

    public final void a(dl1 dl1Var) {
        if (dl1Var != null) {
            final CheckBox muteControl = dl1Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new View.OnClickListener() { // from class: yads.s72$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        s72.a(s72.this, muteControl, view);
                    }
                });
                muteControl.setVisibility(this.a.b ? 0 : 8);
            }
            ProgressBar videoProgress = dl1Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.a.c ? 8 : 0);
            }
            TextView countDownProgress = dl1Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    public static final void a(s72 s72Var, CheckBox checkBox, View view) {
        s72Var.b.a.a((float) (!checkBox.isChecked() ? s72Var.c : 0.0d));
    }
}
