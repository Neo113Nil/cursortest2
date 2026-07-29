package o;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.Do, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0095Do implements JP {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0095Do(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.JP
    public final Bundle a() {
        switch (this.a) {
            case 0:
                J4 j4 = (J4) this.b;
                j4.markFragmentsCreated();
                j4.mFragmentLifecycleRegistry.e(EnumC0054Bz.ON_STOP);
                return new Bundle();
            case 1:
                return AbstractActivityC0446Rc.c((AbstractActivityC0446Rc) this.b);
            case 2:
                C0208Hx c0208Hx = (C0208Hx) this.b;
                LinkedHashMap X = EB.X((LinkedHashMap) c0208Hx.i);
                for (Map.Entry entry : ((LinkedHashMap) c0208Hx.j).entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (list.size() == 1) {
                        Object invoke = ((InterfaceC1455lp) list.get(0)).invoke();
                        if (invoke == null) {
                            continue;
                        } else {
                            if (!AbstractC0048Bt.i(invoke)) {
                                throw new IllegalStateException((invoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().").toString());
                            }
                            X.put(str, AbstractC0868ct.f(invoke));
                        }
                    } else {
                        int size = list.size();
                        ArrayList arrayList = new ArrayList(size);
                        for (int i = 0; i < size; i++) {
                            Object invoke2 = ((InterfaceC1455lp) list.get(i)).invoke();
                            if (invoke2 != null && !AbstractC0048Bt.i(invoke2)) {
                                throw new IllegalStateException((invoke2 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().").toString());
                            }
                            arrayList.add(invoke2);
                        }
                        X.put(str, arrayList);
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry2 : X.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    bundle.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
                }
                return bundle;
            case 3:
                return ((AbstractC0588Wo) this.b).V();
            default:
                return DP.a((DP) this.b);
        }
    }
}
