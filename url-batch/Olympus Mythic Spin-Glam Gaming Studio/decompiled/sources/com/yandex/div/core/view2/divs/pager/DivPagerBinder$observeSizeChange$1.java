package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivPagerLayoutMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivPagerBinder.kt */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002JP\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"com/yandex/div/core/view2/divs/pager/DivPagerBinder$observeSizeChange$1", "Lcom/yandex/div/core/Disposable;", "Landroid/view/View$OnLayoutChangeListener;", "oldSize", "", "close", "", "getSize", "onLayoutChange", "v", "Landroid/view/View;", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DivPagerBinder$observeSizeChange$1 implements Disposable, View.OnLayoutChangeListener {
    final /* synthetic */ DivPager $div;
    final /* synthetic */ Function1 $observer;
    final /* synthetic */ ViewPager2 $this_observeSizeChange;
    private int oldSize;

    DivPagerBinder$observeSizeChange$1(final ViewPager2 viewPager2, final Function1 function1, DivPager divPager) {
        this.$this_observeSizeChange = viewPager2;
        this.$observer = function1;
        this.$div = divPager;
        viewPager2.addOnLayoutChangeListener(this);
        OneShotPreDrawListener.add(viewPager2, new Runnable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$observeSizeChange$1$special$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                int size;
                size = this.getSize();
                function1.invoke(Integer.valueOf(size));
                this.oldSize = size;
            }
        });
    }

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        this.$this_observeSizeChange.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(@NotNull View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        int size = getSize();
        if (this.oldSize == size) {
            if (this.$div.layoutMode instanceof DivPagerLayoutMode.PageContentSize) {
                this.$this_observeSizeChange.requestTransform();
            }
        } else {
            this.oldSize = size;
            this.$observer.invoke(Integer.valueOf(size));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSize() {
        return this.$this_observeSizeChange.getOrientation() == 0 ? this.$this_observeSizeChange.getWidth() : this.$this_observeSizeChange.getHeight();
    }
}
