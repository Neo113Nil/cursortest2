package defpackage;

import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class zh implements bu {
    public final /* synthetic */ int d;

    public /* synthetic */ zh(int i) {
        this.d = i;
    }

    @Override // defpackage.bu
    public final Object a() {
        switch (this.d) {
            case 0:
                lt0 lt0Var = ai.a;
                return null;
            case 1:
                th.d("Unexpected call to default provider");
                throw new kf();
            case 2:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new ix(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return hx.a;
                }
            case 3:
                lt0 lt0Var2 = vy.a;
                return null;
            case 4:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 5:
                ji jiVar = o30.a;
                return null;
            case 6:
                ji jiVar2 = p30.a;
                return null;
            case 7:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 8:
                ji jiVar3 = r30.a;
                return null;
            case 9:
                return new wm0(new LinkedHashMap());
            case 10:
                lt0 lt0Var3 = zm0.a;
                return null;
            default:
                return os0.d;
        }
    }
}
