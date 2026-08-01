package U0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.luckycounter.drinkwater.R;
import g0.Z;

/* loaded from: classes.dex */
public final class f extends Z {

    /* renamed from: u, reason: collision with root package name */
    public final ViewGroup f1238u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f1239v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f1240w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f1241x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ViewGroup viewGroup) {
        super(viewGroup);
        this.f1241x = gVar;
        this.f1238u = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.textEntry);
        i1.f.d(findViewById, "findViewById(...)");
        this.f1239v = (TextView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.btnDelete);
        i1.f.d(findViewById2, "findViewById(...)");
        this.f1240w = (TextView) findViewById2;
    }
}
