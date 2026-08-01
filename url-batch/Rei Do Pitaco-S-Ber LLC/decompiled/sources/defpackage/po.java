package defpackage;

import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class po {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;

    public po(xn xnVar, String str, nm nmVar, g8 g8Var, Map map) {
        xnVar.getClass();
        str.getClass();
        this.b = xnVar;
        this.c = str;
        this.d = nmVar;
        this.e = map;
    }

    public oe a() {
        oe oeVar = new oe();
        oeVar.i = new LinkedHashMap();
        oeVar.f = (xn) this.b;
        oeVar.g = (String) this.c;
        Map map = (Map) this.e;
        oeVar.i = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        oeVar.h = ((nm) this.d).c();
        return oeVar;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.e;
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.c);
                sb.append(", url=");
                sb.append((xn) this.b);
                nm nmVar = (nm) this.d;
                if (nmVar.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = nmVar.iterator();
                    int i = 0;
                    while (true) {
                        i iVar = (i) it;
                        if (iVar.hasNext()) {
                            Object next = iVar.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                va.X();
                                throw null;
                            }
                            bw bwVar = (bw) next;
                            String str = (String) bwVar.f;
                            String str2 = (String) bwVar.g;
                            if (i > 0) {
                                sb.append(", ");
                            }
                            sb.append(str);
                            sb.append(':');
                            sb.append(str2);
                            i = i2;
                        } else {
                            sb.append(']');
                        }
                    }
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public po(CardView cardView, CardView cardView2, TextView textView, TextView textView2, TextView textView3) {
        this.b = cardView;
        this.c = cardView2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
    }
}
