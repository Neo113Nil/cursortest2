package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class a30 implements dl1 {
    public final CheckBox a;
    public final ProgressBar b;
    public final TextView c;

    public a30(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.a = checkBox;
        this.b = progressBar;
        this.c = textView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a30)) {
            return false;
        }
        a30 a30Var = (a30) obj;
        return Intrinsics.areEqual(this.a, a30Var.a) && Intrinsics.areEqual(this.b, a30Var.b) && Intrinsics.areEqual(this.c, a30Var.c);
    }

    @Override // yads.dl1
    public final TextView getCountDownProgress() {
        return this.c;
    }

    @Override // yads.dl1
    public final CheckBox getMuteControl() {
        return this.a;
    }

    @Override // yads.dl1
    public final ProgressBar getVideoProgress() {
        return this.b;
    }

    public final int hashCode() {
        CheckBox checkBox = this.a;
        int hashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.b;
        int hashCode2 = (hashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.c;
        return hashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.a + ", videoProgress=" + this.b + ", countDownProgress=" + this.c + ")";
    }
}
