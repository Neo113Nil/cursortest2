package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ionia.reidopitaco.libya.R;
import java.util.Calendar;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class rt extends BaseAdapter {
    public static final int d = x60.c(null).getMaximum(4);
    public static final int e = (x60.c(null).getMaximum(7) + x60.c(null).getMaximum(5)) - 1;
    public final qt a;
    public y5 b;
    public final v8 c;

    public rt(qt qtVar, v8 v8Var) {
        this.a = qtVar;
        this.c = v8Var;
        throw null;
    }

    public final int a(int i) {
        do {
            i++;
            if (i > f()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int b(int i) {
        do {
            i--;
            if (i < c()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int c() {
        int i = this.c.j;
        qt qtVar = this.a;
        Calendar calendar = qtVar.f;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + qtVar.i : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < c() || i > f()) {
            return null;
        }
        int c = (i - c()) + 1;
        Calendar a = x60.a(this.a.f);
        a.set(5, c);
        return Long.valueOf(a.getTimeInMillis());
    }

    public final boolean e(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= this.c.h.f;
        }
        return false;
    }

    public final int f() {
        return (c() + this.a.j) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new y5(context, 4);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int c = i - c();
        if (c >= 0) {
            qt qtVar = this.a;
            if (c < qtVar.j) {
                textView.setTag(qtVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(c + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                x60.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            x60.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
