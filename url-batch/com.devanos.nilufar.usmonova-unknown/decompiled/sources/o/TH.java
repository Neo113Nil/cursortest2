package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class TH extends Y {
    public final /* synthetic */ int h;
    public final NH i;

    public /* synthetic */ TH(NH nh, int i) {
        this.h = i;
        this.i = nh;
    }

    @Override // o.r, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        switch (this.h) {
            case 0:
                if (!(obj instanceof Map.Entry) || (entry = (Map.Entry) obj) == null) {
                    return false;
                }
                Object key = entry.getKey();
                NH nh = this.i;
                Object obj2 = nh.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && nh.containsKey(entry.getKey());
            default:
                return this.i.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.h) {
            case 0:
                BW bw = this.i.h;
                CW[] cwArr = new CW[8];
                for (int i = 0; i < 8; i++) {
                    cwArr[i] = new DW(0);
                }
                return new UH(bw, cwArr);
            default:
                BW bw2 = this.i.h;
                CW[] cwArr2 = new CW[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    cwArr2[i2] = new DW(1);
                }
                return new UH(bw2, cwArr2);
        }
    }

    @Override // o.r
    public final int j() {
        switch (this.h) {
            case 0:
                NH nh = this.i;
                nh.getClass();
                return nh.i;
            default:
                NH nh2 = this.i;
                nh2.getClass();
                return nh2.i;
        }
    }
}
