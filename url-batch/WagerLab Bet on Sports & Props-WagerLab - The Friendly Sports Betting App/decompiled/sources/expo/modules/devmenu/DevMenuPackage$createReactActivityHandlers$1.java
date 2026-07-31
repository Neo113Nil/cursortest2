package expo.modules.devmenu;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.devmenu.compose.BindingView;
import expo.modules.devmenu.compose.DevMenuViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: DevMenuPackage.kt */
@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"expo/modules/devmenu/DevMenuPackage$createReactActivityHandlers$1", "Lexpo/modules/core/interfaces/ReactActivityHandler;", "createReactRootViewContainer", "Landroid/view/ViewGroup;", "activity", "Landroid/app/Activity;", "onKeyUp", "", "keyCode", "", NotificationCompat.CATEGORY_EVENT, "Landroid/view/KeyEvent;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuPackage$createReactActivityHandlers$1 implements ReactActivityHandler {
    DevMenuPackage$createReactActivityHandlers$1() {
    }

    @Override // expo.modules.core.interfaces.ReactActivityHandler
    public ViewGroup createReactRootViewContainer(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity activity2 = activity;
        FrameLayout frameLayout = new FrameLayout(activity2);
        final AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
        final Function0 function0 = null;
        frameLayout.addView(new BindingView(activity2, new ViewModelLazy(Reflection.getOrCreateKotlinClass(DevMenuViewModel.class), new Function0<ViewModelStore>() { // from class: expo.modules.devmenu.DevMenuPackage$createReactActivityHandlers$1$createReactRootViewContainer$lambda$0$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: expo.modules.devmenu.DevMenuPackage$createReactActivityHandlers$1$createReactRootViewContainer$lambda$0$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: expo.modules.devmenu.DevMenuPackage$createReactActivityHandlers$1$createReactRootViewContainer$lambda$0$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? appCompatActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        })));
        return frameLayout;
    }

    @Override // expo.modules.core.interfaces.ReactActivityHandler
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return DevMenuManager.INSTANCE.onKeyEvent(keyCode, event);
    }
}
