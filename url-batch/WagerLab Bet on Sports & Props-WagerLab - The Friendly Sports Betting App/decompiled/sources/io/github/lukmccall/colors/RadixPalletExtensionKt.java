package io.github.lukmccall.colors;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadixPalletExtension.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bD\"+\u0010\u0000\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"+\u0010\u0006\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"+\u0010\b\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005\"+\u0010\n\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005\"+\u0010\f\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005\"+\u0010\u000e\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005\"+\u0010\u0010\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005\"+\u0010\u0012\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005\"+\u0010\u0014\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0005\"+\u0010\u0016\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005\"+\u0010\u0018\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005\"+\u0010\u001a\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0005\"+\u0010\u001c\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0005\"+\u0010\u001e\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0005\"+\u0010 \u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b!\u0010\u0005\"+\u0010\"\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010\u0005\"+\u0010$\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010\u0005\"+\u0010&\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b'\u0010\u0005\"+\u0010(\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010\u0005\"+\u0010*\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\u0005\"+\u0010,\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010\u0005\"+\u0010.\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010\u0005\"+\u00100\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010\u0005\"+\u00102\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b3\u0010\u0005\"+\u00104\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b5\u0010\u0005\"+\u00106\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b7\u0010\u0005\"+\u00108\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b9\u0010\u0005\"+\u0010:\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b;\u0010\u0005\"+\u0010<\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010\u0005\"+\u0010>\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\b?\u0010\u0005\"+\u0010@\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010\u0005\"+\u0010B\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\"+\u0010D\u001a\f0\u0001R\b\u0012\u0004\u0012\u0002H\u00030\u0002\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00028F¢\u0006\u0006\u001a\u0004\bE\u0010\u0005¨\u0006F"}, d2 = {"amber", "Lio/github/lukmccall/colors/RadixPallet$SelectedColor;", "Lio/github/lukmccall/colors/RadixPallet;", "T", "getAmber", "(Lio/github/lukmccall/colors/RadixPallet;)Lio/github/lukmccall/colors/RadixPallet$SelectedColor;", "black", "getBlack", "blue", "getBlue", "bronze", "getBronze", "brown", "getBrown", "crimson", "getCrimson", "cyan", "getCyan", "gold", "getGold", "grass", "getGrass", "gray", "getGray", "green", "getGreen", "indigo", "getIndigo", "iris", "getIris", "jade", "getJade", "lime", "getLime", "mauve", "getMauve", "mint", "getMint", "olive", "getOlive", "orange", "getOrange", "pink", "getPink", "plum", "getPlum", "purple", "getPurple", "red", "getRed", TtmlNode.ATTR_TTS_RUBY, "getRuby", "sage", "getSage", "sand", "getSand", "sky", "getSky", "slate", "getSlate", "teal", "getTeal", "tomato", "getTomato", "violet", "getViolet", "white", "getWhite", "yellow", "getYellow", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RadixPalletExtensionKt {
    public static final <T> RadixPallet<T>.SelectedColor getAmber(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.AMBER);
    }

    public static final <T> RadixPallet<T>.SelectedColor getBlack(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.BLACK);
    }

    public static final <T> RadixPallet<T>.SelectedColor getBlue(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.BLUE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getBronze(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.BRONZE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getBrown(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.BROWN);
    }

    public static final <T> RadixPallet<T>.SelectedColor getCrimson(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.CRIMSON);
    }

    public static final <T> RadixPallet<T>.SelectedColor getCyan(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.CYAN);
    }

    public static final <T> RadixPallet<T>.SelectedColor getGold(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.GOLD);
    }

    public static final <T> RadixPallet<T>.SelectedColor getGrass(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.GRASS);
    }

    public static final <T> RadixPallet<T>.SelectedColor getGray(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.GRAY);
    }

    public static final <T> RadixPallet<T>.SelectedColor getGreen(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.GREEN);
    }

    public static final <T> RadixPallet<T>.SelectedColor getIndigo(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.INDIGO);
    }

    public static final <T> RadixPallet<T>.SelectedColor getIris(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.IRIS);
    }

    public static final <T> RadixPallet<T>.SelectedColor getJade(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.JADE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getLime(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.LIME);
    }

    public static final <T> RadixPallet<T>.SelectedColor getMauve(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.MAUVE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getMint(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.MINT);
    }

    public static final <T> RadixPallet<T>.SelectedColor getOlive(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.OLIVE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getOrange(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.ORANGE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getPink(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.PINK);
    }

    public static final <T> RadixPallet<T>.SelectedColor getPlum(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.PLUM);
    }

    public static final <T> RadixPallet<T>.SelectedColor getPurple(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.PURPLE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getRed(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.RED);
    }

    public static final <T> RadixPallet<T>.SelectedColor getRuby(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.RUBY);
    }

    public static final <T> RadixPallet<T>.SelectedColor getSage(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.SAGE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getSand(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.SAND);
    }

    public static final <T> RadixPallet<T>.SelectedColor getSky(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.SKY);
    }

    public static final <T> RadixPallet<T>.SelectedColor getSlate(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.SLATE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getTeal(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.TEAL);
    }

    public static final <T> RadixPallet<T>.SelectedColor getTomato(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.TOMATO);
    }

    public static final <T> RadixPallet<T>.SelectedColor getViolet(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.VIOLET);
    }

    public static final <T> RadixPallet<T>.SelectedColor getWhite(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.WHITE);
    }

    public static final <T> RadixPallet<T>.SelectedColor getYellow(RadixPallet<T> radixPallet) {
        Intrinsics.checkNotNullParameter(radixPallet, "<this>");
        return radixPallet.get(RadixColor.YELLOW);
    }
}
