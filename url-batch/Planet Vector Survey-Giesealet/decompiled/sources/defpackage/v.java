package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements mu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Collection e;

    public /* synthetic */ v(int i, Collection collection) {
        this.d = i;
        this.e = collection;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        boolean contains;
        int i = this.d;
        Collection<?> collection = this.e;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
