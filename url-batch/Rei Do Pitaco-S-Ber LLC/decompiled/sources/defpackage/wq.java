package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.ionia.reidopitaco.libya.MainActivity2;
import java.util.List;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class wq implements View.OnClickListener {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ gz g;
    public final /* synthetic */ String h;
    public final /* synthetic */ MainActivity2 i;
    public final /* synthetic */ ef j;
    public final /* synthetic */ int k;

    public /* synthetic */ wq(gz gzVar, String str, ef efVar, MainActivity2 mainActivity2, int i) {
        this.g = gzVar;
        this.h = str;
        this.j = efVar;
        this.i = mainActivity2;
        this.k = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        int i2 = this.k;
        ef efVar = this.j;
        MainActivity2 mainActivity2 = this.i;
        String str = this.h;
        gz gzVar = this.g;
        switch (i) {
            case 0:
                List list = MainActivity2.O;
                gzVar.g = str;
                efVar.a.setText(str);
                mainActivity2.u((LinearLayout) efVar.f, i2);
                break;
            default:
                List list2 = MainActivity2.O;
                gzVar.g = str;
                mainActivity2.t((LinearLayout) efVar.e, i2);
                break;
        }
    }

    public /* synthetic */ wq(gz gzVar, String str, MainActivity2 mainActivity2, ef efVar, int i) {
        this.g = gzVar;
        this.h = str;
        this.i = mainActivity2;
        this.j = efVar;
        this.k = i;
    }
}
