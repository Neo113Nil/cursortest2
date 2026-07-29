package o;

/* loaded from: classes.dex */
public final class IH extends NH implements JH {
    public static final IH k = new IH(BW.e, 0);

    @Override // o.NH, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1425lL) {
            return super.containsKey((AbstractC1425lL) obj);
        }
        return false;
    }

    @Override // o.C, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof NY) {
            return super.containsValue((NY) obj);
        }
        return false;
    }

    @Override // o.NH, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC1425lL) {
            return (NY) super.get((AbstractC1425lL) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1425lL) ? obj2 : (NY) super.getOrDefault((AbstractC1425lL) obj, (NY) obj2);
    }
}
