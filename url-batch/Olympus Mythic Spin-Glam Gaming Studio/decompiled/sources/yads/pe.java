package yads;

import android.content.Context;
import com.facebook.login.widget.ToolTipPopup;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes3.dex */
public abstract class pe {
    public static void a(Context context, mt1 mt1Var) {
        Job launch$default;
        ne neVar;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()).plus(new b20(mt1Var)));
        be beVar = new be(io2);
        he heVar = new he(mt1Var);
        q63 q63Var = new q63();
        bu2 a = uw2.a().a(context);
        if (a == null || !a.i0) {
            return;
        }
        Long l = a.j0;
        long longValue = l != null ? l.longValue() : 1000L;
        Long l2 = a.k0;
        long longValue2 = l2 != null ? l2.longValue() : ToolTipPopup.DEFAULT_POPUP_DISPLAY_TIME;
        Set set = a.r0;
        if (set == null) {
            set = SetsKt.emptySet();
        }
        Set set2 = set;
        ne neVar2 = ne.j;
        if (neVar2 == null) {
            synchronized (ne.i) {
                neVar = ne.j;
                if (neVar == null) {
                    neVar = new ne(longValue, longValue2, set2, CoroutineScope, beVar, heVar, q63Var);
                    ne.j = neVar;
                }
            }
            neVar2 = neVar;
        }
        if (neVar2.h.getAndSet(true)) {
            return;
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(neVar2.d, neVar2.g, null, new le(neVar2, null), 2, null);
        launch$default.invokeOnCompletion(new me(neVar2));
    }
}
