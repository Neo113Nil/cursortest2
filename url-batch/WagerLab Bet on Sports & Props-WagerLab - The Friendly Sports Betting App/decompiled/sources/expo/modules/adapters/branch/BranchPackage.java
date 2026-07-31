package expo.modules.adapters.branch;

import android.content.Context;
import expo.modules.core.interfaces.ApplicationLifecycleListener;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BranchPackage.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"Lexpo/modules/adapters/branch/BranchPackage;", "Lexpo/modules/core/interfaces/Package;", "<init>", "()V", "createApplicationLifecycleListeners", "", "Lexpo/modules/core/interfaces/ApplicationLifecycleListener;", "context", "Landroid/content/Context;", "createReactActivityLifecycleListeners", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "activityContext", "config-plugins-react-native-branch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BranchPackage implements Package {
    @Override // expo.modules.core.interfaces.Package
    public List<ApplicationLifecycleListener> createApplicationLifecycleListeners(Context context) {
        return CollectionsKt.listOf(new BranchApplicationLifecycleListener(context));
    }

    @Override // expo.modules.core.interfaces.Package
    public List<ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        return CollectionsKt.listOf(new BranchReactActivityLifecycleListener(activityContext));
    }
}
