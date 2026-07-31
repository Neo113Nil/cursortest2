package com.yandex.div.core.view2.reuse.util;

import com.yandex.div.core.view2.reuse.ExistingToken;
import com.yandex.div.core.view2.reuse.NewToken;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.internal.Log;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.Div;
import com.yandex.div2.DivState;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivVideoSource;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RebindLogUtils.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0000\u001a8\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0002¨\u0006\u0012"}, d2 = {"logRebindDiff", "", "reusableList", "Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "bindingPoints", "", "Lcom/yandex/div/core/view2/reuse/ExistingToken;", "aloneExisting", "", "aloneNew", "Lcom/yandex/div/core/view2/reuse/NewToken;", "printSelf", "Lcom/yandex/div2/Div;", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "step", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RebindLogUtilsKt {
    public static final void logRebindDiff(@NotNull ReusableTokenList reusableTokenList, @NotNull Set<ExistingToken> set, @NotNull List<ExistingToken> list, @NotNull List<NewToken> list2) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringsKt.trimIndent("\n        -----------\n        Calculated:\n        \n        bindingPoints [" + set.size() + "]: \n        "));
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            printSelf$default(((ExistingToken) it.next()).getItem().getDiv(), reusableTokenList, set, sb, 0, 8, null);
        }
        sb.append("\nreuse [" + reusableTokenList.count() + "]: ");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        Iterator<T> it2 = reusableTokenList.asList().iterator();
        while (it2.hasNext()) {
            printSelf$default(((ExistingToken) it2.next()).getItem().getDiv(), reusableTokenList, set, sb, 0, 8, null);
        }
        sb.append("\nremoved [" + list.size() + "]: ");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            printSelf$default(((ExistingToken) it3.next()).getItem().getDiv(), reusableTokenList, set, sb, 0, 8, null);
        }
        sb.append("\nnew [" + list2.size() + "]: ");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        Iterator<T> it4 = list2.iterator();
        while (it4.hasNext()) {
            printSelf$default(((NewToken) it4.next()).getItem().getDiv(), reusableTokenList, set, sb, 0, 8, null);
        }
        sb.append("-----------");
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        Log.d(RebindTask.TAG, sb.toString());
    }

    static /* synthetic */ void printSelf$default(Div div, ReusableTokenList reusableTokenList, Set set, StringBuilder sb, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        printSelf(div, reusableTokenList, set, sb, i);
    }

    private static final void printSelf(Div div, ReusableTokenList reusableTokenList, Set<ExistingToken> set, StringBuilder sb, int i) {
        Object obj;
        Object obj2;
        String str;
        Expression expression;
        String str2 = StringsKt.repeat("|  ", i - 1) + "|--" + Reflection.getOrCreateKotlinClass(div.value().getClass());
        if (reusableTokenList.contains(div)) {
            str2 = str2 + " (reusable)";
        }
        Iterator<T> it = set.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (((ExistingToken) obj2).getDivHash() == div.propertiesHash()) {
                    break;
                }
            }
        }
        if (((ExistingToken) obj2) != null) {
            str2 = str2 + " (binding)";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        if (div instanceof Div.Text) {
            str = ": " + StringsKt.replace$default(((Div.Text) div).getValue().text.getRawValue().toString(), "\n", " \\n ", false, 4, (Object) null);
        } else if (div instanceof Div.Image) {
            str = ": " + ((Div.Image) div).getValue().imageUrl.getRawValue();
        } else if (div instanceof Div.GifImage) {
            str = ": " + ((Div.GifImage) div).getValue().gifUrl.getRawValue();
        } else if (div instanceof Div.Video) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(": ");
            DivVideoSource divVideoSource = (DivVideoSource) CollectionsKt.firstOrNull(((Div.Video) div).getValue().videoSources);
            if (divVideoSource != null && (expression = divVideoSource.url) != null) {
                obj = expression.getRawValue();
            }
            sb3.append(obj);
            str = sb3.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        sb.append(sb2.toString());
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
        if (div instanceof Div.Container) {
            List list = ((Div.Container) div).getValue().items;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    printSelf((Div) it2.next(), reusableTokenList, set, sb, i + 1);
                }
                return;
            }
            return;
        }
        if (div instanceof Div.Grid) {
            List list2 = ((Div.Grid) div).getValue().items;
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    printSelf((Div) it3.next(), reusableTokenList, set, sb, i + 1);
                }
                return;
            }
            return;
        }
        if (div instanceof Div.Gallery) {
            List list3 = ((Div.Gallery) div).getValue().items;
            if (list3 != null) {
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    printSelf((Div) it4.next(), reusableTokenList, set, sb, i + 1);
                }
                return;
            }
            return;
        }
        if (div instanceof Div.Pager) {
            List list4 = ((Div.Pager) div).getValue().items;
            if (list4 != null) {
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    printSelf((Div) it5.next(), reusableTokenList, set, sb, i + 1);
                }
                return;
            }
            return;
        }
        if (div instanceof Div.Tabs) {
            Iterator it6 = ((Div.Tabs) div).getValue().items.iterator();
            while (it6.hasNext()) {
                printSelf(((DivTabs.Item) it6.next()).div, reusableTokenList, set, sb, i + 1);
            }
        } else if (div instanceof Div.State) {
            Iterator it7 = ((Div.State) div).getValue().states.iterator();
            while (it7.hasNext()) {
                Div div2 = ((DivState.State) it7.next()).div;
                if (div2 != null) {
                    printSelf(div2, reusableTokenList, set, sb, i + 1);
                }
            }
        }
    }
}
