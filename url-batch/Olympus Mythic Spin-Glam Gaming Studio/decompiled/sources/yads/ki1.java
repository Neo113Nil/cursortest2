package yads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class ki1 extends AbstractMap {
    public transient k b;
    public transient ji1 c;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        k kVar = this.b;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k((m) this);
        this.b = kVar2;
        return kVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        ji1 ji1Var = this.c;
        if (ji1Var != null) {
            return ji1Var;
        }
        ji1 ji1Var2 = new ji1(this);
        this.c = ji1Var2;
        return ji1Var2;
    }
}
