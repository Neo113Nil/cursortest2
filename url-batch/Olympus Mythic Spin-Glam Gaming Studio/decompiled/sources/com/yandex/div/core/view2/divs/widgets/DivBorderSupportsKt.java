package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: DivBorderSupports.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\tH\u0080\b¨\u0006\n"}, d2 = {"drawBorderClipped", "", "Lcom/yandex/div/core/view2/divs/widgets/DivBorderSupports;", "canvas", "Landroid/graphics/Canvas;", "translationX", "", "translationY", "callback", "Lkotlin/Function1;", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DivBorderSupportsKt {
    public static final void drawBorderClipped(@NotNull DivBorderSupports divBorderSupports, @NotNull Canvas canvas, int i, int i2, @NotNull Function1 function1) {
        int save;
        DivBorderDrawer divBorderDrawer = divBorderSupports.getDivBorderDrawer();
        if (divBorderDrawer == null) {
            function1.invoke(canvas);
            return;
        }
        if (i != 0 || i2 != 0) {
            float f = i;
            float f2 = i2;
            save = canvas.save();
            try {
                canvas.translate(f, f2);
                divBorderDrawer.clipCorners(canvas);
                canvas.translate(-f, -f2);
                function1.invoke(canvas);
                canvas.translate(f, f2);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
            }
        }
        save = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            function1.invoke(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
        }
    }

    public static /* synthetic */ void drawBorderClipped$default(DivBorderSupports divBorderSupports, Canvas canvas, int i, int i2, Function1 function1, int i3, Object obj) {
        int save;
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        DivBorderDrawer divBorderDrawer = divBorderSupports.getDivBorderDrawer();
        if (divBorderDrawer == null) {
            function1.invoke(canvas);
            return;
        }
        if (i != 0 || i2 != 0) {
            float f = i;
            float f2 = i2;
            save = canvas.save();
            try {
                canvas.translate(f, f2);
                divBorderDrawer.clipCorners(canvas);
                canvas.translate(-f, -f2);
                function1.invoke(canvas);
                canvas.translate(f, f2);
                divBorderDrawer.drawBorder(canvas);
                return;
            } finally {
            }
        }
        save = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            function1.invoke(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
        }
    }
}
