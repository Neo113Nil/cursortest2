package com.yandex.div.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransientView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"isInTransientHierarchy", "", "Landroid/view/View;", "Landroid/view/ViewParent;", "isTransient", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TransientViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isTransient(@NotNull View view) {
        return (view instanceof TransientView) && ((TransientView) view).isTransient();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(@NotNull View view) {
        if (!(view instanceof TransientView)) {
            return false;
        }
        if (((TransientView) view).isTransient()) {
            return true;
        }
        return (view.getParent() instanceof ViewGroup) && isInTransientHierarchy(view.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean isInTransientHierarchy(@NotNull ViewParent viewParent) {
        return (viewParent instanceof TransientView) && isInTransientHierarchy((View) viewParent);
    }
}
