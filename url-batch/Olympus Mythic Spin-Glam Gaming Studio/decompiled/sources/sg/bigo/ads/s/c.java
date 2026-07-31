package sg.bigo.ads.s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class c extends View {
    final Map<String, Integer> a;
    final Map<String, Integer> b;
    final List<String> c;
    String d;
    private int e;
    private Paint f;
    private Paint g;
    private final int h;
    private final int i;

    public c(Context context) {
        this(context, (byte) 0);
    }

    private c(Context context, byte b) {
        this(context, (char) 0);
    }

    private c(Context context, char c) {
        super(context, null, 0);
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = 1;
        this.h = sg.bigo.ads.common.utils.f.a(context, 2);
        this.i = sg.bigo.ads.common.utils.f.a(context, 8);
        this.f = new Paint(1);
        this.g = new Paint(1);
        a();
    }

    private void a() {
        Paint paint;
        int i;
        if (this.e == 1) {
            this.f.setColor(-1);
            paint = this.g;
            i = 872415231;
        } else {
            this.f.setColor(-16777216);
            paint = this.g;
            i = 855638016;
        }
        paint.setColor(i);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.a.isEmpty()) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i = this.h;
        int i2 = (height - i) / 2;
        int i3 = i + i2;
        int size = this.a.size();
        if (size == 0) {
            return;
        }
        int i4 = (width - ((size - 1) * this.i)) / size;
        int i5 = 0;
        for (String str : this.c) {
            Integer num = this.a.get(str);
            Integer num2 = this.b.get(str);
            if (num != null && num2 != null && num.intValue() > 0) {
                int i6 = (this.i + i4) * i5;
                int i7 = 0;
                while (i7 < num.intValue()) {
                    canvas.drawRect((i7 * (i4 / num.intValue())) + i6, i2, i7 == num.intValue() + (-1) ? i6 + i4 : r11 + r12, i3, i7 < num2.intValue() ? this.f : this.g);
                    i7++;
                }
                i5++;
            }
        }
    }

    public final void setStyleType$2563266(int i) {
        this.e = i;
        a();
        invalidate();
    }

    public final void setTotalNum(Map<String, Integer> map) {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d = null;
        if (map != null) {
            this.a.putAll(map);
            this.c.addAll(map.keySet());
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                this.b.put(it.next(), 0);
            }
        }
    }
}
