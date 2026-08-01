package s0;

import android.view.View;
import android.widget.TextView;
import com.football.transfertrivia.R;
import g0.Z;

/* loaded from: classes.dex */
public final class n extends Z {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f3671u;

    /* renamed from: v, reason: collision with root package name */
    public final TextView f3672v;

    /* renamed from: w, reason: collision with root package name */
    public final TextView f3673w;

    public n(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.tvRank);
        g1.f.d(findViewById, "findViewById(...)");
        this.f3671u = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tvScore);
        g1.f.d(findViewById2, "findViewById(...)");
        this.f3672v = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tvDate);
        g1.f.d(findViewById3, "findViewById(...)");
        this.f3673w = (TextView) findViewById3;
    }
}
