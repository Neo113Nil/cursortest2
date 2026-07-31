package com.yandex.div.internal.core;

import com.yandex.div.core.annotations.InternalApi;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.local.UtilsKt;
import com.yandex.div.core.expression.variables.ConstantsProvider;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivCollectionItemBuilder;
import com.yandex.div2.DivContainer;
import com.yandex.div2.DivCustom;
import com.yandex.div2.DivGallery;
import com.yandex.div2.DivGifImage;
import com.yandex.div2.DivGrid;
import com.yandex.div2.DivImage;
import com.yandex.div2.DivIndicator;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivPager;
import com.yandex.div2.DivSelect;
import com.yandex.div2.DivSeparator;
import com.yandex.div2.DivSlider;
import com.yandex.div2.DivState;
import com.yandex.div2.DivSwitch;
import com.yandex.div2.DivTabs;
import com.yandex.div2.DivText;
import com.yandex.div2.DivVideo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DivCollectionExtensions.kt */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a&\u0010\u0018\u001a\u0004\u0018\u00010\u0011*\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\u001a\u0018\u0010\u001d\u001a\u00020\u0004*\u00020\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0014\u0010\u001f\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a&\u0010\u001f\u001a\u0004\u0018\u00010\u0016*\u00020\u00142\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020\"2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\u00020$2\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\u0014\u0010&\u001a\u00020\u0011*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t\"\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b\"\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\r\"\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000f¨\u0006'"}, d2 = {"INDEX_VARIABLE_NAME", "", "nonNullItems", "", "Lcom/yandex/div2/Div;", "Lcom/yandex/div2/DivContainer;", "getNonNullItems", "(Lcom/yandex/div2/DivContainer;)Ljava/util/List;", "Lcom/yandex/div2/DivCustom;", "(Lcom/yandex/div2/DivCustom;)Ljava/util/List;", "Lcom/yandex/div2/DivGallery;", "(Lcom/yandex/div2/DivGallery;)Ljava/util/List;", "Lcom/yandex/div2/DivGrid;", "(Lcom/yandex/div2/DivGrid;)Ljava/util/List;", "Lcom/yandex/div2/DivPager;", "(Lcom/yandex/div2/DivPager;)Ljava/util/List;", "buildItems", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "items", "itemBuilder", "Lcom/yandex/div2/DivCollectionItemBuilder;", "resolver", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "build", "buildItem", "data", "", DivCollectionExtensionsKt.INDEX_VARIABLE_NAME, "", "copy", "id", "getItemResolver", "dataElement", "itemsToDivItemBuilderResult", "Lcom/yandex/div2/DivTabs;", "statesToDivItemBuilderResult", "Lcom/yandex/div2/DivState;", "toDivItemBuilderResult", "toItemBuilderResult", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DivCollectionExtensionsKt {

    @NotNull
    private static final String INDEX_VARIABLE_NAME = "index";

    @InternalApi
    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull DivContainer divContainer, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(divContainer.items, divContainer.itemBuilder, expressionResolver);
    }

    @InternalApi
    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull DivGallery divGallery, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(divGallery.items, divGallery.itemBuilder, expressionResolver);
    }

    @InternalApi
    @NotNull
    public static final List<DivItemBuilderResult> buildItems(@NotNull DivPager divPager, @NotNull ExpressionResolver expressionResolver) {
        return buildItems(divPager.items, divPager.itemBuilder, expressionResolver);
    }

    private static final List<DivItemBuilderResult> buildItems(List<? extends Div> list, DivCollectionItemBuilder divCollectionItemBuilder, ExpressionResolver expressionResolver) {
        List<DivItemBuilderResult> build;
        if (divCollectionItemBuilder != null && (build = build(divCollectionItemBuilder, expressionResolver)) != null) {
            return build;
        }
        if (list != null) {
            return toDivItemBuilderResult(list, expressionResolver);
        }
        return CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<DivItemBuilderResult> build(@NotNull DivCollectionItemBuilder divCollectionItemBuilder, @NotNull ExpressionResolver expressionResolver) {
        JSONArray jSONArray = (JSONArray) divCollectionItemBuilder.data.evaluate(expressionResolver);
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            DivItemBuilderResult buildItem = buildItem(divCollectionItemBuilder, jSONArray.get(i), i, expressionResolver);
            if (buildItem != null) {
                arrayList.add(buildItem);
            }
        }
        return arrayList;
    }

    private static final DivItemBuilderResult buildItem(DivCollectionItemBuilder divCollectionItemBuilder, Object obj, int i, ExpressionResolver expressionResolver) {
        Object obj2;
        ExpressionResolver itemResolver = getItemResolver(divCollectionItemBuilder, obj, i, expressionResolver);
        if (itemResolver == null) {
            return null;
        }
        Iterator it = divCollectionItemBuilder.prototypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((Boolean) ((DivCollectionItemBuilder.Prototype) obj2).selector.evaluate(itemResolver)).booleanValue()) {
                break;
            }
        }
        DivCollectionItemBuilder.Prototype prototype = (DivCollectionItemBuilder.Prototype) obj2;
        if (prototype == null) {
            return null;
        }
        Div div = prototype.div;
        Expression expression = prototype.id;
        return toItemBuilderResult(copy(div, expression != null ? (String) expression.evaluate(itemResolver) : null), itemResolver);
    }

    @NotNull
    public static final ExpressionResolver getItemResolver(@NotNull DivCollectionItemBuilder divCollectionItemBuilder, @NotNull ExpressionResolver expressionResolver) {
        ExpressionResolver itemResolver;
        JSONArray jSONArray = (JSONArray) divCollectionItemBuilder.data.evaluate(expressionResolver);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj != null && (itemResolver = getItemResolver(divCollectionItemBuilder, obj, i, expressionResolver)) != null) {
                return itemResolver;
            }
        }
        return expressionResolver;
    }

    private static final ExpressionResolver getItemResolver(final DivCollectionItemBuilder divCollectionItemBuilder, Object obj, final int i, ExpressionResolver expressionResolver) {
        final ExpressionResolverImpl asImpl = UtilsKt.getAsImpl(expressionResolver);
        if (asImpl == null) {
            return expressionResolver;
        }
        final JSONObject validateItemBuilderDataElement = asImpl.validateItemBuilderDataElement(obj, i);
        if (validateItemBuilderDataElement == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(':');
        sb.append(i);
        final String sb2 = sb.toString();
        return asImpl.getRuntimeStore().getOrPutItemBuilderResolver(asImpl.getPath() + '/' + sb2, expressionResolver, new Function0() { // from class: com.yandex.div.internal.core.DivCollectionExtensionsKt$getItemResolver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final ExpressionResolver mo4828invoke() {
                return asImpl.withConstants$div_release(sb2, new ConstantsProvider(MapsKt.mapOf(TuplesKt.to(DivCollectionItemBuilder.this.dataElementName, validateItemBuilderDataElement), TuplesKt.to("index", Long.valueOf(i)))));
            }
        });
    }

    static /* synthetic */ Div copy$default(Div div, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = div.value().getId();
        }
        return copy(div, str);
    }

    private static final Div copy(Div div, String str) {
        DivSwitch copy;
        DivCustom copy2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (div instanceof Div.Image) {
            return new Div.Image(DivImage.copy$default(((Div.Image) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 8388607, null));
        }
        if (div instanceof Div.GifImage) {
            return new Div.GifImage(DivGifImage.copy$default(((Div.GifImage) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, 262143, null));
        }
        if (div instanceof Div.Text) {
            return new Div.Text(DivText.copy$default(((Div.Text) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, -1, 31, null));
        }
        if (div instanceof Div.Separator) {
            return new Div.Separator(DivSeparator.copy$default(((Div.Separator) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 2047, null));
        }
        if (div instanceof Div.Container) {
            Div.Container container = (Div.Container) div;
            DivContainer value = container.getValue();
            List list = container.getValue().items;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList5.add(copy$default((Div) it.next(), null, 1, null));
                }
                arrayList4 = arrayList5;
            } else {
                arrayList4 = null;
            }
            return new Div.Container(DivContainer.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, arrayList4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -150994945, 4194303, null));
        }
        if (div instanceof Div.Grid) {
            Div.Grid grid = (Div.Grid) div;
            DivGrid value2 = grid.getValue();
            List list3 = grid.getValue().items;
            if (list3 != null) {
                List list4 = list3;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList6.add(copy$default((Div) it2.next(), null, 1, null));
                }
                arrayList3 = arrayList6;
            } else {
                arrayList3 = null;
            }
            return new Div.Grid(DivGrid.copy$default(value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, arrayList3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -25165825, 16383, null));
        }
        if (div instanceof Div.Gallery) {
            Div.Gallery gallery = (Div.Gallery) div;
            DivGallery value3 = gallery.getValue();
            List list5 = gallery.getValue().items;
            if (list5 != null) {
                List list6 = list5;
                ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(copy$default((Div) it3.next(), null, 1, null));
                }
                arrayList2 = arrayList7;
            } else {
                arrayList2 = null;
            }
            return new Div.Gallery(DivGallery.copy$default(value3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, arrayList2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1179649, 2047, null));
        }
        if (div instanceof Div.Pager) {
            Div.Pager pager = (Div.Pager) div;
            DivPager value4 = pager.getValue();
            List list7 = pager.getValue().items;
            if (list7 != null) {
                List list8 = list7;
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list8, 10));
                Iterator it4 = list8.iterator();
                while (it4.hasNext()) {
                    arrayList8.add(copy$default((Div) it4.next(), null, 1, null));
                }
                arrayList = arrayList8;
            } else {
                arrayList = null;
            }
            return new Div.Pager(DivPager.copy$default(value4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, arrayList, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -557057, 2047, null));
        }
        if (div instanceof Div.Tabs) {
            Div.Tabs tabs = (Div.Tabs) div;
            DivTabs value5 = tabs.getValue();
            List<DivTabs.Item> list9 = tabs.getValue().items;
            ArrayList arrayList9 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list9, 10));
            for (DivTabs.Item item : list9) {
                arrayList9.add(DivTabs.Item.copy$default(item, copy$default(item.div, null, 1, null), null, null, 6, null));
            }
            return new Div.Tabs(DivTabs.copy$default(value5, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, arrayList9, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -98305, 2047, null));
        }
        if (div instanceof Div.State) {
            Div.State state = (Div.State) div;
            DivState value6 = state.getValue();
            List<DivState.State> list10 = state.getValue().states;
            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list10, 10));
            for (DivState.State state2 : list10) {
                Div div2 = state2.div;
                arrayList10.add(DivState.State.copy$default(state2, null, null, div2 != null ? copy$default(div2, null, 1, null) : null, null, null, 27, null));
            }
            return new Div.State(DivState.copy$default(value6, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, arrayList10, null, null, null, null, null, null, null, null, null, null, null, null, null, -8421377, 65531, null));
        }
        if (!(div instanceof Div.Custom)) {
            if (div instanceof Div.Indicator) {
                return new Div.Indicator(DivIndicator.copy$default(((Div.Indicator) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -131073, 4095, null));
            }
            if (div instanceof Div.Slider) {
                return new Div.Slider(DivSlider.copy$default(((Div.Slider) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8193, 32767, null));
            }
            if (div instanceof Div.Input) {
                return new Div.Input(DivInput.copy$default(((Div.Input) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -67108865, 134217727, null));
            }
            if (div instanceof Div.Select) {
                return new Div.Select(DivSelect.copy$default(((Div.Select) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2097153, 8191, null));
            }
            if (div instanceof Div.Video) {
                return new Div.Video(DivVideo.copy$default(((Div.Video) div).getValue(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 32767, null));
            }
            if (!(div instanceof Div.Switch)) {
                throw new NoWhenBranchMatchedException();
            }
            copy = r2.copy((r69 & 1) != 0 ? r2.getAccessibility() : null, (r69 & 2) != 0 ? r2.getAlignmentHorizontal() : null, (r69 & 4) != 0 ? r2.getAlignmentVertical() : null, (r69 & 8) != 0 ? r2.getAlpha() : null, (r69 & 16) != 0 ? r2.getAnimators() : null, (r69 & 32) != 0 ? r2.getBackground() : null, (r69 & 64) != 0 ? r2.getBorder() : null, (r69 & 128) != 0 ? r2.getColumnSpan() : null, (r69 & 256) != 0 ? r2.getDisappearActions() : null, (r69 & 512) != 0 ? r2.getExtensions() : null, (r69 & 1024) != 0 ? r2.getFocus() : null, (r69 & 2048) != 0 ? r2.getFunctions() : null, (r69 & 4096) != 0 ? r2.getHeight() : null, (r69 & 8192) != 0 ? r2.getId() : str, (r69 & 16384) != 0 ? r2.isEnabled : null, (r69 & 32768) != 0 ? r2.isOnVariable : null, (r69 & 65536) != 0 ? r2.getLayoutProvider() : null, (r69 & 131072) != 0 ? r2.getMargins() : null, (r69 & 262144) != 0 ? r2.onColor : null, (r69 & 524288) != 0 ? r2.getPaddings() : null, (r69 & 1048576) != 0 ? r2.getReuseId() : null, (r69 & 2097152) != 0 ? r2.getRowSpan() : null, (r69 & 4194304) != 0 ? r2.getSelectedActions() : null, (r69 & 8388608) != 0 ? r2.getTooltips() : null, (r69 & 16777216) != 0 ? r2.getTransform() : null, (r69 & 33554432) != 0 ? r2.getTransitionChange() : null, (r69 & 67108864) != 0 ? r2.getTransitionIn() : null, (r69 & 134217728) != 0 ? r2.getTransitionOut() : null, (r69 & 268435456) != 0 ? r2.getTransitionTriggers() : null, (r69 & 536870912) != 0 ? r2.getVariableTriggers() : null, (r69 & 1073741824) != 0 ? r2.getVariables() : null, (r69 & Integer.MIN_VALUE) != 0 ? r2.getVisibility() : null, (r70 & 1) != 0 ? r2.getVisibilityAction() : null, (r70 & 2) != 0 ? r2.getVisibilityActions() : null, (r70 & 4) != 0 ? ((Div.Switch) div).getValue().getWidth() : null);
            return new Div.Switch(copy);
        }
        copy2 = r2.copy((r70 & 1) != 0 ? r2.getAccessibility() : null, (r70 & 2) != 0 ? r2.getAlignmentHorizontal() : null, (r70 & 4) != 0 ? r2.getAlignmentVertical() : null, (r70 & 8) != 0 ? r2.getAlpha() : null, (r70 & 16) != 0 ? r2.getAnimators() : null, (r70 & 32) != 0 ? r2.getBackground() : null, (r70 & 64) != 0 ? r2.getBorder() : null, (r70 & 128) != 0 ? r2.getColumnSpan() : null, (r70 & 256) != 0 ? r2.customProps : null, (r70 & 512) != 0 ? r2.customType : null, (r70 & 1024) != 0 ? r2.getDisappearActions() : null, (r70 & 2048) != 0 ? r2.getExtensions() : null, (r70 & 4096) != 0 ? r2.getFocus() : null, (r70 & 8192) != 0 ? r2.getFunctions() : null, (r70 & 16384) != 0 ? r2.getHeight() : null, (r70 & 32768) != 0 ? r2.getId() : str, (r70 & 65536) != 0 ? r2.items : null, (r70 & 131072) != 0 ? r2.getLayoutProvider() : null, (r70 & 262144) != 0 ? r2.getMargins() : null, (r70 & 524288) != 0 ? r2.getPaddings() : null, (r70 & 1048576) != 0 ? r2.getReuseId() : null, (r70 & 2097152) != 0 ? r2.getRowSpan() : null, (r70 & 4194304) != 0 ? r2.getSelectedActions() : null, (r70 & 8388608) != 0 ? r2.getTooltips() : null, (r70 & 16777216) != 0 ? r2.getTransform() : null, (r70 & 33554432) != 0 ? r2.getTransitionChange() : null, (r70 & 67108864) != 0 ? r2.getTransitionIn() : null, (r70 & 134217728) != 0 ? r2.getTransitionOut() : null, (r70 & 268435456) != 0 ? r2.getTransitionTriggers() : null, (r70 & 536870912) != 0 ? r2.getVariableTriggers() : null, (r70 & 1073741824) != 0 ? r2.getVariables() : null, (r70 & Integer.MIN_VALUE) != 0 ? r2.getVisibility() : null, (r71 & 1) != 0 ? r2.getVisibilityAction() : null, (r71 & 2) != 0 ? r2.getVisibilityActions() : null, (r71 & 4) != 0 ? ((Div.Custom) div).getValue().getWidth() : null);
        return new Div.Custom(copy2);
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivContainer divContainer) {
        List<Div> list = divContainer.items;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivCustom divCustom) {
        List<Div> list = divCustom.items;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivGallery divGallery) {
        List<Div> list = divGallery.items;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivGrid divGrid) {
        List<Div> list = divGrid.items;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(@NotNull DivGrid divGrid, @NotNull ExpressionResolver expressionResolver) {
        return toDivItemBuilderResult(getNonNullItems(divGrid), expressionResolver);
    }

    @NotNull
    public static final List<Div> getNonNullItems(@NotNull DivPager divPager) {
        List<Div> list = divPager.items;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    public static final List<DivItemBuilderResult> itemsToDivItemBuilderResult(@NotNull DivTabs divTabs, @NotNull ExpressionResolver expressionResolver) {
        List list = divTabs.items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult(((DivTabs.Item) it.next()).div, expressionResolver));
        }
        return arrayList;
    }

    @NotNull
    public static final List<DivItemBuilderResult> statesToDivItemBuilderResult(@NotNull DivState divState, @NotNull ExpressionResolver expressionResolver) {
        List list = divState.states;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Div div = ((DivState.State) it.next()).div;
            DivItemBuilderResult itemBuilderResult = div != null ? toItemBuilderResult(div, expressionResolver) : null;
            if (itemBuilderResult != null) {
                arrayList.add(itemBuilderResult);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final List<DivItemBuilderResult> toDivItemBuilderResult(@NotNull List<? extends Div> list, @NotNull ExpressionResolver expressionResolver) {
        List<? extends Div> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toItemBuilderResult((Div) it.next(), expressionResolver));
        }
        return arrayList;
    }

    @NotNull
    public static final DivItemBuilderResult toItemBuilderResult(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        return new DivItemBuilderResult(div, expressionResolver);
    }
}
