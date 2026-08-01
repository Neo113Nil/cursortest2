package U0;

import S0.o;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.luckycounter.drinkwater.R;
import com.luckycounter.drinkwater.data.UserPreferencesKt;
import com.luckycounter.drinkwater.data.WaterEntry;
import g0.AbstractC0131A;
import g0.Z;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends AbstractC0131A {
    public final o d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1242e = new ArrayList();

    public g(o oVar) {
        this.d = oVar;
    }

    @Override // g0.AbstractC0131A
    public final int a() {
        return this.f1242e.size();
    }

    @Override // g0.AbstractC0131A
    public final void c(Z z2, int i) {
        f fVar = (f) z2;
        Object obj = this.f1242e.get(i);
        i1.f.d(obj, "get(...)");
        final WaterEntry waterEntry = (WaterEntry) obj;
        fVar.f1239v.setText(fVar.f1238u.getContext().getString(R.string.log_entry, Integer.valueOf(waterEntry.getAmountMl()), UserPreferencesKt.formatTime$default(waterEntry.getTimestamp(), null, 2, null)));
        final g gVar = fVar.f1241x;
        fVar.f1240w.setOnClickListener(new View.OnClickListener() { // from class: U0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g.this.d.g(waterEntry);
            }
        });
    }

    @Override // g0.AbstractC0131A
    public final Z d(ViewGroup viewGroup) {
        i1.f.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_water_log, viewGroup, false);
        i1.f.c(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        return new f(this, (ViewGroup) inflate);
    }
}
